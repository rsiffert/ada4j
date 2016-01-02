package org.ada4j.api.model;

/**
 * This class represents an Ada type declaration.
 * 
 * @author RS
 *
 */
public interface IType extends INamedUnit {

	/**
	 * Returns true if the type is defined as a subtype.
	 */
	public boolean isASubtype();

	@Override
	/**
	 * Returns the name of the type.
	 */
	public String getName();

}
