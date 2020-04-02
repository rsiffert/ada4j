package org.ada4j.internal.grammar.test;

import java.io.File;
import java.io.IOException;

import org.ada4j.internal.grammar.ada2012.Ada2012Lexer;
import org.ada4j.internal.grammar.ada2012.Ada2012Parser;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.Test;

public class Ada2012GrammarTest {

	@Test
	public void acats41Test() {
		GrammarTestUtils.runAcatsTest(new File("res", "ACATS41"), new Ada2012ParserFactory(), "acats_41_result.txt");
	}

	class Ada2012ParserFactory implements IAdaParserFactory {
		public IAdaParser buildAdaParser(File fileToProcess) {
			return new Ada2012TestParser(fileToProcess);
		}
	}

	class Ada2012TestParser implements IAdaParser {

		private File fileToProcess;

		public Ada2012TestParser(File fileToProcess) {
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
			ErrorListener errorListener = new ErrorListener();
			Ada2012Parser parser = null;
			Ada2012Lexer lexer = null;
			CommonTokenStream tokenStream = null;
			CharStream input = null;
			boolean parsingSuccessful = true;

			try {
				input = CharStreams.fromFileName(file.getAbsolutePath());
				lexer = new Ada2012Lexer(input);
				lexer.removeErrorListeners();
				lexer.addErrorListener(errorListener);

				tokenStream = new CommonTokenStream(lexer);
				parser = new Ada2012Parser(tokenStream);
				parser.getInterpreter().setPredictionMode(PredictionMode.LL);
				parser.removeErrorListeners();
				parser.setErrorHandler(new BailErrorStrategy());
				parser.addErrorListener(errorListener);
				parser.compilation();
				parsingSuccessful = errorListener.isTestOk();
			} catch (IOException e) {
				e.printStackTrace();
				parsingSuccessful = false;
			} catch (ParseCancellationException e) {
				tokenStream.seek(0);
				errorListener.reset();
				parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
				parser.setErrorHandler(new DefaultErrorStrategy());
				parser.compilation();
				parsingSuccessful = errorListener.isTestOk();
			}

			if (!parsingSuccessful) {
				System.err.println("Parsing error on " + file.getName() + ": " + errorListener.getErrorMsg());
			}

			return parsingSuccessful;
		}
	}
}
