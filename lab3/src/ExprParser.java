// Generated from java-escape by ANTLR 4.11.1
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
		RULE_s = 0, RULE_main = 1, RULE_nlines = 2, RULE_expr = 3, RULE_predicate = 4, 
		RULE_whileBody = 5, RULE_ifBody = 6, RULE_elseBody = 7, RULE_assign = 8, 
		RULE_opBool = 9, RULE_opBoolT = 10, RULE_bool = 11, RULE_op = 12, RULE_opT = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "main", "nlines", "expr", "predicate", "whileBody", "ifBody", "elseBody", 
			"assign", "opBool", "opBoolT", "bool", "op", "opT"
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

		    StringBuilder sb = new StringBuilder();
		    sb.append("#include <stdio.h> \n");

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			main(sb);
			setState(29);
			match(EOF);
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
		public StringBuilder sb;
		public String res;
		public ExprContext expr;
		public TerminalNode DEF() { return getToken(ExprParser.DEF, 0); }
		public TerminalNode MAIN() { return getToken(ExprParser.MAIN, 0); }
		public TerminalNode NLINE() { return getToken(ExprParser.NLINE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MainContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
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

	public final MainContext main(StringBuilder sb) throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState(), sb);
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(DEF);
			setState(32);
			match(MAIN);
			setState(33);
			match(NLINE);
			setState(34);
			((MainContext)_localctx).expr = expr(sb);

			        sb.append("int main()\n{ \n" + ((MainContext)_localctx).expr.res);
			    
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
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NLINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(NLINE);
				setState(38);
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
		public StringBuilder sb;
		public String res;
		public OpContext op;
		public ExprContext expr;
		public Token NAME;
		public PredicateContext predicate;
		public IfBodyContext ifBody;
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
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
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

	public final ExprContext expr(StringBuilder sb) throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState(), sb);
		enterRule(_localctx, 6, RULE_expr);

		        ArrayList<String> types = new ArrayList<String>;
		    
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(PRINT);
				setState(43);
				match(LROUND);
				setState(44);
				((ExprContext)_localctx).op = op(sb);
				setState(45);
				match(RROUND);
				setState(46);
				nlines();
				setState(47);
				((ExprContext)_localctx).expr = expr(sb);

				        ((ExprContext)_localctx).res =  "printf(";
				        for (int i = 0; i < types.size(); i++){
				            _localctx.res += types.get(i);a
				        }
				        _localctx.res += ((ExprContext)_localctx).op.res;
				        _localctx.res += ");\n";
				        _localctx.res += ((ExprContext)_localctx).expr.res;
				     
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				((ExprContext)_localctx).NAME = match(NAME);
				setState(51);
				match(EQ);
				setState(52);
				((ExprContext)_localctx).op = op(sb);
				setState(53);
				nlines();
				setState(54);
				((ExprContext)_localctx).expr = expr(sb);
				((ExprContext)_localctx).res =  (((ExprContext)_localctx).NAME!=null?((ExprContext)_localctx).NAME.getText():null) + "=" + ((ExprContext)_localctx).op.res + ";\n" + ((ExprContext)_localctx).expr.res;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				match(WHILE);
				setState(58);
				match(LROUND);
				setState(59);
				((ExprContext)_localctx).predicate = predicate(sb);
				setState(60);
				match(RROUND);
				setState(61);
				match(COL);
				setState(62);
				nlines();
				setState(63);
				whileBody(sb);
				setState(64);
				expr(sb);

				                    ((ExprContext)_localctx).res =  "while";
				                    _localctx.res += "(";
				                    _localctx.res += ((ExprContext)_localctx).predicate.res;
				                    _localctx.res += ")";
				                    _localctx.res += ":";
				                    _localctx.res += "\n";
				                
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				match(IF);
				setState(68);
				match(LROUND);
				setState(69);
				((ExprContext)_localctx).predicate = predicate(sb);
				setState(70);
				match(RROUND);
				setState(71);
				match(COL);
				setState(72);
				nlines();
				setState(73);
				((ExprContext)_localctx).ifBody = ifBody(sb);
				setState(74);
				expr(sb);

				               ((ExprContext)_localctx).res =  "if";
				               _localctx.res += "(";
				               _localctx.res += ((ExprContext)_localctx).predicate.res;
				               _localctx.res += ")";
				               _localctx.res += " {\n";
				               _localctx.res += "\n";
				               _localctx.res += ((ExprContext)_localctx).ifBody.res;

				               _localctx.res += "}\n";
				            
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				((ExprContext)_localctx).res =  "";
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
		public StringBuilder sb;
		public String res;
		public OpBoolContext opBool;
		public OpBoolContext opBool() {
			return getRuleContext(OpBoolContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PredicateContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
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

	public final PredicateContext predicate(StringBuilder sb) throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState(), sb);
		enterRule(_localctx, 8, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			((PredicateContext)_localctx).opBool = opBool(sb);
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
		public StringBuilder sb;
		public String res;
		public ExprContext expr;
		public Token BREAK;
		public Token CONTINUE;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(ExprParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(ExprParser.CONTINUE, 0); }
		public WhileBodyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public WhileBodyContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
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

	public final WhileBodyContext whileBody(StringBuilder sb) throws RecognitionException {
		WhileBodyContext _localctx = new WhileBodyContext(_ctx, getState(), sb);
		enterRule(_localctx, 10, RULE_whileBody);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case PRINT:
			case WHILE:
			case IF:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				((WhileBodyContext)_localctx).expr = expr(sb);
				((WhileBodyContext)_localctx).res =  ((WhileBodyContext)_localctx).expr.res;
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				((WhileBodyContext)_localctx).BREAK = match(BREAK);
				((WhileBodyContext)_localctx).res =  (((WhileBodyContext)_localctx).BREAK!=null?((WhileBodyContext)_localctx).BREAK.getText():null);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				((WhileBodyContext)_localctx).CONTINUE = match(CONTINUE);
				((WhileBodyContext)_localctx).res =  (((WhileBodyContext)_localctx).CONTINUE!=null?((WhileBodyContext)_localctx).CONTINUE.getText():null);
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
	public static class IfBodyContext extends ParserRuleContext {
		public StringBuilder sb;
		public String res;
		public ExprContext expr;
		public ElseBodyContext elseBody;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(ExprParser.BREAK, 0); }
		public TerminalNode ELSE() { return getToken(ExprParser.ELSE, 0); }
		public ElseBodyContext elseBody() {
			return getRuleContext(ElseBodyContext.class,0);
		}
		public IfBodyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public IfBodyContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
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

	public final IfBodyContext ifBody(StringBuilder sb) throws RecognitionException {
		IfBodyContext _localctx = new IfBodyContext(_ctx, getState(), sb);
		enterRule(_localctx, 12, RULE_ifBody);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case PRINT:
			case WHILE:
			case IF:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				((IfBodyContext)_localctx).expr = expr(sb);
				((IfBodyContext)_localctx).res =  ((IfBodyContext)_localctx).expr.res;
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(BREAK);
				((IfBodyContext)_localctx).res =  "break\n";
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				match(ELSE);
				setState(98);
				((IfBodyContext)_localctx).elseBody = elseBody(sb);
				((IfBodyContext)_localctx).res =  "{\n ((IfBodyContext)_localctx).elseBody.res + }\n";
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
	public static class ElseBodyContext extends ParserRuleContext {
		public StringBuilder sb;
		public String res;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(ExprParser.BREAK, 0); }
		public ElseBodyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ElseBodyContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
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

	public final ElseBodyContext elseBody(StringBuilder sb) throws RecognitionException {
		ElseBodyContext _localctx = new ElseBodyContext(_ctx, getState(), sb);
		enterRule(_localctx, 14, RULE_elseBody);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case PRINT:
			case WHILE:
			case IF:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				((ElseBodyContext)_localctx).expr = expr(sb);
				((ElseBodyContext)_localctx).res =  ((ElseBodyContext)_localctx).expr.res;
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(BREAK);
				((ElseBodyContext)_localctx).res =  "break\n";
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
	public static class AssignContext extends ParserRuleContext {
		public StringBuilder sb;
		public String res;
		public Token NAME;
		public TerminalNode NAME() { return getToken(ExprParser.NAME, 0); }
		public TerminalNode EQ() { return getToken(ExprParser.EQ, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AssignContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign(StringBuilder sb) throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState(), sb);
		enterRule(_localctx, 16, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			((AssignContext)_localctx).NAME = match(NAME);
			setState(111);
			match(EQ);
			setState(112);
			op(sb);

			        ((AssignContext)_localctx).res =  (((AssignContext)_localctx).NAME!=null?((AssignContext)_localctx).NAME.getText():null) + " = ";
			    
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
		public StringBuilder sb;
		public String res;
		public BoolContext bool;
		public OpBoolTContext opBoolT;
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public OpBoolTContext opBoolT() {
			return getRuleContext(OpBoolTContext.class,0);
		}
		public OpBoolContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public OpBoolContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
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

	public final OpBoolContext opBool(StringBuilder sb) throws RecognitionException {
		OpBoolContext _localctx = new OpBoolContext(_ctx, getState(), sb);
		enterRule(_localctx, 18, RULE_opBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			((OpBoolContext)_localctx).bool = bool(sb);
			setState(116);
			((OpBoolContext)_localctx).opBoolT = opBoolT(sb);
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
		public StringBuilder sb;
		public String res;
		public OpBoolContext opBool;
		public TerminalNode AND() { return getToken(ExprParser.AND, 0); }
		public OpBoolContext opBool() {
			return getRuleContext(OpBoolContext.class,0);
		}
		public TerminalNode OR() { return getToken(ExprParser.OR, 0); }
		public OpBoolTContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public OpBoolTContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
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

	public final OpBoolTContext opBoolT(StringBuilder sb) throws RecognitionException {
		OpBoolTContext _localctx = new OpBoolTContext(_ctx, getState(), sb);
		enterRule(_localctx, 20, RULE_opBoolT);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(AND);
				setState(120);
				((OpBoolTContext)_localctx).opBool = opBool(sb);
				((OpBoolTContext)_localctx).res =  " && " + ((OpBoolTContext)_localctx).opBool.res;
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(OR);
				setState(124);
				((OpBoolTContext)_localctx).opBool = opBool(sb);
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
		public StringBuilder sb;
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
		public BoolContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BoolContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
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

	public final BoolContext bool(StringBuilder sb) throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState(), sb);
		enterRule(_localctx, 22, RULE_bool);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				((BoolContext)_localctx).BOOL = match(BOOL);
				((BoolContext)_localctx).res =  (((BoolContext)_localctx).BOOL!=null?((BoolContext)_localctx).BOOL.getText():null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				((BoolContext)_localctx).NAME = match(NAME);
				((BoolContext)_localctx).res =  (((BoolContext)_localctx).NAME!=null?((BoolContext)_localctx).NAME.getText():null);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				((BoolContext)_localctx).left = op(sb);
				setState(135);
				((BoolContext)_localctx).BOOLOP = match(BOOLOP);
				setState(136);
				((BoolContext)_localctx).right = op(sb);

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
		public StringBuilder sb;
		public String res;
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
		public OpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public OpContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
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

	public final OpContext op(StringBuilder sb) throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState(), sb);
		enterRule(_localctx, 24, RULE_op);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				((OpContext)_localctx).NUM = match(NUM);
				setState(142);
				((OpContext)_localctx).opT = opT(sb);
				((OpContext)_localctx).res =  (((OpContext)_localctx).NUM!=null?((OpContext)_localctx).NUM.getText():null) + ((OpContext)_localctx).opT.res;
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				((OpContext)_localctx).STR = match(STR);
				setState(146);
				((OpContext)_localctx).opT = opT(sb);
				((OpContext)_localctx).res =  (((OpContext)_localctx).STR!=null?((OpContext)_localctx).STR.getText():null) + ((OpContext)_localctx).opT.res;
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				((OpContext)_localctx).NAME = match(NAME);
				setState(150);
				((OpContext)_localctx).opT = opT(sb);
				((OpContext)_localctx).res =  (((OpContext)_localctx).NAME!=null?((OpContext)_localctx).NAME.getText():null) + ((OpContext)_localctx).opT.res;
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
		public StringBuilder sb;
		public String res;
		public Token OP;
		public OpContext op;
		public TerminalNode OP() { return getToken(ExprParser.OP, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public OpTContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public OpTContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
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

	public final OpTContext opT(StringBuilder sb) throws RecognitionException {
		OpTContext _localctx = new OpTContext(_ctx, getState(), sb);
		enterRule(_localctx, 26, RULE_opT);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				((OpTContext)_localctx).OP = match(OP);
				setState(156);
				((OpTContext)_localctx).op = op(sb);
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
		"\u0004\u0001\u0019\u00a3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002)\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003O\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005[\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006f\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007m\b"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0081\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u008c\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u009a\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a1\b\r\u0001\r\u0000\u0000\u000e"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u0000\u0000\u00a5\u0000\u001c\u0001\u0000\u0000\u0000\u0002\u001f\u0001"+
		"\u0000\u0000\u0000\u0004(\u0001\u0000\u0000\u0000\u0006N\u0001\u0000\u0000"+
		"\u0000\bP\u0001\u0000\u0000\u0000\nZ\u0001\u0000\u0000\u0000\fe\u0001"+
		"\u0000\u0000\u0000\u000el\u0001\u0000\u0000\u0000\u0010n\u0001\u0000\u0000"+
		"\u0000\u0012s\u0001\u0000\u0000\u0000\u0014\u0080\u0001\u0000\u0000\u0000"+
		"\u0016\u008b\u0001\u0000\u0000\u0000\u0018\u0099\u0001\u0000\u0000\u0000"+
		"\u001a\u00a0\u0001\u0000\u0000\u0000\u001c\u001d\u0003\u0002\u0001\u0000"+
		"\u001d\u001e\u0005\u0000\u0000\u0001\u001e\u0001\u0001\u0000\u0000\u0000"+
		"\u001f \u0005\u0002\u0000\u0000 !\u0005\u0003\u0000\u0000!\"\u0005\u0001"+
		"\u0000\u0000\"#\u0003\u0006\u0003\u0000#$\u0006\u0001\uffff\uffff\u0000"+
		"$\u0003\u0001\u0000\u0000\u0000%&\u0005\u0001\u0000\u0000&)\u0003\u0004"+
		"\u0002\u0000\')\u0001\u0000\u0000\u0000(%\u0001\u0000\u0000\u0000(\'\u0001"+
		"\u0000\u0000\u0000)\u0005\u0001\u0000\u0000\u0000*+\u0005\t\u0000\u0000"+
		"+,\u0005\u0004\u0000\u0000,-\u0003\u0018\f\u0000-.\u0005\u0005\u0000\u0000"+
		"./\u0003\u0004\u0002\u0000/0\u0003\u0006\u0003\u000001\u0006\u0003\uffff"+
		"\uffff\u00001O\u0001\u0000\u0000\u000023\u0005\u0018\u0000\u000034\u0005"+
		"\u000f\u0000\u000045\u0003\u0018\f\u000056\u0003\u0004\u0002\u000067\u0003"+
		"\u0006\u0003\u000078\u0006\u0003\uffff\uffff\u00008O\u0001\u0000\u0000"+
		"\u00009:\u0005\u0010\u0000\u0000:;\u0005\u0004\u0000\u0000;<\u0003\b\u0004"+
		"\u0000<=\u0005\u0005\u0000\u0000=>\u0005\b\u0000\u0000>?\u0003\u0004\u0002"+
		"\u0000?@\u0003\n\u0005\u0000@A\u0003\u0006\u0003\u0000AB\u0006\u0003\uffff"+
		"\uffff\u0000BO\u0001\u0000\u0000\u0000CD\u0005\u0011\u0000\u0000DE\u0005"+
		"\u0004\u0000\u0000EF\u0003\b\u0004\u0000FG\u0005\u0005\u0000\u0000GH\u0005"+
		"\b\u0000\u0000HI\u0003\u0004\u0002\u0000IJ\u0003\f\u0006\u0000JK\u0003"+
		"\u0006\u0003\u0000KL\u0006\u0003\uffff\uffff\u0000LO\u0001\u0000\u0000"+
		"\u0000MO\u0006\u0003\uffff\uffff\u0000N*\u0001\u0000\u0000\u0000N2\u0001"+
		"\u0000\u0000\u0000N9\u0001\u0000\u0000\u0000NC\u0001\u0000\u0000\u0000"+
		"NM\u0001\u0000\u0000\u0000O\u0007\u0001\u0000\u0000\u0000PQ\u0003\u0012"+
		"\t\u0000QR\u0006\u0004\uffff\uffff\u0000R\t\u0001\u0000\u0000\u0000ST"+
		"\u0003\u0006\u0003\u0000TU\u0006\u0005\uffff\uffff\u0000U[\u0001\u0000"+
		"\u0000\u0000VW\u0005\u0014\u0000\u0000W[\u0006\u0005\uffff\uffff\u0000"+
		"XY\u0005\u0013\u0000\u0000Y[\u0006\u0005\uffff\uffff\u0000ZS\u0001\u0000"+
		"\u0000\u0000ZV\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[\u000b"+
		"\u0001\u0000\u0000\u0000\\]\u0003\u0006\u0003\u0000]^\u0006\u0006\uffff"+
		"\uffff\u0000^f\u0001\u0000\u0000\u0000_`\u0005\u0014\u0000\u0000`f\u0006"+
		"\u0006\uffff\uffff\u0000ab\u0005\u0015\u0000\u0000bc\u0003\u000e\u0007"+
		"\u0000cd\u0006\u0006\uffff\uffff\u0000df\u0001\u0000\u0000\u0000e\\\u0001"+
		"\u0000\u0000\u0000e_\u0001\u0000\u0000\u0000ea\u0001\u0000\u0000\u0000"+
		"f\r\u0001\u0000\u0000\u0000gh\u0003\u0006\u0003\u0000hi\u0006\u0007\uffff"+
		"\uffff\u0000im\u0001\u0000\u0000\u0000jk\u0005\u0014\u0000\u0000km\u0006"+
		"\u0007\uffff\uffff\u0000lg\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000m\u000f\u0001\u0000\u0000\u0000no\u0005\u0018\u0000\u0000op\u0005"+
		"\u000f\u0000\u0000pq\u0003\u0018\f\u0000qr\u0006\b\uffff\uffff\u0000r"+
		"\u0011\u0001\u0000\u0000\u0000st\u0003\u0016\u000b\u0000tu\u0003\u0014"+
		"\n\u0000uv\u0006\t\uffff\uffff\u0000v\u0013\u0001\u0000\u0000\u0000wx"+
		"\u0005\u000b\u0000\u0000xy\u0003\u0012\t\u0000yz\u0006\n\uffff\uffff\u0000"+
		"z\u0081\u0001\u0000\u0000\u0000{|\u0005\f\u0000\u0000|}\u0003\u0012\t"+
		"\u0000}~\u0006\n\uffff\uffff\u0000~\u0081\u0001\u0000\u0000\u0000\u007f"+
		"\u0081\u0006\n\uffff\uffff\u0000\u0080w\u0001\u0000\u0000\u0000\u0080"+
		"{\u0001\u0000\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0015"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0016\u0000\u0000\u0083\u008c"+
		"\u0006\u000b\uffff\uffff\u0000\u0084\u0085\u0005\u0018\u0000\u0000\u0085"+
		"\u008c\u0006\u000b\uffff\uffff\u0000\u0086\u0087\u0003\u0018\f\u0000\u0087"+
		"\u0088\u0005\u000e\u0000\u0000\u0088\u0089\u0003\u0018\f\u0000\u0089\u008a"+
		"\u0006\u000b\uffff\uffff\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b"+
		"\u0082\u0001\u0000\u0000\u0000\u008b\u0084\u0001\u0000\u0000\u0000\u008b"+
		"\u0086\u0001\u0000\u0000\u0000\u008c\u0017\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0005\u0017\u0000\u0000\u008e\u008f\u0003\u001a\r\u0000\u008f\u0090"+
		"\u0006\f\uffff\uffff\u0000\u0090\u009a\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0005\u0012\u0000\u0000\u0092\u0093\u0003\u001a\r\u0000\u0093\u0094\u0006"+
		"\f\uffff\uffff\u0000\u0094\u009a\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		"\u0018\u0000\u0000\u0096\u0097\u0003\u001a\r\u0000\u0097\u0098\u0006\f"+
		"\uffff\uffff\u0000\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u008d\u0001"+
		"\u0000\u0000\u0000\u0099\u0091\u0001\u0000\u0000\u0000\u0099\u0095\u0001"+
		"\u0000\u0000\u0000\u009a\u0019\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"\r\u0000\u0000\u009c\u009d\u0003\u0018\f\u0000\u009d\u009e\u0006\r\uffff"+
		"\uffff\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u00a1\u0006\r\uffff"+
		"\uffff\u0000\u00a0\u009b\u0001\u0000\u0000\u0000\u00a0\u009f\u0001\u0000"+
		"\u0000\u0000\u00a1\u001b\u0001\u0000\u0000\u0000\t(NZel\u0080\u008b\u0099"+
		"\u00a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}