package org.ada4j.internal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Path;

import org.ada4j.api.model.ICompilationUnit;
import org.ada4j.internal.grammar.ada2005.Ada2005FileListener;
import org.ada4j.internal.grammar.ada2005.Ada2005Lexer;
import org.ada4j.internal.grammar.ada2005.Ada2005Parser;
import org.ada4j.internal.model.CompilationUnit;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Parser {

	public static ICompilationUnit ParseAdaSourceFile(Path path)
			throws RecognitionException {
		String filenameWithExtension = path.getFileName().toString();
		CompilationUnit compilationUnit = new CompilationUnit(
				filenameWithExtension.substring(0,
						filenameWithExtension.indexOf(".")));
		try {
			Reader reader = new FileReader(path.toFile());
			ParseAdaSourceFileFromReader(compilationUnit, reader);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return compilationUnit;
	}

	public static ICompilationUnit ParseAdaSourceFile(
			String adaSourceFileContents, String adaSourceFileName)
					throws RecognitionException {
		CompilationUnit compilationUnit = new CompilationUnit(
				adaSourceFileName.substring(0, adaSourceFileName.indexOf(".")));
		try {
			Reader reader = new StringReader(adaSourceFileContents);
			ParseAdaSourceFileFromReader(compilationUnit, reader);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return compilationUnit;
	}

	private static void ParseAdaSourceFileFromReader(
			CompilationUnit compilationUnit, Reader reader) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(reader);
		ANTLRInputStream input = new ANTLRInputStream(bufferedReader);
		Ada2005Lexer lexer = new Ada2005Lexer(input);
		Ada2005Parser parser = new Ada2005Parser(new CommonTokenStream(lexer));
		ParseTree parseTree = parser.compilation();
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		treeWalker.walk(new Ada2005FileListener(compilationUnit), parseTree);
	}

}
