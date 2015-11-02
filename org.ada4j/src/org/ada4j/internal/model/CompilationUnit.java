package org.ada4j.internal.model;

import java.util.ArrayList;
import java.util.List;

import org.ada4j.api.model.ICompilationUnit;
import org.ada4j.api.model.IDeclaration;

public class CompilationUnit implements ICompilationUnit {

	private List<IDeclaration> declarations;
	private String name;

	public CompilationUnit(String name) {
		this.declarations = new ArrayList<IDeclaration>();
		this.name = name;
	}

	@Override
	public List<IDeclaration> getDeclarations() {
		return this.declarations;
	}

	@Override
	public String getName() {
		return this.name;
	}

	public void addDeclaration(IDeclaration declaration) {
		this.declarations.add(declaration);
	}
}
