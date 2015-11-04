package org.ada4j.internal.model;

import java.util.ArrayList;
import java.util.List;

import org.ada4j.api.model.ICompilationUnit;
import org.ada4j.api.model.IPackage;
import org.ada4j.api.model.ISubprogram;

public class CompilationUnit implements ICompilationUnit {

	private List<ISubprogram> subprograms;
	private List<IPackage> packages;
	private String name;

	public CompilationUnit(String name) {
		this.subprograms = new ArrayList<ISubprogram>();
		this.packages = new ArrayList<IPackage>();
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	public void addPackage(IPackage newPackage) {
		this.packages.add(newPackage);
	}
	
	public void addSubprogram(ISubprogram subprogram) {
		this.subprograms.add(subprogram);
	}

	@Override
	public List<ISubprogram> getSubprograms() {
		return this.subprograms;
	}

	@Override
	public List<IPackage> getPackages() {
		return this.packages;
	}
}
