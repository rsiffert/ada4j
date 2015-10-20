package org.ada4j.internal.model;

import java.util.ArrayList;
import java.util.List;

import org.ada4j.api.model.ICompilationUnit;
import org.ada4j.api.model.IDeclaration;

public class CompilationUnit implements ICompilationUnit {

	private List<IDeclaration> declarations;
	private String name;

	public CompilationUnit() {
		this.declarations = new ArrayList<IDeclaration>();
	}

	@Override
	public List<IDeclaration> getDeclarations() {
		return this.declarations;
	}

	@Override
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addDeclaration(IDeclaration declaration) {
		this.declarations.add(declaration);
	}
}
