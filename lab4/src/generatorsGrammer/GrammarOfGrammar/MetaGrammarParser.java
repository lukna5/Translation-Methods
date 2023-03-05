// Generated from MetaGrammar.g4 by ANTLR 4.12.0

package generatorsGrammer.GrammarOfGrammar;
import generatorsGrammer.grammar.*;
import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MetaGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, LEFT_COMP=2, RIGHT_COMP=3, COMMA=4, SEMICOLON=5, SEPARATOR=6, LEFT_BRACE=7, 
		RIGHT_BRACE=8, LEFT_BRACKET=9, RIGHT_BRACKET=10, RETURNS=11, GRAMMAR=12, 
		EPS=13, ARROW=14, COLON=15, CODE=16, INHER_ATTR=17, SYNT_ATTR=18, WORD_WITH_ALL_CAPITALIZED=19, 
		WORD_START_WITH_CAPITALIZED=20, WORD_START_WITH_SMALL=21, REGEXP=22;
	public static final int
		RULE_metaGrammar = 0, RULE_nameGrammar = 1, RULE_sNonTerminal = 2, RULE_grammarRules = 3, 
		RULE_inheritedAttributes = 4, RULE_synthesizedAttributes = 5, RULE_rightRule = 6, 
		RULE_product = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"metaGrammar", "nameGrammar", "sNonTerminal", "grammarRules", "inheritedAttributes", 
			"synthesizedAttributes", "rightRule", "product"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'<'", "'>'", "','", "';'", "'|'", "'{'", "'}'", "'['", "']'", 
			"'returns'", "'grammar'", "'eps'", "'->'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LEFT_COMP", "RIGHT_COMP", "COMMA", "SEMICOLON", "SEPARATOR", 
			"LEFT_BRACE", "RIGHT_BRACE", "LEFT_BRACKET", "RIGHT_BRACKET", "RETURNS", 
			"GRAMMAR", "EPS", "ARROW", "COLON", "CODE", "INHER_ATTR", "SYNT_ATTR", 
			"WORD_WITH_ALL_CAPITALIZED", "WORD_START_WITH_CAPITALIZED", "WORD_START_WITH_SMALL", 
			"REGEXP"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MetaGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MetaGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MetaGrammarContext extends ParserRuleContext {
		public Grammar grammar;
		public NameGrammarContext nameGrammar;
		public SNonTerminalContext sNonTerminal;
		public NameGrammarContext nameGrammar() {
			return getRuleContext(NameGrammarContext.class,0);
		}
		public SNonTerminalContext sNonTerminal() {
			return getRuleContext(SNonTerminalContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MetaGrammarParser.EOF, 0); }
		public List<GrammarRulesContext> grammarRules() {
			return getRuleContexts(GrammarRulesContext.class);
		}
		public GrammarRulesContext grammarRules(int i) {
			return getRuleContext(GrammarRulesContext.class,i);
		}
		public MetaGrammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metaGrammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterMetaGrammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitMetaGrammar(this);
		}
	}

	public final MetaGrammarContext metaGrammar() throws RecognitionException {
		MetaGrammarContext _localctx = new MetaGrammarContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_metaGrammar);

		        ArrayList<NonTerminal> nonTerminals = new ArrayList<>();
		        ArrayList<Terminal> terminals = new ArrayList<>();
		        HashMap<String, ArrayList<ArrayList<Product>>> rules = new HashMap<>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			((MetaGrammarContext)_localctx).nameGrammar = nameGrammar();
			setState(17);
			((MetaGrammarContext)_localctx).sNonTerminal = sNonTerminal();
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD_WITH_ALL_CAPITALIZED || _la==WORD_START_WITH_SMALL) {
				{
				{
				setState(18);
				grammarRules(nonTerminals, terminals, rules);
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			match(EOF);

			        ((MetaGrammarContext)_localctx).grammar =  ((MetaGrammarContext)_localctx).nameGrammar.grammar;
			        _localctx.grammar.setTerminals(terminals);
			        _localctx.grammar.setNonTerminals(nonTerminals);
			        _localctx.grammar.setRules(rules);
			        _localctx.grammar.setS(((MetaGrammarContext)_localctx).sNonTerminal.s);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameGrammarContext extends ParserRuleContext {
		public Grammar grammar;
		public Token WORD_START_WITH_CAPITALIZED;
		public TerminalNode GRAMMAR() { return getToken(MetaGrammarParser.GRAMMAR, 0); }
		public TerminalNode WORD_START_WITH_CAPITALIZED() { return getToken(MetaGrammarParser.WORD_START_WITH_CAPITALIZED, 0); }
		public TerminalNode SEMICOLON() { return getToken(MetaGrammarParser.SEMICOLON, 0); }
		public NameGrammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameGrammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterNameGrammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitNameGrammar(this);
		}
	}

	public final NameGrammarContext nameGrammar() throws RecognitionException {
		NameGrammarContext _localctx = new NameGrammarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nameGrammar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(GRAMMAR);
			setState(28);
			((NameGrammarContext)_localctx).WORD_START_WITH_CAPITALIZED = match(WORD_START_WITH_CAPITALIZED);
			setState(29);
			match(SEMICOLON);

			        ((NameGrammarContext)_localctx).grammar =  new Grammar((((NameGrammarContext)_localctx).WORD_START_WITH_CAPITALIZED!=null?((NameGrammarContext)_localctx).WORD_START_WITH_CAPITALIZED.getText():null));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SNonTerminalContext extends ParserRuleContext {
		public String s;
		public Token WORD_START_WITH_SMALL;
		public TerminalNode COLON() { return getToken(MetaGrammarParser.COLON, 0); }
		public TerminalNode WORD_START_WITH_SMALL() { return getToken(MetaGrammarParser.WORD_START_WITH_SMALL, 0); }
		public TerminalNode SEMICOLON() { return getToken(MetaGrammarParser.SEMICOLON, 0); }
		public SNonTerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sNonTerminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterSNonTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitSNonTerminal(this);
		}
	}

	public final SNonTerminalContext sNonTerminal() throws RecognitionException {
		SNonTerminalContext _localctx = new SNonTerminalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sNonTerminal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(COLON);
			setState(33);
			((SNonTerminalContext)_localctx).WORD_START_WITH_SMALL = match(WORD_START_WITH_SMALL);
			setState(34);
			match(SEMICOLON);

			        ((SNonTerminalContext)_localctx).s =  (((SNonTerminalContext)_localctx).WORD_START_WITH_SMALL!=null?((SNonTerminalContext)_localctx).WORD_START_WITH_SMALL.getText():null);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GrammarRulesContext extends ParserRuleContext {
		public ArrayList<NonTerminal> nonTerminals;
		public ArrayList<Terminal> terminals;
		public HashMap<String, ArrayList<ArrayList<Product>>> rules;
		public Token WORD_START_WITH_SMALL;
		public InheritedAttributesContext inheritedAttributes;
		public SynthesizedAttributesContext synthesizedAttributes;
		public RightRuleContext rightRule;
		public Token WORD_WITH_ALL_CAPITALIZED;
		public Token REGEXP;
		public TerminalNode WORD_START_WITH_SMALL() { return getToken(MetaGrammarParser.WORD_START_WITH_SMALL, 0); }
		public InheritedAttributesContext inheritedAttributes() {
			return getRuleContext(InheritedAttributesContext.class,0);
		}
		public SynthesizedAttributesContext synthesizedAttributes() {
			return getRuleContext(SynthesizedAttributesContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(MetaGrammarParser.ARROW, 0); }
		public List<RightRuleContext> rightRule() {
			return getRuleContexts(RightRuleContext.class);
		}
		public RightRuleContext rightRule(int i) {
			return getRuleContext(RightRuleContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(MetaGrammarParser.SEMICOLON, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(MetaGrammarParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(MetaGrammarParser.SEPARATOR, i);
		}
		public TerminalNode WORD_WITH_ALL_CAPITALIZED() { return getToken(MetaGrammarParser.WORD_WITH_ALL_CAPITALIZED, 0); }
		public TerminalNode COLON() { return getToken(MetaGrammarParser.COLON, 0); }
		public TerminalNode REGEXP() { return getToken(MetaGrammarParser.REGEXP, 0); }
		public GrammarRulesContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public GrammarRulesContext(ParserRuleContext parent, int invokingState, ArrayList<NonTerminal> nonTerminals, ArrayList<Terminal> terminals, HashMap<String, ArrayList<ArrayList<Product>>> rules) {
			super(parent, invokingState);
			this.nonTerminals = nonTerminals;
			this.terminals = terminals;
			this.rules = rules;
		}
		@Override public int getRuleIndex() { return RULE_grammarRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterGrammarRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitGrammarRules(this);
		}
	}

	public final GrammarRulesContext grammarRules(ArrayList<NonTerminal> nonTerminals,ArrayList<Terminal> terminals,HashMap<String, ArrayList<ArrayList<Product>>> rules) throws RecognitionException {
		GrammarRulesContext _localctx = new GrammarRulesContext(_ctx, getState(), nonTerminals, terminals, rules);
		enterRule(_localctx, 6, RULE_grammarRules);

		        String text = "";
		        ArrayList<ArrayList<Product>> listOfLists = new ArrayList<>();
		    
		int _la;
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD_START_WITH_SMALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				((GrammarRulesContext)_localctx).WORD_START_WITH_SMALL = match(WORD_START_WITH_SMALL);
				setState(38);
				((GrammarRulesContext)_localctx).inheritedAttributes = inheritedAttributes();
				setState(39);
				((GrammarRulesContext)_localctx).synthesizedAttributes = synthesizedAttributes();
				setState(40);
				match(ARROW);

				         NonTerminal nonTerminal = new NonTerminal((((GrammarRulesContext)_localctx).WORD_START_WITH_SMALL!=null?((GrammarRulesContext)_localctx).WORD_START_WITH_SMALL.getText():null), ((GrammarRulesContext)_localctx).inheritedAttributes.attr,
				          ((GrammarRulesContext)_localctx).synthesizedAttributes.attr);
				         _localctx.nonTerminals.add(nonTerminal);
				     
				setState(42);
				((GrammarRulesContext)_localctx).rightRule = rightRule();

				        listOfLists.add(((GrammarRulesContext)_localctx).rightRule.listOfProducts);
				        _localctx.rules.put((((GrammarRulesContext)_localctx).WORD_START_WITH_SMALL!=null?((GrammarRulesContext)_localctx).WORD_START_WITH_SMALL.getText():null), listOfLists);
				     
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATOR) {
					{
					{
					setState(44);
					match(SEPARATOR);
					setState(45);
					((GrammarRulesContext)_localctx).rightRule = rightRule();

					        listOfLists.add(((GrammarRulesContext)_localctx).rightRule.listOfProducts);
					     
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(53);
				match(SEMICOLON);
				}
				break;
			case WORD_WITH_ALL_CAPITALIZED:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				((GrammarRulesContext)_localctx).WORD_WITH_ALL_CAPITALIZED = match(WORD_WITH_ALL_CAPITALIZED);
				setState(56);
				match(COLON);
				setState(57);
				((GrammarRulesContext)_localctx).REGEXP = match(REGEXP);
				setState(58);
				match(SEMICOLON);

				        Terminal terminal = new Terminal((((GrammarRulesContext)_localctx).WORD_WITH_ALL_CAPITALIZED!=null?((GrammarRulesContext)_localctx).WORD_WITH_ALL_CAPITALIZED.getText():null), (((GrammarRulesContext)_localctx).REGEXP!=null?((GrammarRulesContext)_localctx).REGEXP.getText():null));
				        terminals.add(terminal);
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InheritedAttributesContext extends ParserRuleContext {
		public String attr;
		public Token INHER_ATTR;
		public TerminalNode INHER_ATTR() { return getToken(MetaGrammarParser.INHER_ATTR, 0); }
		public InheritedAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritedAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterInheritedAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitInheritedAttributes(this);
		}
	}

	public final InheritedAttributesContext inheritedAttributes() throws RecognitionException {
		InheritedAttributesContext _localctx = new InheritedAttributesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_inheritedAttributes);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INHER_ATTR:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				((InheritedAttributesContext)_localctx).INHER_ATTR = match(INHER_ATTR);

				        ((InheritedAttributesContext)_localctx).attr =  (((InheritedAttributesContext)_localctx).INHER_ATTR!=null?((InheritedAttributesContext)_localctx).INHER_ATTR.getText():null).substring(1, (((InheritedAttributesContext)_localctx).INHER_ATTR!=null?((InheritedAttributesContext)_localctx).INHER_ATTR.getText():null).length() - 1);
				    
				}
				break;
			case SEMICOLON:
			case SEPARATOR:
			case ARROW:
			case CODE:
			case SYNT_ATTR:
			case WORD_WITH_ALL_CAPITALIZED:
			case WORD_START_WITH_SMALL:
				enterOuterAlt(_localctx, 2);
				{

				        ((InheritedAttributesContext)_localctx).attr =  "";
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SynthesizedAttributesContext extends ParserRuleContext {
		public String attr;
		public Token SYNT_ATTR;
		public TerminalNode SYNT_ATTR() { return getToken(MetaGrammarParser.SYNT_ATTR, 0); }
		public SynthesizedAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthesizedAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterSynthesizedAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitSynthesizedAttributes(this);
		}
	}

	public final SynthesizedAttributesContext synthesizedAttributes() throws RecognitionException {
		SynthesizedAttributesContext _localctx = new SynthesizedAttributesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_synthesizedAttributes);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYNT_ATTR:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				((SynthesizedAttributesContext)_localctx).SYNT_ATTR = match(SYNT_ATTR);

				        ((SynthesizedAttributesContext)_localctx).attr =  (((SynthesizedAttributesContext)_localctx).SYNT_ATTR!=null?((SynthesizedAttributesContext)_localctx).SYNT_ATTR.getText():null).substring(1, (((SynthesizedAttributesContext)_localctx).SYNT_ATTR!=null?((SynthesizedAttributesContext)_localctx).SYNT_ATTR.getText():null).length() - 1);
				    
				}
				break;
			case ARROW:
				enterOuterAlt(_localctx, 2);
				{

				        ((SynthesizedAttributesContext)_localctx).attr =  "";
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RightRuleContext extends ParserRuleContext {
		public ArrayList<Product> listOfProducts;
		public ProductContext product;
		public Token CODE;
		public List<ProductContext> product() {
			return getRuleContexts(ProductContext.class);
		}
		public ProductContext product(int i) {
			return getRuleContext(ProductContext.class,i);
		}
		public TerminalNode EPS() { return getToken(MetaGrammarParser.EPS, 0); }
		public TerminalNode CODE() { return getToken(MetaGrammarParser.CODE, 0); }
		public RightRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterRightRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitRightRule(this);
		}
	}

	public final RightRuleContext rightRule() throws RecognitionException {
		RightRuleContext _localctx = new RightRuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rightRule);

		        ((RightRuleContext)_localctx).listOfProducts =  new ArrayList<>();
		    
		int _la;
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CODE:
			case WORD_WITH_ALL_CAPITALIZED:
			case WORD_START_WITH_SMALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(72);
					((RightRuleContext)_localctx).product = product();

					        _localctx.listOfProducts.add(((RightRuleContext)_localctx).product.prod);
					    
					}
					}
					setState(77); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2686976L) != 0) );
				}
				break;
			case EPS:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(EPS);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODE) {
					{
					setState(80);
					((RightRuleContext)_localctx).CODE = match(CODE);
					}
				}


				        _localctx.listOfProducts.add(new Terminal("EPS", "eps"));
				        _localctx.listOfProducts.add(new Code((((RightRuleContext)_localctx).CODE!=null?((RightRuleContext)_localctx).CODE.getText():null)));
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProductContext extends ParserRuleContext {
		public Product prod;
		public Token WORD_START_WITH_SMALL;
		public InheritedAttributesContext inheritedAttributes;
		public Token WORD_WITH_ALL_CAPITALIZED;
		public Token CODE;
		public TerminalNode WORD_START_WITH_SMALL() { return getToken(MetaGrammarParser.WORD_START_WITH_SMALL, 0); }
		public InheritedAttributesContext inheritedAttributes() {
			return getRuleContext(InheritedAttributesContext.class,0);
		}
		public TerminalNode WORD_WITH_ALL_CAPITALIZED() { return getToken(MetaGrammarParser.WORD_WITH_ALL_CAPITALIZED, 0); }
		public TerminalNode CODE() { return getToken(MetaGrammarParser.CODE, 0); }
		public ProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitProduct(this);
		}
	}

	public final ProductContext product() throws RecognitionException {
		ProductContext _localctx = new ProductContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_product);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD_START_WITH_SMALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				((ProductContext)_localctx).WORD_START_WITH_SMALL = match(WORD_START_WITH_SMALL);
				setState(87);
				((ProductContext)_localctx).inheritedAttributes = inheritedAttributes();

				        ((ProductContext)_localctx).prod =  new NonTerminal((((ProductContext)_localctx).WORD_START_WITH_SMALL!=null?((ProductContext)_localctx).WORD_START_WITH_SMALL.getText():null), ((ProductContext)_localctx).inheritedAttributes.attr, "");
				    
				}
				break;
			case WORD_WITH_ALL_CAPITALIZED:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				((ProductContext)_localctx).WORD_WITH_ALL_CAPITALIZED = match(WORD_WITH_ALL_CAPITALIZED);

				        ((ProductContext)_localctx).prod =  new Terminal((((ProductContext)_localctx).WORD_WITH_ALL_CAPITALIZED!=null?((ProductContext)_localctx).WORD_WITH_ALL_CAPITALIZED.getText():null), "");
				    
				}
				break;
			case CODE:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				((ProductContext)_localctx).CODE = match(CODE);

				        ((ProductContext)_localctx).prod =  new Code((((ProductContext)_localctx).CODE!=null?((ProductContext)_localctx).CODE.getText():null));
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0016a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000"+
		"\u0017\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u00031\b\u0003\n\u0003\f\u00034\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003=\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"B\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005G\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0004\u0006L\b\u0006\u000b\u0006\f\u0006"+
		"M\u0001\u0006\u0001\u0006\u0003\u0006R\b\u0006\u0001\u0006\u0003\u0006"+
		"U\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007_\b\u0007\u0001\u0007"+
		"\u0000\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0000b\u0000"+
		"\u0010\u0001\u0000\u0000\u0000\u0002\u001b\u0001\u0000\u0000\u0000\u0004"+
		" \u0001\u0000\u0000\u0000\u0006<\u0001\u0000\u0000\u0000\bA\u0001\u0000"+
		"\u0000\u0000\nF\u0001\u0000\u0000\u0000\fT\u0001\u0000\u0000\u0000\u000e"+
		"^\u0001\u0000\u0000\u0000\u0010\u0011\u0003\u0002\u0001\u0000\u0011\u0015"+
		"\u0003\u0004\u0002\u0000\u0012\u0014\u0003\u0006\u0003\u0000\u0013\u0012"+
		"\u0001\u0000\u0000\u0000\u0014\u0017\u0001\u0000\u0000\u0000\u0015\u0013"+
		"\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0018"+
		"\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0018\u0019"+
		"\u0005\u0000\u0000\u0001\u0019\u001a\u0006\u0000\uffff\uffff\u0000\u001a"+
		"\u0001\u0001\u0000\u0000\u0000\u001b\u001c\u0005\f\u0000\u0000\u001c\u001d"+
		"\u0005\u0014\u0000\u0000\u001d\u001e\u0005\u0005\u0000\u0000\u001e\u001f"+
		"\u0006\u0001\uffff\uffff\u0000\u001f\u0003\u0001\u0000\u0000\u0000 !\u0005"+
		"\u000f\u0000\u0000!\"\u0005\u0015\u0000\u0000\"#\u0005\u0005\u0000\u0000"+
		"#$\u0006\u0002\uffff\uffff\u0000$\u0005\u0001\u0000\u0000\u0000%&\u0005"+
		"\u0015\u0000\u0000&\'\u0003\b\u0004\u0000\'(\u0003\n\u0005\u0000()\u0005"+
		"\u000e\u0000\u0000)*\u0006\u0003\uffff\uffff\u0000*+\u0003\f\u0006\u0000"+
		"+2\u0006\u0003\uffff\uffff\u0000,-\u0005\u0006\u0000\u0000-.\u0003\f\u0006"+
		"\u0000./\u0006\u0003\uffff\uffff\u0000/1\u0001\u0000\u0000\u00000,\u0001"+
		"\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u0000"+
		"23\u0001\u0000\u0000\u000035\u0001\u0000\u0000\u000042\u0001\u0000\u0000"+
		"\u000056\u0005\u0005\u0000\u00006=\u0001\u0000\u0000\u000078\u0005\u0013"+
		"\u0000\u000089\u0005\u000f\u0000\u00009:\u0005\u0016\u0000\u0000:;\u0005"+
		"\u0005\u0000\u0000;=\u0006\u0003\uffff\uffff\u0000<%\u0001\u0000\u0000"+
		"\u0000<7\u0001\u0000\u0000\u0000=\u0007\u0001\u0000\u0000\u0000>?\u0005"+
		"\u0011\u0000\u0000?B\u0006\u0004\uffff\uffff\u0000@B\u0006\u0004\uffff"+
		"\uffff\u0000A>\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000B\t\u0001"+
		"\u0000\u0000\u0000CD\u0005\u0012\u0000\u0000DG\u0006\u0005\uffff\uffff"+
		"\u0000EG\u0006\u0005\uffff\uffff\u0000FC\u0001\u0000\u0000\u0000FE\u0001"+
		"\u0000\u0000\u0000G\u000b\u0001\u0000\u0000\u0000HI\u0003\u000e\u0007"+
		"\u0000IJ\u0006\u0006\uffff\uffff\u0000JL\u0001\u0000\u0000\u0000KH\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000NU\u0001\u0000\u0000\u0000OQ\u0005\r\u0000\u0000"+
		"PR\u0005\u0010\u0000\u0000QP\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000SU\u0006\u0006\uffff\uffff\u0000TK\u0001"+
		"\u0000\u0000\u0000TO\u0001\u0000\u0000\u0000U\r\u0001\u0000\u0000\u0000"+
		"VW\u0005\u0015\u0000\u0000WX\u0003\b\u0004\u0000XY\u0006\u0007\uffff\uffff"+
		"\u0000Y_\u0001\u0000\u0000\u0000Z[\u0005\u0013\u0000\u0000[_\u0006\u0007"+
		"\uffff\uffff\u0000\\]\u0005\u0010\u0000\u0000]_\u0006\u0007\uffff\uffff"+
		"\u0000^V\u0001\u0000\u0000\u0000^Z\u0001\u0000\u0000\u0000^\\\u0001\u0000"+
		"\u0000\u0000_\u000f\u0001\u0000\u0000\u0000\t\u00152<AFMQT^";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}