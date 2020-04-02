package org.ada4j.internal.grammar.test;

class ParsingResult {
	boolean parsingOk;
	String nameOfParsedFile;

	public ParsingResult(boolean parsingOk, String nameOfParsedFile) {
		this.parsingOk = parsingOk;
		this.nameOfParsedFile = nameOfParsedFile;
	}

	public boolean isParsingOk() {
		return parsingOk;
	}

	public String getNameOfParsedFile() {
		return nameOfParsedFile;
	}
}
