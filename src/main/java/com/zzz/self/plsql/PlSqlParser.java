// Generated from F:/antlr/src/main/java/com/zzz/self/plsql\PlSql.g4 by ANTLR 4.12.0
package com.zzz.self.plsql;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PlSqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, Identifier=7, Operator=8, 
		Value=9, WS=10;
	public static final int
		RULE_selectStatement = 0, RULE_selectClause = 1, RULE_selectList = 2, 
		RULE_selectItem = 3, RULE_columnIdentifier = 4, RULE_fromClause = 5, RULE_tableName = 6, 
		RULE_whereClause = 7, RULE_condition = 8, RULE_expression = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"selectStatement", "selectClause", "selectList", "selectItem", "columnIdentifier", 
			"fromClause", "tableName", "whereClause", "condition", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SELECT'", "'*'", "','", "'.'", "'FROM'", "'WHERE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "Identifier", "Operator", "Value", 
			"WS"
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
	public String getGrammarFileName() { return "PlSql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectStatementContext extends ParserRuleContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlSqlListener ) ((PlSqlListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlSqlListener ) ((PlSqlListener)listener).exitSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlSqlVisitor ) return ((PlSqlVisitor<? extends T>)visitor).visitSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			selectClause();
			setState(21);
			fromClause();
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(22);
				whereClause();
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
	public static class SelectClauseContext extends ParserRuleContext {
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlSqlListener ) ((PlSqlListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlSqlListener ) ((PlSqlListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlSqlVisitor ) return ((PlSqlVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_selectClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(T__0);
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(26);
				selectList();
				}
				break;
			case T__1:
				{
				setState(27);
				match(T__1);
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
	public static class SelectListContext extends ParserRuleContext {
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public SelectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlSqlListener ) ((PlSqlListener)listener).enterSelectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlSqlListener ) ((PlSqlListener)listener).exitSelectList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlSqlVisitor ) return ((PlSqlVisitor<? extends T>)visitor).visitSelectList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectListContext selectList() throws RecognitionException {
		SelectListContext _localctx = new SelectListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			selectItem();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(31);
				match(T__2);
				setState(32);
				selectItem();
				}
				}
				setState(37);
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
	public static class SelectItemContext extends ParserRuleContext {
		public ColumnIdentifierContext columnIdentifier() {
			return getRuleContext(ColumnIdentifierContext.class,0);
		}
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlSqlListener ) ((PlSqlListener)listener).enterSelectItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlSqlListener ) ((PlSqlListener)listener).exitSelectItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlSqlVisitor ) return ((PlSqlVisitor<? extends T>)visitor).visitSelectItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selectItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			columnIdentifier();
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
	public static class ColumnIdentifierContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(PlSqlParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PlSqlParser.Identifier, i);
		}
		public ColumnIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlSqlListener ) ((PlSqlListener)listener).enterColumnIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlSqlListener ) ((PlSqlListener)listener).exitColumnIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlSqlVisitor ) return ((PlSqlVisitor<? extends T>)visitor).visitColumnIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnIdentifierContext columnIdentifier() throws RecognitionException {
		ColumnIdentifierContext _localctx = new ColumnIdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_columnIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(Identifier);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(41);
				match(T__3);
				setState(42);
				match(Identifier);
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
	public static class FromClauseContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlSqlListener ) ((PlSqlListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlSqlListener ) ((PlSqlListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlSqlVisitor ) return ((PlSqlVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__4);
			setState(46);
			tableName();
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
	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PlSqlParser.Identifier, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlSqlListener ) ((PlSqlListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlSqlListener ) ((PlSqlListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlSqlVisitor ) return ((PlSqlVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(Identifier);
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
	public static class WhereClauseContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlSqlListener ) ((PlSqlListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlSqlListener ) ((PlSqlListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlSqlVisitor ) return ((PlSqlVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__5);
			setState(51);
			condition();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlSqlListener ) ((PlSqlListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlSqlListener ) ((PlSqlListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlSqlVisitor ) return ((PlSqlVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			expression();
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
		public TerminalNode Identifier() { return getToken(PlSqlParser.Identifier, 0); }
		public TerminalNode Operator() { return getToken(PlSqlParser.Operator, 0); }
		public TerminalNode Value() { return getToken(PlSqlParser.Value, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlSqlListener ) ((PlSqlListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlSqlListener ) ((PlSqlListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlSqlVisitor ) return ((PlSqlVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(Identifier);
			setState(56);
			match(Operator);
			setState(57);
			match(Value);
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
		"\u0004\u0001\n<\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"\u0018\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001d\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\"\b\u0002\n\u0002"+
		"\f\u0002%\t\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004,\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0000\u00005\u0000\u0014\u0001\u0000\u0000"+
		"\u0000\u0002\u0019\u0001\u0000\u0000\u0000\u0004\u001e\u0001\u0000\u0000"+
		"\u0000\u0006&\u0001\u0000\u0000\u0000\b(\u0001\u0000\u0000\u0000\n-\u0001"+
		"\u0000\u0000\u0000\f0\u0001\u0000\u0000\u0000\u000e2\u0001\u0000\u0000"+
		"\u0000\u00105\u0001\u0000\u0000\u0000\u00127\u0001\u0000\u0000\u0000\u0014"+
		"\u0015\u0003\u0002\u0001\u0000\u0015\u0017\u0003\n\u0005\u0000\u0016\u0018"+
		"\u0003\u000e\u0007\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0017\u0018"+
		"\u0001\u0000\u0000\u0000\u0018\u0001\u0001\u0000\u0000\u0000\u0019\u001c"+
		"\u0005\u0001\u0000\u0000\u001a\u001d\u0003\u0004\u0002\u0000\u001b\u001d"+
		"\u0005\u0002\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001b"+
		"\u0001\u0000\u0000\u0000\u001d\u0003\u0001\u0000\u0000\u0000\u001e#\u0003"+
		"\u0006\u0003\u0000\u001f \u0005\u0003\u0000\u0000 \"\u0003\u0006\u0003"+
		"\u0000!\u001f\u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001"+
		"\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\u0005\u0001\u0000\u0000"+
		"\u0000%#\u0001\u0000\u0000\u0000&\'\u0003\b\u0004\u0000\'\u0007\u0001"+
		"\u0000\u0000\u0000(+\u0005\u0007\u0000\u0000)*\u0005\u0004\u0000\u0000"+
		"*,\u0005\u0007\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000"+
		"\u0000,\t\u0001\u0000\u0000\u0000-.\u0005\u0005\u0000\u0000./\u0003\f"+
		"\u0006\u0000/\u000b\u0001\u0000\u0000\u000001\u0005\u0007\u0000\u0000"+
		"1\r\u0001\u0000\u0000\u000023\u0005\u0006\u0000\u000034\u0003\u0010\b"+
		"\u00004\u000f\u0001\u0000\u0000\u000056\u0003\u0012\t\u00006\u0011\u0001"+
		"\u0000\u0000\u000078\u0005\u0007\u0000\u000089\u0005\b\u0000\u00009:\u0005"+
		"\t\u0000\u0000:\u0013\u0001\u0000\u0000\u0000\u0004\u0017\u001c#+";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}