package org.ada4j.api.model;

public interface IType extends INamedUnit{
	
	public boolean isASubtype();
	
	@Override
	public String getName();

}
