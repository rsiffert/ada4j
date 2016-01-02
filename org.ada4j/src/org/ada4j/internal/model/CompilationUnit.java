package org.ada4j.internal.model;

import org.ada4j.api.model.ICompilationUnit;
import org.ada4j.api.model.IPackage;
import org.ada4j.api.model.ISubprogram;

import com.google.common.base.Preconditions;

public class CompilationUnit implements ICompilationUnit {

	private ISubprogram mainSubprogram;
	private IPackage rootPackage;
	private String name;

	public CompilationUnit(String name) {
		this.mainSubprogram = null;
		this.rootPackage = null;
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	public void setRootPackage(IPackage newPackage) {
		Preconditions.checkState(
				this.mainSubprogram == null && this.rootPackage == null);
		this.rootPackage = newPackage;
	}

	public void setMainSubprogram(ISubprogram subprogram) {
		Preconditions.checkState(
				this.mainSubprogram == null && this.rootPackage == null);
		this.mainSubprogram = subprogram;
	}

	@Override
	public ISubprogram getMainSubprogram() {
		return this.mainSubprogram;
	}

	@Override
	public IPackage getRootPackage() {
		return this.rootPackage;
	}
}
