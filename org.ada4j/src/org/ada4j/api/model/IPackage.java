package org.ada4j.api.model;

import java.util.List;

public interface IPackage {
	
	public String getName();
	
	public IPackage getParent();
	
	public List<IPackage> getPackages();

	public List<ISubprogram> getSubprograms();
}
