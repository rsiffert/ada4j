package org.ada4j.internal.grammar.test;

import static org.junit.Assert.assertTrue;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class GrammarTestUtils {

	/**
	 * Dumps the contents of parseResult to result file.
	 * 
	 * @param parseResult the parsing result as a string.
	 * @param filename    name of the file to write result to.
	 */
	private static void dumpResultToFile(String parseResult, String filename) {
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

	public static void runAcatsTest(File acatsDir, IAdaParserFactory parserFactory, String resultFilename) {

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