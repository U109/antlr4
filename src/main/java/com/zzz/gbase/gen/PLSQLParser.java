// Generated from F:/antlr/src/main/java/com/zzz/gbase\PLSQL.g4 by ANTLR 4.12.0
package com.zzz.gbase.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PLSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		K_AS=1, K_CREATE=2, K_COMMIT=3, K_DEFAULT=4, K_DELETE=5, K_END=6, K_IS=7, 
		K_NOT=8, K_NULL=9, K_OR=10, K_PROCEDURE=11, K_REPLACE=12, K_ROWTYPE=13, 
		K_ROLLBACK=14, K_TYPE=15, K_FOR=16, K_WHILE=17, K_LOOP=18, K_TRUE=19, 
		K_FALSE=20, K_BETWEEN=21, K_AND=22, K_IN=23, K_INSERT=24, K_OUT=25, K_LIKE=26, 
		K_SQL=27, K_FOUND=28, K_ISOPEN=29, K_NOTFOUND=30, K_ROWCOUNT=31, K_CASE=32, 
		K_WHEN=33, K_THEN=34, K_ELSE=35, K_RETURN=36, K_BY=37, K_SELECT=38, K_CURSOR=39, 
		K_CLOSE=40, K_CONTINUE=41, K_UPDATE=42, K_INTO=43, K_EXIT=44, K_FETCH=45, 
		K_REVERSE=46, K_OF=47, K_GOTO=48, K_IF=49, K_ELSIF=50, K_OPEN=51, K_RAISE=52, 
		K_BEGIN=53, K_CONSTANT=54, K_VARCHAR2=55, K_CHAR=56, K_NUMBER=57, K_INT=58, 
		K_INTEGER=59, K_BOOLEAN=60, K_DATE=61, K_TIMESTAMP=62, K_EXECUTE=63, K_IMMEDIATE=64, 
		K_FROM=65, K_ROWID=66, K_MERGE=67, K_RECORD=68, K_CURRENT_DATE=69, K_SYSDATE=70, 
		K_SYSTIMESTAMP=71, K_TABLE=72, K_INDEX=73, K_PLS_INTEGER=74, K_BINARY_INTEGER=75, 
		K_VARCHAR=76, K_STRING=77, K_LONG=78, K_REF=79, K_EXCEPTION=80, K_OTHERS=81, 
		K_SQLCODE=82, K_SQLERRM=83, K_USER=84, K_PRAGMA=85, K_EXCEPTION_INIT=86, 
		K_BLOB=87, K_CLOB=88, K_DECLARE=89, LPAREN=90, RPAREN=91, LBRACKETS=92, 
		RBRACKETS=93, COMMA=94, SEMI=95, DOUBLE_COLON=96, COLON=97, PERCENT=98, 
		DOUBLE_DOT=99, DOT=100, ASSIGN=101, PLUS=102, MINUS=103, DOUBLE_STAR=104, 
		STAR=105, DIV=106, DOUBLE_G=107, DOUBLE_L=108, GE=109, LE=110, NOT_EQUAL=111, 
		GT=112, LT=113, EQUAL=114, DOUBLE_PIPE=115, ID=116, LITERAL_NUMBER=117, 
		PLS_INTEGER=118, DOUBLE_QUOTED_STRING=119, SINGLE_QUOTE_STRING=120, Q_ESCAPE_STRING=121, 
		SINGLE_COMMENT=122, MULTI_COMMENT=123, WS=124;
	public static final int
		RULE_plsql_file = 0, RULE_create_procedure = 1, RULE_schema = 2, RULE_procedure_name = 3, 
		RULE_parameter_declaration = 4, RULE_parameter_name = 5, RULE_parameter = 6, 
		RULE_declare_section = 7, RULE_item_list = 8, RULE_item_declaration = 9, 
		RULE_type_definition = 10, RULE_exception_declaration = 11, RULE_pragma = 12, 
		RULE_exception_init_pragma = 13, RULE_error_code = 14, RULE_cursor_declaration = 15, 
		RULE_cursor_definition = 16, RULE_cursor_parameter_dec = 17, RULE_rowtype = 18, 
		RULE_record_type_definition = 19, RULE_ref_cursor_type_definition = 20, 
		RULE_cursor_type = 21, RULE_collection_type_definition = 22, RULE_assoc_array_type_def = 23, 
		RULE_field_definition = 24, RULE_record_type = 25, RULE_constant_declaration = 26, 
		RULE_body = 27, RULE_exception_handler = 28, RULE_while_loop_statement = 29, 
		RULE_expression = 30, RULE_unaryOp = 31, RULE_cursor_attribute = 32, RULE_cursor_attribute_name = 33, 
		RULE_builtin_constant = 34, RULE_case_expression = 35, RULE_binaryOperators = 36, 
		RULE_variable_or_dbobj = 37, RULE_boolean_expression = 38, RULE_boolean_literal = 39, 
		RULE_function_call = 40, RULE_index = 41, RULE_character_expression = 42, 
		RULE_character_subexpression = 43, RULE_character_function_call = 44, 
		RULE_character_literal = 45, RULE_date_literal = 46, RULE_numeric_expression = 47, 
		RULE_numeric_subexpression = 48, RULE_numeric_function_call = 49, RULE_numeric_literal = 50, 
		RULE_searched_case_expression = 51, RULE_result = 52, RULE_simple_case_expression = 53, 
		RULE_selector = 54, RULE_selector_value = 55, RULE_literal = 56, RULE_select_clause = 57, 
		RULE_from_clause = 58, RULE_condition = 59, RULE_inCondition = 60, RULE_relationOperator = 61, 
		RULE_columnExpression = 62, RULE_statement = 63, RULE_assignment_statement = 64, 
		RULE_assignment_statement_target = 65, RULE_collection_index = 66, RULE_basic_loop_statement = 67, 
		RULE_case_statement = 68, RULE_simple_case_statement = 69, RULE_searched_case_statement = 70, 
		RULE_close_statement = 71, RULE_continue_statement = 72, RULE_execute_immediate_statement = 73, 
		RULE_plsql_block = 74, RULE_dynamic_sql_stmt = 75, RULE_into_clause = 76, 
		RULE_exit_statement = 77, RULE_fetch_statement = 78, RULE_for_loop_statement = 79, 
		RULE_cursor_for_loop_statement = 80, RULE_lower_bound = 81, RULE_upper_bound = 82, 
		RULE_goto_statement = 83, RULE_if_statement = 84, RULE_null_statement = 85, 
		RULE_open_for_statement = 86, RULE_open_statement = 87, RULE_dynamic_select = 88, 
		RULE_procedure_call = 89, RULE_variable_declaration = 90, RULE_variable = 91, 
		RULE_datatype = 92, RULE_user_define_type = 93, RULE_raise_statement = 94, 
		RULE_return_statement = 95, RULE_select_into_statement = 96, RULE_table_reference = 97, 
		RULE_subquery = 98, RULE_sql_statement = 99, RULE_commit_statement = 100, 
		RULE_rollback_statement = 101, RULE_delete_statement = 102, RULE_insert_statement = 103, 
		RULE_update_statement = 104, RULE_merge_statement = 105, RULE_function = 106, 
		RULE_cursor = 107, RULE_cursor_variable = 108, RULE_record = 109, RULE_field = 110, 
		RULE_db_table_or_view = 111, RULE_collection_type = 112, RULE_constant = 113, 
		RULE_exception_ = 114, RULE_procedure = 115, RULE_collection_variable = 116, 
		RULE_name = 117, RULE_label = 118, RULE_scalar_datatype = 119, RULE_type_attribute = 120, 
		RULE_rowtype_attribute = 121, RULE_size = 122, RULE_character_variable = 123, 
		RULE_column = 124, RULE_numeric_variable = 125, RULE_select_statement = 126;
	private static String[] makeRuleNames() {
		return new String[] {
			"plsql_file", "create_procedure", "schema", "procedure_name", "parameter_declaration", 
			"parameter_name", "parameter", "declare_section", "item_list", "item_declaration", 
			"type_definition", "exception_declaration", "pragma", "exception_init_pragma", 
			"error_code", "cursor_declaration", "cursor_definition", "cursor_parameter_dec", 
			"rowtype", "record_type_definition", "ref_cursor_type_definition", "cursor_type", 
			"collection_type_definition", "assoc_array_type_def", "field_definition", 
			"record_type", "constant_declaration", "body", "exception_handler", "while_loop_statement", 
			"expression", "unaryOp", "cursor_attribute", "cursor_attribute_name", 
			"builtin_constant", "case_expression", "binaryOperators", "variable_or_dbobj", 
			"boolean_expression", "boolean_literal", "function_call", "index", "character_expression", 
			"character_subexpression", "character_function_call", "character_literal", 
			"date_literal", "numeric_expression", "numeric_subexpression", "numeric_function_call", 
			"numeric_literal", "searched_case_expression", "result", "simple_case_expression", 
			"selector", "selector_value", "literal", "select_clause", "from_clause", 
			"condition", "inCondition", "relationOperator", "columnExpression", "statement", 
			"assignment_statement", "assignment_statement_target", "collection_index", 
			"basic_loop_statement", "case_statement", "simple_case_statement", "searched_case_statement", 
			"close_statement", "continue_statement", "execute_immediate_statement", 
			"plsql_block", "dynamic_sql_stmt", "into_clause", "exit_statement", "fetch_statement", 
			"for_loop_statement", "cursor_for_loop_statement", "lower_bound", "upper_bound", 
			"goto_statement", "if_statement", "null_statement", "open_for_statement", 
			"open_statement", "dynamic_select", "procedure_call", "variable_declaration", 
			"variable", "datatype", "user_define_type", "raise_statement", "return_statement", 
			"select_into_statement", "table_reference", "subquery", "sql_statement", 
			"commit_statement", "rollback_statement", "delete_statement", "insert_statement", 
			"update_statement", "merge_statement", "function", "cursor", "cursor_variable", 
			"record", "field", "db_table_or_view", "collection_type", "constant", 
			"exception_", "procedure", "collection_variable", "name", "label", "scalar_datatype", 
			"type_attribute", "rowtype_attribute", "size", "character_variable", 
			"column", "numeric_variable", "select_statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'('", "')'", "'['", "']'", "','", 
			"';'", "'::'", "':'", "'%'", "'..'", "'.'", "':='", "'+'", "'-'", "'**'", 
			"'*'", "'/'", "'>>'", "'<<'", "'>='", "'<='", null, "'>'", "'<'", "'='", 
			"'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "K_AS", "K_CREATE", "K_COMMIT", "K_DEFAULT", "K_DELETE", "K_END", 
			"K_IS", "K_NOT", "K_NULL", "K_OR", "K_PROCEDURE", "K_REPLACE", "K_ROWTYPE", 
			"K_ROLLBACK", "K_TYPE", "K_FOR", "K_WHILE", "K_LOOP", "K_TRUE", "K_FALSE", 
			"K_BETWEEN", "K_AND", "K_IN", "K_INSERT", "K_OUT", "K_LIKE", "K_SQL", 
			"K_FOUND", "K_ISOPEN", "K_NOTFOUND", "K_ROWCOUNT", "K_CASE", "K_WHEN", 
			"K_THEN", "K_ELSE", "K_RETURN", "K_BY", "K_SELECT", "K_CURSOR", "K_CLOSE", 
			"K_CONTINUE", "K_UPDATE", "K_INTO", "K_EXIT", "K_FETCH", "K_REVERSE", 
			"K_OF", "K_GOTO", "K_IF", "K_ELSIF", "K_OPEN", "K_RAISE", "K_BEGIN", 
			"K_CONSTANT", "K_VARCHAR2", "K_CHAR", "K_NUMBER", "K_INT", "K_INTEGER", 
			"K_BOOLEAN", "K_DATE", "K_TIMESTAMP", "K_EXECUTE", "K_IMMEDIATE", "K_FROM", 
			"K_ROWID", "K_MERGE", "K_RECORD", "K_CURRENT_DATE", "K_SYSDATE", "K_SYSTIMESTAMP", 
			"K_TABLE", "K_INDEX", "K_PLS_INTEGER", "K_BINARY_INTEGER", "K_VARCHAR", 
			"K_STRING", "K_LONG", "K_REF", "K_EXCEPTION", "K_OTHERS", "K_SQLCODE", 
			"K_SQLERRM", "K_USER", "K_PRAGMA", "K_EXCEPTION_INIT", "K_BLOB", "K_CLOB", 
			"K_DECLARE", "LPAREN", "RPAREN", "LBRACKETS", "RBRACKETS", "COMMA", "SEMI", 
			"DOUBLE_COLON", "COLON", "PERCENT", "DOUBLE_DOT", "DOT", "ASSIGN", "PLUS", 
			"MINUS", "DOUBLE_STAR", "STAR", "DIV", "DOUBLE_G", "DOUBLE_L", "GE", 
			"LE", "NOT_EQUAL", "GT", "LT", "EQUAL", "DOUBLE_PIPE", "ID", "LITERAL_NUMBER", 
			"PLS_INTEGER", "DOUBLE_QUOTED_STRING", "SINGLE_QUOTE_STRING", "Q_ESCAPE_STRING", 
			"SINGLE_COMMENT", "MULTI_COMMENT", "WS"
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
	public String getGrammarFileName() { return "PLSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PLSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Plsql_fileContext extends ParserRuleContext {
		public List<Create_procedureContext> create_procedure() {
			return getRuleContexts(Create_procedureContext.class);
		}
		public Create_procedureContext create_procedure(int i) {
			return getRuleContext(Create_procedureContext.class,i);
		}
		public List<TerminalNode> DIV() { return getTokens(PLSQLParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(PLSQLParser.DIV, i);
		}
		public Plsql_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plsql_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterPlsql_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitPlsql_file(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitPlsql_file(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Plsql_fileContext plsql_file() throws RecognitionException {
		Plsql_fileContext _localctx = new Plsql_fileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_plsql_file);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			create_procedure();
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(255);
					match(DIV);
					setState(256);
					create_procedure();
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIV) {
				{
				setState(262);
				match(DIV);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Create_procedureContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(PLSQLParser.K_CREATE, 0); }
		public TerminalNode K_PROCEDURE() { return getToken(PLSQLParser.K_PROCEDURE, 0); }
		public Procedure_nameContext procedure_name() {
			return getRuleContext(Procedure_nameContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode K_IS() { return getToken(PLSQLParser.K_IS, 0); }
		public TerminalNode K_AS() { return getToken(PLSQLParser.K_AS, 0); }
		public TerminalNode K_OR() { return getToken(PLSQLParser.K_OR, 0); }
		public TerminalNode K_REPLACE() { return getToken(PLSQLParser.K_REPLACE, 0); }
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PLSQLParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public List<Parameter_declarationContext> parameter_declaration() {
			return getRuleContexts(Parameter_declarationContext.class);
		}
		public Parameter_declarationContext parameter_declaration(int i) {
			return getRuleContext(Parameter_declarationContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public Declare_sectionContext declare_section() {
			return getRuleContext(Declare_sectionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PLSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PLSQLParser.COMMA, i);
		}
		public Create_procedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterCreate_procedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitCreate_procedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitCreate_procedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_procedureContext create_procedure() throws RecognitionException {
		Create_procedureContext _localctx = new Create_procedureContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_create_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(K_CREATE);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OR) {
				{
				setState(266);
				match(K_OR);
				setState(267);
				match(K_REPLACE);
				}
			}

			setState(270);
			match(K_PROCEDURE);
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(271);
				schema();
				setState(272);
				match(DOT);
				}
				break;
			}
			setState(276);
			procedure_name();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(277);
				match(LPAREN);
				setState(278);
				parameter_declaration();
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(279);
					match(COMMA);
					setState(280);
					parameter_declaration();
					}
					}
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(286);
				match(RPAREN);
				}
			}

			setState(290);
			_la = _input.LA(1);
			if ( !(_la==K_AS || _la==K_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TYPE || _la==K_CURSOR || _la==K_PRAGMA || _la==ID) {
				{
				setState(291);
				declare_section();
				}
			}

			setState(294);
			body();
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
	public static class SchemaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLSQLParser.ID, 0); }
		public SchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaContext schema() throws RecognitionException {
		SchemaContext _localctx = new SchemaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_schema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(ID);
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
	public static class Procedure_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLSQLParser.ID, 0); }
		public Procedure_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterProcedure_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitProcedure_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitProcedure_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_nameContext procedure_name() throws RecognitionException {
		Procedure_nameContext _localctx = new Procedure_nameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_procedure_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(ID);
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
	public static class Parameter_declarationContext extends ParserRuleContext {
		public Parameter_nameContext parameter_name() {
			return getRuleContext(Parameter_nameContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode K_IN() { return getToken(PLSQLParser.K_IN, 0); }
		public TerminalNode K_OUT() { return getToken(PLSQLParser.K_OUT, 0); }
		public Parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterParameter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitParameter_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitParameter_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_declarationContext parameter_declaration() throws RecognitionException {
		Parameter_declarationContext _localctx = new Parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameter_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			parameter_name();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IN) {
				{
				setState(301);
				match(K_IN);
				}
			}

			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OUT) {
				{
				setState(304);
				match(K_OUT);
				}
			}

			setState(307);
			datatype();
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
	public static class Parameter_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLSQLParser.ID, 0); }
		public Parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterParameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitParameter_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitParameter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_nameContext parameter_name() throws RecognitionException {
		Parameter_nameContext _localctx = new Parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(ID);
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
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(PLSQLParser.STAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(STAR);
				}
				break;
			case K_NOT:
			case K_NULL:
			case K_TRUE:
			case K_FALSE:
			case K_SQL:
			case K_CASE:
			case K_CURRENT_DATE:
			case K_SYSDATE:
			case K_SYSTIMESTAMP:
			case K_SQLCODE:
			case K_SQLERRM:
			case K_USER:
			case LPAREN:
			case PLUS:
			case MINUS:
			case ID:
			case LITERAL_NUMBER:
			case SINGLE_QUOTE_STRING:
			case Q_ESCAPE_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				expression(0);
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
	public static class Declare_sectionContext extends ParserRuleContext {
		public Item_listContext item_list() {
			return getRuleContext(Item_listContext.class,0);
		}
		public Declare_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterDeclare_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitDeclare_section(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitDeclare_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_sectionContext declare_section() throws RecognitionException {
		Declare_sectionContext _localctx = new Declare_sectionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declare_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			item_list();
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
	public static class Item_listContext extends ParserRuleContext {
		public List<Item_declarationContext> item_declaration() {
			return getRuleContexts(Item_declarationContext.class);
		}
		public Item_declarationContext item_declaration(int i) {
			return getRuleContext(Item_declarationContext.class,i);
		}
		public List<Type_definitionContext> type_definition() {
			return getRuleContexts(Type_definitionContext.class);
		}
		public Type_definitionContext type_definition(int i) {
			return getRuleContext(Type_definitionContext.class,i);
		}
		public List<Cursor_declarationContext> cursor_declaration() {
			return getRuleContexts(Cursor_declarationContext.class);
		}
		public Cursor_declarationContext cursor_declaration(int i) {
			return getRuleContext(Cursor_declarationContext.class,i);
		}
		public List<Cursor_definitionContext> cursor_definition() {
			return getRuleContexts(Cursor_definitionContext.class);
		}
		public Cursor_definitionContext cursor_definition(int i) {
			return getRuleContext(Cursor_definitionContext.class,i);
		}
		public List<PragmaContext> pragma() {
			return getRuleContexts(PragmaContext.class);
		}
		public PragmaContext pragma(int i) {
			return getRuleContext(PragmaContext.class,i);
		}
		public Item_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterItem_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitItem_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitItem_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Item_listContext item_list() throws RecognitionException {
		Item_listContext _localctx = new Item_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_item_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(322);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(317);
					item_declaration();
					}
					break;
				case 2:
					{
					setState(318);
					type_definition();
					}
					break;
				case 3:
					{
					setState(319);
					cursor_declaration();
					}
					break;
				case 4:
					{
					setState(320);
					cursor_definition();
					}
					break;
				case 5:
					{
					setState(321);
					pragma();
					}
					break;
				}
				}
				setState(324); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_TYPE || _la==K_CURSOR || _la==K_PRAGMA || _la==ID );
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
	public static class Item_declarationContext extends ParserRuleContext {
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Exception_declarationContext exception_declaration() {
			return getRuleContext(Exception_declarationContext.class,0);
		}
		public Item_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterItem_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitItem_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitItem_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Item_declarationContext item_declaration() throws RecognitionException {
		Item_declarationContext _localctx = new Item_declarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_item_declaration);
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				constant_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				variable_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				exception_declaration();
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
	public static class Type_definitionContext extends ParserRuleContext {
		public Collection_type_definitionContext collection_type_definition() {
			return getRuleContext(Collection_type_definitionContext.class,0);
		}
		public Record_type_definitionContext record_type_definition() {
			return getRuleContext(Record_type_definitionContext.class,0);
		}
		public Ref_cursor_type_definitionContext ref_cursor_type_definition() {
			return getRuleContext(Ref_cursor_type_definitionContext.class,0);
		}
		public Type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterType_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitType_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitType_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_definitionContext type_definition() throws RecognitionException {
		Type_definitionContext _localctx = new Type_definitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type_definition);
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				collection_type_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				record_type_definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				ref_cursor_type_definition();
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
	public static class Exception_declarationContext extends ParserRuleContext {
		public Exception_Context exception_() {
			return getRuleContext(Exception_Context.class,0);
		}
		public TerminalNode K_EXCEPTION() { return getToken(PLSQLParser.K_EXCEPTION, 0); }
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public Exception_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterException_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitException_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitException_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_declarationContext exception_declaration() throws RecognitionException {
		Exception_declarationContext _localctx = new Exception_declarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exception_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			exception_();
			setState(337);
			match(K_EXCEPTION);
			setState(338);
			match(SEMI);
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
	public static class PragmaContext extends ParserRuleContext {
		public Exception_init_pragmaContext exception_init_pragma() {
			return getRuleContext(Exception_init_pragmaContext.class,0);
		}
		public PragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterPragma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitPragma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitPragma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaContext pragma() throws RecognitionException {
		PragmaContext _localctx = new PragmaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pragma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			exception_init_pragma();
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
	public static class Exception_init_pragmaContext extends ParserRuleContext {
		public TerminalNode K_PRAGMA() { return getToken(PLSQLParser.K_PRAGMA, 0); }
		public TerminalNode K_EXCEPTION_INIT() { return getToken(PLSQLParser.K_EXCEPTION_INIT, 0); }
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public Exception_Context exception_() {
			return getRuleContext(Exception_Context.class,0);
		}
		public TerminalNode COMMA() { return getToken(PLSQLParser.COMMA, 0); }
		public Error_codeContext error_code() {
			return getRuleContext(Error_codeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public Exception_init_pragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_init_pragma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterException_init_pragma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitException_init_pragma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitException_init_pragma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_init_pragmaContext exception_init_pragma() throws RecognitionException {
		Exception_init_pragmaContext _localctx = new Exception_init_pragmaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exception_init_pragma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(K_PRAGMA);
			setState(343);
			match(K_EXCEPTION_INIT);
			setState(344);
			match(LPAREN);
			setState(345);
			exception_();
			setState(346);
			match(COMMA);
			setState(347);
			error_code();
			setState(348);
			match(RPAREN);
			setState(349);
			match(SEMI);
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
	public static class Error_codeContext extends ParserRuleContext {
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public Error_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterError_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitError_code(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitError_code(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_codeContext error_code() throws RecognitionException {
		Error_codeContext _localctx = new Error_codeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_error_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			numeric_literal();
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
	public static class Cursor_declarationContext extends ParserRuleContext {
		public TerminalNode K_CURSOR() { return getToken(PLSQLParser.K_CURSOR, 0); }
		public CursorContext cursor() {
			return getRuleContext(CursorContext.class,0);
		}
		public TerminalNode K_RETURN() { return getToken(PLSQLParser.K_RETURN, 0); }
		public RowtypeContext rowtype() {
			return getRuleContext(RowtypeContext.class,0);
		}
		public Cursor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterCursor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitCursor_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitCursor_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_declarationContext cursor_declaration() throws RecognitionException {
		Cursor_declarationContext _localctx = new Cursor_declarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cursor_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(K_CURSOR);
			setState(354);
			cursor();
			setState(355);
			match(K_RETURN);
			setState(356);
			rowtype();
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
	public static class Cursor_definitionContext extends ParserRuleContext {
		public TerminalNode K_CURSOR() { return getToken(PLSQLParser.K_CURSOR, 0); }
		public CursorContext cursor() {
			return getRuleContext(CursorContext.class,0);
		}
		public TerminalNode K_IS() { return getToken(PLSQLParser.K_IS, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public List<Cursor_parameter_decContext> cursor_parameter_dec() {
			return getRuleContexts(Cursor_parameter_decContext.class);
		}
		public Cursor_parameter_decContext cursor_parameter_dec(int i) {
			return getRuleContext(Cursor_parameter_decContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public TerminalNode K_RETURN() { return getToken(PLSQLParser.K_RETURN, 0); }
		public RowtypeContext rowtype() {
			return getRuleContext(RowtypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PLSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PLSQLParser.COMMA, i);
		}
		public Cursor_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterCursor_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitCursor_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitCursor_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_definitionContext cursor_definition() throws RecognitionException {
		Cursor_definitionContext _localctx = new Cursor_definitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cursor_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(K_CURSOR);
			setState(359);
			cursor();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(360);
				match(LPAREN);
				setState(361);
				cursor_parameter_dec();
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(362);
					match(COMMA);
					setState(363);
					cursor_parameter_dec();
					}
					}
					setState(368);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(369);
				match(RPAREN);
				}
			}

			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_RETURN) {
				{
				setState(373);
				match(K_RETURN);
				setState(374);
				rowtype();
				}
			}

			setState(377);
			match(K_IS);
			setState(378);
			select_statement();
			setState(379);
			match(SEMI);
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
	public static class Cursor_parameter_decContext extends ParserRuleContext {
		public Parameter_nameContext parameter_name() {
			return getRuleContext(Parameter_nameContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode K_IN() { return getToken(PLSQLParser.K_IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PLSQLParser.ASSIGN, 0); }
		public TerminalNode K_DEFAULT() { return getToken(PLSQLParser.K_DEFAULT, 0); }
		public Cursor_parameter_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_parameter_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterCursor_parameter_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitCursor_parameter_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitCursor_parameter_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_parameter_decContext cursor_parameter_dec() throws RecognitionException {
		Cursor_parameter_decContext _localctx = new Cursor_parameter_decContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cursor_parameter_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			parameter_name();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IN) {
				{
				setState(382);
				match(K_IN);
				}
			}

			setState(385);
			datatype();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DEFAULT || _la==ASSIGN) {
				{
				setState(386);
				_la = _input.LA(1);
				if ( !(_la==K_DEFAULT || _la==ASSIGN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(387);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RowtypeContext extends ParserRuleContext {
		public Type_attributeContext type_attribute() {
			return getRuleContext(Type_attributeContext.class,0);
		}
		public Rowtype_attributeContext rowtype_attribute() {
			return getRuleContext(Rowtype_attributeContext.class,0);
		}
		public User_define_typeContext user_define_type() {
			return getRuleContext(User_define_typeContext.class,0);
		}
		public RowtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterRowtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitRowtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitRowtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowtypeContext rowtype() throws RecognitionException {
		RowtypeContext _localctx = new RowtypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_rowtype);
		try {
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				type_attribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				rowtype_attribute();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
				user_define_type();
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
	public static class Record_type_definitionContext extends ParserRuleContext {
		public TerminalNode K_TYPE() { return getToken(PLSQLParser.K_TYPE, 0); }
		public Record_typeContext record_type() {
			return getRuleContext(Record_typeContext.class,0);
		}
		public TerminalNode K_IS() { return getToken(PLSQLParser.K_IS, 0); }
		public TerminalNode K_RECORD() { return getToken(PLSQLParser.K_RECORD, 0); }
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public List<Field_definitionContext> field_definition() {
			return getRuleContexts(Field_definitionContext.class);
		}
		public Field_definitionContext field_definition(int i) {
			return getRuleContext(Field_definitionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PLSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PLSQLParser.COMMA, i);
		}
		public Record_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterRecord_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitRecord_type_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitRecord_type_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_type_definitionContext record_type_definition() throws RecognitionException {
		Record_type_definitionContext _localctx = new Record_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_record_type_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(K_TYPE);
			setState(396);
			record_type();
			setState(397);
			match(K_IS);
			setState(398);
			match(K_RECORD);
			setState(399);
			match(LPAREN);
			setState(400);
			field_definition();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(401);
				match(COMMA);
				setState(402);
				field_definition();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408);
			match(RPAREN);
			setState(409);
			match(SEMI);
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
	public static class Ref_cursor_type_definitionContext extends ParserRuleContext {
		public TerminalNode K_TYPE() { return getToken(PLSQLParser.K_TYPE, 0); }
		public Cursor_typeContext cursor_type() {
			return getRuleContext(Cursor_typeContext.class,0);
		}
		public TerminalNode K_IS() { return getToken(PLSQLParser.K_IS, 0); }
		public TerminalNode K_REF() { return getToken(PLSQLParser.K_REF, 0); }
		public TerminalNode K_CURSOR() { return getToken(PLSQLParser.K_CURSOR, 0); }
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public TerminalNode K_RETURN() { return getToken(PLSQLParser.K_RETURN, 0); }
		public RowtypeContext rowtype() {
			return getRuleContext(RowtypeContext.class,0);
		}
		public Ref_cursor_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref_cursor_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterRef_cursor_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitRef_cursor_type_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitRef_cursor_type_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ref_cursor_type_definitionContext ref_cursor_type_definition() throws RecognitionException {
		Ref_cursor_type_definitionContext _localctx = new Ref_cursor_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ref_cursor_type_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(K_TYPE);
			setState(412);
			cursor_type();
			setState(413);
			match(K_IS);
			setState(414);
			match(K_REF);
			setState(415);
			match(K_CURSOR);
			{
			setState(416);
			match(K_RETURN);
			setState(417);
			rowtype();
			}
			setState(419);
			match(SEMI);
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
	public static class Cursor_typeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLSQLParser.ID, 0); }
		public Cursor_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterCursor_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitCursor_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitCursor_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_typeContext cursor_type() throws RecognitionException {
		Cursor_typeContext _localctx = new Cursor_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cursor_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(ID);
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
	public static class Collection_type_definitionContext extends ParserRuleContext {
		public TerminalNode K_TYPE() { return getToken(PLSQLParser.K_TYPE, 0); }
		public Collection_typeContext collection_type() {
			return getRuleContext(Collection_typeContext.class,0);
		}
		public TerminalNode K_IS() { return getToken(PLSQLParser.K_IS, 0); }
		public Assoc_array_type_defContext assoc_array_type_def() {
			return getRuleContext(Assoc_array_type_defContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public Collection_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterCollection_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitCollection_type_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitCollection_type_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collection_type_definitionContext collection_type_definition() throws RecognitionException {
		Collection_type_definitionContext _localctx = new Collection_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_collection_type_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(K_TYPE);
			setState(424);
			collection_type();
			setState(425);
			match(K_IS);
			setState(426);
			assoc_array_type_def();
			setState(427);
			match(SEMI);
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
	public static class Assoc_array_type_defContext extends ParserRuleContext {
		public TerminalNode K_TABLE() { return getToken(PLSQLParser.K_TABLE, 0); }
		public TerminalNode K_OF() { return getToken(PLSQLParser.K_OF, 0); }
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode K_INDEX() { return getToken(PLSQLParser.K_INDEX, 0); }
		public TerminalNode K_BY() { return getToken(PLSQLParser.K_BY, 0); }
		public TerminalNode K_PLS_INTEGER() { return getToken(PLSQLParser.K_PLS_INTEGER, 0); }
		public TerminalNode K_BINARY_INTEGER() { return getToken(PLSQLParser.K_BINARY_INTEGER, 0); }
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public TerminalNode K_LONG() { return getToken(PLSQLParser.K_LONG, 0); }
		public Type_attributeContext type_attribute() {
			return getRuleContext(Type_attributeContext.class,0);
		}
		public Rowtype_attributeContext rowtype_attribute() {
			return getRuleContext(Rowtype_attributeContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(PLSQLParser.K_NOT, 0); }
		public TerminalNode K_NULL() { return getToken(PLSQLParser.K_NULL, 0); }
		public TerminalNode K_VARCHAR2() { return getToken(PLSQLParser.K_VARCHAR2, 0); }
		public TerminalNode K_VARCHAR() { return getToken(PLSQLParser.K_VARCHAR, 0); }
		public TerminalNode K_STRING() { return getToken(PLSQLParser.K_STRING, 0); }
		public Assoc_array_type_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assoc_array_type_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterAssoc_array_type_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitAssoc_array_type_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitAssoc_array_type_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assoc_array_type_defContext assoc_array_type_def() throws RecognitionException {
		Assoc_array_type_defContext _localctx = new Assoc_array_type_defContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assoc_array_type_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(K_TABLE);
			setState(430);
			match(K_OF);
			setState(431);
			datatype();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_NOT) {
				{
				setState(432);
				match(K_NOT);
				setState(433);
				match(K_NULL);
				}
			}

			setState(436);
			match(K_INDEX);
			setState(437);
			match(K_BY);
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(438);
				match(K_PLS_INTEGER);
				}
				break;
			case 2:
				{
				setState(439);
				match(K_BINARY_INTEGER);
				}
				break;
			case 3:
				{
				setState(440);
				_la = _input.LA(1);
				if ( !(((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 6291457L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(441);
				match(LPAREN);
				setState(442);
				size();
				setState(443);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(445);
				match(K_LONG);
				}
				break;
			case 5:
				{
				setState(446);
				type_attribute();
				}
				break;
			case 6:
				{
				setState(447);
				rowtype_attribute();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Field_definitionContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PLSQLParser.ASSIGN, 0); }
		public TerminalNode K_DEFAULT() { return getToken(PLSQLParser.K_DEFAULT, 0); }
		public TerminalNode K_NOT() { return getToken(PLSQLParser.K_NOT, 0); }
		public TerminalNode K_NULL() { return getToken(PLSQLParser.K_NULL, 0); }
		public Field_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterField_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitField_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitField_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_definitionContext field_definition() throws RecognitionException {
		Field_definitionContext _localctx = new Field_definitionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_field_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			field();
			setState(451);
			datatype();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DEFAULT || _la==K_NOT || _la==ASSIGN) {
				{
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(452);
					match(K_NOT);
					setState(453);
					match(K_NULL);
					}
				}

				setState(456);
				_la = _input.LA(1);
				if ( !(_la==K_DEFAULT || _la==ASSIGN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(457);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Record_typeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLSQLParser.ID, 0); }
		public Record_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterRecord_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitRecord_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitRecord_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_typeContext record_type() throws RecognitionException {
		Record_typeContext _localctx = new Record_typeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_record_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(ID);
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
	public static class Constant_declarationContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode K_CONSTANT() { return getToken(PLSQLParser.K_CONSTANT, 0); }
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public TerminalNode ASSIGN() { return getToken(PLSQLParser.ASSIGN, 0); }
		public TerminalNode K_DEFAULT() { return getToken(PLSQLParser.K_DEFAULT, 0); }
		public TerminalNode K_NOT() { return getToken(PLSQLParser.K_NOT, 0); }
		public TerminalNode K_NULL() { return getToken(PLSQLParser.K_NULL, 0); }
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterConstant_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitConstant_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitConstant_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constant_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			constant();
			setState(463);
			match(K_CONSTANT);
			setState(464);
			datatype();
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_NOT) {
				{
				setState(465);
				match(K_NOT);
				setState(466);
				match(K_NULL);
				}
			}

			setState(469);
			_la = _input.LA(1);
			if ( !(_la==K_DEFAULT || _la==ASSIGN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(470);
			expression(0);
			setState(471);
			match(SEMI);
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
	public static class BodyContext extends ParserRuleContext {
		public TerminalNode K_BEGIN() { return getToken(PLSQLParser.K_BEGIN, 0); }
		public TerminalNode K_END() { return getToken(PLSQLParser.K_END, 0); }
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode K_EXCEPTION() { return getToken(PLSQLParser.K_EXCEPTION, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<Exception_handlerContext> exception_handler() {
			return getRuleContexts(Exception_handlerContext.class);
		}
		public Exception_handlerContext exception_handler(int i) {
			return getRuleContext(Exception_handlerContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(K_BEGIN);
			setState(475); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(474);
				statement();
				}
				}
				setState(477); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -9206704192179715544L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 565148980871169L) != 0) );
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXCEPTION) {
				{
				setState(479);
				match(K_EXCEPTION);
				setState(481); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(480);
					exception_handler();
					}
					}
					setState(483); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				}
			}

			setState(487);
			match(K_END);
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(488);
				name();
				}
			}

			setState(491);
			match(SEMI);
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
	public static class Exception_handlerContext extends ParserRuleContext {
		public TerminalNode K_WHEN() { return getToken(PLSQLParser.K_WHEN, 0); }
		public TerminalNode K_THEN() { return getToken(PLSQLParser.K_THEN, 0); }
		public List<Exception_Context> exception_() {
			return getRuleContexts(Exception_Context.class);
		}
		public Exception_Context exception_(int i) {
			return getRuleContext(Exception_Context.class,i);
		}
		public TerminalNode K_OTHERS() { return getToken(PLSQLParser.K_OTHERS, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> K_OR() { return getTokens(PLSQLParser.K_OR); }
		public TerminalNode K_OR(int i) {
			return getToken(PLSQLParser.K_OR, i);
		}
		public Exception_handlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_handler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterException_handler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitException_handler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitException_handler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_handlerContext exception_handler() throws RecognitionException {
		Exception_handlerContext _localctx = new Exception_handlerContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_exception_handler);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(K_WHEN);
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(494);
				exception_();
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_OR) {
					{
					{
					setState(495);
					match(K_OR);
					setState(496);
					exception_();
					}
					}
					setState(501);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case K_OTHERS:
				{
				setState(502);
				match(K_OTHERS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(505);
			match(K_THEN);
			setState(507); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(506);
				statement();
				}
				}
				setState(509); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -9206704192179715544L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 565148980871169L) != 0) );
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
	public static class While_loop_statementContext extends ParserRuleContext {
		public TerminalNode K_WHILE() { return getToken(PLSQLParser.K_WHILE, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public List<TerminalNode> K_LOOP() { return getTokens(PLSQLParser.K_LOOP); }
		public TerminalNode K_LOOP(int i) {
			return getToken(PLSQLParser.K_LOOP, i);
		}
		public TerminalNode K_END() { return getToken(PLSQLParser.K_END, 0); }
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public While_loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterWhile_loop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitWhile_loop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitWhile_loop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loop_statementContext while_loop_statement() throws RecognitionException {
		While_loop_statementContext _localctx = new While_loop_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_while_loop_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(K_WHILE);
			setState(512);
			boolean_expression();
			setState(513);
			match(K_LOOP);
			setState(515); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(514);
				statement();
				}
				}
				setState(517); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -9206704192179715544L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 565148980871169L) != 0) );
			setState(519);
			match(K_END);
			setState(520);
			match(K_LOOP);
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(521);
				label();
				}
			}

			setState(524);
			match(SEMI);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprUnaryOpContext extends ExpressionContext {
		public UnaryOpContext unaryOp() {
			return getRuleContext(UnaryOpContext.class,0);
		}
		public ExprUnaryOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterExprUnaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitExprUnaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitExprUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprParenContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public ExprParenContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterExprParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitExprParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitExprParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBetweenContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode K_BETWEEN() { return getToken(PLSQLParser.K_BETWEEN, 0); }
		public TerminalNode K_AND() { return getToken(PLSQLParser.K_AND, 0); }
		public TerminalNode K_NOT() { return getToken(PLSQLParser.K_NOT, 0); }
		public ExprBetweenContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterExprBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitExprBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitExprBetween(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprCaseContext extends ExpressionContext {
		public Case_expressionContext case_expression() {
			return getRuleContext(Case_expressionContext.class,0);
		}
		public ExprCaseContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterExprCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitExprCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitExprCase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprConstantContext extends ExpressionContext {
		public Builtin_constantContext builtin_constant() {
			return getRuleContext(Builtin_constantContext.class,0);
		}
		public ExprConstantContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterExprConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitExprConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitExprConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNotContext extends ExpressionContext {
		public TerminalNode K_NOT() { return getToken(PLSQLParser.K_NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprNotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterExprNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitExprNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitExprNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAndOrContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode K_AND() { return getToken(PLSQLParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(PLSQLParser.K_OR, 0); }
		public ExprAndOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterExprAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitExprAndOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitExprAndOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprCursorContext extends ExpressionContext {
		public Cursor_attributeContext cursor_attribute() {
			return getRuleContext(Cursor_attributeContext.class,0);
		}
		public ExprCursorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterExprCursor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitExprCursor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitExprCursor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprRelationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelationOperatorContext relationOperator() {
			return getRuleContext(RelationOperatorContext.class,0);
		}
		public ExprRelationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterExprRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitExprRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitExprRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIsContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode K_IS() { return getToken(PLSQLParser.K_IS, 0); }
		public TerminalNode K_NULL() { return getToken(PLSQLParser.K_NULL, 0); }
		public TerminalNode K_NOT() { return getToken(PLSQLParser.K_NOT, 0); }
		public ExprIsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterExprIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitExprIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitExprIs(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBinaryContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinaryOperatorsContext binaryOperators() {
			return getRuleContext(BinaryOperatorsContext.class,0);
		}
		public ExprBinaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterExprBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitExprBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitExprBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprFunctionContext extends ExpressionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ExprFunctionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterExprFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitExprFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitExprFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprVaribleContext extends ExpressionContext {
		public Variable_or_dbobjContext variable_or_dbobj() {
			return getRuleContext(Variable_or_dbobjContext.class,0);
		}
		public ExprVaribleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterExprVarible(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitExprVarible(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitExprVarible(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprLiteralContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExprLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterExprLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitExprLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitExprLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				_localctx = new ExprConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(527);
				builtin_constant();
				}
				break;
			case 2:
				{
				_localctx = new ExprVaribleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(528);
				variable_or_dbobj();
				}
				break;
			case 3:
				{
				_localctx = new ExprLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(529);
				literal();
				}
				break;
			case 4:
				{
				_localctx = new ExprFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(530);
				function_call();
				}
				break;
			case 5:
				{
				_localctx = new ExprParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(531);
				match(LPAREN);
				setState(532);
				expression(0);
				setState(533);
				match(RPAREN);
				}
				break;
			case 6:
				{
				_localctx = new ExprCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(535);
				case_expression();
				}
				break;
			case 7:
				{
				_localctx = new ExprCursorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(536);
				cursor_attribute();
				}
				break;
			case 8:
				{
				_localctx = new ExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(537);
				match(K_NOT);
				setState(538);
				expression(2);
				}
				break;
			case 9:
				{
				_localctx = new ExprUnaryOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(539);
				unaryOp();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(570);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(568);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new ExprBinaryContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(542);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(543);
						binaryOperators();
						setState(544);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprRelationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(546);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(547);
						relationOperator();
						setState(548);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprBetweenContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(550);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(552);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(551);
							match(K_NOT);
							}
						}

						setState(554);
						match(K_BETWEEN);
						setState(555);
						expression(0);
						setState(556);
						match(K_AND);
						setState(557);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprAndOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(559);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(560);
						_la = _input.LA(1);
						if ( !(_la==K_OR || _la==K_AND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(561);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ExprIsContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(562);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(563);
						match(K_IS);
						setState(565);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(564);
							match(K_NOT);
							}
						}

						setState(567);
						match(K_NULL);
						}
						break;
					}
					} 
				}
				setState(572);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryOpContext extends ParserRuleContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(PLSQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PLSQLParser.MINUS, 0); }
		public UnaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterUnaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitUnaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOpContext unaryOp() throws RecognitionException {
		UnaryOpContext _localctx = new UnaryOpContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_unaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			((UnaryOpContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
				((UnaryOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(574);
			expression(0);
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
	public static class Cursor_attributeContext extends ParserRuleContext {
		public TerminalNode PERCENT() { return getToken(PLSQLParser.PERCENT, 0); }
		public Cursor_attribute_nameContext cursor_attribute_name() {
			return getRuleContext(Cursor_attribute_nameContext.class,0);
		}
		public CursorContext cursor() {
			return getRuleContext(CursorContext.class,0);
		}
		public TerminalNode K_SQL() { return getToken(PLSQLParser.K_SQL, 0); }
		public Cursor_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterCursor_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitCursor_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitCursor_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_attributeContext cursor_attribute() throws RecognitionException {
		Cursor_attributeContext _localctx = new Cursor_attributeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_cursor_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(576);
				cursor();
				}
				break;
			case K_SQL:
				{
				setState(577);
				match(K_SQL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(580);
			match(PERCENT);
			setState(581);
			cursor_attribute_name();
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
	public static class Cursor_attribute_nameContext extends ParserRuleContext {
		public TerminalNode K_FOUND() { return getToken(PLSQLParser.K_FOUND, 0); }
		public TerminalNode K_NOTFOUND() { return getToken(PLSQLParser.K_NOTFOUND, 0); }
		public TerminalNode K_ROWCOUNT() { return getToken(PLSQLParser.K_ROWCOUNT, 0); }
		public TerminalNode K_ISOPEN() { return getToken(PLSQLParser.K_ISOPEN, 0); }
		public Cursor_attribute_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_attribute_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterCursor_attribute_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitCursor_attribute_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitCursor_attribute_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_attribute_nameContext cursor_attribute_name() throws RecognitionException {
		Cursor_attribute_nameContext _localctx = new Cursor_attribute_nameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_cursor_attribute_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4026531840L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Builtin_constantContext extends ParserRuleContext {
		public TerminalNode K_CURRENT_DATE() { return getToken(PLSQLParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_SYSDATE() { return getToken(PLSQLParser.K_SYSDATE, 0); }
		public TerminalNode K_SYSTIMESTAMP() { return getToken(PLSQLParser.K_SYSTIMESTAMP, 0); }
		public TerminalNode K_SQLCODE() { return getToken(PLSQLParser.K_SQLCODE, 0); }
		public TerminalNode K_SQLERRM() { return getToken(PLSQLParser.K_SQLERRM, 0); }
		public TerminalNode K_USER() { return getToken(PLSQLParser.K_USER, 0); }
		public Builtin_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterBuiltin_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitBuiltin_constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitBuiltin_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Builtin_constantContext builtin_constant() throws RecognitionException {
		Builtin_constantContext _localctx = new Builtin_constantContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_builtin_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 57351L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Case_expressionContext extends ParserRuleContext {
		public Searched_case_expressionContext searched_case_expression() {
			return getRuleContext(Searched_case_expressionContext.class,0);
		}
		public Simple_case_expressionContext simple_case_expression() {
			return getRuleContext(Simple_case_expressionContext.class,0);
		}
		public Case_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterCase_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitCase_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitCase_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_expressionContext case_expression() throws RecognitionException {
		Case_expressionContext _localctx = new Case_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_case_expression);
		try {
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				searched_case_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				simple_case_expression();
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
	public static class BinaryOperatorsContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(PLSQLParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(PLSQLParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(PLSQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PLSQLParser.MINUS, 0); }
		public TerminalNode DOUBLE_PIPE() { return getToken(PLSQLParser.DOUBLE_PIPE, 0); }
		public BinaryOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterBinaryOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitBinaryOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitBinaryOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOperatorsContext binaryOperators() throws RecognitionException {
		BinaryOperatorsContext _localctx = new BinaryOperatorsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_binaryOperators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			_la = _input.LA(1);
			if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 8219L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_or_dbobjContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PLSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PLSQLParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(PLSQLParser.DOT, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Variable_or_dbobjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_or_dbobj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterVariable_or_dbobj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitVariable_or_dbobj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitVariable_or_dbobj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_or_dbobjContext variable_or_dbobj() throws RecognitionException {
		Variable_or_dbobjContext _localctx = new Variable_or_dbobjContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variable_or_dbobj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(595);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(593);
					match(ID);
					}
					break;
				case 2:
					{
					setState(594);
					function_call();
					}
					break;
				}
				setState(597);
				match(DOT);
				}
				break;
			}
			setState(600);
			match(ID);
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
	public static class Boolean_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Boolean_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterBoolean_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitBoolean_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitBoolean_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_expressionContext boolean_expression() throws RecognitionException {
		Boolean_expressionContext _localctx = new Boolean_expressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_boolean_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			expression(0);
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
	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode K_TRUE() { return getToken(PLSQLParser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(PLSQLParser.K_FALSE, 0); }
		public TerminalNode K_NULL() { return getToken(PLSQLParser.K_NULL, 0); }
		public TerminalNode K_NOT() { return getToken(PLSQLParser.K_NOT, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_NOT) {
				{
				setState(604);
				match(K_NOT);
				}
			}

			setState(607);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1573376L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PLSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PLSQLParser.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			function();
			setState(610);
			match(LPAREN);
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4430758656L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 7177706397556743L) != 0)) {
				{
				setState(611);
				parameter();
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(612);
					match(COMMA);
					setState(613);
					parameter();
					}
					}
					setState(618);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(621);
			match(RPAREN);
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
	public static class IndexContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			variable();
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
	public static class Character_expressionContext extends ParserRuleContext {
		public Character_literalContext character_literal() {
			return getRuleContext(Character_literalContext.class,0);
		}
		public List<Character_subexpressionContext> character_subexpression() {
			return getRuleContexts(Character_subexpressionContext.class);
		}
		public Character_subexpressionContext character_subexpression(int i) {
			return getRuleContext(Character_subexpressionContext.class,i);
		}
		public List<TerminalNode> DOUBLE_PIPE() { return getTokens(PLSQLParser.DOUBLE_PIPE); }
		public TerminalNode DOUBLE_PIPE(int i) {
			return getToken(PLSQLParser.DOUBLE_PIPE, i);
		}
		public Character_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterCharacter_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitCharacter_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitCharacter_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Character_expressionContext character_expression() throws RecognitionException {
		Character_expressionContext _localctx = new Character_expressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_character_expression);
		int _la;
		try {
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				character_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				character_subexpression();
				setState(629); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(627);
					match(DOUBLE_PIPE);
					setState(628);
					character_subexpression();
					}
					}
					setState(631); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DOUBLE_PIPE );
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
	public static class Character_subexpressionContext extends ParserRuleContext {
		public Character_literalContext character_literal() {
			return getRuleContext(Character_literalContext.class,0);
		}
		public Character_variableContext character_variable() {
			return getRuleContext(Character_variableContext.class,0);
		}
		public Character_function_callContext character_function_call() {
			return getRuleContext(Character_function_callContext.class,0);
		}
		public Character_subexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_subexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterCharacter_subexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitCharacter_subexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitCharacter_subexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Character_subexpressionContext character_subexpression() throws RecognitionException {
		Character_subexpressionContext _localctx = new Character_subexpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_character_subexpression);
		try {
			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(635);
				character_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				character_variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(637);
				character_function_call();
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
	public static class Character_function_callContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Character_function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterCharacter_function_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitCharacter_function_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitCharacter_function_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Character_function_callContext character_function_call() throws RecognitionException {
		Character_function_callContext _localctx = new Character_function_callContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_character_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			function_call();
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
	public static class Character_literalContext extends ParserRuleContext {
		public TerminalNode SINGLE_QUOTE_STRING() { return getToken(PLSQLParser.SINGLE_QUOTE_STRING, 0); }
		public TerminalNode Q_ESCAPE_STRING() { return getToken(PLSQLParser.Q_ESCAPE_STRING, 0); }
		public Character_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterCharacter_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitCharacter_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitCharacter_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Character_literalContext character_literal() throws RecognitionException {
		Character_literalContext _localctx = new Character_literalContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_character_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_QUOTE_STRING || _la==Q_ESCAPE_STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Date_literalContext extends ParserRuleContext {
		public TerminalNode SINGLE_QUOTE_STRING() { return getToken(PLSQLParser.SINGLE_QUOTE_STRING, 0); }
		public TerminalNode Q_ESCAPE_STRING() { return getToken(PLSQLParser.Q_ESCAPE_STRING, 0); }
		public Date_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterDate_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitDate_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitDate_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_literalContext date_literal() throws RecognitionException {
		Date_literalContext _localctx = new Date_literalContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_date_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_QUOTE_STRING || _la==Q_ESCAPE_STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Numeric_expressionContext extends ParserRuleContext {
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public List<Numeric_subexpressionContext> numeric_subexpression() {
			return getRuleContexts(Numeric_subexpressionContext.class);
		}
		public Numeric_subexpressionContext numeric_subexpression(int i) {
			return getRuleContext(Numeric_subexpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(PLSQLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(PLSQLParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(PLSQLParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(PLSQLParser.MINUS, i);
		}
		public List<TerminalNode> STAR() { return getTokens(PLSQLParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(PLSQLParser.STAR, i);
		}
		public List<TerminalNode> DIV() { return getTokens(PLSQLParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(PLSQLParser.DIV, i);
		}
		public Numeric_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterNumeric_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitNumeric_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitNumeric_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_expressionContext numeric_expression() throws RecognitionException {
		Numeric_expressionContext _localctx = new Numeric_expressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_numeric_expression);
		int _la;
		try {
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				numeric_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				numeric_subexpression();
				setState(650); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(648);
					_la = _input.LA(1);
					if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 27L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(649);
					numeric_subexpression();
					}
					}
					setState(652); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 27L) != 0) );
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
	public static class Numeric_subexpressionContext extends ParserRuleContext {
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public Numeric_variableContext numeric_variable() {
			return getRuleContext(Numeric_variableContext.class,0);
		}
		public Numeric_function_callContext numeric_function_call() {
			return getRuleContext(Numeric_function_callContext.class,0);
		}
		public Numeric_subexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_subexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterNumeric_subexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitNumeric_subexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitNumeric_subexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_subexpressionContext numeric_subexpression() throws RecognitionException {
		Numeric_subexpressionContext _localctx = new Numeric_subexpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_numeric_subexpression);
		try {
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				numeric_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				numeric_variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(658);
				numeric_function_call();
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
	public static class Numeric_function_callContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Numeric_function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterNumeric_function_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitNumeric_function_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitNumeric_function_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_function_callContext numeric_function_call() throws RecognitionException {
		Numeric_function_callContext _localctx = new Numeric_function_callContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_numeric_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			function_call();
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
	public static class Numeric_literalContext extends ParserRuleContext {
		public TerminalNode LITERAL_NUMBER() { return getToken(PLSQLParser.LITERAL_NUMBER, 0); }
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterNumeric_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitNumeric_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitNumeric_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_numeric_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(LITERAL_NUMBER);
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
	public static class Searched_case_expressionContext extends ParserRuleContext {
		public TerminalNode K_CASE() { return getToken(PLSQLParser.K_CASE, 0); }
		public TerminalNode K_END() { return getToken(PLSQLParser.K_END, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(PLSQLParser.K_WHEN); }
		public TerminalNode K_WHEN(int i) {
			return getToken(PLSQLParser.K_WHEN, i);
		}
		public List<Boolean_expressionContext> boolean_expression() {
			return getRuleContexts(Boolean_expressionContext.class);
		}
		public Boolean_expressionContext boolean_expression(int i) {
			return getRuleContext(Boolean_expressionContext.class,i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(PLSQLParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(PLSQLParser.K_THEN, i);
		}
		public List<ResultContext> result() {
			return getRuleContexts(ResultContext.class);
		}
		public ResultContext result(int i) {
			return getRuleContext(ResultContext.class,i);
		}
		public TerminalNode K_ELSE() { return getToken(PLSQLParser.K_ELSE, 0); }
		public Searched_case_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searched_case_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterSearched_case_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitSearched_case_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitSearched_case_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Searched_case_expressionContext searched_case_expression() throws RecognitionException {
		Searched_case_expressionContext _localctx = new Searched_case_expressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_searched_case_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(K_CASE);
			setState(671); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(666);
				match(K_WHEN);
				setState(667);
				boolean_expression();
				setState(668);
				match(K_THEN);
				setState(669);
				result();
				}
				}
				setState(673); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_WHEN );
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ELSE) {
				{
				setState(675);
				match(K_ELSE);
				setState(676);
				result();
				}
			}

			setState(679);
			match(K_END);
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
	public static class ResultContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			expression(0);
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
	public static class Simple_case_expressionContext extends ParserRuleContext {
		public TerminalNode K_CASE() { return getToken(PLSQLParser.K_CASE, 0); }
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode K_END() { return getToken(PLSQLParser.K_END, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(PLSQLParser.K_WHEN); }
		public TerminalNode K_WHEN(int i) {
			return getToken(PLSQLParser.K_WHEN, i);
		}
		public List<Selector_valueContext> selector_value() {
			return getRuleContexts(Selector_valueContext.class);
		}
		public Selector_valueContext selector_value(int i) {
			return getRuleContext(Selector_valueContext.class,i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(PLSQLParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(PLSQLParser.K_THEN, i);
		}
		public List<ResultContext> result() {
			return getRuleContexts(ResultContext.class);
		}
		public ResultContext result(int i) {
			return getRuleContext(ResultContext.class,i);
		}
		public TerminalNode K_ELSE() { return getToken(PLSQLParser.K_ELSE, 0); }
		public Simple_case_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_case_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterSimple_case_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitSimple_case_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitSimple_case_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_case_expressionContext simple_case_expression() throws RecognitionException {
		Simple_case_expressionContext _localctx = new Simple_case_expressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_simple_case_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(K_CASE);
			setState(684);
			selector();
			setState(690); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(685);
				match(K_WHEN);
				setState(686);
				selector_value();
				setState(687);
				match(K_THEN);
				setState(688);
				result();
				}
				}
				setState(692); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_WHEN );
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ELSE) {
				{
				setState(694);
				match(K_ELSE);
				setState(695);
				result();
				}
			}

			setState(698);
			match(K_END);
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
	public static class SelectorContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			expression(0);
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
	public static class Selector_valueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Selector_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterSelector_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitSelector_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitSelector_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selector_valueContext selector_value() throws RecognitionException {
		Selector_valueContext _localctx = new Selector_valueContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_selector_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			expression(0);
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
	public static class LiteralContext extends ParserRuleContext {
		public Character_literalContext character_literal() {
			return getRuleContext(Character_literalContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public Date_literalContext date_literal() {
			return getRuleContext(Date_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_literal);
		try {
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				character_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(705);
				boolean_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(706);
				numeric_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(707);
				date_literal();
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
	public static class Select_clauseContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(PLSQLParser.K_SELECT, 0); }
		public List<TerminalNode> SEMI() { return getTokens(PLSQLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PLSQLParser.SEMI, i);
		}
		public Select_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterSelect_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitSelect_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitSelect_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_clauseContext select_clause() throws RecognitionException {
		Select_clauseContext _localctx = new Select_clauseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_select_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(K_SELECT);
			setState(714);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(711);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==SEMI) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(716);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode K_FROM() { return getToken(PLSQLParser.K_FROM, 0); }
		public List<TerminalNode> SEMI() { return getTokens(PLSQLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PLSQLParser.SEMI, i);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitFrom_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitFrom_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_from_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(K_FROM);
			setState(721);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(718);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==SEMI) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(723);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelationOperatorContext relationOperator() {
			return getRuleContext(RelationOperatorContext.class,0);
		}
		public TerminalNode K_BETWEEN() { return getToken(PLSQLParser.K_BETWEEN, 0); }
		public TerminalNode K_AND() { return getToken(PLSQLParser.K_AND, 0); }
		public TerminalNode K_NOT() { return getToken(PLSQLParser.K_NOT, 0); }
		public TerminalNode K_IS() { return getToken(PLSQLParser.K_IS, 0); }
		public TerminalNode K_NULL() { return getToken(PLSQLParser.K_NULL, 0); }
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode K_LIKE() { return getToken(PLSQLParser.K_LIKE, 0); }
		public List<Character_literalContext> character_literal() {
			return getRuleContexts(Character_literalContext.class);
		}
		public Character_literalContext character_literal(int i) {
			return getRuleContext(Character_literalContext.class,i);
		}
		public ColumnExpressionContext columnExpression() {
			return getRuleContext(ColumnExpressionContext.class,0);
		}
		public InConditionContext inCondition() {
			return getRuleContext(InConditionContext.class,0);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode K_OR() { return getToken(PLSQLParser.K_OR, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(725);
				expression(0);
				setState(726);
				relationOperator();
				setState(727);
				expression(0);
				}
				break;
			case 2:
				{
				setState(729);
				expression(0);
				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(730);
					match(K_NOT);
					}
				}

				setState(733);
				match(K_BETWEEN);
				setState(734);
				expression(0);
				setState(735);
				match(K_AND);
				setState(736);
				expression(0);
				}
				break;
			case 3:
				{
				setState(740);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(738);
					column();
					}
					break;
				case 2:
					{
					setState(739);
					expression(0);
					}
					break;
				}
				setState(742);
				match(K_IS);
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(743);
					match(K_NOT);
					}
				}

				setState(746);
				match(K_NULL);
				}
				break;
			case 4:
				{
				setState(750);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SINGLE_QUOTE_STRING:
				case Q_ESCAPE_STRING:
					{
					setState(748);
					character_literal();
					}
					break;
				case K_ROWID:
				case ID:
					{
					setState(749);
					columnExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(752);
					match(K_NOT);
					}
				}

				setState(755);
				match(K_LIKE);
				setState(758);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SINGLE_QUOTE_STRING:
				case Q_ESCAPE_STRING:
					{
					setState(756);
					character_literal();
					}
					break;
				case ID:
					{
					setState(757);
					column();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				{
				setState(760);
				inCondition();
				}
				break;
			case 6:
				{
				setState(761);
				match(K_NOT);
				setState(762);
				condition(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(770);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(765);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(766);
					_la = _input.LA(1);
					if ( !(_la==K_OR || _la==K_AND) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(767);
					condition(3);
					}
					} 
				}
				setState(772);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode K_IN() { return getToken(PLSQLParser.K_IN, 0); }
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public TerminalNode K_NOT() { return getToken(PLSQLParser.K_NOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PLSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PLSQLParser.COMMA, i);
		}
		public InConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterInCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitInCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitInCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InConditionContext inCondition() throws RecognitionException {
		InConditionContext _localctx = new InConditionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_inCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			expression(0);
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_NOT) {
				{
				setState(774);
				match(K_NOT);
				}
			}

			setState(777);
			match(K_IN);
			setState(778);
			match(LPAREN);
			setState(779);
			expression(0);
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(780);
				match(COMMA);
				setState(781);
				expression(0);
				}
				}
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(787);
			match(RPAREN);
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
	public static class RelationOperatorContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(PLSQLParser.GT, 0); }
		public TerminalNode GE() { return getToken(PLSQLParser.GE, 0); }
		public TerminalNode LT() { return getToken(PLSQLParser.LT, 0); }
		public TerminalNode LE() { return getToken(PLSQLParser.LE, 0); }
		public TerminalNode EQUAL() { return getToken(PLSQLParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(PLSQLParser.NOT_EQUAL, 0); }
		public RelationOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterRelationOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitRelationOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitRelationOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationOperatorContext relationOperator() throws RecognitionException {
		RelationOperatorContext _localctx = new RelationOperatorContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_relationOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			_la = _input.LA(1);
			if ( !(((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & 63L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnExpressionContext extends ParserRuleContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode K_ROWID() { return getToken(PLSQLParser.K_ROWID, 0); }
		public Table_referenceContext table_reference() {
			return getRuleContext(Table_referenceContext.class,0);
		}
		public ColumnExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterColumnExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitColumnExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitColumnExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnExpressionContext columnExpression() throws RecognitionException {
		ColumnExpressionContext _localctx = new ColumnExpressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_columnExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(791);
				table_reference();
				}
				break;
			}
			setState(796);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(794);
				column();
				}
				break;
			case K_ROWID:
				{
				setState(795);
				match(K_ROWID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Basic_loop_statementContext basic_loop_statement() {
			return getRuleContext(Basic_loop_statementContext.class,0);
		}
		public Case_statementContext case_statement() {
			return getRuleContext(Case_statementContext.class,0);
		}
		public Close_statementContext close_statement() {
			return getRuleContext(Close_statementContext.class,0);
		}
		public Continue_statementContext continue_statement() {
			return getRuleContext(Continue_statementContext.class,0);
		}
		public Execute_immediate_statementContext execute_immediate_statement() {
			return getRuleContext(Execute_immediate_statementContext.class,0);
		}
		public Exit_statementContext exit_statement() {
			return getRuleContext(Exit_statementContext.class,0);
		}
		public Fetch_statementContext fetch_statement() {
			return getRuleContext(Fetch_statementContext.class,0);
		}
		public For_loop_statementContext for_loop_statement() {
			return getRuleContext(For_loop_statementContext.class,0);
		}
		public Cursor_for_loop_statementContext cursor_for_loop_statement() {
			return getRuleContext(Cursor_for_loop_statementContext.class,0);
		}
		public Goto_statementContext goto_statement() {
			return getRuleContext(Goto_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Null_statementContext null_statement() {
			return getRuleContext(Null_statementContext.class,0);
		}
		public Open_statementContext open_statement() {
			return getRuleContext(Open_statementContext.class,0);
		}
		public Open_for_statementContext open_for_statement() {
			return getRuleContext(Open_for_statementContext.class,0);
		}
		public Procedure_callContext procedure_call() {
			return getRuleContext(Procedure_callContext.class,0);
		}
		public Raise_statementContext raise_statement() {
			return getRuleContext(Raise_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Select_into_statementContext select_into_statement() {
			return getRuleContext(Select_into_statementContext.class,0);
		}
		public Sql_statementContext sql_statement() {
			return getRuleContext(Sql_statementContext.class,0);
		}
		public While_loop_statementContext while_loop_statement() {
			return getRuleContext(While_loop_statementContext.class,0);
		}
		public Plsql_blockContext plsql_block() {
			return getRuleContext(Plsql_blockContext.class,0);
		}
		public List<TerminalNode> DOUBLE_L() { return getTokens(PLSQLParser.DOUBLE_L); }
		public TerminalNode DOUBLE_L(int i) {
			return getToken(PLSQLParser.DOUBLE_L, i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<TerminalNode> DOUBLE_G() { return getTokens(PLSQLParser.DOUBLE_G); }
		public TerminalNode DOUBLE_G(int i) {
			return getToken(PLSQLParser.DOUBLE_G, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(798);
					match(DOUBLE_L);
					setState(799);
					label();
					setState(800);
					match(DOUBLE_G);
					}
					} 
				}
				setState(806);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(807);
				assignment_statement();
				}
				break;
			case 2:
				{
				setState(808);
				basic_loop_statement();
				}
				break;
			case 3:
				{
				setState(809);
				case_statement();
				}
				break;
			case 4:
				{
				setState(810);
				close_statement();
				}
				break;
			case 5:
				{
				setState(811);
				continue_statement();
				}
				break;
			case 6:
				{
				setState(812);
				execute_immediate_statement();
				}
				break;
			case 7:
				{
				setState(813);
				exit_statement();
				}
				break;
			case 8:
				{
				setState(814);
				fetch_statement();
				}
				break;
			case 9:
				{
				setState(815);
				for_loop_statement();
				}
				break;
			case 10:
				{
				setState(816);
				cursor_for_loop_statement();
				}
				break;
			case 11:
				{
				setState(817);
				goto_statement();
				}
				break;
			case 12:
				{
				setState(818);
				if_statement();
				}
				break;
			case 13:
				{
				setState(819);
				null_statement();
				}
				break;
			case 14:
				{
				setState(820);
				open_statement();
				}
				break;
			case 15:
				{
				setState(821);
				open_for_statement();
				}
				break;
			case 16:
				{
				setState(822);
				procedure_call();
				}
				break;
			case 17:
				{
				setState(823);
				raise_statement();
				}
				break;
			case 18:
				{
				setState(824);
				return_statement();
				}
				break;
			case 19:
				{
				setState(825);
				select_into_statement();
				}
				break;
			case 20:
				{
				setState(826);
				sql_statement();
				}
				break;
			case 21:
				{
				setState(827);
				while_loop_statement();
				}
				break;
			case 22:
				{
				setState(828);
				procedure_call();
				}
				break;
			case 23:
				{
				setState(829);
				plsql_block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_statementContext extends ParserRuleContext {
		public Assignment_statement_targetContext assignment_statement_target() {
			return getRuleContext(Assignment_statement_targetContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PLSQLParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitAssignment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitAssignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			assignment_statement_target();
			setState(833);
			match(ASSIGN);
			setState(834);
			expression(0);
			setState(835);
			match(SEMI);
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
	public static class Assignment_statement_targetContext extends ParserRuleContext {
		public Variable_or_dbobjContext variable_or_dbobj() {
			return getRuleContext(Variable_or_dbobjContext.class,0);
		}
		public Collection_variableContext collection_variable() {
			return getRuleContext(Collection_variableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public Collection_indexContext collection_index() {
			return getRuleContext(Collection_indexContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public Assignment_statement_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterAssignment_statement_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitAssignment_statement_target(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitAssignment_statement_target(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statement_targetContext assignment_statement_target() throws RecognitionException {
		Assignment_statement_targetContext _localctx = new Assignment_statement_targetContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_assignment_statement_target);
		try {
			setState(843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(837);
				variable_or_dbobj();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(838);
				collection_variable();
				setState(839);
				match(LPAREN);
				setState(840);
				collection_index();
				setState(841);
				match(RPAREN);
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
	public static class Collection_indexContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Collection_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterCollection_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitCollection_index(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitCollection_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collection_indexContext collection_index() throws RecognitionException {
		Collection_indexContext _localctx = new Collection_indexContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_collection_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			expression(0);
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
	public static class Basic_loop_statementContext extends ParserRuleContext {
		public List<TerminalNode> K_LOOP() { return getTokens(PLSQLParser.K_LOOP); }
		public TerminalNode K_LOOP(int i) {
			return getToken(PLSQLParser.K_LOOP, i);
		}
		public TerminalNode K_END() { return getToken(PLSQLParser.K_END, 0); }
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Basic_loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterBasic_loop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitBasic_loop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitBasic_loop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_loop_statementContext basic_loop_statement() throws RecognitionException {
		Basic_loop_statementContext _localctx = new Basic_loop_statementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_basic_loop_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(K_LOOP);
			setState(849); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(848);
				statement();
				}
				}
				setState(851); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -9206704192179715544L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 565148980871169L) != 0) );
			setState(853);
			match(K_END);
			setState(854);
			match(K_LOOP);
			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(855);
				label();
				}
			}

			setState(858);
			match(SEMI);
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
	public static class Case_statementContext extends ParserRuleContext {
		public Simple_case_statementContext simple_case_statement() {
			return getRuleContext(Simple_case_statementContext.class,0);
		}
		public Searched_case_statementContext searched_case_statement() {
			return getRuleContext(Searched_case_statementContext.class,0);
		}
		public Case_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterCase_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitCase_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitCase_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_statementContext case_statement() throws RecognitionException {
		Case_statementContext _localctx = new Case_statementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_case_statement);
		try {
			setState(862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(860);
				simple_case_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(861);
				searched_case_statement();
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
	public static class Simple_case_statementContext extends ParserRuleContext {
		public List<TerminalNode> K_CASE() { return getTokens(PLSQLParser.K_CASE); }
		public TerminalNode K_CASE(int i) {
			return getToken(PLSQLParser.K_CASE, i);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode K_END() { return getToken(PLSQLParser.K_END, 0); }
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(PLSQLParser.K_WHEN); }
		public TerminalNode K_WHEN(int i) {
			return getToken(PLSQLParser.K_WHEN, i);
		}
		public List<Selector_valueContext> selector_value() {
			return getRuleContexts(Selector_valueContext.class);
		}
		public Selector_valueContext selector_value(int i) {
			return getRuleContext(Selector_valueContext.class,i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(PLSQLParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(PLSQLParser.K_THEN, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode K_ELSE() { return getToken(PLSQLParser.K_ELSE, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Simple_case_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_case_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterSimple_case_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitSimple_case_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitSimple_case_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_case_statementContext simple_case_statement() throws RecognitionException {
		Simple_case_statementContext _localctx = new Simple_case_statementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_simple_case_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			match(K_CASE);
			setState(865);
			selector();
			setState(871); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(866);
				match(K_WHEN);
				setState(867);
				selector_value();
				setState(868);
				match(K_THEN);
				setState(869);
				statement();
				}
				}
				setState(873); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_WHEN );
			setState(881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ELSE) {
				{
				setState(875);
				match(K_ELSE);
				setState(877); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(876);
					statement();
					}
					}
					setState(879); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -9206704192179715544L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 565148980871169L) != 0) );
				}
			}

			setState(883);
			match(K_END);
			setState(884);
			match(K_CASE);
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(885);
				label();
				}
			}

			setState(888);
			match(SEMI);
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
	public static class Searched_case_statementContext extends ParserRuleContext {
		public List<TerminalNode> K_CASE() { return getTokens(PLSQLParser.K_CASE); }
		public TerminalNode K_CASE(int i) {
			return getToken(PLSQLParser.K_CASE, i);
		}
		public TerminalNode K_END() { return getToken(PLSQLParser.K_END, 0); }
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(PLSQLParser.K_WHEN); }
		public TerminalNode K_WHEN(int i) {
			return getToken(PLSQLParser.K_WHEN, i);
		}
		public List<Boolean_expressionContext> boolean_expression() {
			return getRuleContexts(Boolean_expressionContext.class);
		}
		public Boolean_expressionContext boolean_expression(int i) {
			return getRuleContext(Boolean_expressionContext.class,i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(PLSQLParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(PLSQLParser.K_THEN, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode K_ELSE() { return getToken(PLSQLParser.K_ELSE, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Searched_case_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searched_case_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterSearched_case_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitSearched_case_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitSearched_case_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Searched_case_statementContext searched_case_statement() throws RecognitionException {
		Searched_case_statementContext _localctx = new Searched_case_statementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_searched_case_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			match(K_CASE);
			setState(896); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(891);
				match(K_WHEN);
				setState(892);
				boolean_expression();
				setState(893);
				match(K_THEN);
				setState(894);
				statement();
				}
				}
				setState(898); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_WHEN );
			setState(906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ELSE) {
				{
				setState(900);
				match(K_ELSE);
				setState(902); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(901);
					statement();
					}
					}
					setState(904); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -9206704192179715544L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 565148980871169L) != 0) );
				}
			}

			setState(908);
			match(K_END);
			setState(909);
			match(K_CASE);
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(910);
				label();
				}
			}

			setState(913);
			match(SEMI);
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
	public static class Close_statementContext extends ParserRuleContext {
		public TerminalNode K_CLOSE() { return getToken(PLSQLParser.K_CLOSE, 0); }
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public CursorContext cursor() {
			return getRuleContext(CursorContext.class,0);
		}
		public Cursor_variableContext cursor_variable() {
			return getRuleContext(Cursor_variableContext.class,0);
		}
		public Close_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterClose_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitClose_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitClose_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Close_statementContext close_statement() throws RecognitionException {
		Close_statementContext _localctx = new Close_statementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_close_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			match(K_CLOSE);
			setState(918);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(916);
				cursor();
				}
				break;
			case 2:
				{
				setState(917);
				cursor_variable();
				}
				break;
			}
			setState(920);
			match(SEMI);
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
	public static class Continue_statementContext extends ParserRuleContext {
		public TerminalNode K_CONTINUE() { return getToken(PLSQLParser.K_CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode K_WHEN() { return getToken(PLSQLParser.K_WHEN, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public Continue_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterContinue_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitContinue_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitContinue_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_statementContext continue_statement() throws RecognitionException {
		Continue_statementContext _localctx = new Continue_statementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_continue_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			match(K_CONTINUE);
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(923);
				label();
				}
			}

			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(926);
				match(K_WHEN);
				setState(927);
				boolean_expression();
				}
			}

			setState(930);
			match(SEMI);
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
	public static class Execute_immediate_statementContext extends ParserRuleContext {
		public TerminalNode K_EXECUTE() { return getToken(PLSQLParser.K_EXECUTE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(PLSQLParser.K_IMMEDIATE, 0); }
		public Dynamic_sql_stmtContext dynamic_sql_stmt() {
			return getRuleContext(Dynamic_sql_stmtContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public Execute_immediate_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute_immediate_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterExecute_immediate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitExecute_immediate_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitExecute_immediate_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Execute_immediate_statementContext execute_immediate_statement() throws RecognitionException {
		Execute_immediate_statementContext _localctx = new Execute_immediate_statementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_execute_immediate_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			match(K_EXECUTE);
			setState(933);
			match(K_IMMEDIATE);
			setState(934);
			dynamic_sql_stmt();
			setState(935);
			match(SEMI);
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
	public static class Plsql_blockContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> DOUBLE_L() { return getTokens(PLSQLParser.DOUBLE_L); }
		public TerminalNode DOUBLE_L(int i) {
			return getToken(PLSQLParser.DOUBLE_L, i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<TerminalNode> DOUBLE_G() { return getTokens(PLSQLParser.DOUBLE_G); }
		public TerminalNode DOUBLE_G(int i) {
			return getToken(PLSQLParser.DOUBLE_G, i);
		}
		public TerminalNode K_DECLARE() { return getToken(PLSQLParser.K_DECLARE, 0); }
		public Declare_sectionContext declare_section() {
			return getRuleContext(Declare_sectionContext.class,0);
		}
		public Plsql_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plsql_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterPlsql_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitPlsql_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitPlsql_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Plsql_blockContext plsql_block() throws RecognitionException {
		Plsql_blockContext _localctx = new Plsql_blockContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_plsql_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOUBLE_L) {
				{
				{
				setState(937);
				match(DOUBLE_L);
				setState(938);
				label();
				setState(939);
				match(DOUBLE_G);
				}
				}
				setState(945);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DECLARE) {
				{
				setState(946);
				match(K_DECLARE);
				setState(947);
				declare_section();
				}
			}

			setState(950);
			body();
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
	public static class Dynamic_sql_stmtContext extends ParserRuleContext {
		public List<TerminalNode> SINGLE_QUOTE_STRING() { return getTokens(PLSQLParser.SINGLE_QUOTE_STRING); }
		public TerminalNode SINGLE_QUOTE_STRING(int i) {
			return getToken(PLSQLParser.SINGLE_QUOTE_STRING, i);
		}
		public List<TerminalNode> Q_ESCAPE_STRING() { return getTokens(PLSQLParser.Q_ESCAPE_STRING); }
		public TerminalNode Q_ESCAPE_STRING(int i) {
			return getToken(PLSQLParser.Q_ESCAPE_STRING, i);
		}
		public List<TerminalNode> ID() { return getTokens(PLSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PLSQLParser.ID, i);
		}
		public List<TerminalNode> DOUBLE_PIPE() { return getTokens(PLSQLParser.DOUBLE_PIPE); }
		public TerminalNode DOUBLE_PIPE(int i) {
			return getToken(PLSQLParser.DOUBLE_PIPE, i);
		}
		public Dynamic_sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterDynamic_sql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitDynamic_sql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitDynamic_sql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dynamic_sql_stmtContext dynamic_sql_stmt() throws RecognitionException {
		Dynamic_sql_stmtContext _localctx = new Dynamic_sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_dynamic_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			_la = _input.LA(1);
			if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & 49L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(957);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOUBLE_PIPE) {
				{
				{
				setState(953);
				match(DOUBLE_PIPE);
				setState(954);
				_la = _input.LA(1);
				if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & 49L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(959);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Into_clauseContext extends ParserRuleContext {
		public TerminalNode K_INTO() { return getToken(PLSQLParser.K_INTO, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public RecordContext record() {
			return getRuleContext(RecordContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PLSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PLSQLParser.COMMA, i);
		}
		public Into_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_into_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterInto_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitInto_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitInto_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Into_clauseContext into_clause() throws RecognitionException {
		Into_clauseContext _localctx = new Into_clauseContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_into_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			match(K_INTO);
			setState(970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(961);
				variable();
				setState(966);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(962);
					match(COMMA);
					setState(963);
					variable();
					}
					}
					setState(968);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(969);
				record();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Exit_statementContext extends ParserRuleContext {
		public TerminalNode K_EXIT() { return getToken(PLSQLParser.K_EXIT, 0); }
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode K_WHEN() { return getToken(PLSQLParser.K_WHEN, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public Exit_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterExit_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitExit_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitExit_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exit_statementContext exit_statement() throws RecognitionException {
		Exit_statementContext _localctx = new Exit_statementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_exit_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			match(K_EXIT);
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(973);
				label();
				}
			}

			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(976);
				match(K_WHEN);
				setState(977);
				boolean_expression();
				}
			}

			setState(980);
			match(SEMI);
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
	public static class Fetch_statementContext extends ParserRuleContext {
		public TerminalNode K_FETCH() { return getToken(PLSQLParser.K_FETCH, 0); }
		public Into_clauseContext into_clause() {
			return getRuleContext(Into_clauseContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public CursorContext cursor() {
			return getRuleContext(CursorContext.class,0);
		}
		public Cursor_variableContext cursor_variable() {
			return getRuleContext(Cursor_variableContext.class,0);
		}
		public Fetch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterFetch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitFetch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitFetch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fetch_statementContext fetch_statement() throws RecognitionException {
		Fetch_statementContext _localctx = new Fetch_statementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_fetch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			match(K_FETCH);
			setState(985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(983);
				cursor();
				}
				break;
			case 2:
				{
				setState(984);
				cursor_variable();
				}
				break;
			}
			setState(987);
			into_clause();
			setState(988);
			match(SEMI);
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
	public static class For_loop_statementContext extends ParserRuleContext {
		public TerminalNode K_FOR() { return getToken(PLSQLParser.K_FOR, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public TerminalNode K_IN() { return getToken(PLSQLParser.K_IN, 0); }
		public Lower_boundContext lower_bound() {
			return getRuleContext(Lower_boundContext.class,0);
		}
		public TerminalNode DOUBLE_DOT() { return getToken(PLSQLParser.DOUBLE_DOT, 0); }
		public Upper_boundContext upper_bound() {
			return getRuleContext(Upper_boundContext.class,0);
		}
		public List<TerminalNode> K_LOOP() { return getTokens(PLSQLParser.K_LOOP); }
		public TerminalNode K_LOOP(int i) {
			return getToken(PLSQLParser.K_LOOP, i);
		}
		public TerminalNode K_END() { return getToken(PLSQLParser.K_END, 0); }
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public TerminalNode K_REVERSE() { return getToken(PLSQLParser.K_REVERSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public For_loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterFor_loop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitFor_loop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitFor_loop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loop_statementContext for_loop_statement() throws RecognitionException {
		For_loop_statementContext _localctx = new For_loop_statementContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_for_loop_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			match(K_FOR);
			setState(991);
			index();
			setState(992);
			match(K_IN);
			setState(994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_REVERSE) {
				{
				setState(993);
				match(K_REVERSE);
				}
			}

			setState(996);
			lower_bound();
			setState(997);
			match(DOUBLE_DOT);
			setState(998);
			upper_bound();
			setState(999);
			match(K_LOOP);
			setState(1001); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1000);
				statement();
				}
				}
				setState(1003); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -9206704192179715544L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 565148980871169L) != 0) );
			setState(1005);
			match(K_END);
			setState(1006);
			match(K_LOOP);
			setState(1008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(1007);
				label();
				}
			}

			setState(1010);
			match(SEMI);
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
	public static class Cursor_for_loop_statementContext extends ParserRuleContext {
		public TerminalNode K_FOR() { return getToken(PLSQLParser.K_FOR, 0); }
		public RecordContext record() {
			return getRuleContext(RecordContext.class,0);
		}
		public TerminalNode K_IN() { return getToken(PLSQLParser.K_IN, 0); }
		public List<TerminalNode> K_LOOP() { return getTokens(PLSQLParser.K_LOOP); }
		public TerminalNode K_LOOP(int i) {
			return getToken(PLSQLParser.K_LOOP, i);
		}
		public TerminalNode K_END() { return getToken(PLSQLParser.K_END, 0); }
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public CursorContext cursor() {
			return getRuleContext(CursorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PLSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PLSQLParser.COMMA, i);
		}
		public Cursor_for_loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_for_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterCursor_for_loop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitCursor_for_loop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitCursor_for_loop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_for_loop_statementContext cursor_for_loop_statement() throws RecognitionException {
		Cursor_for_loop_statementContext _localctx = new Cursor_for_loop_statementContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_cursor_for_loop_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			match(K_FOR);
			setState(1013);
			record();
			setState(1014);
			match(K_IN);
			setState(1033);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(1015);
				cursor();
				setState(1027);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1016);
					match(LPAREN);
					setState(1017);
					parameter();
					setState(1022);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1018);
						match(COMMA);
						setState(1019);
						parameter();
						}
						}
						setState(1024);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1025);
					match(RPAREN);
					}
				}

				}
				break;
			case LPAREN:
				{
				setState(1029);
				match(LPAREN);
				setState(1030);
				select_statement();
				setState(1031);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1035);
			match(K_LOOP);
			setState(1037); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1036);
				statement();
				}
				}
				setState(1039); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -9206704192179715544L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 565148980871169L) != 0) );
			setState(1041);
			match(K_END);
			setState(1042);
			match(K_LOOP);
			setState(1044);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(1043);
				label();
				}
			}

			setState(1046);
			match(SEMI);
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
	public static class Lower_boundContext extends ParserRuleContext {
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public Numeric_variableContext numeric_variable() {
			return getRuleContext(Numeric_variableContext.class,0);
		}
		public Numeric_expressionContext numeric_expression() {
			return getRuleContext(Numeric_expressionContext.class,0);
		}
		public Lower_boundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lower_bound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterLower_bound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitLower_bound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitLower_bound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lower_boundContext lower_bound() throws RecognitionException {
		Lower_boundContext _localctx = new Lower_boundContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_lower_bound);
		try {
			setState(1051);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1048);
				numeric_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1049);
				numeric_variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1050);
				numeric_expression();
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
	public static class Upper_boundContext extends ParserRuleContext {
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public Numeric_variableContext numeric_variable() {
			return getRuleContext(Numeric_variableContext.class,0);
		}
		public Numeric_expressionContext numeric_expression() {
			return getRuleContext(Numeric_expressionContext.class,0);
		}
		public Upper_boundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upper_bound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterUpper_bound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitUpper_bound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitUpper_bound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Upper_boundContext upper_bound() throws RecognitionException {
		Upper_boundContext _localctx = new Upper_boundContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_upper_bound);
		try {
			setState(1056);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1053);
				numeric_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1054);
				numeric_variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1055);
				numeric_expression();
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
	public static class Goto_statementContext extends ParserRuleContext {
		public TerminalNode K_GOTO() { return getToken(PLSQLParser.K_GOTO, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public Goto_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goto_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterGoto_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitGoto_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitGoto_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Goto_statementContext goto_statement() throws RecognitionException {
		Goto_statementContext _localctx = new Goto_statementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_goto_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			match(K_GOTO);
			setState(1059);
			label();
			setState(1060);
			match(SEMI);
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
	public static class If_statementContext extends ParserRuleContext {
		public List<TerminalNode> K_IF() { return getTokens(PLSQLParser.K_IF); }
		public TerminalNode K_IF(int i) {
			return getToken(PLSQLParser.K_IF, i);
		}
		public List<Boolean_expressionContext> boolean_expression() {
			return getRuleContexts(Boolean_expressionContext.class);
		}
		public Boolean_expressionContext boolean_expression(int i) {
			return getRuleContext(Boolean_expressionContext.class,i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(PLSQLParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(PLSQLParser.K_THEN, i);
		}
		public TerminalNode K_END() { return getToken(PLSQLParser.K_END, 0); }
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> K_ELSIF() { return getTokens(PLSQLParser.K_ELSIF); }
		public TerminalNode K_ELSIF(int i) {
			return getToken(PLSQLParser.K_ELSIF, i);
		}
		public TerminalNode K_ELSE() { return getToken(PLSQLParser.K_ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			match(K_IF);
			setState(1063);
			boolean_expression();
			setState(1064);
			match(K_THEN);
			setState(1066); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1065);
				statement();
				}
				}
				setState(1068); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -9206704192179715544L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 565148980871169L) != 0) );
			setState(1080);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_ELSIF) {
				{
				{
				setState(1070);
				match(K_ELSIF);
				setState(1071);
				boolean_expression();
				setState(1072);
				match(K_THEN);
				setState(1074); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1073);
					statement();
					}
					}
					setState(1076); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -9206704192179715544L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 565148980871169L) != 0) );
				}
				}
				setState(1082);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1089);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ELSE) {
				{
				setState(1083);
				match(K_ELSE);
				setState(1085); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1084);
					statement();
					}
					}
					setState(1087); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -9206704192179715544L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 565148980871169L) != 0) );
				}
			}

			setState(1091);
			match(K_END);
			setState(1092);
			match(K_IF);
			setState(1093);
			match(SEMI);
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
	public static class Null_statementContext extends ParserRuleContext {
		public TerminalNode K_NULL() { return getToken(PLSQLParser.K_NULL, 0); }
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public Null_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterNull_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitNull_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitNull_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_statementContext null_statement() throws RecognitionException {
		Null_statementContext _localctx = new Null_statementContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_null_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			match(K_NULL);
			setState(1096);
			match(SEMI);
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
	public static class Open_for_statementContext extends ParserRuleContext {
		public TerminalNode K_OPEN() { return getToken(PLSQLParser.K_OPEN, 0); }
		public Cursor_variableContext cursor_variable() {
			return getRuleContext(Cursor_variableContext.class,0);
		}
		public TerminalNode K_FOR() { return getToken(PLSQLParser.K_FOR, 0); }
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Dynamic_selectContext dynamic_select() {
			return getRuleContext(Dynamic_selectContext.class,0);
		}
		public Open_for_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterOpen_for_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitOpen_for_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitOpen_for_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_for_statementContext open_for_statement() throws RecognitionException {
		Open_for_statementContext _localctx = new Open_for_statementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_open_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1098);
			match(K_OPEN);
			setState(1099);
			cursor_variable();
			setState(1100);
			match(K_FOR);
			setState(1103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				{
				setState(1101);
				select_statement();
				}
				break;
			case ID:
			case SINGLE_QUOTE_STRING:
			case Q_ESCAPE_STRING:
				{
				setState(1102);
				dynamic_select();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1105);
			match(SEMI);
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
	public static class Open_statementContext extends ParserRuleContext {
		public TerminalNode K_OPEN() { return getToken(PLSQLParser.K_OPEN, 0); }
		public CursorContext cursor() {
			return getRuleContext(CursorContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PLSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PLSQLParser.COMMA, i);
		}
		public Open_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterOpen_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitOpen_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitOpen_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_statementContext open_statement() throws RecognitionException {
		Open_statementContext _localctx = new Open_statementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_open_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			match(K_OPEN);
			setState(1108);
			cursor();
			setState(1120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1109);
				match(LPAREN);
				setState(1110);
				parameter();
				setState(1115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1111);
					match(COMMA);
					setState(1112);
					parameter();
					}
					}
					setState(1117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1118);
				match(RPAREN);
				}
			}

			setState(1122);
			match(SEMI);
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
	public static class Dynamic_selectContext extends ParserRuleContext {
		public Character_expressionContext character_expression() {
			return getRuleContext(Character_expressionContext.class,0);
		}
		public Dynamic_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterDynamic_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitDynamic_select(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitDynamic_select(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dynamic_selectContext dynamic_select() throws RecognitionException {
		Dynamic_selectContext _localctx = new Dynamic_selectContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_dynamic_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			character_expression();
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
	public static class Procedure_callContext extends ParserRuleContext {
		public ProcedureContext procedure() {
			return getRuleContext(ProcedureContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PLSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PLSQLParser.COMMA, i);
		}
		public Procedure_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterProcedure_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitProcedure_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitProcedure_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_callContext procedure_call() throws RecognitionException {
		Procedure_callContext _localctx = new Procedure_callContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_procedure_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1126);
			procedure();
			setState(1139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1127);
				match(LPAREN);
				setState(1136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4430758656L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 7177706397556743L) != 0)) {
					{
					setState(1128);
					parameter();
					setState(1133);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1129);
						match(COMMA);
						setState(1130);
						parameter();
						}
						}
						setState(1135);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1138);
				match(RPAREN);
				}
			}

			setState(1141);
			match(SEMI);
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
	public static class Variable_declarationContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PLSQLParser.ASSIGN, 0); }
		public TerminalNode K_DEFAULT() { return getToken(PLSQLParser.K_DEFAULT, 0); }
		public TerminalNode K_NOT() { return getToken(PLSQLParser.K_NOT, 0); }
		public TerminalNode K_NULL() { return getToken(PLSQLParser.K_NULL, 0); }
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			variable();
			setState(1144);
			datatype();
			setState(1151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DEFAULT || _la==K_NOT || _la==ASSIGN) {
				{
				setState(1147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1145);
					match(K_NOT);
					setState(1146);
					match(K_NULL);
					}
				}

				setState(1149);
				_la = _input.LA(1);
				if ( !(_la==K_DEFAULT || _la==ASSIGN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1150);
				expression(0);
				}
			}

			setState(1153);
			match(SEMI);
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
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLSQLParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			match(ID);
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
	public static class DatatypeContext extends ParserRuleContext {
		public Scalar_datatypeContext scalar_datatype() {
			return getRuleContext(Scalar_datatypeContext.class,0);
		}
		public Type_attributeContext type_attribute() {
			return getRuleContext(Type_attributeContext.class,0);
		}
		public Rowtype_attributeContext rowtype_attribute() {
			return getRuleContext(Rowtype_attributeContext.class,0);
		}
		public User_define_typeContext user_define_type() {
			return getRuleContext(User_define_typeContext.class,0);
		}
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitDatatype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_datatype);
		try {
			setState(1161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1157);
				scalar_datatype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1158);
				type_attribute();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1159);
				rowtype_attribute();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1160);
				user_define_type();
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
	public static class User_define_typeContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PLSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PLSQLParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(PLSQLParser.DOT, 0); }
		public User_define_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_define_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterUser_define_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitUser_define_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitUser_define_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final User_define_typeContext user_define_type() throws RecognitionException {
		User_define_typeContext _localctx = new User_define_typeContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_user_define_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1163);
				match(ID);
				setState(1164);
				match(DOT);
				}
				break;
			}
			setState(1167);
			match(ID);
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
	public static class Raise_statementContext extends ParserRuleContext {
		public TerminalNode K_RAISE() { return getToken(PLSQLParser.K_RAISE, 0); }
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public Exception_Context exception_() {
			return getRuleContext(Exception_Context.class,0);
		}
		public Raise_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterRaise_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitRaise_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitRaise_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_statementContext raise_statement() throws RecognitionException {
		Raise_statementContext _localctx = new Raise_statementContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_raise_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169);
			match(K_RAISE);
			setState(1171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(1170);
				exception_();
				}
			}

			setState(1173);
			match(SEMI);
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
	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode K_RETURN() { return getToken(PLSQLParser.K_RETURN, 0); }
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175);
			match(K_RETURN);
			setState(1177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4430758656L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 7177637678080007L) != 0)) {
				{
				setState(1176);
				expression(0);
				}
			}

			setState(1179);
			match(SEMI);
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
	public static class Select_into_statementContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(PLSQLParser.K_SELECT, 0); }
		public TerminalNode K_INTO() { return getToken(PLSQLParser.K_INTO, 0); }
		public List<TerminalNode> SEMI() { return getTokens(PLSQLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PLSQLParser.SEMI, i);
		}
		public Select_into_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_into_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterSelect_into_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitSelect_into_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitSelect_into_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_into_statementContext select_into_statement() throws RecognitionException {
		Select_into_statementContext _localctx = new Select_into_statementContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_select_into_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
			match(K_SELECT);
			setState(1185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1182);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==SEMI) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(1187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			}
			setState(1188);
			match(K_INTO);
			setState(1192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1189);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==SEMI) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(1194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			}
			setState(1195);
			match(SEMI);
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
	public static class Table_referenceContext extends ParserRuleContext {
		public Db_table_or_viewContext db_table_or_view() {
			return getRuleContext(Db_table_or_viewContext.class,0);
		}
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PLSQLParser.DOT, 0); }
		public Table_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterTable_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitTable_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitTable_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_referenceContext table_reference() throws RecognitionException {
		Table_referenceContext _localctx = new Table_referenceContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_table_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1197);
				schema();
				setState(1198);
				match(DOT);
				}
				break;
			}
			setState(1202);
			db_table_or_view();
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
	public static class SubqueryContext extends ParserRuleContext {
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
			select_statement();
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
	public static class Sql_statementContext extends ParserRuleContext {
		public Commit_statementContext commit_statement() {
			return getRuleContext(Commit_statementContext.class,0);
		}
		public Delete_statementContext delete_statement() {
			return getRuleContext(Delete_statementContext.class,0);
		}
		public Insert_statementContext insert_statement() {
			return getRuleContext(Insert_statementContext.class,0);
		}
		public Rollback_statementContext rollback_statement() {
			return getRuleContext(Rollback_statementContext.class,0);
		}
		public Update_statementContext update_statement() {
			return getRuleContext(Update_statementContext.class,0);
		}
		public Merge_statementContext merge_statement() {
			return getRuleContext(Merge_statementContext.class,0);
		}
		public Sql_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterSql_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitSql_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitSql_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_statementContext sql_statement() throws RecognitionException {
		Sql_statementContext _localctx = new Sql_statementContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_sql_statement);
		try {
			setState(1212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_COMMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1206);
				commit_statement();
				}
				break;
			case K_DELETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1207);
				delete_statement();
				}
				break;
			case K_INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1208);
				insert_statement();
				}
				break;
			case K_ROLLBACK:
				enterOuterAlt(_localctx, 4);
				{
				setState(1209);
				rollback_statement();
				}
				break;
			case K_UPDATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1210);
				update_statement();
				}
				break;
			case K_MERGE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1211);
				merge_statement();
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
	public static class Commit_statementContext extends ParserRuleContext {
		public TerminalNode K_COMMIT() { return getToken(PLSQLParser.K_COMMIT, 0); }
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public Commit_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterCommit_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitCommit_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitCommit_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Commit_statementContext commit_statement() throws RecognitionException {
		Commit_statementContext _localctx = new Commit_statementContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_commit_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			match(K_COMMIT);
			setState(1215);
			match(SEMI);
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
	public static class Rollback_statementContext extends ParserRuleContext {
		public TerminalNode K_ROLLBACK() { return getToken(PLSQLParser.K_ROLLBACK, 0); }
		public TerminalNode SEMI() { return getToken(PLSQLParser.SEMI, 0); }
		public Rollback_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterRollback_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitRollback_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitRollback_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rollback_statementContext rollback_statement() throws RecognitionException {
		Rollback_statementContext _localctx = new Rollback_statementContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_rollback_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			match(K_ROLLBACK);
			setState(1218);
			match(SEMI);
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
	public static class Delete_statementContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(PLSQLParser.K_DELETE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(PLSQLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PLSQLParser.SEMI, i);
		}
		public Delete_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterDelete_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitDelete_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitDelete_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_statementContext delete_statement() throws RecognitionException {
		Delete_statementContext _localctx = new Delete_statementContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_delete_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			match(K_DELETE);
			setState(1224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1221);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==SEMI) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(1226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			}
			setState(1227);
			match(SEMI);
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
	public static class Insert_statementContext extends ParserRuleContext {
		public TerminalNode K_INSERT() { return getToken(PLSQLParser.K_INSERT, 0); }
		public List<TerminalNode> SEMI() { return getTokens(PLSQLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PLSQLParser.SEMI, i);
		}
		public Insert_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterInsert_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitInsert_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitInsert_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_statementContext insert_statement() throws RecognitionException {
		Insert_statementContext _localctx = new Insert_statementContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_insert_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			match(K_INSERT);
			setState(1233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1230);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==SEMI) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(1235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			}
			setState(1236);
			match(SEMI);
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
	public static class Update_statementContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(PLSQLParser.K_UPDATE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(PLSQLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PLSQLParser.SEMI, i);
		}
		public Update_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterUpdate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitUpdate_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitUpdate_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_statementContext update_statement() throws RecognitionException {
		Update_statementContext _localctx = new Update_statementContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_update_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
			match(K_UPDATE);
			setState(1242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1239);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==SEMI) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(1244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			}
			setState(1245);
			match(SEMI);
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
	public static class Merge_statementContext extends ParserRuleContext {
		public TerminalNode K_MERGE() { return getToken(PLSQLParser.K_MERGE, 0); }
		public TerminalNode K_INTO() { return getToken(PLSQLParser.K_INTO, 0); }
		public List<TerminalNode> SEMI() { return getTokens(PLSQLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PLSQLParser.SEMI, i);
		}
		public Merge_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_merge_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterMerge_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitMerge_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitMerge_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Merge_statementContext merge_statement() throws RecognitionException {
		Merge_statementContext _localctx = new Merge_statementContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_merge_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1247);
			match(K_MERGE);
			setState(1248);
			match(K_INTO);
			setState(1252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1249);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==SEMI) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(1254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			}
			setState(1255);
			match(SEMI);
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
	public static class FunctionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PLSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PLSQLParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(PLSQLParser.DOT, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1257);
				match(ID);
				setState(1258);
				match(DOT);
				}
				break;
			}
			setState(1261);
			match(ID);
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
	public static class CursorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLSQLParser.ID, 0); }
		public CursorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterCursor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitCursor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitCursor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CursorContext cursor() throws RecognitionException {
		CursorContext _localctx = new CursorContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_cursor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			match(ID);
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
	public static class Cursor_variableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLSQLParser.ID, 0); }
		public Cursor_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterCursor_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitCursor_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitCursor_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_variableContext cursor_variable() throws RecognitionException {
		Cursor_variableContext _localctx = new Cursor_variableContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_cursor_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1265);
			match(ID);
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
	public static class RecordContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLSQLParser.ID, 0); }
		public RecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterRecord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitRecord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitRecord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordContext record() throws RecognitionException {
		RecordContext _localctx = new RecordContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_record);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1267);
			match(ID);
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
	public static class FieldContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLSQLParser.ID, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1269);
			match(ID);
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
	public static class Db_table_or_viewContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLSQLParser.ID, 0); }
		public Db_table_or_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db_table_or_view; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterDb_table_or_view(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitDb_table_or_view(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitDb_table_or_view(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Db_table_or_viewContext db_table_or_view() throws RecognitionException {
		Db_table_or_viewContext _localctx = new Db_table_or_viewContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_db_table_or_view);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			match(ID);
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
	public static class Collection_typeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLSQLParser.ID, 0); }
		public Collection_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterCollection_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitCollection_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitCollection_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collection_typeContext collection_type() throws RecognitionException {
		Collection_typeContext _localctx = new Collection_typeContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_collection_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			match(ID);
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
	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLSQLParser.ID, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			match(ID);
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
	public static class Exception_Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLSQLParser.ID, 0); }
		public Exception_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterException_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitException_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitException_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_Context exception_() throws RecognitionException {
		Exception_Context _localctx = new Exception_Context(_ctx, getState());
		enterRule(_localctx, 228, RULE_exception_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			match(ID);
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
	public static class ProcedureContext extends ParserRuleContext {
		public Procedure_nameContext procedure_name() {
			return getRuleContext(Procedure_nameContext.class,0);
		}
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PLSQLParser.DOT, 0); }
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1279);
				schema();
				setState(1280);
				match(DOT);
				}
				break;
			}
			setState(1284);
			procedure_name();
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
	public static class Collection_variableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLSQLParser.ID, 0); }
		public Collection_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterCollection_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitCollection_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitCollection_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collection_variableContext collection_variable() throws RecognitionException {
		Collection_variableContext _localctx = new Collection_variableContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_collection_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			match(ID);
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
	public static class NameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLSQLParser.ID, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			match(ID);
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
	public static class LabelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLSQLParser.ID, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			match(ID);
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
	public static class Scalar_datatypeContext extends ParserRuleContext {
		public TerminalNode K_VARCHAR2() { return getToken(PLSQLParser.K_VARCHAR2, 0); }
		public TerminalNode K_CHAR() { return getToken(PLSQLParser.K_CHAR, 0); }
		public TerminalNode K_VARCHAR() { return getToken(PLSQLParser.K_VARCHAR, 0); }
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public List<SizeContext> size() {
			return getRuleContexts(SizeContext.class);
		}
		public SizeContext size(int i) {
			return getRuleContext(SizeContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public TerminalNode K_NUMBER() { return getToken(PLSQLParser.K_NUMBER, 0); }
		public TerminalNode COMMA() { return getToken(PLSQLParser.COMMA, 0); }
		public TerminalNode K_INT() { return getToken(PLSQLParser.K_INT, 0); }
		public TerminalNode K_INTEGER() { return getToken(PLSQLParser.K_INTEGER, 0); }
		public TerminalNode K_BOOLEAN() { return getToken(PLSQLParser.K_BOOLEAN, 0); }
		public TerminalNode K_DATE() { return getToken(PLSQLParser.K_DATE, 0); }
		public TerminalNode K_TIMESTAMP() { return getToken(PLSQLParser.K_TIMESTAMP, 0); }
		public TerminalNode K_BLOB() { return getToken(PLSQLParser.K_BLOB, 0); }
		public TerminalNode K_CLOB() { return getToken(PLSQLParser.K_CLOB, 0); }
		public Scalar_datatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterScalar_datatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitScalar_datatype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitScalar_datatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scalar_datatypeContext scalar_datatype() throws RecognitionException {
		Scalar_datatypeContext _localctx = new Scalar_datatypeContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_scalar_datatype);
		int _la;
		try {
			setState(1317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_VARCHAR2:
			case K_CHAR:
			case K_VARCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1292);
				_la = _input.LA(1);
				if ( !(((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 2097155L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1293);
					match(LPAREN);
					setState(1294);
					size();
					setState(1295);
					match(RPAREN);
					}
				}

				}
				break;
			case K_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1299);
				match(K_NUMBER);
				setState(1308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1300);
					match(LPAREN);
					setState(1301);
					size();
					setState(1304);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1302);
						match(COMMA);
						setState(1303);
						size();
						}
					}

					setState(1306);
					match(RPAREN);
					}
				}

				}
				break;
			case K_INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1310);
				match(K_INT);
				}
				break;
			case K_INTEGER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1311);
				match(K_INTEGER);
				}
				break;
			case K_BOOLEAN:
				enterOuterAlt(_localctx, 5);
				{
				setState(1312);
				match(K_BOOLEAN);
				}
				break;
			case K_DATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1313);
				match(K_DATE);
				}
				break;
			case K_TIMESTAMP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1314);
				match(K_TIMESTAMP);
				}
				break;
			case K_BLOB:
				enterOuterAlt(_localctx, 8);
				{
				setState(1315);
				match(K_BLOB);
				}
				break;
			case K_CLOB:
				enterOuterAlt(_localctx, 9);
				{
				setState(1316);
				match(K_CLOB);
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
	public static class Type_attributeContext extends ParserRuleContext {
		public Variable_or_dbobjContext variable_or_dbobj() {
			return getRuleContext(Variable_or_dbobjContext.class,0);
		}
		public TerminalNode PERCENT() { return getToken(PLSQLParser.PERCENT, 0); }
		public TerminalNode K_TYPE() { return getToken(PLSQLParser.K_TYPE, 0); }
		public Type_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterType_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitType_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitType_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_attributeContext type_attribute() throws RecognitionException {
		Type_attributeContext _localctx = new Type_attributeContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_type_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319);
			variable_or_dbobj();
			setState(1320);
			match(PERCENT);
			setState(1321);
			match(K_TYPE);
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
	public static class Rowtype_attributeContext extends ParserRuleContext {
		public Variable_or_dbobjContext variable_or_dbobj() {
			return getRuleContext(Variable_or_dbobjContext.class,0);
		}
		public TerminalNode PERCENT() { return getToken(PLSQLParser.PERCENT, 0); }
		public TerminalNode K_ROWTYPE() { return getToken(PLSQLParser.K_ROWTYPE, 0); }
		public Rowtype_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowtype_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterRowtype_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitRowtype_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitRowtype_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rowtype_attributeContext rowtype_attribute() throws RecognitionException {
		Rowtype_attributeContext _localctx = new Rowtype_attributeContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_rowtype_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1323);
			variable_or_dbobj();
			setState(1324);
			match(PERCENT);
			setState(1325);
			match(K_ROWTYPE);
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
	public static class SizeContext extends ParserRuleContext {
		public TerminalNode LITERAL_NUMBER() { return getToken(PLSQLParser.LITERAL_NUMBER, 0); }
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			match(LITERAL_NUMBER);
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
	public static class Character_variableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLSQLParser.ID, 0); }
		public Character_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterCharacter_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitCharacter_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitCharacter_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Character_variableContext character_variable() throws RecognitionException {
		Character_variableContext _localctx = new Character_variableContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_character_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1329);
			match(ID);
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
	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLSQLParser.ID, 0); }
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1331);
			match(ID);
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
	public static class Numeric_variableContext extends ParserRuleContext {
		public Variable_or_dbobjContext variable_or_dbobj() {
			return getRuleContext(Variable_or_dbobjContext.class,0);
		}
		public Numeric_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterNumeric_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitNumeric_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitNumeric_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_variableContext numeric_variable() throws RecognitionException {
		Numeric_variableContext _localctx = new Numeric_variableContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_numeric_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			variable_or_dbobj();
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
	public static class Select_statementContext extends ParserRuleContext {
		public Select_clauseContext select_clause() {
			return getRuleContext(Select_clauseContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).enterSelect_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLListener ) ((PLSQLListener)listener).exitSelect_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLVisitor ) return ((PLSQLVisitor<? extends T>)visitor).visitSelect_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_select_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			select_clause();
			setState(1336);
			from_clause();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 30:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 59:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001|\u053b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002"+
		"d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007h\u0002"+
		"i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007m\u0002"+
		"n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007r\u0002"+
		"s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007w\u0002"+
		"x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007|\u0002"+
		"}\u0007}\u0002~\u0007~\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u0102\b\u0000\n\u0000\f\u0000\u0105\t\u0000\u0001\u0000\u0003\u0000\u0108"+
		"\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u010d\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0113\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"\u011a\b\u0001\n\u0001\f\u0001\u011d\t\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u0121\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0125\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u012f\b\u0004\u0001\u0004\u0003\u0004"+
		"\u0132\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u013a\b\u0006\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u0143\b\b\u000b\b\f\b\u0144\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u014a\b\t\u0001\n\u0001\n\u0001\n\u0003\n\u014f"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u016d\b\u0010\n\u0010\f\u0010\u0170\t\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u0174\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0178\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0180\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u0185\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u018a\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0194\b\u0013\n\u0013"+
		"\f\u0013\u0197\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01b3\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u01c1\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u01c7\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01cb\b"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u01d4\b\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0004\u001b\u01dc\b\u001b\u000b"+
		"\u001b\f\u001b\u01dd\u0001\u001b\u0001\u001b\u0004\u001b\u01e2\b\u001b"+
		"\u000b\u001b\f\u001b\u01e3\u0003\u001b\u01e6\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u01ea\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01f2\b\u001c\n\u001c\f\u001c"+
		"\u01f5\t\u001c\u0001\u001c\u0003\u001c\u01f8\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0004\u001c\u01fc\b\u001c\u000b\u001c\f\u001c\u01fd\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0004\u001d\u0204\b\u001d\u000b\u001d"+
		"\f\u001d\u0205\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u020b\b"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u021d"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0229"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u0236\b\u001e\u0001\u001e\u0005\u001e\u0239\b\u001e\n\u001e\f\u001e"+
		"\u023c\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0003"+
		" \u0243\b \u0001 \u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0003#\u024e\b#\u0001$\u0001$\u0001%\u0001%\u0003%\u0254\b%\u0001%\u0003"+
		"%\u0257\b%\u0001%\u0001%\u0001&\u0001&\u0001\'\u0003\'\u025e\b\'\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u0267\b(\n(\f(\u026a"+
		"\t(\u0003(\u026c\b(\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001*\u0001"+
		"*\u0004*\u0276\b*\u000b*\f*\u0277\u0003*\u027a\b*\u0001+\u0001+\u0001"+
		"+\u0003+\u027f\b+\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001/\u0001"+
		"/\u0001/\u0001/\u0004/\u028b\b/\u000b/\f/\u028c\u0003/\u028f\b/\u0001"+
		"0\u00010\u00010\u00030\u0294\b0\u00011\u00011\u00012\u00012\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00043\u02a0\b3\u000b3\f3\u02a1\u00013\u0001"+
		"3\u00033\u02a6\b3\u00013\u00013\u00014\u00014\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00045\u02b3\b5\u000b5\f5\u02b4\u00015\u00015\u0003"+
		"5\u02b9\b5\u00015\u00015\u00016\u00016\u00017\u00017\u00018\u00018\u0001"+
		"8\u00018\u00038\u02c5\b8\u00019\u00019\u00059\u02c9\b9\n9\f9\u02cc\t9"+
		"\u0001:\u0001:\u0005:\u02d0\b:\n:\f:\u02d3\t:\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0003;\u02dc\b;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0003;\u02e5\b;\u0001;\u0001;\u0003;\u02e9\b;\u0001;\u0001"+
		";\u0001;\u0001;\u0003;\u02ef\b;\u0001;\u0003;\u02f2\b;\u0001;\u0001;\u0001"+
		";\u0003;\u02f7\b;\u0001;\u0001;\u0001;\u0003;\u02fc\b;\u0001;\u0001;\u0001"+
		";\u0005;\u0301\b;\n;\f;\u0304\t;\u0001<\u0001<\u0003<\u0308\b<\u0001<"+
		"\u0001<\u0001<\u0001<\u0001<\u0005<\u030f\b<\n<\f<\u0312\t<\u0001<\u0001"+
		"<\u0001=\u0001=\u0001>\u0003>\u0319\b>\u0001>\u0001>\u0003>\u031d\b>\u0001"+
		"?\u0001?\u0001?\u0001?\u0005?\u0323\b?\n?\f?\u0326\t?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0003?\u033f\b?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0003A\u034c\bA\u0001B\u0001B\u0001C\u0001C\u0004"+
		"C\u0352\bC\u000bC\fC\u0353\u0001C\u0001C\u0001C\u0003C\u0359\bC\u0001"+
		"C\u0001C\u0001D\u0001D\u0003D\u035f\bD\u0001E\u0001E\u0001E\u0001E\u0001"+
		"E\u0001E\u0001E\u0004E\u0368\bE\u000bE\fE\u0369\u0001E\u0001E\u0004E\u036e"+
		"\bE\u000bE\fE\u036f\u0003E\u0372\bE\u0001E\u0001E\u0001E\u0003E\u0377"+
		"\bE\u0001E\u0001E\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0004F\u0381"+
		"\bF\u000bF\fF\u0382\u0001F\u0001F\u0004F\u0387\bF\u000bF\fF\u0388\u0003"+
		"F\u038b\bF\u0001F\u0001F\u0001F\u0003F\u0390\bF\u0001F\u0001F\u0001G\u0001"+
		"G\u0001G\u0003G\u0397\bG\u0001G\u0001G\u0001H\u0001H\u0003H\u039d\bH\u0001"+
		"H\u0001H\u0003H\u03a1\bH\u0001H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001J\u0001J\u0001J\u0001J\u0005J\u03ae\bJ\nJ\fJ\u03b1\tJ\u0001J\u0001"+
		"J\u0003J\u03b5\bJ\u0001J\u0001J\u0001K\u0001K\u0001K\u0005K\u03bc\bK\n"+
		"K\fK\u03bf\tK\u0001L\u0001L\u0001L\u0001L\u0005L\u03c5\bL\nL\fL\u03c8"+
		"\tL\u0001L\u0003L\u03cb\bL\u0001M\u0001M\u0003M\u03cf\bM\u0001M\u0001"+
		"M\u0003M\u03d3\bM\u0001M\u0001M\u0001N\u0001N\u0001N\u0003N\u03da\bN\u0001"+
		"N\u0001N\u0001N\u0001O\u0001O\u0001O\u0001O\u0003O\u03e3\bO\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0004O\u03ea\bO\u000bO\fO\u03eb\u0001O\u0001O\u0001"+
		"O\u0003O\u03f1\bO\u0001O\u0001O\u0001P\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0005P\u03fd\bP\nP\fP\u0400\tP\u0001P\u0001P\u0003P\u0404"+
		"\bP\u0001P\u0001P\u0001P\u0001P\u0003P\u040a\bP\u0001P\u0001P\u0004P\u040e"+
		"\bP\u000bP\fP\u040f\u0001P\u0001P\u0001P\u0003P\u0415\bP\u0001P\u0001"+
		"P\u0001Q\u0001Q\u0001Q\u0003Q\u041c\bQ\u0001R\u0001R\u0001R\u0003R\u0421"+
		"\bR\u0001S\u0001S\u0001S\u0001S\u0001T\u0001T\u0001T\u0001T\u0004T\u042b"+
		"\bT\u000bT\fT\u042c\u0001T\u0001T\u0001T\u0001T\u0004T\u0433\bT\u000b"+
		"T\fT\u0434\u0005T\u0437\bT\nT\fT\u043a\tT\u0001T\u0001T\u0004T\u043e\b"+
		"T\u000bT\fT\u043f\u0003T\u0442\bT\u0001T\u0001T\u0001T\u0001T\u0001U\u0001"+
		"U\u0001U\u0001V\u0001V\u0001V\u0001V\u0001V\u0003V\u0450\bV\u0001V\u0001"+
		"V\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0005W\u045a\bW\nW\fW\u045d"+
		"\tW\u0001W\u0001W\u0003W\u0461\bW\u0001W\u0001W\u0001X\u0001X\u0001Y\u0001"+
		"Y\u0001Y\u0001Y\u0001Y\u0005Y\u046c\bY\nY\fY\u046f\tY\u0003Y\u0471\bY"+
		"\u0001Y\u0003Y\u0474\bY\u0001Y\u0001Y\u0001Z\u0001Z\u0001Z\u0001Z\u0003"+
		"Z\u047c\bZ\u0001Z\u0001Z\u0003Z\u0480\bZ\u0001Z\u0001Z\u0001[\u0001[\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0003\\\u048a\b\\\u0001]\u0001]\u0003]\u048e"+
		"\b]\u0001]\u0001]\u0001^\u0001^\u0003^\u0494\b^\u0001^\u0001^\u0001_\u0001"+
		"_\u0003_\u049a\b_\u0001_\u0001_\u0001`\u0001`\u0005`\u04a0\b`\n`\f`\u04a3"+
		"\t`\u0001`\u0001`\u0005`\u04a7\b`\n`\f`\u04aa\t`\u0001`\u0001`\u0001a"+
		"\u0001a\u0001a\u0003a\u04b1\ba\u0001a\u0001a\u0001b\u0001b\u0001c\u0001"+
		"c\u0001c\u0001c\u0001c\u0001c\u0003c\u04bd\bc\u0001d\u0001d\u0001d\u0001"+
		"e\u0001e\u0001e\u0001f\u0001f\u0005f\u04c7\bf\nf\ff\u04ca\tf\u0001f\u0001"+
		"f\u0001g\u0001g\u0005g\u04d0\bg\ng\fg\u04d3\tg\u0001g\u0001g\u0001h\u0001"+
		"h\u0005h\u04d9\bh\nh\fh\u04dc\th\u0001h\u0001h\u0001i\u0001i\u0001i\u0005"+
		"i\u04e3\bi\ni\fi\u04e6\ti\u0001i\u0001i\u0001j\u0001j\u0003j\u04ec\bj"+
		"\u0001j\u0001j\u0001k\u0001k\u0001l\u0001l\u0001m\u0001m\u0001n\u0001"+
		"n\u0001o\u0001o\u0001p\u0001p\u0001q\u0001q\u0001r\u0001r\u0001s\u0001"+
		"s\u0001s\u0003s\u0503\bs\u0001s\u0001s\u0001t\u0001t\u0001u\u0001u\u0001"+
		"v\u0001v\u0001w\u0001w\u0001w\u0001w\u0001w\u0003w\u0512\bw\u0001w\u0001"+
		"w\u0001w\u0001w\u0001w\u0003w\u0519\bw\u0001w\u0001w\u0003w\u051d\bw\u0001"+
		"w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0003w\u0526\bw\u0001x\u0001"+
		"x\u0001x\u0001x\u0001y\u0001y\u0001y\u0001y\u0001z\u0001z\u0001{\u0001"+
		"{\u0001|\u0001|\u0001}\u0001}\u0001~\u0001~\u0001~\u0001~\b\u02ca\u02d1"+
		"\u04a1\u04a8\u04c8\u04d1\u04da\u04e4\u0002<v\u007f\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u0000\u000f"+
		"\u0002\u0000\u0001\u0001\u0007\u0007\u0002\u0000\u0004\u0004ee\u0002\u0000"+
		"77LM\u0002\u0000\n\n\u0016\u0016\u0001\u0000fg\u0001\u0000\u001c\u001f"+
		"\u0002\u0000EGRT\u0003\u0000fgijss\u0002\u0000\t\t\u0013\u0014\u0001\u0000"+
		"xy\u0002\u0000fgij\u0001\u0000__\u0001\u0000mr\u0002\u0000ttxy\u0002\u0000"+
		"78LL\u0585\u0000\u00fe\u0001\u0000\u0000\u0000\u0002\u0109\u0001\u0000"+
		"\u0000\u0000\u0004\u0128\u0001\u0000\u0000\u0000\u0006\u012a\u0001\u0000"+
		"\u0000\u0000\b\u012c\u0001\u0000\u0000\u0000\n\u0135\u0001\u0000\u0000"+
		"\u0000\f\u0139\u0001\u0000\u0000\u0000\u000e\u013b\u0001\u0000\u0000\u0000"+
		"\u0010\u0142\u0001\u0000\u0000\u0000\u0012\u0149\u0001\u0000\u0000\u0000"+
		"\u0014\u014e\u0001\u0000\u0000\u0000\u0016\u0150\u0001\u0000\u0000\u0000"+
		"\u0018\u0154\u0001\u0000\u0000\u0000\u001a\u0156\u0001\u0000\u0000\u0000"+
		"\u001c\u015f\u0001\u0000\u0000\u0000\u001e\u0161\u0001\u0000\u0000\u0000"+
		" \u0166\u0001\u0000\u0000\u0000\"\u017d\u0001\u0000\u0000\u0000$\u0189"+
		"\u0001\u0000\u0000\u0000&\u018b\u0001\u0000\u0000\u0000(\u019b\u0001\u0000"+
		"\u0000\u0000*\u01a5\u0001\u0000\u0000\u0000,\u01a7\u0001\u0000\u0000\u0000"+
		".\u01ad\u0001\u0000\u0000\u00000\u01c2\u0001\u0000\u0000\u00002\u01cc"+
		"\u0001\u0000\u0000\u00004\u01ce\u0001\u0000\u0000\u00006\u01d9\u0001\u0000"+
		"\u0000\u00008\u01ed\u0001\u0000\u0000\u0000:\u01ff\u0001\u0000\u0000\u0000"+
		"<\u021c\u0001\u0000\u0000\u0000>\u023d\u0001\u0000\u0000\u0000@\u0242"+
		"\u0001\u0000\u0000\u0000B\u0247\u0001\u0000\u0000\u0000D\u0249\u0001\u0000"+
		"\u0000\u0000F\u024d\u0001\u0000\u0000\u0000H\u024f\u0001\u0000\u0000\u0000"+
		"J\u0256\u0001\u0000\u0000\u0000L\u025a\u0001\u0000\u0000\u0000N\u025d"+
		"\u0001\u0000\u0000\u0000P\u0261\u0001\u0000\u0000\u0000R\u026f\u0001\u0000"+
		"\u0000\u0000T\u0279\u0001\u0000\u0000\u0000V\u027e\u0001\u0000\u0000\u0000"+
		"X\u0280\u0001\u0000\u0000\u0000Z\u0282\u0001\u0000\u0000\u0000\\\u0284"+
		"\u0001\u0000\u0000\u0000^\u028e\u0001\u0000\u0000\u0000`\u0293\u0001\u0000"+
		"\u0000\u0000b\u0295\u0001\u0000\u0000\u0000d\u0297\u0001\u0000\u0000\u0000"+
		"f\u0299\u0001\u0000\u0000\u0000h\u02a9\u0001\u0000\u0000\u0000j\u02ab"+
		"\u0001\u0000\u0000\u0000l\u02bc\u0001\u0000\u0000\u0000n\u02be\u0001\u0000"+
		"\u0000\u0000p\u02c4\u0001\u0000\u0000\u0000r\u02c6\u0001\u0000\u0000\u0000"+
		"t\u02cd\u0001\u0000\u0000\u0000v\u02fb\u0001\u0000\u0000\u0000x\u0305"+
		"\u0001\u0000\u0000\u0000z\u0315\u0001\u0000\u0000\u0000|\u0318\u0001\u0000"+
		"\u0000\u0000~\u0324\u0001\u0000\u0000\u0000\u0080\u0340\u0001\u0000\u0000"+
		"\u0000\u0082\u034b\u0001\u0000\u0000\u0000\u0084\u034d\u0001\u0000\u0000"+
		"\u0000\u0086\u034f\u0001\u0000\u0000\u0000\u0088\u035e\u0001\u0000\u0000"+
		"\u0000\u008a\u0360\u0001\u0000\u0000\u0000\u008c\u037a\u0001\u0000\u0000"+
		"\u0000\u008e\u0393\u0001\u0000\u0000\u0000\u0090\u039a\u0001\u0000\u0000"+
		"\u0000\u0092\u03a4\u0001\u0000\u0000\u0000\u0094\u03af\u0001\u0000\u0000"+
		"\u0000\u0096\u03b8\u0001\u0000\u0000\u0000\u0098\u03c0\u0001\u0000\u0000"+
		"\u0000\u009a\u03cc\u0001\u0000\u0000\u0000\u009c\u03d6\u0001\u0000\u0000"+
		"\u0000\u009e\u03de\u0001\u0000\u0000\u0000\u00a0\u03f4\u0001\u0000\u0000"+
		"\u0000\u00a2\u041b\u0001\u0000\u0000\u0000\u00a4\u0420\u0001\u0000\u0000"+
		"\u0000\u00a6\u0422\u0001\u0000\u0000\u0000\u00a8\u0426\u0001\u0000\u0000"+
		"\u0000\u00aa\u0447\u0001\u0000\u0000\u0000\u00ac\u044a\u0001\u0000\u0000"+
		"\u0000\u00ae\u0453\u0001\u0000\u0000\u0000\u00b0\u0464\u0001\u0000\u0000"+
		"\u0000\u00b2\u0466\u0001\u0000\u0000\u0000\u00b4\u0477\u0001\u0000\u0000"+
		"\u0000\u00b6\u0483\u0001\u0000\u0000\u0000\u00b8\u0489\u0001\u0000\u0000"+
		"\u0000\u00ba\u048d\u0001\u0000\u0000\u0000\u00bc\u0491\u0001\u0000\u0000"+
		"\u0000\u00be\u0497\u0001\u0000\u0000\u0000\u00c0\u049d\u0001\u0000\u0000"+
		"\u0000\u00c2\u04b0\u0001\u0000\u0000\u0000\u00c4\u04b4\u0001\u0000\u0000"+
		"\u0000\u00c6\u04bc\u0001\u0000\u0000\u0000\u00c8\u04be\u0001\u0000\u0000"+
		"\u0000\u00ca\u04c1\u0001\u0000\u0000\u0000\u00cc\u04c4\u0001\u0000\u0000"+
		"\u0000\u00ce\u04cd\u0001\u0000\u0000\u0000\u00d0\u04d6\u0001\u0000\u0000"+
		"\u0000\u00d2\u04df\u0001\u0000\u0000\u0000\u00d4\u04eb\u0001\u0000\u0000"+
		"\u0000\u00d6\u04ef\u0001\u0000\u0000\u0000\u00d8\u04f1\u0001\u0000\u0000"+
		"\u0000\u00da\u04f3\u0001\u0000\u0000\u0000\u00dc\u04f5\u0001\u0000\u0000"+
		"\u0000\u00de\u04f7\u0001\u0000\u0000\u0000\u00e0\u04f9\u0001\u0000\u0000"+
		"\u0000\u00e2\u04fb\u0001\u0000\u0000\u0000\u00e4\u04fd\u0001\u0000\u0000"+
		"\u0000\u00e6\u0502\u0001\u0000\u0000\u0000\u00e8\u0506\u0001\u0000\u0000"+
		"\u0000\u00ea\u0508\u0001\u0000\u0000\u0000\u00ec\u050a\u0001\u0000\u0000"+
		"\u0000\u00ee\u0525\u0001\u0000\u0000\u0000\u00f0\u0527\u0001\u0000\u0000"+
		"\u0000\u00f2\u052b\u0001\u0000\u0000\u0000\u00f4\u052f\u0001\u0000\u0000"+
		"\u0000\u00f6\u0531\u0001\u0000\u0000\u0000\u00f8\u0533\u0001\u0000\u0000"+
		"\u0000\u00fa\u0535\u0001\u0000\u0000\u0000\u00fc\u0537\u0001\u0000\u0000"+
		"\u0000\u00fe\u0103\u0003\u0002\u0001\u0000\u00ff\u0100\u0005j\u0000\u0000"+
		"\u0100\u0102\u0003\u0002\u0001\u0000\u0101\u00ff\u0001\u0000\u0000\u0000"+
		"\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000"+
		"\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000"+
		"\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u0108\u0005j\u0000\u0000\u0107"+
		"\u0106\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108"+
		"\u0001\u0001\u0000\u0000\u0000\u0109\u010c\u0005\u0002\u0000\u0000\u010a"+
		"\u010b\u0005\n\u0000\u0000\u010b\u010d\u0005\f\u0000\u0000\u010c\u010a"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0001\u0000\u0000\u0000\u010e\u0112\u0005\u000b\u0000\u0000\u010f\u0110"+
		"\u0003\u0004\u0002\u0000\u0110\u0111\u0005d\u0000\u0000\u0111\u0113\u0001"+
		"\u0000\u0000\u0000\u0112\u010f\u0001\u0000\u0000\u0000\u0112\u0113\u0001"+
		"\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0120\u0003"+
		"\u0006\u0003\u0000\u0115\u0116\u0005Z\u0000\u0000\u0116\u011b\u0003\b"+
		"\u0004\u0000\u0117\u0118\u0005^\u0000\u0000\u0118\u011a\u0003\b\u0004"+
		"\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000"+
		"\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000"+
		"\u0000\u011c\u011e\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000"+
		"\u0000\u011e\u011f\u0005[\u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000"+
		"\u0120\u0115\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0124\u0007\u0000\u0000\u0000"+
		"\u0123\u0125\u0003\u000e\u0007\u0000\u0124\u0123\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000"+
		"\u0126\u0127\u00036\u001b\u0000\u0127\u0003\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\u0005t\u0000\u0000\u0129\u0005\u0001\u0000\u0000\u0000\u012a\u012b"+
		"\u0005t\u0000\u0000\u012b\u0007\u0001\u0000\u0000\u0000\u012c\u012e\u0003"+
		"\n\u0005\u0000\u012d\u012f\u0005\u0017\u0000\u0000\u012e\u012d\u0001\u0000"+
		"\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0131\u0001\u0000"+
		"\u0000\u0000\u0130\u0132\u0005\u0019\u0000\u0000\u0131\u0130\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000"+
		"\u0000\u0000\u0133\u0134\u0003\u00b8\\\u0000\u0134\t\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0005t\u0000\u0000\u0136\u000b\u0001\u0000\u0000\u0000"+
		"\u0137\u013a\u0005i\u0000\u0000\u0138\u013a\u0003<\u001e\u0000\u0139\u0137"+
		"\u0001\u0000\u0000\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u013a\r\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0003\u0010\b\u0000\u013c\u000f\u0001\u0000"+
		"\u0000\u0000\u013d\u0143\u0003\u0012\t\u0000\u013e\u0143\u0003\u0014\n"+
		"\u0000\u013f\u0143\u0003\u001e\u000f\u0000\u0140\u0143\u0003 \u0010\u0000"+
		"\u0141\u0143\u0003\u0018\f\u0000\u0142\u013d\u0001\u0000\u0000\u0000\u0142"+
		"\u013e\u0001\u0000\u0000\u0000\u0142\u013f\u0001\u0000\u0000\u0000\u0142"+
		"\u0140\u0001\u0000\u0000\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0143"+
		"\u0144\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0144"+
		"\u0145\u0001\u0000\u0000\u0000\u0145\u0011\u0001\u0000\u0000\u0000\u0146"+
		"\u014a\u00034\u001a\u0000\u0147\u014a\u0003\u00b4Z\u0000\u0148\u014a\u0003"+
		"\u0016\u000b\u0000\u0149\u0146\u0001\u0000\u0000\u0000\u0149\u0147\u0001"+
		"\u0000\u0000\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u014a\u0013\u0001"+
		"\u0000\u0000\u0000\u014b\u014f\u0003,\u0016\u0000\u014c\u014f\u0003&\u0013"+
		"\u0000\u014d\u014f\u0003(\u0014\u0000\u014e\u014b\u0001\u0000\u0000\u0000"+
		"\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014d\u0001\u0000\u0000\u0000"+
		"\u014f\u0015\u0001\u0000\u0000\u0000\u0150\u0151\u0003\u00e4r\u0000\u0151"+
		"\u0152\u0005P\u0000\u0000\u0152\u0153\u0005_\u0000\u0000\u0153\u0017\u0001"+
		"\u0000\u0000\u0000\u0154\u0155\u0003\u001a\r\u0000\u0155\u0019\u0001\u0000"+
		"\u0000\u0000\u0156\u0157\u0005U\u0000\u0000\u0157\u0158\u0005V\u0000\u0000"+
		"\u0158\u0159\u0005Z\u0000\u0000\u0159\u015a\u0003\u00e4r\u0000\u015a\u015b"+
		"\u0005^\u0000\u0000\u015b\u015c\u0003\u001c\u000e\u0000\u015c\u015d\u0005"+
		"[\u0000\u0000\u015d\u015e\u0005_\u0000\u0000\u015e\u001b\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0003d2\u0000\u0160\u001d\u0001\u0000\u0000\u0000\u0161"+
		"\u0162\u0005\'\u0000\u0000\u0162\u0163\u0003\u00d6k\u0000\u0163\u0164"+
		"\u0005$\u0000\u0000\u0164\u0165\u0003$\u0012\u0000\u0165\u001f\u0001\u0000"+
		"\u0000\u0000\u0166\u0167\u0005\'\u0000\u0000\u0167\u0173\u0003\u00d6k"+
		"\u0000\u0168\u0169\u0005Z\u0000\u0000\u0169\u016e\u0003\"\u0011\u0000"+
		"\u016a\u016b\u0005^\u0000\u0000\u016b\u016d\u0003\"\u0011\u0000\u016c"+
		"\u016a\u0001\u0000\u0000\u0000\u016d\u0170\u0001\u0000\u0000\u0000\u016e"+
		"\u016c\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f"+
		"\u0171\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0171"+
		"\u0172\u0005[\u0000\u0000\u0172\u0174\u0001\u0000\u0000\u0000\u0173\u0168"+
		"\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0177"+
		"\u0001\u0000\u0000\u0000\u0175\u0176\u0005$\u0000\u0000\u0176\u0178\u0003"+
		"$\u0012\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000"+
		"\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017a\u0005\u0007"+
		"\u0000\u0000\u017a\u017b\u0003\u00fc~\u0000\u017b\u017c\u0005_\u0000\u0000"+
		"\u017c!\u0001\u0000\u0000\u0000\u017d\u017f\u0003\n\u0005\u0000\u017e"+
		"\u0180\u0005\u0017\u0000\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u017f"+
		"\u0180\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181"+
		"\u0184\u0003\u00b8\\\u0000\u0182\u0183\u0007\u0001\u0000\u0000\u0183\u0185"+
		"\u0003<\u001e\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001"+
		"\u0000\u0000\u0000\u0185#\u0001\u0000\u0000\u0000\u0186\u018a\u0003\u00f0"+
		"x\u0000\u0187\u018a\u0003\u00f2y\u0000\u0188\u018a\u0003\u00ba]\u0000"+
		"\u0189\u0186\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000"+
		"\u0189\u0188\u0001\u0000\u0000\u0000\u018a%\u0001\u0000\u0000\u0000\u018b"+
		"\u018c\u0005\u000f\u0000\u0000\u018c\u018d\u00032\u0019\u0000\u018d\u018e"+
		"\u0005\u0007\u0000\u0000\u018e\u018f\u0005D\u0000\u0000\u018f\u0190\u0005"+
		"Z\u0000\u0000\u0190\u0195\u00030\u0018\u0000\u0191\u0192\u0005^\u0000"+
		"\u0000\u0192\u0194\u00030\u0018\u0000\u0193\u0191\u0001\u0000\u0000\u0000"+
		"\u0194\u0197\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000"+
		"\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0198\u0001\u0000\u0000\u0000"+
		"\u0197\u0195\u0001\u0000\u0000\u0000\u0198\u0199\u0005[\u0000\u0000\u0199"+
		"\u019a\u0005_\u0000\u0000\u019a\'\u0001\u0000\u0000\u0000\u019b\u019c"+
		"\u0005\u000f\u0000\u0000\u019c\u019d\u0003*\u0015\u0000\u019d\u019e\u0005"+
		"\u0007\u0000\u0000\u019e\u019f\u0005O\u0000\u0000\u019f\u01a0\u0005\'"+
		"\u0000\u0000\u01a0\u01a1\u0005$\u0000\u0000\u01a1\u01a2\u0003$\u0012\u0000"+
		"\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005_\u0000\u0000\u01a4"+
		")\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005t\u0000\u0000\u01a6+\u0001"+
		"\u0000\u0000\u0000\u01a7\u01a8\u0005\u000f\u0000\u0000\u01a8\u01a9\u0003"+
		"\u00e0p\u0000\u01a9\u01aa\u0005\u0007\u0000\u0000\u01aa\u01ab\u0003.\u0017"+
		"\u0000\u01ab\u01ac\u0005_\u0000\u0000\u01ac-\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ae\u0005H\u0000\u0000\u01ae\u01af\u0005/\u0000\u0000\u01af\u01b2\u0003"+
		"\u00b8\\\u0000\u01b0\u01b1\u0005\b\u0000\u0000\u01b1\u01b3\u0005\t\u0000"+
		"\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b5\u0005I\u0000\u0000"+
		"\u01b5\u01c0\u0005%\u0000\u0000\u01b6\u01c1\u0005J\u0000\u0000\u01b7\u01c1"+
		"\u0005K\u0000\u0000\u01b8\u01b9\u0007\u0002\u0000\u0000\u01b9\u01ba\u0005"+
		"Z\u0000\u0000\u01ba\u01bb\u0003\u00f4z\u0000\u01bb\u01bc\u0005[\u0000"+
		"\u0000\u01bc\u01c1\u0001\u0000\u0000\u0000\u01bd\u01c1\u0005N\u0000\u0000"+
		"\u01be\u01c1\u0003\u00f0x\u0000\u01bf\u01c1\u0003\u00f2y\u0000\u01c0\u01b6"+
		"\u0001\u0000\u0000\u0000\u01c0\u01b7\u0001\u0000\u0000\u0000\u01c0\u01b8"+
		"\u0001\u0000\u0000\u0000\u01c0\u01bd\u0001\u0000\u0000\u0000\u01c0\u01be"+
		"\u0001\u0000\u0000\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c1/\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c3\u0003\u00dcn\u0000\u01c3\u01ca\u0003\u00b8"+
		"\\\u0000\u01c4\u01c5\u0005\b\u0000\u0000\u01c5\u01c7\u0005\t\u0000\u0000"+
		"\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01c9\u0007\u0001\u0000\u0000"+
		"\u01c9\u01cb\u0003<\u001e\u0000\u01ca\u01c6\u0001\u0000\u0000\u0000\u01ca"+
		"\u01cb\u0001\u0000\u0000\u0000\u01cb1\u0001\u0000\u0000\u0000\u01cc\u01cd"+
		"\u0005t\u0000\u0000\u01cd3\u0001\u0000\u0000\u0000\u01ce\u01cf\u0003\u00e2"+
		"q\u0000\u01cf\u01d0\u00056\u0000\u0000\u01d0\u01d3\u0003\u00b8\\\u0000"+
		"\u01d1\u01d2\u0005\b\u0000\u0000\u01d2\u01d4\u0005\t\u0000\u0000\u01d3"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d6\u0007\u0001\u0000\u0000\u01d6"+
		"\u01d7\u0003<\u001e\u0000\u01d7\u01d8\u0005_\u0000\u0000\u01d85\u0001"+
		"\u0000\u0000\u0000\u01d9\u01db\u00055\u0000\u0000\u01da\u01dc\u0003~?"+
		"\u0000\u01db\u01da\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000"+
		"\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000"+
		"\u0000\u01de\u01e5\u0001\u0000\u0000\u0000\u01df\u01e1\u0005P\u0000\u0000"+
		"\u01e0\u01e2\u00038\u001c\u0000\u01e1\u01e0\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e6\u0001\u0000\u0000\u0000\u01e5"+
		"\u01df\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e7\u0001\u0000\u0000\u0000\u01e7\u01e9\u0005\u0006\u0000\u0000\u01e8"+
		"\u01ea\u0003\u00eau\u0000\u01e9\u01e8\u0001\u0000\u0000\u0000\u01e9\u01ea"+
		"\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01ec"+
		"\u0005_\u0000\u0000\u01ec7\u0001\u0000\u0000\u0000\u01ed\u01f7\u0005!"+
		"\u0000\u0000\u01ee\u01f3\u0003\u00e4r\u0000\u01ef\u01f0\u0005\n\u0000"+
		"\u0000\u01f0\u01f2\u0003\u00e4r\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f5\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f8\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f6\u01f8\u0005Q\u0000\u0000\u01f7"+
		"\u01ee\u0001\u0000\u0000\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f8"+
		"\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fb\u0005\"\u0000\u0000\u01fa\u01fc"+
		"\u0003~?\u0000\u01fb\u01fa\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000"+
		"\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000"+
		"\u0000\u0000\u01fe9\u0001\u0000\u0000\u0000\u01ff\u0200\u0005\u0011\u0000"+
		"\u0000\u0200\u0201\u0003L&\u0000\u0201\u0203\u0005\u0012\u0000\u0000\u0202"+
		"\u0204\u0003~?\u0000\u0203\u0202\u0001\u0000\u0000\u0000\u0204\u0205\u0001"+
		"\u0000\u0000\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0205\u0206\u0001"+
		"\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u0208\u0005"+
		"\u0006\u0000\u0000\u0208\u020a\u0005\u0012\u0000\u0000\u0209\u020b\u0003"+
		"\u00ecv\u0000\u020a\u0209\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000"+
		"\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c\u020d\u0005_\u0000"+
		"\u0000\u020d;\u0001\u0000\u0000\u0000\u020e\u020f\u0006\u001e\uffff\uffff"+
		"\u0000\u020f\u021d\u0003D\"\u0000\u0210\u021d\u0003J%\u0000\u0211\u021d"+
		"\u0003p8\u0000\u0212\u021d\u0003P(\u0000\u0213\u0214\u0005Z\u0000\u0000"+
		"\u0214\u0215\u0003<\u001e\u0000\u0215\u0216\u0005[\u0000\u0000\u0216\u021d"+
		"\u0001\u0000\u0000\u0000\u0217\u021d\u0003F#\u0000\u0218\u021d\u0003@"+
		" \u0000\u0219\u021a\u0005\b\u0000\u0000\u021a\u021d\u0003<\u001e\u0002"+
		"\u021b\u021d\u0003>\u001f\u0000\u021c\u020e\u0001\u0000\u0000\u0000\u021c"+
		"\u0210\u0001\u0000\u0000\u0000\u021c\u0211\u0001\u0000\u0000\u0000\u021c"+
		"\u0212\u0001\u0000\u0000\u0000\u021c\u0213\u0001\u0000\u0000\u0000\u021c"+
		"\u0217\u0001\u0000\u0000\u0000\u021c\u0218\u0001\u0000\u0000\u0000\u021c"+
		"\u0219\u0001\u0000\u0000\u0000\u021c\u021b\u0001\u0000\u0000\u0000\u021d"+
		"\u023a\u0001\u0000\u0000\u0000\u021e\u021f\n\t\u0000\u0000\u021f\u0220"+
		"\u0003H$\u0000\u0220\u0221\u0003<\u001e\n\u0221\u0239\u0001\u0000\u0000"+
		"\u0000\u0222\u0223\n\b\u0000\u0000\u0223\u0224\u0003z=\u0000\u0224\u0225"+
		"\u0003<\u001e\t\u0225\u0239\u0001\u0000\u0000\u0000\u0226\u0228\n\u0007"+
		"\u0000\u0000\u0227\u0229\u0005\b\u0000\u0000\u0228\u0227\u0001\u0000\u0000"+
		"\u0000\u0228\u0229\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000\u0000"+
		"\u0000\u022a\u022b\u0005\u0015\u0000\u0000\u022b\u022c\u0003<\u001e\u0000"+
		"\u022c\u022d\u0005\u0016\u0000\u0000\u022d\u022e\u0003<\u001e\b\u022e"+
		"\u0239\u0001\u0000\u0000\u0000\u022f\u0230\n\u0005\u0000\u0000\u0230\u0231"+
		"\u0007\u0003\u0000\u0000\u0231\u0239\u0003<\u001e\u0006\u0232\u0233\n"+
		"\u0006\u0000\u0000\u0233\u0235\u0005\u0007\u0000\u0000\u0234\u0236\u0005"+
		"\b\u0000\u0000\u0235\u0234\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000"+
		"\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u0239\u0005\t\u0000"+
		"\u0000\u0238\u021e\u0001\u0000\u0000\u0000\u0238\u0222\u0001\u0000\u0000"+
		"\u0000\u0238\u0226\u0001\u0000\u0000\u0000\u0238\u022f\u0001\u0000\u0000"+
		"\u0000\u0238\u0232\u0001\u0000\u0000\u0000\u0239\u023c\u0001\u0000\u0000"+
		"\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000"+
		"\u0000\u023b=\u0001\u0000\u0000\u0000\u023c\u023a\u0001\u0000\u0000\u0000"+
		"\u023d\u023e\u0007\u0004\u0000\u0000\u023e\u023f\u0003<\u001e\u0000\u023f"+
		"?\u0001\u0000\u0000\u0000\u0240\u0243\u0003\u00d6k\u0000\u0241\u0243\u0005"+
		"\u001b\u0000\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0242\u0241\u0001"+
		"\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244\u0245\u0005"+
		"b\u0000\u0000\u0245\u0246\u0003B!\u0000\u0246A\u0001\u0000\u0000\u0000"+
		"\u0247\u0248\u0007\u0005\u0000\u0000\u0248C\u0001\u0000\u0000\u0000\u0249"+
		"\u024a\u0007\u0006\u0000\u0000\u024aE\u0001\u0000\u0000\u0000\u024b\u024e"+
		"\u0003f3\u0000\u024c\u024e\u0003j5\u0000\u024d\u024b\u0001\u0000\u0000"+
		"\u0000\u024d\u024c\u0001\u0000\u0000\u0000\u024eG\u0001\u0000\u0000\u0000"+
		"\u024f\u0250\u0007\u0007\u0000\u0000\u0250I\u0001\u0000\u0000\u0000\u0251"+
		"\u0254\u0005t\u0000\u0000\u0252\u0254\u0003P(\u0000\u0253\u0251\u0001"+
		"\u0000\u0000\u0000\u0253\u0252\u0001\u0000\u0000\u0000\u0254\u0255\u0001"+
		"\u0000\u0000\u0000\u0255\u0257\u0005d\u0000\u0000\u0256\u0253\u0001\u0000"+
		"\u0000\u0000\u0256\u0257\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000"+
		"\u0000\u0000\u0258\u0259\u0005t\u0000\u0000\u0259K\u0001\u0000\u0000\u0000"+
		"\u025a\u025b\u0003<\u001e\u0000\u025bM\u0001\u0000\u0000\u0000\u025c\u025e"+
		"\u0005\b\u0000\u0000\u025d\u025c\u0001\u0000\u0000\u0000\u025d\u025e\u0001"+
		"\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f\u0260\u0007"+
		"\b\u0000\u0000\u0260O\u0001\u0000\u0000\u0000\u0261\u0262\u0003\u00d4"+
		"j\u0000\u0262\u026b\u0005Z\u0000\u0000\u0263\u0268\u0003\f\u0006\u0000"+
		"\u0264\u0265\u0005^\u0000\u0000\u0265\u0267\u0003\f\u0006\u0000\u0266"+
		"\u0264\u0001\u0000\u0000\u0000\u0267\u026a\u0001\u0000\u0000\u0000\u0268"+
		"\u0266\u0001\u0000\u0000\u0000\u0268\u0269\u0001\u0000\u0000\u0000\u0269"+
		"\u026c\u0001\u0000\u0000\u0000\u026a\u0268\u0001\u0000\u0000\u0000\u026b"+
		"\u0263\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c"+
		"\u026d\u0001\u0000\u0000\u0000\u026d\u026e\u0005[\u0000\u0000\u026eQ\u0001"+
		"\u0000\u0000\u0000\u026f\u0270\u0003\u00b6[\u0000\u0270S\u0001\u0000\u0000"+
		"\u0000\u0271\u027a\u0003Z-\u0000\u0272\u0275\u0003V+\u0000\u0273\u0274"+
		"\u0005s\u0000\u0000\u0274\u0276\u0003V+\u0000\u0275\u0273\u0001\u0000"+
		"\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0275\u0001\u0000"+
		"\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u027a\u0001\u0000"+
		"\u0000\u0000\u0279\u0271\u0001\u0000\u0000\u0000\u0279\u0272\u0001\u0000"+
		"\u0000\u0000\u027aU\u0001\u0000\u0000\u0000\u027b\u027f\u0003Z-\u0000"+
		"\u027c\u027f\u0003\u00f6{\u0000\u027d\u027f\u0003X,\u0000\u027e\u027b"+
		"\u0001\u0000\u0000\u0000\u027e\u027c\u0001\u0000\u0000\u0000\u027e\u027d"+
		"\u0001\u0000\u0000\u0000\u027fW\u0001\u0000\u0000\u0000\u0280\u0281\u0003"+
		"P(\u0000\u0281Y\u0001\u0000\u0000\u0000\u0282\u0283\u0007\t\u0000\u0000"+
		"\u0283[\u0001\u0000\u0000\u0000\u0284\u0285\u0007\t\u0000\u0000\u0285"+
		"]\u0001\u0000\u0000\u0000\u0286\u028f\u0003d2\u0000\u0287\u028a\u0003"+
		"`0\u0000\u0288\u0289\u0007\n\u0000\u0000\u0289\u028b\u0003`0\u0000\u028a"+
		"\u0288\u0001\u0000\u0000\u0000\u028b\u028c\u0001\u0000\u0000\u0000\u028c"+
		"\u028a\u0001\u0000\u0000\u0000\u028c\u028d\u0001\u0000\u0000\u0000\u028d"+
		"\u028f\u0001\u0000\u0000\u0000\u028e\u0286\u0001\u0000\u0000\u0000\u028e"+
		"\u0287\u0001\u0000\u0000\u0000\u028f_\u0001\u0000\u0000\u0000\u0290\u0294"+
		"\u0003d2\u0000\u0291\u0294\u0003\u00fa}\u0000\u0292\u0294\u0003b1\u0000"+
		"\u0293\u0290\u0001\u0000\u0000\u0000\u0293\u0291\u0001\u0000\u0000\u0000"+
		"\u0293\u0292\u0001\u0000\u0000\u0000\u0294a\u0001\u0000\u0000\u0000\u0295"+
		"\u0296\u0003P(\u0000\u0296c\u0001\u0000\u0000\u0000\u0297\u0298\u0005"+
		"u\u0000\u0000\u0298e\u0001\u0000\u0000\u0000\u0299\u029f\u0005 \u0000"+
		"\u0000\u029a\u029b\u0005!\u0000\u0000\u029b\u029c\u0003L&\u0000\u029c"+
		"\u029d\u0005\"\u0000\u0000\u029d\u029e\u0003h4\u0000\u029e\u02a0\u0001"+
		"\u0000\u0000\u0000\u029f\u029a\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001"+
		"\u0000\u0000\u0000\u02a1\u029f\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001"+
		"\u0000\u0000\u0000\u02a2\u02a5\u0001\u0000\u0000\u0000\u02a3\u02a4\u0005"+
		"#\u0000\u0000\u02a4\u02a6\u0003h4\u0000\u02a5\u02a3\u0001\u0000\u0000"+
		"\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6\u02a7\u0001\u0000\u0000"+
		"\u0000\u02a7\u02a8\u0005\u0006\u0000\u0000\u02a8g\u0001\u0000\u0000\u0000"+
		"\u02a9\u02aa\u0003<\u001e\u0000\u02aai\u0001\u0000\u0000\u0000\u02ab\u02ac"+
		"\u0005 \u0000\u0000\u02ac\u02b2\u0003l6\u0000\u02ad\u02ae\u0005!\u0000"+
		"\u0000\u02ae\u02af\u0003n7\u0000\u02af\u02b0\u0005\"\u0000\u0000\u02b0"+
		"\u02b1\u0003h4\u0000\u02b1\u02b3\u0001\u0000\u0000\u0000\u02b2\u02ad\u0001"+
		"\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4\u02b2\u0001"+
		"\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b8\u0001"+
		"\u0000\u0000\u0000\u02b6\u02b7\u0005#\u0000\u0000\u02b7\u02b9\u0003h4"+
		"\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000\u02b8\u02b9\u0001\u0000\u0000"+
		"\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000\u02ba\u02bb\u0005\u0006\u0000"+
		"\u0000\u02bbk\u0001\u0000\u0000\u0000\u02bc\u02bd\u0003<\u001e\u0000\u02bd"+
		"m\u0001\u0000\u0000\u0000\u02be\u02bf\u0003<\u001e\u0000\u02bfo\u0001"+
		"\u0000\u0000\u0000\u02c0\u02c5\u0003Z-\u0000\u02c1\u02c5\u0003N\'\u0000"+
		"\u02c2\u02c5\u0003d2\u0000\u02c3\u02c5\u0003\\.\u0000\u02c4\u02c0\u0001"+
		"\u0000\u0000\u0000\u02c4\u02c1\u0001\u0000\u0000\u0000\u02c4\u02c2\u0001"+
		"\u0000\u0000\u0000\u02c4\u02c3\u0001\u0000\u0000\u0000\u02c5q\u0001\u0000"+
		"\u0000\u0000\u02c6\u02ca\u0005&\u0000\u0000\u02c7\u02c9\b\u000b\u0000"+
		"\u0000\u02c8\u02c7\u0001\u0000\u0000\u0000\u02c9\u02cc\u0001\u0000\u0000"+
		"\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000\u02ca\u02c8\u0001\u0000\u0000"+
		"\u0000\u02cbs\u0001\u0000\u0000\u0000\u02cc\u02ca\u0001\u0000\u0000\u0000"+
		"\u02cd\u02d1\u0005A\u0000\u0000\u02ce\u02d0\b\u000b\u0000\u0000\u02cf"+
		"\u02ce\u0001\u0000\u0000\u0000\u02d0\u02d3\u0001\u0000\u0000\u0000\u02d1"+
		"\u02d2\u0001\u0000\u0000\u0000\u02d1\u02cf\u0001\u0000\u0000\u0000\u02d2"+
		"u\u0001\u0000\u0000\u0000\u02d3\u02d1\u0001\u0000\u0000\u0000\u02d4\u02d5"+
		"\u0006;\uffff\uffff\u0000\u02d5\u02d6\u0003<\u001e\u0000\u02d6\u02d7\u0003"+
		"z=\u0000\u02d7\u02d8\u0003<\u001e\u0000\u02d8\u02fc\u0001\u0000\u0000"+
		"\u0000\u02d9\u02db\u0003<\u001e\u0000\u02da\u02dc\u0005\b\u0000\u0000"+
		"\u02db\u02da\u0001\u0000\u0000\u0000\u02db\u02dc\u0001\u0000\u0000\u0000"+
		"\u02dc\u02dd\u0001\u0000\u0000\u0000\u02dd\u02de\u0005\u0015\u0000\u0000"+
		"\u02de\u02df\u0003<\u001e\u0000\u02df\u02e0\u0005\u0016\u0000\u0000\u02e0"+
		"\u02e1\u0003<\u001e\u0000\u02e1\u02fc\u0001\u0000\u0000\u0000\u02e2\u02e5"+
		"\u0003\u00f8|\u0000\u02e3\u02e5\u0003<\u001e\u0000\u02e4\u02e2\u0001\u0000"+
		"\u0000\u0000\u02e4\u02e3\u0001\u0000\u0000\u0000\u02e5\u02e6\u0001\u0000"+
		"\u0000\u0000\u02e6\u02e8\u0005\u0007\u0000\u0000\u02e7\u02e9\u0005\b\u0000"+
		"\u0000\u02e8\u02e7\u0001\u0000\u0000\u0000\u02e8\u02e9\u0001\u0000\u0000"+
		"\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea\u02eb\u0005\t\u0000\u0000"+
		"\u02eb\u02fc\u0001\u0000\u0000\u0000\u02ec\u02ef\u0003Z-\u0000\u02ed\u02ef"+
		"\u0003|>\u0000\u02ee\u02ec\u0001\u0000\u0000\u0000\u02ee\u02ed\u0001\u0000"+
		"\u0000\u0000\u02ef\u02f1\u0001\u0000\u0000\u0000\u02f0\u02f2\u0005\b\u0000"+
		"\u0000\u02f1\u02f0\u0001\u0000\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000"+
		"\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3\u02f6\u0005\u001a\u0000"+
		"\u0000\u02f4\u02f7\u0003Z-\u0000\u02f5\u02f7\u0003\u00f8|\u0000\u02f6"+
		"\u02f4\u0001\u0000\u0000\u0000\u02f6\u02f5\u0001\u0000\u0000\u0000\u02f7"+
		"\u02fc\u0001\u0000\u0000\u0000\u02f8\u02fc\u0003x<\u0000\u02f9\u02fa\u0005"+
		"\b\u0000\u0000\u02fa\u02fc\u0003v;\u0001\u02fb\u02d4\u0001\u0000\u0000"+
		"\u0000\u02fb\u02d9\u0001\u0000\u0000\u0000\u02fb\u02e4\u0001\u0000\u0000"+
		"\u0000\u02fb\u02ee\u0001\u0000\u0000\u0000\u02fb\u02f8\u0001\u0000\u0000"+
		"\u0000\u02fb\u02f9\u0001\u0000\u0000\u0000\u02fc\u0302\u0001\u0000\u0000"+
		"\u0000\u02fd\u02fe\n\u0002\u0000\u0000\u02fe\u02ff\u0007\u0003\u0000\u0000"+
		"\u02ff\u0301\u0003v;\u0003\u0300\u02fd\u0001\u0000\u0000\u0000\u0301\u0304"+
		"\u0001\u0000\u0000\u0000\u0302\u0300\u0001\u0000\u0000\u0000\u0302\u0303"+
		"\u0001\u0000\u0000\u0000\u0303w\u0001\u0000\u0000\u0000\u0304\u0302\u0001"+
		"\u0000\u0000\u0000\u0305\u0307\u0003<\u001e\u0000\u0306\u0308\u0005\b"+
		"\u0000\u0000\u0307\u0306\u0001\u0000\u0000\u0000\u0307\u0308\u0001\u0000"+
		"\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309\u030a\u0005\u0017"+
		"\u0000\u0000\u030a\u030b\u0005Z\u0000\u0000\u030b\u0310\u0003<\u001e\u0000"+
		"\u030c\u030d\u0005^\u0000\u0000\u030d\u030f\u0003<\u001e\u0000\u030e\u030c"+
		"\u0001\u0000\u0000\u0000\u030f\u0312\u0001\u0000\u0000\u0000\u0310\u030e"+
		"\u0001\u0000\u0000\u0000\u0310\u0311\u0001\u0000\u0000\u0000\u0311\u0313"+
		"\u0001\u0000\u0000\u0000\u0312\u0310\u0001\u0000\u0000\u0000\u0313\u0314"+
		"\u0005[\u0000\u0000\u0314y\u0001\u0000\u0000\u0000\u0315\u0316\u0007\f"+
		"\u0000\u0000\u0316{\u0001\u0000\u0000\u0000\u0317\u0319\u0003\u00c2a\u0000"+
		"\u0318\u0317\u0001\u0000\u0000\u0000\u0318\u0319\u0001\u0000\u0000\u0000"+
		"\u0319\u031c\u0001\u0000\u0000\u0000\u031a\u031d\u0003\u00f8|\u0000\u031b"+
		"\u031d\u0005B\u0000\u0000\u031c\u031a\u0001\u0000\u0000\u0000\u031c\u031b"+
		"\u0001\u0000\u0000\u0000\u031d}\u0001\u0000\u0000\u0000\u031e\u031f\u0005"+
		"l\u0000\u0000\u031f\u0320\u0003\u00ecv\u0000\u0320\u0321\u0005k\u0000"+
		"\u0000\u0321\u0323\u0001\u0000\u0000\u0000\u0322\u031e\u0001\u0000\u0000"+
		"\u0000\u0323\u0326\u0001\u0000\u0000\u0000\u0324\u0322\u0001\u0000\u0000"+
		"\u0000\u0324\u0325\u0001\u0000\u0000\u0000\u0325\u033e\u0001\u0000\u0000"+
		"\u0000\u0326\u0324\u0001\u0000\u0000\u0000\u0327\u033f\u0003\u0080@\u0000"+
		"\u0328\u033f\u0003\u0086C\u0000\u0329\u033f\u0003\u0088D\u0000\u032a\u033f"+
		"\u0003\u008eG\u0000\u032b\u033f\u0003\u0090H\u0000\u032c\u033f\u0003\u0092"+
		"I\u0000\u032d\u033f\u0003\u009aM\u0000\u032e\u033f\u0003\u009cN\u0000"+
		"\u032f\u033f\u0003\u009eO\u0000\u0330\u033f\u0003\u00a0P\u0000\u0331\u033f"+
		"\u0003\u00a6S\u0000\u0332\u033f\u0003\u00a8T\u0000\u0333\u033f\u0003\u00aa"+
		"U\u0000\u0334\u033f\u0003\u00aeW\u0000\u0335\u033f\u0003\u00acV\u0000"+
		"\u0336\u033f\u0003\u00b2Y\u0000\u0337\u033f\u0003\u00bc^\u0000\u0338\u033f"+
		"\u0003\u00be_\u0000\u0339\u033f\u0003\u00c0`\u0000\u033a\u033f\u0003\u00c6"+
		"c\u0000\u033b\u033f\u0003:\u001d\u0000\u033c\u033f\u0003\u00b2Y\u0000"+
		"\u033d\u033f\u0003\u0094J\u0000\u033e\u0327\u0001\u0000\u0000\u0000\u033e"+
		"\u0328\u0001\u0000\u0000\u0000\u033e\u0329\u0001\u0000\u0000\u0000\u033e"+
		"\u032a\u0001\u0000\u0000\u0000\u033e\u032b\u0001\u0000\u0000\u0000\u033e"+
		"\u032c\u0001\u0000\u0000\u0000\u033e\u032d\u0001\u0000\u0000\u0000\u033e"+
		"\u032e\u0001\u0000\u0000\u0000\u033e\u032f\u0001\u0000\u0000\u0000\u033e"+
		"\u0330\u0001\u0000\u0000\u0000\u033e\u0331\u0001\u0000\u0000\u0000\u033e"+
		"\u0332\u0001\u0000\u0000\u0000\u033e\u0333\u0001\u0000\u0000\u0000\u033e"+
		"\u0334\u0001\u0000\u0000\u0000\u033e\u0335\u0001\u0000\u0000\u0000\u033e"+
		"\u0336\u0001\u0000\u0000\u0000\u033e\u0337\u0001\u0000\u0000\u0000\u033e"+
		"\u0338\u0001\u0000\u0000\u0000\u033e\u0339\u0001\u0000\u0000\u0000\u033e"+
		"\u033a\u0001\u0000\u0000\u0000\u033e\u033b\u0001\u0000\u0000\u0000\u033e"+
		"\u033c\u0001\u0000\u0000\u0000\u033e\u033d\u0001\u0000\u0000\u0000\u033f"+
		"\u007f\u0001\u0000\u0000\u0000\u0340\u0341\u0003\u0082A\u0000\u0341\u0342"+
		"\u0005e\u0000\u0000\u0342\u0343\u0003<\u001e\u0000\u0343\u0344\u0005_"+
		"\u0000\u0000\u0344\u0081\u0001\u0000\u0000\u0000\u0345\u034c\u0003J%\u0000"+
		"\u0346\u0347\u0003\u00e8t\u0000\u0347\u0348\u0005Z\u0000\u0000\u0348\u0349"+
		"\u0003\u0084B\u0000\u0349\u034a\u0005[\u0000\u0000\u034a\u034c\u0001\u0000"+
		"\u0000\u0000\u034b\u0345\u0001\u0000\u0000\u0000\u034b\u0346\u0001\u0000"+
		"\u0000\u0000\u034c\u0083\u0001\u0000\u0000\u0000\u034d\u034e\u0003<\u001e"+
		"\u0000\u034e\u0085\u0001\u0000\u0000\u0000\u034f\u0351\u0005\u0012\u0000"+
		"\u0000\u0350\u0352\u0003~?\u0000\u0351\u0350\u0001\u0000\u0000\u0000\u0352"+
		"\u0353\u0001\u0000\u0000\u0000\u0353\u0351\u0001\u0000\u0000\u0000\u0353"+
		"\u0354\u0001\u0000\u0000\u0000\u0354\u0355\u0001\u0000\u0000\u0000\u0355"+
		"\u0356\u0005\u0006\u0000\u0000\u0356\u0358\u0005\u0012\u0000\u0000\u0357"+
		"\u0359\u0003\u00ecv\u0000\u0358\u0357\u0001\u0000\u0000\u0000\u0358\u0359"+
		"\u0001\u0000\u0000\u0000\u0359\u035a\u0001\u0000\u0000\u0000\u035a\u035b"+
		"\u0005_\u0000\u0000\u035b\u0087\u0001\u0000\u0000\u0000\u035c\u035f\u0003"+
		"\u008aE\u0000\u035d\u035f\u0003\u008cF\u0000\u035e\u035c\u0001\u0000\u0000"+
		"\u0000\u035e\u035d\u0001\u0000\u0000\u0000\u035f\u0089\u0001\u0000\u0000"+
		"\u0000\u0360\u0361\u0005 \u0000\u0000\u0361\u0367\u0003l6\u0000\u0362"+
		"\u0363\u0005!\u0000\u0000\u0363\u0364\u0003n7\u0000\u0364\u0365\u0005"+
		"\"\u0000\u0000\u0365\u0366\u0003~?\u0000\u0366\u0368\u0001\u0000\u0000"+
		"\u0000\u0367\u0362\u0001\u0000\u0000\u0000\u0368\u0369\u0001\u0000\u0000"+
		"\u0000\u0369\u0367\u0001\u0000\u0000\u0000\u0369\u036a\u0001\u0000\u0000"+
		"\u0000\u036a\u0371\u0001\u0000\u0000\u0000\u036b\u036d\u0005#\u0000\u0000"+
		"\u036c\u036e\u0003~?\u0000\u036d\u036c\u0001\u0000\u0000\u0000\u036e\u036f"+
		"\u0001\u0000\u0000\u0000\u036f\u036d\u0001\u0000\u0000\u0000\u036f\u0370"+
		"\u0001\u0000\u0000\u0000\u0370\u0372\u0001\u0000\u0000\u0000\u0371\u036b"+
		"\u0001\u0000\u0000\u0000\u0371\u0372\u0001\u0000\u0000\u0000\u0372\u0373"+
		"\u0001\u0000\u0000\u0000\u0373\u0374\u0005\u0006\u0000\u0000\u0374\u0376"+
		"\u0005 \u0000\u0000\u0375\u0377\u0003\u00ecv\u0000\u0376\u0375\u0001\u0000"+
		"\u0000\u0000\u0376\u0377\u0001\u0000\u0000\u0000\u0377\u0378\u0001\u0000"+
		"\u0000\u0000\u0378\u0379\u0005_\u0000\u0000\u0379\u008b\u0001\u0000\u0000"+
		"\u0000\u037a\u0380\u0005 \u0000\u0000\u037b\u037c\u0005!\u0000\u0000\u037c"+
		"\u037d\u0003L&\u0000\u037d\u037e\u0005\"\u0000\u0000\u037e\u037f\u0003"+
		"~?\u0000\u037f\u0381\u0001\u0000\u0000\u0000\u0380\u037b\u0001\u0000\u0000"+
		"\u0000\u0381\u0382\u0001\u0000\u0000\u0000\u0382\u0380\u0001\u0000\u0000"+
		"\u0000\u0382\u0383\u0001\u0000\u0000\u0000\u0383\u038a\u0001\u0000\u0000"+
		"\u0000\u0384\u0386\u0005#\u0000\u0000\u0385\u0387\u0003~?\u0000\u0386"+
		"\u0385\u0001\u0000\u0000\u0000\u0387\u0388\u0001\u0000\u0000\u0000\u0388"+
		"\u0386\u0001\u0000\u0000\u0000\u0388\u0389\u0001\u0000\u0000\u0000\u0389"+
		"\u038b\u0001\u0000\u0000\u0000\u038a\u0384\u0001\u0000\u0000\u0000\u038a"+
		"\u038b\u0001\u0000\u0000\u0000\u038b\u038c\u0001\u0000\u0000\u0000\u038c"+
		"\u038d\u0005\u0006\u0000\u0000\u038d\u038f\u0005 \u0000\u0000\u038e\u0390"+
		"\u0003\u00ecv\u0000\u038f\u038e\u0001\u0000\u0000\u0000\u038f\u0390\u0001"+
		"\u0000\u0000\u0000\u0390\u0391\u0001\u0000\u0000\u0000\u0391\u0392\u0005"+
		"_\u0000\u0000\u0392\u008d\u0001\u0000\u0000\u0000\u0393\u0396\u0005(\u0000"+
		"\u0000\u0394\u0397\u0003\u00d6k\u0000\u0395\u0397\u0003\u00d8l\u0000\u0396"+
		"\u0394\u0001\u0000\u0000\u0000\u0396\u0395\u0001\u0000\u0000\u0000\u0397"+
		"\u0398\u0001\u0000\u0000\u0000\u0398\u0399\u0005_\u0000\u0000\u0399\u008f"+
		"\u0001\u0000\u0000\u0000\u039a\u039c\u0005)\u0000\u0000\u039b\u039d\u0003"+
		"\u00ecv\u0000\u039c\u039b\u0001\u0000\u0000\u0000\u039c\u039d\u0001\u0000"+
		"\u0000\u0000\u039d\u03a0\u0001\u0000\u0000\u0000\u039e\u039f\u0005!\u0000"+
		"\u0000\u039f\u03a1\u0003L&\u0000\u03a0\u039e\u0001\u0000\u0000\u0000\u03a0"+
		"\u03a1\u0001\u0000\u0000\u0000\u03a1\u03a2\u0001\u0000\u0000\u0000\u03a2"+
		"\u03a3\u0005_\u0000\u0000\u03a3\u0091\u0001\u0000\u0000\u0000\u03a4\u03a5"+
		"\u0005?\u0000\u0000\u03a5\u03a6\u0005@\u0000\u0000\u03a6\u03a7\u0003\u0096"+
		"K\u0000\u03a7\u03a8\u0005_\u0000\u0000\u03a8\u0093\u0001\u0000\u0000\u0000"+
		"\u03a9\u03aa\u0005l\u0000\u0000\u03aa\u03ab\u0003\u00ecv\u0000\u03ab\u03ac"+
		"\u0005k\u0000\u0000\u03ac\u03ae\u0001\u0000\u0000\u0000\u03ad\u03a9\u0001"+
		"\u0000\u0000\u0000\u03ae\u03b1\u0001\u0000\u0000\u0000\u03af\u03ad\u0001"+
		"\u0000\u0000\u0000\u03af\u03b0\u0001\u0000\u0000\u0000\u03b0\u03b4\u0001"+
		"\u0000\u0000\u0000\u03b1\u03af\u0001\u0000\u0000\u0000\u03b2\u03b3\u0005"+
		"Y\u0000\u0000\u03b3\u03b5\u0003\u000e\u0007\u0000\u03b4\u03b2\u0001\u0000"+
		"\u0000\u0000\u03b4\u03b5\u0001\u0000\u0000\u0000\u03b5\u03b6\u0001\u0000"+
		"\u0000\u0000\u03b6\u03b7\u00036\u001b\u0000\u03b7\u0095\u0001\u0000\u0000"+
		"\u0000\u03b8\u03bd\u0007\r\u0000\u0000\u03b9\u03ba\u0005s\u0000\u0000"+
		"\u03ba\u03bc\u0007\r\u0000\u0000\u03bb\u03b9\u0001\u0000\u0000\u0000\u03bc"+
		"\u03bf\u0001\u0000\u0000\u0000\u03bd\u03bb\u0001\u0000\u0000\u0000\u03bd"+
		"\u03be\u0001\u0000\u0000\u0000\u03be\u0097\u0001\u0000\u0000\u0000\u03bf"+
		"\u03bd\u0001\u0000\u0000\u0000\u03c0\u03ca\u0005+\u0000\u0000\u03c1\u03c6"+
		"\u0003\u00b6[\u0000\u03c2\u03c3\u0005^\u0000\u0000\u03c3\u03c5\u0003\u00b6"+
		"[\u0000\u03c4\u03c2\u0001\u0000\u0000\u0000\u03c5\u03c8\u0001\u0000\u0000"+
		"\u0000\u03c6\u03c4\u0001\u0000\u0000\u0000\u03c6\u03c7\u0001\u0000\u0000"+
		"\u0000\u03c7\u03cb\u0001\u0000\u0000\u0000\u03c8\u03c6\u0001\u0000\u0000"+
		"\u0000\u03c9\u03cb\u0003\u00dam\u0000\u03ca\u03c1\u0001\u0000\u0000\u0000"+
		"\u03ca\u03c9\u0001\u0000\u0000\u0000\u03cb\u0099\u0001\u0000\u0000\u0000"+
		"\u03cc\u03ce\u0005,\u0000\u0000\u03cd\u03cf\u0003\u00ecv\u0000\u03ce\u03cd"+
		"\u0001\u0000\u0000\u0000\u03ce\u03cf\u0001\u0000\u0000\u0000\u03cf\u03d2"+
		"\u0001\u0000\u0000\u0000\u03d0\u03d1\u0005!\u0000\u0000\u03d1\u03d3\u0003"+
		"L&\u0000\u03d2\u03d0\u0001\u0000\u0000\u0000\u03d2\u03d3\u0001\u0000\u0000"+
		"\u0000\u03d3\u03d4\u0001\u0000\u0000\u0000\u03d4\u03d5\u0005_\u0000\u0000"+
		"\u03d5\u009b\u0001\u0000\u0000\u0000\u03d6\u03d9\u0005-\u0000\u0000\u03d7"+
		"\u03da\u0003\u00d6k\u0000\u03d8\u03da\u0003\u00d8l\u0000\u03d9\u03d7\u0001"+
		"\u0000\u0000\u0000\u03d9\u03d8\u0001\u0000\u0000\u0000\u03da\u03db\u0001"+
		"\u0000\u0000\u0000\u03db\u03dc\u0003\u0098L\u0000\u03dc\u03dd\u0005_\u0000"+
		"\u0000\u03dd\u009d\u0001\u0000\u0000\u0000\u03de\u03df\u0005\u0010\u0000"+
		"\u0000\u03df\u03e0\u0003R)\u0000\u03e0\u03e2\u0005\u0017\u0000\u0000\u03e1"+
		"\u03e3\u0005.\u0000\u0000\u03e2\u03e1\u0001\u0000\u0000\u0000\u03e2\u03e3"+
		"\u0001\u0000\u0000\u0000\u03e3\u03e4\u0001\u0000\u0000\u0000\u03e4\u03e5"+
		"\u0003\u00a2Q\u0000\u03e5\u03e6\u0005c\u0000\u0000\u03e6\u03e7\u0003\u00a4"+
		"R\u0000\u03e7\u03e9\u0005\u0012\u0000\u0000\u03e8\u03ea\u0003~?\u0000"+
		"\u03e9\u03e8\u0001\u0000\u0000\u0000\u03ea\u03eb\u0001\u0000\u0000\u0000"+
		"\u03eb\u03e9\u0001\u0000\u0000\u0000\u03eb\u03ec\u0001\u0000\u0000\u0000"+
		"\u03ec\u03ed\u0001\u0000\u0000\u0000\u03ed\u03ee\u0005\u0006\u0000\u0000"+
		"\u03ee\u03f0\u0005\u0012\u0000\u0000\u03ef\u03f1\u0003\u00ecv\u0000\u03f0"+
		"\u03ef\u0001\u0000\u0000\u0000\u03f0\u03f1\u0001\u0000\u0000\u0000\u03f1"+
		"\u03f2\u0001\u0000\u0000\u0000\u03f2\u03f3\u0005_\u0000\u0000\u03f3\u009f"+
		"\u0001\u0000\u0000\u0000\u03f4\u03f5\u0005\u0010\u0000\u0000\u03f5\u03f6"+
		"\u0003\u00dam\u0000\u03f6\u0409\u0005\u0017\u0000\u0000\u03f7\u0403\u0003"+
		"\u00d6k\u0000\u03f8\u03f9\u0005Z\u0000\u0000\u03f9\u03fe\u0003\f\u0006"+
		"\u0000\u03fa\u03fb\u0005^\u0000\u0000\u03fb\u03fd\u0003\f\u0006\u0000"+
		"\u03fc\u03fa\u0001\u0000\u0000\u0000\u03fd\u0400\u0001\u0000\u0000\u0000"+
		"\u03fe\u03fc\u0001\u0000\u0000\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000"+
		"\u03ff\u0401\u0001\u0000\u0000\u0000\u0400\u03fe\u0001\u0000\u0000\u0000"+
		"\u0401\u0402\u0005[\u0000\u0000\u0402\u0404\u0001\u0000\u0000\u0000\u0403"+
		"\u03f8\u0001\u0000\u0000\u0000\u0403\u0404\u0001\u0000\u0000\u0000\u0404"+
		"\u040a\u0001\u0000\u0000\u0000\u0405\u0406\u0005Z\u0000\u0000\u0406\u0407"+
		"\u0003\u00fc~\u0000\u0407\u0408\u0005[\u0000\u0000\u0408\u040a\u0001\u0000"+
		"\u0000\u0000\u0409\u03f7\u0001\u0000\u0000\u0000\u0409\u0405\u0001\u0000"+
		"\u0000\u0000\u040a\u040b\u0001\u0000\u0000\u0000\u040b\u040d\u0005\u0012"+
		"\u0000\u0000\u040c\u040e\u0003~?\u0000\u040d\u040c\u0001\u0000\u0000\u0000"+
		"\u040e\u040f\u0001\u0000\u0000\u0000\u040f\u040d\u0001\u0000\u0000\u0000"+
		"\u040f\u0410\u0001\u0000\u0000\u0000\u0410\u0411\u0001\u0000\u0000\u0000"+
		"\u0411\u0412\u0005\u0006\u0000\u0000\u0412\u0414\u0005\u0012\u0000\u0000"+
		"\u0413\u0415\u0003\u00ecv\u0000\u0414\u0413\u0001\u0000\u0000\u0000\u0414"+
		"\u0415\u0001\u0000\u0000\u0000\u0415\u0416\u0001\u0000\u0000\u0000\u0416"+
		"\u0417\u0005_\u0000\u0000\u0417\u00a1\u0001\u0000\u0000\u0000\u0418\u041c"+
		"\u0003d2\u0000\u0419\u041c\u0003\u00fa}\u0000\u041a\u041c\u0003^/\u0000"+
		"\u041b\u0418\u0001\u0000\u0000\u0000\u041b\u0419\u0001\u0000\u0000\u0000"+
		"\u041b\u041a\u0001\u0000\u0000\u0000\u041c\u00a3\u0001\u0000\u0000\u0000"+
		"\u041d\u0421\u0003d2\u0000\u041e\u0421\u0003\u00fa}\u0000\u041f\u0421"+
		"\u0003^/\u0000\u0420\u041d\u0001\u0000\u0000\u0000\u0420\u041e\u0001\u0000"+
		"\u0000\u0000\u0420\u041f\u0001\u0000\u0000\u0000\u0421\u00a5\u0001\u0000"+
		"\u0000\u0000\u0422\u0423\u00050\u0000\u0000\u0423\u0424\u0003\u00ecv\u0000"+
		"\u0424\u0425\u0005_\u0000\u0000\u0425\u00a7\u0001\u0000\u0000\u0000\u0426"+
		"\u0427\u00051\u0000\u0000\u0427\u0428\u0003L&\u0000\u0428\u042a\u0005"+
		"\"\u0000\u0000\u0429\u042b\u0003~?\u0000\u042a\u0429\u0001\u0000\u0000"+
		"\u0000\u042b\u042c\u0001\u0000\u0000\u0000\u042c\u042a\u0001\u0000\u0000"+
		"\u0000\u042c\u042d\u0001\u0000\u0000\u0000\u042d\u0438\u0001\u0000\u0000"+
		"\u0000\u042e\u042f\u00052\u0000\u0000\u042f\u0430\u0003L&\u0000\u0430"+
		"\u0432\u0005\"\u0000\u0000\u0431\u0433\u0003~?\u0000\u0432\u0431\u0001"+
		"\u0000\u0000\u0000\u0433\u0434\u0001\u0000\u0000\u0000\u0434\u0432\u0001"+
		"\u0000\u0000\u0000\u0434\u0435\u0001\u0000\u0000\u0000\u0435\u0437\u0001"+
		"\u0000\u0000\u0000\u0436\u042e\u0001\u0000\u0000\u0000\u0437\u043a\u0001"+
		"\u0000\u0000\u0000\u0438\u0436\u0001\u0000\u0000\u0000\u0438\u0439\u0001"+
		"\u0000\u0000\u0000\u0439\u0441\u0001\u0000\u0000\u0000\u043a\u0438\u0001"+
		"\u0000\u0000\u0000\u043b\u043d\u0005#\u0000\u0000\u043c\u043e\u0003~?"+
		"\u0000\u043d\u043c\u0001\u0000\u0000\u0000\u043e\u043f\u0001\u0000\u0000"+
		"\u0000\u043f\u043d\u0001\u0000\u0000\u0000\u043f\u0440\u0001\u0000\u0000"+
		"\u0000\u0440\u0442\u0001\u0000\u0000\u0000\u0441\u043b\u0001\u0000\u0000"+
		"\u0000\u0441\u0442\u0001\u0000\u0000\u0000\u0442\u0443\u0001\u0000\u0000"+
		"\u0000\u0443\u0444\u0005\u0006\u0000\u0000\u0444\u0445\u00051\u0000\u0000"+
		"\u0445\u0446\u0005_\u0000\u0000\u0446\u00a9\u0001\u0000\u0000\u0000\u0447"+
		"\u0448\u0005\t\u0000\u0000\u0448\u0449\u0005_\u0000\u0000\u0449\u00ab"+
		"\u0001\u0000\u0000\u0000\u044a\u044b\u00053\u0000\u0000\u044b\u044c\u0003"+
		"\u00d8l\u0000\u044c\u044f\u0005\u0010\u0000\u0000\u044d\u0450\u0003\u00fc"+
		"~\u0000\u044e\u0450\u0003\u00b0X\u0000\u044f\u044d\u0001\u0000\u0000\u0000"+
		"\u044f\u044e\u0001\u0000\u0000\u0000\u0450\u0451\u0001\u0000\u0000\u0000"+
		"\u0451\u0452\u0005_\u0000\u0000\u0452\u00ad\u0001\u0000\u0000\u0000\u0453"+
		"\u0454\u00053\u0000\u0000\u0454\u0460\u0003\u00d6k\u0000\u0455\u0456\u0005"+
		"Z\u0000\u0000\u0456\u045b\u0003\f\u0006\u0000\u0457\u0458\u0005^\u0000"+
		"\u0000\u0458\u045a\u0003\f\u0006\u0000\u0459\u0457\u0001\u0000\u0000\u0000"+
		"\u045a\u045d\u0001\u0000\u0000\u0000\u045b\u0459\u0001\u0000\u0000\u0000"+
		"\u045b\u045c\u0001\u0000\u0000\u0000\u045c\u045e\u0001\u0000\u0000\u0000"+
		"\u045d\u045b\u0001\u0000\u0000\u0000\u045e\u045f\u0005[\u0000\u0000\u045f"+
		"\u0461\u0001\u0000\u0000\u0000\u0460\u0455\u0001\u0000\u0000\u0000\u0460"+
		"\u0461\u0001\u0000\u0000\u0000\u0461\u0462\u0001\u0000\u0000\u0000\u0462"+
		"\u0463\u0005_\u0000\u0000\u0463\u00af\u0001\u0000\u0000\u0000\u0464\u0465"+
		"\u0003T*\u0000\u0465\u00b1\u0001\u0000\u0000\u0000\u0466\u0473\u0003\u00e6"+
		"s\u0000\u0467\u0470\u0005Z\u0000\u0000\u0468\u046d\u0003\f\u0006\u0000"+
		"\u0469\u046a\u0005^\u0000\u0000\u046a\u046c\u0003\f\u0006\u0000\u046b"+
		"\u0469\u0001\u0000\u0000\u0000\u046c\u046f\u0001\u0000\u0000\u0000\u046d"+
		"\u046b\u0001\u0000\u0000\u0000\u046d\u046e\u0001\u0000\u0000\u0000\u046e"+
		"\u0471\u0001\u0000\u0000\u0000\u046f\u046d\u0001\u0000\u0000\u0000\u0470"+
		"\u0468\u0001\u0000\u0000\u0000\u0470\u0471\u0001\u0000\u0000\u0000\u0471"+
		"\u0472\u0001\u0000\u0000\u0000\u0472\u0474\u0005[\u0000\u0000\u0473\u0467"+
		"\u0001\u0000\u0000\u0000\u0473\u0474\u0001\u0000\u0000\u0000\u0474\u0475"+
		"\u0001\u0000\u0000\u0000\u0475\u0476\u0005_\u0000\u0000\u0476\u00b3\u0001"+
		"\u0000\u0000\u0000\u0477\u0478\u0003\u00b6[\u0000\u0478\u047f\u0003\u00b8"+
		"\\\u0000\u0479\u047a\u0005\b\u0000\u0000\u047a\u047c\u0005\t\u0000\u0000"+
		"\u047b\u0479\u0001\u0000\u0000\u0000\u047b\u047c\u0001\u0000\u0000\u0000"+
		"\u047c\u047d\u0001\u0000\u0000\u0000\u047d\u047e\u0007\u0001\u0000\u0000"+
		"\u047e\u0480\u0003<\u001e\u0000\u047f\u047b\u0001\u0000\u0000\u0000\u047f"+
		"\u0480\u0001\u0000\u0000\u0000\u0480\u0481\u0001\u0000\u0000\u0000\u0481"+
		"\u0482\u0005_\u0000\u0000\u0482\u00b5\u0001\u0000\u0000\u0000\u0483\u0484"+
		"\u0005t\u0000\u0000\u0484\u00b7\u0001\u0000\u0000\u0000\u0485\u048a\u0003"+
		"\u00eew\u0000\u0486\u048a\u0003\u00f0x\u0000\u0487\u048a\u0003\u00f2y"+
		"\u0000\u0488\u048a\u0003\u00ba]\u0000\u0489\u0485\u0001\u0000\u0000\u0000"+
		"\u0489\u0486\u0001\u0000\u0000\u0000\u0489\u0487\u0001\u0000\u0000\u0000"+
		"\u0489\u0488\u0001\u0000\u0000\u0000\u048a\u00b9\u0001\u0000\u0000\u0000"+
		"\u048b\u048c\u0005t\u0000\u0000\u048c\u048e\u0005d\u0000\u0000\u048d\u048b"+
		"\u0001\u0000\u0000\u0000\u048d\u048e\u0001\u0000\u0000\u0000\u048e\u048f"+
		"\u0001\u0000\u0000\u0000\u048f\u0490\u0005t\u0000\u0000\u0490\u00bb\u0001"+
		"\u0000\u0000\u0000\u0491\u0493\u00054\u0000\u0000\u0492\u0494\u0003\u00e4"+
		"r\u0000\u0493\u0492\u0001\u0000\u0000\u0000\u0493\u0494\u0001\u0000\u0000"+
		"\u0000\u0494\u0495\u0001\u0000\u0000\u0000\u0495\u0496\u0005_\u0000\u0000"+
		"\u0496\u00bd\u0001\u0000\u0000\u0000\u0497\u0499\u0005$\u0000\u0000\u0498"+
		"\u049a\u0003<\u001e\u0000\u0499\u0498\u0001\u0000\u0000\u0000\u0499\u049a"+
		"\u0001\u0000\u0000\u0000\u049a\u049b\u0001\u0000\u0000\u0000\u049b\u049c"+
		"\u0005_\u0000\u0000\u049c\u00bf\u0001\u0000\u0000\u0000\u049d\u04a1\u0005"+
		"&\u0000\u0000\u049e\u04a0\b\u000b\u0000\u0000\u049f\u049e\u0001\u0000"+
		"\u0000\u0000\u04a0\u04a3\u0001\u0000\u0000\u0000\u04a1\u04a2\u0001\u0000"+
		"\u0000\u0000\u04a1\u049f\u0001\u0000\u0000\u0000\u04a2\u04a4\u0001\u0000"+
		"\u0000\u0000\u04a3\u04a1\u0001\u0000\u0000\u0000\u04a4\u04a8\u0005+\u0000"+
		"\u0000\u04a5\u04a7\b\u000b\u0000\u0000\u04a6\u04a5\u0001\u0000\u0000\u0000"+
		"\u04a7\u04aa\u0001\u0000\u0000\u0000\u04a8\u04a9\u0001\u0000\u0000\u0000"+
		"\u04a8\u04a6\u0001\u0000\u0000\u0000\u04a9\u04ab\u0001\u0000\u0000\u0000"+
		"\u04aa\u04a8\u0001\u0000\u0000\u0000\u04ab\u04ac\u0005_\u0000\u0000\u04ac"+
		"\u00c1\u0001\u0000\u0000\u0000\u04ad\u04ae\u0003\u0004\u0002\u0000\u04ae"+
		"\u04af\u0005d\u0000\u0000\u04af\u04b1\u0001\u0000\u0000\u0000\u04b0\u04ad"+
		"\u0001\u0000\u0000\u0000\u04b0\u04b1\u0001\u0000\u0000\u0000\u04b1\u04b2"+
		"\u0001\u0000\u0000\u0000\u04b2\u04b3\u0003\u00deo\u0000\u04b3\u00c3\u0001"+
		"\u0000\u0000\u0000\u04b4\u04b5\u0003\u00fc~\u0000\u04b5\u00c5\u0001\u0000"+
		"\u0000\u0000\u04b6\u04bd\u0003\u00c8d\u0000\u04b7\u04bd\u0003\u00ccf\u0000"+
		"\u04b8\u04bd\u0003\u00ceg\u0000\u04b9\u04bd\u0003\u00cae\u0000\u04ba\u04bd"+
		"\u0003\u00d0h\u0000\u04bb\u04bd\u0003\u00d2i\u0000\u04bc\u04b6\u0001\u0000"+
		"\u0000\u0000\u04bc\u04b7\u0001\u0000\u0000\u0000\u04bc\u04b8\u0001\u0000"+
		"\u0000\u0000\u04bc\u04b9\u0001\u0000\u0000\u0000\u04bc\u04ba\u0001\u0000"+
		"\u0000\u0000\u04bc\u04bb\u0001\u0000\u0000\u0000\u04bd\u00c7\u0001\u0000"+
		"\u0000\u0000\u04be\u04bf\u0005\u0003\u0000\u0000\u04bf\u04c0\u0005_\u0000"+
		"\u0000\u04c0\u00c9\u0001\u0000\u0000\u0000\u04c1\u04c2\u0005\u000e\u0000"+
		"\u0000\u04c2\u04c3\u0005_\u0000\u0000\u04c3\u00cb\u0001\u0000\u0000\u0000"+
		"\u04c4\u04c8\u0005\u0005\u0000\u0000\u04c5\u04c7\b\u000b\u0000\u0000\u04c6"+
		"\u04c5\u0001\u0000\u0000\u0000\u04c7\u04ca\u0001\u0000\u0000\u0000\u04c8"+
		"\u04c9\u0001\u0000\u0000\u0000\u04c8\u04c6\u0001\u0000\u0000\u0000\u04c9"+
		"\u04cb\u0001\u0000\u0000\u0000\u04ca\u04c8\u0001\u0000\u0000\u0000\u04cb"+
		"\u04cc\u0005_\u0000\u0000\u04cc\u00cd\u0001\u0000\u0000\u0000\u04cd\u04d1"+
		"\u0005\u0018\u0000\u0000\u04ce\u04d0\b\u000b\u0000\u0000\u04cf\u04ce\u0001"+
		"\u0000\u0000\u0000\u04d0\u04d3\u0001\u0000\u0000\u0000\u04d1\u04d2\u0001"+
		"\u0000\u0000\u0000\u04d1\u04cf\u0001\u0000\u0000\u0000\u04d2\u04d4\u0001"+
		"\u0000\u0000\u0000\u04d3\u04d1\u0001\u0000\u0000\u0000\u04d4\u04d5\u0005"+
		"_\u0000\u0000\u04d5\u00cf\u0001\u0000\u0000\u0000\u04d6\u04da\u0005*\u0000"+
		"\u0000\u04d7\u04d9\b\u000b\u0000\u0000\u04d8\u04d7\u0001\u0000\u0000\u0000"+
		"\u04d9\u04dc\u0001\u0000\u0000\u0000\u04da\u04db\u0001\u0000\u0000\u0000"+
		"\u04da\u04d8\u0001\u0000\u0000\u0000\u04db\u04dd\u0001\u0000\u0000\u0000"+
		"\u04dc\u04da\u0001\u0000\u0000\u0000\u04dd\u04de\u0005_\u0000\u0000\u04de"+
		"\u00d1\u0001\u0000\u0000\u0000\u04df\u04e0\u0005C\u0000\u0000\u04e0\u04e4"+
		"\u0005+\u0000\u0000\u04e1\u04e3\b\u000b\u0000\u0000\u04e2\u04e1\u0001"+
		"\u0000\u0000\u0000\u04e3\u04e6\u0001\u0000\u0000\u0000\u04e4\u04e5\u0001"+
		"\u0000\u0000\u0000\u04e4\u04e2\u0001\u0000\u0000\u0000\u04e5\u04e7\u0001"+
		"\u0000\u0000\u0000\u04e6\u04e4\u0001\u0000\u0000\u0000\u04e7\u04e8\u0005"+
		"_\u0000\u0000\u04e8\u00d3\u0001\u0000\u0000\u0000\u04e9\u04ea\u0005t\u0000"+
		"\u0000\u04ea\u04ec\u0005d\u0000\u0000\u04eb\u04e9\u0001\u0000\u0000\u0000"+
		"\u04eb\u04ec\u0001\u0000\u0000\u0000\u04ec\u04ed\u0001\u0000\u0000\u0000"+
		"\u04ed\u04ee\u0005t\u0000\u0000\u04ee\u00d5\u0001\u0000\u0000\u0000\u04ef"+
		"\u04f0\u0005t\u0000\u0000\u04f0\u00d7\u0001\u0000\u0000\u0000\u04f1\u04f2"+
		"\u0005t\u0000\u0000\u04f2\u00d9\u0001\u0000\u0000\u0000\u04f3\u04f4\u0005"+
		"t\u0000\u0000\u04f4\u00db\u0001\u0000\u0000\u0000\u04f5\u04f6\u0005t\u0000"+
		"\u0000\u04f6\u00dd\u0001\u0000\u0000\u0000\u04f7\u04f8\u0005t\u0000\u0000"+
		"\u04f8\u00df\u0001\u0000\u0000\u0000\u04f9\u04fa\u0005t\u0000\u0000\u04fa"+
		"\u00e1\u0001\u0000\u0000\u0000\u04fb\u04fc\u0005t\u0000\u0000\u04fc\u00e3"+
		"\u0001\u0000\u0000\u0000\u04fd\u04fe\u0005t\u0000\u0000\u04fe\u00e5\u0001"+
		"\u0000\u0000\u0000\u04ff\u0500\u0003\u0004\u0002\u0000\u0500\u0501\u0005"+
		"d\u0000\u0000\u0501\u0503\u0001\u0000\u0000\u0000\u0502\u04ff\u0001\u0000"+
		"\u0000\u0000\u0502\u0503\u0001\u0000\u0000\u0000\u0503\u0504\u0001\u0000"+
		"\u0000\u0000\u0504\u0505\u0003\u0006\u0003\u0000\u0505\u00e7\u0001\u0000"+
		"\u0000\u0000\u0506\u0507\u0005t\u0000\u0000\u0507\u00e9\u0001\u0000\u0000"+
		"\u0000\u0508\u0509\u0005t\u0000\u0000\u0509\u00eb\u0001\u0000\u0000\u0000"+
		"\u050a\u050b\u0005t\u0000\u0000\u050b\u00ed\u0001\u0000\u0000\u0000\u050c"+
		"\u0511\u0007\u000e\u0000\u0000\u050d\u050e\u0005Z\u0000\u0000\u050e\u050f"+
		"\u0003\u00f4z\u0000\u050f\u0510\u0005[\u0000\u0000\u0510\u0512\u0001\u0000"+
		"\u0000\u0000\u0511\u050d\u0001\u0000\u0000\u0000\u0511\u0512\u0001\u0000"+
		"\u0000\u0000\u0512\u0526\u0001\u0000\u0000\u0000\u0513\u051c\u00059\u0000"+
		"\u0000\u0514\u0515\u0005Z\u0000\u0000\u0515\u0518\u0003\u00f4z\u0000\u0516"+
		"\u0517\u0005^\u0000\u0000\u0517\u0519\u0003\u00f4z\u0000\u0518\u0516\u0001"+
		"\u0000\u0000\u0000\u0518\u0519\u0001\u0000\u0000\u0000\u0519\u051a\u0001"+
		"\u0000\u0000\u0000\u051a\u051b\u0005[\u0000\u0000\u051b\u051d\u0001\u0000"+
		"\u0000\u0000\u051c\u0514\u0001\u0000\u0000\u0000\u051c\u051d\u0001\u0000"+
		"\u0000\u0000\u051d\u0526\u0001\u0000\u0000\u0000\u051e\u0526\u0005:\u0000"+
		"\u0000\u051f\u0526\u0005;\u0000\u0000\u0520\u0526\u0005<\u0000\u0000\u0521"+
		"\u0526\u0005=\u0000\u0000\u0522\u0526\u0005>\u0000\u0000\u0523\u0526\u0005"+
		"W\u0000\u0000\u0524\u0526\u0005X\u0000\u0000\u0525\u050c\u0001\u0000\u0000"+
		"\u0000\u0525\u0513\u0001\u0000\u0000\u0000\u0525\u051e\u0001\u0000\u0000"+
		"\u0000\u0525\u051f\u0001\u0000\u0000\u0000\u0525\u0520\u0001\u0000\u0000"+
		"\u0000\u0525\u0521\u0001\u0000\u0000\u0000\u0525\u0522\u0001\u0000\u0000"+
		"\u0000\u0525\u0523\u0001\u0000\u0000\u0000\u0525\u0524\u0001\u0000\u0000"+
		"\u0000\u0526\u00ef\u0001\u0000\u0000\u0000\u0527\u0528\u0003J%\u0000\u0528"+
		"\u0529\u0005b\u0000\u0000\u0529\u052a\u0005\u000f\u0000\u0000\u052a\u00f1"+
		"\u0001\u0000\u0000\u0000\u052b\u052c\u0003J%\u0000\u052c\u052d\u0005b"+
		"\u0000\u0000\u052d\u052e\u0005\r\u0000\u0000\u052e\u00f3\u0001\u0000\u0000"+
		"\u0000\u052f\u0530\u0005u\u0000\u0000\u0530\u00f5\u0001\u0000\u0000\u0000"+
		"\u0531\u0532\u0005t\u0000\u0000\u0532\u00f7\u0001\u0000\u0000\u0000\u0533"+
		"\u0534\u0005t\u0000\u0000\u0534\u00f9\u0001\u0000\u0000\u0000\u0535\u0536"+
		"\u0003J%\u0000\u0536\u00fb\u0001\u0000\u0000\u0000\u0537\u0538\u0003r"+
		"9\u0000\u0538\u0539\u0003t:\u0000\u0539\u00fd\u0001\u0000\u0000\u0000"+
		"\u008a\u0103\u0107\u010c\u0112\u011b\u0120\u0124\u012e\u0131\u0139\u0142"+
		"\u0144\u0149\u014e\u016e\u0173\u0177\u017f\u0184\u0189\u0195\u01b2\u01c0"+
		"\u01c6\u01ca\u01d3\u01dd\u01e3\u01e5\u01e9\u01f3\u01f7\u01fd\u0205\u020a"+
		"\u021c\u0228\u0235\u0238\u023a\u0242\u024d\u0253\u0256\u025d\u0268\u026b"+
		"\u0277\u0279\u027e\u028c\u028e\u0293\u02a1\u02a5\u02b4\u02b8\u02c4\u02ca"+
		"\u02d1\u02db\u02e4\u02e8\u02ee\u02f1\u02f6\u02fb\u0302\u0307\u0310\u0318"+
		"\u031c\u0324\u033e\u034b\u0353\u0358\u035e\u0369\u036f\u0371\u0376\u0382"+
		"\u0388\u038a\u038f\u0396\u039c\u03a0\u03af\u03b4\u03bd\u03c6\u03ca\u03ce"+
		"\u03d2\u03d9\u03e2\u03eb\u03f0\u03fe\u0403\u0409\u040f\u0414\u041b\u0420"+
		"\u042c\u0434\u0438\u043f\u0441\u044f\u045b\u0460\u046d\u0470\u0473\u047b"+
		"\u047f\u0489\u048d\u0493\u0499\u04a1\u04a8\u04b0\u04bc\u04c8\u04d1\u04da"+
		"\u04e4\u04eb\u0502\u0511\u0518\u051c\u0525";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}