package org.ada4j.internal.grammar.test;

import static org.junit.Assert.assertTrue;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
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

import org.ada4j.internal.grammar.Ada2005Lexer;
import org.ada4j.internal.grammar.Ada2005Parser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.Test;

public class Ada2005GrammarTest {

	/**
	 * Return all Ada files contained in given directory according to file
	 * extension.
	 * 
	 * @param directory
	 *            directory in which to look for Ada files.
	 * @return an array of files containing all Ada files stored in given
	 *         directory.
	 */
	private File[] gatherAdaFilesOfDirectory(File directory) {
		return directory.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".A")
						|| pathname.getName().endsWith(".ADA");
			}
		});
	}

	/**
	 * Dumps the contents of parseResult to result file.
	 * 
	 * @param parseResult
	 *            the parsing result as a string.
	 * @param filename
	 *            name of the file to write result to.
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
	public void Acats31Test() {

		final String RESULT_FILENAME = "acats_result.txt";

		File acatsDir = new File("res", "ACATS31");

		List<File> testFiles = new ArrayList<File>();
		StringBuilder resultBuilder = new StringBuilder();

		File[] acastSubDirs = acatsDir.listFiles();
		for (File acastSubDir : acastSubDirs) {

			File[] testFilesForCurrentDir = gatherAdaFilesOfDirectory(acastSubDir);

			for (File testFile : testFilesForCurrentDir) {
				testFiles.add(testFile);
			}
		}

		boolean parsingOk = true;

		ExecutorService pool = Executors.newFixedThreadPool(Runtime
				.getRuntime().availableProcessors());
		Set<Future<ParsingResult>> globalResult = new HashSet<Future<ParsingResult>>();

		for (File testFile : testFiles) {
			Future<ParsingResult> fileResult = pool
					.submit(new Parser(testFile));
			globalResult.add(fileResult);
		}

		for (Future<ParsingResult> fileResult : globalResult) {
			try {
				if (!fileResult.get().isParsingOk()) {
					parsingOk = false;
					resultBuilder
							.append(fileResult.get().getNameOfParsedFile());
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
			dumpResultToFile(resultBuilder.toString(), RESULT_FILENAME);
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

class Parser implements Callable<ParsingResult> {

	private File fileToProcess;

	public Parser(File fileToProcess) {
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

	/**
	 * Parses given file using Ada2005Parser.
	 * 
	 * @param file
	 *            the file to parse.
	 * @return true if and only if no error has been encountered during file
	 *         parsing i.e. file is a valid Ada 2005 file.
	 */
	private boolean parseFile(File file) {
		ErrorListener errorListener = new ErrorListener();
		Ada2005Parser parser = null;
		Ada2005Lexer lexer = null;
		CommonTokenStream tokenStream = null;
		ANTLRInputStream input = null;

		try {
			input = new ANTLRFileStream(file.getAbsolutePath());
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
				tokenStream.reset();
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
