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

		this.compilationUnit.addDeclaration(declaredPkg);
		if (this.packages.size() > 0) {
			declaredPkg.setParent(this.packages.getFirst());
		}
		this.packages.push(declaredPkg);
	}

	@Override
	public void exitPackage_declaration(
			@NotNull Ada2005Parser.Package_declarationContext ctx) {
		this.packages.pop();
	}

	@Override
	public void enterProcedure_specification(
			@NotNull Ada2005Parser.Procedure_specificationContext ctx) {
		Subprogram procedure = new Subprogram(
				ctx.defining_program_unit_name().getText(),
				ISubprogram.PROCEDURE,
				ctx.getParent().getParent() != null
						&& ctx.getParent()
								.getParent()
								.getClass()
								.equals(Ada2005Parser.Abstract_subprogram_declarationContext.class));
		if (this.isInPrivatePart) {
			this.packages.peek().addPrivateDeclaration(procedure);
		} else {
			this.packages.peek().addPublicDeclaration(procedure);
		}
	}

	@Override
	public void enterFunction_specification(
			@NotNull Ada2005Parser.Function_specificationContext ctx) {
		Subprogram function = new Subprogram(
				ctx.defining_designator().getText(),
				ISubprogram.FUNCTION,
				ctx.getParent().getParent() != null
						&& ctx.getParent()
								.getParent()
								.getClass()
								.equals(Ada2005Parser.Abstract_subprogram_declarationContext.class));

		if (this.isInPrivatePart) {
			this.packages.peek().addPrivateDeclaration(function);
		}

		else {
			this.packages.peek().addPublicDeclaration(function);
		}
	}

	@Override
	public void enterPrivate_part(@NotNull Ada2005Parser.Private_partContext ctx) {
		this.isInPrivatePart = true;
	}

	@Override
	public void exitPrivate_part(@NotNull Ada2005Parser.Private_partContext ctx) {
		this.isInPrivatePart = false;
	}

}
