package org.ada4j.internal.grammar.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.ada4j.internal.grammar.ada2005.Ada2005Lexer;
import org.ada4j.internal.grammar.ada2005.Ada2005Parser;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.Test;

public class Ada2005GrammarTest {

	@Test
	public void acats31Test() {
		GrammarTestUtils.runAcatsTest(new File("res", "ACATS31"), new Ada2005ParserFactory(), "acats_31_result.txt");
	}

	class Ada2005ParserFactory implements IAdaParserFactory {
		public IAdaParser buildAdaParser(File fileToProcess) {
			return new Ada2005TestParser(fileToProcess);
		}
	}

	class Ada2005TestParser implements IAdaParser {

		private File fileToProcess;

		public Ada2005TestParser(File fileToProcess) {
			this.fileToProcess = fileToProcess;
		}

		/**
		 * Runs parsing on all files to process.
		 */
		@Override
		public ParsingResult call() {
			boolean parsingOk = parseFile(this.fileToProcess);

			return new ParsingResult(parsingOk, this.fileToProcess.getName());
		}

		@Override
		public boolean parseFile(File file) {
			org.ada4j.internal.grammar.test.ErrorListener errorListener = new ErrorListener();
			Ada2005Parser parser = null;
			Ada2005Lexer lexer = null;
			CommonTokenStream tokenStream = null;
			CharStream input = null;

			try {
				input = CharStreams.fromFileName(file.getAbsolutePath());
				lexer = new Ada2005Lexer(input);
				lexer.removeErrorListeners();
				lexer.addErrorListener(errorListener);

				tokenStream = new CommonTokenStream(lexer);
				parser = new Ada2005Parser(tokenStream);
				// try fast parsing strategy (SLL) first
				parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
				parser.removeErrorListeners();
				parser.setErrorHandler(new BailErrorStrategy());
				parser.addErrorListener(errorListener);
				parser.compilation();

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (RuntimeException e) {
				if (e instanceof ParseCancellationException) {
					// fallback to nominal parsing strategy (LL) in case of failure
					tokenStream.seek(0);
					errorListener.reset();
					parser.setErrorHandler(new DefaultErrorStrategy());
					parser.getInterpreter().setPredictionMode(PredictionMode.LL);
					parser.compilation();
				} else {
					e.printStackTrace();
				}
			}

			return errorListener.isTestOk();
		}
	}
}
