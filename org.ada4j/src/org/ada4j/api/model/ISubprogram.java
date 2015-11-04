package org.ada4j.api.model;

public interface ISubprogram {
	
	public final static int FUNCTION = 0;
	public final static int PROCEDURE = 1;
	
	public String getName();
	
	public int getType();
	
	public boolean isAbstract();
	
	public boolean isPrivate();

}
