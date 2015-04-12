package org.ada4j.intenal.grammar.test;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class ErrorListener extends BaseErrorListener {

	private boolean testOk;

	public ErrorListener() {
		this.testOk = true;
	}

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer,
			Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
		this.testOk = false;

	}

	public boolean isTestOk() {
		return this.testOk;
	}

	public void reset() {
		this.testOk = true;
	}

}
