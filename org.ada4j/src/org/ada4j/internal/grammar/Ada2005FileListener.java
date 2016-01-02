package org.ada4j.internal.grammar;

import java.util.ArrayDeque;
import java.util.Deque;

import org.ada4j.api.model.ISubprogram;
import org.ada4j.internal.model.CompilationUnit;
import org.ada4j.internal.model.Package;
import org.ada4j.internal.model.Subprogram;
import org.antlr.v4.runtime.misc.NotNull;

public class Ada2005FileListener extends Ada2005BaseListener {

	private CompilationUnit compilationUnit;
	private Deque<Package> packages;
	private boolean isInPrivatePart;

	public Ada2005FileListener(CompilationUnit compilationUnit) {
		this.packages = new ArrayDeque<>();
		this.compilationUnit = compilationUnit;
	}

	@Override
	public void enterPackage_declaration(
			@NotNull Ada2005Parser.Package_declarationContext ctx) {
		Package declaredPkg = new Package(ctx.package_specification()
				.defining_program_unit_name().getText());

		this.addPackageToCurrentScope(declaredPkg, true);
	}

	@Override
	public void enterGeneric_package_declaration(
			Ada2005Parser.Generic_package_declarationContext ctx) {
		Package declaredPkg = new Package(ctx.package_specification()
				.defining_program_unit_name().getText());
		this.addPackageToCurrentScope(declaredPkg, true);
	};

	@Override
	public void enterGeneric_instantiation(
			Ada2005Parser.Generic_instantiationContext ctx) {
		if (ctx.PACKAGE() != null) {
			// generic package instantiation
			Package declaredPkg = new Package(
					ctx.defining_program_unit_name().getText());
			this.addPackageToCurrentScope(declaredPkg, false);
		} else if (ctx.PROCEDURE() != null || ctx.FUNCTION() != null) {
			// subprogram instantiation
			Subprogram subprogram = new Subprogram(
					ctx.defining_program_unit_name().getText(),
					ctx.PROCEDURE() != null ? ISubprogram.PROCEDURE
							: ISubprogram.FUNCTION,
					false, this.isInPrivatePart);
			this.addSubProgramToCurrentScope(subprogram);
		}
	};

	@Override
	public void enterPackage_renaming_declaration(
			Ada2005Parser.Package_renaming_declarationContext ctx) {
		Package declaredPkg = new Package(
				ctx.defining_program_unit_name().getText());
		this.addPackageToCurrentScope(declaredPkg, false);
	};

	@Override
	public void enterPackage_body(Ada2005Parser.Package_bodyContext ctx) {
		Package declaredPkg = new Package(
				ctx.defining_program_unit_name().getText());

		this.addPackageToCurrentScope(declaredPkg, true);
	}

	@Override
	public void exitPackage_declaration(
			@NotNull Ada2005Parser.Package_declarationContext ctx) {
		this.packages.pop();
	}

	@Override
	public void exitPackage_body(Ada2005Parser.Package_bodyContext ctx) {
		this.packages.pop();
	}

	@Override
	public void enterProcedure_specification(
			@NotNull Ada2005Parser.Procedure_specificationContext ctx) {
		Subprogram procedure = new Subprogram(
				ctx.defining_program_unit_name().getText(),
				ISubprogram.PROCEDURE,
				ctx.getParent().getParent() != null
						&& ctx.getParent().getParent().getClass()
								.equals(Ada2005Parser.Abstract_subprogram_declarationContext.class),
				this.isInPrivatePart);

		this.addSubProgramToCurrentScope(procedure);
	}

	private void addSubProgramToCurrentScope(ISubprogram subprogram) {
		if (this.packages.peek() != null) {
			this.packages.peek().addSubprogram(subprogram);
		} else {
			this.compilationUnit.setMainSubprogram(subprogram);
		}
	}

	private void addPackageToCurrentScope(Package newPackage,
			boolean packageDefinesANewScope) {
		if (this.packages.peek() != null) {
			this.packages.peek().addPackage(newPackage);
			newPackage.setParent(this.packages.getFirst());
		} else {
			this.compilationUnit.setRootPackage(newPackage);
		}
		if (packageDefinesANewScope) {
			this.packages.push(newPackage);
		}
	}

	@Override
	public void enterFunction_specification(
			@NotNull Ada2005Parser.Function_specificationContext ctx) {
		Subprogram function = new Subprogram(
				ctx.defining_designator().getText(), ISubprogram.FUNCTION,
				ctx.getParent().getParent() != null
						&& ctx.getParent().getParent().getClass()
								.equals(Ada2005Parser.Abstract_subprogram_declarationContext.class),
				this.isInPrivatePart);

		this.addSubProgramToCurrentScope(function);

	}

	@Override
	public void enterPrivate_part(
			@NotNull Ada2005Parser.Private_partContext ctx) {
		this.isInPrivatePart = true;
	}

	@Override
	public void exitPrivate_part(
			@NotNull Ada2005Parser.Private_partContext ctx) {
		this.isInPrivatePart = false;
	}
}
