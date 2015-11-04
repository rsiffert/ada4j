package org.ada4j.api.model;

public interface ISubprogram extends INamedUnit {
	
	public final static int FUNCTION = 0;
	public final static int PROCEDURE = 1;
	
	@Override
	public String getName();
	
	public int getType();
	
	public boolean isAbstract();
	
	public boolean isPrivate();

}
