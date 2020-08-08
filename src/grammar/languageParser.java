// Generated from M:/Year_3/CE305/Ass1/src\language.g4 by ANTLR 4.7.2
package grammar;

    import java.util.HashMap;
    import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class languageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LineEnd=1, Assign=2, Open_Bracket=3, Close_Bracket=4, Open_Brace=5, Close_Brace=6, 
		IF=7, ELIF=8, ELSE=9, WHILE=10, PRINT=11, Compile=12, Char=13, Int=14, 
		Float=15, Bool=16, DecInt=17, DecFloat=18, DecBool=19, ET=20, NET=21, 
		GT=22, GTET=23, LT=24, LTET=25, AND=26, OR=27, Sum=28, Subtract=29, Multiply=30, 
		Divide=31, Modulo=32, WS=33;
	public static final int
		RULE_compile_python = 0, RULE_expression = 1, RULE_declaration = 2, RULE_assignment = 3, 
		RULE_print = 4, RULE_while_loop = 5, RULE_if_statement = 6, RULE_variable = 7, 
		RULE_decTypes = 8, RULE_var = 9, RULE_bool = 10, RULE_number = 11, RULE_operation = 12, 
		RULE_add = 13, RULE_multiply = 14, RULE_compare = 15, RULE_gate = 16, 
		RULE_equality = 17, RULE_condition = 18, RULE_compile = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"compile_python", "expression", "declaration", "assignment", "print", 
			"while_loop", "if_statement", "variable", "decTypes", "var", "bool", 
			"number", "operation", "add", "multiply", "compare", "gate", "equality", 
			"condition", "compile"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "')'", "'{'", "'}'", "'IF'", "'ELIF'", "'ELSE'", 
			"'WHILE'", "'PRINT'", "'COMPILE'", null, null, null, null, "'INT'", "'FLOAT'", 
			"'BOOL'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'&'", "'|'", 
			"'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LineEnd", "Assign", "Open_Bracket", "Close_Bracket", "Open_Brace", 
			"Close_Brace", "IF", "ELIF", "ELSE", "WHILE", "PRINT", "Compile", "Char", 
			"Int", "Float", "Bool", "DecInt", "DecFloat", "DecBool", "ET", "NET", 
			"GT", "GTET", "LT", "LTET", "AND", "OR", "Sum", "Subtract", "Multiply", 
			"Divide", "Modulo", "WS"
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
	public String getGrammarFileName() { return "language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    /*varType stores the variable type, using same key as other map*/
	    private HashMap<String, String> variableType = new HashMap<>();
	    private HashMap<String, String> variableValue = new HashMap<>();
	    public ArrayList<String> errors = new ArrayList<>();
	    private int indentLevel = 0;
	    private String tab = "    ";

	    private String tab() {
	        String toReturn = "";
	        for (int i = 0; i < indentLevel; i++) {
	            toReturn += tab;
	        }
	        return toReturn;
	    };

	public languageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Compile_pythonContext extends ParserRuleContext {
		public String python;
		public ExpressionContext a;
		public ExpressionContext b;
		public CompileContext cm;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompileContext compile() {
			return getRuleContext(CompileContext.class,0);
		}
		public Compile_pythonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compile_python; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterCompile_python(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitCompile_python(this);
		}
	}

	public final Compile_pythonContext compile_python() throws RecognitionException {
		Compile_pythonContext _localctx = new Compile_pythonContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compile_python);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(40);
			((Compile_pythonContext)_localctx).a = expression();
			}
			((Compile_pythonContext)_localctx).python =  ((Compile_pythonContext)_localctx).a.python; 
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Open_Bracket) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << Char) | (1L << Int) | (1L << Float) | (1L << Bool) | (1L << DecInt) | (1L << DecFloat) | (1L << DecBool))) != 0)) {
				{
				{
				{
				setState(42);
				((Compile_pythonContext)_localctx).b = expression();
				}
				_localctx.python += ((Compile_pythonContext)_localctx).b.python; 
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Compile) {
				{
				{
				setState(50);
				((Compile_pythonContext)_localctx).cm = compile();
				}
				_localctx.python += ((Compile_pythonContext)_localctx).cm.python; 
				}
			}

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

	public static class ExpressionContext extends ParserRuleContext {
		public String python;
		public DeclarationContext d;
		public AssignmentContext a;
		public OperationContext o;
		public CompareContext c;
		public PrintContext p;
		public If_statementContext i;
		public While_loopContext w;
		public TerminalNode LineEnd() { return getToken(languageParser.LineEnd, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				{
				setState(55);
				((ExpressionContext)_localctx).d = declaration();
				}
				((ExpressionContext)_localctx).python =  ((ExpressionContext)_localctx).d.python; 
				}
				break;
			case 2:
				{
				{
				setState(58);
				((ExpressionContext)_localctx).a = assignment();
				}
				((ExpressionContext)_localctx).python =  ((ExpressionContext)_localctx).a.python; 
				}
				break;
			case 3:
				{
				{
				setState(61);
				((ExpressionContext)_localctx).o = operation();
				}
				setState(62);
				match(LineEnd);
				((ExpressionContext)_localctx).python =  ((ExpressionContext)_localctx).o.python; 
				}
				break;
			case 4:
				{
				{
				setState(65);
				((ExpressionContext)_localctx).c = compare();
				}
				setState(66);
				match(LineEnd);
				((ExpressionContext)_localctx).python =  ((ExpressionContext)_localctx).c.python; 
				}
				break;
			case 5:
				{
				{
				setState(69);
				((ExpressionContext)_localctx).p = print();
				}
				((ExpressionContext)_localctx).python =  ((ExpressionContext)_localctx).p.python; 
				}
				break;
			case 6:
				{
				{
				setState(72);
				((ExpressionContext)_localctx).i = if_statement();
				}
				((ExpressionContext)_localctx).python =  ((ExpressionContext)_localctx).i.python;
				}
				break;
			case 7:
				{
				{
				setState(75);
				((ExpressionContext)_localctx).w = while_loop();
				}
				((ExpressionContext)_localctx).python =  ((ExpressionContext)_localctx).w.python; 
				}
				break;
			}
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

	public static class DeclarationContext extends ParserRuleContext {
		public String python;
		public DecTypesContext t;
		public Token c;
		public VariableContext v;
		public TerminalNode LineEnd() { return getToken(languageParser.LineEnd, 0); }
		public DecTypesContext decTypes() {
			return getRuleContext(DecTypesContext.class,0);
		}
		public TerminalNode Assign() { return getToken(languageParser.Assign, 0); }
		public TerminalNode Char() { return getToken(languageParser.Char, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(80);
			((DeclarationContext)_localctx).t = decTypes();
			}
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				{
				{
				setState(81);
				((DeclarationContext)_localctx).c = match(Char);
				}
				setState(82);
				match(Assign);
				((DeclarationContext)_localctx).python =  (((DeclarationContext)_localctx).c!=null?((DeclarationContext)_localctx).c.getText():null) + " = "; 
				{
				setState(84);
				((DeclarationContext)_localctx).v = variable();
				}
				try {
				                            variableType.put((((DeclarationContext)_localctx).c!=null?((DeclarationContext)_localctx).c.getText():null), ((DeclarationContext)_localctx).v.type);
				                            variableValue.put((((DeclarationContext)_localctx).c!=null?((DeclarationContext)_localctx).c.getText():null), ((DeclarationContext)_localctx).v.value);
				                            _localctx.python += ((DeclarationContext)_localctx).v.python + "\n";
				                         } catch (NullPointerException e) {
				                            errors.add("Undeclared Variable Error - An undeclared variable was called.");
				                            ((DeclarationContext)_localctx).python =  "None";
				                            return _localctx;
				                         };
				                        
				}
				setState(87);
				match(LineEnd);
				}
				break;
			case 2:
				{
				{
				setState(89);
				((DeclarationContext)_localctx).c = match(Char);
				}
				setState(90);
				match(LineEnd);
				variableType.put((((DeclarationContext)_localctx).c!=null?((DeclarationContext)_localctx).c.getText():null), ((DeclarationContext)_localctx).t.value);
				                                /* Python vars have to be assigned something */
				                                ((DeclarationContext)_localctx).python =  (((DeclarationContext)_localctx).c!=null?((DeclarationContext)_localctx).c.getText():null) + " = None\n";
				                               
				}
				break;
			}
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

	public static class AssignmentContext extends ParserRuleContext {
		public String python;
		public Token c;
		public VariableContext v;
		public TerminalNode Assign() { return getToken(languageParser.Assign, 0); }
		public TerminalNode LineEnd() { return getToken(languageParser.LineEnd, 0); }
		public TerminalNode Char() { return getToken(languageParser.Char, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(94);
			((AssignmentContext)_localctx).c = match(Char);
			}
			setState(95);
			match(Assign);
			((AssignmentContext)_localctx).python =  ""; 
			{
			setState(97);
			((AssignmentContext)_localctx).v = variable();
			}
			try {
			                            String type = variableType.get((((AssignmentContext)_localctx).c!=null?((AssignmentContext)_localctx).c.getText():null));
			                            if (type.equals("BOOL") & !((AssignmentContext)_localctx).v.type.equals("BOOL")) {
			                                errors.add("Type Error - Tried to assign a value to a variable of a different type.");
			                                ((AssignmentContext)_localctx).python =  "None";
			                                return _localctx;
			                            }
			                            variableType.put((((AssignmentContext)_localctx).c!=null?((AssignmentContext)_localctx).c.getText():null), ((AssignmentContext)_localctx).v.type);
			                            variableValue.put((((AssignmentContext)_localctx).c!=null?((AssignmentContext)_localctx).c.getText():null), ((AssignmentContext)_localctx).v.value);
			                            _localctx.python += (((AssignmentContext)_localctx).c!=null?((AssignmentContext)_localctx).c.getText():null) + " = " + ((AssignmentContext)_localctx).v.python + "\n";
			                        } catch (NullPointerException e) {
			                            errors.add("Undeclared Variable Error - An undeclared variable was called");
			                            ((AssignmentContext)_localctx).python =  "None";
			                            return _localctx;
			                        };
			                        
			setState(99);
			match(LineEnd);
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

	public static class PrintContext extends ParserRuleContext {
		public String python;
		public VariableContext v;
		public TerminalNode PRINT() { return getToken(languageParser.PRINT, 0); }
		public TerminalNode Open_Bracket() { return getToken(languageParser.Open_Bracket, 0); }
		public TerminalNode Close_Bracket() { return getToken(languageParser.Close_Bracket, 0); }
		public TerminalNode LineEnd() { return getToken(languageParser.LineEnd, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(PRINT);
			setState(102);
			match(Open_Bracket);
			{
			setState(103);
			((PrintContext)_localctx).v = variable();
			}
			setState(104);
			match(Close_Bracket);
			setState(105);
			match(LineEnd);
			((PrintContext)_localctx).python =  "print (" + ((PrintContext)_localctx).v.python + ")\n";
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

	public static class While_loopContext extends ParserRuleContext {
		public String python;
		public BoolContext c;
		public ExpressionContext e;
		public TerminalNode WHILE() { return getToken(languageParser.WHILE, 0); }
		public TerminalNode Open_Brace() { return getToken(languageParser.Open_Brace, 0); }
		public TerminalNode Close_Brace() { return getToken(languageParser.Close_Brace, 0); }
		public TerminalNode LineEnd() { return getToken(languageParser.LineEnd, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitWhile_loop(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(WHILE);
			{
			setState(109);
			((While_loopContext)_localctx).c = bool();
			}
			setState(110);
			match(Open_Brace);
			((While_loopContext)_localctx).python =  "while " + ((While_loopContext)_localctx).c.python + ":\n";
			                                         indentLevel += 1;
			                                        
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Open_Bracket) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << Char) | (1L << Int) | (1L << Float) | (1L << Bool) | (1L << DecInt) | (1L << DecFloat) | (1L << DecBool))) != 0)) {
				{
				{
				{
				setState(112);
				((While_loopContext)_localctx).e = expression();
				}
				_localctx.python += tab() + ((While_loopContext)_localctx).e.python; 
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(Close_Brace);
			setState(121);
			match(LineEnd);
			indentLevel -= 1;
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

	public static class If_statementContext extends ParserRuleContext {
		public String python;
		public BoolContext ac;
		public ExpressionContext ae;
		public BoolContext bc;
		public ExpressionContext be;
		public ExpressionContext ce;
		public TerminalNode IF() { return getToken(languageParser.IF, 0); }
		public List<TerminalNode> Open_Brace() { return getTokens(languageParser.Open_Brace); }
		public TerminalNode Open_Brace(int i) {
			return getToken(languageParser.Open_Brace, i);
		}
		public List<TerminalNode> Close_Brace() { return getTokens(languageParser.Close_Brace); }
		public TerminalNode Close_Brace(int i) {
			return getToken(languageParser.Close_Brace, i);
		}
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(languageParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(languageParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(languageParser.ELSE, 0); }
		public TerminalNode LineEnd() { return getToken(languageParser.LineEnd, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(IF);
			{
			setState(125);
			((If_statementContext)_localctx).ac = bool();
			}
			setState(126);
			match(Open_Brace);
			((If_statementContext)_localctx).python =  "if " + ((If_statementContext)_localctx).ac.python + ":\n";
			                                       indentLevel += 1;
			                                      
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Open_Bracket) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << Char) | (1L << Int) | (1L << Float) | (1L << Bool) | (1L << DecInt) | (1L << DecFloat) | (1L << DecBool))) != 0)) {
				{
				{
				{
				setState(128);
				((If_statementContext)_localctx).ae = expression();
				}
				_localctx.python += tab() + ((If_statementContext)_localctx).ae.python + "\n"; 
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(Close_Brace);
			indentLevel -= 1;
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(138);
				match(ELIF);
				{
				setState(139);
				((If_statementContext)_localctx).bc = bool();
				}
				setState(140);
				match(Open_Brace);
				_localctx.python += tab() + "elif (" + ((If_statementContext)_localctx).bc.python + "):\n";
				                                        indentLevel += 1;
				                                       
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Open_Bracket) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << Char) | (1L << Int) | (1L << Float) | (1L << Bool) | (1L << DecInt) | (1L << DecFloat) | (1L << DecBool))) != 0)) {
					{
					{
					{
					setState(142);
					((If_statementContext)_localctx).be = expression();
					}
					_localctx.python += tab() + ((If_statementContext)_localctx).be.python; 
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				match(Close_Brace);
				indentLevel -= 1;
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(158);
				match(ELSE);
				setState(159);
				match(Open_Brace);
				_localctx.python += tab() + "else:\n";
				                             indentLevel += 1;
				                            
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Open_Bracket) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << Char) | (1L << Int) | (1L << Float) | (1L << Bool) | (1L << DecInt) | (1L << DecFloat) | (1L << DecBool))) != 0)) {
					{
					{
					{
					setState(161);
					((If_statementContext)_localctx).ce = expression();
					}
					_localctx.python += tab() + ((If_statementContext)_localctx).ce.python; 
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(Close_Brace);
				indentLevel -= 1;
				setState(171);
				match(LineEnd);
				_localctx.python += "\n"; 
				}
			}

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

	public static class VariableContext extends ParserRuleContext {
		public String type;
		public String value;
		public String python;
		public VarContext v;
		public NumberContext n;
		public BoolContext b;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(175);
				((VariableContext)_localctx).v = var();
				}
				try {
				                            ((VariableContext)_localctx).type =  variableType.get(((VariableContext)_localctx).v.name);
				                            ((VariableContext)_localctx).value =  variableValue.get(((VariableContext)_localctx).v.name);
				                            ((VariableContext)_localctx).python =  ((VariableContext)_localctx).v.name;
				                         } catch (NullPointerException e) {
				                            errors.add("Variable Declaration Error - variable '((VariableContext)_localctx).v.name' was called but has not been declared.");
				                            ((VariableContext)_localctx).type =  "BOOL";
				                            ((VariableContext)_localctx).value =  "False";
				                            ((VariableContext)_localctx).python =  "None";
				                            return _localctx;
				                         };
				                         
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(178);
				((VariableContext)_localctx).n = number();
				}
				((VariableContext)_localctx).type =  ((VariableContext)_localctx).n.type;
				                           ((VariableContext)_localctx).value =  String.valueOf(((VariableContext)_localctx).n.value);
				                           ((VariableContext)_localctx).python =  ((VariableContext)_localctx).n.python;
				                          
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(181);
				((VariableContext)_localctx).b = bool();
				}
				((VariableContext)_localctx).type =  "BOOL";
				                         ((VariableContext)_localctx).value =  String.valueOf(((VariableContext)_localctx).b.value);
				                         ((VariableContext)_localctx).python =  ((VariableContext)_localctx).b.python;
				                        
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

	public static class DecTypesContext extends ParserRuleContext {
		public String value;
		public TerminalNode DecInt() { return getToken(languageParser.DecInt, 0); }
		public TerminalNode DecFloat() { return getToken(languageParser.DecFloat, 0); }
		public TerminalNode DecBool() { return getToken(languageParser.DecBool, 0); }
		public DecTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterDecTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitDecTypes(this);
		}
	}

	public final DecTypesContext decTypes() throws RecognitionException {
		DecTypesContext _localctx = new DecTypesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_decTypes);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DecInt:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(DecInt);
				((DecTypesContext)_localctx).value =  "INT"; 
				}
				break;
			case DecFloat:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(DecFloat);
				((DecTypesContext)_localctx).value =  "FLOAT"; 
				}
				break;
			case DecBool:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(DecBool);
				((DecTypesContext)_localctx).value =  "BOOL"; 
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

	public static class VarContext extends ParserRuleContext {
		public String name;
		public Token c;
		public List<TerminalNode> Char() { return getTokens(languageParser.Char); }
		public TerminalNode Char(int i) {
			return getToken(languageParser.Char, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(195); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(194);
				((VarContext)_localctx).c = match(Char);
				}
				}
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Char );
			}
			((VarContext)_localctx).name =  (((VarContext)_localctx).c!=null?((VarContext)_localctx).c.getText():null); 
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

	public static class BoolContext extends ParserRuleContext {
		public boolean value;
		public String python;
		public Token b;
		public CompareContext c;
		public EqualityContext e;
		public TerminalNode Bool() { return getToken(languageParser.Bool, 0); }
		public TerminalNode Open_Bracket() { return getToken(languageParser.Open_Bracket, 0); }
		public TerminalNode Close_Bracket() { return getToken(languageParser.Close_Bracket, 0); }
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bool);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(201);
				((BoolContext)_localctx).b = match(Bool);
				}
				 ((BoolContext)_localctx).value =  Boolean.parseBoolean((((BoolContext)_localctx).b!=null?((BoolContext)_localctx).b.getText():null));
				                         ((BoolContext)_localctx).python =  (((BoolContext)_localctx).b!=null?((BoolContext)_localctx).b.getText():null);
				                       
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(Open_Bracket);
				{
				setState(204);
				((BoolContext)_localctx).c = compare();
				}
				setState(205);
				match(Close_Bracket);
				 ((BoolContext)_localctx).value =  ((BoolContext)_localctx).c.value;
				                                                       ((BoolContext)_localctx).python =  "(" + ((BoolContext)_localctx).c.python + ")";
				                                                     
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				match(Open_Bracket);
				{
				setState(209);
				((BoolContext)_localctx).e = equality();
				}
				setState(210);
				match(Close_Bracket);
				((BoolContext)_localctx).value =  ((BoolContext)_localctx).e.value;
				                                                       ((BoolContext)_localctx).python =  "(" + ((BoolContext)_localctx).e.python + ")";
				                                                      
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

	public static class NumberContext extends ParserRuleContext {
		public String type;
		public double value;
		public String python;
		public Token f;
		public Token i;
		public OperationContext o;
		public TerminalNode Float() { return getToken(languageParser.Float, 0); }
		public TerminalNode Int() { return getToken(languageParser.Int, 0); }
		public TerminalNode Open_Bracket() { return getToken(languageParser.Open_Bracket, 0); }
		public TerminalNode Close_Bracket() { return getToken(languageParser.Close_Bracket, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_number);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Float:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(215);
				((NumberContext)_localctx).f = match(Float);
				}
				((NumberContext)_localctx).type =  "FLOAT";
				                         ((NumberContext)_localctx).value =  Double.parseDouble((((NumberContext)_localctx).f!=null?((NumberContext)_localctx).f.getText():null));
				                         ((NumberContext)_localctx).python =  (((NumberContext)_localctx).f!=null?((NumberContext)_localctx).f.getText():null);
				                        
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(217);
				((NumberContext)_localctx).i = match(Int);
				}
				((NumberContext)_localctx).type =  "INT";
				                       ((NumberContext)_localctx).value =  Double.parseDouble((((NumberContext)_localctx).i!=null?((NumberContext)_localctx).i.getText():null));
				                       ((NumberContext)_localctx).python =  ((((NumberContext)_localctx).i!=null?((NumberContext)_localctx).i.getText():null));
				                      
				}
				break;
			case Open_Bracket:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(Open_Bracket);
				{
				setState(220);
				((NumberContext)_localctx).o = operation();
				}
				setState(221);
				match(Close_Bracket);
				((NumberContext)_localctx).type =  "FLOAT";
				                                                        ((NumberContext)_localctx).value =  ((NumberContext)_localctx).o.value;
				                                                        ((NumberContext)_localctx).python =  "(" + ((NumberContext)_localctx).o.python + ")" ;
				                                                       
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

	public static class OperationContext extends ParserRuleContext {
		public double value;
		public String python;
		public MultiplyContext m;
		public AddContext a;
		public MultiplyContext multiply() {
			return getRuleContext(MultiplyContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operation);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(226);
				((OperationContext)_localctx).m = multiply();
				}
				((OperationContext)_localctx).value =  ((OperationContext)_localctx).m.value;
				                            ((OperationContext)_localctx).python =  ((OperationContext)_localctx).m.python;
				                           
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(229);
				((OperationContext)_localctx).a = add();
				}
				((OperationContext)_localctx).value =  ((OperationContext)_localctx).a.value;
				                       ((OperationContext)_localctx).python =  ((OperationContext)_localctx).a.python;
				                      
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

	public static class AddContext extends ParserRuleContext {
		public String type;
		public double value;
		public String python;
		public MultiplyContext a;
		public MultiplyContext b;
		public List<MultiplyContext> multiply() {
			return getRuleContexts(MultiplyContext.class);
		}
		public MultiplyContext multiply(int i) {
			return getRuleContext(MultiplyContext.class,i);
		}
		public List<TerminalNode> Sum() { return getTokens(languageParser.Sum); }
		public TerminalNode Sum(int i) {
			return getToken(languageParser.Sum, i);
		}
		public List<TerminalNode> Subtract() { return getTokens(languageParser.Subtract); }
		public TerminalNode Subtract(int i) {
			return getToken(languageParser.Subtract, i);
		}
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitAdd(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(234);
			((AddContext)_localctx).a = multiply();
			}
			/*Add / Subtract takes type, will convert from int to float if required*/
			                            ((AddContext)_localctx).python =  ((AddContext)_localctx).a.python;
			                            ((AddContext)_localctx).type =  ((AddContext)_localctx).a.type;
			                            if (((AddContext)_localctx).a.type.equals("INT")) {
			                                ((AddContext)_localctx).value =  (int)Math.round(((AddContext)_localctx).a.value);
			                            } else if (((AddContext)_localctx).a.type.equals("FLOAT")) {
			                                ((AddContext)_localctx).value =  ((AddContext)_localctx).a.value;
			                            } else {
			                                errors.add("Type Error - Invalid Variable-Type used in Add/Subtract Operation");
			                                ((AddContext)_localctx).value =  0;
			                                ((AddContext)_localctx).type =  "FLOAT";
			                                ((AddContext)_localctx).python =  "None";
			                                return _localctx;
			                            }
			                           
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Sum || _la==Subtract) {
				{
				setState(244);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Sum:
					{
					setState(236);
					match(Sum);
					{
					setState(237);
					((AddContext)_localctx).b = multiply();
					}
					if (_localctx.type.equals("INT") & ((AddContext)_localctx).b.type.equals("FLOAT")) {
					                                   ((AddContext)_localctx).type =  "FLOAT";
					                               }
					                               if (((AddContext)_localctx).b.type.equals("INT")) {
					                                   _localctx.value += (int)Math.round(((AddContext)_localctx).b.value);
					                                   _localctx.python += " + " + ((AddContext)_localctx).b.python;
					                               } else if (((AddContext)_localctx).b.type.equals("FLOAT")) {
					                                   _localctx.value += ((AddContext)_localctx).b.value;
					                                   _localctx.python += " + " + ((AddContext)_localctx).b.python;
					                               } else {
					                                   errors.add("Type Error - Invalid Variable-Type used in Add/Subtract Operation");
					                                   ((AddContext)_localctx).value =  0;
					                                   ((AddContext)_localctx).type =  "FLOAT";
					                                   ((AddContext)_localctx).python =  "None";
					                                   return _localctx;
					                               };
					                              
					}
					break;
				case Subtract:
					{
					setState(240);
					match(Subtract);
					{
					setState(241);
					((AddContext)_localctx).b = multiply();
					}
					if (_localctx.type.equals("INT") & ((AddContext)_localctx).b.type.equals("FLOAT")) {
					                                        ((AddContext)_localctx).type =  "FLOAT";
					                                    }
					                                    if (((AddContext)_localctx).b.type.equals("INT")) {
					                                        _localctx.value -= (int)Math.round(((AddContext)_localctx).b.value);
					                                        _localctx.python += " - " + ((AddContext)_localctx).b.python;
					                                    } else if (((AddContext)_localctx).b.type.equals("FLOAT")) {
					                                        _localctx.value -= ((AddContext)_localctx).b.value;
					                                        _localctx.python += " - " + ((AddContext)_localctx).b.python;
					                                    } else {
					                                        errors.add("Type Error - Invalid Variable-Type used in Add/Subtract Operation");
					                                        ((AddContext)_localctx).value =  0;
					                                        ((AddContext)_localctx).type =  "FLOAT";
					                                        ((AddContext)_localctx).python =  "None";
					                                        return _localctx;
					                                    };
					                                   
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class MultiplyContext extends ParserRuleContext {
		public String type;
		public double value;
		public String python;
		public VariableContext a;
		public VariableContext v;
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> Multiply() { return getTokens(languageParser.Multiply); }
		public TerminalNode Multiply(int i) {
			return getToken(languageParser.Multiply, i);
		}
		public List<TerminalNode> Divide() { return getTokens(languageParser.Divide); }
		public TerminalNode Divide(int i) {
			return getToken(languageParser.Divide, i);
		}
		public List<TerminalNode> Modulo() { return getTokens(languageParser.Modulo); }
		public TerminalNode Modulo(int i) {
			return getToken(languageParser.Modulo, i);
		}
		public MultiplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitMultiply(this);
		}
	}

	public final MultiplyContext multiply() throws RecognitionException {
		MultiplyContext _localctx = new MultiplyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_multiply);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(249);
			((MultiplyContext)_localctx).a = variable();
			}
			/*Multiply/Divide takes type, will convert from int to float if required*/
			                            ((MultiplyContext)_localctx).python =  ((MultiplyContext)_localctx).a.python;
			                            ((MultiplyContext)_localctx).type =  ((MultiplyContext)_localctx).a.type;
			                            try {
			                                if (((MultiplyContext)_localctx).a.type.equals("INT")) {
			                                  ((MultiplyContext)_localctx).value =  (int)Math.round(Double.parseDouble(((MultiplyContext)_localctx).a.value));
			                                } else if (((MultiplyContext)_localctx).a.type.equals("FLOAT")) {
			                                   ((MultiplyContext)_localctx).value =  Double.parseDouble(((MultiplyContext)_localctx).a.value);
			                                } else {
			                                 errors.add("Type Error - Invalid Variable-Type used in Add/Subtract Operation");
			                                 ((MultiplyContext)_localctx).value =  0;
			                                 ((MultiplyContext)_localctx).type =  "FLOAT";
			                                 return _localctx;
			                                }
			                            } catch (NullPointerException e) {
			                                errors.add("NullPointerException - Unrecognized variable. You may have made a spelling error.");
			                            };
			                           
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulo))) != 0)) {
				{
				setState(263);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Multiply:
					{
					setState(251);
					match(Multiply);
					{
					setState(252);
					((MultiplyContext)_localctx).v = variable();
					}
					if (_localctx.type.equals("INT") & ((MultiplyContext)_localctx).v.type.equals("FLOAT")) {
					                                        ((MultiplyContext)_localctx).type =  "FLOAT";
					                                    }
					                                    if (((MultiplyContext)_localctx).v.type.equals("INT")) {
					                                        _localctx.value *= Math.round(Double.parseDouble(((MultiplyContext)_localctx).v.value));
					                                        _localctx.python += " * " + ((MultiplyContext)_localctx).v.python;
					                                    } else if (((MultiplyContext)_localctx).v.type.equals("FLOAT")) {
					                                        _localctx.value *= Double.parseDouble(((MultiplyContext)_localctx).v.value);
					                                        _localctx.python += " * " + ((MultiplyContext)_localctx).v.python;
					                                    } else {
					                                        errors.add("Type Error - Invalid Variable-Type used in Multiply Operation");
					                                        ((MultiplyContext)_localctx).value =  0;
					                                        ((MultiplyContext)_localctx).type =  "FLOAT";
					                                        return _localctx;
					                                    };
					                                   
					}
					break;
				case Divide:
					{
					setState(255);
					match(Divide);
					{
					setState(256);
					((MultiplyContext)_localctx).v = variable();
					}
					/*Division always converts to double to avoid rounding errors*/
					                                    if (_localctx.type.equals("INT")) {
					                                        ((MultiplyContext)_localctx).type =  "FLOAT";
					                                    }
					                                    if (((MultiplyContext)_localctx).v.type.equals("INT")|((MultiplyContext)_localctx).v.type.equals("FLOAT")) {
					                                        _localctx.value /= Double.parseDouble(((MultiplyContext)_localctx).v.value);
					                                        _localctx.python += " / " + ((MultiplyContext)_localctx).v.python;
					                                    } else {
					                                        errors.add("Type Error - Invalid Variable-Type used in Multiply Operation");
					                                        ((MultiplyContext)_localctx).value =  0;
					                                        ((MultiplyContext)_localctx).type =  "FLOAT";
					                                        return _localctx;
					                                    };
					                                   
					}
					break;
				case Modulo:
					{
					setState(259);
					match(Modulo);
					{
					setState(260);
					((MultiplyContext)_localctx).v = variable();
					}
					/*Modulo always produces an int*/
					                                    if (_localctx.type.equals("INT") & ((MultiplyContext)_localctx).v.type.equals("FLOAT")) {
					                                        ((MultiplyContext)_localctx).type =  "FLOAT";
					                                    }
					                                    if (((MultiplyContext)_localctx).v.type.equals("INT")|((MultiplyContext)_localctx).v.type.equals("FLOAT")) {
					                                        ((MultiplyContext)_localctx).value =  _localctx.value % Double.parseDouble(((MultiplyContext)_localctx).v.value);
					                                        _localctx.python += " % " + ((MultiplyContext)_localctx).v.python;
					                                    } else {
					                                        errors.add("Type Errors - Invalid Variable-Type used in Modulo Operation");
					                                        ((MultiplyContext)_localctx).value =  0;
					                                        ((MultiplyContext)_localctx).type =  "FLOAT";
					                                        return _localctx;
					                                    };
					                                   
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class CompareContext extends ParserRuleContext {
		public boolean value;
		public String python;
		public ConditionContext c;
		public GateContext g;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public GateContext gate() {
			return getRuleContext(GateContext.class,0);
		}
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitCompare(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_compare);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(268);
				((CompareContext)_localctx).c = condition();
				}
				((CompareContext)_localctx).value =  ((CompareContext)_localctx).c.value;
				                             ((CompareContext)_localctx).python =  ((CompareContext)_localctx).c.python;
				                            
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(271);
				((CompareContext)_localctx).g = gate();
				}
				((CompareContext)_localctx).value =  ((CompareContext)_localctx).g.value;
				                        ((CompareContext)_localctx).python =  ((CompareContext)_localctx).g.python;
				                       
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

	public static class GateContext extends ParserRuleContext {
		public boolean value;
		public String python;
		public BoolContext a;
		public BoolContext b;
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(languageParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(languageParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(languageParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(languageParser.OR, i);
		}
		public GateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterGate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitGate(this);
		}
	}

	public final GateContext gate() throws RecognitionException {
		GateContext _localctx = new GateContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_gate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(276);
			((GateContext)_localctx).a = bool();
			}
			((GateContext)_localctx).value =  ((GateContext)_localctx).a.value;
			                             ((GateContext)_localctx).python =  ((GateContext)_localctx).a.python;
			                            
			setState(286); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(286);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AND:
					{
					setState(278);
					match(AND);
					{
					setState(279);
					((GateContext)_localctx).b = bool();
					}
					((GateContext)_localctx).value =  (_localctx.value & ((GateContext)_localctx).b.value);
					                                 _localctx.python += " & " + ((GateContext)_localctx).b.python;
					                                
					}
					break;
				case OR:
					{
					setState(282);
					match(OR);
					{
					setState(283);
					((GateContext)_localctx).b = bool();
					}
					((GateContext)_localctx).value =  (_localctx.value | ((GateContext)_localctx).b.value);
					                                _localctx.python += " | " + ((GateContext)_localctx).b.python;
					                               
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(288); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AND || _la==OR );
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

	public static class EqualityContext extends ParserRuleContext {
		public boolean value;
		public String python;
		public VariableContext a;
		public VariableContext b;
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> ET() { return getTokens(languageParser.ET); }
		public TerminalNode ET(int i) {
			return getToken(languageParser.ET, i);
		}
		public List<TerminalNode> NET() { return getTokens(languageParser.NET); }
		public TerminalNode NET(int i) {
			return getToken(languageParser.NET, i);
		}
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitEquality(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		EqualityContext _localctx = new EqualityContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_equality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(290);
			((EqualityContext)_localctx).a = variable();
			}
			String previous = ((EqualityContext)_localctx).a.value;
			                            ((EqualityContext)_localctx).python =  ((EqualityContext)_localctx).a.python;
			                            if (((EqualityContext)_localctx).a.type.equals("BOOL")) {
			                                ((EqualityContext)_localctx).value =  Boolean.parseBoolean(((EqualityContext)_localctx).a.value);
			                            } else {
			                                ((EqualityContext)_localctx).value =  true;
			                            };
			                           
			setState(300); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(300);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ET:
					{
					setState(292);
					match(ET);
					{
					setState(293);
					((EqualityContext)_localctx).b = variable();
					}
					((EqualityContext)_localctx).value =  previous.equals(((EqualityContext)_localctx).b.value);
					                               _localctx.python += " == " + ((EqualityContext)_localctx).b.python;
					                              
					}
					break;
				case NET:
					{
					setState(296);
					match(NET);
					{
					setState(297);
					((EqualityContext)_localctx).b = variable();
					}
					((EqualityContext)_localctx).value =  !previous.equals(((EqualityContext)_localctx).b.value);
					                                _localctx.python += " != " + ((EqualityContext)_localctx).b.python;
					                               
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(302); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ET || _la==NET );
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

	public static class ConditionContext extends ParserRuleContext {
		public boolean value;
		public String python;
		public VariableContext a;
		public VariableContext b;
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> GT() { return getTokens(languageParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(languageParser.GT, i);
		}
		public List<TerminalNode> LT() { return getTokens(languageParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(languageParser.LT, i);
		}
		public List<TerminalNode> GTET() { return getTokens(languageParser.GTET); }
		public TerminalNode GTET(int i) {
			return getToken(languageParser.GTET, i);
		}
		public List<TerminalNode> LTET() { return getTokens(languageParser.LTET); }
		public TerminalNode LTET(int i) {
			return getToken(languageParser.LTET, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(304);
			((ConditionContext)_localctx).a = variable();
			}
			/* Keep previously compared value to compare to next */
			                            ((ConditionContext)_localctx).python =  ((ConditionContext)_localctx).a.python;
			                            double previous;
			                            if (((ConditionContext)_localctx).a.type.equals("BOOL")) {
			                                errors.add("Type Error - Booleans cannot be compared");
			                                ((ConditionContext)_localctx).value =  Boolean.parseBoolean(((ConditionContext)_localctx).a.value);
			                                return _localctx;
			                            } else {
			                                /* Numbers are by default converted to true*/
			                                previous = Double.parseDouble(((ConditionContext)_localctx).a.value);
			                                ((ConditionContext)_localctx).value =  true;
			                            };
			                           
			setState(322); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(322);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GT:
					{
					setState(306);
					match(GT);
					{
					setState(307);
					((ConditionContext)_localctx).b = variable();
					}
					if (((ConditionContext)_localctx).a.type.equals("BOOL")) {
					                                    errors.add("Type Error - Booleans cannot be compared in '>' operations");
					                                    ((ConditionContext)_localctx).value =  false;
					                                    ((ConditionContext)_localctx).python =  "None";
					                                    return _localctx;
					                               } else {
					                                    ((ConditionContext)_localctx).value =  (previous > Double.parseDouble(((ConditionContext)_localctx).b.value));
					                                    _localctx.python += " > " + ((ConditionContext)_localctx).b.python;
					                               };
					                              
					}
					break;
				case LT:
					{
					setState(310);
					match(LT);
					{
					setState(311);
					((ConditionContext)_localctx).b = variable();
					}
					if (((ConditionContext)_localctx).a.type.equals("BOOL")) {
					                                    errors.add("Type Error - Booleans cannot be compared in '<' operations");
					                                    ((ConditionContext)_localctx).value =  false;
					                                    ((ConditionContext)_localctx).python =  "None";
					                                    return _localctx;
					                                } else {
					                                    ((ConditionContext)_localctx).value =  (previous < Double.parseDouble(((ConditionContext)_localctx).b.value));
					                                    _localctx.python += " < " + ((ConditionContext)_localctx).b.python;
					                                };
					                               
					}
					break;
				case GTET:
					{
					setState(314);
					match(GTET);
					{
					setState(315);
					((ConditionContext)_localctx).b = variable();
					}
					if (((ConditionContext)_localctx).a.type.equals("BOOL")) {
					                                    errors.add("Type Error - Booleans cannot be compared in '<=' operations");
					                                     ((ConditionContext)_localctx).value =  false;
					                                     ((ConditionContext)_localctx).python =  "None";
					                                     return _localctx;
					                                 } else {
					                                     ((ConditionContext)_localctx).value =  (previous <= Double.parseDouble(((ConditionContext)_localctx).b.value));
					                                     _localctx.python += " >= " + ((ConditionContext)_localctx).b.python;
					                                 };
					                                
					}
					break;
				case LTET:
					{
					setState(318);
					match(LTET);
					{
					setState(319);
					((ConditionContext)_localctx).b = variable();
					}
					if (((ConditionContext)_localctx).a.type.equals("BOOL")) {
					                                        errors.add("Type Error - Booleans cannot be compared in '>=' operations");
					                                        ((ConditionContext)_localctx).value =  false;
					                                        ((ConditionContext)_localctx).python =  "None";
					                                        return _localctx;
					                                  } else {
					                                        ((ConditionContext)_localctx).value =  (previous >= Double.parseDouble(((ConditionContext)_localctx).b.value));
					                                        _localctx.python += " <= " + ((ConditionContext)_localctx).b.python;
					                                  };
					                                 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(324); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GTET) | (1L << LT) | (1L << LTET))) != 0) );
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

	public static class CompileContext extends ParserRuleContext {
		public String python;
		public TerminalNode Compile() { return getToken(languageParser.Compile, 0); }
		public CompileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterCompile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitCompile(this);
		}
	}

	public final CompileContext compile() throws RecognitionException {
		CompileContext _localctx = new CompileContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_compile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(Compile);
			((CompileContext)_localctx).python =  ""; 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u014c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\7\2\60\n\2\f\2\16\2"+
		"\63\13\2\3\2\3\2\3\2\5\28\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3Q\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4_\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7v"+
		"\n\7\f\7\16\7y\13\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0086"+
		"\n\b\f\b\16\b\u0089\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0094"+
		"\n\b\f\b\16\b\u0097\13\b\3\b\3\b\3\b\7\b\u009c\n\b\f\b\16\b\u009f\13\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00a7\n\b\f\b\16\b\u00aa\13\b\3\b\3\b\3\b"+
		"\3\b\5\b\u00b0\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00bb\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c3\n\n\3\13\6\13\u00c6\n\13\r\13\16\13\u00c7"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d8\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e3\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00eb\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u00f7\n\17\f\17\16\17\u00fa\13\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u010a\n\20\f\20"+
		"\16\20\u010d\13\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0115\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\6\22\u0121\n\22\r\22\16"+
		"\22\u0122\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\6\23\u012f"+
		"\n\23\r\23\16\23\u0130\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\6\24\u0145\n\24\r\24\16\24"+
		"\u0146\3\25\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(\2\2\2\u015e\2*\3\2\2\2\4P\3\2\2\2\6R\3\2\2\2\b`\3\2\2\2\ng\3"+
		"\2\2\2\fn\3\2\2\2\16~\3\2\2\2\20\u00ba\3\2\2\2\22\u00c2\3\2\2\2\24\u00c5"+
		"\3\2\2\2\26\u00d7\3\2\2\2\30\u00e2\3\2\2\2\32\u00ea\3\2\2\2\34\u00ec\3"+
		"\2\2\2\36\u00fb\3\2\2\2 \u0114\3\2\2\2\"\u0116\3\2\2\2$\u0124\3\2\2\2"+
		"&\u0132\3\2\2\2(\u0148\3\2\2\2*+\5\4\3\2+\61\b\2\1\2,-\5\4\3\2-.\b\2\1"+
		"\2.\60\3\2\2\2/,\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\67"+
		"\3\2\2\2\63\61\3\2\2\2\64\65\5(\25\2\65\66\b\2\1\2\668\3\2\2\2\67\64\3"+
		"\2\2\2\678\3\2\2\28\3\3\2\2\29:\5\6\4\2:;\b\3\1\2;Q\3\2\2\2<=\5\b\5\2"+
		"=>\b\3\1\2>Q\3\2\2\2?@\5\32\16\2@A\7\3\2\2AB\b\3\1\2BQ\3\2\2\2CD\5 \21"+
		"\2DE\7\3\2\2EF\b\3\1\2FQ\3\2\2\2GH\5\n\6\2HI\b\3\1\2IQ\3\2\2\2JK\5\16"+
		"\b\2KL\b\3\1\2LQ\3\2\2\2MN\5\f\7\2NO\b\3\1\2OQ\3\2\2\2P9\3\2\2\2P<\3\2"+
		"\2\2P?\3\2\2\2PC\3\2\2\2PG\3\2\2\2PJ\3\2\2\2PM\3\2\2\2Q\5\3\2\2\2R^\5"+
		"\22\n\2ST\7\17\2\2TU\7\4\2\2UV\b\4\1\2VW\5\20\t\2WX\b\4\1\2XY\3\2\2\2"+
		"YZ\7\3\2\2Z_\3\2\2\2[\\\7\17\2\2\\]\7\3\2\2]_\b\4\1\2^S\3\2\2\2^[\3\2"+
		"\2\2_\7\3\2\2\2`a\7\17\2\2ab\7\4\2\2bc\b\5\1\2cd\5\20\t\2de\b\5\1\2ef"+
		"\7\3\2\2f\t\3\2\2\2gh\7\r\2\2hi\7\5\2\2ij\5\20\t\2jk\7\6\2\2kl\7\3\2\2"+
		"lm\b\6\1\2m\13\3\2\2\2no\7\f\2\2op\5\26\f\2pq\7\7\2\2qw\b\7\1\2rs\5\4"+
		"\3\2st\b\7\1\2tv\3\2\2\2ur\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2"+
		"\2\2yw\3\2\2\2z{\7\b\2\2{|\7\3\2\2|}\b\7\1\2}\r\3\2\2\2~\177\7\t\2\2\177"+
		"\u0080\5\26\f\2\u0080\u0081\7\7\2\2\u0081\u0087\b\b\1\2\u0082\u0083\5"+
		"\4\3\2\u0083\u0084\b\b\1\2\u0084\u0086\3\2\2\2\u0085\u0082\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\b\2\2\u008b\u009d\b\b\1\2\u008c"+
		"\u008d\7\n\2\2\u008d\u008e\5\26\f\2\u008e\u008f\7\7\2\2\u008f\u0095\b"+
		"\b\1\2\u0090\u0091\5\4\3\2\u0091\u0092\b\b\1\2\u0092\u0094\3\2\2\2\u0093"+
		"\u0090\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\b\2\2\u0099"+
		"\u009a\b\b\1\2\u009a\u009c\3\2\2\2\u009b\u008c\3\2\2\2\u009c\u009f\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00af\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a1\7\13\2\2\u00a1\u00a2\7\7\2\2\u00a2\u00a8\b"+
		"\b\1\2\u00a3\u00a4\5\4\3\2\u00a4\u00a5\b\b\1\2\u00a5\u00a7\3\2\2\2\u00a6"+
		"\u00a3\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\b\2\2\u00ac"+
		"\u00ad\b\b\1\2\u00ad\u00ae\7\3\2\2\u00ae\u00b0\b\b\1\2\u00af\u00a0\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\17\3\2\2\2\u00b1\u00b2\5\24\13\2\u00b2"+
		"\u00b3\b\t\1\2\u00b3\u00bb\3\2\2\2\u00b4\u00b5\5\30\r\2\u00b5\u00b6\b"+
		"\t\1\2\u00b6\u00bb\3\2\2\2\u00b7\u00b8\5\26\f\2\u00b8\u00b9\b\t\1\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00b4\3\2\2\2\u00ba\u00b7\3\2"+
		"\2\2\u00bb\21\3\2\2\2\u00bc\u00bd\7\23\2\2\u00bd\u00c3\b\n\1\2\u00be\u00bf"+
		"\7\24\2\2\u00bf\u00c3\b\n\1\2\u00c0\u00c1\7\25\2\2\u00c1\u00c3\b\n\1\2"+
		"\u00c2\u00bc\3\2\2\2\u00c2\u00be\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\23"+
		"\3\2\2\2\u00c4\u00c6\7\17\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2"+
		"\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca"+
		"\b\13\1\2\u00ca\25\3\2\2\2\u00cb\u00cc\7\22\2\2\u00cc\u00d8\b\f\1\2\u00cd"+
		"\u00ce\7\5\2\2\u00ce\u00cf\5 \21\2\u00cf\u00d0\7\6\2\2\u00d0\u00d1\b\f"+
		"\1\2\u00d1\u00d8\3\2\2\2\u00d2\u00d3\7\5\2\2\u00d3\u00d4\5$\23\2\u00d4"+
		"\u00d5\7\6\2\2\u00d5\u00d6\b\f\1\2\u00d6\u00d8\3\2\2\2\u00d7\u00cb\3\2"+
		"\2\2\u00d7\u00cd\3\2\2\2\u00d7\u00d2\3\2\2\2\u00d8\27\3\2\2\2\u00d9\u00da"+
		"\7\21\2\2\u00da\u00e3\b\r\1\2\u00db\u00dc\7\20\2\2\u00dc\u00e3\b\r\1\2"+
		"\u00dd\u00de\7\5\2\2\u00de\u00df\5\32\16\2\u00df\u00e0\7\6\2\2\u00e0\u00e1"+
		"\b\r\1\2\u00e1\u00e3\3\2\2\2\u00e2\u00d9\3\2\2\2\u00e2\u00db\3\2\2\2\u00e2"+
		"\u00dd\3\2\2\2\u00e3\31\3\2\2\2\u00e4\u00e5\5\36\20\2\u00e5\u00e6\b\16"+
		"\1\2\u00e6\u00eb\3\2\2\2\u00e7\u00e8\5\34\17\2\u00e8\u00e9\b\16\1\2\u00e9"+
		"\u00eb\3\2\2\2\u00ea\u00e4\3\2\2\2\u00ea\u00e7\3\2\2\2\u00eb\33\3\2\2"+
		"\2\u00ec\u00ed\5\36\20\2\u00ed\u00f8\b\17\1\2\u00ee\u00ef\7\36\2\2\u00ef"+
		"\u00f0\5\36\20\2\u00f0\u00f1\b\17\1\2\u00f1\u00f7\3\2\2\2\u00f2\u00f3"+
		"\7\37\2\2\u00f3\u00f4\5\36\20\2\u00f4\u00f5\b\17\1\2\u00f5\u00f7\3\2\2"+
		"\2\u00f6\u00ee\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6"+
		"\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\35\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u00fc\5\20\t\2\u00fc\u010b\b\20\1\2\u00fd\u00fe\7 \2\2\u00fe\u00ff\5"+
		"\20\t\2\u00ff\u0100\b\20\1\2\u0100\u010a\3\2\2\2\u0101\u0102\7!\2\2\u0102"+
		"\u0103\5\20\t\2\u0103\u0104\b\20\1\2\u0104\u010a\3\2\2\2\u0105\u0106\7"+
		"\"\2\2\u0106\u0107\5\20\t\2\u0107\u0108\b\20\1\2\u0108\u010a\3\2\2\2\u0109"+
		"\u00fd\3\2\2\2\u0109\u0101\3\2\2\2\u0109\u0105\3\2\2\2\u010a\u010d\3\2"+
		"\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\37\3\2\2\2\u010d\u010b"+
		"\3\2\2\2\u010e\u010f\5&\24\2\u010f\u0110\b\21\1\2\u0110\u0115\3\2\2\2"+
		"\u0111\u0112\5\"\22\2\u0112\u0113\b\21\1\2\u0113\u0115\3\2\2\2\u0114\u010e"+
		"\3\2\2\2\u0114\u0111\3\2\2\2\u0115!\3\2\2\2\u0116\u0117\5\26\f\2\u0117"+
		"\u0120\b\22\1\2\u0118\u0119\7\34\2\2\u0119\u011a\5\26\f\2\u011a\u011b"+
		"\b\22\1\2\u011b\u0121\3\2\2\2\u011c\u011d\7\35\2\2\u011d\u011e\5\26\f"+
		"\2\u011e\u011f\b\22\1\2\u011f\u0121\3\2\2\2\u0120\u0118\3\2\2\2\u0120"+
		"\u011c\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123#\3\2\2\2\u0124\u0125\5\20\t\2\u0125\u012e\b\23\1\2\u0126\u0127"+
		"\7\26\2\2\u0127\u0128\5\20\t\2\u0128\u0129\b\23\1\2\u0129\u012f\3\2\2"+
		"\2\u012a\u012b\7\27\2\2\u012b\u012c\5\20\t\2\u012c\u012d\b\23\1\2\u012d"+
		"\u012f\3\2\2\2\u012e\u0126\3\2\2\2\u012e\u012a\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131%\3\2\2\2\u0132\u0133"+
		"\5\20\t\2\u0133\u0144\b\24\1\2\u0134\u0135\7\30\2\2\u0135\u0136\5\20\t"+
		"\2\u0136\u0137\b\24\1\2\u0137\u0145\3\2\2\2\u0138\u0139\7\32\2\2\u0139"+
		"\u013a\5\20\t\2\u013a\u013b\b\24\1\2\u013b\u0145\3\2\2\2\u013c\u013d\7"+
		"\31\2\2\u013d\u013e\5\20\t\2\u013e\u013f\b\24\1\2\u013f\u0145\3\2\2\2"+
		"\u0140\u0141\7\33\2\2\u0141\u0142\5\20\t\2\u0142\u0143\b\24\1\2\u0143"+
		"\u0145\3\2\2\2\u0144\u0134\3\2\2\2\u0144\u0138\3\2\2\2\u0144\u013c\3\2"+
		"\2\2\u0144\u0140\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\'\3\2\2\2\u0148\u0149\7\16\2\2\u0149\u014a\b\25\1"+
		"\2\u014a)\3\2\2\2\35\61\67P^w\u0087\u0095\u009d\u00a8\u00af\u00ba\u00c2"+
		"\u00c7\u00d7\u00e2\u00ea\u00f6\u00f8\u0109\u010b\u0114\u0120\u0122\u012e"+
		"\u0130\u0144\u0146";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}