package org.ada4j.internal.model;

import java.util.ArrayList;
import java.util.List;

import org.ada4j.api.model.IPackage;
import org.ada4j.api.model.ISubprogram;

public class Package implements IPackage {

	private String name;
	private IPackage parent;
	private List<IPackage> packages;
	private List<ISubprogram> subprograms;

	public Package(String name) {
		this.name = name;
		this.packages = new ArrayList<IPackage>();
		this.subprograms = new ArrayList<ISubprogram>();
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
	public List<IPackage> getPackages() {
		return this.packages;
	}

	@Override
	public List<ISubprogram> getSubprograms() {
		return this.subprograms;
	}

	public void addPackage(IPackage newPackage) {
		this.packages.add(newPackage);
	}

	public void addSubprogram(ISubprogram subprogram) {
		this.subprograms.add(subprogram);
	}
}
