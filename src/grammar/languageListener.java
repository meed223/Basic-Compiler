// Generated from M:/Year_3/CE305/Ass1/src\language.g4 by ANTLR 4.7.2
package grammar;

    import java.util.HashMap;
    import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link languageParser}.
 */
public interface languageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link languageParser#compile_python}.
	 * @param ctx the parse tree
	 */
	void enterCompile_python(languageParser.Compile_pythonContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#compile_python}.
	 * @param ctx the parse tree
	 */
	void exitCompile_python(languageParser.Compile_pythonContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(languageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(languageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(languageParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(languageParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(languageParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(languageParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(languageParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(languageParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(languageParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(languageParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(languageParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(languageParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(languageParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(languageParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#decTypes}.
	 * @param ctx the parse tree
	 */
	void enterDecTypes(languageParser.DecTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#decTypes}.
	 * @param ctx the parse tree
	 */
	void exitDecTypes(languageParser.DecTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(languageParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(languageParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(languageParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(languageParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(languageParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(languageParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(languageParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(languageParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(languageParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(languageParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#multiply}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(languageParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#multiply}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(languageParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(languageParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(languageParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#gate}.
	 * @param ctx the parse tree
	 */
	void enterGate(languageParser.GateContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#gate}.
	 * @param ctx the parse tree
	 */
	void exitGate(languageParser.GateContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(languageParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(languageParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(languageParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(languageParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#compile}.
	 * @param ctx the parse tree
	 */
	void enterCompile(languageParser.CompileContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#compile}.
	 * @param ctx the parse tree
	 */
	void exitCompile(languageParser.CompileContext ctx);
}