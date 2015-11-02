package org.ada4j.internal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Path;

import org.ada4j.api.model.ICompilationUnit;
import org.ada4j.internal.grammar.Ada2005FileListener;
import org.ada4j.internal.grammar.Ada2005Lexer;
import org.ada4j.internal.grammar.Ada2005Parser;
import org.ada4j.internal.model.CompilationUnit;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Parser {

	public static ICompilationUnit ParseAdaSourceFile(Path path)
			throws RecognitionException {
		Ada2005Lexer lexer;
		String filenameWithExtension = path.getFileName().toString();
		CompilationUnit compilationUnit = new CompilationUnit(
				filenameWithExtension.substring(0,
						filenameWithExtension.indexOf(".")));
		try {
			Reader reader = new FileReader(path.toFile());
			BufferedReader bufferedReader = new BufferedReader(reader);
			ANTLRInputStream input = new ANTLRInputStream(bufferedReader);
			lexer = new Ada2005Lexer(input);
			Ada2005Parser parser = new Ada2005Parser(
					new CommonTokenStream(lexer));
			ParseTree parseTree = parser.compilation();
			ParseTreeWalker treeWalker = new ParseTreeWalker();
			treeWalker.walk(new Ada2005FileListener(compilationUnit),
					parseTree);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return compilationUnit;
	}

}
