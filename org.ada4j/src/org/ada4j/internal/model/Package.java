package org.ada4j.internal.model;

import java.util.List;

import org.ada4j.api.model.IDeclaration;
import org.ada4j.api.model.IPackage;

public class Package implements IPackage {

	private String name;
	private IPackage parent;

	public Package(String name) {
		this.name = name;
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

	@Override
	public List<IDeclaration> getPublicDeclarations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IDeclaration> getPrivateDeclarations() {
		// TODO Auto-generated method stub
		return null;
	}

}
