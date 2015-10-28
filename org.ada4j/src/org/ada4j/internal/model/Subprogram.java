package org.ada4j.internal.model;

import org.ada4j.api.model.ISubprogram;

public class Subprogram implements ISubprogram {

	private String name;
	private int type;
	private boolean isAbstract;

	public Subprogram(String name, int type, boolean isAbstract) {
		this.type = type;
		this.name = name;
		this.isAbstract = isAbstract;
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

}
