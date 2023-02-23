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
public class SolidityParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, LicenseIdentifier=101, 
		Int=102, Uint=103, Byte=104, Fixed=105, Ufixed=106, VersionLiteral=107, 
		BooleanLiteral=108, DecimalNumber=109, HexNumber=110, NumberUnit=111, 
		HexLiteral=112, ReservedKeyword=113, AnonymousKeyword=114, BreakKeyword=115, 
		ConstantKeyword=116, OverrideKeyword=117, ImmutableKeyword=118, VirtualKeyword=119, 
		ContinueKeyword=120, ExternalKeyword=121, IndexedKeyword=122, InternalKeyword=123, 
		PayableKeyword=124, PrivateKeyword=125, PublicKeyword=126, PureKeyword=127, 
		TypeKeyword=128, ViewKeyword=129, Identifier=130, StringLiteral=131, WS=132, 
		NatSpecSingleLine=133, NatSpecMultiLine=134, LINE_COMMENT=135, COMMENT=136;
	public static final int
		RULE_sourceUnit = 0, RULE_spdxLicenseIdentifier = 1, RULE_pragmaDirective = 2, 
		RULE_pragmaName = 3, RULE_pragmaValue = 4, RULE_version = 5, RULE_versionOperator = 6, 
		RULE_versionConstraint = 7, RULE_importDeclaration = 8, RULE_importDirective = 9, 
		RULE_natSpec = 10, RULE_contractDefinition = 11, RULE_inheritanceSpecifier = 12, 
		RULE_callArgumentList = 13, RULE_contractPart = 14, RULE_stateVariableDeclaration = 15, 
		RULE_usingForDeclaration = 16, RULE_structDefinition = 17, RULE_constructorDefinition = 18, 
		RULE_modifierDefinition = 19, RULE_modifierInvocation = 20, RULE_functionDefinition = 21, 
		RULE_returnParameters = 22, RULE_overrideParameters = 23, RULE_modifierList = 24, 
		RULE_eventDefinition = 25, RULE_enumValue = 26, RULE_enumDefinition = 27, 
		RULE_parameterList = 28, RULE_objectList = 29, RULE_parameter = 30, RULE_eventParameterList = 31, 
		RULE_eventParameter = 32, RULE_functionTypeParameterList = 33, RULE_functionTypeParameter = 34, 
		RULE_variableDeclaration = 35, RULE_typeName = 36, RULE_userDefinedTypeName = 37, 
		RULE_mapping = 38, RULE_functionTypeName = 39, RULE_visibility = 40, RULE_storageLocation = 41, 
		RULE_stateMutability = 42, RULE_block = 43, RULE_uncheckedBlock = 44, 
		RULE_statement = 45, RULE_tryStatement = 46, RULE_catchClause = 47, RULE_expressionStatement = 48, 
		RULE_ifStatement = 49, RULE_ifCondition = 50, RULE_ifRight = 51, RULE_ifWrong = 52, 
		RULE_whileStatement = 53, RULE_simpleStatement = 54, RULE_forStatement = 55, 
		RULE_inlineAssemblyStatement = 56, RULE_doWhileStatement = 57, RULE_continueStatement = 58, 
		RULE_breakStatement = 59, RULE_returnStatement = 60, RULE_throwStatement = 61, 
		RULE_emitStatement = 62, RULE_variableDeclarationStatement = 63, RULE_constantVariableDeclaration = 64, 
		RULE_variableDeclarationList = 65, RULE_identifierList = 66, RULE_elementaryTypeName = 67, 
		RULE_expression = 68, RULE_primaryExpression = 69, RULE_expressionList = 70, 
		RULE_nameValueList = 71, RULE_nameValue = 72, RULE_functionCallArguments = 73, 
		RULE_functionCall = 74, RULE_assemblyBlock = 75, RULE_assemblyItem = 76, 
		RULE_assemblyExpression = 77, RULE_assemblyCall = 78, RULE_assemblyLocalDefinition = 79, 
		RULE_assemblyAssignment = 80, RULE_assemblyIdentifierOrList = 81, RULE_assemblyIdentifierList = 82, 
		RULE_assemblyStackAssignment = 83, RULE_labelDefinition = 84, RULE_assemblySwitch = 85, 
		RULE_assemblyCase = 86, RULE_assemblyFunctionDefinition = 87, RULE_assemblyFunctionReturns = 88, 
		RULE_assemblyFor = 89, RULE_assemblyIf = 90, RULE_assemblyLiteral = 91, 
		RULE_subAssembly = 92, RULE_tupleExpression = 93, RULE_typeNameExpression = 94, 
		RULE_numberLiteral = 95, RULE_identifier = 96;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceUnit", "spdxLicenseIdentifier", "pragmaDirective", "pragmaName", 
			"pragmaValue", "version", "versionOperator", "versionConstraint", "importDeclaration", 
			"importDirective", "natSpec", "contractDefinition", "inheritanceSpecifier", 
			"callArgumentList", "contractPart", "stateVariableDeclaration", "usingForDeclaration", 
			"structDefinition", "constructorDefinition", "modifierDefinition", "modifierInvocation", 
			"functionDefinition", "returnParameters", "overrideParameters", "modifierList", 
			"eventDefinition", "enumValue", "enumDefinition", "parameterList", "objectList", 
			"parameter", "eventParameterList", "eventParameter", "functionTypeParameterList", 
			"functionTypeParameter", "variableDeclaration", "typeName", "userDefinedTypeName", 
			"mapping", "functionTypeName", "visibility", "storageLocation", "stateMutability", 
			"block", "uncheckedBlock", "statement", "tryStatement", "catchClause", 
			"expressionStatement", "ifStatement", "ifCondition", "ifRight", "ifWrong", 
			"whileStatement", "simpleStatement", "forStatement", "inlineAssemblyStatement", 
			"doWhileStatement", "continueStatement", "breakStatement", "returnStatement", 
			"throwStatement", "emitStatement", "variableDeclarationStatement", "constantVariableDeclaration", 
			"variableDeclarationList", "identifierList", "elementaryTypeName", "expression", 
			"primaryExpression", "expressionList", "nameValueList", "nameValue", 
			"functionCallArguments", "functionCall", "assemblyBlock", "assemblyItem", 
			"assemblyExpression", "assemblyCall", "assemblyLocalDefinition", "assemblyAssignment", 
			"assemblyIdentifierOrList", "assemblyIdentifierList", "assemblyStackAssignment", 
			"labelDefinition", "assemblySwitch", "assemblyCase", "assemblyFunctionDefinition", 
			"assemblyFunctionReturns", "assemblyFor", "assemblyIf", "assemblyLiteral", 
			"subAssembly", "tupleExpression", "typeNameExpression", "numberLiteral", 
			"identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pragma'", "';'", "'^'", "'~'", "'>='", "'>'", "'<'", "'<='", 
			"'='", "'as'", "'import'", "'*'", "'from'", "'{'", "','", "'}'", "'abstract'", 
			"'contract'", "'interface'", "'library'", "'is'", "'('", "')'", "'({'", 
			"':'", "'})'", "'using'", "'for'", "'struct'", "'constructor'", "'modifier'", 
			"'function'", "'receive'", "'fallback'", "'returns'", "'event'", "'enum'", 
			"'['", "']'", "'address'", "'.'", "'mapping'", "'=>'", "'memory'", "'storage'", 
			"'calldata'", "'unchecked'", "'try'", "'catch'", "'if'", "'else'", "'while'", 
			"'assembly'", "'do'", "'return'", "'throw'", "'emit'", "'var'", "'bool'", 
			"'string'", "'byte'", "'++'", "'--'", "'!'", "'delete'", "'-'", "'new'", 
			"'+'", "'after'", "'**'", "'/'", "'%'", "'<<'", "'>>'", "'>>>'", "'&'", 
			"'|'", "'=='", "'!='", "'&&'", "'||'", "'?'", "'|='", "'^='", "'&='", 
			"'<<='", "'>>='", "'>>>='", "'+='", "'-='", "'*='", "'/='", "'%='", "'let'", 
			"':='", "'=:'", "'switch'", "'case'", "'default'", "'->'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'anonymous'", 
			"'break'", "'constant'", "'override'", "'immutable'", "'virtual'", "'continue'", 
			"'external'", "'indexed'", "'internal'", "'payable'", "'private'", "'public'", 
			"'pure'", "'type'", "'view'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "LicenseIdentifier", "Int", "Uint", "Byte", 
			"Fixed", "Ufixed", "VersionLiteral", "BooleanLiteral", "DecimalNumber", 
			"HexNumber", "NumberUnit", "HexLiteral", "ReservedKeyword", "AnonymousKeyword", 
			"BreakKeyword", "ConstantKeyword", "OverrideKeyword", "ImmutableKeyword", 
			"VirtualKeyword", "ContinueKeyword", "ExternalKeyword", "IndexedKeyword", 
			"InternalKeyword", "PayableKeyword", "PrivateKeyword", "PublicKeyword", 
			"PureKeyword", "TypeKeyword", "ViewKeyword", "Identifier", "StringLiteral", 
			"WS", "NatSpecSingleLine", "NatSpecMultiLine", "LINE_COMMENT", "COMMENT"
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

	public SolidityParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SolidityParser.EOF, 0); }
		public SpdxLicenseIdentifierContext spdxLicenseIdentifier() {
			return getRuleContext(SpdxLicenseIdentifierContext.class,0);
		}
		public List<NatSpecContext> natSpec() {
			return getRuleContexts(NatSpecContext.class);
		}
		public NatSpecContext natSpec(int i) {
			return getRuleContext(NatSpecContext.class,i);
		}
		public List<PragmaDirectiveContext> pragmaDirective() {
			return getRuleContexts(PragmaDirectiveContext.class);
		}
		public PragmaDirectiveContext pragmaDirective(int i) {
			return getRuleContext(PragmaDirectiveContext.class,i);
		}
		public List<ImportDirectiveContext> importDirective() {
			return getRuleContexts(ImportDirectiveContext.class);
		}
		public ImportDirectiveContext importDirective(int i) {
			return getRuleContext(ImportDirectiveContext.class,i);
		}
		public List<ContractDefinitionContext> contractDefinition() {
			return getRuleContexts(ContractDefinitionContext.class);
		}
		public ContractDefinitionContext contractDefinition(int i) {
			return getRuleContext(ContractDefinitionContext.class,i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public List<ConstantVariableDeclarationContext> constantVariableDeclaration() {
			return getRuleContexts(ConstantVariableDeclarationContext.class);
		}
		public ConstantVariableDeclarationContext constantVariableDeclaration(int i) {
			return getRuleContext(ConstantVariableDeclarationContext.class,i);
		}
		public List<StructDefinitionContext> structDefinition() {
			return getRuleContexts(StructDefinitionContext.class);
		}
		public StructDefinitionContext structDefinition(int i) {
			return getRuleContext(StructDefinitionContext.class,i);
		}
		public List<EnumDefinitionContext> enumDefinition() {
			return getRuleContexts(EnumDefinitionContext.class);
		}
		public EnumDefinitionContext enumDefinition(int i) {
			return getRuleContext(EnumDefinitionContext.class,i);
		}
		public SourceUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSourceUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSourceUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitSourceUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceUnitContext sourceUnit() throws RecognitionException {
		SourceUnitContext _localctx = new SourceUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LicenseIdentifier) {
				{
				setState(194);
				spdxLicenseIdentifier();
				}
			}

			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4323531676620564482L) != 0 || (((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 6710886431L) != 0) {
				{
				setState(205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(197);
					natSpec();
					}
					break;
				case 2:
					{
					setState(198);
					pragmaDirective();
					}
					break;
				case 3:
					{
					setState(199);
					importDirective();
					}
					break;
				case 4:
					{
					setState(200);
					contractDefinition();
					}
					break;
				case 5:
					{
					setState(201);
					functionDefinition();
					}
					break;
				case 6:
					{
					setState(202);
					constantVariableDeclaration();
					}
					break;
				case 7:
					{
					setState(203);
					structDefinition();
					}
					break;
				case 8:
					{
					setState(204);
					enumDefinition();
					}
					break;
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			match(EOF);
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
	public static class SpdxLicenseIdentifierContext extends ParserRuleContext {
		public TerminalNode LicenseIdentifier() { return getToken(SolidityParser.LicenseIdentifier, 0); }
		public SpdxLicenseIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spdxLicenseIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSpdxLicenseIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSpdxLicenseIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitSpdxLicenseIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpdxLicenseIdentifierContext spdxLicenseIdentifier() throws RecognitionException {
		SpdxLicenseIdentifierContext _localctx = new SpdxLicenseIdentifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_spdxLicenseIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(LicenseIdentifier);
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
	public static class PragmaDirectiveContext extends ParserRuleContext {
		public PragmaNameContext pragmaName() {
			return getRuleContext(PragmaNameContext.class,0);
		}
		public PragmaValueContext pragmaValue() {
			return getRuleContext(PragmaValueContext.class,0);
		}
		public PragmaDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPragmaDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPragmaDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPragmaDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaDirectiveContext pragmaDirective() throws RecognitionException {
		PragmaDirectiveContext _localctx = new PragmaDirectiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pragmaDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__0);
			setState(215);
			pragmaName();
			setState(216);
			pragmaValue();
			setState(217);
			match(T__1);
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
	public static class PragmaNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PragmaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPragmaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPragmaName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPragmaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaNameContext pragmaName() throws RecognitionException {
		PragmaNameContext _localctx = new PragmaNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pragmaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			identifier();
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
	public static class PragmaValueContext extends ParserRuleContext {
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PragmaValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPragmaValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPragmaValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPragmaValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaValueContext pragmaValue() throws RecognitionException {
		PragmaValueContext _localctx = new PragmaValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pragmaValue);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				version();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				expression(0);
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
	public static class VersionContext extends ParserRuleContext {
		public List<VersionConstraintContext> versionConstraint() {
			return getRuleContexts(VersionConstraintContext.class);
		}
		public VersionConstraintContext versionConstraint(int i) {
			return getRuleContext(VersionConstraintContext.class,i);
		}
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_version);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			versionConstraint();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1016L) != 0 || _la==VersionLiteral) {
				{
				setState(226);
				versionConstraint();
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
	public static class VersionOperatorContext extends ParserRuleContext {
		public VersionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVersionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVersionOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVersionOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionOperatorContext versionOperator() throws RecognitionException {
		VersionOperatorContext _localctx = new VersionOperatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_versionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1016L) != 0) ) {
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
	public static class VersionConstraintContext extends ParserRuleContext {
		public TerminalNode VersionLiteral() { return getToken(SolidityParser.VersionLiteral, 0); }
		public VersionOperatorContext versionOperator() {
			return getRuleContext(VersionOperatorContext.class,0);
		}
		public VersionConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVersionConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVersionConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVersionConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionConstraintContext versionConstraint() throws RecognitionException {
		VersionConstraintContext _localctx = new VersionConstraintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_versionConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1016L) != 0) {
				{
				setState(231);
				versionOperator();
				}
			}

			setState(234);
			match(VersionLiteral);
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
	public static class ImportDeclarationContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			identifier();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(237);
				match(T__9);
				setState(238);
				identifier();
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
	public static class ImportDirectiveContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public ImportDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterImportDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitImportDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitImportDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDirectiveContext importDirective() throws RecognitionException {
		ImportDirectiveContext _localctx = new ImportDirectiveContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_importDirective);
		int _la;
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(T__10);
				setState(242);
				match(StringLiteral);
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(243);
					match(T__9);
					setState(244);
					identifier();
					}
				}

				setState(247);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(T__10);
				setState(251);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					setState(249);
					match(T__11);
					}
					break;
				case T__12:
				case T__45:
				case Identifier:
					{
					setState(250);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(253);
					match(T__9);
					setState(254);
					identifier();
					}
				}

				setState(257);
				match(T__12);
				setState(258);
				match(StringLiteral);
				setState(259);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				match(T__10);
				setState(261);
				match(T__13);
				setState(262);
				importDeclaration();
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(263);
					match(T__14);
					setState(264);
					importDeclaration();
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(270);
				match(T__15);
				setState(271);
				match(T__12);
				setState(272);
				match(StringLiteral);
				setState(273);
				match(T__1);
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
	public static class NatSpecContext extends ParserRuleContext {
		public List<TerminalNode> NatSpecSingleLine() { return getTokens(SolidityParser.NatSpecSingleLine); }
		public TerminalNode NatSpecSingleLine(int i) {
			return getToken(SolidityParser.NatSpecSingleLine, i);
		}
		public TerminalNode NatSpecMultiLine() { return getToken(SolidityParser.NatSpecMultiLine, 0); }
		public NatSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNatSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNatSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitNatSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NatSpecContext natSpec() throws RecognitionException {
		NatSpecContext _localctx = new NatSpecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_natSpec);
		try {
			int _alt;
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NatSpecSingleLine:
				enterOuterAlt(_localctx, 1);
				{
				setState(278); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(277);
						match(NatSpecSingleLine);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(280); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case NatSpecMultiLine:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(NatSpecMultiLine);
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
	public static class ContractDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NatSpecContext natSpec() {
			return getRuleContext(NatSpecContext.class,0);
		}
		public List<InheritanceSpecifierContext> inheritanceSpecifier() {
			return getRuleContexts(InheritanceSpecifierContext.class);
		}
		public InheritanceSpecifierContext inheritanceSpecifier(int i) {
			return getRuleContext(InheritanceSpecifierContext.class,i);
		}
		public List<ContractPartContext> contractPart() {
			return getRuleContexts(ContractPartContext.class);
		}
		public ContractPartContext contractPart(int i) {
			return getRuleContext(ContractPartContext.class,i);
		}
		public ContractDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContractDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContractDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitContractDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractDefinitionContext contractDefinition() throws RecognitionException {
		ContractDefinitionContext _localctx = new ContractDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_contractDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(285);
				natSpec();
				}
			}

			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(288);
				match(T__16);
				}
			}

			setState(291);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(292);
			identifier();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(293);
				match(T__20);
				setState(294);
				inheritanceSpecifier();
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(295);
					match(T__14);
					setState(296);
					inheritanceSpecifier();
					}
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(304);
			match(T__13);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4323531748693516288L) != 0 || (((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 6710886431L) != 0) {
				{
				{
				setState(305);
				contractPart();
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			match(T__15);
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
	public static class InheritanceSpecifierContext extends ParserRuleContext {
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public InheritanceSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInheritanceSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInheritanceSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitInheritanceSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritanceSpecifierContext inheritanceSpecifier() throws RecognitionException {
		InheritanceSpecifierContext _localctx = new InheritanceSpecifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_inheritanceSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			userDefinedTypeName();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21 || _la==T__23) {
				{
				setState(314);
				callArgumentList();
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
	public static class CallArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public CallArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterCallArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitCallArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitCallArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgumentListContext callArgumentList() throws RecognitionException {
		CallArgumentListContext _localctx = new CallArgumentListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_callArgumentList);
		int _la;
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(T__21);
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & -18009914563362303L) != 0 || (((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & -3386681098439229437L) != 0) {
					{
					setState(318);
					expression(0);
					}
				}

				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(321);
					match(T__14);
					setState(322);
					expression(0);
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(328);
				match(T__22);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(T__23);
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12 || _la==T__45 || _la==Identifier) {
					{
					{
					setState(330);
					identifier();
					setState(331);
					match(T__24);
					setState(332);
					expression(0);
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__14) {
						{
						{
						setState(333);
						match(T__14);
						setState(334);
						identifier();
						setState(335);
						match(T__24);
						setState(336);
						expression(0);
						}
						}
						setState(342);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(347);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(348);
				match(T__25);
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
	public static class ContractPartContext extends ParserRuleContext {
		public StateVariableDeclarationContext stateVariableDeclaration() {
			return getRuleContext(StateVariableDeclarationContext.class,0);
		}
		public UsingForDeclarationContext usingForDeclaration() {
			return getRuleContext(UsingForDeclarationContext.class,0);
		}
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public ConstructorDefinitionContext constructorDefinition() {
			return getRuleContext(ConstructorDefinitionContext.class,0);
		}
		public ModifierDefinitionContext modifierDefinition() {
			return getRuleContext(ModifierDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public EventDefinitionContext eventDefinition() {
			return getRuleContext(EventDefinitionContext.class,0);
		}
		public EnumDefinitionContext enumDefinition() {
			return getRuleContext(EnumDefinitionContext.class,0);
		}
		public ContractPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContractPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContractPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitContractPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractPartContext contractPart() throws RecognitionException {
		ContractPartContext _localctx = new ContractPartContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_contractPart);
		try {
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				stateVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
				constructorDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(355);
				modifierDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(356);
				functionDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(357);
				eventDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(358);
				enumDefinition();
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
	public static class StateVariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public List<TerminalNode> ConstantKeyword() { return getTokens(SolidityParser.ConstantKeyword); }
		public TerminalNode ConstantKeyword(int i) {
			return getToken(SolidityParser.ConstantKeyword, i);
		}
		public List<TerminalNode> OverrideKeyword() { return getTokens(SolidityParser.OverrideKeyword); }
		public TerminalNode OverrideKeyword(int i) {
			return getToken(SolidityParser.OverrideKeyword, i);
		}
		public List<TerminalNode> ImmutableKeyword() { return getTokens(SolidityParser.ImmutableKeyword); }
		public TerminalNode ImmutableKeyword(int i) {
			return getToken(SolidityParser.ImmutableKeyword, i);
		}
		public StateVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStateVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStateVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStateVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateVariableDeclarationContext stateVariableDeclaration() throws RecognitionException {
		StateVariableDeclarationContext _localctx = new StateVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stateVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			typeName(0);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & 1671L) != 0) {
				{
				{
				setState(362);
				_la = _input.LA(1);
				if ( !((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & 1671L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(368);
			identifier();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(369);
				match(T__8);
				setState(370);
				expression(0);
				}
			}

			setState(373);
			match(T__1);
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
	public static class UsingForDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UsingForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingForDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUsingForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUsingForDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitUsingForDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingForDeclarationContext usingForDeclaration() throws RecognitionException {
		UsingForDeclarationContext _localctx = new UsingForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_usingForDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(T__26);
			setState(376);
			identifier();
			setState(377);
			match(T__27);
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(378);
				match(T__11);
				}
				break;
			case T__12:
			case T__31:
			case T__39:
			case T__41:
			case T__45:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
				{
				setState(379);
				typeName(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(382);
			match(T__1);
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
	public static class StructDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStructDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStructDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(T__28);
			setState(385);
			identifier();
			setState(386);
			match(T__13);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4323531512872968192L) != 0 || (((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 268435487L) != 0) {
				{
				setState(387);
				variableDeclaration();
				setState(388);
				match(T__1);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4323531512872968192L) != 0 || (((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 268435487L) != 0) {
					{
					{
					setState(389);
					variableDeclaration();
					setState(390);
					match(T__1);
					}
					}
					setState(396);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(399);
			match(T__15);
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
	public static class ConstructorDefinitionContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterConstructorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitConstructorDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitConstructorDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDefinitionContext constructorDefinition() throws RecognitionException {
		ConstructorDefinitionContext _localctx = new ConstructorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constructorDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(T__29);
			setState(402);
			parameterList();
			setState(403);
			modifierList();
			setState(404);
			block();
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
	public static class ModifierDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitModifierDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierDefinitionContext modifierDefinition() throws RecognitionException {
		ModifierDefinitionContext _localctx = new ModifierDefinitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_modifierDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(T__30);
			setState(407);
			identifier();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(408);
				parameterList();
				}
			}

			setState(411);
			block();
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
	public static class ModifierInvocationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ModifierInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitModifierInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierInvocationContext modifierInvocation() throws RecognitionException {
		ModifierInvocationContext _localctx = new ModifierInvocationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_modifierInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			identifier();
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(414);
				match(T__21);
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & -18009914563362303L) != 0 || (((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & -3386681098439229437L) != 0) {
					{
					setState(415);
					expressionList();
					}
				}

				setState(418);
				match(T__22);
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
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public NatSpecContext natSpec() {
			return getRuleContext(NatSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReturnParametersContext returnParameters() {
			return getRuleContext(ReturnParametersContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(421);
				natSpec();
				}
			}

			setState(424);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__45 || _la==Identifier) {
				{
				setState(425);
				identifier();
				}
			}

			setState(428);
			parameterList();
			setState(429);
			modifierList();
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(430);
				returnParameters();
				}
			}

			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(433);
				match(T__1);
				}
				break;
			case T__13:
				{
				setState(434);
				block();
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
	public static class ReturnParametersContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ReturnParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterReturnParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitReturnParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitReturnParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnParametersContext returnParameters() throws RecognitionException {
		ReturnParametersContext _localctx = new ReturnParametersContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(T__34);
			setState(438);
			parameterList();
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
	public static class OverrideParametersContext extends ParserRuleContext {
		public TerminalNode OverrideKeyword() { return getToken(SolidityParser.OverrideKeyword, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public OverrideParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overrideParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterOverrideParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitOverrideParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitOverrideParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OverrideParametersContext overrideParameters() throws RecognitionException {
		OverrideParametersContext _localctx = new OverrideParametersContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_overrideParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(OverrideKeyword);
			setState(441);
			parameterList();
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
	public static class ModifierListContext extends ParserRuleContext {
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public List<TerminalNode> OverrideKeyword() { return getTokens(SolidityParser.OverrideKeyword); }
		public TerminalNode OverrideKeyword(int i) {
			return getToken(SolidityParser.OverrideKeyword, i);
		}
		public List<OverrideParametersContext> overrideParameters() {
			return getRuleContexts(OverrideParametersContext.class);
		}
		public OverrideParametersContext overrideParameters(int i) {
			return getRuleContext(OverrideParametersContext.class,i);
		}
		public List<TerminalNode> VirtualKeyword() { return getTokens(SolidityParser.VirtualKeyword); }
		public TerminalNode VirtualKeyword(int i) {
			return getToken(SolidityParser.VirtualKeyword, i);
		}
		public ModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitModifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierListContext modifierList() throws RecognitionException {
		ModifierListContext _localctx = new ModifierListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_modifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__45 || (((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & 28587L) != 0) {
				{
				setState(452);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(443);
					modifierInvocation();
					}
					break;
				case 2:
					{
					setState(444);
					stateMutability();
					}
					break;
				case 3:
					{
					setState(445);
					match(ExternalKeyword);
					}
					break;
				case 4:
					{
					setState(446);
					match(PublicKeyword);
					}
					break;
				case 5:
					{
					setState(447);
					match(InternalKeyword);
					}
					break;
				case 6:
					{
					setState(448);
					match(PrivateKeyword);
					}
					break;
				case 7:
					{
					setState(449);
					match(OverrideKeyword);
					}
					break;
				case 8:
					{
					setState(450);
					overrideParameters();
					}
					break;
				case 9:
					{
					setState(451);
					match(VirtualKeyword);
					}
					break;
				}
				}
				setState(456);
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
	public static class EventDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterListContext eventParameterList() {
			return getRuleContext(EventParameterListContext.class,0);
		}
		public NatSpecContext natSpec() {
			return getRuleContext(NatSpecContext.class,0);
		}
		public TerminalNode AnonymousKeyword() { return getToken(SolidityParser.AnonymousKeyword, 0); }
		public EventDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEventDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEventDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEventDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventDefinitionContext eventDefinition() throws RecognitionException {
		EventDefinitionContext _localctx = new EventDefinitionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_eventDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(457);
				natSpec();
				}
			}

			setState(460);
			match(T__35);
			setState(461);
			identifier();
			setState(462);
			eventParameterList();
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(463);
				match(AnonymousKeyword);
				}
			}

			setState(466);
			match(T__1);
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
	public static class EnumValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEnumValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEnumValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEnumValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			identifier();
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
	public static class EnumDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<EnumValueContext> enumValue() {
			return getRuleContexts(EnumValueContext.class);
		}
		public EnumValueContext enumValue(int i) {
			return getRuleContext(EnumValueContext.class,i);
		}
		public EnumDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEnumDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEnumDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEnumDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDefinitionContext enumDefinition() throws RecognitionException {
		EnumDefinitionContext _localctx = new EnumDefinitionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_enumDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(T__36);
			setState(471);
			identifier();
			setState(472);
			match(T__13);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__45 || _la==Identifier) {
				{
				setState(473);
				enumValue();
				}
			}

			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(476);
				match(T__14);
				setState(477);
				enumValue();
				}
				}
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(483);
			match(T__15);
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
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(T__21);
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4323531512872968192L) != 0 || (((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 268435487L) != 0) {
				{
				setState(486);
				parameter();
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(487);
					match(T__14);
					setState(488);
					parameter();
					}
					}
					setState(493);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(496);
			match(T__22);
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
	public static class ObjectListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ObjectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterObjectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitObjectList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitObjectList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectListContext objectList() throws RecognitionException {
		ObjectListContext _localctx = new ObjectListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_objectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(T__21);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4323531512872968192L) != 0 || (((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 268435487L) != 0) {
				{
				setState(499);
				parameter();
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(500);
					match(T__14);
					setState(501);
					parameter();
					}
					}
					setState(506);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(509);
			match(T__22);
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
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			typeName(0);
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(512);
				storageLocation();
				}
				break;
			}
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__45 || _la==Identifier) {
				{
				setState(515);
				identifier();
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
	public static class EventParameterListContext extends ParserRuleContext {
		public List<EventParameterContext> eventParameter() {
			return getRuleContexts(EventParameterContext.class);
		}
		public EventParameterContext eventParameter(int i) {
			return getRuleContext(EventParameterContext.class,i);
		}
		public EventParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEventParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEventParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEventParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventParameterListContext eventParameterList() throws RecognitionException {
		EventParameterListContext _localctx = new EventParameterListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_eventParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(T__21);
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4323531512872968192L) != 0 || (((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 268435487L) != 0) {
				{
				setState(519);
				eventParameter();
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(520);
					match(T__14);
					setState(521);
					eventParameter();
					}
					}
					setState(526);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(529);
			match(T__22);
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
	public static class EventParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode IndexedKeyword() { return getToken(SolidityParser.IndexedKeyword, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEventParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEventParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEventParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventParameterContext eventParameter() throws RecognitionException {
		EventParameterContext _localctx = new EventParameterContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_eventParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			typeName(0);
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(532);
				match(IndexedKeyword);
				}
			}

			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__45 || _la==Identifier) {
				{
				setState(535);
				identifier();
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
	public static class FunctionTypeParameterListContext extends ParserRuleContext {
		public List<FunctionTypeParameterContext> functionTypeParameter() {
			return getRuleContexts(FunctionTypeParameterContext.class);
		}
		public FunctionTypeParameterContext functionTypeParameter(int i) {
			return getRuleContext(FunctionTypeParameterContext.class,i);
		}
		public FunctionTypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionTypeParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeParameterListContext functionTypeParameterList() throws RecognitionException {
		FunctionTypeParameterListContext _localctx = new FunctionTypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_functionTypeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(T__21);
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4323531512872968192L) != 0 || (((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 268435487L) != 0) {
				{
				setState(539);
				functionTypeParameter();
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(540);
					match(T__14);
					setState(541);
					functionTypeParameter();
					}
					}
					setState(546);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(549);
			match(T__22);
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
	public static class FunctionTypeParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public FunctionTypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeParameterContext functionTypeParameter() throws RecognitionException {
		FunctionTypeParameterContext _localctx = new FunctionTypeParameterContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionTypeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			typeName(0);
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 123145302310912L) != 0) {
				{
				setState(552);
				storageLocation();
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			typeName(0);
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(556);
				storageLocation();
				}
				break;
			}
			setState(559);
			identifier();
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
	public static class TypeNameContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public FunctionTypeNameContext functionTypeName() {
			return getRuleContext(FunctionTypeNameContext.class,0);
		}
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		return typeName(0);
	}

	private TypeNameContext typeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeNameContext _localctx = new TypeNameContext(_ctx, _parentState);
		TypeNameContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_typeName, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(562);
				elementaryTypeName();
				}
				break;
			case 2:
				{
				setState(563);
				userDefinedTypeName();
				}
				break;
			case 3:
				{
				setState(564);
				mapping();
				}
				break;
			case 4:
				{
				setState(565);
				functionTypeName();
				}
				break;
			case 5:
				{
				setState(566);
				match(T__39);
				setState(567);
				match(PayableKeyword);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(578);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeName);
					setState(570);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(571);
					match(T__37);
					setState(573);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & -18009914563362303L) != 0 || (((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & -3386681098439229437L) != 0) {
						{
						setState(572);
						expression(0);
						}
					}

					setState(575);
					match(T__38);
					}
					} 
				}
				setState(580);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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
	public static class UserDefinedTypeNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UserDefinedTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userDefinedTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUserDefinedTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUserDefinedTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitUserDefinedTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserDefinedTypeNameContext userDefinedTypeName() throws RecognitionException {
		UserDefinedTypeNameContext _localctx = new UserDefinedTypeNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_userDefinedTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			identifier();
			setState(586);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(582);
					match(T__40);
					setState(583);
					identifier();
					}
					} 
				}
				setState(588);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
	public static class MappingContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public MappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterMapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitMapping(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitMapping(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingContext mapping() throws RecognitionException {
		MappingContext _localctx = new MappingContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_mapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(T__41);
			setState(590);
			match(T__21);
			setState(593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				{
				setState(591);
				elementaryTypeName();
				}
				break;
			case T__12:
			case T__45:
			case Identifier:
				{
				setState(592);
				userDefinedTypeName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(595);
			match(T__42);
			setState(596);
			typeName(0);
			setState(597);
			match(T__22);
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
	public static class FunctionTypeNameContext extends ParserRuleContext {
		public List<FunctionTypeParameterListContext> functionTypeParameterList() {
			return getRuleContexts(FunctionTypeParameterListContext.class);
		}
		public FunctionTypeParameterListContext functionTypeParameterList(int i) {
			return getRuleContext(FunctionTypeParameterListContext.class,i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public List<VisibilityContext> visibility() {
			return getRuleContexts(VisibilityContext.class);
		}
		public VisibilityContext visibility(int i) {
			return getRuleContext(VisibilityContext.class,i);
		}
		public FunctionTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeNameContext functionTypeName() throws RecognitionException {
		FunctionTypeNameContext _localctx = new FunctionTypeNameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_functionTypeName);
		int _la;
		try {
			int _alt;
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				match(T__31);
				setState(600);
				functionTypeParameterList();
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(604);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case InternalKeyword:
							{
							setState(601);
							match(InternalKeyword);
							}
							break;
						case ExternalKeyword:
							{
							setState(602);
							match(ExternalKeyword);
							}
							break;
						case ConstantKeyword:
						case PayableKeyword:
						case PureKeyword:
						case ViewKeyword:
							{
							setState(603);
							stateMutability();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(608);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				setState(611);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(609);
					match(T__34);
					setState(610);
					functionTypeParameterList();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				match(T__31);
				setState(614);
				match(T__21);
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(615);
					parameterList();
					}
				}

				setState(618);
				match(T__22);
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & 12193L) != 0) {
					{
					setState(621);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ExternalKeyword:
					case InternalKeyword:
					case PrivateKeyword:
					case PublicKeyword:
						{
						setState(619);
						visibility();
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(620);
						stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(625);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(626);
				match(T__34);
				setState(627);
				match(T__21);
				setState(628);
				parameterList();
				setState(629);
				match(T__22);
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
	public static class VisibilityContext extends ParserRuleContext {
		public TerminalNode InternalKeyword() { return getToken(SolidityParser.InternalKeyword, 0); }
		public TerminalNode ExternalKeyword() { return getToken(SolidityParser.ExternalKeyword, 0); }
		public TerminalNode PrivateKeyword() { return getToken(SolidityParser.PrivateKeyword, 0); }
		public TerminalNode PublicKeyword() { return getToken(SolidityParser.PublicKeyword, 0); }
		public VisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVisibility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVisibility(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVisibility(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisibilityContext visibility() throws RecognitionException {
		VisibilityContext _localctx = new VisibilityContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_visibility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			_la = _input.LA(1);
			if ( !((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & 53L) != 0) ) {
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
	public static class StorageLocationContext extends ParserRuleContext {
		public StorageLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStorageLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStorageLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStorageLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageLocationContext storageLocation() throws RecognitionException {
		StorageLocationContext _localctx = new StorageLocationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_storageLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 123145302310912L) != 0) ) {
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
	public static class StateMutabilityContext extends ParserRuleContext {
		public TerminalNode PureKeyword() { return getToken(SolidityParser.PureKeyword, 0); }
		public TerminalNode ConstantKeyword() { return getToken(SolidityParser.ConstantKeyword, 0); }
		public TerminalNode ViewKeyword() { return getToken(SolidityParser.ViewKeyword, 0); }
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public StateMutabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateMutability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStateMutability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStateMutability(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStateMutability(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateMutabilityContext stateMutability() throws RecognitionException {
		StateMutabilityContext _localctx = new StateMutabilityContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_stateMutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			_la = _input.LA(1);
			if ( !((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & 10497L) != 0) ) {
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
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<UncheckedBlockContext> uncheckedBlock() {
			return getRuleContexts(UncheckedBlockContext.class);
		}
		public UncheckedBlockContext uncheckedBlock(int i) {
			return getRuleContext(UncheckedBlockContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(T__13);
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -2316391554195440L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1227644039952597055L) != 0 || (((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 397L) != 0) {
				{
				setState(642);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case T__12:
				case T__13:
				case T__21:
				case T__27:
				case T__31:
				case T__37:
				case T__39:
				case T__41:
				case T__45:
				case T__47:
				case T__48:
				case T__49:
				case T__51:
				case T__52:
				case T__53:
				case T__54:
				case T__55:
				case T__56:
				case T__57:
				case T__58:
				case T__59:
				case T__60:
				case T__61:
				case T__62:
				case T__63:
				case T__64:
				case T__65:
				case T__66:
				case T__67:
				case T__68:
				case Int:
				case Uint:
				case Byte:
				case Fixed:
				case Ufixed:
				case BooleanLiteral:
				case DecimalNumber:
				case HexNumber:
				case HexLiteral:
				case BreakKeyword:
				case ContinueKeyword:
				case PayableKeyword:
				case TypeKeyword:
				case Identifier:
				case StringLiteral:
				case LINE_COMMENT:
				case COMMENT:
					{
					setState(640);
					statement();
					}
					break;
				case T__46:
					{
					setState(641);
					uncheckedBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(647);
			match(T__15);
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
	public static class UncheckedBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UncheckedBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uncheckedBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUncheckedBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUncheckedBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitUncheckedBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UncheckedBlockContext uncheckedBlock() throws RecognitionException {
		UncheckedBlockContext _localctx = new UncheckedBlockContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_uncheckedBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(T__46);
			setState(650);
			block();
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
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InlineAssemblyStatementContext inlineAssemblyStatement() {
			return getRuleContext(InlineAssemblyStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public EmitStatementContext emitStatement() {
			return getRuleContext(EmitStatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public CatchClauseContext catchClause() {
			return getRuleContext(CatchClauseContext.class,0);
		}
		public TerminalNode LINE_COMMENT() { return getToken(SolidityParser.LINE_COMMENT, 0); }
		public TerminalNode COMMENT() { return getToken(SolidityParser.COMMENT, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_statement);
		try {
			setState(668);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__49:
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				ifStatement();
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				whileStatement();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(654);
				forStatement();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(655);
				block();
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 5);
				{
				setState(656);
				inlineAssemblyStatement();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 6);
				{
				setState(657);
				doWhileStatement();
				}
				break;
			case ContinueKeyword:
				enterOuterAlt(_localctx, 7);
				{
				setState(658);
				continueStatement();
				}
				break;
			case BreakKeyword:
				enterOuterAlt(_localctx, 8);
				{
				setState(659);
				breakStatement();
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 9);
				{
				setState(660);
				returnStatement();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 10);
				{
				setState(661);
				throwStatement();
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 11);
				{
				setState(662);
				emitStatement();
				}
				break;
			case T__3:
			case T__12:
			case T__21:
			case T__31:
			case T__37:
			case T__39:
			case T__41:
			case T__45:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case PayableKeyword:
			case TypeKeyword:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 12);
				{
				setState(663);
				simpleStatement();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 13);
				{
				setState(664);
				tryStatement();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 14);
				{
				setState(665);
				catchClause();
				}
				break;
			case LINE_COMMENT:
				enterOuterAlt(_localctx, 15);
				{
				setState(666);
				match(LINE_COMMENT);
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 16);
				{
				setState(667);
				match(COMMENT);
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
	public static class TryStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_tryStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(T__47);
			setState(671);
			expression(0);
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(672);
				match(T__34);
				setState(673);
				match(T__21);
				setState(674);
				parameterList();
				setState(675);
				match(T__22);
				}
			}

			setState(679);
			block();
			setState(683);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(680);
					catchClause();
					}
					} 
				}
				setState(685);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
	public static class CatchClauseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NatSpecContext natSpec() {
			return getRuleContext(NatSpecContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_catchClause);
		int _la;
		try {
			setState(702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				match(T__48);
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 70368748380160L) != 0 || _la==Identifier) {
					{
					setState(688);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__12 || _la==T__45 || _la==Identifier) {
						{
						setState(687);
						identifier();
						}
					}

					setState(690);
					match(T__21);
					setState(691);
					parameterList();
					setState(693);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
						{
						setState(692);
						natSpec();
						}
					}

					setState(695);
					match(T__22);
					}
				}

				setState(699);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(700);
				match(T__48);
				setState(701);
				block();
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
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			expression(0);
			setState(705);
			match(T__1);
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
	public static class IfStatementContext extends ParserRuleContext {
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public IfRightContext ifRight() {
			return getRuleContext(IfRightContext.class,0);
		}
		public IfWrongContext ifWrong() {
			return getRuleContext(IfWrongContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(T__49);
			setState(708);
			match(T__21);
			setState(709);
			ifCondition();
			setState(710);
			match(T__22);
			setState(711);
			ifRight();
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(712);
				match(T__50);
				setState(713);
				ifWrong();
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
	public static class IfConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIfCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_ifCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
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
	public static class IfRightContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifRight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIfRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIfRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitIfRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfRightContext ifRight() throws RecognitionException {
		IfRightContext _localctx = new IfRightContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_ifRight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			statement();
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
	public static class IfWrongContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfWrongContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifWrong; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIfWrong(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIfWrong(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitIfWrong(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfWrongContext ifWrong() throws RecognitionException {
		IfWrongContext _localctx = new IfWrongContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_ifWrong);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			statement();
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
	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(T__51);
			setState(723);
			match(T__21);
			setState(724);
			expression(0);
			setState(725);
			match(T__22);
			setState(726);
			statement();
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
	public static class SimpleStatementContext extends ParserRuleContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSimpleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(728);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(729);
				expressionStatement();
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
	public static class ForStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(T__27);
			setState(733);
			match(T__21);
			setState(736);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__12:
			case T__21:
			case T__31:
			case T__37:
			case T__39:
			case T__41:
			case T__45:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case PayableKeyword:
			case TypeKeyword:
			case Identifier:
			case StringLiteral:
				{
				setState(734);
				simpleStatement();
				}
				break;
			case T__1:
				{
				setState(735);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(740);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__12:
			case T__21:
			case T__37:
			case T__39:
			case T__45:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case PayableKeyword:
			case TypeKeyword:
			case Identifier:
			case StringLiteral:
				{
				setState(738);
				expressionStatement();
				}
				break;
			case T__1:
				{
				setState(739);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & -18009914563362303L) != 0 || (((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & -3386681098439229437L) != 0) {
				{
				setState(742);
				expression(0);
				}
			}

			setState(745);
			match(T__22);
			setState(746);
			statement();
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
	public static class InlineAssemblyStatementContext extends ParserRuleContext {
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public InlineAssemblyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineAssemblyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInlineAssemblyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInlineAssemblyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitInlineAssemblyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineAssemblyStatementContext inlineAssemblyStatement() throws RecognitionException {
		InlineAssemblyStatementContext _localctx = new InlineAssemblyStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_inlineAssemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			match(T__52);
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(749);
				match(StringLiteral);
				}
			}

			setState(752);
			assemblyBlock();
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
	public static class DoWhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(T__53);
			setState(755);
			statement();
			setState(756);
			match(T__51);
			setState(757);
			match(T__21);
			setState(758);
			expression(0);
			setState(759);
			match(T__22);
			setState(760);
			match(T__1);
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
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode ContinueKeyword() { return getToken(SolidityParser.ContinueKeyword, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(ContinueKeyword);
			setState(763);
			match(T__1);
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
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BreakKeyword() { return getToken(SolidityParser.BreakKeyword, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(BreakKeyword);
			setState(766);
			match(T__1);
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			match(T__54);
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & -18009914563362303L) != 0 || (((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & -3386681098439229437L) != 0) {
				{
				setState(769);
				expression(0);
				}
			}

			setState(772);
			match(T__1);
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
	public static class ThrowStatementContext extends ParserRuleContext {
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(T__55);
			setState(775);
			match(T__1);
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
	public static class EmitStatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public EmitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEmitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEmitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEmitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmitStatementContext emitStatement() throws RecognitionException {
		EmitStatementContext _localctx = new EmitStatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(T__56);
			setState(778);
			functionCall();
			setState(779);
			match(T__1);
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
	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(781);
				match(T__57);
				setState(782);
				identifierList();
				}
				break;
			case 2:
				{
				setState(783);
				variableDeclaration();
				}
				break;
			case 3:
				{
				setState(784);
				match(T__21);
				setState(785);
				variableDeclarationList();
				setState(786);
				match(T__22);
				}
				break;
			}
			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(790);
				match(T__8);
				setState(791);
				expression(0);
				}
			}

			setState(794);
			match(T__1);
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
	public static class ConstantVariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode ConstantKeyword() { return getToken(SolidityParser.ConstantKeyword, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterConstantVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitConstantVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitConstantVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantVariableDeclarationContext constantVariableDeclaration() throws RecognitionException {
		ConstantVariableDeclarationContext _localctx = new ConstantVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_constantVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			typeName(0);
			setState(797);
			match(ConstantKeyword);
			setState(798);
			identifier();
			setState(799);
			match(T__8);
			setState(800);
			expression(0);
			setState(801);
			match(T__1);
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
	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVariableDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4323531512872968192L) != 0 || (((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 268435487L) != 0) {
				{
				setState(803);
				variableDeclaration();
				}
			}

			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(806);
				match(T__14);
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4323531512872968192L) != 0 || (((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 268435487L) != 0) {
					{
					setState(807);
					variableDeclaration();
					}
				}

				}
				}
				setState(814);
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
	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_identifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(T__21);
			setState(822);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(817);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__12 || _la==T__45 || _la==Identifier) {
						{
						setState(816);
						identifier();
						}
					}

					setState(819);
					match(T__14);
					}
					} 
				}
				setState(824);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__45 || _la==Identifier) {
				{
				setState(825);
				identifier();
				}
			}

			setState(828);
			match(T__22);
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
	public static class ElementaryTypeNameContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(SolidityParser.Int, 0); }
		public TerminalNode Uint() { return getToken(SolidityParser.Uint, 0); }
		public TerminalNode Byte() { return getToken(SolidityParser.Byte, 0); }
		public TerminalNode Fixed() { return getToken(SolidityParser.Fixed, 0); }
		public TerminalNode Ufixed() { return getToken(SolidityParser.Ufixed, 0); }
		public ElementaryTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementaryTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterElementaryTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitElementaryTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitElementaryTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementaryTypeNameContext elementaryTypeName() throws RecognitionException {
		ElementaryTypeNameContext _localctx = new ElementaryTypeNameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_elementaryTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 4323456741787303936L) != 0 || (((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 31L) != 0) ) {
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public TerminalNode TypeKeyword() { return getToken(SolidityParser.TypeKeyword, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(833);
				match(T__37);
				setState(834);
				expression(0);
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(835);
					match(T__14);
					setState(836);
					expression(0);
					}
					}
					setState(841);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(842);
				match(T__38);
				}
				break;
			case 2:
				{
				setState(844);
				match(PayableKeyword);
				setState(845);
				callArgumentList();
				}
				break;
			case 3:
				{
				setState(846);
				match(TypeKeyword);
				setState(847);
				match(T__21);
				setState(848);
				typeName(0);
				setState(849);
				match(T__22);
				}
				break;
			case 4:
				{
				setState(851);
				_la = _input.LA(1);
				if ( !((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 8935141660703064065L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(852);
				expression(23);
				}
				break;
			case 5:
				{
				setState(853);
				match(T__66);
				setState(854);
				typeName(0);
				}
				break;
			case 6:
				{
				setState(855);
				match(T__21);
				setState(856);
				expression(0);
				setState(857);
				match(T__22);
				}
				break;
			case 7:
				{
				setState(859);
				_la = _input.LA(1);
				if ( !(_la==T__65 || _la==T__67) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(860);
				expression(18);
				}
				break;
			case 8:
				{
				setState(861);
				_la = _input.LA(1);
				if ( !(_la==T__64 || _la==T__68) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(862);
				expression(17);
				}
				break;
			case 9:
				{
				setState(863);
				match(T__63);
				setState(864);
				expression(16);
				}
				break;
			case 10:
				{
				setState(865);
				match(T__3);
				setState(866);
				expression(15);
				}
				break;
			case 11:
				{
				setState(867);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(961);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(959);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(870);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(871);
						match(T__69);
						setState(872);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(873);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(874);
						_la = _input.LA(1);
						if ( !((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & 1729382256910270465L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(875);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(876);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(877);
						_la = _input.LA(1);
						if ( !(_la==T__65 || _la==T__67) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(878);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(879);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(880);
						_la = _input.LA(1);
						if ( !((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 7L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(881);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(882);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(883);
						match(T__75);
						setState(884);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(885);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(886);
						match(T__2);
						setState(887);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(888);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(889);
						match(T__76);
						setState(890);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(891);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(892);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 480L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(893);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(894);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(895);
						_la = _input.LA(1);
						if ( !(_la==T__77 || _la==T__78) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(896);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(897);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(898);
						match(T__79);
						setState(899);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(900);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(901);
						match(T__80);
						setState(902);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(903);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(904);
						match(T__81);
						setState(905);
						expression(0);
						setState(906);
						match(T__24);
						setState(907);
						expression(4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(909);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(910);
						_la = _input.LA(1);
						if ( !(_la==T__8 || (((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 2047L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(911);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(912);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(913);
						match(T__37);
						setState(915);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & -18009914563362303L) != 0 || (((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & -3386681098439229437L) != 0) {
							{
							setState(914);
							expression(0);
							}
						}

						setState(917);
						match(T__38);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(918);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(919);
						match(T__37);
						setState(921);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & -18009914563362303L) != 0 || (((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & -3386681098439229437L) != 0) {
							{
							setState(920);
							expression(0);
							}
						}

						setState(923);
						match(T__24);
						setState(925);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & -18009914563362303L) != 0 || (((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & -3386681098439229437L) != 0) {
							{
							setState(924);
							expression(0);
							}
						}

						setState(927);
						match(T__38);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(928);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(929);
						match(T__40);
						setState(932);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__12:
						case T__45:
						case Identifier:
							{
							setState(930);
							identifier();
							}
							break;
						case T__39:
							{
							setState(931);
							match(T__39);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(934);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(935);
						match(T__13);
						setState(949);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__12 || _la==T__45 || _la==Identifier) {
							{
							setState(936);
							identifier();
							setState(937);
							match(T__24);
							setState(938);
							expression(0);
							setState(946);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__14) {
								{
								{
								setState(939);
								match(T__14);
								setState(940);
								identifier();
								setState(941);
								match(T__24);
								setState(942);
								expression(0);
								}
								}
								setState(948);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(951);
						match(T__15);
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(952);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(953);
						_la = _input.LA(1);
						if ( !(_la==T__61 || _la==T__62) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(954);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(955);
						match(T__21);
						setState(956);
						functionCallArguments();
						setState(957);
						match(T__22);
						}
						break;
					}
					} 
				}
				setState(963);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
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
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(SolidityParser.BooleanLiteral, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode HexLiteral() { return getToken(SolidityParser.HexLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TypeKeyword() { return getToken(SolidityParser.TypeKeyword, 0); }
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public TypeNameExpressionContext typeNameExpression() {
			return getRuleContext(TypeNameExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_primaryExpression);
		try {
			setState(980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(964);
				match(BooleanLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(965);
				numberLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(966);
				match(HexLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(967);
				match(StringLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(968);
				identifier();
				setState(971);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(969);
					match(T__37);
					setState(970);
					match(T__38);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(973);
				match(TypeKeyword);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(974);
				tupleExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(975);
				typeNameExpression();
				setState(978);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(976);
					match(T__37);
					setState(977);
					match(T__38);
					}
					break;
				}
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
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			expression(0);
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(983);
				match(T__14);
				setState(984);
				expression(0);
				}
				}
				setState(989);
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
	public static class NameValueListContext extends ParserRuleContext {
		public List<NameValueContext> nameValue() {
			return getRuleContexts(NameValueContext.class);
		}
		public NameValueContext nameValue(int i) {
			return getRuleContext(NameValueContext.class,i);
		}
		public NameValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNameValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNameValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitNameValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameValueListContext nameValueList() throws RecognitionException {
		NameValueListContext _localctx = new NameValueListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_nameValueList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			nameValue();
			setState(995);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(991);
					match(T__14);
					setState(992);
					nameValue();
					}
					} 
				}
				setState(997);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			}
			setState(999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(998);
				match(T__14);
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
	public static class NameValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNameValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNameValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitNameValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameValueContext nameValue() throws RecognitionException {
		NameValueContext _localctx = new NameValueContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			identifier();
			setState(1002);
			match(T__24);
			setState(1003);
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
	public static class FunctionCallArgumentsContext extends ParserRuleContext {
		public NameValueListContext nameValueList() {
			return getRuleContext(NameValueListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionCallArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallArgumentsContext functionCallArguments() throws RecognitionException {
		FunctionCallArgumentsContext _localctx = new FunctionCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_functionCallArguments);
		int _la;
		try {
			setState(1013);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(1005);
				match(T__13);
				setState(1007);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12 || _la==T__45 || _la==Identifier) {
					{
					setState(1006);
					nameValueList();
					}
				}

				setState(1009);
				match(T__15);
				}
				break;
			case T__3:
			case T__12:
			case T__21:
			case T__22:
			case T__37:
			case T__39:
			case T__45:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case PayableKeyword:
			case TypeKeyword:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & -18009914563362303L) != 0 || (((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & -3386681098439229437L) != 0) {
					{
					setState(1010);
					expressionList();
					}
				}

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
	public static class FunctionCallContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			expression(0);
			setState(1016);
			match(T__21);
			setState(1017);
			functionCallArguments();
			setState(1018);
			match(T__22);
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
	public static class AssemblyBlockContext extends ParserRuleContext {
		public List<AssemblyItemContext> assemblyItem() {
			return getRuleContexts(AssemblyItemContext.class);
		}
		public AssemblyItemContext assemblyItem(int i) {
			return getRuleContext(AssemblyItemContext.class,i);
		}
		public AssemblyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyBlockContext assemblyBlock() throws RecognitionException {
		AssemblyBlockContext _localctx = new AssemblyBlockContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_assemblyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			match(T__13);
			setState(1024);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 2352076378217668608L) != 0 || (((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 206227996685L) != 0) {
				{
				{
				setState(1021);
				assemblyItem();
				}
				}
				setState(1026);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1027);
			match(T__15);
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
	public static class AssemblyItemContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyLocalDefinitionContext assemblyLocalDefinition() {
			return getRuleContext(AssemblyLocalDefinitionContext.class,0);
		}
		public AssemblyAssignmentContext assemblyAssignment() {
			return getRuleContext(AssemblyAssignmentContext.class,0);
		}
		public AssemblyStackAssignmentContext assemblyStackAssignment() {
			return getRuleContext(AssemblyStackAssignmentContext.class,0);
		}
		public LabelDefinitionContext labelDefinition() {
			return getRuleContext(LabelDefinitionContext.class,0);
		}
		public AssemblySwitchContext assemblySwitch() {
			return getRuleContext(AssemblySwitchContext.class,0);
		}
		public AssemblyFunctionDefinitionContext assemblyFunctionDefinition() {
			return getRuleContext(AssemblyFunctionDefinitionContext.class,0);
		}
		public AssemblyForContext assemblyFor() {
			return getRuleContext(AssemblyForContext.class,0);
		}
		public AssemblyIfContext assemblyIf() {
			return getRuleContext(AssemblyIfContext.class,0);
		}
		public TerminalNode BreakKeyword() { return getToken(SolidityParser.BreakKeyword, 0); }
		public TerminalNode ContinueKeyword() { return getToken(SolidityParser.ContinueKeyword, 0); }
		public SubAssemblyContext subAssembly() {
			return getRuleContext(SubAssemblyContext.class,0);
		}
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(SolidityParser.HexLiteral, 0); }
		public AssemblyItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyItemContext assemblyItem() throws RecognitionException {
		AssemblyItemContext _localctx = new AssemblyItemContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_assemblyItem);
		try {
			setState(1046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1029);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1030);
				assemblyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1031);
				assemblyExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1032);
				assemblyLocalDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1033);
				assemblyAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1034);
				assemblyStackAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1035);
				labelDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1036);
				assemblySwitch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1037);
				assemblyFunctionDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1038);
				assemblyFor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1039);
				assemblyIf();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1040);
				match(BreakKeyword);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1041);
				match(ContinueKeyword);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1042);
				subAssembly();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1043);
				numberLiteral();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1044);
				match(StringLiteral);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1045);
				match(HexLiteral);
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
	public static class AssemblyExpressionContext extends ParserRuleContext {
		public AssemblyCallContext assemblyCall() {
			return getRuleContext(AssemblyCallContext.class,0);
		}
		public AssemblyLiteralContext assemblyLiteral() {
			return getRuleContext(AssemblyLiteralContext.class,0);
		}
		public AssemblyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyExpressionContext assemblyExpression() throws RecognitionException {
		AssemblyExpressionContext _localctx = new AssemblyExpressionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_assemblyExpression);
		try {
			setState(1050);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__39:
			case T__45:
			case T__54:
			case T__60:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1048);
				assemblyCall();
				}
				break;
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1049);
				assemblyLiteral();
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
	public static class AssemblyCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AssemblyExpressionContext> assemblyExpression() {
			return getRuleContexts(AssemblyExpressionContext.class);
		}
		public AssemblyExpressionContext assemblyExpression(int i) {
			return getRuleContext(AssemblyExpressionContext.class,i);
		}
		public AssemblyCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyCallContext assemblyCall() throws RecognitionException {
		AssemblyCallContext _localctx = new AssemblyCallContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_assemblyCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__54:
				{
				setState(1052);
				match(T__54);
				}
				break;
			case T__39:
				{
				setState(1053);
				match(T__39);
				}
				break;
			case T__60:
				{
				setState(1054);
				match(T__60);
				}
				break;
			case T__12:
			case T__45:
			case Identifier:
				{
				setState(1055);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1070);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1058);
				match(T__21);
				setState(1060);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 2341943274488471552L) != 0 || (((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & 6291467L) != 0) {
					{
					setState(1059);
					assemblyExpression();
					}
				}

				setState(1066);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(1062);
					match(T__14);
					setState(1063);
					assemblyExpression();
					}
					}
					setState(1068);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1069);
				match(T__22);
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
	public static class AssemblyLocalDefinitionContext extends ParserRuleContext {
		public AssemblyIdentifierOrListContext assemblyIdentifierOrList() {
			return getRuleContext(AssemblyIdentifierOrListContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyLocalDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLocalDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyLocalDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyLocalDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyLocalDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyLocalDefinitionContext assemblyLocalDefinition() throws RecognitionException {
		AssemblyLocalDefinitionContext _localctx = new AssemblyLocalDefinitionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_assemblyLocalDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			match(T__93);
			setState(1073);
			assemblyIdentifierOrList();
			setState(1076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__94) {
				{
				setState(1074);
				match(T__94);
				setState(1075);
				assemblyExpression();
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
	public static class AssemblyAssignmentContext extends ParserRuleContext {
		public AssemblyIdentifierOrListContext assemblyIdentifierOrList() {
			return getRuleContext(AssemblyIdentifierOrListContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyAssignmentContext assemblyAssignment() throws RecognitionException {
		AssemblyAssignmentContext _localctx = new AssemblyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_assemblyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			assemblyIdentifierOrList();
			setState(1079);
			match(T__94);
			setState(1080);
			assemblyExpression();
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
	public static class AssemblyIdentifierOrListContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyIdentifierOrListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIdentifierOrList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyIdentifierOrList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyIdentifierOrList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyIdentifierOrList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyIdentifierOrListContext assemblyIdentifierOrList() throws RecognitionException {
		AssemblyIdentifierOrListContext _localctx = new AssemblyIdentifierOrListContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_assemblyIdentifierOrList);
		try {
			setState(1087);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__45:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1082);
				identifier();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(1083);
				match(T__21);
				setState(1084);
				assemblyIdentifierList();
				setState(1085);
				match(T__22);
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
	public static class AssemblyIdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public AssemblyIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyIdentifierListContext assemblyIdentifierList() throws RecognitionException {
		AssemblyIdentifierListContext _localctx = new AssemblyIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_assemblyIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			identifier();
			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(1090);
				match(T__14);
				setState(1091);
				identifier();
				}
				}
				setState(1096);
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
	public static class AssemblyStackAssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyStackAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyStackAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyStackAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyStackAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyStackAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyStackAssignmentContext assemblyStackAssignment() throws RecognitionException {
		AssemblyStackAssignmentContext _localctx = new AssemblyStackAssignmentContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_assemblyStackAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			match(T__95);
			setState(1098);
			identifier();
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
	public static class LabelDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterLabelDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitLabelDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitLabelDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelDefinitionContext labelDefinition() throws RecognitionException {
		LabelDefinitionContext _localctx = new LabelDefinitionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			identifier();
			setState(1101);
			match(T__24);
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
	public static class AssemblySwitchContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public List<AssemblyCaseContext> assemblyCase() {
			return getRuleContexts(AssemblyCaseContext.class);
		}
		public AssemblyCaseContext assemblyCase(int i) {
			return getRuleContext(AssemblyCaseContext.class,i);
		}
		public AssemblySwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblySwitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblySwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblySwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblySwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblySwitchContext assemblySwitch() throws RecognitionException {
		AssemblySwitchContext _localctx = new AssemblySwitchContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_assemblySwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			match(T__96);
			setState(1104);
			assemblyExpression();
			setState(1108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__97 || _la==T__98) {
				{
				{
				setState(1105);
				assemblyCase();
				}
				}
				setState(1110);
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
	public static class AssemblyCaseContext extends ParserRuleContext {
		public AssemblyLiteralContext assemblyLiteral() {
			return getRuleContext(AssemblyLiteralContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyCaseContext assemblyCase() throws RecognitionException {
		AssemblyCaseContext _localctx = new AssemblyCaseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_assemblyCase);
		try {
			setState(1117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__97:
				enterOuterAlt(_localctx, 1);
				{
				setState(1111);
				match(T__97);
				setState(1112);
				assemblyLiteral();
				setState(1113);
				assemblyBlock();
				}
				break;
			case T__98:
				enterOuterAlt(_localctx, 2);
				{
				setState(1115);
				match(T__98);
				setState(1116);
				assemblyBlock();
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
	public static class AssemblyFunctionDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyFunctionReturnsContext assemblyFunctionReturns() {
			return getRuleContext(AssemblyFunctionReturnsContext.class,0);
		}
		public AssemblyFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFunctionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyFunctionDefinitionContext assemblyFunctionDefinition() throws RecognitionException {
		AssemblyFunctionDefinitionContext _localctx = new AssemblyFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_assemblyFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			match(T__31);
			setState(1120);
			identifier();
			setState(1121);
			match(T__21);
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__45 || _la==Identifier) {
				{
				setState(1122);
				assemblyIdentifierList();
				}
			}

			setState(1125);
			match(T__22);
			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(1126);
				assemblyFunctionReturns();
				}
			}

			setState(1129);
			assemblyBlock();
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
	public static class AssemblyFunctionReturnsContext extends ParserRuleContext {
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyFunctionReturnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFunctionReturns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyFunctionReturns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyFunctionReturns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyFunctionReturns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyFunctionReturnsContext assemblyFunctionReturns() throws RecognitionException {
		AssemblyFunctionReturnsContext _localctx = new AssemblyFunctionReturnsContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_assemblyFunctionReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1131);
			match(T__99);
			setState(1132);
			assemblyIdentifierList();
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
	public static class AssemblyForContext extends ParserRuleContext {
		public List<AssemblyExpressionContext> assemblyExpression() {
			return getRuleContexts(AssemblyExpressionContext.class);
		}
		public AssemblyExpressionContext assemblyExpression(int i) {
			return getRuleContext(AssemblyExpressionContext.class,i);
		}
		public List<AssemblyBlockContext> assemblyBlock() {
			return getRuleContexts(AssemblyBlockContext.class);
		}
		public AssemblyBlockContext assemblyBlock(int i) {
			return getRuleContext(AssemblyBlockContext.class,i);
		}
		public AssemblyForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyForContext assemblyFor() throws RecognitionException {
		AssemblyForContext _localctx = new AssemblyForContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_assemblyFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
			match(T__27);
			setState(1137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(1135);
				assemblyBlock();
				}
				break;
			case T__12:
			case T__39:
			case T__45:
			case T__54:
			case T__60:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(1136);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1139);
			assemblyExpression();
			setState(1142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(1140);
				assemblyBlock();
				}
				break;
			case T__12:
			case T__39:
			case T__45:
			case T__54:
			case T__60:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(1141);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1144);
			assemblyBlock();
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
	public static class AssemblyIfContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyIfContext assemblyIf() throws RecognitionException {
		AssemblyIfContext _localctx = new AssemblyIfContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_assemblyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			match(T__49);
			setState(1147);
			assemblyExpression();
			setState(1148);
			assemblyBlock();
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
	public static class AssemblyLiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SolidityParser.HexNumber, 0); }
		public TerminalNode HexLiteral() { return getToken(SolidityParser.HexLiteral, 0); }
		public AssemblyLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyLiteralContext assemblyLiteral() throws RecognitionException {
		AssemblyLiteralContext _localctx = new AssemblyLiteralContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_assemblyLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			_la = _input.LA(1);
			if ( !((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & 4194315L) != 0) ) {
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
	public static class SubAssemblyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public SubAssemblyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subAssembly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSubAssembly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSubAssembly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitSubAssembly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubAssemblyContext subAssembly() throws RecognitionException {
		SubAssemblyContext _localctx = new SubAssemblyContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_subAssembly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			match(T__52);
			setState(1153);
			identifier();
			setState(1154);
			assemblyBlock();
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
	public static class TupleExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TupleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTupleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTupleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTupleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleExpressionContext tupleExpression() throws RecognitionException {
		TupleExpressionContext _localctx = new TupleExpressionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_tupleExpression);
		int _la;
		try {
			setState(1182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(1156);
				match(T__21);
				{
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & -18009914563362303L) != 0 || (((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & -3386681098439229437L) != 0) {
					{
					setState(1157);
					expression(0);
					}
				}

				setState(1166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(1160);
					match(T__14);
					setState(1162);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & -18009914563362303L) != 0 || (((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & -3386681098439229437L) != 0) {
						{
						setState(1161);
						expression(0);
						}
					}

					}
					}
					setState(1168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1169);
				match(T__22);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(1170);
				match(T__37);
				setState(1179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & -18009914563362303L) != 0 || (((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & -3386681098439229437L) != 0) {
					{
					setState(1171);
					expression(0);
					setState(1176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__14) {
						{
						{
						setState(1172);
						match(T__14);
						setState(1173);
						expression(0);
						}
						}
						setState(1178);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1181);
				match(T__38);
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
	public static class TypeNameExpressionContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public TypeNameExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNameExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTypeNameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTypeNameExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTypeNameExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameExpressionContext typeNameExpression() throws RecognitionException {
		TypeNameExpressionContext _localctx = new TypeNameExpressionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_typeNameExpression);
		try {
			setState(1186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				enterOuterAlt(_localctx, 1);
				{
				setState(1184);
				elementaryTypeName();
				}
				break;
			case T__12:
			case T__45:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1185);
				userDefinedTypeName();
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
	public static class NumberLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SolidityParser.HexNumber, 0); }
		public TerminalNode NumberUnit() { return getToken(SolidityParser.NumberUnit, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			_la = _input.LA(1);
			if ( !(_la==DecimalNumber || _la==HexNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1189);
				match(NumberUnit);
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
	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(SolidityParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SolidityParser.Identifier, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_identifier);
		int _la;
		try {
			int _alt;
			setState(1201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1192);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__45 || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1193);
				match(Identifier);
				setState(1198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1194);
						match(T__12);
						setState(1195);
						match(Identifier);
						}
						} 
					}
					setState(1200);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 36:
			return typeName_sempred((TypeNameContext)_localctx, predIndex);
		case 68:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeName_sempred(TypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 30);
		case 15:
			return precpred(_ctx, 28);
		case 16:
			return precpred(_ctx, 27);
		case 17:
			return precpred(_ctx, 26);
		case 18:
			return precpred(_ctx, 22);
		case 19:
			return precpred(_ctx, 20);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0088\u04b4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0001\u0000\u0003\u0000\u00c4\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u00ce\b\u0000\n\u0000\f\u0000\u00d1\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u00e0\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u00e4\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0003\u0007\u00e9\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u00f0\b"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00f6\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00fc\b\t\u0001\t\u0001\t\u0003\t\u0100\b\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u010a"+
		"\b\t\n\t\f\t\u010d\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t"+
		"\u0114\b\t\u0001\n\u0004\n\u0117\b\n\u000b\n\f\n\u0118\u0001\n\u0003\n"+
		"\u011c\b\n\u0001\u000b\u0003\u000b\u011f\b\u000b\u0001\u000b\u0003\u000b"+
		"\u0122\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u012a\b\u000b\n\u000b\f\u000b\u012d\t\u000b\u0003"+
		"\u000b\u012f\b\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0133\b\u000b"+
		"\n\u000b\f\u000b\u0136\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0003\f\u013c\b\f\u0001\r\u0001\r\u0003\r\u0140\b\r\u0001\r\u0001\r\u0005"+
		"\r\u0144\b\r\n\r\f\r\u0147\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0153\b\r\n\r\f\r\u0156"+
		"\t\r\u0005\r\u0158\b\r\n\r\f\r\u015b\t\r\u0001\r\u0003\r\u015e\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0168\b\u000e\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u016c\b\u000f\n\u000f\f\u000f\u016f\t\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0174\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u017d\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0189\b\u0011"+
		"\n\u0011\f\u0011\u018c\t\u0011\u0003\u0011\u018e\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u019a\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01a1\b\u0014\u0001"+
		"\u0014\u0003\u0014\u01a4\b\u0014\u0001\u0015\u0003\u0015\u01a7\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u01ab\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u01b0\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u01b4\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u01c5\b\u0018"+
		"\n\u0018\f\u0018\u01c8\t\u0018\u0001\u0019\u0003\u0019\u01cb\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01d1\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u01db\b\u001b\u0001\u001b\u0001\u001b\u0005"+
		"\u001b\u01df\b\u001b\n\u001b\f\u001b\u01e2\t\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01ea\b\u001c"+
		"\n\u001c\f\u001c\u01ed\t\u001c\u0003\u001c\u01ef\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u01f7"+
		"\b\u001d\n\u001d\f\u001d\u01fa\t\u001d\u0003\u001d\u01fc\b\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u0202\b\u001e\u0001"+
		"\u001e\u0003\u001e\u0205\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0005\u001f\u020b\b\u001f\n\u001f\f\u001f\u020e\t\u001f\u0003\u001f"+
		"\u0210\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0003 \u0216\b \u0001"+
		" \u0003 \u0219\b \u0001!\u0001!\u0001!\u0001!\u0005!\u021f\b!\n!\f!\u0222"+
		"\t!\u0003!\u0224\b!\u0001!\u0001!\u0001\"\u0001\"\u0003\"\u022a\b\"\u0001"+
		"#\u0001#\u0003#\u022e\b#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u0239\b$\u0001$\u0001$\u0001$\u0003$\u023e\b$\u0001"+
		"$\u0005$\u0241\b$\n$\f$\u0244\t$\u0001%\u0001%\u0001%\u0005%\u0249\b%"+
		"\n%\f%\u024c\t%\u0001&\u0001&\u0001&\u0001&\u0003&\u0252\b&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u025d"+
		"\b\'\n\'\f\'\u0260\t\'\u0001\'\u0001\'\u0003\'\u0264\b\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u0269\b\'\u0001\'\u0001\'\u0001\'\u0005\'\u026e\b\'"+
		"\n\'\f\'\u0271\t\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0278"+
		"\b\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001+\u0005"+
		"+\u0283\b+\n+\f+\u0286\t+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0003-\u029d\b-\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0003.\u02a6\b.\u0001.\u0001.\u0005.\u02aa\b.\n"+
		".\f.\u02ad\t.\u0001/\u0001/\u0003/\u02b1\b/\u0001/\u0001/\u0001/\u0003"+
		"/\u02b6\b/\u0001/\u0001/\u0003/\u02ba\b/\u0001/\u0001/\u0001/\u0003/\u02bf"+
		"\b/\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00031\u02cb\b1\u00012\u00012\u00013\u00013\u00014\u00014\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00016\u00016\u00036\u02db\b6\u00017\u0001"+
		"7\u00017\u00017\u00037\u02e1\b7\u00017\u00017\u00037\u02e5\b7\u00017\u0003"+
		"7\u02e8\b7\u00017\u00017\u00017\u00018\u00018\u00038\u02ef\b8\u00018\u0001"+
		"8\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001:\u0001"+
		":\u0001:\u0001;\u0001;\u0001;\u0001<\u0001<\u0003<\u0303\b<\u0001<\u0001"+
		"<\u0001=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0003?\u0315\b?\u0001?\u0001?\u0003?\u0319"+
		"\b?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001"+
		"A\u0003A\u0325\bA\u0001A\u0001A\u0003A\u0329\bA\u0005A\u032b\bA\nA\fA"+
		"\u032e\tA\u0001B\u0001B\u0003B\u0332\bB\u0001B\u0005B\u0335\bB\nB\fB\u0338"+
		"\tB\u0001B\u0003B\u033b\bB\u0001B\u0001B\u0001C\u0001C\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0005D\u0346\bD\nD\fD\u0349\tD\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0003D\u0365\bD\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003"+
		"D\u0394\bD\u0001D\u0001D\u0001D\u0001D\u0003D\u039a\bD\u0001D\u0001D\u0003"+
		"D\u039e\bD\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u03a5\bD\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0005D\u03b1"+
		"\bD\nD\fD\u03b4\tD\u0003D\u03b6\bD\u0001D\u0001D\u0001D\u0001D\u0001D"+
		"\u0001D\u0001D\u0001D\u0005D\u03c0\bD\nD\fD\u03c3\tD\u0001E\u0001E\u0001"+
		"E\u0001E\u0001E\u0001E\u0001E\u0003E\u03cc\bE\u0001E\u0001E\u0001E\u0001"+
		"E\u0001E\u0003E\u03d3\bE\u0003E\u03d5\bE\u0001F\u0001F\u0001F\u0005F\u03da"+
		"\bF\nF\fF\u03dd\tF\u0001G\u0001G\u0001G\u0005G\u03e2\bG\nG\fG\u03e5\t"+
		"G\u0001G\u0003G\u03e8\bG\u0001H\u0001H\u0001H\u0001H\u0001I\u0001I\u0003"+
		"I\u03f0\bI\u0001I\u0001I\u0003I\u03f4\bI\u0003I\u03f6\bI\u0001J\u0001"+
		"J\u0001J\u0001J\u0001J\u0001K\u0001K\u0005K\u03ff\bK\nK\fK\u0402\tK\u0001"+
		"K\u0001K\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001"+
		"L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0003L\u0417"+
		"\bL\u0001M\u0001M\u0003M\u041b\bM\u0001N\u0001N\u0001N\u0001N\u0003N\u0421"+
		"\bN\u0001N\u0001N\u0003N\u0425\bN\u0001N\u0001N\u0005N\u0429\bN\nN\fN"+
		"\u042c\tN\u0001N\u0003N\u042f\bN\u0001O\u0001O\u0001O\u0001O\u0003O\u0435"+
		"\bO\u0001P\u0001P\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003"+
		"Q\u0440\bQ\u0001R\u0001R\u0001R\u0005R\u0445\bR\nR\fR\u0448\tR\u0001S"+
		"\u0001S\u0001S\u0001T\u0001T\u0001T\u0001U\u0001U\u0001U\u0005U\u0453"+
		"\bU\nU\fU\u0456\tU\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0003V\u045e"+
		"\bV\u0001W\u0001W\u0001W\u0001W\u0003W\u0464\bW\u0001W\u0001W\u0003W\u0468"+
		"\bW\u0001W\u0001W\u0001X\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0003Y\u0472"+
		"\bY\u0001Y\u0001Y\u0001Y\u0003Y\u0477\bY\u0001Y\u0001Y\u0001Z\u0001Z\u0001"+
		"Z\u0001Z\u0001[\u0001[\u0001\\\u0001\\\u0001\\\u0001\\\u0001]\u0001]\u0003"+
		"]\u0487\b]\u0001]\u0001]\u0003]\u048b\b]\u0005]\u048d\b]\n]\f]\u0490\t"+
		"]\u0001]\u0001]\u0001]\u0001]\u0001]\u0005]\u0497\b]\n]\f]\u049a\t]\u0003"+
		"]\u049c\b]\u0001]\u0003]\u049f\b]\u0001^\u0001^\u0003^\u04a3\b^\u0001"+
		"_\u0001_\u0003_\u04a7\b_\u0001`\u0001`\u0001`\u0001`\u0005`\u04ad\b`\n"+
		"`\f`\u04b0\t`\u0003`\u04b2\b`\u0001`\u0000\u0002H\u0088a\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u0000\u0014\u0001\u0000\u0003\t\u0001\u0000"+
		"\u0012\u0014\u0003\u0000tv{{}~\u0001\u0000 \"\u0003\u0000yy{{}~\u0001"+
		"\u0000,.\u0004\u0000tt||\u007f\u007f\u0081\u0081\u0003\u0000((:=fj\u0002"+
		"\u0000\u0004\u0004>B\u0002\u0000BBDD\u0002\u0000AAEE\u0002\u0000\f\fG"+
		"H\u0001\u0000IK\u0001\u0000\u0005\b\u0001\u0000NO\u0002\u0000\t\tS]\u0001"+
		"\u0000>?\u0003\u0000mnpp\u0083\u0083\u0001\u0000mn\u0003\u0000\r\r..\u0082"+
		"\u0082\u0535\u0000\u00c3\u0001\u0000\u0000\u0000\u0002\u00d4\u0001\u0000"+
		"\u0000\u0000\u0004\u00d6\u0001\u0000\u0000\u0000\u0006\u00db\u0001\u0000"+
		"\u0000\u0000\b\u00df\u0001\u0000\u0000\u0000\n\u00e1\u0001\u0000\u0000"+
		"\u0000\f\u00e5\u0001\u0000\u0000\u0000\u000e\u00e8\u0001\u0000\u0000\u0000"+
		"\u0010\u00ec\u0001\u0000\u0000\u0000\u0012\u0113\u0001\u0000\u0000\u0000"+
		"\u0014\u011b\u0001\u0000\u0000\u0000\u0016\u011e\u0001\u0000\u0000\u0000"+
		"\u0018\u0139\u0001\u0000\u0000\u0000\u001a\u015d\u0001\u0000\u0000\u0000"+
		"\u001c\u0167\u0001\u0000\u0000\u0000\u001e\u0169\u0001\u0000\u0000\u0000"+
		" \u0177\u0001\u0000\u0000\u0000\"\u0180\u0001\u0000\u0000\u0000$\u0191"+
		"\u0001\u0000\u0000\u0000&\u0196\u0001\u0000\u0000\u0000(\u019d\u0001\u0000"+
		"\u0000\u0000*\u01a6\u0001\u0000\u0000\u0000,\u01b5\u0001\u0000\u0000\u0000"+
		".\u01b8\u0001\u0000\u0000\u00000\u01c6\u0001\u0000\u0000\u00002\u01ca"+
		"\u0001\u0000\u0000\u00004\u01d4\u0001\u0000\u0000\u00006\u01d6\u0001\u0000"+
		"\u0000\u00008\u01e5\u0001\u0000\u0000\u0000:\u01f2\u0001\u0000\u0000\u0000"+
		"<\u01ff\u0001\u0000\u0000\u0000>\u0206\u0001\u0000\u0000\u0000@\u0213"+
		"\u0001\u0000\u0000\u0000B\u021a\u0001\u0000\u0000\u0000D\u0227\u0001\u0000"+
		"\u0000\u0000F\u022b\u0001\u0000\u0000\u0000H\u0238\u0001\u0000\u0000\u0000"+
		"J\u0245\u0001\u0000\u0000\u0000L\u024d\u0001\u0000\u0000\u0000N\u0277"+
		"\u0001\u0000\u0000\u0000P\u0279\u0001\u0000\u0000\u0000R\u027b\u0001\u0000"+
		"\u0000\u0000T\u027d\u0001\u0000\u0000\u0000V\u027f\u0001\u0000\u0000\u0000"+
		"X\u0289\u0001\u0000\u0000\u0000Z\u029c\u0001\u0000\u0000\u0000\\\u029e"+
		"\u0001\u0000\u0000\u0000^\u02be\u0001\u0000\u0000\u0000`\u02c0\u0001\u0000"+
		"\u0000\u0000b\u02c3\u0001\u0000\u0000\u0000d\u02cc\u0001\u0000\u0000\u0000"+
		"f\u02ce\u0001\u0000\u0000\u0000h\u02d0\u0001\u0000\u0000\u0000j\u02d2"+
		"\u0001\u0000\u0000\u0000l\u02da\u0001\u0000\u0000\u0000n\u02dc\u0001\u0000"+
		"\u0000\u0000p\u02ec\u0001\u0000\u0000\u0000r\u02f2\u0001\u0000\u0000\u0000"+
		"t\u02fa\u0001\u0000\u0000\u0000v\u02fd\u0001\u0000\u0000\u0000x\u0300"+
		"\u0001\u0000\u0000\u0000z\u0306\u0001\u0000\u0000\u0000|\u0309\u0001\u0000"+
		"\u0000\u0000~\u0314\u0001\u0000\u0000\u0000\u0080\u031c\u0001\u0000\u0000"+
		"\u0000\u0082\u0324\u0001\u0000\u0000\u0000\u0084\u032f\u0001\u0000\u0000"+
		"\u0000\u0086\u033e\u0001\u0000\u0000\u0000\u0088\u0364\u0001\u0000\u0000"+
		"\u0000\u008a\u03d4\u0001\u0000\u0000\u0000\u008c\u03d6\u0001\u0000\u0000"+
		"\u0000\u008e\u03de\u0001\u0000\u0000\u0000\u0090\u03e9\u0001\u0000\u0000"+
		"\u0000\u0092\u03f5\u0001\u0000\u0000\u0000\u0094\u03f7\u0001\u0000\u0000"+
		"\u0000\u0096\u03fc\u0001\u0000\u0000\u0000\u0098\u0416\u0001\u0000\u0000"+
		"\u0000\u009a\u041a\u0001\u0000\u0000\u0000\u009c\u0420\u0001\u0000\u0000"+
		"\u0000\u009e\u0430\u0001\u0000\u0000\u0000\u00a0\u0436\u0001\u0000\u0000"+
		"\u0000\u00a2\u043f\u0001\u0000\u0000\u0000\u00a4\u0441\u0001\u0000\u0000"+
		"\u0000\u00a6\u0449\u0001\u0000\u0000\u0000\u00a8\u044c\u0001\u0000\u0000"+
		"\u0000\u00aa\u044f\u0001\u0000\u0000\u0000\u00ac\u045d\u0001\u0000\u0000"+
		"\u0000\u00ae\u045f\u0001\u0000\u0000\u0000\u00b0\u046b\u0001\u0000\u0000"+
		"\u0000\u00b2\u046e\u0001\u0000\u0000\u0000\u00b4\u047a\u0001\u0000\u0000"+
		"\u0000\u00b6\u047e\u0001\u0000\u0000\u0000\u00b8\u0480\u0001\u0000\u0000"+
		"\u0000\u00ba\u049e\u0001\u0000\u0000\u0000\u00bc\u04a2\u0001\u0000\u0000"+
		"\u0000\u00be\u04a4\u0001\u0000\u0000\u0000\u00c0\u04b1\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c4\u0003\u0002\u0001\u0000\u00c3\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00cf\u0001\u0000\u0000"+
		"\u0000\u00c5\u00ce\u0003\u0014\n\u0000\u00c6\u00ce\u0003\u0004\u0002\u0000"+
		"\u00c7\u00ce\u0003\u0012\t\u0000\u00c8\u00ce\u0003\u0016\u000b\u0000\u00c9"+
		"\u00ce\u0003*\u0015\u0000\u00ca\u00ce\u0003\u0080@\u0000\u00cb\u00ce\u0003"+
		"\"\u0011\u0000\u00cc\u00ce\u00036\u001b\u0000\u00cd\u00c5\u0001\u0000"+
		"\u0000\u0000\u00cd\u00c6\u0001\u0000\u0000\u0000\u00cd\u00c7\u0001\u0000"+
		"\u0000\u0000\u00cd\u00c8\u0001\u0000\u0000\u0000\u00cd\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ca\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000"+
		"\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0005\u0000\u0000\u0001\u00d3\u0001\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0005e\u0000\u0000\u00d5\u0003\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0005\u0001\u0000\u0000\u00d7\u00d8\u0003\u0006\u0003"+
		"\u0000\u00d8\u00d9\u0003\b\u0004\u0000\u00d9\u00da\u0005\u0002\u0000\u0000"+
		"\u00da\u0005\u0001\u0000\u0000\u0000\u00db\u00dc\u0003\u00c0`\u0000\u00dc"+
		"\u0007\u0001\u0000\u0000\u0000\u00dd\u00e0\u0003\n\u0005\u0000\u00de\u00e0"+
		"\u0003\u0088D\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00de\u0001"+
		"\u0000\u0000\u0000\u00e0\t\u0001\u0000\u0000\u0000\u00e1\u00e3\u0003\u000e"+
		"\u0007\u0000\u00e2\u00e4\u0003\u000e\u0007\u0000\u00e3\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u000b\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0007\u0000\u0000\u0000\u00e6\r\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e9\u0003\f\u0006\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0005k\u0000\u0000\u00eb\u000f\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ef\u0003\u00c0`\u0000\u00ed\u00ee\u0005\n\u0000\u0000\u00ee\u00f0"+
		"\u0003\u00c0`\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f0\u0011\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005"+
		"\u000b\u0000\u0000\u00f2\u00f5\u0005\u0083\u0000\u0000\u00f3\u00f4\u0005"+
		"\n\u0000\u0000\u00f4\u00f6\u0003\u00c0`\u0000\u00f5\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f7\u0114\u0005\u0002\u0000\u0000\u00f8\u00fb\u0005\u000b"+
		"\u0000\u0000\u00f9\u00fc\u0005\f\u0000\u0000\u00fa\u00fc\u0003\u00c0`"+
		"\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\n\u0000\u0000"+
		"\u00fe\u0100\u0003\u00c0`\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff"+
		"\u0100\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0005\r\u0000\u0000\u0102\u0103\u0005\u0083\u0000\u0000\u0103\u0114"+
		"\u0005\u0002\u0000\u0000\u0104\u0105\u0005\u000b\u0000\u0000\u0105\u0106"+
		"\u0005\u000e\u0000\u0000\u0106\u010b\u0003\u0010\b\u0000\u0107\u0108\u0005"+
		"\u000f\u0000\u0000\u0108\u010a\u0003\u0010\b\u0000\u0109\u0107\u0001\u0000"+
		"\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010e\u0001\u0000"+
		"\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u010f\u0005\u0010"+
		"\u0000\u0000\u010f\u0110\u0005\r\u0000\u0000\u0110\u0111\u0005\u0083\u0000"+
		"\u0000\u0111\u0112\u0005\u0002\u0000\u0000\u0112\u0114\u0001\u0000\u0000"+
		"\u0000\u0113\u00f1\u0001\u0000\u0000\u0000\u0113\u00f8\u0001\u0000\u0000"+
		"\u0000\u0113\u0104\u0001\u0000\u0000\u0000\u0114\u0013\u0001\u0000\u0000"+
		"\u0000\u0115\u0117\u0005\u0085\u0000\u0000\u0116\u0115\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000"+
		"\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000"+
		"\u0000\u011a\u011c\u0005\u0086\u0000\u0000\u011b\u0116\u0001\u0000\u0000"+
		"\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c\u0015\u0001\u0000\u0000"+
		"\u0000\u011d\u011f\u0003\u0014\n\u0000\u011e\u011d\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000"+
		"\u0120\u0122\u0005\u0011\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000"+
		"\u0123\u0124\u0007\u0001\u0000\u0000\u0124\u012e\u0003\u00c0`\u0000\u0125"+
		"\u0126\u0005\u0015\u0000\u0000\u0126\u012b\u0003\u0018\f\u0000\u0127\u0128"+
		"\u0005\u000f\u0000\u0000\u0128\u012a\u0003\u0018\f\u0000\u0129\u0127\u0001"+
		"\u0000\u0000\u0000\u012a\u012d\u0001\u0000\u0000\u0000\u012b\u0129\u0001"+
		"\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012f\u0001"+
		"\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012e\u0125\u0001"+
		"\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0130\u0001"+
		"\u0000\u0000\u0000\u0130\u0134\u0005\u000e\u0000\u0000\u0131\u0133\u0003"+
		"\u001c\u000e\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0133\u0136\u0001"+
		"\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001"+
		"\u0000\u0000\u0000\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u0134\u0001"+
		"\u0000\u0000\u0000\u0137\u0138\u0005\u0010\u0000\u0000\u0138\u0017\u0001"+
		"\u0000\u0000\u0000\u0139\u013b\u0003J%\u0000\u013a\u013c\u0003\u001a\r"+
		"\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000"+
		"\u0000\u013c\u0019\u0001\u0000\u0000\u0000\u013d\u013f\u0005\u0016\u0000"+
		"\u0000\u013e\u0140\u0003\u0088D\u0000\u013f\u013e\u0001\u0000\u0000\u0000"+
		"\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0145\u0001\u0000\u0000\u0000"+
		"\u0141\u0142\u0005\u000f\u0000\u0000\u0142\u0144\u0003\u0088D\u0000\u0143"+
		"\u0141\u0001\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145"+
		"\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146"+
		"\u0148\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148"+
		"\u015e\u0005\u0017\u0000\u0000\u0149\u0159\u0005\u0018\u0000\u0000\u014a"+
		"\u014b\u0003\u00c0`\u0000\u014b\u014c\u0005\u0019\u0000\u0000\u014c\u0154"+
		"\u0003\u0088D\u0000\u014d\u014e\u0005\u000f\u0000\u0000\u014e\u014f\u0003"+
		"\u00c0`\u0000\u014f\u0150\u0005\u0019\u0000\u0000\u0150\u0151\u0003\u0088"+
		"D\u0000\u0151\u0153\u0001\u0000\u0000\u0000\u0152\u014d\u0001\u0000\u0000"+
		"\u0000\u0153\u0156\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000"+
		"\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0158\u0001\u0000\u0000"+
		"\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0157\u014a\u0001\u0000\u0000"+
		"\u0000\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000"+
		"\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015c\u0001\u0000\u0000"+
		"\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015c\u015e\u0005\u001a\u0000"+
		"\u0000\u015d\u013d\u0001\u0000\u0000\u0000\u015d\u0149\u0001\u0000\u0000"+
		"\u0000\u015e\u001b\u0001\u0000\u0000\u0000\u015f\u0168\u0003\u001e\u000f"+
		"\u0000\u0160\u0168\u0003 \u0010\u0000\u0161\u0168\u0003\"\u0011\u0000"+
		"\u0162\u0168\u0003$\u0012\u0000\u0163\u0168\u0003&\u0013\u0000\u0164\u0168"+
		"\u0003*\u0015\u0000\u0165\u0168\u00032\u0019\u0000\u0166\u0168\u00036"+
		"\u001b\u0000\u0167\u015f\u0001\u0000\u0000\u0000\u0167\u0160\u0001\u0000"+
		"\u0000\u0000\u0167\u0161\u0001\u0000\u0000\u0000\u0167\u0162\u0001\u0000"+
		"\u0000\u0000\u0167\u0163\u0001\u0000\u0000\u0000\u0167\u0164\u0001\u0000"+
		"\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0166\u0001\u0000"+
		"\u0000\u0000\u0168\u001d\u0001\u0000\u0000\u0000\u0169\u016d\u0003H$\u0000"+
		"\u016a\u016c\u0007\u0002\u0000\u0000\u016b\u016a\u0001\u0000\u0000\u0000"+
		"\u016c\u016f\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000"+
		"\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u0170\u0001\u0000\u0000\u0000"+
		"\u016f\u016d\u0001\u0000\u0000\u0000\u0170\u0173\u0003\u00c0`\u0000\u0171"+
		"\u0172\u0005\t\u0000\u0000\u0172\u0174\u0003\u0088D\u0000\u0173\u0171"+
		"\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0175"+
		"\u0001\u0000\u0000\u0000\u0175\u0176\u0005\u0002\u0000\u0000\u0176\u001f"+
		"\u0001\u0000\u0000\u0000\u0177\u0178\u0005\u001b\u0000\u0000\u0178\u0179"+
		"\u0003\u00c0`\u0000\u0179\u017c\u0005\u001c\u0000\u0000\u017a\u017d\u0005"+
		"\f\u0000\u0000\u017b\u017d\u0003H$\u0000\u017c\u017a\u0001\u0000\u0000"+
		"\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000"+
		"\u0000\u017e\u017f\u0005\u0002\u0000\u0000\u017f!\u0001\u0000\u0000\u0000"+
		"\u0180\u0181\u0005\u001d\u0000\u0000\u0181\u0182\u0003\u00c0`\u0000\u0182"+
		"\u018d\u0005\u000e\u0000\u0000\u0183\u0184\u0003F#\u0000\u0184\u018a\u0005"+
		"\u0002\u0000\u0000\u0185\u0186\u0003F#\u0000\u0186\u0187\u0005\u0002\u0000"+
		"\u0000\u0187\u0189\u0001\u0000\u0000\u0000\u0188\u0185\u0001\u0000\u0000"+
		"\u0000\u0189\u018c\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000"+
		"\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018e\u0001\u0000\u0000"+
		"\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018d\u0183\u0001\u0000\u0000"+
		"\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000"+
		"\u0000\u018f\u0190\u0005\u0010\u0000\u0000\u0190#\u0001\u0000\u0000\u0000"+
		"\u0191\u0192\u0005\u001e\u0000\u0000\u0192\u0193\u00038\u001c\u0000\u0193"+
		"\u0194\u00030\u0018\u0000\u0194\u0195\u0003V+\u0000\u0195%\u0001\u0000"+
		"\u0000\u0000\u0196\u0197\u0005\u001f\u0000\u0000\u0197\u0199\u0003\u00c0"+
		"`\u0000\u0198\u019a\u00038\u001c\u0000\u0199\u0198\u0001\u0000\u0000\u0000"+
		"\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000"+
		"\u019b\u019c\u0003V+\u0000\u019c\'\u0001\u0000\u0000\u0000\u019d\u01a3"+
		"\u0003\u00c0`\u0000\u019e\u01a0\u0005\u0016\u0000\u0000\u019f\u01a1\u0003"+
		"\u008cF\u0000\u01a0\u019f\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a4\u0005\u0017"+
		"\u0000\u0000\u01a3\u019e\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a4)\u0001\u0000\u0000\u0000\u01a5\u01a7\u0003\u0014\n"+
		"\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01aa\u0007\u0003\u0000"+
		"\u0000\u01a9\u01ab\u0003\u00c0`\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000"+
		"\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000"+
		"\u01ac\u01ad\u00038\u001c\u0000\u01ad\u01af\u00030\u0018\u0000\u01ae\u01b0"+
		"\u0003,\u0016\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01af\u01b0\u0001"+
		"\u0000\u0000\u0000\u01b0\u01b3\u0001\u0000\u0000\u0000\u01b1\u01b4\u0005"+
		"\u0002\u0000\u0000\u01b2\u01b4\u0003V+\u0000\u01b3\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b4+\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b6\u0005#\u0000\u0000\u01b6\u01b7\u00038\u001c\u0000\u01b7-"+
		"\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005u\u0000\u0000\u01b9\u01ba\u0003"+
		"8\u001c\u0000\u01ba/\u0001\u0000\u0000\u0000\u01bb\u01c5\u0003(\u0014"+
		"\u0000\u01bc\u01c5\u0003T*\u0000\u01bd\u01c5\u0005y\u0000\u0000\u01be"+
		"\u01c5\u0005~\u0000\u0000\u01bf\u01c5\u0005{\u0000\u0000\u01c0\u01c5\u0005"+
		"}\u0000\u0000\u01c1\u01c5\u0005u\u0000\u0000\u01c2\u01c5\u0003.\u0017"+
		"\u0000\u01c3\u01c5\u0005w\u0000\u0000\u01c4\u01bb\u0001\u0000\u0000\u0000"+
		"\u01c4\u01bc\u0001\u0000\u0000\u0000\u01c4\u01bd\u0001\u0000\u0000\u0000"+
		"\u01c4\u01be\u0001\u0000\u0000\u0000\u01c4\u01bf\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c0\u0001\u0000\u0000\u0000\u01c4\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c8\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c71\u0001\u0000\u0000\u0000\u01c8"+
		"\u01c6\u0001\u0000\u0000\u0000\u01c9\u01cb\u0003\u0014\n\u0000\u01ca\u01c9"+
		"\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb\u01cc"+
		"\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005$\u0000\u0000\u01cd\u01ce\u0003"+
		"\u00c0`\u0000\u01ce\u01d0\u0003>\u001f\u0000\u01cf\u01d1\u0005r\u0000"+
		"\u0000\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d3\u0005\u0002\u0000"+
		"\u0000\u01d33\u0001\u0000\u0000\u0000\u01d4\u01d5\u0003\u00c0`\u0000\u01d5"+
		"5\u0001\u0000\u0000\u0000\u01d6\u01d7\u0005%\u0000\u0000\u01d7\u01d8\u0003"+
		"\u00c0`\u0000\u01d8\u01da\u0005\u000e\u0000\u0000\u01d9\u01db\u00034\u001a"+
		"\u0000\u01da\u01d9\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000"+
		"\u0000\u01db\u01e0\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005\u000f\u0000"+
		"\u0000\u01dd\u01df\u00034\u001a\u0000\u01de\u01dc\u0001\u0000\u0000\u0000"+
		"\u01df\u01e2\u0001\u0000\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000"+
		"\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e3\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e3\u01e4\u0005\u0010\u0000\u0000"+
		"\u01e47\u0001\u0000\u0000\u0000\u01e5\u01ee\u0005\u0016\u0000\u0000\u01e6"+
		"\u01eb\u0003<\u001e\u0000\u01e7\u01e8\u0005\u000f\u0000\u0000\u01e8\u01ea"+
		"\u0003<\u001e\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01ea\u01ed\u0001"+
		"\u0000\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001"+
		"\u0000\u0000\u0000\u01ec\u01ef\u0001\u0000\u0000\u0000\u01ed\u01eb\u0001"+
		"\u0000\u0000\u0000\u01ee\u01e6\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001"+
		"\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005"+
		"\u0017\u0000\u0000\u01f19\u0001\u0000\u0000\u0000\u01f2\u01fb\u0005\u0016"+
		"\u0000\u0000\u01f3\u01f8\u0003<\u001e\u0000\u01f4\u01f5\u0005\u000f\u0000"+
		"\u0000\u01f5\u01f7\u0003<\u001e\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f7\u01fa\u0001\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000"+
		"\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fc\u0001\u0000\u0000\u0000"+
		"\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fb\u01f3\u0001\u0000\u0000\u0000"+
		"\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000"+
		"\u01fd\u01fe\u0005\u0017\u0000\u0000\u01fe;\u0001\u0000\u0000\u0000\u01ff"+
		"\u0201\u0003H$\u0000\u0200\u0202\u0003R)\u0000\u0201\u0200\u0001\u0000"+
		"\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202\u0204\u0001\u0000"+
		"\u0000\u0000\u0203\u0205\u0003\u00c0`\u0000\u0204\u0203\u0001\u0000\u0000"+
		"\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205=\u0001\u0000\u0000\u0000"+
		"\u0206\u020f\u0005\u0016\u0000\u0000\u0207\u020c\u0003@ \u0000\u0208\u0209"+
		"\u0005\u000f\u0000\u0000\u0209\u020b\u0003@ \u0000\u020a\u0208\u0001\u0000"+
		"\u0000\u0000\u020b\u020e\u0001\u0000\u0000\u0000\u020c\u020a\u0001\u0000"+
		"\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d\u0210\u0001\u0000"+
		"\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020f\u0207\u0001\u0000"+
		"\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u0211\u0001\u0000"+
		"\u0000\u0000\u0211\u0212\u0005\u0017\u0000\u0000\u0212?\u0001\u0000\u0000"+
		"\u0000\u0213\u0215\u0003H$\u0000\u0214\u0216\u0005z\u0000\u0000\u0215"+
		"\u0214\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216"+
		"\u0218\u0001\u0000\u0000\u0000\u0217\u0219\u0003\u00c0`\u0000\u0218\u0217"+
		"\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219A\u0001"+
		"\u0000\u0000\u0000\u021a\u0223\u0005\u0016\u0000\u0000\u021b\u0220\u0003"+
		"D\"\u0000\u021c\u021d\u0005\u000f\u0000\u0000\u021d\u021f\u0003D\"\u0000"+
		"\u021e\u021c\u0001\u0000\u0000\u0000\u021f\u0222\u0001\u0000\u0000\u0000"+
		"\u0220\u021e\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000"+
		"\u0221\u0224\u0001\u0000\u0000\u0000\u0222\u0220\u0001\u0000\u0000\u0000"+
		"\u0223\u021b\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000\u0000"+
		"\u0224\u0225\u0001\u0000\u0000\u0000\u0225\u0226\u0005\u0017\u0000\u0000"+
		"\u0226C\u0001\u0000\u0000\u0000\u0227\u0229\u0003H$\u0000\u0228\u022a"+
		"\u0003R)\u0000\u0229\u0228\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000"+
		"\u0000\u0000\u022aE\u0001\u0000\u0000\u0000\u022b\u022d\u0003H$\u0000"+
		"\u022c\u022e\u0003R)\u0000\u022d\u022c\u0001\u0000\u0000\u0000\u022d\u022e"+
		"\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0230"+
		"\u0003\u00c0`\u0000\u0230G\u0001\u0000\u0000\u0000\u0231\u0232\u0006$"+
		"\uffff\uffff\u0000\u0232\u0239\u0003\u0086C\u0000\u0233\u0239\u0003J%"+
		"\u0000\u0234\u0239\u0003L&\u0000\u0235\u0239\u0003N\'\u0000\u0236\u0237"+
		"\u0005(\u0000\u0000\u0237\u0239\u0005|\u0000\u0000\u0238\u0231\u0001\u0000"+
		"\u0000\u0000\u0238\u0233\u0001\u0000\u0000\u0000\u0238\u0234\u0001\u0000"+
		"\u0000\u0000\u0238\u0235\u0001\u0000\u0000\u0000\u0238\u0236\u0001\u0000"+
		"\u0000\u0000\u0239\u0242\u0001\u0000\u0000\u0000\u023a\u023b\n\u0003\u0000"+
		"\u0000\u023b\u023d\u0005&\u0000\u0000\u023c\u023e\u0003\u0088D\u0000\u023d"+
		"\u023c\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e"+
		"\u023f\u0001\u0000\u0000\u0000\u023f\u0241\u0005\'\u0000\u0000\u0240\u023a"+
		"\u0001\u0000\u0000\u0000\u0241\u0244\u0001\u0000\u0000\u0000\u0242\u0240"+
		"\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243I\u0001"+
		"\u0000\u0000\u0000\u0244\u0242\u0001\u0000\u0000\u0000\u0245\u024a\u0003"+
		"\u00c0`\u0000\u0246\u0247\u0005)\u0000\u0000\u0247\u0249\u0003\u00c0`"+
		"\u0000\u0248\u0246\u0001\u0000\u0000\u0000\u0249\u024c\u0001\u0000\u0000"+
		"\u0000\u024a\u0248\u0001\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000"+
		"\u0000\u024bK\u0001\u0000\u0000\u0000\u024c\u024a\u0001\u0000\u0000\u0000"+
		"\u024d\u024e\u0005*\u0000\u0000\u024e\u0251\u0005\u0016\u0000\u0000\u024f"+
		"\u0252\u0003\u0086C\u0000\u0250\u0252\u0003J%\u0000\u0251\u024f\u0001"+
		"\u0000\u0000\u0000\u0251\u0250\u0001\u0000\u0000\u0000\u0252\u0253\u0001"+
		"\u0000\u0000\u0000\u0253\u0254\u0005+\u0000\u0000\u0254\u0255\u0003H$"+
		"\u0000\u0255\u0256\u0005\u0017\u0000\u0000\u0256M\u0001\u0000\u0000\u0000"+
		"\u0257\u0258\u0005 \u0000\u0000\u0258\u025e\u0003B!\u0000\u0259\u025d"+
		"\u0005{\u0000\u0000\u025a\u025d\u0005y\u0000\u0000\u025b\u025d\u0003T"+
		"*\u0000\u025c\u0259\u0001\u0000\u0000\u0000\u025c\u025a\u0001\u0000\u0000"+
		"\u0000\u025c\u025b\u0001\u0000\u0000\u0000\u025d\u0260\u0001\u0000\u0000"+
		"\u0000\u025e\u025c\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000"+
		"\u0000\u025f\u0263\u0001\u0000\u0000\u0000\u0260\u025e\u0001\u0000\u0000"+
		"\u0000\u0261\u0262\u0005#\u0000\u0000\u0262\u0264\u0003B!\u0000\u0263"+
		"\u0261\u0001\u0000\u0000\u0000\u0263\u0264\u0001\u0000\u0000\u0000\u0264"+
		"\u0278\u0001\u0000\u0000\u0000\u0265\u0266\u0005 \u0000\u0000\u0266\u0268"+
		"\u0005\u0016\u0000\u0000\u0267\u0269\u00038\u001c\u0000\u0268\u0267\u0001"+
		"\u0000\u0000\u0000\u0268\u0269\u0001\u0000\u0000\u0000\u0269\u026a\u0001"+
		"\u0000\u0000\u0000\u026a\u026f\u0005\u0017\u0000\u0000\u026b\u026e\u0003"+
		"P(\u0000\u026c\u026e\u0003T*\u0000\u026d\u026b\u0001\u0000\u0000\u0000"+
		"\u026d\u026c\u0001\u0000\u0000\u0000\u026e\u0271\u0001\u0000\u0000\u0000"+
		"\u026f\u026d\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000\u0000"+
		"\u0270\u0272\u0001\u0000\u0000\u0000\u0271\u026f\u0001\u0000\u0000\u0000"+
		"\u0272\u0273\u0005#\u0000\u0000\u0273\u0274\u0005\u0016\u0000\u0000\u0274"+
		"\u0275\u00038\u001c\u0000\u0275\u0276\u0005\u0017\u0000\u0000\u0276\u0278"+
		"\u0001\u0000\u0000\u0000\u0277\u0257\u0001\u0000\u0000\u0000\u0277\u0265"+
		"\u0001\u0000\u0000\u0000\u0278O\u0001\u0000\u0000\u0000\u0279\u027a\u0007"+
		"\u0004\u0000\u0000\u027aQ\u0001\u0000\u0000\u0000\u027b\u027c\u0007\u0005"+
		"\u0000\u0000\u027cS\u0001\u0000\u0000\u0000\u027d\u027e\u0007\u0006\u0000"+
		"\u0000\u027eU\u0001\u0000\u0000\u0000\u027f\u0284\u0005\u000e\u0000\u0000"+
		"\u0280\u0283\u0003Z-\u0000\u0281\u0283\u0003X,\u0000\u0282\u0280\u0001"+
		"\u0000\u0000\u0000\u0282\u0281\u0001\u0000\u0000\u0000\u0283\u0286\u0001"+
		"\u0000\u0000\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0284\u0285\u0001"+
		"\u0000\u0000\u0000\u0285\u0287\u0001\u0000\u0000\u0000\u0286\u0284\u0001"+
		"\u0000\u0000\u0000\u0287\u0288\u0005\u0010\u0000\u0000\u0288W\u0001\u0000"+
		"\u0000\u0000\u0289\u028a\u0005/\u0000\u0000\u028a\u028b\u0003V+\u0000"+
		"\u028bY\u0001\u0000\u0000\u0000\u028c\u029d\u0003b1\u0000\u028d\u029d"+
		"\u0003j5\u0000\u028e\u029d\u0003n7\u0000\u028f\u029d\u0003V+\u0000\u0290"+
		"\u029d\u0003p8\u0000\u0291\u029d\u0003r9\u0000\u0292\u029d\u0003t:\u0000"+
		"\u0293\u029d\u0003v;\u0000\u0294\u029d\u0003x<\u0000\u0295\u029d\u0003"+
		"z=\u0000\u0296\u029d\u0003|>\u0000\u0297\u029d\u0003l6\u0000\u0298\u029d"+
		"\u0003\\.\u0000\u0299\u029d\u0003^/\u0000\u029a\u029d\u0005\u0087\u0000"+
		"\u0000\u029b\u029d\u0005\u0088\u0000\u0000\u029c\u028c\u0001\u0000\u0000"+
		"\u0000\u029c\u028d\u0001\u0000\u0000\u0000\u029c\u028e\u0001\u0000\u0000"+
		"\u0000\u029c\u028f\u0001\u0000\u0000\u0000\u029c\u0290\u0001\u0000\u0000"+
		"\u0000\u029c\u0291\u0001\u0000\u0000\u0000\u029c\u0292\u0001\u0000\u0000"+
		"\u0000\u029c\u0293\u0001\u0000\u0000\u0000\u029c\u0294\u0001\u0000\u0000"+
		"\u0000\u029c\u0295\u0001\u0000\u0000\u0000\u029c\u0296\u0001\u0000\u0000"+
		"\u0000\u029c\u0297\u0001\u0000\u0000\u0000\u029c\u0298\u0001\u0000\u0000"+
		"\u0000\u029c\u0299\u0001\u0000\u0000\u0000\u029c\u029a\u0001\u0000\u0000"+
		"\u0000\u029c\u029b\u0001\u0000\u0000\u0000\u029d[\u0001\u0000\u0000\u0000"+
		"\u029e\u029f\u00050\u0000\u0000\u029f\u02a5\u0003\u0088D\u0000\u02a0\u02a1"+
		"\u0005#\u0000\u0000\u02a1\u02a2\u0005\u0016\u0000\u0000\u02a2\u02a3\u0003"+
		"8\u001c\u0000\u02a3\u02a4\u0005\u0017\u0000\u0000\u02a4\u02a6\u0001\u0000"+
		"\u0000\u0000\u02a5\u02a0\u0001\u0000\u0000\u0000\u02a5\u02a6\u0001\u0000"+
		"\u0000\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7\u02ab\u0003V+\u0000"+
		"\u02a8\u02aa\u0003^/\u0000\u02a9\u02a8\u0001\u0000\u0000\u0000\u02aa\u02ad"+
		"\u0001\u0000\u0000\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ab\u02ac"+
		"\u0001\u0000\u0000\u0000\u02ac]\u0001\u0000\u0000\u0000\u02ad\u02ab\u0001"+
		"\u0000\u0000\u0000\u02ae\u02b9\u00051\u0000\u0000\u02af\u02b1\u0003\u00c0"+
		"`\u0000\u02b0\u02af\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000"+
		"\u0000\u02b1\u02b2\u0001\u0000\u0000\u0000\u02b2\u02b3\u0005\u0016\u0000"+
		"\u0000\u02b3\u02b5\u00038\u001c\u0000\u02b4\u02b6\u0003\u0014\n\u0000"+
		"\u02b5\u02b4\u0001\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000\u0000\u0000"+
		"\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7\u02b8\u0005\u0017\u0000\u0000"+
		"\u02b8\u02ba\u0001\u0000\u0000\u0000\u02b9\u02b0\u0001\u0000\u0000\u0000"+
		"\u02b9\u02ba\u0001\u0000\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000"+
		"\u02bb\u02bf\u0003V+\u0000\u02bc\u02bd\u00051\u0000\u0000\u02bd\u02bf"+
		"\u0003V+\u0000\u02be\u02ae\u0001\u0000\u0000\u0000\u02be\u02bc\u0001\u0000"+
		"\u0000\u0000\u02bf_\u0001\u0000\u0000\u0000\u02c0\u02c1\u0003\u0088D\u0000"+
		"\u02c1\u02c2\u0005\u0002\u0000\u0000\u02c2a\u0001\u0000\u0000\u0000\u02c3"+
		"\u02c4\u00052\u0000\u0000\u02c4\u02c5\u0005\u0016\u0000\u0000\u02c5\u02c6"+
		"\u0003d2\u0000\u02c6\u02c7\u0005\u0017\u0000\u0000\u02c7\u02ca\u0003f"+
		"3\u0000\u02c8\u02c9\u00053\u0000\u0000\u02c9\u02cb\u0003h4\u0000\u02ca"+
		"\u02c8\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000\u02cb"+
		"c\u0001\u0000\u0000\u0000\u02cc\u02cd\u0003\u0088D\u0000\u02cde\u0001"+
		"\u0000\u0000\u0000\u02ce\u02cf\u0003Z-\u0000\u02cfg\u0001\u0000\u0000"+
		"\u0000\u02d0\u02d1\u0003Z-\u0000\u02d1i\u0001\u0000\u0000\u0000\u02d2"+
		"\u02d3\u00054\u0000\u0000\u02d3\u02d4\u0005\u0016\u0000\u0000\u02d4\u02d5"+
		"\u0003\u0088D\u0000\u02d5\u02d6\u0005\u0017\u0000\u0000\u02d6\u02d7\u0003"+
		"Z-\u0000\u02d7k\u0001\u0000\u0000\u0000\u02d8\u02db\u0003~?\u0000\u02d9"+
		"\u02db\u0003`0\u0000\u02da\u02d8\u0001\u0000\u0000\u0000\u02da\u02d9\u0001"+
		"\u0000\u0000\u0000\u02dbm\u0001\u0000\u0000\u0000\u02dc\u02dd\u0005\u001c"+
		"\u0000\u0000\u02dd\u02e0\u0005\u0016\u0000\u0000\u02de\u02e1\u0003l6\u0000"+
		"\u02df\u02e1\u0005\u0002\u0000\u0000\u02e0\u02de\u0001\u0000\u0000\u0000"+
		"\u02e0\u02df\u0001\u0000\u0000\u0000\u02e1\u02e4\u0001\u0000\u0000\u0000"+
		"\u02e2\u02e5\u0003`0\u0000\u02e3\u02e5\u0005\u0002\u0000\u0000\u02e4\u02e2"+
		"\u0001\u0000\u0000\u0000\u02e4\u02e3\u0001\u0000\u0000\u0000\u02e5\u02e7"+
		"\u0001\u0000\u0000\u0000\u02e6\u02e8\u0003\u0088D\u0000\u02e7\u02e6\u0001"+
		"\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000\u02e8\u02e9\u0001"+
		"\u0000\u0000\u0000\u02e9\u02ea\u0005\u0017\u0000\u0000\u02ea\u02eb\u0003"+
		"Z-\u0000\u02ebo\u0001\u0000\u0000\u0000\u02ec\u02ee\u00055\u0000\u0000"+
		"\u02ed\u02ef\u0005\u0083\u0000\u0000\u02ee\u02ed\u0001\u0000\u0000\u0000"+
		"\u02ee\u02ef\u0001\u0000\u0000\u0000\u02ef\u02f0\u0001\u0000\u0000\u0000"+
		"\u02f0\u02f1\u0003\u0096K\u0000\u02f1q\u0001\u0000\u0000\u0000\u02f2\u02f3"+
		"\u00056\u0000\u0000\u02f3\u02f4\u0003Z-\u0000\u02f4\u02f5\u00054\u0000"+
		"\u0000\u02f5\u02f6\u0005\u0016\u0000\u0000\u02f6\u02f7\u0003\u0088D\u0000"+
		"\u02f7\u02f8\u0005\u0017\u0000\u0000\u02f8\u02f9\u0005\u0002\u0000\u0000"+
		"\u02f9s\u0001\u0000\u0000\u0000\u02fa\u02fb\u0005x\u0000\u0000\u02fb\u02fc"+
		"\u0005\u0002\u0000\u0000\u02fcu\u0001\u0000\u0000\u0000\u02fd\u02fe\u0005"+
		"s\u0000\u0000\u02fe\u02ff\u0005\u0002\u0000\u0000\u02ffw\u0001\u0000\u0000"+
		"\u0000\u0300\u0302\u00057\u0000\u0000\u0301\u0303\u0003\u0088D\u0000\u0302"+
		"\u0301\u0001\u0000\u0000\u0000\u0302\u0303\u0001\u0000\u0000\u0000\u0303"+
		"\u0304\u0001\u0000\u0000\u0000\u0304\u0305\u0005\u0002\u0000\u0000\u0305"+
		"y\u0001\u0000\u0000\u0000\u0306\u0307\u00058\u0000\u0000\u0307\u0308\u0005"+
		"\u0002\u0000\u0000\u0308{\u0001\u0000\u0000\u0000\u0309\u030a\u00059\u0000"+
		"\u0000\u030a\u030b\u0003\u0094J\u0000\u030b\u030c\u0005\u0002\u0000\u0000"+
		"\u030c}\u0001\u0000\u0000\u0000\u030d\u030e\u0005:\u0000\u0000\u030e\u0315"+
		"\u0003\u0084B\u0000\u030f\u0315\u0003F#\u0000\u0310\u0311\u0005\u0016"+
		"\u0000\u0000\u0311\u0312\u0003\u0082A\u0000\u0312\u0313\u0005\u0017\u0000"+
		"\u0000\u0313\u0315\u0001\u0000\u0000\u0000\u0314\u030d\u0001\u0000\u0000"+
		"\u0000\u0314\u030f\u0001\u0000\u0000\u0000\u0314\u0310\u0001\u0000\u0000"+
		"\u0000\u0315\u0318\u0001\u0000\u0000\u0000\u0316\u0317\u0005\t\u0000\u0000"+
		"\u0317\u0319\u0003\u0088D\u0000\u0318\u0316\u0001\u0000\u0000\u0000\u0318"+
		"\u0319\u0001\u0000\u0000\u0000\u0319\u031a\u0001\u0000\u0000\u0000\u031a"+
		"\u031b\u0005\u0002\u0000\u0000\u031b\u007f\u0001\u0000\u0000\u0000\u031c"+
		"\u031d\u0003H$\u0000\u031d\u031e\u0005t\u0000\u0000\u031e\u031f\u0003"+
		"\u00c0`\u0000\u031f\u0320\u0005\t\u0000\u0000\u0320\u0321\u0003\u0088"+
		"D\u0000\u0321\u0322\u0005\u0002\u0000\u0000\u0322\u0081\u0001\u0000\u0000"+
		"\u0000\u0323\u0325\u0003F#\u0000\u0324\u0323\u0001\u0000\u0000\u0000\u0324"+
		"\u0325\u0001\u0000\u0000\u0000\u0325\u032c\u0001\u0000\u0000\u0000\u0326"+
		"\u0328\u0005\u000f\u0000\u0000\u0327\u0329\u0003F#\u0000\u0328\u0327\u0001"+
		"\u0000\u0000\u0000\u0328\u0329\u0001\u0000\u0000\u0000\u0329\u032b\u0001"+
		"\u0000\u0000\u0000\u032a\u0326\u0001\u0000\u0000\u0000\u032b\u032e\u0001"+
		"\u0000\u0000\u0000\u032c\u032a\u0001\u0000\u0000\u0000\u032c\u032d\u0001"+
		"\u0000\u0000\u0000\u032d\u0083\u0001\u0000\u0000\u0000\u032e\u032c\u0001"+
		"\u0000\u0000\u0000\u032f\u0336\u0005\u0016\u0000\u0000\u0330\u0332\u0003"+
		"\u00c0`\u0000\u0331\u0330\u0001\u0000\u0000\u0000\u0331\u0332\u0001\u0000"+
		"\u0000\u0000\u0332\u0333\u0001\u0000\u0000\u0000\u0333\u0335\u0005\u000f"+
		"\u0000\u0000\u0334\u0331\u0001\u0000\u0000\u0000\u0335\u0338\u0001\u0000"+
		"\u0000\u0000\u0336\u0334\u0001\u0000\u0000\u0000\u0336\u0337\u0001\u0000"+
		"\u0000\u0000\u0337\u033a\u0001\u0000\u0000\u0000\u0338\u0336\u0001\u0000"+
		"\u0000\u0000\u0339\u033b\u0003\u00c0`\u0000\u033a\u0339\u0001\u0000\u0000"+
		"\u0000\u033a\u033b\u0001\u0000\u0000\u0000\u033b\u033c\u0001\u0000\u0000"+
		"\u0000\u033c\u033d\u0005\u0017\u0000\u0000\u033d\u0085\u0001\u0000\u0000"+
		"\u0000\u033e\u033f\u0007\u0007\u0000\u0000\u033f\u0087\u0001\u0000\u0000"+
		"\u0000\u0340\u0341\u0006D\uffff\uffff\u0000\u0341\u0342\u0005&\u0000\u0000"+
		"\u0342\u0347\u0003\u0088D\u0000\u0343\u0344\u0005\u000f\u0000\u0000\u0344"+
		"\u0346\u0003\u0088D\u0000\u0345\u0343\u0001\u0000\u0000\u0000\u0346\u0349"+
		"\u0001\u0000\u0000\u0000\u0347\u0345\u0001\u0000\u0000\u0000\u0347\u0348"+
		"\u0001\u0000\u0000\u0000\u0348\u034a\u0001\u0000\u0000\u0000\u0349\u0347"+
		"\u0001\u0000\u0000\u0000\u034a\u034b\u0005\'\u0000\u0000\u034b\u0365\u0001"+
		"\u0000\u0000\u0000\u034c\u034d\u0005|\u0000\u0000\u034d\u0365\u0003\u001a"+
		"\r\u0000\u034e\u034f\u0005\u0080\u0000\u0000\u034f\u0350\u0005\u0016\u0000"+
		"\u0000\u0350\u0351\u0003H$\u0000\u0351\u0352\u0005\u0017\u0000\u0000\u0352"+
		"\u0365\u0001\u0000\u0000\u0000\u0353\u0354\u0007\b\u0000\u0000\u0354\u0365"+
		"\u0003\u0088D\u0017\u0355\u0356\u0005C\u0000\u0000\u0356\u0365\u0003H"+
		"$\u0000\u0357\u0358\u0005\u0016\u0000\u0000\u0358\u0359\u0003\u0088D\u0000"+
		"\u0359\u035a\u0005\u0017\u0000\u0000\u035a\u0365\u0001\u0000\u0000\u0000"+
		"\u035b\u035c\u0007\t\u0000\u0000\u035c\u0365\u0003\u0088D\u0012\u035d"+
		"\u035e\u0007\n\u0000\u0000\u035e\u0365\u0003\u0088D\u0011\u035f\u0360"+
		"\u0005@\u0000\u0000\u0360\u0365\u0003\u0088D\u0010\u0361\u0362\u0005\u0004"+
		"\u0000\u0000\u0362\u0365\u0003\u0088D\u000f\u0363\u0365\u0003\u008aE\u0000"+
		"\u0364\u0340\u0001\u0000\u0000\u0000\u0364\u034c\u0001\u0000\u0000\u0000"+
		"\u0364\u034e\u0001\u0000\u0000\u0000\u0364\u0353\u0001\u0000\u0000\u0000"+
		"\u0364\u0355\u0001\u0000\u0000\u0000\u0364\u0357\u0001\u0000\u0000\u0000"+
		"\u0364\u035b\u0001\u0000\u0000\u0000\u0364\u035d\u0001\u0000\u0000\u0000"+
		"\u0364\u035f\u0001\u0000\u0000\u0000\u0364\u0361\u0001\u0000\u0000\u0000"+
		"\u0364\u0363\u0001\u0000\u0000\u0000\u0365\u03c1\u0001\u0000\u0000\u0000"+
		"\u0366\u0367\n\u000e\u0000\u0000\u0367\u0368\u0005F\u0000\u0000\u0368"+
		"\u03c0\u0003\u0088D\u000f\u0369\u036a\n\r\u0000\u0000\u036a\u036b\u0007"+
		"\u000b\u0000\u0000\u036b\u03c0\u0003\u0088D\u000e\u036c\u036d\n\f\u0000"+
		"\u0000\u036d\u036e\u0007\t\u0000\u0000\u036e\u03c0\u0003\u0088D\r\u036f"+
		"\u0370\n\u000b\u0000\u0000\u0370\u0371\u0007\f\u0000\u0000\u0371\u03c0"+
		"\u0003\u0088D\f\u0372\u0373\n\n\u0000\u0000\u0373\u0374\u0005L\u0000\u0000"+
		"\u0374\u03c0\u0003\u0088D\u000b\u0375\u0376\n\t\u0000\u0000\u0376\u0377"+
		"\u0005\u0003\u0000\u0000\u0377\u03c0\u0003\u0088D\n\u0378\u0379\n\b\u0000"+
		"\u0000\u0379\u037a\u0005M\u0000\u0000\u037a\u03c0\u0003\u0088D\t\u037b"+
		"\u037c\n\u0007\u0000\u0000\u037c\u037d\u0007\r\u0000\u0000\u037d\u03c0"+
		"\u0003\u0088D\b\u037e\u037f\n\u0006\u0000\u0000\u037f\u0380\u0007\u000e"+
		"\u0000\u0000\u0380\u03c0\u0003\u0088D\u0007\u0381\u0382\n\u0005\u0000"+
		"\u0000\u0382\u0383\u0005P\u0000\u0000\u0383\u03c0\u0003\u0088D\u0006\u0384"+
		"\u0385\n\u0004\u0000\u0000\u0385\u0386\u0005Q\u0000\u0000\u0386\u03c0"+
		"\u0003\u0088D\u0005\u0387\u0388\n\u0003\u0000\u0000\u0388\u0389\u0005"+
		"R\u0000\u0000\u0389\u038a\u0003\u0088D\u0000\u038a\u038b\u0005\u0019\u0000"+
		"\u0000\u038b\u038c\u0003\u0088D\u0004\u038c\u03c0\u0001\u0000\u0000\u0000"+
		"\u038d\u038e\n\u0002\u0000\u0000\u038e\u038f\u0007\u000f\u0000\u0000\u038f"+
		"\u03c0\u0003\u0088D\u0003\u0390\u0391\n\u001e\u0000\u0000\u0391\u0393"+
		"\u0005&\u0000\u0000\u0392\u0394\u0003\u0088D\u0000\u0393\u0392\u0001\u0000"+
		"\u0000\u0000\u0393\u0394\u0001\u0000\u0000\u0000\u0394\u0395\u0001\u0000"+
		"\u0000\u0000\u0395\u03c0\u0005\'\u0000\u0000\u0396\u0397\n\u001c\u0000"+
		"\u0000\u0397\u0399\u0005&\u0000\u0000\u0398\u039a\u0003\u0088D\u0000\u0399"+
		"\u0398\u0001\u0000\u0000\u0000\u0399\u039a\u0001\u0000\u0000\u0000\u039a"+
		"\u039b\u0001\u0000\u0000\u0000\u039b\u039d\u0005\u0019\u0000\u0000\u039c"+
		"\u039e\u0003\u0088D\u0000\u039d\u039c\u0001\u0000\u0000\u0000\u039d\u039e"+
		"\u0001\u0000\u0000\u0000\u039e\u039f\u0001\u0000\u0000\u0000\u039f\u03c0"+
		"\u0005\'\u0000\u0000\u03a0\u03a1\n\u001b\u0000\u0000\u03a1\u03a4\u0005"+
		")\u0000\u0000\u03a2\u03a5\u0003\u00c0`\u0000\u03a3\u03a5\u0005(\u0000"+
		"\u0000\u03a4\u03a2\u0001\u0000\u0000\u0000\u03a4\u03a3\u0001\u0000\u0000"+
		"\u0000\u03a5\u03c0\u0001\u0000\u0000\u0000\u03a6\u03a7\n\u001a\u0000\u0000"+
		"\u03a7\u03b5\u0005\u000e\u0000\u0000\u03a8\u03a9\u0003\u00c0`\u0000\u03a9"+
		"\u03aa\u0005\u0019\u0000\u0000\u03aa\u03b2\u0003\u0088D\u0000\u03ab\u03ac"+
		"\u0005\u000f\u0000\u0000\u03ac\u03ad\u0003\u00c0`\u0000\u03ad\u03ae\u0005"+
		"\u0019\u0000\u0000\u03ae\u03af\u0003\u0088D\u0000\u03af\u03b1\u0001\u0000"+
		"\u0000\u0000\u03b0\u03ab\u0001\u0000\u0000\u0000\u03b1\u03b4\u0001\u0000"+
		"\u0000\u0000\u03b2\u03b0\u0001\u0000\u0000\u0000\u03b2\u03b3\u0001\u0000"+
		"\u0000\u0000\u03b3\u03b6\u0001\u0000\u0000\u0000\u03b4\u03b2\u0001\u0000"+
		"\u0000\u0000\u03b5\u03a8\u0001\u0000\u0000\u0000\u03b5\u03b6\u0001\u0000"+
		"\u0000\u0000\u03b6\u03b7\u0001\u0000\u0000\u0000\u03b7\u03c0\u0005\u0010"+
		"\u0000\u0000\u03b8\u03b9\n\u0016\u0000\u0000\u03b9\u03c0\u0007\u0010\u0000"+
		"\u0000\u03ba\u03bb\n\u0014\u0000\u0000\u03bb\u03bc\u0005\u0016\u0000\u0000"+
		"\u03bc\u03bd\u0003\u0092I\u0000\u03bd\u03be\u0005\u0017\u0000\u0000\u03be"+
		"\u03c0\u0001\u0000\u0000\u0000\u03bf\u0366\u0001\u0000\u0000\u0000\u03bf"+
		"\u0369\u0001\u0000\u0000\u0000\u03bf\u036c\u0001\u0000\u0000\u0000\u03bf"+
		"\u036f\u0001\u0000\u0000\u0000\u03bf\u0372\u0001\u0000\u0000\u0000\u03bf"+
		"\u0375\u0001\u0000\u0000\u0000\u03bf\u0378\u0001\u0000\u0000\u0000\u03bf"+
		"\u037b\u0001\u0000\u0000\u0000\u03bf\u037e\u0001\u0000\u0000\u0000\u03bf"+
		"\u0381\u0001\u0000\u0000\u0000\u03bf\u0384\u0001\u0000\u0000\u0000\u03bf"+
		"\u0387\u0001\u0000\u0000\u0000\u03bf\u038d\u0001\u0000\u0000\u0000\u03bf"+
		"\u0390\u0001\u0000\u0000\u0000\u03bf\u0396\u0001\u0000\u0000\u0000\u03bf"+
		"\u03a0\u0001\u0000\u0000\u0000\u03bf\u03a6\u0001\u0000\u0000\u0000\u03bf"+
		"\u03b8\u0001\u0000\u0000\u0000\u03bf\u03ba\u0001\u0000\u0000\u0000\u03c0"+
		"\u03c3\u0001\u0000\u0000\u0000\u03c1\u03bf\u0001\u0000\u0000\u0000\u03c1"+
		"\u03c2\u0001\u0000\u0000\u0000\u03c2\u0089\u0001\u0000\u0000\u0000\u03c3"+
		"\u03c1\u0001\u0000\u0000\u0000\u03c4\u03d5\u0005l\u0000\u0000\u03c5\u03d5"+
		"\u0003\u00be_\u0000\u03c6\u03d5\u0005p\u0000\u0000\u03c7\u03d5\u0005\u0083"+
		"\u0000\u0000\u03c8\u03cb\u0003\u00c0`\u0000\u03c9\u03ca\u0005&\u0000\u0000"+
		"\u03ca\u03cc\u0005\'\u0000\u0000\u03cb\u03c9\u0001\u0000\u0000\u0000\u03cb"+
		"\u03cc\u0001\u0000\u0000\u0000\u03cc\u03d5\u0001\u0000\u0000\u0000\u03cd"+
		"\u03d5\u0005\u0080\u0000\u0000\u03ce\u03d5\u0003\u00ba]\u0000\u03cf\u03d2"+
		"\u0003\u00bc^\u0000\u03d0\u03d1\u0005&\u0000\u0000\u03d1\u03d3\u0005\'"+
		"\u0000\u0000\u03d2\u03d0\u0001\u0000\u0000\u0000\u03d2\u03d3\u0001\u0000"+
		"\u0000\u0000\u03d3\u03d5\u0001\u0000\u0000\u0000\u03d4\u03c4\u0001\u0000"+
		"\u0000\u0000\u03d4\u03c5\u0001\u0000\u0000\u0000\u03d4\u03c6\u0001\u0000"+
		"\u0000\u0000\u03d4\u03c7\u0001\u0000\u0000\u0000\u03d4\u03c8\u0001\u0000"+
		"\u0000\u0000\u03d4\u03cd\u0001\u0000\u0000\u0000\u03d4\u03ce\u0001\u0000"+
		"\u0000\u0000\u03d4\u03cf\u0001\u0000\u0000\u0000\u03d5\u008b\u0001\u0000"+
		"\u0000\u0000\u03d6\u03db\u0003\u0088D\u0000\u03d7\u03d8\u0005\u000f\u0000"+
		"\u0000\u03d8\u03da\u0003\u0088D\u0000\u03d9\u03d7\u0001\u0000\u0000\u0000"+
		"\u03da\u03dd\u0001\u0000\u0000\u0000\u03db\u03d9\u0001\u0000\u0000\u0000"+
		"\u03db\u03dc\u0001\u0000\u0000\u0000\u03dc\u008d\u0001\u0000\u0000\u0000"+
		"\u03dd\u03db\u0001\u0000\u0000\u0000\u03de\u03e3\u0003\u0090H\u0000\u03df"+
		"\u03e0\u0005\u000f\u0000\u0000\u03e0\u03e2\u0003\u0090H\u0000\u03e1\u03df"+
		"\u0001\u0000\u0000\u0000\u03e2\u03e5\u0001\u0000\u0000\u0000\u03e3\u03e1"+
		"\u0001\u0000\u0000\u0000\u03e3\u03e4\u0001\u0000\u0000\u0000\u03e4\u03e7"+
		"\u0001\u0000\u0000\u0000\u03e5\u03e3\u0001\u0000\u0000\u0000\u03e6\u03e8"+
		"\u0005\u000f\u0000\u0000\u03e7\u03e6\u0001\u0000\u0000\u0000\u03e7\u03e8"+
		"\u0001\u0000\u0000\u0000\u03e8\u008f\u0001\u0000\u0000\u0000\u03e9\u03ea"+
		"\u0003\u00c0`\u0000\u03ea\u03eb\u0005\u0019\u0000\u0000\u03eb\u03ec\u0003"+
		"\u0088D\u0000\u03ec\u0091\u0001\u0000\u0000\u0000\u03ed\u03ef\u0005\u000e"+
		"\u0000\u0000\u03ee\u03f0\u0003\u008eG\u0000\u03ef\u03ee\u0001\u0000\u0000"+
		"\u0000\u03ef\u03f0\u0001\u0000\u0000\u0000\u03f0\u03f1\u0001\u0000\u0000"+
		"\u0000\u03f1\u03f6\u0005\u0010\u0000\u0000\u03f2\u03f4\u0003\u008cF\u0000"+
		"\u03f3\u03f2\u0001\u0000\u0000\u0000\u03f3\u03f4\u0001\u0000\u0000\u0000"+
		"\u03f4\u03f6\u0001\u0000\u0000\u0000\u03f5\u03ed\u0001\u0000\u0000\u0000"+
		"\u03f5\u03f3\u0001\u0000\u0000\u0000\u03f6\u0093\u0001\u0000\u0000\u0000"+
		"\u03f7\u03f8\u0003\u0088D\u0000\u03f8\u03f9\u0005\u0016\u0000\u0000\u03f9"+
		"\u03fa\u0003\u0092I\u0000\u03fa\u03fb\u0005\u0017\u0000\u0000\u03fb\u0095"+
		"\u0001\u0000\u0000\u0000\u03fc\u0400\u0005\u000e\u0000\u0000\u03fd\u03ff"+
		"\u0003\u0098L\u0000\u03fe\u03fd\u0001\u0000\u0000\u0000\u03ff\u0402\u0001"+
		"\u0000\u0000\u0000\u0400\u03fe\u0001\u0000\u0000\u0000\u0400\u0401\u0001"+
		"\u0000\u0000\u0000\u0401\u0403\u0001\u0000\u0000\u0000\u0402\u0400\u0001"+
		"\u0000\u0000\u0000\u0403\u0404\u0005\u0010\u0000\u0000\u0404\u0097\u0001"+
		"\u0000\u0000\u0000\u0405\u0417\u0003\u00c0`\u0000\u0406\u0417\u0003\u0096"+
		"K\u0000\u0407\u0417\u0003\u009aM\u0000\u0408\u0417\u0003\u009eO\u0000"+
		"\u0409\u0417\u0003\u00a0P\u0000\u040a\u0417\u0003\u00a6S\u0000\u040b\u0417"+
		"\u0003\u00a8T\u0000\u040c\u0417\u0003\u00aaU\u0000\u040d\u0417\u0003\u00ae"+
		"W\u0000\u040e\u0417\u0003\u00b2Y\u0000\u040f\u0417\u0003\u00b4Z\u0000"+
		"\u0410\u0417\u0005s\u0000\u0000\u0411\u0417\u0005x\u0000\u0000\u0412\u0417"+
		"\u0003\u00b8\\\u0000\u0413\u0417\u0003\u00be_\u0000\u0414\u0417\u0005"+
		"\u0083\u0000\u0000\u0415\u0417\u0005p\u0000\u0000\u0416\u0405\u0001\u0000"+
		"\u0000\u0000\u0416\u0406\u0001\u0000\u0000\u0000\u0416\u0407\u0001\u0000"+
		"\u0000\u0000\u0416\u0408\u0001\u0000\u0000\u0000\u0416\u0409\u0001\u0000"+
		"\u0000\u0000\u0416\u040a\u0001\u0000\u0000\u0000\u0416\u040b\u0001\u0000"+
		"\u0000\u0000\u0416\u040c\u0001\u0000\u0000\u0000\u0416\u040d\u0001\u0000"+
		"\u0000\u0000\u0416\u040e\u0001\u0000\u0000\u0000\u0416\u040f\u0001\u0000"+
		"\u0000\u0000\u0416\u0410\u0001\u0000\u0000\u0000\u0416\u0411\u0001\u0000"+
		"\u0000\u0000\u0416\u0412\u0001\u0000\u0000\u0000\u0416\u0413\u0001\u0000"+
		"\u0000\u0000\u0416\u0414\u0001\u0000\u0000\u0000\u0416\u0415\u0001\u0000"+
		"\u0000\u0000\u0417\u0099\u0001\u0000\u0000\u0000\u0418\u041b\u0003\u009c"+
		"N\u0000\u0419\u041b\u0003\u00b6[\u0000\u041a\u0418\u0001\u0000\u0000\u0000"+
		"\u041a\u0419\u0001\u0000\u0000\u0000\u041b\u009b\u0001\u0000\u0000\u0000"+
		"\u041c\u0421\u00057\u0000\u0000\u041d\u0421\u0005(\u0000\u0000\u041e\u0421"+
		"\u0005=\u0000\u0000\u041f\u0421\u0003\u00c0`\u0000\u0420\u041c\u0001\u0000"+
		"\u0000\u0000\u0420\u041d\u0001\u0000\u0000\u0000\u0420\u041e\u0001\u0000"+
		"\u0000\u0000\u0420\u041f\u0001\u0000\u0000\u0000\u0421\u042e\u0001\u0000"+
		"\u0000\u0000\u0422\u0424\u0005\u0016\u0000\u0000\u0423\u0425\u0003\u009a"+
		"M\u0000\u0424\u0423\u0001\u0000\u0000\u0000\u0424\u0425\u0001\u0000\u0000"+
		"\u0000\u0425\u042a\u0001\u0000\u0000\u0000\u0426\u0427\u0005\u000f\u0000"+
		"\u0000\u0427\u0429\u0003\u009aM\u0000\u0428\u0426\u0001\u0000\u0000\u0000"+
		"\u0429\u042c\u0001\u0000\u0000\u0000\u042a\u0428\u0001\u0000\u0000\u0000"+
		"\u042a\u042b\u0001\u0000\u0000\u0000\u042b\u042d\u0001\u0000\u0000\u0000"+
		"\u042c\u042a\u0001\u0000\u0000\u0000\u042d\u042f\u0005\u0017\u0000\u0000"+
		"\u042e\u0422\u0001\u0000\u0000\u0000\u042e\u042f\u0001\u0000\u0000\u0000"+
		"\u042f\u009d\u0001\u0000\u0000\u0000\u0430\u0431\u0005^\u0000\u0000\u0431"+
		"\u0434\u0003\u00a2Q\u0000\u0432\u0433\u0005_\u0000\u0000\u0433\u0435\u0003"+
		"\u009aM\u0000\u0434\u0432\u0001\u0000\u0000\u0000\u0434\u0435\u0001\u0000"+
		"\u0000\u0000\u0435\u009f\u0001\u0000\u0000\u0000\u0436\u0437\u0003\u00a2"+
		"Q\u0000\u0437\u0438\u0005_\u0000\u0000\u0438\u0439\u0003\u009aM\u0000"+
		"\u0439\u00a1\u0001\u0000\u0000\u0000\u043a\u0440\u0003\u00c0`\u0000\u043b"+
		"\u043c\u0005\u0016\u0000\u0000\u043c\u043d\u0003\u00a4R\u0000\u043d\u043e"+
		"\u0005\u0017\u0000\u0000\u043e\u0440\u0001\u0000\u0000\u0000\u043f\u043a"+
		"\u0001\u0000\u0000\u0000\u043f\u043b\u0001\u0000\u0000\u0000\u0440\u00a3"+
		"\u0001\u0000\u0000\u0000\u0441\u0446\u0003\u00c0`\u0000\u0442\u0443\u0005"+
		"\u000f\u0000\u0000\u0443\u0445\u0003\u00c0`\u0000\u0444\u0442\u0001\u0000"+
		"\u0000\u0000\u0445\u0448\u0001\u0000\u0000\u0000\u0446\u0444\u0001\u0000"+
		"\u0000\u0000\u0446\u0447\u0001\u0000\u0000\u0000\u0447\u00a5\u0001\u0000"+
		"\u0000\u0000\u0448\u0446\u0001\u0000\u0000\u0000\u0449\u044a\u0005`\u0000"+
		"\u0000\u044a\u044b\u0003\u00c0`\u0000\u044b\u00a7\u0001\u0000\u0000\u0000"+
		"\u044c\u044d\u0003\u00c0`\u0000\u044d\u044e\u0005\u0019\u0000\u0000\u044e"+
		"\u00a9\u0001\u0000\u0000\u0000\u044f\u0450\u0005a\u0000\u0000\u0450\u0454"+
		"\u0003\u009aM\u0000\u0451\u0453\u0003\u00acV\u0000\u0452\u0451\u0001\u0000"+
		"\u0000\u0000\u0453\u0456\u0001\u0000\u0000\u0000\u0454\u0452\u0001\u0000"+
		"\u0000\u0000\u0454\u0455\u0001\u0000\u0000\u0000\u0455\u00ab\u0001\u0000"+
		"\u0000\u0000\u0456\u0454\u0001\u0000\u0000\u0000\u0457\u0458\u0005b\u0000"+
		"\u0000\u0458\u0459\u0003\u00b6[\u0000\u0459\u045a\u0003\u0096K\u0000\u045a"+
		"\u045e\u0001\u0000\u0000\u0000\u045b\u045c\u0005c\u0000\u0000\u045c\u045e"+
		"\u0003\u0096K\u0000\u045d\u0457\u0001\u0000\u0000\u0000\u045d\u045b\u0001"+
		"\u0000\u0000\u0000\u045e\u00ad\u0001\u0000\u0000\u0000\u045f\u0460\u0005"+
		" \u0000\u0000\u0460\u0461\u0003\u00c0`\u0000\u0461\u0463\u0005\u0016\u0000"+
		"\u0000\u0462\u0464\u0003\u00a4R\u0000\u0463\u0462\u0001\u0000\u0000\u0000"+
		"\u0463\u0464\u0001\u0000\u0000\u0000\u0464\u0465\u0001\u0000\u0000\u0000"+
		"\u0465\u0467\u0005\u0017\u0000\u0000\u0466\u0468\u0003\u00b0X\u0000\u0467"+
		"\u0466\u0001\u0000\u0000\u0000\u0467\u0468\u0001\u0000\u0000\u0000\u0468"+
		"\u0469\u0001\u0000\u0000\u0000\u0469\u046a\u0003\u0096K\u0000\u046a\u00af"+
		"\u0001\u0000\u0000\u0000\u046b\u046c\u0005d\u0000\u0000\u046c\u046d\u0003"+
		"\u00a4R\u0000\u046d\u00b1\u0001\u0000\u0000\u0000\u046e\u0471\u0005\u001c"+
		"\u0000\u0000\u046f\u0472\u0003\u0096K\u0000\u0470\u0472\u0003\u009aM\u0000"+
		"\u0471\u046f\u0001\u0000\u0000\u0000\u0471\u0470\u0001\u0000\u0000\u0000"+
		"\u0472\u0473\u0001\u0000\u0000\u0000\u0473\u0476\u0003\u009aM\u0000\u0474"+
		"\u0477\u0003\u0096K\u0000\u0475\u0477\u0003\u009aM\u0000\u0476\u0474\u0001"+
		"\u0000\u0000\u0000\u0476\u0475\u0001\u0000\u0000\u0000\u0477\u0478\u0001"+
		"\u0000\u0000\u0000\u0478\u0479\u0003\u0096K\u0000\u0479\u00b3\u0001\u0000"+
		"\u0000\u0000\u047a\u047b\u00052\u0000\u0000\u047b\u047c\u0003\u009aM\u0000"+
		"\u047c\u047d\u0003\u0096K\u0000\u047d\u00b5\u0001\u0000\u0000\u0000\u047e"+
		"\u047f\u0007\u0011\u0000\u0000\u047f\u00b7\u0001\u0000\u0000\u0000\u0480"+
		"\u0481\u00055\u0000\u0000\u0481\u0482\u0003\u00c0`\u0000\u0482\u0483\u0003"+
		"\u0096K\u0000\u0483\u00b9\u0001\u0000\u0000\u0000\u0484\u0486\u0005\u0016"+
		"\u0000\u0000\u0485\u0487\u0003\u0088D\u0000\u0486\u0485\u0001\u0000\u0000"+
		"\u0000\u0486\u0487\u0001\u0000\u0000\u0000\u0487\u048e\u0001\u0000\u0000"+
		"\u0000\u0488\u048a\u0005\u000f\u0000\u0000\u0489\u048b\u0003\u0088D\u0000"+
		"\u048a\u0489\u0001\u0000\u0000\u0000\u048a\u048b\u0001\u0000\u0000\u0000"+
		"\u048b\u048d\u0001\u0000\u0000\u0000\u048c\u0488\u0001\u0000\u0000\u0000"+
		"\u048d\u0490\u0001\u0000\u0000\u0000\u048e\u048c\u0001\u0000\u0000\u0000"+
		"\u048e\u048f\u0001\u0000\u0000\u0000\u048f\u0491\u0001\u0000\u0000\u0000"+
		"\u0490\u048e\u0001\u0000\u0000\u0000\u0491\u049f\u0005\u0017\u0000\u0000"+
		"\u0492\u049b\u0005&\u0000\u0000\u0493\u0498\u0003\u0088D\u0000\u0494\u0495"+
		"\u0005\u000f\u0000\u0000\u0495\u0497\u0003\u0088D\u0000\u0496\u0494\u0001"+
		"\u0000\u0000\u0000\u0497\u049a\u0001\u0000\u0000\u0000\u0498\u0496\u0001"+
		"\u0000\u0000\u0000\u0498\u0499\u0001\u0000\u0000\u0000\u0499\u049c\u0001"+
		"\u0000\u0000\u0000\u049a\u0498\u0001\u0000\u0000\u0000\u049b\u0493\u0001"+
		"\u0000\u0000\u0000\u049b\u049c\u0001\u0000\u0000\u0000\u049c\u049d\u0001"+
		"\u0000\u0000\u0000\u049d\u049f\u0005\'\u0000\u0000\u049e\u0484\u0001\u0000"+
		"\u0000\u0000\u049e\u0492\u0001\u0000\u0000\u0000\u049f\u00bb\u0001\u0000"+
		"\u0000\u0000\u04a0\u04a3\u0003\u0086C\u0000\u04a1\u04a3\u0003J%\u0000"+
		"\u04a2\u04a0\u0001\u0000\u0000\u0000\u04a2\u04a1\u0001\u0000\u0000\u0000"+
		"\u04a3\u00bd\u0001\u0000\u0000\u0000\u04a4\u04a6\u0007\u0012\u0000\u0000"+
		"\u04a5\u04a7\u0005o\u0000\u0000\u04a6\u04a5\u0001\u0000\u0000\u0000\u04a6"+
		"\u04a7\u0001\u0000\u0000\u0000\u04a7\u00bf\u0001\u0000\u0000\u0000\u04a8"+
		"\u04b2\u0007\u0013\u0000\u0000\u04a9\u04ae\u0005\u0082\u0000\u0000\u04aa"+
		"\u04ab\u0005\r\u0000\u0000\u04ab\u04ad\u0005\u0082\u0000\u0000\u04ac\u04aa"+
		"\u0001\u0000\u0000\u0000\u04ad\u04b0\u0001\u0000\u0000\u0000\u04ae\u04ac"+
		"\u0001\u0000\u0000\u0000\u04ae\u04af\u0001\u0000\u0000\u0000\u04af\u04b2"+
		"\u0001\u0000\u0000\u0000\u04b0\u04ae\u0001\u0000\u0000\u0000\u04b1\u04a8"+
		"\u0001\u0000\u0000\u0000\u04b1\u04a9\u0001\u0000\u0000\u0000\u04b2\u00c1"+
		"\u0001\u0000\u0000\u0000\u008b\u00c3\u00cd\u00cf\u00df\u00e3\u00e8\u00ef"+
		"\u00f5\u00fb\u00ff\u010b\u0113\u0118\u011b\u011e\u0121\u012b\u012e\u0134"+
		"\u013b\u013f\u0145\u0154\u0159\u015d\u0167\u016d\u0173\u017c\u018a\u018d"+
		"\u0199\u01a0\u01a3\u01a6\u01aa\u01af\u01b3\u01c4\u01c6\u01ca\u01d0\u01da"+
		"\u01e0\u01eb\u01ee\u01f8\u01fb\u0201\u0204\u020c\u020f\u0215\u0218\u0220"+
		"\u0223\u0229\u022d\u0238\u023d\u0242\u024a\u0251\u025c\u025e\u0263\u0268"+
		"\u026d\u026f\u0277\u0282\u0284\u029c\u02a5\u02ab\u02b0\u02b5\u02b9\u02be"+
		"\u02ca\u02da\u02e0\u02e4\u02e7\u02ee\u0302\u0314\u0318\u0324\u0328\u032c"+
		"\u0331\u0336\u033a\u0347\u0364\u0393\u0399\u039d\u03a4\u03b2\u03b5\u03bf"+
		"\u03c1\u03cb\u03d2\u03d4\u03db\u03e3\u03e7\u03ef\u03f3\u03f5\u0400\u0416"+
		"\u041a\u0420\u0424\u042a\u042e\u0434\u043f\u0446\u0454\u045d\u0463\u0467"+
		"\u0471\u0476\u0486\u048a\u048e\u0498\u049b\u049e\u04a2\u04a6\u04ae\u04b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}