package org.ada4j.internal.grammar.test;

import java.io.File;

interface IAdaParserFactory {

	public IAdaParser buildAdaParser(File fileToProcess);
}
