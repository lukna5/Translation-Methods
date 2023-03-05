// Generated from MetaGrammar.g4 by ANTLR 4.12.0

package generatorsGrammer.GrammarOfGrammar;
import generatorsGrammer.grammar.*;
import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MetaGrammarParser}.
 */
public interface MetaGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MetaGrammarParser#metaGrammar}.
	 * @param ctx the parse tree
	 */
	void enterMetaGrammar(MetaGrammarParser.MetaGrammarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGrammarParser#metaGrammar}.
	 * @param ctx the parse tree
	 */
	void exitMetaGrammar(MetaGrammarParser.MetaGrammarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGrammarParser#nameGrammar}.
	 * @param ctx the parse tree
	 */
	void enterNameGrammar(MetaGrammarParser.NameGrammarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGrammarParser#nameGrammar}.
	 * @param ctx the parse tree
	 */
	void exitNameGrammar(MetaGrammarParser.NameGrammarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGrammarParser#sNonTerminal}.
	 * @param ctx the parse tree
	 */
	void enterSNonTerminal(MetaGrammarParser.SNonTerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGrammarParser#sNonTerminal}.
	 * @param ctx the parse tree
	 */
	void exitSNonTerminal(MetaGrammarParser.SNonTerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGrammarParser#grammarRules}.
	 * @param ctx the parse tree
	 */
	void enterGrammarRules(MetaGrammarParser.GrammarRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGrammarParser#grammarRules}.
	 * @param ctx the parse tree
	 */
	void exitGrammarRules(MetaGrammarParser.GrammarRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGrammarParser#inheritedAttributes}.
	 * @param ctx the parse tree
	 */
	void enterInheritedAttributes(MetaGrammarParser.InheritedAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGrammarParser#inheritedAttributes}.
	 * @param ctx the parse tree
	 */
	void exitInheritedAttributes(MetaGrammarParser.InheritedAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGrammarParser#synthesizedAttributes}.
	 * @param ctx the parse tree
	 */
	void enterSynthesizedAttributes(MetaGrammarParser.SynthesizedAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGrammarParser#synthesizedAttributes}.
	 * @param ctx the parse tree
	 */
	void exitSynthesizedAttributes(MetaGrammarParser.SynthesizedAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGrammarParser#rightRule}.
	 * @param ctx the parse tree
	 */
	void enterRightRule(MetaGrammarParser.RightRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGrammarParser#rightRule}.
	 * @param ctx the parse tree
	 */
	void exitRightRule(MetaGrammarParser.RightRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGrammarParser#product}.
	 * @param ctx the parse tree
	 */
	void enterProduct(MetaGrammarParser.ProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGrammarParser#product}.
	 * @param ctx the parse tree
	 */
	void exitProduct(MetaGrammarParser.ProductContext ctx);
}