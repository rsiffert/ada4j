package org.ada4j.internal.model;

import org.ada4j.api.model.IType;

public class Type implements IType {

	private String name;
	private boolean isASubtype;

	public Type(String name, boolean isASubtype) {
		this.name = name;
		this.isASubtype = isASubtype;
	}

	@Override
	public boolean isASubtype() {
		return this.isASubtype;
	}

	@Override
	public String getName() {
		return this.name;
	}

}
