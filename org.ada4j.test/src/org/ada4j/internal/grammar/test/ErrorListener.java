package org.ada4j.internal.grammar.test;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class ErrorListener extends BaseErrorListener {

	private boolean testOk;
	private String errorMsg;

	public ErrorListener() {
		this.testOk = true;
	}

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
		if (this.testOk) {
			// store only the first error message to ease debugging	
			this.testOk = false;
			this.errorMsg = new String(msg + " at " + line + ":" + charPositionInLine);
		}

	}

	public boolean isTestOk() {
		return this.testOk;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void reset() {
		this.testOk = true;
	}

}
