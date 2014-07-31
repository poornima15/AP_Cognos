
package com.jda.ap.bi.bind.mdactions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;para xmlns:fmsdk="http://www.developer.cognos.com/schemas/fmsdk/1/0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Every action element is encoded in the action logs as an action and its type attribute is set to the name of the element. For example, the element AddLocale is encoded as an action element in the action logs, with its type attribute set to AddLocale. For an example of this encoding, see the Sample action log entry for the AddLocale element. &lt;/para&gt;
 * </pre>
 * 
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;para xmlns:fmsdk="http://www.developer.cognos.com/schemas/fmsdk/1/0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Note: The action element is documented in the Metadata Provider (Wrapper) Reference. &lt;/para&gt;
 * </pre>
 * 
 * 
 * 
 * <p>Java class for action complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="action">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "action", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
@XmlSeeAlso({
    TestConnectionString.class,
    ImportIQD.class,
    CreateRemainingRelationships.class,
    VerifyCMAuthentication.class,
    Verify.class,
    TranslateReference.class,
    TransformQueryItemUsage.class,
    TransformFunction.class,
    TestDataSource.class,
    SetSecurityViewAccess.class,
    SelectDataSourceCredentials.class,
    SegmentModel.class,
    RetargetObjectReferences.class,
    ResetPromptValues.class,
    RepairReports.class,
    RemoveLocale.class,
    PopulateParameterMap.class,
    ModifyComplex.class,
    Modify.class,
    ModelDiff.class,
    ModelBrowse.class,
    MakeObjectNameUnique.class,
    MakeExpressionGlobal.class,
    LinkModel.class,
    IsModelViewPresent.class,
    ImportTranslations.class,
    GetRuntimeParameters.class,
    GetQueryProcessingMode.class,
    GetNearestCommonParentObject.class,
    GetDataSourceInfo.class,
    GetDataSourceConnectionSelections.class,
    FindOrCreateDataSource.class,
    ExpressionQuery.class,
    ExplainLogFile.class,
    ExpandParameters.class,
    EvaluateSecurityView.class,
    DoUpgrade.class,
    DoReportsExist.class,
    Delete.class,
    DBRelationshipPath.class,
    DBImport.class,
    DBBrowse.class,
    CreateCalculationInFolder.class,
    Copy.class,
    ConformedDimensionsCandidates.class,
    ClearDataSourceCache.class,
    Cancel.class,
    AddProperty.class,
    AddLocale.class,
    GetCandidateRelationships.class,
    GetObjectAncestry.class,
    GetSecurityObjectUsage.class,
    SetPromptValue.class,
    CreateShortcut.class,
    TransformQueryItemAggregateRule.class,
    DoDependencyAnalysis.class,
    SetDefaultLocale.class,
    DBStoredProcedure.class,
    ConformedDimensionsDetect.class,
    SetPackageLocales.class,
    GetContentManagerGateway.class,
    ExportTranslations.class,
    BuildObjectReference.class,
    TestQuerySubject.class,
    Merge.class,
    Create.class,
    TransformCreateStarGrouping.class,
    ModelImport.class,
    CheckModel.class,
    PreviewSecurityFilter.class,
    DynamicImportPublish.class,
    SetActiveLocale.class,
    UseContentManager4Authentication.class,
    GetPassportFromCM.class,
    ReorderBefore.class,
    ConformedDimensionsCreate.class,
    Publish.class,
    GetDefaultLocale.class,
    Move.class,
    DoQueryServicesRequest.class,
    GetSupportedLocales.class,
    SetSecurityViewDefinition.class,
    TransformObjectNames.class,
    SQLPlanAssociation.class,
    GetApplicationVersion.class,
    DBRelease.class,
    CountQuerySubject.class,
    SetObjectAccess.class,
    SelectDataSourceDom.class,
    GetPromptValues.class,
    GetPackageInclusionsForObject.class,
    SelectDataSourceConnection.class,
    ShouldUpgrade.class,
    SetRuntimeParameters.class,
    SetQueryItemParameterMap.class,
    ShowImpact.class,
    Repair.class,
    RemoveRuntimeParameters.class,
    TransformRelationship.class,
    DBMakePhysicalSqlName.class,
    RetrieveQueryItemParameters.class,
    DBImportJoinsOnKeys.class,
    GetMatchingModelLocale.class,
    GenerateID.class
})
public class Action {


}
