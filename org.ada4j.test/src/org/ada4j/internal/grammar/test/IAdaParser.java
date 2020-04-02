package org.ada4j.internal.grammar.test;

import java.io.File;
import java.util.concurrent.Callable;

interface IAdaParser extends Callable<ParsingResult> {
	/**
	 * Parses given file using Ada parser.
	 * 
	 * @param file the file to parse.
	 * @return true if and only if no error has been encountered during file parsing
	 *         i.e. file is a valid Ada file.
	 */
	public boolean parseFile(File file);
}