// Generated from java-escape by ANTLR 4.11.1

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
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NLINE=1, DEF=2, MAIN=3, LROUND=4, RROUND=5, LBR=6, RBR=7, COL=8, PRINT=9, 
		SEMICOL=10, AND=11, OR=12, OP=13, BOOLOP=14, EQ=15, WHILE=16, IF=17, STR=18, 
		CONTINUE=19, BREAK=20, ELSE=21, BOOL=22, NUM=23, NAME=24, WS=25;
	public static final int
		RULE_s = 0, RULE_main = 1, RULE_nlines = 2, RULE_expr = 3, RULE_expr1 = 4, 
		RULE_predicate = 5, RULE_whileBody = 6, RULE_ifBody = 7, RULE_elseBody = 8, 
		RULE_elIf = 9, RULE_opBool = 10, RULE_opBoolT = 11, RULE_bool = 12, RULE_op = 13, 
		RULE_opT = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "main", "nlines", "expr", "expr1", "predicate", "whileBody", "ifBody", 
			"elseBody", "elIf", "opBool", "opBoolT", "bool", "op", "opT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\n'", "'def'", "'main():'", "'('", "')'", "'{'", "'}'", "':'", 
			"'print'", "';'", "'and'", "'or'", null, null, "'='", "'while'", "'if'", 
			null, "'continue'", "'break'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NLINE", "DEF", "MAIN", "LROUND", "RROUND", "LBR", "RBR", "COL", 
			"PRINT", "SEMICOL", "AND", "OR", "OP", "BOOLOP", "EQ", "WHILE", "IF", 
			"STR", "CONTINUE", "BREAK", "ELSE", "BOOL", "NUM", "NAME", "WS"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public String res;
		public MainContext main;
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);

		    HashMap<String, String> vars = new HashMap<String, String>();
		    StringBuilder sb = new StringBuilder();
		    sb.append("#include <stdio.h> \n");

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			((SContext)_localctx).main = main(vars);
			setState(31);
			match(EOF);
			sb.append(((SContext)_localctx).main.res);
			}
			_ctx.stop = _input.LT(-1);

			    sb.append("}");
			    ((SContext)_localctx).res =  sb.toString();

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
	public static class MainContext extends ParserRuleContext {
		public HashMap<String, String> vars;
		public String res;
		public ExprContext expr;
		public TerminalNode DEF() { return getToken(ExprParser.DEF, 0); }
		public TerminalNode MAIN() { return getToken(ExprParser.MAIN, 0); }
		public TerminalNode NLINE() { return getToken(ExprParser.NLINE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MainContext(ParserRuleContext parent, int invokingState, HashMap<String, String> vars) {
			super(parent, invokingState);
			this.vars = vars;
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMain(this);
		}
	}

	public final MainContext main(HashMap<String, String> vars) throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState(), vars);
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(DEF);
			setState(35);
			match(MAIN);
			setState(36);
			match(NLINE);
			setState(37);
			((MainContext)_localctx).expr = expr(vars);

			        ((MainContext)_localctx).res =  "int main()\n{ \n" + ((MainContext)_localctx).expr.res;
			    
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
	public static class NlinesContext extends ParserRuleContext {
		public TerminalNode NLINE() { return getToken(ExprParser.NLINE, 0); }
		public NlinesContext nlines() {
			return getRuleContext(NlinesContext.class,0);
		}
		public NlinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nlines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNlines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNlines(this);
		}
	}

	public final NlinesContext nlines() throws RecognitionException {
		NlinesContext _localctx = new NlinesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nlines);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NLINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(NLINE);
				setState(41);
				nlines();
				}
				break;
			case EOF:
			case PRINT:
			case WHILE:
			case IF:
			case CONTINUE:
			case BREAK:
			case ELSE:
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class ExprContext extends ParserRuleContext {
		public HashMap<String, String> vars;
		public String res;
		public OpContext op;
		public ExprContext expr;
		public Token NAME;
		public PredicateContext predicate;
		public WhileBodyContext whileBody;
		public IfBodyContext ifBody;
		public ElseBodyContext elseBody;
		public TerminalNode PRINT() { return getToken(ExprParser.PRINT, 0); }
		public TerminalNode LROUND() { return getToken(ExprParser.LROUND, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode RROUND() { return getToken(ExprParser.RROUND, 0); }
		public NlinesContext nlines() {
			return getRuleContext(NlinesContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NAME() { return getToken(ExprParser.NAME, 0); }
		public TerminalNode EQ() { return getToken(ExprParser.EQ, 0); }
		public TerminalNode WHILE() { return getToken(ExprParser.WHILE, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode COL() { return getToken(ExprParser.COL, 0); }
		public WhileBodyContext whileBody() {
			return getRuleContext(WhileBodyContext.class,0);
		}
		public TerminalNode IF() { return getToken(ExprParser.IF, 0); }
		public IfBodyContext ifBody() {
			return getRuleContext(IfBodyContext.class,0);
		}
		public ElseBodyContext elseBody() {
			return getRuleContext(ElseBodyContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, HashMap<String, String> vars) {
			super(parent, invokingState);
			this.vars = vars;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr(HashMap<String, String> vars) throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState(), vars);
		enterRule(_localctx, 6, RULE_expr);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(PRINT);
				setState(46);
				match(LROUND);
				setState(47);
				((ExprContext)_localctx).op = op();
				setState(48);
				match(RROUND);
				setState(49);
				nlines();
				setState(50);
				((ExprContext)_localctx).expr = expr(vars);

				        ((ExprContext)_localctx).res =  "printf(";
				        if (((ExprContext)_localctx).op.type.equals("int")) {
				            _localctx.res += "\"%d\",";
				        } else if (((ExprContext)_localctx).op.type.equals("char*")) {
				            _localctx.res += "\"%s\",";
				        } else {
				            if (vars.containsKey(((ExprContext)_localctx).op.type)){
				                if (vars.get(((ExprContext)_localctx).op.type).equals("int")){
				                    _localctx.res += "\"%d\",";
				                } else if (vars.get(((ExprContext)_localctx).op.type).equals("int")){
				                    _localctx.res += "\"%s\",";
				                }
				            }
				        }
				        _localctx.res += ((ExprContext)_localctx).op.res;
				        _localctx.res += ");\n";
				        _localctx.res += ((ExprContext)_localctx).expr.res;
				        
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				((ExprContext)_localctx).NAME = match(NAME);
				setState(54);
				match(EQ);
				setState(55);
				((ExprContext)_localctx).op = op();

				            String type = "";
				            if (vars.containsKey((((ExprContext)_localctx).NAME!=null?((ExprContext)_localctx).NAME.getText():null))){
				                type = "";
				            }
				            else {
				                type = ((ExprContext)_localctx).op.type;
				                vars.put((((ExprContext)_localctx).NAME!=null?((ExprContext)_localctx).NAME.getText():null), type);
				            }
				        
				setState(57);
				nlines();
				setState(58);
				((ExprContext)_localctx).expr = expr(vars);

				            ((ExprContext)_localctx).res =  type + " " + (((ExprContext)_localctx).NAME!=null?((ExprContext)_localctx).NAME.getText():null) + " = " + ((ExprContext)_localctx).op.res + ";\n" + ((ExprContext)_localctx).expr.res;
				        
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				match(WHILE);
				setState(62);
				match(LROUND);
				setState(63);
				((ExprContext)_localctx).predicate = predicate();
				setState(64);
				match(RROUND);
				setState(65);
				match(COL);
				setState(66);
				nlines();
				setState(67);
				((ExprContext)_localctx).whileBody = whileBody(vars);
				setState(68);
				((ExprContext)_localctx).expr = expr(vars);

				            ((ExprContext)_localctx).res =  "while";
				            _localctx.res += "(";
				            _localctx.res += ((ExprContext)_localctx).predicate.res;
				            _localctx.res += ")";
				            _localctx.res += "{\n";
				            _localctx.res += ((ExprContext)_localctx).whileBody.res;
				            _localctx.res += "}\n";
				            _localctx.res += ((ExprContext)_localctx).expr.res;
				        
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				match(IF);
				setState(72);
				match(LROUND);
				setState(73);
				((ExprContext)_localctx).predicate = predicate();
				setState(74);
				match(RROUND);
				setState(75);
				match(COL);
				setState(76);
				nlines();
				setState(77);
				((ExprContext)_localctx).ifBody = ifBody(vars);
				setState(78);
				((ExprContext)_localctx).elseBody = elseBody(vars);
				setState(79);
				((ExprContext)_localctx).expr = expr(vars);

				               ((ExprContext)_localctx).res =  "if";
				               _localctx.res += "(";
				               _localctx.res += ((ExprContext)_localctx).predicate.res;
				               _localctx.res += ")";
				               _localctx.res += " {\n";
				               _localctx.res += ((ExprContext)_localctx).ifBody.res;
				               _localctx.res += "}\n";
				               _localctx.res += ((ExprContext)_localctx).elseBody.res;
				               _localctx.res += ((ExprContext)_localctx).expr.res;
				            
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 5);
				{
				((ExprContext)_localctx).res =  "";
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
	public static class Expr1Context extends ParserRuleContext {
		public HashMap<String, String> vars;
		public String res;
		public OpContext op;
		public Token NAME;
		public PredicateContext predicate;
		public WhileBodyContext whileBody;
		public IfBodyContext ifBody;
		public ElseBodyContext elseBody;
		public TerminalNode PRINT() { return getToken(ExprParser.PRINT, 0); }
		public TerminalNode LROUND() { return getToken(ExprParser.LROUND, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode RROUND() { return getToken(ExprParser.RROUND, 0); }
		public NlinesContext nlines() {
			return getRuleContext(NlinesContext.class,0);
		}
		public TerminalNode NAME() { return getToken(ExprParser.NAME, 0); }
		public TerminalNode EQ() { return getToken(ExprParser.EQ, 0); }
		public TerminalNode WHILE() { return getToken(ExprParser.WHILE, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode COL() { return getToken(ExprParser.COL, 0); }
		public WhileBodyContext whileBody() {
			return getRuleContext(WhileBodyContext.class,0);
		}
		public TerminalNode IF() { return getToken(ExprParser.IF, 0); }
		public IfBodyContext ifBody() {
			return getRuleContext(IfBodyContext.class,0);
		}
		public ElseBodyContext elseBody() {
			return getRuleContext(ElseBodyContext.class,0);
		}
		public Expr1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr1Context(ParserRuleContext parent, int invokingState, HashMap<String, String> vars) {
			super(parent, invokingState);
			this.vars = vars;
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExpr1(this);
		}
	}

	public final Expr1Context expr1(HashMap<String, String> vars) throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState(), vars);
		enterRule(_localctx, 8, RULE_expr1);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(PRINT);
				setState(86);
				match(LROUND);
				setState(87);
				((Expr1Context)_localctx).op = op();
				setState(88);
				match(RROUND);
				setState(89);
				nlines();

				        ((Expr1Context)_localctx).res =  "printf(";
				        if (((Expr1Context)_localctx).op.type.equals("int")) {
				            _localctx.res += "\"%d\",";
				        } else if (((Expr1Context)_localctx).op.type.equals("char*")) {
				            _localctx.res += "\"%s\",";
				        } else {
				            if (vars.containsKey(((Expr1Context)_localctx).op.type)){
				                if (vars.get(((Expr1Context)_localctx).op.type).equals("int")){
				                    _localctx.res += "\"%d\",";
				                } else if (vars.get(((Expr1Context)_localctx).op.type).equals("int")){
				                    _localctx.res += "\"%s\",";
				                }
				            }
				        }
				        _localctx.res += ((Expr1Context)_localctx).op.res;
				        _localctx.res += ");\n";
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				((Expr1Context)_localctx).NAME = match(NAME);
				setState(93);
				match(EQ);
				setState(94);
				((Expr1Context)_localctx).op = op();

				            String type = "";
				            if (vars.containsKey((((Expr1Context)_localctx).NAME!=null?((Expr1Context)_localctx).NAME.getText():null))){
				                type = "";
				            }
				            else {
				                type = ((Expr1Context)_localctx).op.type;
				                vars.put((((Expr1Context)_localctx).NAME!=null?((Expr1Context)_localctx).NAME.getText():null), type);
				            }
				        
				setState(96);
				nlines();

				            ((Expr1Context)_localctx).res =  type + " " + (((Expr1Context)_localctx).NAME!=null?((Expr1Context)_localctx).NAME.getText():null) + " = " + ((Expr1Context)_localctx).op.res + ";\n";
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				match(WHILE);
				setState(100);
				match(LROUND);
				setState(101);
				((Expr1Context)_localctx).predicate = predicate();
				setState(102);
				match(RROUND);
				setState(103);
				match(COL);
				setState(104);
				nlines();
				setState(105);
				((Expr1Context)_localctx).whileBody = whileBody(vars);

				            ((Expr1Context)_localctx).res =  "while";
				            _localctx.res += "(";
				            _localctx.res += ((Expr1Context)_localctx).predicate.res;
				            _localctx.res += ")";
				            _localctx.res += "{\n";
				            _localctx.res += ((Expr1Context)_localctx).whileBody.res;
				            _localctx.res += "}\n";
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				match(IF);
				setState(109);
				match(LROUND);
				setState(110);
				((Expr1Context)_localctx).predicate = predicate();
				setState(111);
				match(RROUND);
				setState(112);
				match(COL);
				setState(113);
				nlines();
				setState(114);
				((Expr1Context)_localctx).ifBody = ifBody(vars);
				setState(115);
				((Expr1Context)_localctx).elseBody = elseBody(vars);

				               ((Expr1Context)_localctx).res =  "if";
				               _localctx.res += "(";
				               _localctx.res += ((Expr1Context)_localctx).predicate.res;
				               _localctx.res += ")";
				               _localctx.res += " {\n";
				               _localctx.res += ((Expr1Context)_localctx).ifBody.res;
				               _localctx.res += "}\n";
				               _localctx.res += ((Expr1Context)_localctx).elseBody.res;
				            
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				((Expr1Context)_localctx).res =  "";
				}
				break;
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
	public static class PredicateContext extends ParserRuleContext {
		public String res;
		public OpBoolContext opBool;
		public OpBoolContext opBool() {
			return getRuleContext(OpBoolContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			((PredicateContext)_localctx).opBool = opBool();
			((PredicateContext)_localctx).res =  ((PredicateContext)_localctx).opBool.res;
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
	public static class WhileBodyContext extends ParserRuleContext {
		public HashMap<String, String> vars;
		public String res;
		public Expr1Context expr1;
		public Token BREAK;
		public Token CONTINUE;
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode BREAK() { return getToken(ExprParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(ExprParser.CONTINUE, 0); }
		public WhileBodyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public WhileBodyContext(ParserRuleContext parent, int invokingState, HashMap<String, String> vars) {
			super(parent, invokingState);
			this.vars = vars;
		}
		@Override public int getRuleIndex() { return RULE_whileBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterWhileBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitWhileBody(this);
		}
	}

	public final WhileBodyContext whileBody(HashMap<String, String> vars) throws RecognitionException {
		WhileBodyContext _localctx = new WhileBodyContext(_ctx, getState(), vars);
		enterRule(_localctx, 12, RULE_whileBody);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				((WhileBodyContext)_localctx).expr1 = expr1(vars);
				((WhileBodyContext)_localctx).res =  ((WhileBodyContext)_localctx).expr1.res;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				((WhileBodyContext)_localctx).BREAK = match(BREAK);
				((WhileBodyContext)_localctx).res =  (((WhileBodyContext)_localctx).BREAK!=null?((WhileBodyContext)_localctx).BREAK.getText():null);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				((WhileBodyContext)_localctx).CONTINUE = match(CONTINUE);
				((WhileBodyContext)_localctx).res =  (((WhileBodyContext)_localctx).CONTINUE!=null?((WhileBodyContext)_localctx).CONTINUE.getText():null);
				}
				break;
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
	public static class IfBodyContext extends ParserRuleContext {
		public HashMap<String, String> vars;
		public String res;
		public Expr1Context expr1;
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode BREAK() { return getToken(ExprParser.BREAK, 0); }
		public IfBodyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public IfBodyContext(ParserRuleContext parent, int invokingState, HashMap<String, String> vars) {
			super(parent, invokingState);
			this.vars = vars;
		}
		@Override public int getRuleIndex() { return RULE_ifBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIfBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIfBody(this);
		}
	}

	public final IfBodyContext ifBody(HashMap<String, String> vars) throws RecognitionException {
		IfBodyContext _localctx = new IfBodyContext(_ctx, getState(), vars);
		enterRule(_localctx, 14, RULE_ifBody);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				((IfBodyContext)_localctx).expr1 = expr1(vars);
				((IfBodyContext)_localctx).res =  ((IfBodyContext)_localctx).expr1.res;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(BREAK);
				((IfBodyContext)_localctx).res =  "break\n";
				}
				break;
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
	public static class ElseBodyContext extends ParserRuleContext {
		public HashMap<String, String> vars;
		public String res;
		public ElIfContext elIf;
		public Expr1Context expr1;
		public ElseBodyContext elseBody;
		public TerminalNode ELSE() { return getToken(ExprParser.ELSE, 0); }
		public ElIfContext elIf() {
			return getRuleContext(ElIfContext.class,0);
		}
		public TerminalNode COL() { return getToken(ExprParser.COL, 0); }
		public NlinesContext nlines() {
			return getRuleContext(NlinesContext.class,0);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public ElseBodyContext elseBody() {
			return getRuleContext(ElseBodyContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(ExprParser.BREAK, 0); }
		public ElseBodyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ElseBodyContext(ParserRuleContext parent, int invokingState, HashMap<String, String> vars) {
			super(parent, invokingState);
			this.vars = vars;
		}
		@Override public int getRuleIndex() { return RULE_elseBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterElseBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitElseBody(this);
		}
	}

	public final ElseBodyContext elseBody(HashMap<String, String> vars) throws RecognitionException {
		ElseBodyContext _localctx = new ElseBodyContext(_ctx, getState(), vars);
		enterRule(_localctx, 16, RULE_elseBody);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(ELSE);
				setState(141);
				((ElseBodyContext)_localctx).elIf = elIf(vars);
				setState(142);
				match(COL);
				setState(143);
				nlines();
				setState(144);
				((ElseBodyContext)_localctx).expr1 = expr1(vars);
				setState(145);
				((ElseBodyContext)_localctx).elseBody = elseBody(vars);
				((ElseBodyContext)_localctx).res =  "else" + ((ElseBodyContext)_localctx).elIf.res + "{\n" + ((ElseBodyContext)_localctx).expr1.res + "}\n"
				        + ((ElseBodyContext)_localctx).elseBody.res;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(BREAK);
				((ElseBodyContext)_localctx).res =  "break\n";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				((ElseBodyContext)_localctx).res =  "";
				}
				break;
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
	public static class ElIfContext extends ParserRuleContext {
		public HashMap<String, String> vars;
		public String res;
		public PredicateContext predicate;
		public TerminalNode IF() { return getToken(ExprParser.IF, 0); }
		public TerminalNode LROUND() { return getToken(ExprParser.LROUND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode RROUND() { return getToken(ExprParser.RROUND, 0); }
		public ElIfContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ElIfContext(ParserRuleContext parent, int invokingState, HashMap<String, String> vars) {
			super(parent, invokingState);
			this.vars = vars;
		}
		@Override public int getRuleIndex() { return RULE_elIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterElIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitElIf(this);
		}
	}

	public final ElIfContext elIf(HashMap<String, String> vars) throws RecognitionException {
		ElIfContext _localctx = new ElIfContext(_ctx, getState(), vars);
		enterRule(_localctx, 18, RULE_elIf);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(IF);
				setState(154);
				match(LROUND);
				setState(155);
				((ElIfContext)_localctx).predicate = predicate();
				setState(156);
				match(RROUND);
				((ElIfContext)_localctx).res =  " if(" + ((ElIfContext)_localctx).predicate.res + ")";
				}
				break;
			case COL:
				enterOuterAlt(_localctx, 2);
				{
				((ElIfContext)_localctx).res =  "";
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
	public static class OpBoolContext extends ParserRuleContext {
		public String res;
		public BoolContext bool;
		public OpBoolTContext opBoolT;
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public OpBoolTContext opBoolT() {
			return getRuleContext(OpBoolTContext.class,0);
		}
		public OpBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opBool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOpBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOpBool(this);
		}
	}

	public final OpBoolContext opBool() throws RecognitionException {
		OpBoolContext _localctx = new OpBoolContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_opBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			((OpBoolContext)_localctx).bool = bool();
			setState(163);
			((OpBoolContext)_localctx).opBoolT = opBoolT();
			((OpBoolContext)_localctx).res =  ((OpBoolContext)_localctx).bool.res + ((OpBoolContext)_localctx).opBoolT.res;
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
	public static class OpBoolTContext extends ParserRuleContext {
		public String res;
		public OpBoolContext opBool;
		public TerminalNode AND() { return getToken(ExprParser.AND, 0); }
		public OpBoolContext opBool() {
			return getRuleContext(OpBoolContext.class,0);
		}
		public TerminalNode OR() { return getToken(ExprParser.OR, 0); }
		public OpBoolTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opBoolT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOpBoolT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOpBoolT(this);
		}
	}

	public final OpBoolTContext opBoolT() throws RecognitionException {
		OpBoolTContext _localctx = new OpBoolTContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_opBoolT);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(AND);
				setState(167);
				((OpBoolTContext)_localctx).opBool = opBool();
				((OpBoolTContext)_localctx).res =  " && " + ((OpBoolTContext)_localctx).opBool.res;
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(OR);
				setState(171);
				((OpBoolTContext)_localctx).opBool = opBool();
				((OpBoolTContext)_localctx).res =  " || " + ((OpBoolTContext)_localctx).opBool.res;
				}
				break;
			case RROUND:
				enterOuterAlt(_localctx, 3);
				{
				((OpBoolTContext)_localctx).res =  "";
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
	public static class BoolContext extends ParserRuleContext {
		public String res;
		public Token BOOL;
		public Token NAME;
		public OpContext left;
		public Token BOOLOP;
		public OpContext right;
		public TerminalNode BOOL() { return getToken(ExprParser.BOOL, 0); }
		public TerminalNode NAME() { return getToken(ExprParser.NAME, 0); }
		public TerminalNode BOOLOP() { return getToken(ExprParser.BOOLOP, 0); }
		public List<OpContext> op() {
			return getRuleContexts(OpContext.class);
		}
		public OpContext op(int i) {
			return getRuleContext(OpContext.class,i);
		}
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bool);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				((BoolContext)_localctx).BOOL = match(BOOL);

				        if ((((BoolContext)_localctx).BOOL!=null?((BoolContext)_localctx).BOOL.getText():null).equals("true")){
				            ((BoolContext)_localctx).res =  "1";
				        }
				        else if ((((BoolContext)_localctx).BOOL!=null?((BoolContext)_localctx).BOOL.getText():null).equals("false")){
				            ((BoolContext)_localctx).res =  "0";
				        }
				        else {
				            ((BoolContext)_localctx).res =  "1";
				        }
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				((BoolContext)_localctx).NAME = match(NAME);
				((BoolContext)_localctx).res =  (((BoolContext)_localctx).NAME!=null?((BoolContext)_localctx).NAME.getText():null);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				((BoolContext)_localctx).left = op();
				setState(182);
				((BoolContext)_localctx).BOOLOP = match(BOOLOP);
				setState(183);
				((BoolContext)_localctx).right = op();

				        ((BoolContext)_localctx).res =  ((BoolContext)_localctx).left.res + (((BoolContext)_localctx).BOOLOP!=null?((BoolContext)_localctx).BOOLOP.getText():null) + ((BoolContext)_localctx).right.res;
				    
				}
				break;
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
	public static class OpContext extends ParserRuleContext {
		public String res;
		public String type;
		public Token NUM;
		public OpTContext opT;
		public Token STR;
		public Token NAME;
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public OpTContext opT() {
			return getRuleContext(OpTContext.class,0);
		}
		public TerminalNode STR() { return getToken(ExprParser.STR, 0); }
		public TerminalNode NAME() { return getToken(ExprParser.NAME, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_op);
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				((OpContext)_localctx).NUM = match(NUM);
				setState(189);
				((OpContext)_localctx).opT = opT();

				        ((OpContext)_localctx).res =  (((OpContext)_localctx).NUM!=null?((OpContext)_localctx).NUM.getText():null) + ((OpContext)_localctx).opT.res;
				        ((OpContext)_localctx).type =  "int";
				        
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				((OpContext)_localctx).STR = match(STR);
				setState(193);
				((OpContext)_localctx).opT = opT();

				        ((OpContext)_localctx).res =  (((OpContext)_localctx).STR!=null?((OpContext)_localctx).STR.getText():null) + ((OpContext)_localctx).opT.res;
				        ((OpContext)_localctx).type =  "char*";
				        
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				((OpContext)_localctx).NAME = match(NAME);
				setState(197);
				((OpContext)_localctx).opT = opT();

				        ((OpContext)_localctx).res =  (((OpContext)_localctx).NAME!=null?((OpContext)_localctx).NAME.getText():null) + ((OpContext)_localctx).opT.res;
				        ((OpContext)_localctx).type =  (((OpContext)_localctx).NAME!=null?((OpContext)_localctx).NAME.getText():null);
				        
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
	public static class OpTContext extends ParserRuleContext {
		public String res;
		public Token OP;
		public OpContext op;
		public TerminalNode OP() { return getToken(ExprParser.OP, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public OpTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOpT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOpT(this);
		}
	}

	public final OpTContext opT() throws RecognitionException {
		OpTContext _localctx = new OpTContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_opT);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				((OpTContext)_localctx).OP = match(OP);
				setState(203);
				((OpTContext)_localctx).op = op();
				((OpTContext)_localctx).res =  (((OpTContext)_localctx).OP!=null?((OpTContext)_localctx).OP.getText():null) + ((OpTContext)_localctx).op.res;
				}
				break;
			case EOF:
			case NLINE:
			case RROUND:
			case PRINT:
			case AND:
			case OR:
			case BOOLOP:
			case WHILE:
			case IF:
			case BREAK:
			case ELSE:
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				((OpTContext)_localctx).res =  "";
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
		"\u0004\u0001\u0019\u00d2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002,\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003T\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004x\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0084\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008b"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u0098\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00a1\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00b0\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00bb\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00c9\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00d0\b\u000e\u0001"+
		"\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u0000\u0000\u00d8\u0000\u001e\u0001\u0000"+
		"\u0000\u0000\u0002\"\u0001\u0000\u0000\u0000\u0004+\u0001\u0000\u0000"+
		"\u0000\u0006S\u0001\u0000\u0000\u0000\bw\u0001\u0000\u0000\u0000\ny\u0001"+
		"\u0000\u0000\u0000\f\u0083\u0001\u0000\u0000\u0000\u000e\u008a\u0001\u0000"+
		"\u0000\u0000\u0010\u0097\u0001\u0000\u0000\u0000\u0012\u00a0\u0001\u0000"+
		"\u0000\u0000\u0014\u00a2\u0001\u0000\u0000\u0000\u0016\u00af\u0001\u0000"+
		"\u0000\u0000\u0018\u00ba\u0001\u0000\u0000\u0000\u001a\u00c8\u0001\u0000"+
		"\u0000\u0000\u001c\u00cf\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u0002"+
		"\u0001\u0000\u001f \u0005\u0000\u0000\u0001 !\u0006\u0000\uffff\uffff"+
		"\u0000!\u0001\u0001\u0000\u0000\u0000\"#\u0005\u0002\u0000\u0000#$\u0005"+
		"\u0003\u0000\u0000$%\u0005\u0001\u0000\u0000%&\u0003\u0006\u0003\u0000"+
		"&\'\u0006\u0001\uffff\uffff\u0000\'\u0003\u0001\u0000\u0000\u0000()\u0005"+
		"\u0001\u0000\u0000),\u0003\u0004\u0002\u0000*,\u0001\u0000\u0000\u0000"+
		"+(\u0001\u0000\u0000\u0000+*\u0001\u0000\u0000\u0000,\u0005\u0001\u0000"+
		"\u0000\u0000-.\u0005\t\u0000\u0000./\u0005\u0004\u0000\u0000/0\u0003\u001a"+
		"\r\u000001\u0005\u0005\u0000\u000012\u0003\u0004\u0002\u000023\u0003\u0006"+
		"\u0003\u000034\u0006\u0003\uffff\uffff\u00004T\u0001\u0000\u0000\u0000"+
		"56\u0005\u0018\u0000\u000067\u0005\u000f\u0000\u000078\u0003\u001a\r\u0000"+
		"89\u0006\u0003\uffff\uffff\u00009:\u0003\u0004\u0002\u0000:;\u0003\u0006"+
		"\u0003\u0000;<\u0006\u0003\uffff\uffff\u0000<T\u0001\u0000\u0000\u0000"+
		"=>\u0005\u0010\u0000\u0000>?\u0005\u0004\u0000\u0000?@\u0003\n\u0005\u0000"+
		"@A\u0005\u0005\u0000\u0000AB\u0005\b\u0000\u0000BC\u0003\u0004\u0002\u0000"+
		"CD\u0003\f\u0006\u0000DE\u0003\u0006\u0003\u0000EF\u0006\u0003\uffff\uffff"+
		"\u0000FT\u0001\u0000\u0000\u0000GH\u0005\u0011\u0000\u0000HI\u0005\u0004"+
		"\u0000\u0000IJ\u0003\n\u0005\u0000JK\u0005\u0005\u0000\u0000KL\u0005\b"+
		"\u0000\u0000LM\u0003\u0004\u0002\u0000MN\u0003\u000e\u0007\u0000NO\u0003"+
		"\u0010\b\u0000OP\u0003\u0006\u0003\u0000PQ\u0006\u0003\uffff\uffff\u0000"+
		"QT\u0001\u0000\u0000\u0000RT\u0006\u0003\uffff\uffff\u0000S-\u0001\u0000"+
		"\u0000\u0000S5\u0001\u0000\u0000\u0000S=\u0001\u0000\u0000\u0000SG\u0001"+
		"\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000T\u0007\u0001\u0000\u0000"+
		"\u0000UV\u0005\t\u0000\u0000VW\u0005\u0004\u0000\u0000WX\u0003\u001a\r"+
		"\u0000XY\u0005\u0005\u0000\u0000YZ\u0003\u0004\u0002\u0000Z[\u0006\u0004"+
		"\uffff\uffff\u0000[x\u0001\u0000\u0000\u0000\\]\u0005\u0018\u0000\u0000"+
		"]^\u0005\u000f\u0000\u0000^_\u0003\u001a\r\u0000_`\u0006\u0004\uffff\uffff"+
		"\u0000`a\u0003\u0004\u0002\u0000ab\u0006\u0004\uffff\uffff\u0000bx\u0001"+
		"\u0000\u0000\u0000cd\u0005\u0010\u0000\u0000de\u0005\u0004\u0000\u0000"+
		"ef\u0003\n\u0005\u0000fg\u0005\u0005\u0000\u0000gh\u0005\b\u0000\u0000"+
		"hi\u0003\u0004\u0002\u0000ij\u0003\f\u0006\u0000jk\u0006\u0004\uffff\uffff"+
		"\u0000kx\u0001\u0000\u0000\u0000lm\u0005\u0011\u0000\u0000mn\u0005\u0004"+
		"\u0000\u0000no\u0003\n\u0005\u0000op\u0005\u0005\u0000\u0000pq\u0005\b"+
		"\u0000\u0000qr\u0003\u0004\u0002\u0000rs\u0003\u000e\u0007\u0000st\u0003"+
		"\u0010\b\u0000tu\u0006\u0004\uffff\uffff\u0000ux\u0001\u0000\u0000\u0000"+
		"vx\u0006\u0004\uffff\uffff\u0000wU\u0001\u0000\u0000\u0000w\\\u0001\u0000"+
		"\u0000\u0000wc\u0001\u0000\u0000\u0000wl\u0001\u0000\u0000\u0000wv\u0001"+
		"\u0000\u0000\u0000x\t\u0001\u0000\u0000\u0000yz\u0003\u0014\n\u0000z{"+
		"\u0006\u0005\uffff\uffff\u0000{\u000b\u0001\u0000\u0000\u0000|}\u0003"+
		"\b\u0004\u0000}~\u0006\u0006\uffff\uffff\u0000~\u0084\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0005\u0014\u0000\u0000\u0080\u0084\u0006\u0006\uffff"+
		"\uffff\u0000\u0081\u0082\u0005\u0013\u0000\u0000\u0082\u0084\u0006\u0006"+
		"\uffff\uffff\u0000\u0083|\u0001\u0000\u0000\u0000\u0083\u007f\u0001\u0000"+
		"\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\r\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0003\b\u0004\u0000\u0086\u0087\u0006\u0007\uffff\uffff"+
		"\u0000\u0087\u008b\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0014\u0000"+
		"\u0000\u0089\u008b\u0006\u0007\uffff\uffff\u0000\u008a\u0085\u0001\u0000"+
		"\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u000f\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0005\u0015\u0000\u0000\u008d\u008e\u0003\u0012"+
		"\t\u0000\u008e\u008f\u0005\b\u0000\u0000\u008f\u0090\u0003\u0004\u0002"+
		"\u0000\u0090\u0091\u0003\b\u0004\u0000\u0091\u0092\u0003\u0010\b\u0000"+
		"\u0092\u0093\u0006\b\uffff\uffff\u0000\u0093\u0098\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0005\u0014\u0000\u0000\u0095\u0098\u0006\b\uffff\uffff\u0000"+
		"\u0096\u0098\u0006\b\uffff\uffff\u0000\u0097\u008c\u0001\u0000\u0000\u0000"+
		"\u0097\u0094\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u0011\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u0011\u0000\u0000"+
		"\u009a\u009b\u0005\u0004\u0000\u0000\u009b\u009c\u0003\n\u0005\u0000\u009c"+
		"\u009d\u0005\u0005\u0000\u0000\u009d\u009e\u0006\t\uffff\uffff\u0000\u009e"+
		"\u00a1\u0001\u0000\u0000\u0000\u009f\u00a1\u0006\t\uffff\uffff\u0000\u00a0"+
		"\u0099\u0001\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\u0013\u0001\u0000\u0000\u0000\u00a2\u00a3\u0003\u0018\f\u0000\u00a3\u00a4"+
		"\u0003\u0016\u000b\u0000\u00a4\u00a5\u0006\n\uffff\uffff\u0000\u00a5\u0015"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u000b\u0000\u0000\u00a7\u00a8"+
		"\u0003\u0014\n\u0000\u00a8\u00a9\u0006\u000b\uffff\uffff\u0000\u00a9\u00b0"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\f\u0000\u0000\u00ab\u00ac\u0003"+
		"\u0014\n\u0000\u00ac\u00ad\u0006\u000b\uffff\uffff\u0000\u00ad\u00b0\u0001"+
		"\u0000\u0000\u0000\u00ae\u00b0\u0006\u000b\uffff\uffff\u0000\u00af\u00a6"+
		"\u0001\u0000\u0000\u0000\u00af\u00aa\u0001\u0000\u0000\u0000\u00af\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b0\u0017\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0005\u0016\u0000\u0000\u00b2\u00bb\u0006\f\uffff\uffff\u0000\u00b3\u00b4"+
		"\u0005\u0018\u0000\u0000\u00b4\u00bb\u0006\f\uffff\uffff\u0000\u00b5\u00b6"+
		"\u0003\u001a\r\u0000\u00b6\u00b7\u0005\u000e\u0000\u0000\u00b7\u00b8\u0003"+
		"\u001a\r\u0000\u00b8\u00b9\u0006\f\uffff\uffff\u0000\u00b9\u00bb\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b1\u0001\u0000\u0000\u0000\u00ba\u00b3\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b5\u0001\u0000\u0000\u0000\u00bb\u0019\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0005\u0017\u0000\u0000\u00bd\u00be\u0003"+
		"\u001c\u000e\u0000\u00be\u00bf\u0006\r\uffff\uffff\u0000\u00bf\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0005\u0012\u0000\u0000\u00c1\u00c2\u0003"+
		"\u001c\u000e\u0000\u00c2\u00c3\u0006\r\uffff\uffff\u0000\u00c3\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0005\u0018\u0000\u0000\u00c5\u00c6\u0003"+
		"\u001c\u000e\u0000\u00c6\u00c7\u0006\r\uffff\uffff\u0000\u00c7\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c8\u00bc\u0001\u0000\u0000\u0000\u00c8\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c4\u0001\u0000\u0000\u0000\u00c9\u001b\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0005\r\u0000\u0000\u00cb\u00cc\u0003\u001a"+
		"\r\u0000\u00cc\u00cd\u0006\u000e\uffff\uffff\u0000\u00cd\u00d0\u0001\u0000"+
		"\u0000\u0000\u00ce\u00d0\u0006\u000e\uffff\uffff\u0000\u00cf\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u001d\u0001"+
		"\u0000\u0000\u0000\u000b+Sw\u0083\u008a\u0097\u00a0\u00af\u00ba\u00c8"+
		"\u00cf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}