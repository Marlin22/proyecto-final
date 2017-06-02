// Generated from com\compiladores\segundo\ast\ejemploAST.g4 by ANTLR 4.5.1
package com.compiladores.segundo.ast;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ejemploASTParser}.
 */
public interface ejemploASTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#cadena}.
	 * @param ctx the parse tree
	 */
	void enterCadena(ejemploASTParser.CadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#cadena}.
	 * @param ctx the parse tree
	 */
	void exitCadena(ejemploASTParser.CadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#compi}.
	 * @param ctx the parse tree
	 */
	void enterCompi(ejemploASTParser.CompiContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#compi}.
	 * @param ctx the parse tree
	 */
	void exitCompi(ejemploASTParser.CompiContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(ejemploASTParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(ejemploASTParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#int_assing}.
	 * @param ctx the parse tree
	 */
	void enterInt_assing(ejemploASTParser.Int_assingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#int_assing}.
	 * @param ctx the parse tree
	 */
	void exitInt_assing(ejemploASTParser.Int_assingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#combinada}.
	 * @param ctx the parse tree
	 */
	void enterCombinada(ejemploASTParser.CombinadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#combinada}.
	 * @param ctx the parse tree
	 */
	void exitCombinada(ejemploASTParser.CombinadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#double_assing}.
	 * @param ctx the parse tree
	 */
	void enterDouble_assing(ejemploASTParser.Double_assingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#double_assing}.
	 * @param ctx the parse tree
	 */
	void exitDouble_assing(ejemploASTParser.Double_assingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#string_assing}.
	 * @param ctx the parse tree
	 */
	void enterString_assing(ejemploASTParser.String_assingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#string_assing}.
	 * @param ctx the parse tree
	 */
	void exitString_assing(ejemploASTParser.String_assingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(ejemploASTParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(ejemploASTParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#texto}.
	 * @param ctx the parse tree
	 */
	void enterTexto(ejemploASTParser.TextoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#texto}.
	 * @param ctx the parse tree
	 */
	void exitTexto(ejemploASTParser.TextoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#tipo_const}.
	 * @param ctx the parse tree
	 */
	void enterTipo_const(ejemploASTParser.Tipo_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#tipo_const}.
	 * @param ctx the parse tree
	 */
	void exitTipo_const(ejemploASTParser.Tipo_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#const_assing}.
	 * @param ctx the parse tree
	 */
	void enterConst_assing(ejemploASTParser.Const_assingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#const_assing}.
	 * @param ctx the parse tree
	 */
	void exitConst_assing(ejemploASTParser.Const_assingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(ejemploASTParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(ejemploASTParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ejemploASTParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ejemploASTParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expr(ejemploASTParser.Logical_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expr(ejemploASTParser.Logical_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#condicion_if}.
	 * @param ctx the parse tree
	 */
	void enterCondicion_if(ejemploASTParser.Condicion_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#condicion_if}.
	 * @param ctx the parse tree
	 */
	void exitCondicion_if(ejemploASTParser.Condicion_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(ejemploASTParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(ejemploASTParser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(ejemploASTParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(ejemploASTParser.OperadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#conclusion}.
	 * @param ctx the parse tree
	 */
	void enterConclusion(ejemploASTParser.ConclusionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#conclusion}.
	 * @param ctx the parse tree
	 */
	void exitConclusion(ejemploASTParser.ConclusionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#ciclo_if}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_if(ejemploASTParser.Ciclo_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#ciclo_if}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_if(ejemploASTParser.Ciclo_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#iniciacion}.
	 * @param ctx the parse tree
	 */
	void enterIniciacion(ejemploASTParser.IniciacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#iniciacion}.
	 * @param ctx the parse tree
	 */
	void exitIniciacion(ejemploASTParser.IniciacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#tope}.
	 * @param ctx the parse tree
	 */
	void enterTope(ejemploASTParser.TopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#tope}.
	 * @param ctx the parse tree
	 */
	void exitTope(ejemploASTParser.TopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#tope_op}.
	 * @param ctx the parse tree
	 */
	void enterTope_op(ejemploASTParser.Tope_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#tope_op}.
	 * @param ctx the parse tree
	 */
	void exitTope_op(ejemploASTParser.Tope_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#pasos}.
	 * @param ctx the parse tree
	 */
	void enterPasos(ejemploASTParser.PasosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#pasos}.
	 * @param ctx the parse tree
	 */
	void exitPasos(ejemploASTParser.PasosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#paso_op}.
	 * @param ctx the parse tree
	 */
	void enterPaso_op(ejemploASTParser.Paso_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#paso_op}.
	 * @param ctx the parse tree
	 */
	void exitPaso_op(ejemploASTParser.Paso_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#ciclo_for}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_for(ejemploASTParser.Ciclo_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#ciclo_for}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_for(ejemploASTParser.Ciclo_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#operaciones}.
	 * @param ctx the parse tree
	 */
	void enterOperaciones(ejemploASTParser.OperacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#operaciones}.
	 * @param ctx the parse tree
	 */
	void exitOperaciones(ejemploASTParser.OperacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#llamada}.
	 * @param ctx the parse tree
	 */
	void enterLlamada(ejemploASTParser.LlamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#llamada}.
	 * @param ctx the parse tree
	 */
	void exitLlamada(ejemploASTParser.LlamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#ciclo_while}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_while(ejemploASTParser.Ciclo_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#ciclo_while}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_while(ejemploASTParser.Ciclo_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(ejemploASTParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(ejemploASTParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#repeticion}.
	 * @param ctx the parse tree
	 */
	void enterRepeticion(ejemploASTParser.RepeticionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#repeticion}.
	 * @param ctx the parse tree
	 */
	void exitRepeticion(ejemploASTParser.RepeticionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(ejemploASTParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(ejemploASTParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#cantidad}.
	 * @param ctx the parse tree
	 */
	void enterCantidad(ejemploASTParser.CantidadContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#cantidad}.
	 * @param ctx the parse tree
	 */
	void exitCantidad(ejemploASTParser.CantidadContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#assing_vector}.
	 * @param ctx the parse tree
	 */
	void enterAssing_vector(ejemploASTParser.Assing_vectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#assing_vector}.
	 * @param ctx the parse tree
	 */
	void exitAssing_vector(ejemploASTParser.Assing_vectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#rep}.
	 * @param ctx the parse tree
	 */
	void enterRep(ejemploASTParser.RepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#rep}.
	 * @param ctx the parse tree
	 */
	void exitRep(ejemploASTParser.RepContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#cant}.
	 * @param ctx the parse tree
	 */
	void enterCant(ejemploASTParser.CantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#cant}.
	 * @param ctx the parse tree
	 */
	void exitCant(ejemploASTParser.CantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#assing_matriz}.
	 * @param ctx the parse tree
	 */
	void enterAssing_matriz(ejemploASTParser.Assing_matrizContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#assing_matriz}.
	 * @param ctx the parse tree
	 */
	void exitAssing_matriz(ejemploASTParser.Assing_matrizContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploASTParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(ejemploASTParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploASTParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(ejemploASTParser.FuncionContext ctx);
}