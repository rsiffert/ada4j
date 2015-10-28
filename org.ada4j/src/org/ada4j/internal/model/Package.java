package org.ada4j.internal.model;

import java.util.ArrayList;
import java.util.List;

import org.ada4j.api.model.IDeclaration;
import org.ada4j.api.model.IPackage;

public class Package implements IPackage {

	private String name;
	private IPackage parent;
	private List<IDeclaration> publicDeclarations;
	private List<IDeclaration> privateDeclarations;

	public Package(String name) {
		this.name = name;
		this.publicDeclarations = new ArrayList<IDeclaration>();
		this.privateDeclarations = new ArrayList<IDeclaration>();
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public IPackage getParent() {
		return this.parent;
	}

	public void setParent(Package parent) {
		this.parent = parent;
	}

	public void addPublicDeclaration(IDeclaration declaration) {
		this.publicDeclarations.add(declaration);
	}

	public void addPrivateDeclaration(IDeclaration declaration) {
		this.privateDeclarations.add(declaration);
	}

	@Override
	public List<IDeclaration> getPublicDeclarations() {
		return this.publicDeclarations;
	}

	@Override
	public List<IDeclaration> getPrivateDeclarations() {
		return this.privateDeclarations;
	}

}
