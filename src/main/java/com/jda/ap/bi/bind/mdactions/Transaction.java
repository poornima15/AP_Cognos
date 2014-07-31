
package com.jda.ap.bi.bind.mdactions;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}AddLocale"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}AddProperty"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}BuildObjectReference"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}Cancel"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}CheckModel"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}ClearDataSourceCache"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}ConformedDimensionsCandidates"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}ConformedDimensionsCreate"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}ConformedDimensionsDetect"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}Copy"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}CountQuerySubject"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}Create"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}CreateCalculationInFolder"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}CreateShortcut"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}DBBrowse"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}DBImport"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}DBImportJoinsOnKeys"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}DBMakePhysicalSqlName"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}DBRelationshipPath"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}DBRelease"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}DBStoredProcedure"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}DoDependencyAnalysis"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}CloseQueryServicesConnection"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}Delete"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}DoReportsExist"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}DoQueryServicesRequest"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}doUpgrade"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}EvaluateSecurityView"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}ExpandParameters"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}ExplainLogFile"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}ExportTranslations"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}ExpressionQuery"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}externalizeQuerySubject"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}FindOrCreateDataSource"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}GenerateID"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}GetApplicationVersion"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}GetCandidateRelationships"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}GetContentManagerGateway"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}GetDataSourceConnectionSelections"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}GetDataSourceInfo"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}GetDefaultLocale"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}GetNearestCommonParentObject"/>
 *         &lt;element name="GetObjectAccess">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="inputParams">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}object" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="outputParams" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectAccess"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}GetObjectAncestry"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}GetPackageInclusionsForObject"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}GetPassportFromCM"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}GetPromptValues"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}GetQueryProcessingMode"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}GetRuntimeParameters"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}GetSecurityObjectUsage"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}GetSupportedLocales"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}ImportTranslations"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}IsModelViewPresent"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}LinkModel"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}MakeExpressionGlobal"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}MakeObjectNameUnique"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}Merge"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}ModelBrowse"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}ModelDiff"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}ModelImport"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}Modify"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}ModifyComplex"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}Move"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}PopulateParameterMap"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}PreviewSecurityFilter"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}Publish"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}RemoveLocale"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}RemoveRuntimeParameters"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}ReorderBefore"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}Repair"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}RepairReports"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}ResetPromptValues"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}RetargetObjectReferences"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}RetrieveQueryItemParameters"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}SegmentModel"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}SelectDataSourceConnection"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}SelectDataSourceCredentials"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}SelectDataSourceDom"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}SetActiveLocale"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}SetDefaultLocale"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}SetObjectAccess"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}SetPackageLocales"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}SetPromptValue"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}SetQueryItemParameterMap"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}SetSecurityViewAccess"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}SetRuntimeParameters"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}SetSecurityViewDefinition"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}shouldUpgrade"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}ShowImpact"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}SQLPlanAssociation"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}TestDataSource"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}TestQuerySubject"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}TransformCreateStarGrouping"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}TransformFunction"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}TransformObjectNames"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}TransformQueryItemAggregateRule"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}TransformQueryItemUsage"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}TransformRelationship"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}TranslateReference"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}UseContentManager4Authentication"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}Verify"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}VerifyCMAuthentication"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}GetAllPackages"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}EvaluateObject"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}UpdateQuerySubject"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addLocaleOrAddPropertyOrBuildObjectReference"
})
@XmlRootElement(name = "transaction", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class Transaction {

    @XmlElements({
        @XmlElement(name = "AddLocale", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = AddLocale.class),
        @XmlElement(name = "AddProperty", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = AddProperty.class),
        @XmlElement(name = "BuildObjectReference", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = BuildObjectReference.class),
        @XmlElement(name = "Cancel", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = Cancel.class),
        @XmlElement(name = "CheckModel", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = CheckModel.class),
        @XmlElement(name = "ClearDataSourceCache", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = ClearDataSourceCache.class),
        @XmlElement(name = "ConformedDimensionsCandidates", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = ConformedDimensionsCandidates.class),
        @XmlElement(name = "ConformedDimensionsCreate", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = ConformedDimensionsCreate.class),
        @XmlElement(name = "ConformedDimensionsDetect", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = ConformedDimensionsDetect.class),
        @XmlElement(name = "Copy", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = Copy.class),
        @XmlElement(name = "CountQuerySubject", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = CountQuerySubject.class),
        @XmlElement(name = "Create", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = Create.class),
        @XmlElement(name = "CreateCalculationInFolder", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = CreateCalculationInFolder.class),
        @XmlElement(name = "CreateShortcut", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = CreateShortcut.class),
        @XmlElement(name = "DBBrowse", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = DBBrowse.class),
        @XmlElement(name = "DBImport", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = DBImport.class),
        @XmlElement(name = "DBImportJoinsOnKeys", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = DBImportJoinsOnKeys.class),
        @XmlElement(name = "DBMakePhysicalSqlName", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = DBMakePhysicalSqlName.class),
        @XmlElement(name = "DBRelationshipPath", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = DBRelationshipPath.class),
        @XmlElement(name = "DBRelease", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = DBRelease.class),
        @XmlElement(name = "DBStoredProcedure", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = DBStoredProcedure.class),
        @XmlElement(name = "DoDependencyAnalysis", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = DoDependencyAnalysis.class),
        @XmlElement(name = "CloseQueryServicesConnection", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0"),
        @XmlElement(name = "Delete", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = Delete.class),
        @XmlElement(name = "DoReportsExist", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = DoReportsExist.class),
        @XmlElement(name = "DoQueryServicesRequest", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = DoQueryServicesRequest.class),
        @XmlElement(name = "doUpgrade", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = DoUpgrade.class),
        @XmlElement(name = "EvaluateSecurityView", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = EvaluateSecurityView.class),
        @XmlElement(name = "ExpandParameters", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = ExpandParameters.class),
        @XmlElement(name = "ExplainLogFile", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = ExplainLogFile.class),
        @XmlElement(name = "ExportTranslations", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = ExportTranslations.class),
        @XmlElement(name = "ExpressionQuery", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = ExpressionQuery.class),
        @XmlElement(name = "externalizeQuerySubject", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = ExternalizeQuerySubject.class),
        @XmlElement(name = "FindOrCreateDataSource", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = FindOrCreateDataSource.class),
        @XmlElement(name = "GenerateID", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = GenerateID.class),
        @XmlElement(name = "GetApplicationVersion", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = GetApplicationVersion.class),
        @XmlElement(name = "GetCandidateRelationships", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = GetCandidateRelationships.class),
        @XmlElement(name = "GetContentManagerGateway", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = GetContentManagerGateway.class),
        @XmlElement(name = "GetDataSourceConnectionSelections", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = GetDataSourceConnectionSelections.class),
        @XmlElement(name = "GetDataSourceInfo", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = GetDataSourceInfo.class),
        @XmlElement(name = "GetDefaultLocale", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = GetDefaultLocale.class),
        @XmlElement(name = "GetNearestCommonParentObject", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = GetNearestCommonParentObject.class),
        @XmlElement(name = "GetObjectAccess", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = Transaction.GetObjectAccess.class),
        @XmlElement(name = "GetObjectAncestry", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = GetObjectAncestry.class),
        @XmlElement(name = "GetPackageInclusionsForObject", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = GetPackageInclusionsForObject.class),
        @XmlElement(name = "GetPassportFromCM", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = GetPassportFromCM.class),
        @XmlElement(name = "GetPromptValues", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = GetPromptValues.class),
        @XmlElement(name = "GetQueryProcessingMode", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = GetQueryProcessingMode.class),
        @XmlElement(name = "GetRuntimeParameters", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = GetRuntimeParameters.class),
        @XmlElement(name = "GetSecurityObjectUsage", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = GetSecurityObjectUsage.class),
        @XmlElement(name = "GetSupportedLocales", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = GetSupportedLocales.class),
        @XmlElement(name = "ImportTranslations", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = ImportTranslations.class),
        @XmlElement(name = "IsModelViewPresent", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = IsModelViewPresent.class),
        @XmlElement(name = "LinkModel", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = LinkModel.class),
        @XmlElement(name = "MakeExpressionGlobal", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = MakeExpressionGlobal.class),
        @XmlElement(name = "MakeObjectNameUnique", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = MakeObjectNameUnique.class),
        @XmlElement(name = "Merge", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = Merge.class),
        @XmlElement(name = "ModelBrowse", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = ModelBrowse.class),
        @XmlElement(name = "ModelDiff", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = ModelDiff.class),
        @XmlElement(name = "ModelImport", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = ModelImport.class),
        @XmlElement(name = "Modify", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = Modify.class),
        @XmlElement(name = "ModifyComplex", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = ModifyComplex.class),
        @XmlElement(name = "Move", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = Move.class),
        @XmlElement(name = "PopulateParameterMap", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = PopulateParameterMap.class),
        @XmlElement(name = "PreviewSecurityFilter", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = PreviewSecurityFilter.class),
        @XmlElement(name = "Publish", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = Publish.class),
        @XmlElement(name = "RemoveLocale", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = RemoveLocale.class),
        @XmlElement(name = "RemoveRuntimeParameters", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = RemoveRuntimeParameters.class),
        @XmlElement(name = "ReorderBefore", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = ReorderBefore.class),
        @XmlElement(name = "Repair", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = Repair.class),
        @XmlElement(name = "RepairReports", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = RepairReports.class),
        @XmlElement(name = "ResetPromptValues", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = ResetPromptValues.class),
        @XmlElement(name = "RetargetObjectReferences", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = RetargetObjectReferences.class),
        @XmlElement(name = "RetrieveQueryItemParameters", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = RetrieveQueryItemParameters.class),
        @XmlElement(name = "SegmentModel", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = SegmentModel.class),
        @XmlElement(name = "SelectDataSourceConnection", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = SelectDataSourceConnection.class),
        @XmlElement(name = "SelectDataSourceCredentials", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = SelectDataSourceCredentials.class),
        @XmlElement(name = "SelectDataSourceDom", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = SelectDataSourceDom.class),
        @XmlElement(name = "SetActiveLocale", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = SetActiveLocale.class),
        @XmlElement(name = "SetDefaultLocale", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = SetDefaultLocale.class),
        @XmlElement(name = "SetObjectAccess", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = SetObjectAccess.class),
        @XmlElement(name = "SetPackageLocales", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = SetPackageLocales.class),
        @XmlElement(name = "SetPromptValue", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = SetPromptValue.class),
        @XmlElement(name = "SetQueryItemParameterMap", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = SetQueryItemParameterMap.class),
        @XmlElement(name = "SetSecurityViewAccess", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = SetSecurityViewAccess.class),
        @XmlElement(name = "SetRuntimeParameters", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = SetRuntimeParameters.class),
        @XmlElement(name = "SetSecurityViewDefinition", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = SetSecurityViewDefinition.class),
        @XmlElement(name = "shouldUpgrade", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = ShouldUpgrade.class),
        @XmlElement(name = "ShowImpact", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = ShowImpact.class),
        @XmlElement(name = "SQLPlanAssociation", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = SQLPlanAssociation.class),
        @XmlElement(name = "TestDataSource", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = TestDataSource.class),
        @XmlElement(name = "TestQuerySubject", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = TestQuerySubject.class),
        @XmlElement(name = "TransformCreateStarGrouping", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = TransformCreateStarGrouping.class),
        @XmlElement(name = "TransformFunction", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = TransformFunction.class),
        @XmlElement(name = "TransformObjectNames", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = TransformObjectNames.class),
        @XmlElement(name = "TransformQueryItemAggregateRule", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = TransformQueryItemAggregateRule.class),
        @XmlElement(name = "TransformQueryItemUsage", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = TransformQueryItemUsage.class),
        @XmlElement(name = "TransformRelationship", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = TransformRelationship.class),
        @XmlElement(name = "TranslateReference", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = TranslateReference.class),
        @XmlElement(name = "UseContentManager4Authentication", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = UseContentManager4Authentication.class),
        @XmlElement(name = "Verify", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = Verify.class),
        @XmlElement(name = "VerifyCMAuthentication", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = VerifyCMAuthentication.class),
        @XmlElement(name = "GetAllPackages", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = GetAllPackages.class),
        @XmlElement(name = "EvaluateObject", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = EvaluateObject.class),
        @XmlElement(name = "UpdateQuerySubject", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = UpdateQuerySubject.class)
    })
    protected List<Object> addLocaleOrAddPropertyOrBuildObjectReference;

    /**
     * Gets the value of the addLocaleOrAddPropertyOrBuildObjectReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addLocaleOrAddPropertyOrBuildObjectReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddLocaleOrAddPropertyOrBuildObjectReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddLocale }
     * {@link AddProperty }
     * {@link BuildObjectReference }
     * {@link Cancel }
     * {@link CheckModel }
     * {@link ClearDataSourceCache }
     * {@link ConformedDimensionsCandidates }
     * {@link ConformedDimensionsCreate }
     * {@link ConformedDimensionsDetect }
     * {@link Copy }
     * {@link CountQuerySubject }
     * {@link Create }
     * {@link CreateCalculationInFolder }
     * {@link CreateShortcut }
     * {@link DBBrowse }
     * {@link DBImport }
     * {@link DBImportJoinsOnKeys }
     * {@link DBMakePhysicalSqlName }
     * {@link DBRelationshipPath }
     * {@link DBRelease }
     * {@link DBStoredProcedure }
     * {@link DoDependencyAnalysis }
     * {@link Object }
     * {@link Delete }
     * {@link DoReportsExist }
     * {@link DoQueryServicesRequest }
     * {@link DoUpgrade }
     * {@link EvaluateSecurityView }
     * {@link ExpandParameters }
     * {@link ExplainLogFile }
     * {@link ExportTranslations }
     * {@link ExpressionQuery }
     * {@link ExternalizeQuerySubject }
     * {@link FindOrCreateDataSource }
     * {@link GenerateID }
     * {@link GetApplicationVersion }
     * {@link GetCandidateRelationships }
     * {@link GetContentManagerGateway }
     * {@link GetDataSourceConnectionSelections }
     * {@link GetDataSourceInfo }
     * {@link GetDefaultLocale }
     * {@link GetNearestCommonParentObject }
     * {@link Transaction.GetObjectAccess }
     * {@link GetObjectAncestry }
     * {@link GetPackageInclusionsForObject }
     * {@link GetPassportFromCM }
     * {@link GetPromptValues }
     * {@link GetQueryProcessingMode }
     * {@link GetRuntimeParameters }
     * {@link GetSecurityObjectUsage }
     * {@link GetSupportedLocales }
     * {@link ImportTranslations }
     * {@link IsModelViewPresent }
     * {@link LinkModel }
     * {@link MakeExpressionGlobal }
     * {@link MakeObjectNameUnique }
     * {@link Merge }
     * {@link ModelBrowse }
     * {@link ModelDiff }
     * {@link ModelImport }
     * {@link Modify }
     * {@link ModifyComplex }
     * {@link Move }
     * {@link PopulateParameterMap }
     * {@link PreviewSecurityFilter }
     * {@link Publish }
     * {@link RemoveLocale }
     * {@link RemoveRuntimeParameters }
     * {@link ReorderBefore }
     * {@link Repair }
     * {@link RepairReports }
     * {@link ResetPromptValues }
     * {@link RetargetObjectReferences }
     * {@link RetrieveQueryItemParameters }
     * {@link SegmentModel }
     * {@link SelectDataSourceConnection }
     * {@link SelectDataSourceCredentials }
     * {@link SelectDataSourceDom }
     * {@link SetActiveLocale }
     * {@link SetDefaultLocale }
     * {@link SetObjectAccess }
     * {@link SetPackageLocales }
     * {@link SetPromptValue }
     * {@link SetQueryItemParameterMap }
     * {@link SetSecurityViewAccess }
     * {@link SetRuntimeParameters }
     * {@link SetSecurityViewDefinition }
     * {@link ShouldUpgrade }
     * {@link ShowImpact }
     * {@link SQLPlanAssociation }
     * {@link TestDataSource }
     * {@link TestQuerySubject }
     * {@link TransformCreateStarGrouping }
     * {@link TransformFunction }
     * {@link TransformObjectNames }
     * {@link TransformQueryItemAggregateRule }
     * {@link TransformQueryItemUsage }
     * {@link TransformRelationship }
     * {@link TranslateReference }
     * {@link UseContentManager4Authentication }
     * {@link Verify }
     * {@link VerifyCMAuthentication }
     * {@link GetAllPackages }
     * {@link EvaluateObject }
     * {@link UpdateQuerySubject }
     * 
     * 
     */
    public List<Object> getAddLocaleOrAddPropertyOrBuildObjectReference() {
        if (addLocaleOrAddPropertyOrBuildObjectReference == null) {
            addLocaleOrAddPropertyOrBuildObjectReference = new ArrayList<Object>();
        }
        return this.addLocaleOrAddPropertyOrBuildObjectReference;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="inputParams">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}object" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="outputParams" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectAccess"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "inputParams",
        "outputParams"
    })
    public static class GetObjectAccess {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected Transaction.GetObjectAccess.InputParams inputParams;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected Transaction.GetObjectAccess.OutputParams outputParams;

        /**
         * Gets the value of the inputParams property.
         * 
         * @return
         *     possible object is
         *     {@link Transaction.GetObjectAccess.InputParams }
         *     
         */
        public Transaction.GetObjectAccess.InputParams getInputParams() {
            return inputParams;
        }

        /**
         * Sets the value of the inputParams property.
         * 
         * @param value
         *     allowed object is
         *     {@link Transaction.GetObjectAccess.InputParams }
         *     
         */
        public void setInputParams(Transaction.GetObjectAccess.InputParams value) {
            this.inputParams = value;
        }

        /**
         * Gets the value of the outputParams property.
         * 
         * @return
         *     possible object is
         *     {@link Transaction.GetObjectAccess.OutputParams }
         *     
         */
        public Transaction.GetObjectAccess.OutputParams getOutputParams() {
            return outputParams;
        }

        /**
         * Sets the value of the outputParams property.
         * 
         * @param value
         *     allowed object is
         *     {@link Transaction.GetObjectAccess.OutputParams }
         *     
         */
        public void setOutputParams(Transaction.GetObjectAccess.OutputParams value) {
            this.outputParams = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}object" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "object"
        })
        public static class InputParams {

            @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
            protected List<Object> object;

            /**
             * Gets the value of the object property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the object property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getObject().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getObject() {
                if (object == null) {
                    object = new ArrayList<Object>();
                }
                return this.object;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectAccess"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "objectAccess"
        })
        public static class OutputParams {

            @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
            protected String objectAccess;

            /**
             * Gets the value of the objectAccess property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getObjectAccess() {
                return objectAccess;
            }

            /**
             * Sets the value of the objectAccess property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setObjectAccess(String value) {
                this.objectAccess = value;
            }

        }

    }

}
