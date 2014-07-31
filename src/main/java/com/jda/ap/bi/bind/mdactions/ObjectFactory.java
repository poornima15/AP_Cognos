
package com.jda.ap.bi.bind.mdactions;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jda.ap.bi.bind.mdactions package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _VerifyInputParamsExternalizeQuerySubjects_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "externalizeQuerySubjects");
    private final static QName _VerifyInputParamsDeleteProperty_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "deleteProperty");
    private final static QName _VerifyInputParamsVerifyCreateID_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "verifyCreateID");
    private final static QName _VerifyInputParamsApplyLocales_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "applyLocales");
    private final static QName _VerifyInputParamsTemporaryRetentionValue_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "temporaryRetentionValue");
    private final static QName _VerifyInputParamsVerifyImportTranslationsID_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "verifyImportTranslationsID");
    private final static QName _VerifyInputParamsSimpleProperty_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "simpleProperty");
    private final static QName _VerifyInputParamsImportTranslationsRootObject_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "importTranslationsRootObject");
    private final static QName _VerifyInputParamsVerifyDeleteID_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "verifyDeleteID");
    private final static QName _VerifyInputParamsNewSimpleValue_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "newSimpleValue");
    private final static QName _VerifyInputParamsObjectType_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "objectType");
    private final static QName _VerifyInputParamsPermanentRetentionValue_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "permanentRetentionValue");
    private final static QName _VerifyInputParamsVerifyMoveID_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "verifyMoveID");
    private final static QName _VerifyInputParamsMoveObject_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "moveObject");
    private final static QName _VerifyInputParamsDeleteObject_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "deleteObject");
    private final static QName _VerifyInputParamsVerifyPublishID_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "verifyPublishID");
    private final static QName _VerifyInputParamsKeyLocale_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "keyLocale");
    private final static QName _VerifyInputParamsVerifyModifyID_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "verifyModifyID");
    private final static QName _ReportObject_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "reportObject");
    private final static QName _ExecutionReportDetailLevel_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "executionReportDetailLevel");
    private final static QName _SchemaPath_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "schemaPath");
    private final static QName _ConformedDimensionCandidate_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "conformedDimensionCandidate");
    private final static QName _Object_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "object");
    private final static QName _GatewayURI_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "gatewayURI");
    private final static QName _IncludeRule_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "includeRule");
    private final static QName _Shortcut_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "shortcut");
    private final static QName _ExternalizeReport_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "externalizeReport");
    private final static QName _CrnDataSourceConnectionCubePassword_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "crnDataSourceConnectionCubePassword");
    private final static QName _DataSource_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "dataSource");
    private final static QName _ImportSourceSpecDataSource_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "importSourceSpecDataSource");
    private final static QName _TargetPackageName_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "targetPackageName");
    private final static QName _JoinOptionProcessExternalJoins_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "joinOptionProcessExternalJoins");
    private final static QName _JoinOptionProcessOuterJoinOption_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "joinOptionProcessOuterJoinOption");
    private final static QName _MaximumRowsToBeRetrieved_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "maximumRowsToBeRetrieved");
    private final static QName _TargetContainer_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "targetContainer");
    private final static QName _JoinOptionProcessInternalJoins_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "joinOptionProcessInternalJoins");
    private final static QName _PromptValue_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "promptValue");
    private final static QName _UpdateSubject_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "updateSubject");
    private final static QName _DataSourceName_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "dataSourceName");
    private final static QName _NameConflictOptionImport_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "nameConflictOptionImport");
    private final static QName _NewObjectName_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "newObjectName");
    private final static QName _JoinOptionProcessKeys_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "joinOptionProcessKeys");
    private final static QName _PackageExists_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "packageExists");
    private final static QName _ParameterValue_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "parameterValue");
    private final static QName _CloseQueryServicesConnection_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "CloseQueryServicesConnection");
    private final static QName _SchemaName_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "schemaName");
    private final static QName _MultidimensionalDimension_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "multidimensionalDimension");
    private final static QName _CrnDataSourceConnectionName_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "crnDataSourceConnectionName");
    private final static QName _ObjectAccess_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "objectAccess");
    private final static QName _QuerySubject_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "querySubject");
    private final static QName _StoredProcedureOptionThrowExceptionOption_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "storedProcedureOptionThrowExceptionOption");
    private final static QName _SelectedObjectsProcessingLevel_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "selectedObjectsProcessingLevel");
    private final static QName _TargetDimension_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "targetDimension");
    private final static QName _TranslationsFilePath_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "translationsFilePath");
    private final static QName _CatalogName_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "catalogName");
    private final static QName _ModelPath_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "modelPath");
    private final static QName _JoinOptionProcessMatchingIndexColumns_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "joinOptionProcessMatchingIndexColumns");
    private final static QName _RoleBasedPackage_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "roleBasedPackage");
    private final static QName _TargetParent_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "targetParent");
    private final static QName _SecurityViewOrPackage_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "securityViewOrPackage");
    private final static QName _Expression_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "expression");
    private final static QName _RegularPackage_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "regularPackage");
    private final static QName _CrnDataSourceConnectionCubePasswordEncrypted_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "crnDataSourceConnectionCubePasswordEncrypted");
    private final static QName _PublishTargetType_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "publishTargetType");
    private final static QName _JoinOptionProcessMatchingQueryItemNames_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "joinOptionProcessMatchingQueryItemNames");
    private final static QName _CubeName_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "cubeName");
    private final static QName _CrnDataSourceConnectionSignonName_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "crnDataSourceConnectionSignonName");
    private final static QName _ParameterMap_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "parameterMap");
    private final static QName _DisplaySummaryMessageOption_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "displaySummaryMessageOption");
    private final static QName _ParameterName_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "parameterName");
    private final static QName _ModelLocale_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "modelLocale");
    private final static QName _DependencySpec_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "dependencySpec");
    private final static QName _QuerySubjectOrDimension_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "querySubjectOrDimension");
    private final static QName _PromptName_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "promptName");
    private final static QName _LinkSegmentRootObject_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "linkSegmentRootObject");
    private final static QName _CreateAutoSummary_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "createAutoSummary");
    private final static QName _ImportSourceSpec_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "importSourceSpec");
    private final static QName _ImportSourceSpecModel_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "importSourceSpecModel");
    private final static QName _SourceObject_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "sourceObject");
    private final static QName _CrnDataSourceConnectionSignonUser_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "crnDataSourceConnectionSignonUser");
    private final static QName _ReportItemOrReportItemContainer_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "reportItemOrReportItemContainer");
    private final static QName _TargetLocation_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "targetLocation");
    private final static QName _NameConflictOptionCreate_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "nameConflictOptionCreate");
    private final static QName _CrnDataSourceConnectionSignonPassword_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "crnDataSourceConnectionSignonPassword");
    private final static QName _QueryItemOrCalculation_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "queryItemOrCalculation");
    private final static QName _CrnDataSourceName_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "crnDataSourceName");
    private final static QName _QsapiResponseSpec_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "qsapiResponseSpec");
    private final static QName _ExternalizeRootDirectory_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "externalizeRootDirectory");
    private final static QName _DBImportInputParamsSapbwImportLocales_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "sapbwImportLocales");
    private final static QName _DBImportInputParamsSapbwImportOptionObjectOrganization_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "sapbwImportOptionObjectOrganization");
    private final static QName _DBImportInputParamsSapbwImportOptionCreateConformedDimensions_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "sapbwImportOptionCreateConformedDimensions");
    private final static QName _DBImportInputParamsSapbwImportOptionUseOrLongNames_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "sapbwImportOptionUseOrLongNames");
    private final static QName _SetSecurityViewDefinitionInputParamsSecurityView_QNAME = new QName("http://www.developer.cognos.com/schemas/fmsdk/1/0", "securityView");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jda.ap.bi.bind.mdactions
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMatchingModelLocale }
     * 
     */
    public GetMatchingModelLocale createGetMatchingModelLocale() {
        return new GetMatchingModelLocale();
    }

    /**
     * Create an instance of {@link FmsdkScript }
     * 
     */
    public FmsdkScript createFmsdkScript() {
        return new FmsdkScript();
    }

    /**
     * Create an instance of {@link DBImportJoinsOnKeys }
     * 
     */
    public DBImportJoinsOnKeys createDBImportJoinsOnKeys() {
        return new DBImportJoinsOnKeys();
    }

    /**
     * Create an instance of {@link RetrieveQueryItemParameters }
     * 
     */
    public RetrieveQueryItemParameters createRetrieveQueryItemParameters() {
        return new RetrieveQueryItemParameters();
    }

    /**
     * Create an instance of {@link DBMakePhysicalSqlName }
     * 
     */
    public DBMakePhysicalSqlName createDBMakePhysicalSqlName() {
        return new DBMakePhysicalSqlName();
    }

    /**
     * Create an instance of {@link TransformRelationship }
     * 
     */
    public TransformRelationship createTransformRelationship() {
        return new TransformRelationship();
    }

    /**
     * Create an instance of {@link RemoveRuntimeParameters }
     * 
     */
    public RemoveRuntimeParameters createRemoveRuntimeParameters() {
        return new RemoveRuntimeParameters();
    }

    /**
     * Create an instance of {@link Repair }
     * 
     */
    public Repair createRepair() {
        return new Repair();
    }

    /**
     * Create an instance of {@link ShowImpact }
     * 
     */
    public ShowImpact createShowImpact() {
        return new ShowImpact();
    }

    /**
     * Create an instance of {@link SetQueryItemParameterMap }
     * 
     */
    public SetQueryItemParameterMap createSetQueryItemParameterMap() {
        return new SetQueryItemParameterMap();
    }

    /**
     * Create an instance of {@link SetRuntimeParameters }
     * 
     */
    public SetRuntimeParameters createSetRuntimeParameters() {
        return new SetRuntimeParameters();
    }

    /**
     * Create an instance of {@link EvaluateObject }
     * 
     */
    public EvaluateObject createEvaluateObject() {
        return new EvaluateObject();
    }

    /**
     * Create an instance of {@link ShouldUpgrade }
     * 
     */
    public ShouldUpgrade createShouldUpgrade() {
        return new ShouldUpgrade();
    }

    /**
     * Create an instance of {@link SelectDataSourceConnection }
     * 
     */
    public SelectDataSourceConnection createSelectDataSourceConnection() {
        return new SelectDataSourceConnection();
    }

    /**
     * Create an instance of {@link GetPackageInclusionsForObject }
     * 
     */
    public GetPackageInclusionsForObject createGetPackageInclusionsForObject() {
        return new GetPackageInclusionsForObject();
    }

    /**
     * Create an instance of {@link GetPromptValues }
     * 
     */
    public GetPromptValues createGetPromptValues() {
        return new GetPromptValues();
    }

    /**
     * Create an instance of {@link SelectDataSourceDom }
     * 
     */
    public SelectDataSourceDom createSelectDataSourceDom() {
        return new SelectDataSourceDom();
    }

    /**
     * Create an instance of {@link SetObjectAccess }
     * 
     */
    public SetObjectAccess createSetObjectAccess() {
        return new SetObjectAccess();
    }

    /**
     * Create an instance of {@link CountQuerySubject }
     * 
     */
    public CountQuerySubject createCountQuerySubject() {
        return new CountQuerySubject();
    }

    /**
     * Create an instance of {@link GetApplicationVersion }
     * 
     */
    public GetApplicationVersion createGetApplicationVersion() {
        return new GetApplicationVersion();
    }

    /**
     * Create an instance of {@link SQLPlanAssociation }
     * 
     */
    public SQLPlanAssociation createSQLPlanAssociation() {
        return new SQLPlanAssociation();
    }

    /**
     * Create an instance of {@link TransformObjectNames }
     * 
     */
    public TransformObjectNames createTransformObjectNames() {
        return new TransformObjectNames();
    }

    /**
     * Create an instance of {@link SetSecurityViewDefinition }
     * 
     */
    public SetSecurityViewDefinition createSetSecurityViewDefinition() {
        return new SetSecurityViewDefinition();
    }

    /**
     * Create an instance of {@link GetSupportedLocales }
     * 
     */
    public GetSupportedLocales createGetSupportedLocales() {
        return new GetSupportedLocales();
    }

    /**
     * Create an instance of {@link DoQueryServicesRequest }
     * 
     */
    public DoQueryServicesRequest createDoQueryServicesRequest() {
        return new DoQueryServicesRequest();
    }

    /**
     * Create an instance of {@link Move }
     * 
     */
    public Move createMove() {
        return new Move();
    }

    /**
     * Create an instance of {@link GetDefaultLocale }
     * 
     */
    public GetDefaultLocale createGetDefaultLocale() {
        return new GetDefaultLocale();
    }

    /**
     * Create an instance of {@link Publish }
     * 
     */
    public Publish createPublish() {
        return new Publish();
    }

    /**
     * Create an instance of {@link ConformedDimensionsCreate }
     * 
     */
    public ConformedDimensionsCreate createConformedDimensionsCreate() {
        return new ConformedDimensionsCreate();
    }

    /**
     * Create an instance of {@link ReorderBefore }
     * 
     */
    public ReorderBefore createReorderBefore() {
        return new ReorderBefore();
    }

    /**
     * Create an instance of {@link GetPassportFromCM }
     * 
     */
    public GetPassportFromCM createGetPassportFromCM() {
        return new GetPassportFromCM();
    }

    /**
     * Create an instance of {@link UseContentManager4Authentication }
     * 
     */
    public UseContentManager4Authentication createUseContentManager4Authentication() {
        return new UseContentManager4Authentication();
    }

    /**
     * Create an instance of {@link SetActiveLocale }
     * 
     */
    public SetActiveLocale createSetActiveLocale() {
        return new SetActiveLocale();
    }

    /**
     * Create an instance of {@link GetAllPackages }
     * 
     */
    public GetAllPackages createGetAllPackages() {
        return new GetAllPackages();
    }

    /**
     * Create an instance of {@link DynamicImportPublish }
     * 
     */
    public DynamicImportPublish createDynamicImportPublish() {
        return new DynamicImportPublish();
    }

    /**
     * Create an instance of {@link PreviewSecurityFilter }
     * 
     */
    public PreviewSecurityFilter createPreviewSecurityFilter() {
        return new PreviewSecurityFilter();
    }

    /**
     * Create an instance of {@link CheckModel }
     * 
     */
    public CheckModel createCheckModel() {
        return new CheckModel();
    }

    /**
     * Create an instance of {@link ModelImport }
     * 
     */
    public ModelImport createModelImport() {
        return new ModelImport();
    }

    /**
     * Create an instance of {@link TransformCreateStarGrouping }
     * 
     */
    public TransformCreateStarGrouping createTransformCreateStarGrouping() {
        return new TransformCreateStarGrouping();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link Merge }
     * 
     */
    public Merge createMerge() {
        return new Merge();
    }

    /**
     * Create an instance of {@link TestQuerySubject }
     * 
     */
    public TestQuerySubject createTestQuerySubject() {
        return new TestQuerySubject();
    }

    /**
     * Create an instance of {@link BuildObjectReference }
     * 
     */
    public BuildObjectReference createBuildObjectReference() {
        return new BuildObjectReference();
    }

    /**
     * Create an instance of {@link ExportTranslations }
     * 
     */
    public ExportTranslations createExportTranslations() {
        return new ExportTranslations();
    }

    /**
     * Create an instance of {@link GetContentManagerGateway }
     * 
     */
    public GetContentManagerGateway createGetContentManagerGateway() {
        return new GetContentManagerGateway();
    }

    /**
     * Create an instance of {@link SetPackageLocales }
     * 
     */
    public SetPackageLocales createSetPackageLocales() {
        return new SetPackageLocales();
    }

    /**
     * Create an instance of {@link ConformedDimensionsDetect }
     * 
     */
    public ConformedDimensionsDetect createConformedDimensionsDetect() {
        return new ConformedDimensionsDetect();
    }

    /**
     * Create an instance of {@link DBStoredProcedure }
     * 
     */
    public DBStoredProcedure createDBStoredProcedure() {
        return new DBStoredProcedure();
    }

    /**
     * Create an instance of {@link SetDefaultLocale }
     * 
     */
    public SetDefaultLocale createSetDefaultLocale() {
        return new SetDefaultLocale();
    }

    /**
     * Create an instance of {@link DoDependencyAnalysis }
     * 
     */
    public DoDependencyAnalysis createDoDependencyAnalysis() {
        return new DoDependencyAnalysis();
    }

    /**
     * Create an instance of {@link TransformQueryItemAggregateRule }
     * 
     */
    public TransformQueryItemAggregateRule createTransformQueryItemAggregateRule() {
        return new TransformQueryItemAggregateRule();
    }

    /**
     * Create an instance of {@link CreateShortcut }
     * 
     */
    public CreateShortcut createCreateShortcut() {
        return new CreateShortcut();
    }

    /**
     * Create an instance of {@link SetPromptValue }
     * 
     */
    public SetPromptValue createSetPromptValue() {
        return new SetPromptValue();
    }

    /**
     * Create an instance of {@link GetSecurityObjectUsage }
     * 
     */
    public GetSecurityObjectUsage createGetSecurityObjectUsage() {
        return new GetSecurityObjectUsage();
    }

    /**
     * Create an instance of {@link GetObjectAncestry }
     * 
     */
    public GetObjectAncestry createGetObjectAncestry() {
        return new GetObjectAncestry();
    }

    /**
     * Create an instance of {@link GetCandidateRelationships }
     * 
     */
    public GetCandidateRelationships createGetCandidateRelationships() {
        return new GetCandidateRelationships();
    }

    /**
     * Create an instance of {@link AddLocale }
     * 
     */
    public AddLocale createAddLocale() {
        return new AddLocale();
    }

    /**
     * Create an instance of {@link AddProperty }
     * 
     */
    public AddProperty createAddProperty() {
        return new AddProperty();
    }

    /**
     * Create an instance of {@link Cancel }
     * 
     */
    public Cancel createCancel() {
        return new Cancel();
    }

    /**
     * Create an instance of {@link ConformedDimensionsCandidates }
     * 
     */
    public ConformedDimensionsCandidates createConformedDimensionsCandidates() {
        return new ConformedDimensionsCandidates();
    }

    /**
     * Create an instance of {@link Copy }
     * 
     */
    public Copy createCopy() {
        return new Copy();
    }

    /**
     * Create an instance of {@link CreateCalculationInFolder }
     * 
     */
    public CreateCalculationInFolder createCreateCalculationInFolder() {
        return new CreateCalculationInFolder();
    }

    /**
     * Create an instance of {@link DBBrowse }
     * 
     */
    public DBBrowse createDBBrowse() {
        return new DBBrowse();
    }

    /**
     * Create an instance of {@link DBImport }
     * 
     */
    public DBImport createDBImport() {
        return new DBImport();
    }

    /**
     * Create an instance of {@link DBRelationshipPath }
     * 
     */
    public DBRelationshipPath createDBRelationshipPath() {
        return new DBRelationshipPath();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DoUpgrade }
     * 
     */
    public DoUpgrade createDoUpgrade() {
        return new DoUpgrade();
    }

    /**
     * Create an instance of {@link EvaluateSecurityView }
     * 
     */
    public EvaluateSecurityView createEvaluateSecurityView() {
        return new EvaluateSecurityView();
    }

    /**
     * Create an instance of {@link ExpandParameters }
     * 
     */
    public ExpandParameters createExpandParameters() {
        return new ExpandParameters();
    }

    /**
     * Create an instance of {@link ExplainLogFile }
     * 
     */
    public ExplainLogFile createExplainLogFile() {
        return new ExplainLogFile();
    }

    /**
     * Create an instance of {@link ExpressionQuery }
     * 
     */
    public ExpressionQuery createExpressionQuery() {
        return new ExpressionQuery();
    }

    /**
     * Create an instance of {@link ExternalizeQuerySubject }
     * 
     */
    public ExternalizeQuerySubject createExternalizeQuerySubject() {
        return new ExternalizeQuerySubject();
    }

    /**
     * Create an instance of {@link FindOrCreateDataSource }
     * 
     */
    public FindOrCreateDataSource createFindOrCreateDataSource() {
        return new FindOrCreateDataSource();
    }

    /**
     * Create an instance of {@link GetDataSourceConnectionSelections }
     * 
     */
    public GetDataSourceConnectionSelections createGetDataSourceConnectionSelections() {
        return new GetDataSourceConnectionSelections();
    }

    /**
     * Create an instance of {@link GetDataSourceInfo }
     * 
     */
    public GetDataSourceInfo createGetDataSourceInfo() {
        return new GetDataSourceInfo();
    }

    /**
     * Create an instance of {@link GetNearestCommonParentObject }
     * 
     */
    public GetNearestCommonParentObject createGetNearestCommonParentObject() {
        return new GetNearestCommonParentObject();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link GetQueryProcessingMode }
     * 
     */
    public GetQueryProcessingMode createGetQueryProcessingMode() {
        return new GetQueryProcessingMode();
    }

    /**
     * Create an instance of {@link GetRuntimeParameters }
     * 
     */
    public GetRuntimeParameters createGetRuntimeParameters() {
        return new GetRuntimeParameters();
    }

    /**
     * Create an instance of {@link ImportTranslations }
     * 
     */
    public ImportTranslations createImportTranslations() {
        return new ImportTranslations();
    }

    /**
     * Create an instance of {@link IsModelViewPresent }
     * 
     */
    public IsModelViewPresent createIsModelViewPresent() {
        return new IsModelViewPresent();
    }

    /**
     * Create an instance of {@link LinkModel }
     * 
     */
    public LinkModel createLinkModel() {
        return new LinkModel();
    }

    /**
     * Create an instance of {@link MakeExpressionGlobal }
     * 
     */
    public MakeExpressionGlobal createMakeExpressionGlobal() {
        return new MakeExpressionGlobal();
    }

    /**
     * Create an instance of {@link MakeObjectNameUnique }
     * 
     */
    public MakeObjectNameUnique createMakeObjectNameUnique() {
        return new MakeObjectNameUnique();
    }

    /**
     * Create an instance of {@link ModelBrowse }
     * 
     */
    public ModelBrowse createModelBrowse() {
        return new ModelBrowse();
    }

    /**
     * Create an instance of {@link ModelDiff }
     * 
     */
    public ModelDiff createModelDiff() {
        return new ModelDiff();
    }

    /**
     * Create an instance of {@link Modify }
     * 
     */
    public Modify createModify() {
        return new Modify();
    }

    /**
     * Create an instance of {@link ModifyComplex }
     * 
     */
    public ModifyComplex createModifyComplex() {
        return new ModifyComplex();
    }

    /**
     * Create an instance of {@link PopulateParameterMap }
     * 
     */
    public PopulateParameterMap createPopulateParameterMap() {
        return new PopulateParameterMap();
    }

    /**
     * Create an instance of {@link RemoveLocale }
     * 
     */
    public RemoveLocale createRemoveLocale() {
        return new RemoveLocale();
    }

    /**
     * Create an instance of {@link ResetPromptValues }
     * 
     */
    public ResetPromptValues createResetPromptValues() {
        return new ResetPromptValues();
    }

    /**
     * Create an instance of {@link RetargetObjectReferences }
     * 
     */
    public RetargetObjectReferences createRetargetObjectReferences() {
        return new RetargetObjectReferences();
    }

    /**
     * Create an instance of {@link SegmentModel }
     * 
     */
    public SegmentModel createSegmentModel() {
        return new SegmentModel();
    }

    /**
     * Create an instance of {@link SelectDataSourceCredentials }
     * 
     */
    public SelectDataSourceCredentials createSelectDataSourceCredentials() {
        return new SelectDataSourceCredentials();
    }

    /**
     * Create an instance of {@link SetSecurityViewAccess }
     * 
     */
    public SetSecurityViewAccess createSetSecurityViewAccess() {
        return new SetSecurityViewAccess();
    }

    /**
     * Create an instance of {@link TestDataSource }
     * 
     */
    public TestDataSource createTestDataSource() {
        return new TestDataSource();
    }

    /**
     * Create an instance of {@link TransformFunction }
     * 
     */
    public TransformFunction createTransformFunction() {
        return new TransformFunction();
    }

    /**
     * Create an instance of {@link TransformQueryItemUsage }
     * 
     */
    public TransformQueryItemUsage createTransformQueryItemUsage() {
        return new TransformQueryItemUsage();
    }

    /**
     * Create an instance of {@link TranslateReference }
     * 
     */
    public TranslateReference createTranslateReference() {
        return new TranslateReference();
    }

    /**
     * Create an instance of {@link Verify }
     * 
     */
    public Verify createVerify() {
        return new Verify();
    }

    /**
     * Create an instance of {@link UpdateQuerySubject }
     * 
     */
    public UpdateQuerySubject createUpdateQuerySubject() {
        return new UpdateQuerySubject();
    }

    /**
     * Create an instance of {@link CreateRemainingRelationships }
     * 
     */
    public CreateRemainingRelationships createCreateRemainingRelationships() {
        return new CreateRemainingRelationships();
    }

    /**
     * Create an instance of {@link ImportIQD }
     * 
     */
    public ImportIQD createImportIQD() {
        return new ImportIQD();
    }

    /**
     * Create an instance of {@link TestConnectionString }
     * 
     */
    public TestConnectionString createTestConnectionString() {
        return new TestConnectionString();
    }

    /**
     * Create an instance of {@link Transaction.GetObjectAccess }
     * 
     */
    public Transaction.GetObjectAccess createTransactionGetObjectAccess() {
        return new Transaction.GetObjectAccess();
    }

    /**
     * Create an instance of {@link GenerateID }
     * 
     */
    public GenerateID createGenerateID() {
        return new GenerateID();
    }

    /**
     * Create an instance of {@link Action }
     * 
     */
    public Action createAction() {
        return new Action();
    }

    /**
     * Create an instance of {@link GetMatchingModelLocale.InputParams }
     * 
     */
    public GetMatchingModelLocale.InputParams createGetMatchingModelLocaleInputParams() {
        return new GetMatchingModelLocale.InputParams();
    }

    /**
     * Create an instance of {@link GetMatchingModelLocale.OutputParams }
     * 
     */
    public GetMatchingModelLocale.OutputParams createGetMatchingModelLocaleOutputParams() {
        return new GetMatchingModelLocale.OutputParams();
    }

    /**
     * Create an instance of {@link FmsdkScript.ActionLog }
     * 
     */
    public FmsdkScript.ActionLog createFmsdkScriptActionLog() {
        return new FmsdkScript.ActionLog();
    }

    /**
     * Create an instance of {@link FmsdkScript.MetaDataServiceRequest }
     * 
     */
    public FmsdkScript.MetaDataServiceRequest createFmsdkScriptMetaDataServiceRequest() {
        return new FmsdkScript.MetaDataServiceRequest();
    }

    /**
     * Create an instance of {@link DBImportJoinsOnKeys.InputParams }
     * 
     */
    public DBImportJoinsOnKeys.InputParams createDBImportJoinsOnKeysInputParams() {
        return new DBImportJoinsOnKeys.InputParams();
    }

    /**
     * Create an instance of {@link RetrieveQueryItemParameters.InputParams }
     * 
     */
    public RetrieveQueryItemParameters.InputParams createRetrieveQueryItemParametersInputParams() {
        return new RetrieveQueryItemParameters.InputParams();
    }

    /**
     * Create an instance of {@link RetrieveQueryItemParameters.OutputParams }
     * 
     */
    public RetrieveQueryItemParameters.OutputParams createRetrieveQueryItemParametersOutputParams() {
        return new RetrieveQueryItemParameters.OutputParams();
    }

    /**
     * Create an instance of {@link DBMakePhysicalSqlName.InputParams }
     * 
     */
    public DBMakePhysicalSqlName.InputParams createDBMakePhysicalSqlNameInputParams() {
        return new DBMakePhysicalSqlName.InputParams();
    }

    /**
     * Create an instance of {@link DBMakePhysicalSqlName.OutputParams }
     * 
     */
    public DBMakePhysicalSqlName.OutputParams createDBMakePhysicalSqlNameOutputParams() {
        return new DBMakePhysicalSqlName.OutputParams();
    }

    /**
     * Create an instance of {@link TransformRelationship.InputParams }
     * 
     */
    public TransformRelationship.InputParams createTransformRelationshipInputParams() {
        return new TransformRelationship.InputParams();
    }

    /**
     * Create an instance of {@link RemoveRuntimeParameters.InputParams }
     * 
     */
    public RemoveRuntimeParameters.InputParams createRemoveRuntimeParametersInputParams() {
        return new RemoveRuntimeParameters.InputParams();
    }

    /**
     * Create an instance of {@link Repair.InputParams }
     * 
     */
    public Repair.InputParams createRepairInputParams() {
        return new Repair.InputParams();
    }

    /**
     * Create an instance of {@link ShowImpact.InputParams }
     * 
     */
    public ShowImpact.InputParams createShowImpactInputParams() {
        return new ShowImpact.InputParams();
    }

    /**
     * Create an instance of {@link ShowImpact.OutputParams }
     * 
     */
    public ShowImpact.OutputParams createShowImpactOutputParams() {
        return new ShowImpact.OutputParams();
    }

    /**
     * Create an instance of {@link SetQueryItemParameterMap.InputParams }
     * 
     */
    public SetQueryItemParameterMap.InputParams createSetQueryItemParameterMapInputParams() {
        return new SetQueryItemParameterMap.InputParams();
    }

    /**
     * Create an instance of {@link SetRuntimeParameters.InputParams }
     * 
     */
    public SetRuntimeParameters.InputParams createSetRuntimeParametersInputParams() {
        return new SetRuntimeParameters.InputParams();
    }

    /**
     * Create an instance of {@link EvaluateObject.InputParams }
     * 
     */
    public EvaluateObject.InputParams createEvaluateObjectInputParams() {
        return new EvaluateObject.InputParams();
    }

    /**
     * Create an instance of {@link ShouldUpgrade.InputParams }
     * 
     */
    public ShouldUpgrade.InputParams createShouldUpgradeInputParams() {
        return new ShouldUpgrade.InputParams();
    }

    /**
     * Create an instance of {@link ShouldUpgrade.OutputParams }
     * 
     */
    public ShouldUpgrade.OutputParams createShouldUpgradeOutputParams() {
        return new ShouldUpgrade.OutputParams();
    }

    /**
     * Create an instance of {@link SelectDataSourceConnection.InputParams }
     * 
     */
    public SelectDataSourceConnection.InputParams createSelectDataSourceConnectionInputParams() {
        return new SelectDataSourceConnection.InputParams();
    }

    /**
     * Create an instance of {@link GetPackageInclusionsForObject.InputParams }
     * 
     */
    public GetPackageInclusionsForObject.InputParams createGetPackageInclusionsForObjectInputParams() {
        return new GetPackageInclusionsForObject.InputParams();
    }

    /**
     * Create an instance of {@link GetPackageInclusionsForObject.OutputParams }
     * 
     */
    public GetPackageInclusionsForObject.OutputParams createGetPackageInclusionsForObjectOutputParams() {
        return new GetPackageInclusionsForObject.OutputParams();
    }

    /**
     * Create an instance of {@link GetPromptValues.OutputParams }
     * 
     */
    public GetPromptValues.OutputParams createGetPromptValuesOutputParams() {
        return new GetPromptValues.OutputParams();
    }

    /**
     * Create an instance of {@link SelectDataSourceDom.InputParams }
     * 
     */
    public SelectDataSourceDom.InputParams createSelectDataSourceDomInputParams() {
        return new SelectDataSourceDom.InputParams();
    }

    /**
     * Create an instance of {@link SetObjectAccess.InputParams }
     * 
     */
    public SetObjectAccess.InputParams createSetObjectAccessInputParams() {
        return new SetObjectAccess.InputParams();
    }

    /**
     * Create an instance of {@link CountQuerySubject.InputParams }
     * 
     */
    public CountQuerySubject.InputParams createCountQuerySubjectInputParams() {
        return new CountQuerySubject.InputParams();
    }

    /**
     * Create an instance of {@link CountQuerySubject.OutputParams }
     * 
     */
    public CountQuerySubject.OutputParams createCountQuerySubjectOutputParams() {
        return new CountQuerySubject.OutputParams();
    }

    /**
     * Create an instance of {@link DBRelease }
     * 
     */
    public DBRelease createDBRelease() {
        return new DBRelease();
    }

    /**
     * Create an instance of {@link GetApplicationVersion.OutputParams }
     * 
     */
    public GetApplicationVersion.OutputParams createGetApplicationVersionOutputParams() {
        return new GetApplicationVersion.OutputParams();
    }

    /**
     * Create an instance of {@link SQLPlanAssociation.InputParams }
     * 
     */
    public SQLPlanAssociation.InputParams createSQLPlanAssociationInputParams() {
        return new SQLPlanAssociation.InputParams();
    }

    /**
     * Create an instance of {@link SQLPlanAssociation.OutputParams }
     * 
     */
    public SQLPlanAssociation.OutputParams createSQLPlanAssociationOutputParams() {
        return new SQLPlanAssociation.OutputParams();
    }

    /**
     * Create an instance of {@link TransformObjectNames.InputParams }
     * 
     */
    public TransformObjectNames.InputParams createTransformObjectNamesInputParams() {
        return new TransformObjectNames.InputParams();
    }

    /**
     * Create an instance of {@link SetSecurityViewDefinition.InputParams }
     * 
     */
    public SetSecurityViewDefinition.InputParams createSetSecurityViewDefinitionInputParams() {
        return new SetSecurityViewDefinition.InputParams();
    }

    /**
     * Create an instance of {@link GetSupportedLocales.OutputParams }
     * 
     */
    public GetSupportedLocales.OutputParams createGetSupportedLocalesOutputParams() {
        return new GetSupportedLocales.OutputParams();
    }

    /**
     * Create an instance of {@link DoQueryServicesRequest.InputParams }
     * 
     */
    public DoQueryServicesRequest.InputParams createDoQueryServicesRequestInputParams() {
        return new DoQueryServicesRequest.InputParams();
    }

    /**
     * Create an instance of {@link DoQueryServicesRequest.OutputParams }
     * 
     */
    public DoQueryServicesRequest.OutputParams createDoQueryServicesRequestOutputParams() {
        return new DoQueryServicesRequest.OutputParams();
    }

    /**
     * Create an instance of {@link Move.InputParams }
     * 
     */
    public Move.InputParams createMoveInputParams() {
        return new Move.InputParams();
    }

    /**
     * Create an instance of {@link GetDefaultLocale.OutputParams }
     * 
     */
    public GetDefaultLocale.OutputParams createGetDefaultLocaleOutputParams() {
        return new GetDefaultLocale.OutputParams();
    }

    /**
     * Create an instance of {@link Publish.InputParams }
     * 
     */
    public Publish.InputParams createPublishInputParams() {
        return new Publish.InputParams();
    }

    /**
     * Create an instance of {@link Publish.OutputParams }
     * 
     */
    public Publish.OutputParams createPublishOutputParams() {
        return new Publish.OutputParams();
    }

    /**
     * Create an instance of {@link ConformedDimensionsCreate.InputParams }
     * 
     */
    public ConformedDimensionsCreate.InputParams createConformedDimensionsCreateInputParams() {
        return new ConformedDimensionsCreate.InputParams();
    }

    /**
     * Create an instance of {@link ConformedDimensionsCreate.OutputParams }
     * 
     */
    public ConformedDimensionsCreate.OutputParams createConformedDimensionsCreateOutputParams() {
        return new ConformedDimensionsCreate.OutputParams();
    }

    /**
     * Create an instance of {@link ReorderBefore.InputParams }
     * 
     */
    public ReorderBefore.InputParams createReorderBeforeInputParams() {
        return new ReorderBefore.InputParams();
    }

    /**
     * Create an instance of {@link GetPassportFromCM.InputParams }
     * 
     */
    public GetPassportFromCM.InputParams createGetPassportFromCMInputParams() {
        return new GetPassportFromCM.InputParams();
    }

    /**
     * Create an instance of {@link GetPassportFromCM.OutputParams }
     * 
     */
    public GetPassportFromCM.OutputParams createGetPassportFromCMOutputParams() {
        return new GetPassportFromCM.OutputParams();
    }

    /**
     * Create an instance of {@link UseContentManager4Authentication.OutputParams }
     * 
     */
    public UseContentManager4Authentication.OutputParams createUseContentManager4AuthenticationOutputParams() {
        return new UseContentManager4Authentication.OutputParams();
    }

    /**
     * Create an instance of {@link SetActiveLocale.InputParams }
     * 
     */
    public SetActiveLocale.InputParams createSetActiveLocaleInputParams() {
        return new SetActiveLocale.InputParams();
    }

    /**
     * Create an instance of {@link GetAllPackages.OutputParams }
     * 
     */
    public GetAllPackages.OutputParams createGetAllPackagesOutputParams() {
        return new GetAllPackages.OutputParams();
    }

    /**
     * Create an instance of {@link DynamicImportPublish.InputParams }
     * 
     */
    public DynamicImportPublish.InputParams createDynamicImportPublishInputParams() {
        return new DynamicImportPublish.InputParams();
    }

    /**
     * Create an instance of {@link PreviewSecurityFilter.InputParams }
     * 
     */
    public PreviewSecurityFilter.InputParams createPreviewSecurityFilterInputParams() {
        return new PreviewSecurityFilter.InputParams();
    }

    /**
     * Create an instance of {@link PreviewSecurityFilter.OutputParams }
     * 
     */
    public PreviewSecurityFilter.OutputParams createPreviewSecurityFilterOutputParams() {
        return new PreviewSecurityFilter.OutputParams();
    }

    /**
     * Create an instance of {@link CheckModel.InputParams }
     * 
     */
    public CheckModel.InputParams createCheckModelInputParams() {
        return new CheckModel.InputParams();
    }

    /**
     * Create an instance of {@link CheckModel.OutputParams }
     * 
     */
    public CheckModel.OutputParams createCheckModelOutputParams() {
        return new CheckModel.OutputParams();
    }

    /**
     * Create an instance of {@link ModelImport.InputParams }
     * 
     */
    public ModelImport.InputParams createModelImportInputParams() {
        return new ModelImport.InputParams();
    }

    /**
     * Create an instance of {@link TransformCreateStarGrouping.InputParams }
     * 
     */
    public TransformCreateStarGrouping.InputParams createTransformCreateStarGroupingInputParams() {
        return new TransformCreateStarGrouping.InputParams();
    }

    /**
     * Create an instance of {@link TransformCreateStarGrouping.OutputParams }
     * 
     */
    public TransformCreateStarGrouping.OutputParams createTransformCreateStarGroupingOutputParams() {
        return new TransformCreateStarGrouping.OutputParams();
    }

    /**
     * Create an instance of {@link Create.InputParams }
     * 
     */
    public Create.InputParams createCreateInputParams() {
        return new Create.InputParams();
    }

    /**
     * Create an instance of {@link Create.OutputParams }
     * 
     */
    public Create.OutputParams createCreateOutputParams() {
        return new Create.OutputParams();
    }

    /**
     * Create an instance of {@link Merge.InputParams }
     * 
     */
    public Merge.InputParams createMergeInputParams() {
        return new Merge.InputParams();
    }

    /**
     * Create an instance of {@link Merge.OutputParams }
     * 
     */
    public Merge.OutputParams createMergeOutputParams() {
        return new Merge.OutputParams();
    }

    /**
     * Create an instance of {@link TestQuerySubject.InputParams }
     * 
     */
    public TestQuerySubject.InputParams createTestQuerySubjectInputParams() {
        return new TestQuerySubject.InputParams();
    }

    /**
     * Create an instance of {@link TestQuerySubject.OutputParams }
     * 
     */
    public TestQuerySubject.OutputParams createTestQuerySubjectOutputParams() {
        return new TestQuerySubject.OutputParams();
    }

    /**
     * Create an instance of {@link BuildObjectReference.InputParams }
     * 
     */
    public BuildObjectReference.InputParams createBuildObjectReferenceInputParams() {
        return new BuildObjectReference.InputParams();
    }

    /**
     * Create an instance of {@link BuildObjectReference.OutputParams }
     * 
     */
    public BuildObjectReference.OutputParams createBuildObjectReferenceOutputParams() {
        return new BuildObjectReference.OutputParams();
    }

    /**
     * Create an instance of {@link ExportTranslations.InputParams }
     * 
     */
    public ExportTranslations.InputParams createExportTranslationsInputParams() {
        return new ExportTranslations.InputParams();
    }

    /**
     * Create an instance of {@link GetContentManagerGateway.OutputParams }
     * 
     */
    public GetContentManagerGateway.OutputParams createGetContentManagerGatewayOutputParams() {
        return new GetContentManagerGateway.OutputParams();
    }

    /**
     * Create an instance of {@link SetPackageLocales.InputParams }
     * 
     */
    public SetPackageLocales.InputParams createSetPackageLocalesInputParams() {
        return new SetPackageLocales.InputParams();
    }

    /**
     * Create an instance of {@link ConformedDimensionsDetect.InputParams }
     * 
     */
    public ConformedDimensionsDetect.InputParams createConformedDimensionsDetectInputParams() {
        return new ConformedDimensionsDetect.InputParams();
    }

    /**
     * Create an instance of {@link ConformedDimensionsDetect.OutputParams }
     * 
     */
    public ConformedDimensionsDetect.OutputParams createConformedDimensionsDetectOutputParams() {
        return new ConformedDimensionsDetect.OutputParams();
    }

    /**
     * Create an instance of {@link DBStoredProcedure.InputParams }
     * 
     */
    public DBStoredProcedure.InputParams createDBStoredProcedureInputParams() {
        return new DBStoredProcedure.InputParams();
    }

    /**
     * Create an instance of {@link SetDefaultLocale.InputParams }
     * 
     */
    public SetDefaultLocale.InputParams createSetDefaultLocaleInputParams() {
        return new SetDefaultLocale.InputParams();
    }

    /**
     * Create an instance of {@link DoDependencyAnalysis.InputParams }
     * 
     */
    public DoDependencyAnalysis.InputParams createDoDependencyAnalysisInputParams() {
        return new DoDependencyAnalysis.InputParams();
    }

    /**
     * Create an instance of {@link DoDependencyAnalysis.OutputParams }
     * 
     */
    public DoDependencyAnalysis.OutputParams createDoDependencyAnalysisOutputParams() {
        return new DoDependencyAnalysis.OutputParams();
    }

    /**
     * Create an instance of {@link TransformQueryItemAggregateRule.InputParams }
     * 
     */
    public TransformQueryItemAggregateRule.InputParams createTransformQueryItemAggregateRuleInputParams() {
        return new TransformQueryItemAggregateRule.InputParams();
    }

    /**
     * Create an instance of {@link CreateShortcut.InputParams }
     * 
     */
    public CreateShortcut.InputParams createCreateShortcutInputParams() {
        return new CreateShortcut.InputParams();
    }

    /**
     * Create an instance of {@link CreateShortcut.OutputParams }
     * 
     */
    public CreateShortcut.OutputParams createCreateShortcutOutputParams() {
        return new CreateShortcut.OutputParams();
    }

    /**
     * Create an instance of {@link SetPromptValue.InputParams }
     * 
     */
    public SetPromptValue.InputParams createSetPromptValueInputParams() {
        return new SetPromptValue.InputParams();
    }

    /**
     * Create an instance of {@link GetSecurityObjectUsage.InputParams }
     * 
     */
    public GetSecurityObjectUsage.InputParams createGetSecurityObjectUsageInputParams() {
        return new GetSecurityObjectUsage.InputParams();
    }

    /**
     * Create an instance of {@link GetSecurityObjectUsage.OutputParams }
     * 
     */
    public GetSecurityObjectUsage.OutputParams createGetSecurityObjectUsageOutputParams() {
        return new GetSecurityObjectUsage.OutputParams();
    }

    /**
     * Create an instance of {@link GetObjectAncestry.InputParams }
     * 
     */
    public GetObjectAncestry.InputParams createGetObjectAncestryInputParams() {
        return new GetObjectAncestry.InputParams();
    }

    /**
     * Create an instance of {@link GetObjectAncestry.OutputParams }
     * 
     */
    public GetObjectAncestry.OutputParams createGetObjectAncestryOutputParams() {
        return new GetObjectAncestry.OutputParams();
    }

    /**
     * Create an instance of {@link GetCandidateRelationships.InputParams }
     * 
     */
    public GetCandidateRelationships.InputParams createGetCandidateRelationshipsInputParams() {
        return new GetCandidateRelationships.InputParams();
    }

    /**
     * Create an instance of {@link GetCandidateRelationships.OutputParams }
     * 
     */
    public GetCandidateRelationships.OutputParams createGetCandidateRelationshipsOutputParams() {
        return new GetCandidateRelationships.OutputParams();
    }

    /**
     * Create an instance of {@link AddLocale.InputParams }
     * 
     */
    public AddLocale.InputParams createAddLocaleInputParams() {
        return new AddLocale.InputParams();
    }

    /**
     * Create an instance of {@link AddProperty.InputParams }
     * 
     */
    public AddProperty.InputParams createAddPropertyInputParams() {
        return new AddProperty.InputParams();
    }

    /**
     * Create an instance of {@link AddProperty.OutputParams }
     * 
     */
    public AddProperty.OutputParams createAddPropertyOutputParams() {
        return new AddProperty.OutputParams();
    }

    /**
     * Create an instance of {@link Cancel.InputParams }
     * 
     */
    public Cancel.InputParams createCancelInputParams() {
        return new Cancel.InputParams();
    }

    /**
     * Create an instance of {@link ClearDataSourceCache }
     * 
     */
    public ClearDataSourceCache createClearDataSourceCache() {
        return new ClearDataSourceCache();
    }

    /**
     * Create an instance of {@link ConformedDimensionsCandidates.InputParams }
     * 
     */
    public ConformedDimensionsCandidates.InputParams createConformedDimensionsCandidatesInputParams() {
        return new ConformedDimensionsCandidates.InputParams();
    }

    /**
     * Create an instance of {@link ConformedDimensionsCandidates.OutputParams }
     * 
     */
    public ConformedDimensionsCandidates.OutputParams createConformedDimensionsCandidatesOutputParams() {
        return new ConformedDimensionsCandidates.OutputParams();
    }

    /**
     * Create an instance of {@link Copy.InputParams }
     * 
     */
    public Copy.InputParams createCopyInputParams() {
        return new Copy.InputParams();
    }

    /**
     * Create an instance of {@link Copy.OutputParams }
     * 
     */
    public Copy.OutputParams createCopyOutputParams() {
        return new Copy.OutputParams();
    }

    /**
     * Create an instance of {@link CreateCalculationInFolder.InputParams }
     * 
     */
    public CreateCalculationInFolder.InputParams createCreateCalculationInFolderInputParams() {
        return new CreateCalculationInFolder.InputParams();
    }

    /**
     * Create an instance of {@link CreateCalculationInFolder.OutputParams }
     * 
     */
    public CreateCalculationInFolder.OutputParams createCreateCalculationInFolderOutputParams() {
        return new CreateCalculationInFolder.OutputParams();
    }

    /**
     * Create an instance of {@link DBBrowse.InputParams }
     * 
     */
    public DBBrowse.InputParams createDBBrowseInputParams() {
        return new DBBrowse.InputParams();
    }

    /**
     * Create an instance of {@link DBImport.InputParams }
     * 
     */
    public DBImport.InputParams createDBImportInputParams() {
        return new DBImport.InputParams();
    }

    /**
     * Create an instance of {@link DBRelationshipPath.InputParams }
     * 
     */
    public DBRelationshipPath.InputParams createDBRelationshipPathInputParams() {
        return new DBRelationshipPath.InputParams();
    }

    /**
     * Create an instance of {@link DBRelationshipPath.OutputParams }
     * 
     */
    public DBRelationshipPath.OutputParams createDBRelationshipPathOutputParams() {
        return new DBRelationshipPath.OutputParams();
    }

    /**
     * Create an instance of {@link Delete.InputParams }
     * 
     */
    public Delete.InputParams createDeleteInputParams() {
        return new Delete.InputParams();
    }

    /**
     * Create an instance of {@link DoReportsExist }
     * 
     */
    public DoReportsExist createDoReportsExist() {
        return new DoReportsExist();
    }

    /**
     * Create an instance of {@link DoUpgrade.InputParams }
     * 
     */
    public DoUpgrade.InputParams createDoUpgradeInputParams() {
        return new DoUpgrade.InputParams();
    }

    /**
     * Create an instance of {@link EvaluateSecurityView.InputParams }
     * 
     */
    public EvaluateSecurityView.InputParams createEvaluateSecurityViewInputParams() {
        return new EvaluateSecurityView.InputParams();
    }

    /**
     * Create an instance of {@link EvaluateSecurityView.OutputParams }
     * 
     */
    public EvaluateSecurityView.OutputParams createEvaluateSecurityViewOutputParams() {
        return new EvaluateSecurityView.OutputParams();
    }

    /**
     * Create an instance of {@link ExpandParameters.InputParams }
     * 
     */
    public ExpandParameters.InputParams createExpandParametersInputParams() {
        return new ExpandParameters.InputParams();
    }

    /**
     * Create an instance of {@link ExpandParameters.OutputParams }
     * 
     */
    public ExpandParameters.OutputParams createExpandParametersOutputParams() {
        return new ExpandParameters.OutputParams();
    }

    /**
     * Create an instance of {@link ExplainLogFile.InputParams }
     * 
     */
    public ExplainLogFile.InputParams createExplainLogFileInputParams() {
        return new ExplainLogFile.InputParams();
    }

    /**
     * Create an instance of {@link ExplainLogFile.OutputParams }
     * 
     */
    public ExplainLogFile.OutputParams createExplainLogFileOutputParams() {
        return new ExplainLogFile.OutputParams();
    }

    /**
     * Create an instance of {@link ExpressionQuery.InputParams }
     * 
     */
    public ExpressionQuery.InputParams createExpressionQueryInputParams() {
        return new ExpressionQuery.InputParams();
    }

    /**
     * Create an instance of {@link ExpressionQuery.OutputParams }
     * 
     */
    public ExpressionQuery.OutputParams createExpressionQueryOutputParams() {
        return new ExpressionQuery.OutputParams();
    }

    /**
     * Create an instance of {@link ExternalizeQuerySubject.InputParams }
     * 
     */
    public ExternalizeQuerySubject.InputParams createExternalizeQuerySubjectInputParams() {
        return new ExternalizeQuerySubject.InputParams();
    }

    /**
     * Create an instance of {@link ExternalizeQuerySubject.OutputParams }
     * 
     */
    public ExternalizeQuerySubject.OutputParams createExternalizeQuerySubjectOutputParams() {
        return new ExternalizeQuerySubject.OutputParams();
    }

    /**
     * Create an instance of {@link FindOrCreateDataSource.InputParams }
     * 
     */
    public FindOrCreateDataSource.InputParams createFindOrCreateDataSourceInputParams() {
        return new FindOrCreateDataSource.InputParams();
    }

    /**
     * Create an instance of {@link FindOrCreateDataSource.OutputParams }
     * 
     */
    public FindOrCreateDataSource.OutputParams createFindOrCreateDataSourceOutputParams() {
        return new FindOrCreateDataSource.OutputParams();
    }

    /**
     * Create an instance of {@link GetDataSourceConnectionSelections.InputParams }
     * 
     */
    public GetDataSourceConnectionSelections.InputParams createGetDataSourceConnectionSelectionsInputParams() {
        return new GetDataSourceConnectionSelections.InputParams();
    }

    /**
     * Create an instance of {@link GetDataSourceConnectionSelections.OutputParams }
     * 
     */
    public GetDataSourceConnectionSelections.OutputParams createGetDataSourceConnectionSelectionsOutputParams() {
        return new GetDataSourceConnectionSelections.OutputParams();
    }

    /**
     * Create an instance of {@link GetDataSourceInfo.InputParams }
     * 
     */
    public GetDataSourceInfo.InputParams createGetDataSourceInfoInputParams() {
        return new GetDataSourceInfo.InputParams();
    }

    /**
     * Create an instance of {@link GetNearestCommonParentObject.InputParams }
     * 
     */
    public GetNearestCommonParentObject.InputParams createGetNearestCommonParentObjectInputParams() {
        return new GetNearestCommonParentObject.InputParams();
    }

    /**
     * Create an instance of {@link GetNearestCommonParentObject.OutputParams }
     * 
     */
    public GetNearestCommonParentObject.OutputParams createGetNearestCommonParentObjectOutputParams() {
        return new GetNearestCommonParentObject.OutputParams();
    }

    /**
     * Create an instance of {@link GetQueryProcessingMode.InputParams }
     * 
     */
    public GetQueryProcessingMode.InputParams createGetQueryProcessingModeInputParams() {
        return new GetQueryProcessingMode.InputParams();
    }

    /**
     * Create an instance of {@link GetRuntimeParameters.InputParams }
     * 
     */
    public GetRuntimeParameters.InputParams createGetRuntimeParametersInputParams() {
        return new GetRuntimeParameters.InputParams();
    }

    /**
     * Create an instance of {@link GetRuntimeParameters.OutputParams }
     * 
     */
    public GetRuntimeParameters.OutputParams createGetRuntimeParametersOutputParams() {
        return new GetRuntimeParameters.OutputParams();
    }

    /**
     * Create an instance of {@link ImportTranslations.InputParams }
     * 
     */
    public ImportTranslations.InputParams createImportTranslationsInputParams() {
        return new ImportTranslations.InputParams();
    }

    /**
     * Create an instance of {@link ImportTranslations.OutputParams }
     * 
     */
    public ImportTranslations.OutputParams createImportTranslationsOutputParams() {
        return new ImportTranslations.OutputParams();
    }

    /**
     * Create an instance of {@link IsModelViewPresent.InputParams }
     * 
     */
    public IsModelViewPresent.InputParams createIsModelViewPresentInputParams() {
        return new IsModelViewPresent.InputParams();
    }

    /**
     * Create an instance of {@link IsModelViewPresent.OutputParams }
     * 
     */
    public IsModelViewPresent.OutputParams createIsModelViewPresentOutputParams() {
        return new IsModelViewPresent.OutputParams();
    }

    /**
     * Create an instance of {@link LinkModel.InputParams }
     * 
     */
    public LinkModel.InputParams createLinkModelInputParams() {
        return new LinkModel.InputParams();
    }

    /**
     * Create an instance of {@link MakeExpressionGlobal.InputParams }
     * 
     */
    public MakeExpressionGlobal.InputParams createMakeExpressionGlobalInputParams() {
        return new MakeExpressionGlobal.InputParams();
    }

    /**
     * Create an instance of {@link MakeExpressionGlobal.OutputParams }
     * 
     */
    public MakeExpressionGlobal.OutputParams createMakeExpressionGlobalOutputParams() {
        return new MakeExpressionGlobal.OutputParams();
    }

    /**
     * Create an instance of {@link MakeObjectNameUnique.InputParams }
     * 
     */
    public MakeObjectNameUnique.InputParams createMakeObjectNameUniqueInputParams() {
        return new MakeObjectNameUnique.InputParams();
    }

    /**
     * Create an instance of {@link MakeObjectNameUnique.OutputParams }
     * 
     */
    public MakeObjectNameUnique.OutputParams createMakeObjectNameUniqueOutputParams() {
        return new MakeObjectNameUnique.OutputParams();
    }

    /**
     * Create an instance of {@link ModelBrowse.InputParams }
     * 
     */
    public ModelBrowse.InputParams createModelBrowseInputParams() {
        return new ModelBrowse.InputParams();
    }

    /**
     * Create an instance of {@link ModelDiff.InputParams }
     * 
     */
    public ModelDiff.InputParams createModelDiffInputParams() {
        return new ModelDiff.InputParams();
    }

    /**
     * Create an instance of {@link ModelDiff.OutputParams }
     * 
     */
    public ModelDiff.OutputParams createModelDiffOutputParams() {
        return new ModelDiff.OutputParams();
    }

    /**
     * Create an instance of {@link Modify.InputParams }
     * 
     */
    public Modify.InputParams createModifyInputParams() {
        return new Modify.InputParams();
    }

    /**
     * Create an instance of {@link ModifyComplex.InputParams }
     * 
     */
    public ModifyComplex.InputParams createModifyComplexInputParams() {
        return new ModifyComplex.InputParams();
    }

    /**
     * Create an instance of {@link PopulateParameterMap.InputParams }
     * 
     */
    public PopulateParameterMap.InputParams createPopulateParameterMapInputParams() {
        return new PopulateParameterMap.InputParams();
    }

    /**
     * Create an instance of {@link RemoveLocale.InputParams }
     * 
     */
    public RemoveLocale.InputParams createRemoveLocaleInputParams() {
        return new RemoveLocale.InputParams();
    }

    /**
     * Create an instance of {@link RepairReports }
     * 
     */
    public RepairReports createRepairReports() {
        return new RepairReports();
    }

    /**
     * Create an instance of {@link ResetPromptValues.InputParams }
     * 
     */
    public ResetPromptValues.InputParams createResetPromptValuesInputParams() {
        return new ResetPromptValues.InputParams();
    }

    /**
     * Create an instance of {@link RetargetObjectReferences.InputParams }
     * 
     */
    public RetargetObjectReferences.InputParams createRetargetObjectReferencesInputParams() {
        return new RetargetObjectReferences.InputParams();
    }

    /**
     * Create an instance of {@link RetargetObjectReferences.OutputParams }
     * 
     */
    public RetargetObjectReferences.OutputParams createRetargetObjectReferencesOutputParams() {
        return new RetargetObjectReferences.OutputParams();
    }

    /**
     * Create an instance of {@link SegmentModel.InputParams }
     * 
     */
    public SegmentModel.InputParams createSegmentModelInputParams() {
        return new SegmentModel.InputParams();
    }

    /**
     * Create an instance of {@link SelectDataSourceCredentials.InputParams }
     * 
     */
    public SelectDataSourceCredentials.InputParams createSelectDataSourceCredentialsInputParams() {
        return new SelectDataSourceCredentials.InputParams();
    }

    /**
     * Create an instance of {@link SetSecurityViewAccess.InputParams }
     * 
     */
    public SetSecurityViewAccess.InputParams createSetSecurityViewAccessInputParams() {
        return new SetSecurityViewAccess.InputParams();
    }

    /**
     * Create an instance of {@link TestDataSource.InputParams }
     * 
     */
    public TestDataSource.InputParams createTestDataSourceInputParams() {
        return new TestDataSource.InputParams();
    }

    /**
     * Create an instance of {@link TransformFunction.InputParams }
     * 
     */
    public TransformFunction.InputParams createTransformFunctionInputParams() {
        return new TransformFunction.InputParams();
    }

    /**
     * Create an instance of {@link TransformQueryItemUsage.InputParams }
     * 
     */
    public TransformQueryItemUsage.InputParams createTransformQueryItemUsageInputParams() {
        return new TransformQueryItemUsage.InputParams();
    }

    /**
     * Create an instance of {@link TranslateReference.InputParams }
     * 
     */
    public TranslateReference.InputParams createTranslateReferenceInputParams() {
        return new TranslateReference.InputParams();
    }

    /**
     * Create an instance of {@link TranslateReference.OutputParams }
     * 
     */
    public TranslateReference.OutputParams createTranslateReferenceOutputParams() {
        return new TranslateReference.OutputParams();
    }

    /**
     * Create an instance of {@link Verify.InputParams }
     * 
     */
    public Verify.InputParams createVerifyInputParams() {
        return new Verify.InputParams();
    }

    /**
     * Create an instance of {@link VerifyCMAuthentication }
     * 
     */
    public VerifyCMAuthentication createVerifyCMAuthentication() {
        return new VerifyCMAuthentication();
    }

    /**
     * Create an instance of {@link UpdateQuerySubject.InputParams }
     * 
     */
    public UpdateQuerySubject.InputParams createUpdateQuerySubjectInputParams() {
        return new UpdateQuerySubject.InputParams();
    }

    /**
     * Create an instance of {@link UpdateQuerySubject.OutputParams }
     * 
     */
    public UpdateQuerySubject.OutputParams createUpdateQuerySubjectOutputParams() {
        return new UpdateQuerySubject.OutputParams();
    }

    /**
     * Create an instance of {@link CreateRemainingRelationships.InputParams }
     * 
     */
    public CreateRemainingRelationships.InputParams createCreateRemainingRelationshipsInputParams() {
        return new CreateRemainingRelationships.InputParams();
    }

    /**
     * Create an instance of {@link ImportIQD.InputParams }
     * 
     */
    public ImportIQD.InputParams createImportIQDInputParams() {
        return new ImportIQD.InputParams();
    }

    /**
     * Create an instance of {@link TestConnectionString.InputParams }
     * 
     */
    public TestConnectionString.InputParams createTestConnectionStringInputParams() {
        return new TestConnectionString.InputParams();
    }

    /**
     * Create an instance of {@link LocaleCollection }
     * 
     */
    public LocaleCollection createLocaleCollection() {
        return new LocaleCollection();
    }

    /**
     * Create an instance of {@link StringCollection }
     * 
     */
    public StringCollection createStringCollection() {
        return new StringCollection();
    }

    /**
     * Create an instance of {@link OptionalLocaleCollection }
     * 
     */
    public OptionalLocaleCollection createOptionalLocaleCollection() {
        return new OptionalLocaleCollection();
    }

    /**
     * Create an instance of {@link ComplexPropertyValue }
     * 
     */
    public ComplexPropertyValue createComplexPropertyValue() {
        return new ComplexPropertyValue();
    }

    /**
     * Create an instance of {@link SimplePropertyValue }
     * 
     */
    public SimplePropertyValue createSimplePropertyValue() {
        return new SimplePropertyValue();
    }

    /**
     * Create an instance of {@link Transaction.GetObjectAccess.InputParams }
     * 
     */
    public Transaction.GetObjectAccess.InputParams createTransactionGetObjectAccessInputParams() {
        return new Transaction.GetObjectAccess.InputParams();
    }

    /**
     * Create an instance of {@link Transaction.GetObjectAccess.OutputParams }
     * 
     */
    public Transaction.GetObjectAccess.OutputParams createTransactionGetObjectAccessOutputParams() {
        return new Transaction.GetObjectAccess.OutputParams();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "externalizeQuerySubjects", scope = Verify.InputParams.class, defaultValue = "0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVerifyInputParamsExternalizeQuerySubjects(String value) {
        return new JAXBElement<String>(_VerifyInputParamsExternalizeQuerySubjects_QNAME, String.class, Verify.InputParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "deleteProperty", scope = Verify.InputParams.class)
    public JAXBElement<String> createVerifyInputParamsDeleteProperty(String value) {
        return new JAXBElement<String>(_VerifyInputParamsDeleteProperty_QNAME, String.class, Verify.InputParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "verifyCreateID", scope = Verify.InputParams.class)
    public JAXBElement<BigInteger> createVerifyInputParamsVerifyCreateID(BigInteger value) {
        return new JAXBElement<BigInteger>(_VerifyInputParamsVerifyCreateID_QNAME, BigInteger.class, Verify.InputParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocaleCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "applyLocales", scope = Verify.InputParams.class)
    public JAXBElement<LocaleCollection> createVerifyInputParamsApplyLocales(LocaleCollection value) {
        return new JAXBElement<LocaleCollection>(_VerifyInputParamsApplyLocales_QNAME, LocaleCollection.class, Verify.InputParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "temporaryRetentionValue", scope = Verify.InputParams.class)
    public JAXBElement<BigInteger> createVerifyInputParamsTemporaryRetentionValue(BigInteger value) {
        return new JAXBElement<BigInteger>(_VerifyInputParamsTemporaryRetentionValue_QNAME, BigInteger.class, Verify.InputParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "verifyImportTranslationsID", scope = Verify.InputParams.class)
    public JAXBElement<BigInteger> createVerifyInputParamsVerifyImportTranslationsID(BigInteger value) {
        return new JAXBElement<BigInteger>(_VerifyInputParamsVerifyImportTranslationsID_QNAME, BigInteger.class, Verify.InputParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "simpleProperty", scope = Verify.InputParams.class)
    public JAXBElement<String> createVerifyInputParamsSimpleProperty(String value) {
        return new JAXBElement<String>(_VerifyInputParamsSimpleProperty_QNAME, String.class, Verify.InputParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "importTranslationsRootObject", scope = Verify.InputParams.class)
    public JAXBElement<Object> createVerifyInputParamsImportTranslationsRootObject(Object value) {
        return new JAXBElement<Object>(_VerifyInputParamsImportTranslationsRootObject_QNAME, Object.class, Verify.InputParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "verifyDeleteID", scope = Verify.InputParams.class)
    public JAXBElement<BigInteger> createVerifyInputParamsVerifyDeleteID(BigInteger value) {
        return new JAXBElement<BigInteger>(_VerifyInputParamsVerifyDeleteID_QNAME, BigInteger.class, Verify.InputParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimplePropertyValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "newSimpleValue", scope = Verify.InputParams.class)
    public JAXBElement<SimplePropertyValue> createVerifyInputParamsNewSimpleValue(SimplePropertyValue value) {
        return new JAXBElement<SimplePropertyValue>(_VerifyInputParamsNewSimpleValue_QNAME, SimplePropertyValue.class, Verify.InputParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "objectType", scope = Verify.InputParams.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVerifyInputParamsObjectType(String value) {
        return new JAXBElement<String>(_VerifyInputParamsObjectType_QNAME, String.class, Verify.InputParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "permanentRetentionValue", scope = Verify.InputParams.class)
    public JAXBElement<BigInteger> createVerifyInputParamsPermanentRetentionValue(BigInteger value) {
        return new JAXBElement<BigInteger>(_VerifyInputParamsPermanentRetentionValue_QNAME, BigInteger.class, Verify.InputParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "verifyMoveID", scope = Verify.InputParams.class)
    public JAXBElement<BigInteger> createVerifyInputParamsVerifyMoveID(BigInteger value) {
        return new JAXBElement<BigInteger>(_VerifyInputParamsVerifyMoveID_QNAME, BigInteger.class, Verify.InputParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "moveObject", scope = Verify.InputParams.class)
    public JAXBElement<String> createVerifyInputParamsMoveObject(String value) {
        return new JAXBElement<String>(_VerifyInputParamsMoveObject_QNAME, String.class, Verify.InputParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "deleteObject", scope = Verify.InputParams.class)
    public JAXBElement<String> createVerifyInputParamsDeleteObject(String value) {
        return new JAXBElement<String>(_VerifyInputParamsDeleteObject_QNAME, String.class, Verify.InputParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "verifyPublishID", scope = Verify.InputParams.class)
    public JAXBElement<BigInteger> createVerifyInputParamsVerifyPublishID(BigInteger value) {
        return new JAXBElement<BigInteger>(_VerifyInputParamsVerifyPublishID_QNAME, BigInteger.class, Verify.InputParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "keyLocale", scope = Verify.InputParams.class)
    public JAXBElement<String> createVerifyInputParamsKeyLocale(String value) {
        return new JAXBElement<String>(_VerifyInputParamsKeyLocale_QNAME, String.class, Verify.InputParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "verifyModifyID", scope = Verify.InputParams.class)
    public JAXBElement<BigInteger> createVerifyInputParamsVerifyModifyID(BigInteger value) {
        return new JAXBElement<BigInteger>(_VerifyInputParamsVerifyModifyID_QNAME, BigInteger.class, Verify.InputParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "reportObject")
    public JAXBElement<String> createReportObject(String value) {
        return new JAXBElement<String>(_ReportObject_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "executionReportDetailLevel", defaultValue = "1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createExecutionReportDetailLevel(String value) {
        return new JAXBElement<String>(_ExecutionReportDetailLevel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "schemaPath")
    public JAXBElement<String> createSchemaPath(String value) {
        return new JAXBElement<String>(_SchemaPath_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "conformedDimensionCandidate")
    public JAXBElement<String> createConformedDimensionCandidate(String value) {
        return new JAXBElement<String>(_ConformedDimensionCandidate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "object")
    public JAXBElement<Object> createObject(Object value) {
        return new JAXBElement<Object>(_Object_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "gatewayURI")
    public JAXBElement<String> createGatewayURI(String value) {
        return new JAXBElement<String>(_GatewayURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "includeRule")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIncludeRule(String value) {
        return new JAXBElement<String>(_IncludeRule_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "shortcut")
    public JAXBElement<String> createShortcut(String value) {
        return new JAXBElement<String>(_Shortcut_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "externalizeReport")
    public JAXBElement<String> createExternalizeReport(String value) {
        return new JAXBElement<String>(_ExternalizeReport_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "crnDataSourceConnectionCubePassword")
    public JAXBElement<String> createCrnDataSourceConnectionCubePassword(String value) {
        return new JAXBElement<String>(_CrnDataSourceConnectionCubePassword_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "dataSource")
    public JAXBElement<String> createDataSource(String value) {
        return new JAXBElement<String>(_DataSource_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "importSourceSpecDataSource")
    public JAXBElement<String> createImportSourceSpecDataSource(String value) {
        return new JAXBElement<String>(_ImportSourceSpecDataSource_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "targetPackageName")
    public JAXBElement<String> createTargetPackageName(String value) {
        return new JAXBElement<String>(_TargetPackageName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "joinOptionProcessExternalJoins")
    public JAXBElement<Boolean> createJoinOptionProcessExternalJoins(Boolean value) {
        return new JAXBElement<Boolean>(_JoinOptionProcessExternalJoins_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "joinOptionProcessOuterJoinOption")
    public JAXBElement<Boolean> createJoinOptionProcessOuterJoinOption(Boolean value) {
        return new JAXBElement<Boolean>(_JoinOptionProcessOuterJoinOption_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "maximumRowsToBeRetrieved")
    public JAXBElement<BigInteger> createMaximumRowsToBeRetrieved(BigInteger value) {
        return new JAXBElement<BigInteger>(_MaximumRowsToBeRetrieved_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "targetContainer")
    public JAXBElement<String> createTargetContainer(String value) {
        return new JAXBElement<String>(_TargetContainer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "joinOptionProcessInternalJoins")
    public JAXBElement<Boolean> createJoinOptionProcessInternalJoins(Boolean value) {
        return new JAXBElement<Boolean>(_JoinOptionProcessInternalJoins_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "promptValue")
    public JAXBElement<String> createPromptValue(String value) {
        return new JAXBElement<String>(_PromptValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "updateSubject")
    public JAXBElement<String> createUpdateSubject(String value) {
        return new JAXBElement<String>(_UpdateSubject_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "dataSourceName")
    public JAXBElement<String> createDataSourceName(String value) {
        return new JAXBElement<String>(_DataSourceName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "nameConflictOptionImport")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNameConflictOptionImport(String value) {
        return new JAXBElement<String>(_NameConflictOptionImport_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "newObjectName")
    public JAXBElement<String> createNewObjectName(String value) {
        return new JAXBElement<String>(_NewObjectName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "joinOptionProcessKeys")
    public JAXBElement<Boolean> createJoinOptionProcessKeys(Boolean value) {
        return new JAXBElement<Boolean>(_JoinOptionProcessKeys_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "packageExists")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPackageExists(String value) {
        return new JAXBElement<String>(_PackageExists_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "parameterValue")
    public JAXBElement<String> createParameterValue(String value) {
        return new JAXBElement<String>(_ParameterValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "CloseQueryServicesConnection")
    public JAXBElement<Object> createCloseQueryServicesConnection(Object value) {
        return new JAXBElement<Object>(_CloseQueryServicesConnection_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "schemaName")
    public JAXBElement<String> createSchemaName(String value) {
        return new JAXBElement<String>(_SchemaName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "multidimensionalDimension")
    public JAXBElement<String> createMultidimensionalDimension(String value) {
        return new JAXBElement<String>(_MultidimensionalDimension_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "crnDataSourceConnectionName")
    public JAXBElement<String> createCrnDataSourceConnectionName(String value) {
        return new JAXBElement<String>(_CrnDataSourceConnectionName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "objectAccess")
    public JAXBElement<String> createObjectAccess(String value) {
        return new JAXBElement<String>(_ObjectAccess_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "querySubject")
    public JAXBElement<String> createQuerySubject(String value) {
        return new JAXBElement<String>(_QuerySubject_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "storedProcedureOptionThrowExceptionOption")
    public JAXBElement<Boolean> createStoredProcedureOptionThrowExceptionOption(Boolean value) {
        return new JAXBElement<Boolean>(_StoredProcedureOptionThrowExceptionOption_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "selectedObjectsProcessingLevel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSelectedObjectsProcessingLevel(String value) {
        return new JAXBElement<String>(_SelectedObjectsProcessingLevel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "targetDimension")
    public JAXBElement<String> createTargetDimension(String value) {
        return new JAXBElement<String>(_TargetDimension_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "translationsFilePath")
    public JAXBElement<String> createTranslationsFilePath(String value) {
        return new JAXBElement<String>(_TranslationsFilePath_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "catalogName")
    public JAXBElement<String> createCatalogName(String value) {
        return new JAXBElement<String>(_CatalogName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "modelPath")
    public JAXBElement<String> createModelPath(String value) {
        return new JAXBElement<String>(_ModelPath_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "joinOptionProcessMatchingIndexColumns")
    public JAXBElement<Boolean> createJoinOptionProcessMatchingIndexColumns(Boolean value) {
        return new JAXBElement<Boolean>(_JoinOptionProcessMatchingIndexColumns_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "roleBasedPackage")
    public JAXBElement<String> createRoleBasedPackage(String value) {
        return new JAXBElement<String>(_RoleBasedPackage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "targetParent")
    public JAXBElement<String> createTargetParent(String value) {
        return new JAXBElement<String>(_TargetParent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "securityViewOrPackage")
    public JAXBElement<String> createSecurityViewOrPackage(String value) {
        return new JAXBElement<String>(_SecurityViewOrPackage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "expression")
    public JAXBElement<String> createExpression(String value) {
        return new JAXBElement<String>(_Expression_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "regularPackage")
    public JAXBElement<String> createRegularPackage(String value) {
        return new JAXBElement<String>(_RegularPackage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "crnDataSourceConnectionCubePasswordEncrypted")
    public JAXBElement<BigInteger> createCrnDataSourceConnectionCubePasswordEncrypted(BigInteger value) {
        return new JAXBElement<BigInteger>(_CrnDataSourceConnectionCubePasswordEncrypted_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "publishTargetType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPublishTargetType(String value) {
        return new JAXBElement<String>(_PublishTargetType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "joinOptionProcessMatchingQueryItemNames")
    public JAXBElement<Boolean> createJoinOptionProcessMatchingQueryItemNames(Boolean value) {
        return new JAXBElement<Boolean>(_JoinOptionProcessMatchingQueryItemNames_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "cubeName")
    public JAXBElement<String> createCubeName(String value) {
        return new JAXBElement<String>(_CubeName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "crnDataSourceConnectionSignonName")
    public JAXBElement<String> createCrnDataSourceConnectionSignonName(String value) {
        return new JAXBElement<String>(_CrnDataSourceConnectionSignonName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "parameterMap")
    public JAXBElement<Object> createParameterMap(Object value) {
        return new JAXBElement<Object>(_ParameterMap_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "displaySummaryMessageOption")
    public JAXBElement<Boolean> createDisplaySummaryMessageOption(Boolean value) {
        return new JAXBElement<Boolean>(_DisplaySummaryMessageOption_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "parameterName")
    public JAXBElement<String> createParameterName(String value) {
        return new JAXBElement<String>(_ParameterName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "modelLocale")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createModelLocale(String value) {
        return new JAXBElement<String>(_ModelLocale_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "dependencySpec")
    public JAXBElement<String> createDependencySpec(String value) {
        return new JAXBElement<String>(_DependencySpec_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "querySubjectOrDimension")
    public JAXBElement<String> createQuerySubjectOrDimension(String value) {
        return new JAXBElement<String>(_QuerySubjectOrDimension_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "promptName")
    public JAXBElement<String> createPromptName(String value) {
        return new JAXBElement<String>(_PromptName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "linkSegmentRootObject")
    public JAXBElement<Object> createLinkSegmentRootObject(Object value) {
        return new JAXBElement<Object>(_LinkSegmentRootObject_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "createAutoSummary")
    public JAXBElement<Boolean> createCreateAutoSummary(Boolean value) {
        return new JAXBElement<Boolean>(_CreateAutoSummary_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "importSourceSpec")
    public JAXBElement<String> createImportSourceSpec(String value) {
        return new JAXBElement<String>(_ImportSourceSpec_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "importSourceSpecModel")
    public JAXBElement<String> createImportSourceSpecModel(String value) {
        return new JAXBElement<String>(_ImportSourceSpecModel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "sourceObject")
    public JAXBElement<String> createSourceObject(String value) {
        return new JAXBElement<String>(_SourceObject_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "crnDataSourceConnectionSignonUser")
    public JAXBElement<String> createCrnDataSourceConnectionSignonUser(String value) {
        return new JAXBElement<String>(_CrnDataSourceConnectionSignonUser_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "reportItemOrReportItemContainer")
    public JAXBElement<String> createReportItemOrReportItemContainer(String value) {
        return new JAXBElement<String>(_ReportItemOrReportItemContainer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "targetLocation")
    public JAXBElement<String> createTargetLocation(String value) {
        return new JAXBElement<String>(_TargetLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "nameConflictOptionCreate", defaultValue = "1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNameConflictOptionCreate(String value) {
        return new JAXBElement<String>(_NameConflictOptionCreate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "crnDataSourceConnectionSignonPassword")
    public JAXBElement<String> createCrnDataSourceConnectionSignonPassword(String value) {
        return new JAXBElement<String>(_CrnDataSourceConnectionSignonPassword_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "queryItemOrCalculation")
    public JAXBElement<String> createQueryItemOrCalculation(String value) {
        return new JAXBElement<String>(_QueryItemOrCalculation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "crnDataSourceName")
    public JAXBElement<String> createCrnDataSourceName(String value) {
        return new JAXBElement<String>(_CrnDataSourceName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "qsapiResponseSpec")
    public JAXBElement<String> createQsapiResponseSpec(String value) {
        return new JAXBElement<String>(_QsapiResponseSpec_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "externalizeRootDirectory")
    public JAXBElement<String> createExternalizeRootDirectory(String value) {
        return new JAXBElement<String>(_ExternalizeRootDirectory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptionalLocaleCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "sapbwImportLocales", scope = DBImport.InputParams.class)
    public JAXBElement<OptionalLocaleCollection> createDBImportInputParamsSapbwImportLocales(OptionalLocaleCollection value) {
        return new JAXBElement<OptionalLocaleCollection>(_DBImportInputParamsSapbwImportLocales_QNAME, OptionalLocaleCollection.class, DBImport.InputParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "sapbwImportOptionObjectOrganization", scope = DBImport.InputParams.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDBImportInputParamsSapbwImportOptionObjectOrganization(String value) {
        return new JAXBElement<String>(_DBImportInputParamsSapbwImportOptionObjectOrganization_QNAME, String.class, DBImport.InputParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "sapbwImportOptionCreateConformedDimensions", scope = DBImport.InputParams.class)
    public JAXBElement<Object> createDBImportInputParamsSapbwImportOptionCreateConformedDimensions(Object value) {
        return new JAXBElement<Object>(_DBImportInputParamsSapbwImportOptionCreateConformedDimensions_QNAME, Object.class, DBImport.InputParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "sapbwImportOptionUseOrLongNames", scope = DBImport.InputParams.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDBImportInputParamsSapbwImportOptionUseOrLongNames(String value) {
        return new JAXBElement<String>(_DBImportInputParamsSapbwImportOptionUseOrLongNames_QNAME, String.class, DBImport.InputParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "securityView", scope = SetSecurityViewDefinition.InputParams.class)
    public JAXBElement<String> createSetSecurityViewDefinitionInputParamsSecurityView(String value) {
        return new JAXBElement<String>(_SetSecurityViewDefinitionInputParamsSecurityView_QNAME, String.class, SetSecurityViewDefinition.InputParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "deleteProperty", scope = Delete.InputParams.class)
    public JAXBElement<String> createDeleteInputParamsDeleteProperty(String value) {
        return new JAXBElement<String>(_VerifyInputParamsDeleteProperty_QNAME, String.class, Delete.InputParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", name = "deleteObject", scope = Delete.InputParams.class)
    public JAXBElement<String> createDeleteInputParamsDeleteObject(String value) {
        return new JAXBElement<String>(_VerifyInputParamsDeleteObject_QNAME, String.class, Delete.InputParams.class, value);
    }

}
