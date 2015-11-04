package org.ada4j.api.model;

import java.util.List;

/**
 * This interface represents an Ada compilation unit, usually stored in a file of its own.
 * 
 * @author RS
 * 
 */
public interface ICompilationUnit extends INamedUnit {
	
	@Override
	public String getName();

	public List<ISubprogram> getSubprograms();
	
	public List<IPackage> getPackages();

}
