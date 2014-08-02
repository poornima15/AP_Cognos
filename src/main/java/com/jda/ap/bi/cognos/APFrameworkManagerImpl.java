package com.jda.ap.bi.cognos;

/**
 * Created by Lee on 7/23/2014.
 */
/**
 * APFrameworkManagerImpl.java
 *
 * Licensed Material - Property of JDA Software
 * © Copyright JDA. 2014
 *
 * Description:
 *
 * Tested with: IBM Cognos BI 10.2.1, Java 7.0
 *

 */

import com.cognos.developer.schemas.bibus._3.*;
import com.cognos.developer.schemas.bmt._60._7.ObjectFactory;
import com.cognos.developer.schemas.bmt._60._7.Project;
import com.jda.ap.bi.BIModelServices;
import com.jda.ap.bi.cognos.config.CognosServiceConfig;
import com.jda.ap.bi.cognos.config.IServiceConfig;
import com.jda.ap.bi.cognos.exception.BIConfigException;
import com.jda.ap.bi.cognos.exception.FrameworkManagerException;
import com.jda.ap.bi.enums.ModelCommandEnum;
import com.jda.ap.bi.enums.ScriptPlaceholderEnum;
import com.jda.ap.bi.modeller.Modeller;
import com.sun.xml.internal.bind.marshaller.CharacterEscapeHandler;
import com.sun.xml.internal.bind.marshaller.DataWriter;
import org.apache.axis.AxisFault;
import org.apache.axis.client.Stub;
import org.apache.axis.message.SOAPHeaderElement;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import java.io.*;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Logger;


/**
 *
 */
public class APFrameworkManagerImpl extends BIModelServices
{
    private ContentManagerService_ServiceLocator cmServiceLocator = null;
    private MetadataService_ServiceLocator metadataServiceLocator = null;
    private ContentManagerService_PortType cmService = null;
    private MetadataService_PortType metadataService = null;
    private static final Logger log = Logger.getLogger(APFrameworkManagerImpl.class.getName());
    private static int transNbr = 1;

    /**
     * @param cognosServiceConfig
     */
    public APFrameworkManagerImpl(IServiceConfig cognosServiceConfig)
    {
        super(cognosServiceConfig);
        try
        {

            cmServiceLocator = new ContentManagerService_ServiceLocator();
            metadataServiceLocator = new MetadataService_ServiceLocator();
            cmService = cmServiceLocator
                    .getcontentManagerService(new java.net.URL(getConfig().getServiceConfig().getBI().getCognos().getServiceURL()));
            metadataService = new MetadataServiceStub(
                    new java.net.URL(getConfig().getServiceConfig().getBI().getCognos().getServiceURL()), metadataServiceLocator);
            // Set the Axis request timeout
            ((Stub) metadataService).setTimeout(0); // in milliseconds, 0 turns
            // the timeout off
            ((Stub) metadataService).setMaintainSession(true);

        }
        catch (Exception e)
        {
            throw new ServiceConfigurationError("Failed to created Framework manager instance: " + e.getMessage());
        }
    }

    /**
     * Get an instance of the framework manager helper
     *
     * @param configFile - path for the config folder
     */
    public APFrameworkManagerImpl(File configFile)
    {
        super(configFile);

        try
        {


            cmServiceLocator = new ContentManagerService_ServiceLocator();
            metadataServiceLocator = new MetadataService_ServiceLocator();
            cmService = cmServiceLocator
                    .getcontentManagerService(new java.net.URL(getConfig().getServiceConfig().getBI().getCognos().getServiceURL()));
            metadataService = new MetadataServiceStub(
                    new java.net.URL(getConfig().getServiceConfig().getBI().getCognos().getServiceURL()), metadataServiceLocator);
            // Set the Axis request timeout
            ((Stub) metadataService).setTimeout(0); // in milliseconds, 0 turns
            // the timeout off
            ((Stub) metadataService).setMaintainSession(true);

        }
        catch (Exception e)
        {
            throw new ServiceConfigurationError("Failed to created Framework manager instance: " + e.getMessage());
        }
    }

    /**
     * This method updates a metadata document. (unpublished model) The input
     * parameter is an XML string that needs to be constructed in order for the
     * metadata service to retrieve the proper information.
     *
     * @param model A metadata request (XML).
     * @throws com.jda.ap.bi.cognos.exception.FrameworkManagerException
     */
    public String createNewModel(String model) throws FrameworkManagerException
    {
        StringBuilder response = new StringBuilder();
        String modelName = model.replace(".xml",".cpf");
        log.info("Creating new model: " + modelName);
        try
        {
            // connect to the service first
            connectToService();
            File fReport = new File(model);
            if (fReport.exists()) // check to see if the location entered
            // exists.
            {
                response.append("Model already exists - do not perform createModel action");
                return response.toString();
            }

            StringBuffer createRequest = new StringBuffer();
            StringBuffer updateRequest2 = new StringBuffer();
            StringBuffer updateRequest3 = new StringBuffer();

            createRequest
                    .append("<mdprovider type=\"generic\" action=\"createModel\" model=\""
                            + modelName + "\"/>");

            String result = null;
            XmlEncodedXML xmlActionXml = new XmlEncodedXML();
            xmlActionXml.set_value(createRequest.toString());
            result = (getMetadataService().updateMetadata(xmlActionXml))
                    .get_value().toString();

            response.append("Model to be created: " + model).append("\n");
            response.append("results of the updateMetadata request (create)").append("\n");
            System.out.println("");
            if (result != null)
            {
                response.append(result).append("\n");
                System.out.println("");
            }
            else
            {
                throw new FrameworkManagerException("No result returned by updateMetadata request (create)");
            }
            updateRequest2
                    .append("<mdprovider type=\"generic\" action=\"saveModel\" model=\""
                            + modelName + "\"/>");
            xmlActionXml = new XmlEncodedXML();
            xmlActionXml.set_value(updateRequest2.toString());
            result = (getMetadataService().updateMetadata(xmlActionXml))
                    .get_value().toString();

            response.append("Model to be saved: " + model).append("\n");
            response.append("results of the updateMetadata request (save)").append("\n");
            if (result != null)
            {
                System.out.println(result);
                System.out.println("");
            }
            else
            {
                throw new FrameworkManagerException("No result returned by updateMetadata request (save)");

            }
            updateRequest3
                    .append("<mdprovider type=\"generic\" action=\"closeModel\" model=\""
                            + modelName + "\"/>");
            xmlActionXml = new XmlEncodedXML();
            xmlActionXml.set_value(updateRequest3.toString());
            result = (getMetadataService().updateMetadata(xmlActionXml))
                    .get_value().toString();

            response.append("Model to be closed: " + model).append("\n");
            response.append("results of the updateMetadata request (close)").append("\n");
            if (result != null)
            {
                response.append(result);
            }
            else
            {
                throw new FrameworkManagerException("No result returned by updateMetadata request (close)");

            }
        }
        catch ( AxisFault af ) {
            throw new FrameworkManagerException(useAxisInterface_dumpToString((AxisFault) af, "updateMetadata"));

        }
        catch (Exception e)
        {

            throw new FrameworkManagerException( e.getMessage(), e);
        } finally
        {
            logoffFromCognos();
        }
        return response.toString();
    }

    /**
     * For a particular command (listed in the enum) this will create the transaction request
     * by wrapping it in the appropriate mdprovider tags and then replace placeholders in the stored script
     * with the values provided in the value map.
     *
     * @param command
     * @param valueMap key-value pairs that map to placeholders in the appropriate script file (e.g. ~~PACKAGE_NAME~~)
     * @return
     * @throws com.jda.ap.bi.cognos.exception.FrameworkManagerException
     */
    @Override
    public String submitRequest(ModelCommandEnum command, Map<ScriptPlaceholderEnum, String> valueMap) throws FrameworkManagerException
    {
        log.info("Executing request: " + command);


        // get the appropriate script file for the request
        File scriptFile = command.getScriptFile();
        try
        {
            // connect to the service first
            connectToService();

            openProject("C:\\tempmodel\\model.xml");
            System.out.println("Packages: " + listPackages());

            publish("C:\\tempmodel\\model.xml");

            String content = new Scanner(scriptFile).useDelimiter("\\Z").next();
            XmlEncodedXML xmlActionXml = new XmlEncodedXML();
            xmlActionXml.set_value(content);
            Vector transactions = getTransactionsFromScript(content,
                    "c:\\tempmodel\\model.xml");
            log.info("Processing transactions: " + transactions.size());
            for (int i = 0; i < transactions.size(); i++)
            {
                String result = getMetadataService().updateMetadata(new XmlEncodedXML(transactions.get(i).toString())).toString();

                System.out.println("in execute for txn number " + i + " " + transactions.get(i).toString());
                System.out.println("Result: " + result);
            }


        }
        catch (FileNotFoundException e)
        {
            throw new FrameworkManagerException(e.getMessage(), e);
        }
        catch (RemoteException e)
        {
            e.printStackTrace();
            throw new FrameworkManagerException("Error: " + e.getMessage(), e);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        try
        {
            saveProject("C:\\tempmodel\\model.xml");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


        logoffFromCognos();

        return null;
    }

    /**
     * Save the project.
     *
     * @param projectLocation File path of the project affected
     * @return A string containing the status of the transaction.
     */
    private String saveProject(String projectLocation) throws Exception
    {
        log.info("Saving model : " + projectLocation);
        return getMetadataService()
                .updateMetadata(new XmlEncodedXML("<mdprovider type=\"generic\" action=\"saveModel\" model=\""
                        + projectLocation + "\"/>")).toString();
    }

    public MetadataService_PortType getMetadataService(
            boolean isNewConversation, String RSGroup)
    {

        BiBusHeader bibus = null;
        bibus = getHeaderObject(((Stub) metadataService).getResponseHeader(
                        "http://developer.cognos.com/schemas/bibus/3/", "biBusHeader"),
                isNewConversation, RSGroup);

        if (bibus == null)
        {
            BiBusHeader CMbibus = null;
            CMbibus = getHeaderObject(((Stub) cmService).getResponseHeader(
                    "http://developer.cognos.com/schemas/bibus/3/",
                    "biBusHeader"), true, RSGroup);

            ((Stub) metadataService).setHeader(
                    "http://developer.cognos.com/schemas/bibus/3/",
                    "biBusHeader", CMbibus);
        }
        else
        {
            ((Stub) metadataService).clearHeaders();
            ((Stub) metadataService).setHeader(
                    "http://developer.cognos.com/schemas/bibus/3/",
                    "biBusHeader", bibus);

        }

        return metadataService;
    }

    // handle metadata service requests that do not specify new conversation for
    // backwards compatibility
    public MetadataService_PortType getMetadataService()
    {

        return getMetadataService(false, "");

    }

    // Use this method when copying headers, such as for requests to services
    public static BiBusHeader getHeaderObject(SOAPHeaderElement SourceHeader,
                                              boolean isNewConversation, String RSGroup)
    {
        if (SourceHeader == null)
            return null;

        BiBusHeader bibus = null;
        try
        {
            bibus = (BiBusHeader) SourceHeader.getValueAsType(new QName(
                    "http://developer.cognos.com/schemas/bibus/3/",
                    "biBusHeader"));

            // If the header will be used for a new conversation, clear
            // tracking information, and set routing if supplied (clear if not)
            if (isNewConversation)
            {

                bibus.setTracking(null);

                // If a Routing Server Group is specified, direct requests to it
                if (RSGroup.length() > 0)
                {
                    RoutingInfo routing = new RoutingInfo(RSGroup);
                    bibus.setRouting(routing);
                }
                else
                {
                    bibus.setRouting(null);
                }
            }
        }
        catch (Exception e)
        {

            e.printStackTrace();
        }

        return bibus;
    }


    /**
     * Login to the framework manager
     *
     * @return
     * @throws FrameworkManagerException
     */
    public String connectToService() throws FrameworkManagerException
    {
        StringBuffer credentialXML = new StringBuffer();

        // make sure config is loaded
        if (_config == null)
        {
            throw new FrameworkManagerException("Configuration problem - check prior messages");
        }

        credentialXML.append("<credential>");
        credentialXML.append("<namespace>").append(_config.getServiceConfig().getBI().getCognos().getNamespace()).append(
                "</namespace>");
        credentialXML.append("<username>").append(_config.getServiceConfig().getBI().getCognos().getUsername()).append("</username>");
        credentialXML.append("<password>").append(_config.getServiceConfig().getBI().getCognos().getPassword()).append("</password>");
        credentialXML.append("</credential>");

        String encodedCredentials = credentialXML.toString();

        try
        {

            cmService.logon(new XmlEncodedXML(encodedCredentials),
                    new SearchPathSingleObject[]{});

            SOAPHeaderElement temp = ((Stub) cmService).getResponseHeader(
                    "http://developer.cognos.com/schemas/bibus/3/",
                    "biBusHeader");
            BiBusHeader cmBiBusHeader = (BiBusHeader) temp
                    .getValueAsType(new QName(
                            "http://developer.cognos.com/schemas/bibus/3/",
                            "biBusHeader"));
            ((Stub) cmService).setHeader(
                    "http://developer.cognos.com/schemas/bibus/3/",
                    "biBusHeader", cmBiBusHeader);
            log.info("Config: " + _config.toString());
            return ("Logon successful as " + _config.getServiceConfig().getBI().getCognos().getUsername());
        }
        catch (Exception e)
        {
            String errStr = useAxisInterface_dumpToString((AxisFault) e, "connect");
            log.severe(errStr);
            throw new FrameworkManagerException("Login failed: " + errStr);
        }

    }

    /**
     * Build the model from the AP dataset
     *
     * @return
     * @throws com.jda.ap.bi.cognos.exception.FrameworkManagerException
     * @throws com.jda.ap.bi.cognos.exception.BIConfigException
     */
    @Override
    public String buildModel() throws FrameworkManagerException, BIConfigException
    {
        return null;
    }

    /**
     * Check if the model exists based on the config folder and filename
     *
     * @return
     * @throws com.jda.ap.bi.cognos.exception.BIConfigException
     */
    @Override
    public boolean isModelExists() throws BIConfigException
    {
        if (_config.getServiceConfig().getBI().getCognos().getModelFolder() == null)
        {
            throw new BIConfigException("No model folder specified in config");
        }
        if (_config.getServiceConfig().getBI().getCognos().getModelFile() == null)
        {
            throw new BIConfigException("No model filename specified in config");
        }
        File modelFile = new File(_config.getServiceConfig().getBI().getCognos().getModelFolder() + System.getProperty("file.separator") + _config.getServiceConfig().getBI().getCognos().getModelFile());


        boolean response = modelFile.exists();

        if (modelFile.exists() && !(modelFile.canWrite() && modelFile.canRead()))
        {
            throw new BIConfigException("Model file does exists but it not read/writable");
        }

        return response;

    }

    /**
     * publish the model
     *
     * @return
     * @throws com.jda.ap.bi.cognos.exception.FrameworkManagerException
     * @throws com.jda.ap.bi.cognos.exception.BIConfigException
     */
    @Override
    public String publishModel() throws FrameworkManagerException, BIConfigException
    {
        return null;
    }


    public static void main(String[] args)
    {
        String cognosEndPoint = "http://localhost:19300/p2pd/servlet/dispatch";

        // Logon information, not needed if using anonymous logon in Cognos
        // Configuration.
        String nameSpaceID = "CognosExpress";
        String userName = "administrator";
        String password = "jda";

        // new model to create
        String modelToCreate = "C:\\temp\\1393742.cpf";

        CognosServiceConfig config = CognosServiceConfig.getInstance();
        config.getServiceConfig().getBI().getCognos().setNamespace("CognosExpress");
        config.getServiceConfig().getBI().getCognos().setUsername(userName);
        config.getServiceConfig().getBI().getCognos().setPassword(password);

        APFrameworkManagerImpl fmh = new APFrameworkManagerImpl(config);
        // use this logon code to logon as a system administrator
        String logon_results = null;
        try
        {
            logon_results = fmh.connectToService();
        }
        catch (FrameworkManagerException e)
        {
            e.printStackTrace();
            logon_results = e.getMessage();
        }
        System.out.println(logon_results);

        // create a new model - if one does not exist at the following location
        try
        {
            fmh.createNewModel(modelToCreate);
        }
        catch (FrameworkManagerException e)
        {
            e.printStackTrace();
        }
    }

    private static String useAxisInterface_dumpToString(AxisFault ex, String src)
    {
        StringBuilder dumpToString = new StringBuilder();
        String details = ex.dumpToString();
        dumpToString.append("\n\n1) Axis Fault message in: " + src);
        dumpToString.append("-------------------------\n");
        String message = ex.getFaultString();
        dumpToString.append("message: " + message + "\n");
        dumpToString.append("Axis error - " + src + ": " + message);
        dumpToString.append(details);
        return dumpToString.toString();
    }


    /**
     * Update the connection URL
     *
     * @throws FrameworkManagerException
     */
    public void refreshConnectionInfo() throws FrameworkManagerException
    {

        log.fine("Refreshing connection...");

        try
        {
            cmService = cmServiceLocator
                    .getcontentManagerService(new java.net.URL(_config.getServiceConfig().getBI().getCognos().getServiceURL()));
            metadataService = new MetadataServiceStub(
                    new java.net.URL(_config.getServiceConfig().getBI().getCognos().getServiceURL()), metadataServiceLocator);
        }
        catch (AxisFault axisFault)
        {
            throw new FrameworkManagerException("SOAP Axis error: " + axisFault.dumpToString());
        }
        catch (MalformedURLException e)
        {
            throw new FrameworkManagerException("Invalid service URL provided", e);
        }
        catch (ServiceException e)
        {
            throw new FrameworkManagerException("Service error : " + e.getMessage(), e);
        }
        // Set the Axis request timeout
        ((Stub) metadataService).setTimeout(0); // in milliseconds, 0 turns
        // the timeout off
        ((Stub) metadataService).setMaintainSession(true);

        log.fine("...Refreshed");

    }

    private String openProject(String projectLocation) throws Exception
    {
        String sXML = "<mdprovider type=\"generic\" action=\"openModel\" model=\"" + projectLocation + "\"/>";
        XmlEncodedXML xmlActionXml = new XmlEncodedXML();
        xmlActionXml.set_value(sXML);
        String result = (getMetadataService().updateMetadata(xmlActionXml))
                .get_value().toString();
        log.info("Open project: " + result);
        return result;
    }


    /**
     * Get a list of all known packages
     *
     * @return
     * @throws FrameworkManagerException
     */
    public Map<String,String> listPackages() throws FrameworkManagerException
    {
        connectToService() ;
        Map<String,String> returnList = new HashMap<>();
        PropEnum props[] = new PropEnum[]{PropEnum.searchPath, PropEnum.defaultName};
        BaseClass bc[] = null;
        String searchPath = "/content//package";

        try
        {
            SearchPathMultipleObject spMulti =
                    new SearchPathMultipleObject(searchPath);
            bc = cmService.query(spMulti, props, new Sort[]{}, new QueryOptions());

            if (bc != null)
            {
                for (int i = 0; i < bc.length; i++)
                {
                    returnList.put(bc[i].getDefaultName().getValue(), bc[i].getSearchPath().getValue());
                }
            }
        }
        catch (Exception e)
        {
            throw new FrameworkManagerException("Failed to get package list: " + e.getMessage());
        }      finally
        {
            logoffFromCognos();
        }




        return returnList;
    }

    private void logoffFromCognos()
    {
        try
        {
            cmService.logoff();
            log.info("Disconnected from cognos");
        }
        catch (Exception ex)
        {
            log.warning("Disconnect failed: " + ex.getMessage());
            ex.printStackTrace();
        }
    }


    /**
     * Close the project.
     *
     * @param projectLocation File path of the project affected
     * @return A string containing the status of the transaction.
     */
    private String closeProject(String projectLocation) throws Exception
    {
        return getMetadataService()
                .updateMetadata(new XmlEncodedXML("<mdprovider type=\"generic\" action=\"closeModel\" model=\""
                        + projectLocation + "\"/>")).toString();
    }


    /**
     * Break down each transaction contained in the Framework Manager script.
     *
     * @param script          Script contents
     * @param projectLocation File path of the project affected
     * @return A vector containing each transaction found in the script.
     */
    private Vector getTransactionsFromScript(String script,
                                             String projectLocation) throws Exception
    {
        int start = 0;
        int end = 0;
        String mdproviderStartTag = "<mdprovider type=\"action\" action=\"execute\" model=\""
                + projectLocation + "\">";
        String mdproviderEndTag = "</mdprovider>";
        Vector transactions = new Vector();


        start = script.indexOf("<transaction ", end);

        while (start > 0)
        {
            end = script.indexOf("</transaction>", start);
            // add 14 to include the </transaction> element
            transactions.add(mdproviderStartTag
                    + script.substring(start, end + 14)
                    + mdproviderEndTag);
            start = end;
            start = script.indexOf("<transaction ", end);

        }
        return transactions;
    }

    public void createDatasource()
    {
        ObjectFactory objectFactory = new ObjectFactory();


    }


    public void publish(String model) throws RemoteException
    {

        String xmlStr =
                getTransactionHeader(model) + "<action seq=\"1\" type=\"Publish\">" + "<inputparams>" + "<param seq=\"1\" type=\"handle\">" +
                        "<mappingpath>package</mappingpath>" + "<value>[].[packages].[XX Data Warehouse]</value>" + "</param>" + "<param seq=\"2\" type=\"integer\">" +
                        "<value>2</value> " + "</param>" + "<param seq=\"3\" type=\"i18nstring\">" + "<value>/content</value> " + "</param>" + "<param seq=\"4\" type=\"i18nstring\">" +
                        "<value>GO Data Warehouse</value> " + "</param>" + "<param seq=\"5\" type=\"integer\">" + "<value>1</value>" + "</param>" + "<param seq=\"6\" type=\"integer\">" +
                        "<value>1</value> " + "</param>" + "<param seq=\"7\" type=\"integer\">" + "<value>-1</value>" + "</param>" + "</inputparams>"
                        + "</action>" + getTransactionTrailer();
        XmlEncodedXML xmlActionXml = new XmlEncodedXML();
        xmlActionXml.set_value(xmlStr);
        String result = (getMetadataService().updateMetadata(xmlActionXml))
                .get_value().toString();

    }

    private String getTransactionTrailer()
    {
        return "</transaction></mdprovider>";
    }


    private String getTransactionHeader(String modelName)
    {
        Date now = new Date();
        DateFormat df = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String nowTime = df.format(now);
        String transactionSeqNbr = Integer.toString(transNbr++);
        String transactionXML = "<mdprovider " + "type=\"action\" action=\"execute\" " + "model=\"" + modelName + "\">" + "<transaction seq=\"" + transactionSeqNbr + "\" saved=\"false\"" + " timestamp=\"" + nowTime + "\">";
        return transactionXML;
    }


    public void createDataSource(String dataSourceName,
                                 String dataSourceConnectionString) throws Exception
    {


        connectToService();
        DataSource dataSource = new DataSource();
        TokenProp tp = new TokenProp();
        tp.setValue(dataSourceName);
        dataSource.setDefaultName(tp);

        DataSourceConnection dataSourceConnection = new DataSourceConnection();
        dataSourceConnection.setDefaultName(tp);
        StringProp s = new StringProp();
        s.setValue(dataSourceConnectionString);
        dataSourceConnection.setConnectionString(s);

        AddOptions addOptions = new AddOptions();
        addOptions.setUpdateAction(UpdateActionEnum.replace);

        // Create the data source
        // CAMID(":")/dataSource[@name='Assortment Planning']
        cmService.add(new SearchPathSingleObject("CAMID(\":\")"),
                new BaseClass[]{dataSource}, addOptions);
        // Create the data source connection
        cmService.add(new SearchPathSingleObject(
                        "CAMID(\":\")/dataSource[@name='" + dataSourceName + "']"),
                new BaseClass[]{dataSourceConnection}, addOptions);

        logoffFromCognos();
    }


    /**
     * Get data sources with their connection info
     *
     * @throws Exception
     */
    public Map<String, String> listDataSourcesAndConnections() throws Exception
    {
        connectToService();
        Map<String, String> returnMap = new HashMap<>();
        PropEnum dataSourceProps[] = new PropEnum[]{PropEnum.defaultName, PropEnum.searchPath};
        PropEnum dataConnectionProps[] = new PropEnum[]{PropEnum.defaultName, PropEnum.connectionString};

        BaseClass[] dataSources = cmService.query(new SearchPathMultipleObject("CAMID(\":\")//dataSource"), dataSourceProps, new Sort[]{}, new QueryOptions());

        for (int i = 0; i < dataSources.length; i++)
        {
            BaseClass[] dataConnections = cmService.query(new SearchPathMultipleObject(dataSources[i].getSearchPath().getValue() + "//dataSourceConnection"), dataConnectionProps, new Sort[]{}, new QueryOptions());
            for (int j = 0; j < dataConnections.length; j++)
            {
                returnMap.put(dataConnections[j].getDefaultName().getValue(), ((DataSourceConnection) dataConnections[j]).getConnectionString().getValue());

            }
        }
        logoffFromCognos();
        return returnMap;
    }

    /**
     * Create a project and save it
     *
     * @throws com.jda.ap.bi.cognos.exception.FrameworkManagerException
     */
    @Override
    public void createAndSaveProject(File modelFile) throws FrameworkManagerException
    {
        connectToService();
        Modeller modeller = getModeller();
        Project project = null;
        try
        {
            project = modeller.createAPModel(modelFile);
            log.info("Generating project from AP data...");
            // replace existing model file with new project
            JAXBContext jaxbContext = JAXBContext.newInstance(Project.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.setProperty(Marshaller.JAXB_ENCODING,"UTF-8");
            FileWriter fw = new FileWriter(modelFile);
            // this is required because some elements within the schema need to have nested tags
            // for example <expression><refobj>...</refobj></expression> and the expression object
            // only takes a string an not another JAXBElement as a child param
            DataWriter dataWriter = new DataWriter(fw, "UTF-8", new CharacterEscapeHandler()
            {
                @Override
                public void escape(char[] buf, int start, int len, boolean isAttValue,
                                   Writer out) throws IOException {

                    for (int i = start; i < start + len; i++) {
                        char ch = buf[i];
                        out.write(ch);
                    }
                }
            });

            marshaller.marshal(project, dataWriter);
            fw.close();
            log.info("Saving project...");
            saveProject(modelFile.getAbsolutePath());
            log.info("Done");
        }
        catch (Exception e)
        {
            e.printStackTrace();
           throw new FrameworkManagerException(e.getMessage(),e);
        }  finally {
            logoffFromCognos();
        }
    }
}
