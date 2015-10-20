package org.ada4j.internal.grammar;

import java.util.ArrayDeque;
import java.util.Deque;

import org.ada4j.internal.model.CompilationUnit;
import org.ada4j.internal.model.Package;
import org.antlr.v4.runtime.misc.NotNull;

public class Ada2005FileListener extends Ada2005BaseListener {

	private CompilationUnit compilationUnit;
	private Deque<Package> packages;

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
}
