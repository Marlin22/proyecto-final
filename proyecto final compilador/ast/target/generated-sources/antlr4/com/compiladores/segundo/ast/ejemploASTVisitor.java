// Generated from com\compiladores\segundo\ast\ejemploAST.g4 by ANTLR 4.5.1
package com.compiladores.segundo.ast;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ejemploASTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ejemploASTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#cadena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadena(ejemploASTParser.CadenaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#compi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompi(ejemploASTParser.CompiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(ejemploASTParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#int_assing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_assing(ejemploASTParser.Int_assingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#combinada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinada(ejemploASTParser.CombinadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#double_assing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_assing(ejemploASTParser.Double_assingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#string_assing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_assing(ejemploASTParser.String_assingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(ejemploASTParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#texto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexto(ejemploASTParser.TextoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#tipo_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_const(ejemploASTParser.Tipo_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#const_assing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_assing(ejemploASTParser.Const_assingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(ejemploASTParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(ejemploASTParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_expr(ejemploASTParser.Logical_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#condicion_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion_if(ejemploASTParser.Condicion_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(ejemploASTParser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#operador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador(ejemploASTParser.OperadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#conclusion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConclusion(ejemploASTParser.ConclusionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#ciclo_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_if(ejemploASTParser.Ciclo_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#iniciacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIniciacion(ejemploASTParser.IniciacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#tope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTope(ejemploASTParser.TopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#tope_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTope_op(ejemploASTParser.Tope_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#pasos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasos(ejemploASTParser.PasosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#paso_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaso_op(ejemploASTParser.Paso_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#ciclo_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_for(ejemploASTParser.Ciclo_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#operaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperaciones(ejemploASTParser.OperacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#llamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada(ejemploASTParser.LlamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#ciclo_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_while(ejemploASTParser.Ciclo_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(ejemploASTParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#repeticion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeticion(ejemploASTParser.RepeticionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(ejemploASTParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#cantidad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCantidad(ejemploASTParser.CantidadContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#assing_vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssing_vector(ejemploASTParser.Assing_vectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#rep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRep(ejemploASTParser.RepContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#cant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCant(ejemploASTParser.CantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#assing_matriz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssing_matriz(ejemploASTParser.Assing_matrizContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejemploASTParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(ejemploASTParser.FuncionContext ctx);
}