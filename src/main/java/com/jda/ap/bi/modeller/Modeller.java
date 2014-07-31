package com.jda.ap.bi.modeller;


import com.cognos.developer.schemas.bmt._60._7.*;
import com.jda.ap.bi.cognos.config.IServiceConfig;
import com.jda.ap.bi.config.ConfigUtil;
import com.jda.ap.bi.exception.ViewNotFoundException;
import com.jda.ap.reporting.APReportToolkit;
import com.jda.ap.reporting.enums.ViewTypeEnum;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import javax.xml.datatype.XMLGregorianCalendar;
import java.io.File;
import java.io.StringWriter;
import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

/**
 * User: Lee
 * Date: 7/18/2014
 * Time: 10:16 AM
 */
public class Modeller
{
    private static final String LAST_CHANGED_BY = "JDA Reporting Tool";
    private static final String COGNOS_TYPE = "cognos";
    private static final Logger log = Logger.getLogger(Modeller.class.getName());
    private static Modeller ourInstance = null;
    XMLGregorianCalendar gregorianCalendar = null;
    private static final String PACKAGE_NAME = "Assortment823ReportingBase";
    private static ConfigUtil configUtil = null;
    private static IServiceConfig _config;

    private Modeller(IServiceConfig config)

    {
        log.info("New instance of modeller: " + config);
        _config = config;
        configUtil = ConfigUtil.getInstance(config);

    }

    public static Modeller getInstance(IServiceConfig _config)
    {
        if (ourInstance == null)
        {
            ourInstance = new Modeller(_config);
        }
        return ourInstance;
    }


    private SupportedLocalesType getSupportedLocales(ObjectFactory objectFactory)
    {

        SupportedLocalesType supportedLocalesType = objectFactory.createSupportedLocalesType();
        SupportedLocalesType.Locale englishLocale = objectFactory.createSupportedLocalesTypeLocale();
        englishLocale.setValue("en");
        supportedLocalesType.getLocale().add(englishLocale);
        return supportedLocalesType;

    }

    /**
     * Create a cognos report project - this represents a model in Cognos as stored in the .cpf file
     *
     * @param modelFile
     * @return
     */
    public Project createAPModel(File modelFile)
    {


        log.info("Using config: " + _config);

        gregorianCalendar = new XMLGregorianCalendarImpl((GregorianCalendar) GregorianCalendar.getInstance());

        if (modelFile == null || !modelFile.exists())
        {
            log.info("Building new model from scratch...");
        }


        // create a model
        ObjectFactory objectFactory = new ObjectFactory();
        Project reportProject = objectFactory.createProject();
        reportProject.setQueryMode("dynamic");
        reportProject.setName(PACKAGE_NAME);
        // set supported locales
        reportProject.setLocales(getSupportedLocales(objectFactory));
        Namespace mainNamespace = objectFactory.createNamespace();
        setChangeTimeAndOwner(mainNamespace);
        NameType mainNameType = createNameType(objectFactory, "Assortment Planning");
        mainNamespace.getName().add(mainNameType);

        reportProject.setNamespace(mainNamespace);

        // add hierarchy views
        addHierarchyNamespace(objectFactory, mainNamespace);

        // add base hierarchies (product/location/time)
        addBaseHierarchies(objectFactory, mainNamespace);

        // add dimensions
        addDimensions(objectFactory, mainNamespace);



        // add measure namespace
        addMeasures(objectFactory, mainNamespace);

        // add attribute namespace
        addAttributeNamespace(objectFactory, mainNamespace);

        // build the relationships


        // add required parameter maps
        Project.ParameterMaps parameterMaps = objectFactory.createProjectParameterMaps();
        ParameterMapType envMap = objectFactory.createParameterMapType();
        envMap.setHidden(true);
        envMap.setName("_env");
        ParameterMapType governorMap = objectFactory.createParameterMapType();
        governorMap.setHidden(true);
        governorMap.setName("_governor");
        parameterMaps.getParameterMap().add(envMap);
        parameterMaps.getParameterMap().add(governorMap);
        reportProject.setParameterMaps(parameterMaps);


        // add security view

        SecurityViewType securityViewType = objectFactory.createSecurityViewType();
        securityViewType.setName(PACKAGE_NAME);
        DefinitionType definitionType = objectFactory.createDefinitionType();
        SecurityViewType.Definition securityDefinition = objectFactory.createSecurityViewTypeDefinition();
        SecurityDefinitionSetType securityDefinitionSetType = objectFactory.createSecurityDefinitionSetType();
        RefCollectionType refCollectionType = objectFactory.createRefCollectionType();
        refCollectionType.getRefobj().add("[Assortment Planning]");
        securityDefinitionSetType.getRefobj().add("[Assortment Planning]");
        securityDefinitionSetType.setIncludeRule("include");
        securityDefinition.getSet().add(securityDefinitionSetType);
        securityViewType.setAccess(new SecurityViewType.Access());
        securityViewType.setDefinition(securityDefinition);
        Project.SecurityViews securityViews = objectFactory.createProjectSecurityViews();
        securityViews.getSecurityView().add(securityViewType);
        reportProject.setSecurityViews(securityViews);


        // add the data sources
        Project.DataSources dataSources = objectFactory.createProjectDataSources();
        // single AP datasource initially
        DataSourceType dataSource = objectFactory.createDataSourceType();
        dataSource.setName("Assortment Planning");
        MacroType cmDataSource = objectFactory.createMacroType();
        cmDataSource.setContent("Assortment Planning");
        dataSource.setCmDataSource(cmDataSource);
        MacroType schemaType = objectFactory.createMacroType();
        schemaType.setContent("ASSORT");
        dataSource.setSchema(schemaType);
        DataSourceType.Type queryType = objectFactory.createDataSourceTypeType();
        queryType.setInterface("OR");
        queryType.setQueryType("relational");
        dataSource.setType(queryType);
        dataSources.getDataSource().add(dataSource);
        reportProject.setDataSources(dataSources);

        // add the package
        Project.Packages packages = objectFactory.createProjectPackages();

        reportProject.setPackages(packages);
        PackageViewType packageViewType = objectFactory.createPackageViewType();

        // setup base package info
        packageViewType.getName().add(createNameType(objectFactory, "Assortment Planning"));
        setChangeTimeAndOwner(packageViewType);
        packageViewType.getDescription().add(createNameType(objectFactory, "Assortment 8.2.3 back reporting package"));
        packageViewType.setUseV5DataServer(true);
        packageViewType.setIsMultiEdgeNullSuppressionAllowed(false);
        packageViewType.setIsNullSuppressionAllowed(false);
        packageViewType.setAdminAccess(new PackageViewType.AdminAccess());
        packageViewType.setLocales(getSupportedLocales(objectFactory));
        PackageViewType.Definition definition = objectFactory.createPackageViewTypeDefinition();
        definition.getViewref().add("[].[securityViews].[" + PACKAGE_NAME + "]");
        packageViewType.setDefinition(definition);
        packageViewType.getScreenTip().add(createNameType(objectFactory, "Base package"));


        packages.getPackage().add(packageViewType);

        StringWriter sw = new StringWriter();

        reportProject.setDefaultLocale("en");


        return reportProject;
    }


    /**
     * Add the measures to the model
     *
     *
     * @param objectFactory
     * @param mainNamespace
     */
    private void addMeasures(ObjectFactory objectFactory, Namespace mainNamespace)
    {

    }

    /**
     * Add the base hierarchies for product/time/location
     *
     * @param objectFactory
     * @param mainNamespace
     */
    private void addBaseHierarchies(ObjectFactory objectFactory, Namespace mainNamespace)
    {
        Namespace baseHierarchyNamespace = objectFactory.createNamespace();
        NameType dimensionsNameType = createNameType(objectFactory, "Base Hierarchies");
        baseHierarchyNamespace.getName().add(dimensionsNameType);
        setChangeTimeAndOwner(baseHierarchyNamespace);
        baseHierarchyNamespace.setLastChanged(gregorianCalendar.normalize());

        // @todo - need to check synonyms for PRODUCT_HIERARCHY, LOCATION_HIERARCHY and TIME_HIERARCHY exist



        // add  namespace to main namespace
        mainNamespace.getFolderOrFunctionOrNamespace().add(baseHierarchyNamespace);

    }






    /**
     * @param objectFactory
     * @param mainNamespace
     */
    private void addDimensions(ObjectFactory objectFactory, Namespace mainNamespace)
    {
        // add dimension namespace
        Namespace dimensionNamespace = objectFactory.createNamespace();
        NameType dimensionsNameType = createNameType(objectFactory, "Dimensions");
        dimensionNamespace.getName().add(dimensionsNameType);
        setChangeTimeAndOwner(dimensionNamespace);
        dimensionNamespace.setLastChanged(gregorianCalendar.normalize());

        // add dimension namespace to main namespace
        mainNamespace.getFolderOrFunctionOrNamespace().add(dimensionNamespace);

        // add dimensions (for each hierarchy)
        for (String hierarchyName : APReportToolkit.getInstance().getHierarchies())
        {
            Dimension dimension = objectFactory.createDimension();
            dimension.setStatus(StatusType.NEEDS_REEVALUATION);
            dimension.getName().add(createNameType(objectFactory, hierarchyName + " Hierarchy"));
            dimension.setType("regular");
            dimension.setMembersRollup(true);
            dimension.setDefaultHierarchy("[Dimensions].[" + hierarchyName + " Hierarchy].[" + hierarchyName + "]");

            // set definition
            DefinitionType definitionType = objectFactory.createDefinitionType();
            definitionType.setModelQuery(objectFactory.createDefinitionTypeModelQuery());
            dimension.setDefinition(definitionType);
            dimension.setSortMembersAndEnableMrf(true);
            dimension.setSortMembersData(true);
            dimension.setSortMembersMetadata(true);

            // define the hierarchy
            Hierarchy hierarchy = objectFactory.createHierarchy();
            hierarchy.getName().add(createNameType(objectFactory, hierarchyName));
            setChangeTimeAndOwner(hierarchy);

            // add the ALL (top level)
            Level topLevel = objectFactory.createLevel();
            topLevel.getName().add(createNameType(objectFactory, "ALL_" + hierarchyName));
            topLevel.setIsManual(true);
            setChangeTimeAndOwner(topLevel);
            hierarchy.getLevel().add(topLevel);

            // add the levels for the hierarchy
            for (String level : APReportToolkit.getInstance().getTableColumns(hierarchyName + "_REP_VIEW_HIER", true))
            {
                Level dimensionLevel = objectFactory.createLevel();
                dimensionLevel.getName().add(createNameType(objectFactory, level));
                setChangeTimeAndOwner(dimensionLevel);
                dimensionLevel.setIsUnique(false);
                // set the query items for the level (_id and _name)
                dimensionLevel.getQueryItemOrQueryItemFolder().add(createQueryItem(objectFactory, hierarchyName, level + "_ID", createBusinessKeyRole(objectFactory)));
                dimensionLevel.getQueryItemOrQueryItemFolder().add(createQueryItem(objectFactory, hierarchyName, level + "_NAME", createMemberCaptionRole(objectFactory)));


                hierarchy.getLevel().add(dimensionLevel);
            }

            hierarchy.setRootMUN("[all]");
            hierarchy.getRootCaption().add(createNameType(objectFactory, "ALL_" + hierarchyName));

            dimension.getHierarchyOrHierarchyFolder().add(hierarchy);


            // add the dimension to the dimensions namespace
            dimensionNamespace.getFolderOrFunctionOrNamespace().add(dimension);
        }


    }


    /**
     * Add the attribute namespace - this appears as a separate container within the framework manager.
     *
     * @param objectFactory
     * @param mainNamespace
     */
    private void addAttributeNamespace(ObjectFactory objectFactory, Namespace mainNamespace)
    {
        // add hierarchy namespace
        Namespace attributeNamespace = objectFactory.createNamespace();
        NameType attributeNameType = createNameType(objectFactory, "Attributes");
        attributeNamespace.getName().add(attributeNameType);
        setChangeTimeAndOwner(attributeNamespace);

        attributeNamespace.setLastChanged(gregorianCalendar.normalize());

        // loop through all attribute views
        APReportToolkit setup = APReportToolkit.getInstance();
        for (String attrView : setup.getAttributeViews())
        {
            QuerySubject querySubject = objectFactory.createQuerySubject();


            // see if we have defined an alias
            String alias = getAttributeAlias(attrView.replace("_REP_VIEW_ATTR", ""));
            String attributeDisplayName = (alias == null) ? attrView : alias;

            querySubject.getName().add(createNameType(objectFactory, attributeDisplayName));
            querySubject.setStatus(StatusType.NEEDS_REEVALUATION);
            setChangeTimeAndOwner(querySubject);
            attributeNamespace.getFolderOrFunctionOrNamespace().add(querySubject);

            DefinitionType.DbQuery query = objectFactory.createDefinitionTypeDbQuery();
            SqlType sqlType = objectFactory.createSqlType();
            sqlType.setType(COGNOS_TYPE);
            query.setTableType("view");
            sqlType.getContent().add("Select ");
            MacroType columnType = objectFactory.createMacroType();
            columnType.setContent("*");
            MacroType tableType = objectFactory.createMacroType();
            tableType.setContent("[Assortment Planning]." + attrView);
            sqlType.getContent().add(objectFactory.createSqlTypeColumn(columnType));
            sqlType.getContent().add(" from ");

            sqlType.getContent().add(objectFactory.createSqlTypeTable(tableType));
            querySubject.setDefinition(objectFactory.createDefinitionType());
            querySubject.getDefinition().setDbQuery(query);

            // add all columns of the attribute table
            for (String attrColumnName : setup.getTableColumns(attrView, false))
            {
                querySubject.getQueryItemOrQueryItemFolder().add(createQueryItem(objectFactory, attrView, attrColumnName, null));
            }
        }

        // add attribute namespace to main namespace
        mainNamespace.getFolderOrFunctionOrNamespace().add(attributeNamespace);
    }

    /**
     * Add the hierarchy definition namespace
     *
     * @param objectFactory
     * @param mainNamespace
     */
    private void addHierarchyNamespace(ObjectFactory objectFactory, Namespace mainNamespace)
    {
        // add hierarchy namespace
        Namespace hierarchyNamespace = objectFactory.createNamespace();
        NameType hierarchyNameType = createNameType(objectFactory, "Hierarchies");
        hierarchyNamespace.getName().add(hierarchyNameType);
        setChangeTimeAndOwner(hierarchyNamespace);

        hierarchyNamespace.setLastChanged(gregorianCalendar.normalize());


        // for each hierarchy
        for (String hierarchy : APReportToolkit.getInstance().getHierarchies())
        {

            try
            {
                if ( configUtil.isIgnored(ViewTypeEnum.HIERARCHY, hierarchy)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Ignoring view [").append(hierarchy).append("]");
                    // skip to next view
                    continue;
                }
            }
            catch (ViewNotFoundException e)
            {
                log.warning("View is not in config file: " + e.getMessage());
            }

            Set<String> columnSet = new HashSet<>();
            DefinitionType.DbQuery query = objectFactory.createDefinitionTypeDbQuery();
            SqlType sqlType = objectFactory.createSqlType();
            sqlType.setType(COGNOS_TYPE);
            query.setTableType("view");
            sqlType.getContent().add("Select ");
            MacroType columnType = objectFactory.createMacroType();
            columnType.setContent("*");
            MacroType tableType = objectFactory.createMacroType();
            tableType.setContent("[Assortment Planning]." + hierarchy);
            sqlType.getContent().add(objectFactory.createSqlTypeColumn(columnType));
            sqlType.getContent().add(" from ");

            sqlType.getContent().add(objectFactory.createSqlTypeTable(tableType));

            QuerySubject querySubject = objectFactory.createQuerySubject();
            querySubject.setDefinition(objectFactory.createDefinitionType());
            querySubject.setStatus(StatusType.fromValue("valid"));
            setChangeTimeAndOwner(querySubject);
            querySubject.getName().add(createNameType(objectFactory, hierarchy));

            // set query sources
            query.setSources(getSources(objectFactory));
            query.setSql(sqlType);
            querySubject.getDefinition().setDbQuery(query);

            // add determinants
            QuerySubject.Determinants determinants = objectFactory.createQuerySubjectDeterminants();
            // get all hierarchy levels
            List<String> hierarchyColumns = APReportToolkit.getInstance().getTableColumns(hierarchy + "_REP_VIEW_HIER", true);
            int processedDeterminants = 0;

            for (String columnName : hierarchyColumns)
            {
                RefCollectionType keyCollection = objectFactory.createRefCollectionType();
                processedDeterminants++;
                log.finer("Adding column : " + columnName + " to " + hierarchy);
                // add ID column
                DeterminantType idColumnDeterminant = objectFactory.createDeterminantType();
                // leaf level
                if (processedDeterminants == hierarchyColumns.size())
                {
                    idColumnDeterminant.setIdentifiesRow(true);
                    idColumnDeterminant.setCanGroup(false);
                }
                else
                {
                    idColumnDeterminant.setCanGroup(true);
                    idColumnDeterminant.setIdentifiesRow(false);
                }
                RefCollectionType attributeCollection = objectFactory.createRefCollectionType();

                idColumnDeterminant.setName(columnName + "_ID");
                StringBuilder keyStr = new StringBuilder();
                keyStr.append("[Hierarchies].[").append(hierarchy).append("].[").append(columnName).append("_ID]");
                columnSet.add(keyStr.toString());
                for (String keyCol : columnSet)
                {
                    keyCollection.getRefobj().add(keyCol);
                }
                idColumnDeterminant.setKey(keyCollection);

                StringBuilder attrStr = new StringBuilder();
                attrStr.append("[Hierarchies].[").append(hierarchy).append("].[").append(columnName).append("_NAME]");
                attributeCollection.getRefobj().add(attrStr.toString());
                idColumnDeterminant.setAttributes(attributeCollection);
                determinants.getDeterminant().add(idColumnDeterminant);


            }

            // add query items
            for (String columnName : hierarchyColumns)
            {

                // add id column
                log.finer("Adding query item : " + columnName + " to " + hierarchy);
                QueryItem queryItem = objectFactory.createQueryItem();
                queryItem.getName().add(createNameType(objectFactory, columnName + "_ID"));
                queryItem.setExternalName(columnName + "_ID");
                queryItem.setSize(42l);
                queryItem.setUsage("attribute");
                queryItem.setPrecision(new BigInteger("20"));
                queryItem.setSemiAggregate(RegularAggregateType.UNSUPPORTED);
                queryItem.setRegularAggregate(RegularAggregateType.UNSUPPORTED);

                queryItem.setDatatype("characterLength16");
                setChangeTimeAndOwner(queryItem);
                querySubject.getQueryItemOrQueryItemFolder().add(queryItem);

                // add name column
                queryItem = objectFactory.createQueryItem();
                queryItem.getName().add(createNameType(objectFactory, columnName + "_NAME"));
                queryItem.setExternalName(columnName + "_NAME");
                queryItem.setSize(62l);
                querySubject.getQueryItemOrQueryItemFolder().add(queryItem);
            }

            querySubject.setDeterminants(determinants);


            hierarchyNamespace.getFolderOrFunctionOrNamespace().add(querySubject);
        }

        // add hierarchy namespace to main namespace
        mainNamespace.getFolderOrFunctionOrNamespace().add(hierarchyNamespace);


    }

    private DataSourceRefsType getSources(ObjectFactory objectFactory)
    {

        DataSourceRefsType dataSourceRefsType = objectFactory.createDataSourceRefsType();
        dataSourceRefsType.getDataSourceRef().add("[].[dataSources].[Assortment Planning]");
        return dataSourceRefsType;
    }


    /**
     * Get a NateType object with a default locale set
     *
     * @param objectFactory
     * @param name
     * @return
     */
    private NameType createNameType(ObjectFactory objectFactory, String name)
    {
        NameType nameType = objectFactory.createNameType();
        nameType.setValue(name);
        nameType.setLocale("en");
        return nameType;
    }


    /**
     * Add the last change and timestamp info to the reporting object
     *
     * @param objectType
     */
    private void setChangeTimeAndOwner(ReportObjectType objectType)
    {
        objectType.setLastChangedBy(LAST_CHANGED_BY);
        objectType.setLastChanged(gregorianCalendar.normalize());
    }

    /**
     * Create a query item
     *
     * @param objectFactory
     * @param hierarchy
     * @param name
     * @param role
     * @return
     */
    private ReportObjectType createQueryItem(ObjectFactory objectFactory, String hierarchy, String name, QueryItemType.Roles.Role role)
    {
        QueryItem queryItem = objectFactory.createQueryItem();
        queryItem.getName().add(createNameType(objectFactory, name));
        setChangeTimeAndOwner(queryItem);
        queryItem.setUsage("attribute");
        queryItem.setNullable(true);
        queryItem.setRegularAggregate(RegularAggregateType.UNSUPPORTED);
        queryItem.setSemiAggregate(RegularAggregateType.UNSUPPORTED);
        // set roles - used for hierarchy levels (e,.g businessKey or memberCaption)
        if (role != null)
        {
            QueryItemType.Roles queryItemRoles = objectFactory.createQueryItemTypeRoles();
            queryItemRoles.getRole().add(role);
            queryItem.setRoles(queryItemRoles);
        }
        // add query expression
        StringBuilder expression = new StringBuilder("[Hierarchies].[").append(hierarchy).append("].[").append(name).append("]");
        ExpressionType expressionType = objectFactory.createExpressionType();
        expressionType.setContent(expression.toString());
        queryItem.setExpression(expressionType);
        queryItem.getExpression().setContent(expression.toString());


        return queryItem;
    }

    /**
     * Create business key role
     *
     * @param objectFactory
     * @return
     */
    private QueryItemType.Roles.Role createBusinessKeyRole(ObjectFactory objectFactory)
    {
        QueryItemType.Roles.Role businessKeyRole = objectFactory.createQueryItemTypeRolesRole();
        businessKeyRole.setIntrinsic(false);
        businessKeyRole.getName().add(createNameType(objectFactory, "_businessKey"));
        return businessKeyRole;
    }

    /**
     * Create member caption key role
     *
     * @param objectFactory
     * @return
     */
    private QueryItemType.Roles.Role createMemberCaptionRole(ObjectFactory objectFactory)
    {
        QueryItemType.Roles.Role memberCaptionRole = objectFactory.createQueryItemTypeRolesRole();
        memberCaptionRole.setIntrinsic(false);
        memberCaptionRole.getName().add(createNameType(objectFactory, "_memberCaption"));
        return memberCaptionRole;
    }


    /**
     * Gets the alias for a given attribute
     *
     * @param name
     * @return
     */
    public String getAttributeAlias(String name)
    {

        return configUtil.getAttributeAlias(name);
    }

    /**
     * Gets the alias for a given plan
     *
     * @param name
     * @return
     */
    public String getPlanAlias(String name)
    {
        return configUtil.getHierarchyAlias(name);
    }

    /**
     * Gets the alias for a given hierarchy
     *
     * @param name
     * @return
     */
    public String getHierarchyAlias(String name)
    {
        return configUtil.getHierarchyAlias(name);
    }

    /**
     * Get a display name alias for a view
     *
     * @param type
     * @param name
     * @return
     */
    public String getAlias(ViewTypeEnum type, String name)
    {
        switch (type)
        {
            case ATTRIBUTE:
            {
                return getAttributeAlias(name);
            }
            case HIERARCHY:
            {
                return getHierarchyAlias(name);
            }
            case PLAN:
            {
                return getPlanAlias(name);
            }
            default:
            {
                return "Unsupported view type: " + type;
            }
        }
    }

}
