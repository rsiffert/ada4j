package org.ada4j.internal.grammar.test;

import static org.junit.Assert.assertTrue;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.ada4j.internal.grammar.ada2005.Ada2005Lexer;
import org.ada4j.internal.grammar.ada2005.Ada2005Parser;
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

public class AdaGrammarTest {

	/**
	 * Dumps the contents of parseResult to result file.
	 * 
	 * @param parseResult the parsing result as a string.
	 * @param filename    name of the file to write result to.
	 */
	private void dumpResultToFile(String parseResult, String filename) {
		BufferedWriter bufferedResultWriter = null;
		FileWriter resultWriter = null;

		try {
			resultWriter = new FileWriter(filename);
			bufferedResultWriter = new BufferedWriter(resultWriter);
			bufferedResultWriter.write(parseResult);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bufferedResultWriter != null) {
				try {
					bufferedResultWriter.close();
				} catch (IOException e) {
				}
			}
			if (resultWriter != null) {
				try {
					resultWriter.close();
				} catch (IOException e) {
				}
			}
		}

	}

	@Test
	public void Acats41Test() {
		AcatsTest(new File("res", "ACATS41"), new Ada2012ParserFactory(), "acats_41_result.txt");
	}

	@Test
	public void Acats31Test() {
		AcatsTest(new File("res", "ACATS31"), new Ada2005ParserFactory(), "acats_31_result.txt");
	}

	public void AcatsTest(File acatsDir, AdaParserFactory parserFactory, String resultFilename) {

		List<File> testFiles = new ArrayList<File>();
		StringBuilder resultBuilder = new StringBuilder();

		File[] acastSubDirs = acatsDir.listFiles();
		for (File acastSubDir : acastSubDirs) {

			File[] testFilesForCurrentDir = acastSubDir.listFiles();

			for (File testFile : testFilesForCurrentDir) {
				testFiles.add(testFile);
			}
		}

		boolean parsingOk = true;

		ExecutorService pool = Executors
				.newFixedThreadPool(Math.max(Runtime.getRuntime().availableProcessors() - 1, 1));
		Set<Future<ParsingResult>> globalResult = new HashSet<Future<ParsingResult>>();

		for (File testFile : testFiles) {
			Future<ParsingResult> fileResult = pool.submit(parserFactory.buildAdaParser(testFile));
			globalResult.add(fileResult);
		}

		for (Future<ParsingResult> fileResult : globalResult) {
			try {
				if (!fileResult.get().isParsingOk()) {
					parsingOk = false;
					resultBuilder.append(fileResult.get().getNameOfParsedFile());
					resultBuilder.append("\n");
				}
			} catch (InterruptedException e) {
				parsingOk = false;
				e.printStackTrace();
			} catch (ExecutionException e) {
				parsingOk = false;
				e.printStackTrace();
			}
		}

		if (!parsingOk) {
			dumpResultToFile(resultBuilder.toString(), resultFilename);
		}

		assertTrue("No parsing error has occurred", parsingOk);
	}
}

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

interface AdaParser extends Callable<ParsingResult> {
	/**
	 * Parses given file using Ada parser.
	 * 
	 * @param file the file to parse.
	 * @return true if and only if no error has been encountered during file parsing
	 *         i.e. file is a valid Ada file.
	 */
	public boolean parseFile(File file);
}

interface AdaParserFactory {
	public AdaParser buildAdaParser(File fileToProcess);
}

class Ada2005ParserFactory implements AdaParserFactory {
	public AdaParser buildAdaParser(File fileToProcess) {
		return new Ada2005TestParser(fileToProcess);
	}
}

class Ada2012ParserFactory implements AdaParserFactory {
	public AdaParser buildAdaParser(File fileToProcess) {
		return new Ada2012TestParser(fileToProcess);
	}
}

class Ada2005TestParser implements AdaParser {

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
		ErrorListener errorListener = new ErrorListener();
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

class Ada2012TestParser implements AdaParser {

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
