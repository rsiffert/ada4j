package org.ada4j.internal.model;

import java.util.List;

import org.ada4j.api.model.ISubprogram;
import org.ada4j.api.model.IType;

public class Subprogram implements ISubprogram {

	private String name;
	private int type;
	private boolean isAbstract;
	private boolean isPrivate;
	private IType returnType;
	private List<IType> arguments;

	public Subprogram(String name, int type, boolean isAbstract,
			boolean isPrivate, IType returnType, List<IType> arguments) {
		this.type = type;
		this.name = name;
		this.isAbstract = isAbstract;
		this.isPrivate = isPrivate;
		this.returnType = returnType;
		this.arguments = arguments;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getType() {
		return this.type;
	}

	@Override
	public boolean isAbstract() {
		return this.isAbstract;
	}

	@Override
	public boolean isPrivate() {
		return this.isPrivate;
	}

	@Override
	public List<IType> getArguments() {
		return this.arguments;
	}

	@Override
	public IType getReturnType() {
		return this.returnType;
	}

}
