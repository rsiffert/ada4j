package org.ada4j.api;

import java.nio.file.Path;

import org.ada4j.api.model.ICompilationUnit;
import org.ada4j.internal.Parser;

/**
 * This class enables to create a compilation unit from an Ada source file.
 * 
 * @author RS
 *
 */
public class Factory {

	/**
	 * Creates a compilation unit from a Path pointing to an Ada source file.
	 * 
	 * @param adasourceFile
	 *            the Path to an Ada source file.
	 * @return a compilation unit corresponding to given Ada source file which
	 *         name is the one of the given file without extension.
	 */
	public static ICompilationUnit Create_Compilation_Unit(Path adasourceFile) {
		return Parser.ParseAdaSourceFile(adasourceFile);
	}

	/**
	 * Creates a compilation unit from Ada source file contents.
	 * 
	 * @param adaSourceFileContents
	 *            contents of the Ada source file.
	 * @param adaSourceFileName
	 *            name of the Ada source file.
	 * @return a compilation unit corresponding to given Ada source file
	 *         contents which name corresponds to <adaSourceFileName> without
	 *         extension.
	 */
	public static ICompilationUnit Create_Compilation_Unit(
			String adaSourceFileContents, String adaSourceFileName) {
		return Parser.ParseAdaSourceFile(adaSourceFileContents,
				adaSourceFileName);
	}
}
