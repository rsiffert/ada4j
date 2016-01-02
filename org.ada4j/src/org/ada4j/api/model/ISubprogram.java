package org.ada4j.api.model;

import java.util.List;

/**
 * This class corresponds to an Ada subprogram which can either be a procedure
 * or a function.
 * 
 * @author RS
 *
 */
public interface ISubprogram extends INamedUnit {

	public final static int FUNCTION = 0;
	public final static int PROCEDURE = 1;

	@Override
	/**
	 * Returns the name of the subprogram.
	 */
	public String getName();

	/**
	 * Returns the kind of subprogram.
	 * 
	 * @return an int worth either ISubprogram.FUNCTION or
	 *         ISubprogram.PROCEDURE.
	 */
	public int getType();

	/**
	 * Returns true if subprogram is abstract, false otherwise.
	 */
	public boolean isAbstract();

	/**
	 * Returns true if subprogram is private, false otherwise.
	 */
	public boolean isPrivate();

	/**
	 * Returns the arguments of subprogram.
	 * 
	 * @return a list containing the types of the arguments of the subprogram,
	 *         empty if subprogram takes no argument.
	 */
	public List<IType> getArguments();

	/**
	 * Returns the return type of subprogram (only applicable for function).
	 * 
	 * @return the type returned by the subprogram.
	 */
	public IType getReturnType();

}
