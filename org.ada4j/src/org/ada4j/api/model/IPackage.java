package org.ada4j.api.model;

import java.util.List;

public interface IPackage extends IDeclaration {
	
	public IPackage getParent();
	
	public List<IDeclaration> getPublicDeclarations();
	
	public List<IDeclaration> getPrivateDeclarations();

}
