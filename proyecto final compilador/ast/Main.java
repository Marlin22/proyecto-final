
package com.compiladores.segundo.ast;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	private static final String EXTENSION = "pmo";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test\test." + EXTENSION;

		System.out.println("Interpreting file " + program);

		ejemploASTLexer lexer = new ejemploASTLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ejemploASTParser parser = new ejemploASTParser(tokens);

		ejemploASTParser.CompiContext tree = parser.compi(); // AQUI ES EL NOMBRE DE LA CLASE Y NOMBRE DEL METODO QUE INICIA EL PROCESO DE ANALISIS SINTACTICO

		ejemploASTCustomVisitor visitor = new ejemploASTCustomVisitor();
		visitor.visit(tree);

		System.out.println("Interpretation finished");

	}

}
