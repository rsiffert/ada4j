package org.ada4j.api;

import java.nio.file.Path;

import org.ada4j.api.model.ICompilationUnit;
import org.ada4j.internal.Parser;

public class Factory {

	public static ICompilationUnit Create_Compilation_Unit(Path adasourceFile) {
		return Parser.ParseAdaSourceFile(adasourceFile);
	}
}
