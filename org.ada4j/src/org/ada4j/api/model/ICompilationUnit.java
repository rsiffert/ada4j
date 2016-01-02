package org.ada4j.api.model;

/**
 * This interface represents an Ada compilation unit, usually stored in a file
 * of its own.
 * 
 * @author RS
 * 
 */
public interface ICompilationUnit extends INamedUnit {

	@Override
	/**
	 * Returns the name of the compilation unit corresponding to its filename.
	 */
	public String getName();

	/**
	 * Returns the compilation unit main subprogram.
	 * 
	 * @return the subprogram corresponding to the compilation unit if any, null
	 *         otherwise.
	 */
	public ISubprogram getMainSubprogram();

	/**
	 * Returns the compilation unit root package.
	 * 
	 * @return the root package of the compilation unit if any, null otherwise.
	 */
	public IPackage getRootPackage();
}
