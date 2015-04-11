package org.ada4j.intenal.grammar.test;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.ada4j.internal.grammar.Ada2005BaseListener;
import org.ada4j.internal.grammar.Ada2005Lexer;
import org.ada4j.internal.grammar.Ada2005Parser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
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

		try {

			final String RESULT_FILENAME = "acats_result.txt";

			File acatsDir = new File("res", "ACATS31");

			Parsing_Thread[] threadPool = new Parsing_Thread[Runtime
					.getRuntime().availableProcessors()];

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

			int nbTestFiles = testFiles.size();

			threadSafeTestFiles = Collections.synchronizedList(testFiles);

			for (int threadId = 0; threadId < threadPool.length; threadId++) {
				threadPool[threadId] = new Parsing_Thread(threadSafeTestFiles);
				threadPool[threadId].start();
			}

			for (Parsing_Thread thread : threadPool) {
				try {
					thread.join();
					resultBuilder.append(thread.getResult());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			String result = resultBuilder.toString();

			//dumpResultToFile(result, RESULT_FILENAME);

			assertEquals("No parsing error has occurred", -1,
					result.indexOf("KO"));

			assertEquals("All files have been parsed", nbTestFiles,
					result.split("\\n").length);

		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}
}

class Parsing_Thread extends Thread {

	private List<File> filesToProcess;
	private StringBuilder resultBuilder;

	public Parsing_Thread(List<File> filesToProcess) {
		super();
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

			if (parsingOk) {
				this.resultBuilder.append(file.getName() + "\tOK\n");
			} else {
				this.resultBuilder.append(file.getName() + "\tKO\n");
			}
		}
	}

	/**
	 * Return a String describing parsing result.
	 * 
	 * @return a String containing a list of filenames with associated parsing
	 *         result (OK or KO).
	 */
	public String getResult() {
		return this.resultBuilder.toString();
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
		Reader reader = null;

		try {
			reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(reader);
			ANTLRInputStream input;
			input = new ANTLRInputStream(bufferedReader);
			Ada2005Lexer lexer = new Ada2005Lexer(input);
			lexer.removeErrorListeners();
			lexer.addErrorListener(errorListener);
			Ada2005Parser parser = new Ada2005Parser(new CommonTokenStream(
					lexer));
			parser.removeErrorListeners();
			parser.getInterpreter().setPredictionMode(
					PredictionMode.LL_EXACT_AMBIG_DETECTION);
			parser.addErrorListener(errorListener);
			ParseTree parseTree = parser.compilation();
			ParseTreeWalker treeWalker = new ParseTreeWalker();
			treeWalker.walk(new Ada2005BaseListener(), parseTree);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {

				}
			}
		}

		return errorListener.isTestOk();
	}
}
