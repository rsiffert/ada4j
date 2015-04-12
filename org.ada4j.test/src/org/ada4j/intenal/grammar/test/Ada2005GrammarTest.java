package org.ada4j.intenal.grammar.test;

import static org.junit.Assert.assertTrue;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

		Parsing_Thread[] threadPool = new Parsing_Thread[Runtime.getRuntime()
				.availableProcessors()];

		List<File> testFiles = new ArrayList<File>();
		List<File> threadSafeTestFiles;

		StringBuilder resultBuilder = new StringBuilder();

		File[] acastSubDirs = acatsDir.listFiles();
		for (File acastSubDir : acastSubDirs) {

			File[] testFilesForCurrentDir = gatherAdaFilesOfDirectory(acastSubDir);

			for (File testFile : testFilesForCurrentDir) {
				testFiles.add(testFile);
			}
		}

		boolean parsingOk = true;

		threadSafeTestFiles = Collections.synchronizedList(testFiles);

		for (int threadId = 0; threadId < threadPool.length; threadId++) {
			threadPool[threadId] = new Parsing_Thread(threadSafeTestFiles);
			threadPool[threadId].start();
		}

		for (Parsing_Thread thread : threadPool) {
			try {
				thread.join();
				parsingOk = parsingOk && thread.isParsingOk();
				resultBuilder.append(thread.getParsingResult());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		if (!parsingOk) {
			String result = resultBuilder.toString();
			dumpResultToFile(result, RESULT_FILENAME);
		}

		assertTrue("No parsing error has occurred", parsingOk);
	}
}

class Parsing_Thread extends Thread {

	private List<File> filesToProcess;
	private StringBuilder resultBuilder;
	private boolean parsingIsOk;

	public Parsing_Thread(List<File> filesToProcess) {
		super();
		this.parsingIsOk = true;
		this.resultBuilder = new StringBuilder();
		this.filesToProcess = filesToProcess;
	}

	/**
	 * Runs parsing on all files to process.
	 */
	@Override
	public void run() {
		while (!this.filesToProcess.isEmpty()) {
			File file = this.filesToProcess.remove(0);

			boolean parsingOk = parseFile(file);

			if (!parsingOk) {
				this.parsingIsOk = false;
				this.resultBuilder.append(file.getName() + "\n");
			}
		}
	}

	/**
	 * Return the result of parsing for processed files.
	 * 
	 * @return true if and only if parsing completed successfully for all
	 *         processed files.
	 */
	public boolean isParsingOk() {
		return this.parsingIsOk;
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

	/**
	 * Return the parsing result.
	 * 
	 * @return a String containing the names of files for which a parsing error
	 *         occurred.
	 */
	public String getParsingResult() {
		return this.resultBuilder.toString();
	}
}
