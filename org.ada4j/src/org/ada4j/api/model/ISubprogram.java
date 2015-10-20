package org.ada4j.api.model;

public interface ISubprogram extends IDeclaration {
	
	public final static int FUNCTION = 0;
	public final static int PROCEDURE = 1;
	
	public int getType();
	
	public boolean isAbstract();

}
