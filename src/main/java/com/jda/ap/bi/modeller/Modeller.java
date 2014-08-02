package com.jda.ap.bi.modeller;


import com.cognos.developer.schemas.bmt._60._7.*;
import com.jda.ap.bi.cognos.config.IServiceConfig;
import com.jda.ap.bi.config.ConfigUtil;
import com.jda.ap.exception.APServiceException;
import com.jda.ap.reporting.APReportToolkit;
import com.jda.ap.reporting.enums.ViewTypeEnum;
import com.jda.ap.reporting.interfaces.IReportToolkit;
import com.jda.ap.reporting.pojo.BIView;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.File;
import java.math.BigInteger;
import java.util.*;
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
    private static IReportToolkit toolkit = null;
    private static final ObjectFactory _objectFactory = new ObjectFactory();
    private static final boolean ID_COLUMNS_ONLY = true;
    private static final boolean ALL_COLUMNS = false;


    private Modeller(IServiceConfig config)

    {
        log.info("New instance of modeller: " + config);
        _config = config;
        configUtil = ConfigUtil.getInstance(config);
        toolkit = APReportToolkit.getInstance();

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
    public Project createAPModel(File modelFile) throws APServiceException
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

            // add plan namespace
            addPlansNamespace(objectFactory, mainNamespace);

            // add measure namespace
            addMeasuresNamespace(objectFactory, mainNamespace);

            // add attribute namespace
            addAttributeNamespace(objectFactory, mainNamespace);

            // add lookup namespace
            addLookupNamespace(objectFactory, mainNamespace);

            // build the relationships
            addRelationships(objectFactory, mainNamespace);

            // add the scope relationships
            addScopeRelationships(mainNamespace);

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

            reportProject.setDefaultLocale("en");



        return reportProject;
    }

    /**
     * Create relationship scope information
     * @param mainNamespace
     */
    private void addScopeRelationships(Namespace mainNamespace) throws APServiceException
    {
        log.info("Adding scope relationships...");

        // for a given plan table (measures) we need to get the ID columns
        // and figure out which dimension element to connect them to

        final Map<String, BIView> baseHierarchies = toolkit.getBaseHierarchies();

        for ( BIView planView : toolkit.getAllViews(ViewTypeEnum.PLAN)) {

            // skip if view doesn't exist
            if (! planView.isExists()) {
                 continue;
            }

            log.info("Creating scope relationships for plan: " + planView.getSourceTable());

            // get the ID columns for the
            for ( String planIDColumn : toolkit.getTableColumns(planView.getSourceTable(),ID_COLUMNS_ONLY)) {
                 log.info("Looking for dimensions with : " + planIDColumn);
                 //@todo try and find a match in the base hierarchies (PRODUCT/LOCATION/TIME) first and then decide if to continue
                 Collection<BIView> possibleViews = toolkit.getHierarchyViewsForColumn(planIDColumn, false);
                 log.info("GOT VIEWS: " + possibleViews);

                 // add the relationship
                 addScopeRelationShip(planView, possibleViews, mainNamespace);
            }

        }


    }

    /**
     * Create a scope relationship between a plan column (measure) and one or more dimensions (hierarchies)
     *
     *
     *
     * @param measureView
     * @param possibleViews
     * @param mainNamespace
     */
    private void addScopeRelationShip(BIView measureView, Collection<BIView> possibleViews, Namespace mainNamespace)
    {
          for ( BIView view : possibleViews) {
              ScopeRelationshipType scopeRelationship = _objectFactory.createScopeRelationshipType();
              ScopeRelationshipType.Scope scope = _objectFactory.createScopeRelationshipTypeScope();

              StringBuilder relationshipName = new StringBuilder();
              // set the name of the relationship
              relationshipName.append(view.getSourceTable()).append(" &lt;-&gt; ").append(measureView.getAlias());
              scopeRelationship.setName(relationshipName.toString());
              // set the left side of the relationship (the hierarchy side)
              CardinalityType leftCardinality= _objectFactory.createCardinalityType();
              leftCardinality.setMincard(CardinalityEnum.ONE);
              leftCardinality.setMaxcard(CardinalityEnum.ONE);
              leftCardinality.setRefobj("[Dimensions].[" + view.getAlias() + " Hierarchy]");
              scopeRelationship.setLeft(leftCardinality);

              // set the right side of the relationship (the measure/plan side)
              CardinalityType rightCardinality = _objectFactory.createCardinalityType();
              rightCardinality.setMincard(CardinalityEnum.ONE);
              rightCardinality.setMaxcard(CardinalityEnum.MANY);
              rightCardinality.setRefobj("[Measures].[" + measureView.getAlias() + "]");
              scopeRelationship.setRight(rightCardinality);

              // add the relationship to the main namespace
              mainNamespace.getFolderOrFunctionOrNamespace().add(scopeRelationship);

          }
    }

    private void addRelationships(ObjectFactory objectFactory, Namespace mainNamespace)
    {

        // create relationships between plans and hierarchies
        // go through all plans
        for ( BIView planView : toolkit.getAllViews(ViewTypeEnum.PLAN))
        {
            // skip if view doesnt exist
               if (! planView.isExists()) {
                    continue;
               }
            log.info("Looking for relationships for : " + planView);

            // go through all columns in plan view with and ID
            List<String> planIDColumns = toolkit.getTableColumns(planView.getSourceTable(), ID_COLUMNS_ONLY);

            for (String planIDColumn : planIDColumns)
            {
                log.info("Looking for joins with : " + planIDColumn);

                // go through all hierarchy tables and look for matching column
                for (BIView hierachyView : toolkit.getAllViews(ViewTypeEnum.HIERARCHY))
                {
                    // skip if view doesnt exist
                    if (! hierachyView.isExists()) {
                        continue;
                    }

                    // go through all hierarchy columns
                    List<String> hierarchyIDColumns = toolkit.getTableColumns(hierachyView.getSourceTable(), ID_COLUMNS_ONLY);

                    for (String hierarchyIDColumn : hierarchyIDColumns) {
                         if ( hierarchyIDColumn.equalsIgnoreCase(planIDColumn)) {
                             StringBuilder stringBuilder = new StringBuilder();

                             stringBuilder.append("*** Creating join between [").append(planView.getViewName()).append("] and [").append(hierachyView.getViewName()).append("]");
                             stringBuilder.append(" on column [").append(hierarchyIDColumn).append("] ***");
                             log.info(stringBuilder.toString());
                             RelationshipType relationship = objectFactory.createRelationshipType();
                             relationship.setStatus(StatusType.NEEDS_REEVALUATION);
                             StringBuilder relationshipNameStr = new StringBuilder();
                             relationshipNameStr.append(hierachyView.getSourceTable()).append("&lt;-&gt;").append(planView.getSourceTable());
                             relationship.setName(relationshipNameStr.toString());
                             // create expression
                             ExpressionType relationshipExpression = objectFactory.createExpressionType();
                             RefobjViaShortcut expressionRefObject = objectFactory.createRefobjViaShortcut();

                             JAXBElement leftSideExpression = objectFactory.createRefobjViaShortcutRefobj("[Hierarchies].[" + hierachyView.getAlias()+"].[" + hierarchyIDColumn +"_ID]");
                             JAXBElement rightSideExpression = objectFactory.createRefobjViaShortcutRefobj("[Plans].[" + planView.getAlias()+"].[" + planIDColumn +"_ID]");

                             expressionRefObject.getContent().add(leftSideExpression) ;
                             expressionRefObject.getContent().add(rightSideExpression);

                             relationshipExpression.setContent("<refobj>" + leftSideExpression.getValue() + "</refobj>=<refobj>" + rightSideExpression.getValue() + "</refobj>");


                             relationship.setExpression(relationshipExpression);

                             // set left side relationship - Hierarchy should have 1 and only 1 entry
                             CardinalityType leftCardinalityType = objectFactory.createCardinalityType();
                             leftCardinalityType.setRefobj("[Hierarchies].[" + hierachyView.getAlias()+"]");
                             leftCardinalityType.setMaxcard(CardinalityEnum.ONE);
                             leftCardinalityType.setMincard(CardinalityEnum.ONE);
                             relationship.setLeft(leftCardinalityType);


                             // set right side relationship - plan can have zero or more entries
                             CardinalityType rightCardinalityType = objectFactory.createCardinalityType();
                             rightCardinalityType.setRefobj("[Plans].[" + planView.getAlias()+"]");
                             rightCardinalityType.setMaxcard(CardinalityEnum.MANY);
                             rightCardinalityType.setMincard(CardinalityEnum.ZERO);
                             relationship.setRight(rightCardinalityType);


                             mainNamespace.getFolderOrFunctionOrNamespace().add(relationship);
                         }
                    }


                }

            }



        }


    }


    /**
     * Add the measures to the model
     *
     * @param objectFactory
     * @param mainNamespace
     */
    private void addMeasuresNamespace(ObjectFactory objectFactory, Namespace mainNamespace)
    {
        Namespace measureNamespace = objectFactory.createNamespace();
        NameType lookupNameType = createNameType(objectFactory, "Measures");
        measureNamespace.getName().add(lookupNameType);
        setChangeTimeAndOwner(measureNamespace);
        measureNamespace.setLastChanged(gregorianCalendar.normalize());

        // for every plan table we'll add measures
        for ( BIView planView : toolkit.getAllViews(ViewTypeEnum.PLAN)) {

            if (! planView.isExists()) {
                 continue;
            }

            Dimension measureDimension = objectFactory.createDimension();
            // set name
            measureDimension.getName().add(createNameType(objectFactory, planView.getAlias()));
            // set time and owner
            setChangeTimeAndOwner(measureDimension);
            // set type
            measureDimension.setType("measure");
            // set rollup
            measureDimension.setMembersRollup(true);

            // for each measure column add to the measure dimension

            for ( String column : toolkit.getTableColumns(planView.getSourceTable(), ALL_COLUMNS )) {
                // if the column is an ID column it'll end in _ID and we dont want it as a measure
                if ( column.toUpperCase().endsWith("_ID") ) {
                    // skip it
                    continue;
                }

                // we have a non-id column - we'll treat it as a measure
                Measure measure = objectFactory.createMeasure();
                // set measure name
                measure.getName().add(createNameType(objectFactory, column));
                // set last modified and time
                setChangeTimeAndOwner(measure);
                // @todo - we need to figure out the datatype/scale etc of the measure from the plan defns
                measure.setUsage("fact");
                measure.setScale(new BigInteger("4"));
                measure.setPrecision(new BigInteger("31"));
                measure.setSize(16l);
                measure.setDatatype("decimal");
                measure.setNullable(true);
                measure.setFormat("&amp;lt;formatGroup&amp;gt;&amp;lt;currencyFormat xml:lang=&amp;quot;en-us&amp;quot; /&amp;gt;&amp;lt;/formatGroup&amp;gt;");
                measure.setPrecision(new BigInteger("38"));
                measure.setRegularAggregate(RegularAggregateType.SUM);
                measure.setSemiAggregate(RegularAggregateType.SUM);
                // add plan expression
                ExpressionType expressionType = objectFactory.createExpressionType();

                StringBuilder expression = new StringBuilder().append("<refobj>[Plans].[").append(planView.getAlias()).append("].[").append(column).append("]</refobj>");

                expressionType.setContent(expression.toString());
                measure.setExpression(expressionType);

                // add the measure to the dimension
                measureDimension.getMeasureDimensionItems().add(measure);

            }

            // add the measure dimensions to the measures
            measureNamespace.getFolderOrFunctionOrNamespace().add(measureDimension);

        }


        mainNamespace.getFolderOrFunctionOrNamespace().add(measureNamespace);

    }


    /**
     *
     * Add lookup information
     * These views are views of the MST_IB_LOOKUP_VAL entries
     *
     * @param objectFactory
     * @param mainNamespace
     */
    private void addLookupNamespace(ObjectFactory objectFactory, Namespace mainNamespace)
    {
        Namespace lookupNamespace = objectFactory.createNamespace();
        NameType lookupNameType = createNameType(objectFactory, "Lookups");
        lookupNamespace.getName().add(lookupNameType);
        setChangeTimeAndOwner(lookupNamespace);
        lookupNamespace.setLastChanged(gregorianCalendar.normalize());

        for (BIView view : toolkit.getAllViews(ViewTypeEnum.LOOKUP))
        {
            // skip if does not exist in Db
            if (! view.isExists()) {
                 continue;
            }

            QuerySubject querySubject = objectFactory.createQuerySubject();

            // see if we have defined an alias

            String attributeDisplayName = (view.getAlias() == null) ? view.getViewName() : view.getAlias();

            querySubject.getName().add(createNameType(objectFactory, attributeDisplayName));
            querySubject.setStatus(StatusType.NEEDS_REEVALUATION);
            setChangeTimeAndOwner(querySubject);
            lookupNamespace.getFolderOrFunctionOrNamespace().add(querySubject);

            DefinitionType.DbQuery query = objectFactory.createDefinitionTypeDbQuery();
            SqlType sqlType = objectFactory.createSqlType();
            sqlType.setType(COGNOS_TYPE);
            query.setTableType("view");
            sqlType.getContent().add("Select ");
            MacroType columnType = objectFactory.createMacroType();
            columnType.setContent("*");
            MacroType tableType = objectFactory.createMacroType();
            tableType.setContent("[Assortment Planning]." + view.getSourceTable());
            sqlType.getContent().add(objectFactory.createSqlTypeColumn(columnType));
            sqlType.getContent().add(" from ");

            sqlType.getContent().add(objectFactory.createSqlTypeTable(tableType));
            querySubject.setDefinition(objectFactory.createDefinitionType());
            querySubject.getDefinition().setDbQuery(query);

            // set the query sql  /definition/dbQuery/sql
            query.setSql(sqlType);
            // set the definition query /definition/dbQuery
            querySubject.getDefinition().setDbQuery(query);
            // set the source /definition/dbQuery/sources
            query.setSources(getSources(objectFactory));

            // add all columns of the lookup table
            for (String attrColumnName : toolkit.getTableColumns(view.getSourceTable(), ALL_COLUMNS))
            {
                querySubject.getQueryItemOrQueryItemFolder().add(createQueryItem(objectFactory,"Lookups", view, attrColumnName, null,false));
            }
        }

        // add lookup namespace to main namespace
        mainNamespace.getFolderOrFunctionOrNamespace().add(lookupNamespace);

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


        Map<String, BIView> baseHierarchies = null;
        try
        {
            baseHierarchies = toolkit.getBaseHierarchies();
            log.info("Getting base hierarchies...");
            for (String hierarchyName : baseHierarchies.keySet())
            {
                log.info("Creating base hierarchy : " + baseHierarchies.get(hierarchyName));
                  addHierarchy(objectFactory, baseHierarchyNamespace, baseHierarchies.get(hierarchyName), hierarchyName);
            }
        }
        catch (APServiceException e)
        {
            log.warning("No base hierarchies defined - skipping!");
        }


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
        for (BIView hierarchyView : toolkit.getAllViews(ViewTypeEnum.HIERARCHY))
        {
            Dimension dimension = objectFactory.createDimension();
            dimension.setStatus(StatusType.NEEDS_REEVALUATION);
            dimension.getName().add(createNameType(objectFactory, hierarchyView.getAlias() + " Hierarchy"));
            dimension.setType("regular");
            dimension.setMembersRollup(true);
            dimension.setDefaultHierarchy("[Dimensions].[" + hierarchyView.getAlias() + " Hierarchy].[" + hierarchyView.getAlias() + "]");
            // set definition
            DefinitionType definitionType = _objectFactory.createDefinitionType();
            DefinitionType.ModelQuery modelQuery = _objectFactory.createDefinitionTypeModelQuery();
            modelQuery.setSql(_objectFactory.createSqlType());
            definitionType.setModelQuery(modelQuery);
            dimension.setDefinition(definitionType);


            dimension.setSortMembersAndEnableMrf(true);
            dimension.setSortMembersData(true);
            dimension.setSortMembersMetadata(true);

            // define the hierarchy
            Hierarchy hierarchy = objectFactory.createHierarchy();
            hierarchy.getName().add(createNameType(objectFactory, hierarchyView.getAlias()));
            setChangeTimeAndOwner(hierarchy);

            // add the ALL (top level)
            Level topLevel = objectFactory.createLevel();
            topLevel.getName().add(createNameType(objectFactory, "ALL_" + hierarchyView.getAlias()));
            topLevel.setIsManual(true);
            setChangeTimeAndOwner(topLevel);
            hierarchy.getLevel().add(topLevel);

            // add the levels for the hierarchy
            for (String level : toolkit.getTableColumns(hierarchyView.getSourceTable(), ID_COLUMNS_ONLY))
            {
                Level dimensionLevel = objectFactory.createLevel();
                dimensionLevel.getName().add(createNameType(objectFactory, level));
                setChangeTimeAndOwner(dimensionLevel);
                dimensionLevel.setIsUnique(false);
                // set the query items for the level (_id and _name)
                dimensionLevel.getQueryItemOrQueryItemFolder().add(createQueryItem(objectFactory,"Hierarchies", hierarchyView, level + "_ID", createBusinessKeyRole(objectFactory), true));
                dimensionLevel.getQueryItemOrQueryItemFolder().add(createQueryItem(objectFactory,"Hierarchies", hierarchyView, level + "_NAME", createMemberCaptionRole(objectFactory),true));


                hierarchy.getLevel().add(dimensionLevel);
            }

            hierarchy.setRootMUN("[all]");
            hierarchy.getRootCaption().add(createNameType(objectFactory, "ALL_" + hierarchyView.getAlias()));

            dimension.getHierarchyOrHierarchyFolder().add(hierarchy);


            // add the dimension to the dimensions namespace
            dimensionNamespace.getFolderOrFunctionOrNamespace().add(dimension);
        }


    }


    private void addPlansNamespace(ObjectFactory objectFactory, Namespace mainNamespace)
    {

        // add plans namespace
        Namespace planNamespace = objectFactory.createNamespace();
        NameType attributeNameType = createNameType(objectFactory, "Plans");
        planNamespace.getName().add(attributeNameType);
        setChangeTimeAndOwner(planNamespace);

        planNamespace.setLastChanged(gregorianCalendar.normalize());

        for ( BIView view : toolkit.getAllViews(ViewTypeEnum.PLAN)) {
            if ( view.isExists())
            {
                addPlanEntry(objectFactory, planNamespace, view);
            }
        }

        // add attribute namespace to main namespace
        mainNamespace.getFolderOrFunctionOrNamespace().add(planNamespace);

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
        for (String attrView : toolkit.getAttributeViews())
        {
            QuerySubject querySubject = objectFactory.createQuerySubject();


            // see if we have defined an alias
            String alias = getAttributeAlias(attrView.replace("_RVA", ""));
            String attributeDisplayName = (alias == null) ? attrView : alias;

            querySubject.getName().add(createNameType(objectFactory, attributeDisplayName));
            querySubject.setStatus(StatusType.NEEDS_REEVALUATION);
            setChangeTimeAndOwner(querySubject);
            attributeNamespace.getFolderOrFunctionOrNamespace().add(querySubject);
            querySubject.setDefinition(objectFactory.createDefinitionType());
            querySubject.getDefinition().setDbQuery(getQuery(objectFactory, attrView));



            // add all columns of the attribute table
            for (String attrColumnName : toolkit.getTableColumns(attrView, ALL_COLUMNS))
            {
                querySubject.getQueryItemOrQueryItemFolder().add(createAttributeQueryItem(objectFactory,  attrColumnName, "attribute"));
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
        for (BIView hierarchyView : toolkit.getAllViews(ViewTypeEnum.HIERARCHY))
        {

            // ignore any in config that dont exist
            if (! hierarchyView.isExists()) {
                 continue;
            }
            // see if we have defined an alias

            String hierarchyDisplayName = (hierarchyView.getAlias() == null) ? configUtil.getHierarchyAlias(hierarchyView.getViewName()) : hierarchyView.getAlias();


            if (hierarchyView.isIgnore())
            {
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring view [").append(hierarchyView.getViewName()).append("]");
                // skip to next view
                continue;
            }


            log.info("Adding hierarchy: " + hierarchyView);

            Set<String> columnSet = new HashSet<>();
            DefinitionType.DbQuery query = objectFactory.createDefinitionTypeDbQuery();
            SqlType sqlType = objectFactory.createSqlType();
            sqlType.setType(COGNOS_TYPE);
            query.setTableType("view");
            sqlType.getContent().add("Select ");
            MacroType columnType = objectFactory.createMacroType();
            columnType.setContent("*");
            MacroType tableType = objectFactory.createMacroType();
            tableType.setContent("[Assortment Planning]." + hierarchyView.getSourceTable());
            sqlType.getContent().add(objectFactory.createSqlTypeColumn(columnType));
            sqlType.getContent().add(" from ");

            sqlType.getContent().add(objectFactory.createSqlTypeTable(tableType));

            QuerySubject querySubject = objectFactory.createQuerySubject();
            querySubject.setDefinition(objectFactory.createDefinitionType());
            querySubject.setStatus(StatusType.fromValue("valid"));
            setChangeTimeAndOwner(querySubject);
            querySubject.getName().add(createNameType(objectFactory, hierarchyDisplayName));

            // set query sources
            query.setSources(getSources(objectFactory));
            query.setSql(sqlType);
            querySubject.getDefinition().setDbQuery(query);

            // add determinants
            QuerySubject.Determinants determinants = objectFactory.createQuerySubjectDeterminants();
            // get all hierarchy levels
            List<String> hierarchyColumns = toolkit.getTableColumns(hierarchyView.getSourceTable(), ID_COLUMNS_ONLY);
            int processedDeterminants = 0;

            for (String columnName : hierarchyColumns)
            {
                RefCollectionType keyCollection = objectFactory.createRefCollectionType();
                processedDeterminants++;
                log.info("Adding column : " + columnName + " to " + hierarchyView.getViewName());
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

                idColumnDeterminant.setName(columnName);
                StringBuilder keyStr = new StringBuilder();
                keyStr.append("[Hierarchies].[").append(hierarchyView.getAlias()).append("].[").append(columnName).append("_ID]");
                columnSet.add(keyStr.toString());
                for (String keyCol : columnSet)
                {
                    keyCollection.getRefobj().add(keyCol);
                }
                idColumnDeterminant.setKey(keyCollection);

                StringBuilder attrStr = new StringBuilder();
                attrStr.append("[Hierarchies].[").append(hierarchyView.getAlias()).append("].[").append(columnName).append("_NAME]");
                attributeCollection.getRefobj().add(attrStr.toString());
                idColumnDeterminant.setAttributes(attributeCollection);
                determinants.getDeterminant().add(idColumnDeterminant);


            }

            // add query items
            for (String columnName : hierarchyColumns)
            {

                // add id column
                log.finer("Adding query item : " + columnName + " to " + hierarchyView.getViewName());
                QueryItem queryItem = createAttributeQueryItem(objectFactory,  columnName + "_ID", "attribute");
//                queryItem.getName().add(createNameType(objectFactory, columnName + "_ID"));
//                queryItem.setExternalName(columnName + "_ID");
//                queryItem.setUsage("attribute");
//                queryItem.setScale(new BigInteger("0"));
//                queryItem.setSize(62l);
//                queryItem.setNullable(false);
//                queryItem.setPrecision(new BigInteger("20"));
//                queryItem.setSemiAggregate(RegularAggregateType.UNSUPPORTED);
//                queryItem.setRegularAggregate(RegularAggregateType.UNSUPPORTED);
//
//                queryItem.setDatatype("characterLength16");
//                setChangeTimeAndOwner(queryItem);
                querySubject.getQueryItemOrQueryItemFolder().add(queryItem);

                // add name column
                queryItem =  createAttributeQueryItem(objectFactory,  columnName + "_NAME", "attribute");
//                queryItem.getName().add(createNameType(objectFactory, columnName + "_NAME"));
//                queryItem.setExternalName(columnName + "_NAME");
//                queryItem.setUsage("attribute");
//                queryItem.setScale(new BigInteger("0"));
//                queryItem.setSize(62l);
//                queryItem.setNullable(false);
//                queryItem.setPrecision(new BigInteger("20"));
//                queryItem.setSemiAggregate(RegularAggregateType.UNSUPPORTED);
//                queryItem.setRegularAggregate(RegularAggregateType.UNSUPPORTED);
//
//                queryItem.setDatatype("characterLength16");
//                setChangeTimeAndOwner(queryItem);
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
     * @param namespace
     * @param view
     * @param name
     * @param role
     * @return
     */
    private ReportObjectType createQueryItem(ObjectFactory objectFactory,String namespace, BIView view, String name, QueryItemType.Roles.Role role, boolean addExpression)
    {
        QueryItem queryItem = createAttributeQueryItem(objectFactory, name, "fact");

        // set roles - used for hierarchy levels (e,.g businessKey or memberCaption)
        if (role != null)
        {
            QueryItemType.Roles queryItemRoles = objectFactory.createQueryItemTypeRoles();
            queryItemRoles.getRole().add(role);
            queryItem.setRoles(queryItemRoles);
        }

        if ( addExpression)
        {
            // add query expression
            StringBuilder expression = new StringBuilder("[" + namespace + "].[").append(view.getAlias()).append("].[").append(name).append("]");
            ExpressionType expressionType = objectFactory.createExpressionType();
            expressionType.setContent(expression.toString());
            queryItem.setExpression(expressionType);
            queryItem.getExpression().setContent(expression.toString());
        }

        return queryItem;
    }

    /**
     * Create <queryItem> </queryItem> element
     * @param objectFactory
     * @param name
     * @param type
     * @return
     */
    private QueryItem createAttributeQueryItem(ObjectFactory objectFactory,  String name, String type)
    {
        QueryItem queryItem = objectFactory.createQueryItem();
        queryItem.getName().add(createNameType(objectFactory, name));
        setChangeTimeAndOwner(queryItem);
        queryItem.setUsage(type);
        queryItem.setExternalName(name);
        if ( type.equalsIgnoreCase("fact")) {
            queryItem.setRegularAggregate(RegularAggregateType.SUM);
            queryItem.setSemiAggregate(RegularAggregateType.SUM);
            queryItem.setDatatype("decimal");
            queryItem.setPrecision(new BigInteger("31"));
            queryItem.setScale(new BigInteger("4"));
            queryItem.setSize(16l);

        } else
        {
            queryItem.setRegularAggregate(RegularAggregateType.UNSUPPORTED);
            queryItem.setSemiAggregate(RegularAggregateType.UNSUPPORTED);
            queryItem.setDatatype("characterLength16");
            queryItem.setPrecision(new BigInteger("20"));
            queryItem.setScale(new BigInteger("0"));
            queryItem.setSize(42l);

        }

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

    public String getLookupAlias(String name)
    {
        return configUtil.getLookupAlias(name);
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
            case LOOKUP:
            {
                return getLookupAlias(name);
            }
            default:
            {
                return "Unsupported view type: " + type;
            }
        }
    }


    /**
     * @param objectFactory
     * @param parentNamespace
     * @param view
     * @param overrideDisplayName
     */
    private void addHierarchy(ObjectFactory objectFactory, Namespace parentNamespace, BIView view, String overrideDisplayName)
    {
        // see if we have defined an alias

        String hierarchyDisplayName = (overrideDisplayName == null) ? (view.getAlias() == null) ? configUtil.getHierarchyAlias(view.getViewName()) : view.getAlias() : overrideDisplayName;


        if (view.isIgnore())
        {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring view [").append(view.getViewName()).append("]");
            // skip to next view
            return;
        }

        log.info("Adding hierarchy: " + view);

        Set<String> columnSet = new HashSet<>();
        DefinitionType.DbQuery query = objectFactory.createDefinitionTypeDbQuery();
        SqlType sqlType = objectFactory.createSqlType();
        sqlType.setType(COGNOS_TYPE);
        query.setTableType("view");
        sqlType.getContent().add("Select ");
        MacroType columnType = objectFactory.createMacroType();
        columnType.setContent("*");
        MacroType tableType = objectFactory.createMacroType();
        tableType.setContent("[Assortment Planning]." + view.getSourceTable());
        sqlType.getContent().add(objectFactory.createSqlTypeColumn(columnType));
        sqlType.getContent().add(" from ");

        sqlType.getContent().add(objectFactory.createSqlTypeTable(tableType));

        QuerySubject querySubject = objectFactory.createQuerySubject();
        querySubject.setDefinition(objectFactory.createDefinitionType());
        querySubject.setStatus(StatusType.fromValue("valid"));
        setChangeTimeAndOwner(querySubject);
        querySubject.getName().add(createNameType(objectFactory, hierarchyDisplayName));

        // set query sources
        query.setSources(getSources(objectFactory));
        query.setSql(sqlType);
        querySubject.getDefinition().setDbQuery(query);

        // add determinants
        QuerySubject.Determinants determinants = objectFactory.createQuerySubjectDeterminants();
        // get all hierarchy levels
        List<String> hierarchyColumns = toolkit.getTableColumns(view.getSourceTable(), ID_COLUMNS_ONLY);
        int processedDeterminants = 0;

        for (String columnName : hierarchyColumns)
        {
            RefCollectionType keyCollection = objectFactory.createRefCollectionType();
            processedDeterminants++;
            log.finer("Adding column : " + columnName + " to " + view.getViewName());
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
            keyStr.append("[Hierarchies].[").append(view.getViewName()).append("].[").append(columnName).append("_ID]");
            columnSet.add(keyStr.toString());
            for (String keyCol : columnSet)
            {
                keyCollection.getRefobj().add(keyCol);
            }
            idColumnDeterminant.setKey(keyCollection);

            StringBuilder attrStr = new StringBuilder();
            attrStr.append("[Hierarchies].[").append(view.getViewName()).append("].[").append(columnName).append("_NAME]");
            attributeCollection.getRefobj().add(attrStr.toString());
            idColumnDeterminant.setAttributes(attributeCollection);
            determinants.getDeterminant().add(idColumnDeterminant);


        }

        // add query items
        for (String columnName : hierarchyColumns)
        {

            // add id column
            log.finer("Adding query item : " + columnName + " to " + view.getViewName());
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


        parentNamespace.getFolderOrFunctionOrNamespace().add(querySubject);

    }


    /**
     * Add a plan entry
     * @param objectFactory
     * @param parentNamespace
     * @param view
     */
    private void addPlanEntry(ObjectFactory objectFactory, Namespace parentNamespace, BIView view) {
        QuerySubject querySubject = objectFactory.createQuerySubject();


        // see if we have defined an alias
        String attributeDisplayName = (view.getAlias() == null) ? view.getViewName() : view.getAlias();

        querySubject.getName().add(createNameType(objectFactory, attributeDisplayName));
        querySubject.setStatus(StatusType.NEEDS_REEVALUATION);
        setChangeTimeAndOwner(querySubject);
        parentNamespace.getFolderOrFunctionOrNamespace().add(querySubject);

        DefinitionType.DbQuery query = objectFactory.createDefinitionTypeDbQuery();
        SqlType sqlType = objectFactory.createSqlType();
        sqlType.setType(COGNOS_TYPE);
        query.setTableType("view");
        sqlType.getContent().add("Select ");
        MacroType columnType = objectFactory.createMacroType();
        columnType.setContent("*");
        MacroType tableType = objectFactory.createMacroType();
        tableType.setContent("[Assortment Planning]." + view.getSourceTable());
        sqlType.getContent().add(objectFactory.createSqlTypeColumn(columnType));
        sqlType.getContent().add(" from ");

        sqlType.getContent().add(objectFactory.createSqlTypeTable(tableType));
        querySubject.setDefinition(objectFactory.createDefinitionType());
        // set the query sql  /definition/dbQuery/sql
        query.setSql(sqlType);
        // set the definition query /definition/dbQuery
        querySubject.getDefinition().setDbQuery(query);
        // set the source /definition/dbQuery/sources
        query.setSources(getSources(objectFactory));

        // add all columns of the attribute table
        for (String attrColumnName : toolkit.getTableColumns(view.getSourceTable(), ALL_COLUMNS))
        {
            querySubject.getQueryItemOrQueryItemFolder().add(createQueryItem(objectFactory,"Plans", view, attrColumnName, null,false));
        }
    }


    /**
     * Generate a query block
     *
     * <dbQuery>
     * <sources>
     * <dataSourceRef>[].[dataSources].[Assortment planning]</dataSourceRef>
     * </sources>
     * <sql type="cognos">Select <column>*</column>from<table>[Assortment planning].A_NODE_RVA</table></sql>
     * <tableType>view</tableType>
     * </dbQuery>
     *
     * @param objectFactory
     * @param tableName
     * @return
     */
    private DefinitionType.DbQuery getQuery(ObjectFactory objectFactory, String tableName) {
        DefinitionType.DbQuery query = objectFactory.createDefinitionTypeDbQuery();

        SqlType sqlType = objectFactory.createSqlType();
        sqlType.setType(COGNOS_TYPE);
        query.setTableType("view");
        query.setSources(getSources(objectFactory));
        sqlType.getContent().add("Select ");
        MacroType columnType = objectFactory.createMacroType();
        columnType.setContent("*");
        MacroType tableType = objectFactory.createMacroType();
        tableType.setContent("[Assortment Planning]." + tableName);
        sqlType.getContent().add(objectFactory.createSqlTypeColumn(columnType));
        sqlType.getContent().add(" from ");
        sqlType.getContent().add(objectFactory.createSqlTypeTable(tableType));
        query.setSql(sqlType);
        return query;
    }
}
