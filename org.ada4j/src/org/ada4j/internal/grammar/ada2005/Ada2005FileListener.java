package org.ada4j.internal.grammar.ada2005;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import org.ada4j.api.model.ISubprogram;
import org.ada4j.api.model.IType;
import org.ada4j.internal.model.CompilationUnit;
import org.ada4j.internal.model.Package;
import org.ada4j.internal.model.Subprogram;
import org.ada4j.internal.model.Type;
import org.antlr.v4.runtime.misc.NotNull;

import com.google.common.base.Preconditions;

/**
 * This class uses ANTLR parse tree listener mechanism to build a simple Ada
 * model of a given compilation unit.
 * 
 * @author RS
 *
 */
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
					false, this.isInPrivatePart, null, new ArrayList<IType>());
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

	/**
	 * Returns the types of the arguments corresponding to given formal_part
	 * rule context.
	 * 
	 * @param formalPart
	 *            a non-null formal_part rule context.
	 * @return a list of IType corresponding to the formal_part arguments in the
	 *         declaration order.
	 */
	private static List<IType> GetArgumentTypesOf(
			Ada2005Parser.Formal_partContext formalPart) {
		Preconditions.checkNotNull(formalPart);
		List<Ada2005Parser.Parameter_specificationContext> arguments = formalPart
				.parameter_specification();
		List<IType> argumentTypes = new ArrayList<IType>(arguments.size());

		for (int argIdx = 0; argIdx < arguments.size(); argIdx++) {
			String typeName;
			Ada2005Parser.Parameter_type_specificationContext typeDefinition = arguments
					.get(argIdx).parameter_type_specification();

			if (typeDefinition.subtype_mark() != null) {
				typeName = typeDefinition.subtype_mark().getText();
			} else {
				typeName = AccessDefinitionToString(
						typeDefinition.access_definition());
			}

			argumentTypes.add(new Type(typeName, false));
		}

		return argumentTypes;
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
				this.isInPrivatePart, null,
				ctx.parameter_profile().formal_part() == null
						? new ArrayList<IType>()
						: GetArgumentTypesOf(
								ctx.parameter_profile().formal_part()));

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

	/**
	 * Returns a textual representation of given access_definition rule context.
	 */
	private static String AccessDefinitionToString(
			Ada2005Parser.Access_definitionContext accessDef) {
		StringBuilder accessDefStringBuilder = new StringBuilder();

		if (accessDef.null_exclusion() != null) {
			accessDefStringBuilder.append("not null ");
		}
		accessDefStringBuilder.append("access ");

		if (accessDef.CONSTANT() != null) {
			accessDefStringBuilder.append("constant ");
		}

		if (accessDef.PROTECTED() != null) {
			accessDefStringBuilder.append("protected ");
		}

		if (accessDef.subtype_mark() != null) {
			accessDefStringBuilder
					.append(accessDef.subtype_mark().name().getText());
		} else if (accessDef.PROCEDURE() != null) {
			accessDefStringBuilder.append("procedure");
		} else if (accessDef.FUNCTION() != null) {
			accessDefStringBuilder.append("function ");
			accessDefStringBuilder.append(GetReturnTypeNameOfFunction(
					accessDef.parameter_and_result_profile()));
		}

		return accessDefStringBuilder.toString();
	}

	/**
	 * Returns a textual representation of given parameter_and_result_profile
	 * return type.
	 */
	private static String GetReturnTypeNameOfFunction(
			Ada2005Parser.Parameter_and_result_profileContext ctx) {
		String result;

		if (ctx.subtype_mark() != null) {
			result = ctx.subtype_mark().name().getText();
		} else {
			Ada2005Parser.Access_definitionContext accessDef = ctx
					.access_definition();

			result = AccessDefinitionToString(accessDef);
		}

		return result;
	}

	private static IType GetReturnTypeOfFunction(
			Ada2005Parser.Function_specificationContext ctx) {
		return new Type(
				GetReturnTypeNameOfFunction(ctx.parameter_and_result_profile()),
				false);
	}

	@Override
	public void enterFunction_specification(
			@NotNull Ada2005Parser.Function_specificationContext ctx) {

		Subprogram function = new Subprogram(
				ctx.defining_designator().getText(), ISubprogram.FUNCTION,
				ctx.getParent().getParent() != null
						&& ctx.getParent().getParent().getClass()
								.equals(Ada2005Parser.Abstract_subprogram_declarationContext.class),
				this.isInPrivatePart, GetReturnTypeOfFunction(ctx),
				ctx.parameter_and_result_profile().formal_part() == null
						? new ArrayList<IType>()
						: GetArgumentTypesOf(ctx.parameter_and_result_profile()
								.formal_part()));

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
