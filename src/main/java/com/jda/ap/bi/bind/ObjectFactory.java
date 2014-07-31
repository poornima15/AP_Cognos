
package com.jda.ap.bi.bind;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jda.ap.bi.bind package. 
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

    private final static QName _AttributeDimensions_QNAME = new QName("", "AttributeDimensions");
    private final static QName _ServiceURL_QNAME = new QName("", "ServiceURL");
    private final static QName _Username_QNAME = new QName("", "username");
    private final static QName _LookupID_QNAME = new QName("", "LookupID");
    private final static QName _Alias_QNAME = new QName("", "Alias");
    private final static QName _PlanID_QNAME = new QName("", "PlanID");
    private final static QName _ModelFile_QNAME = new QName("", "modelFile");
    private final static QName _ModelFolder_QNAME = new QName("", "modelFolder");
    private final static QName _URL_QNAME = new QName("", "URL");
    private final static QName _Password_QNAME = new QName("", "password");
    private final static QName _Namespace_QNAME = new QName("", "namespace");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jda.ap.bi.bind
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link APBIConfig }
     * 
     */
    public APBIConfig createAPBIConfig() {
        return new APBIConfig();
    }

    /**
     * Create an instance of {@link Datasource }
     * 
     */
    public Datasource createDatasource() {
        return new Datasource();
    }

    /**
     * Create an instance of {@link BI }
     * 
     */
    public BI createBI() {
        return new BI();
    }

    /**
     * Create an instance of {@link Cognos }
     * 
     */
    public Cognos createCognos() {
        return new Cognos();
    }

    /**
     * Create an instance of {@link Views }
     * 
     */
    public Views createViews() {
        return new Views();
    }

    /**
     * Create an instance of {@link AttributeViews }
     * 
     */
    public AttributeViews createAttributeViews() {
        return new AttributeViews();
    }

    /**
     * Create an instance of {@link View }
     * 
     */
    public View createView() {
        return new View();
    }

    /**
     * Create an instance of {@link HierarchyViews }
     * 
     */
    public HierarchyViews createHierarchyViews() {
        return new HierarchyViews();
    }

    /**
     * Create an instance of {@link PlanViews }
     * 
     */
    public PlanViews createPlanViews() {
        return new PlanViews();
    }

    /**
     * Create an instance of {@link LookupViews }
     * 
     */
    public LookupViews createLookupViews() {
        return new LookupViews();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AttributeDimensions")
    public JAXBElement<String> createAttributeDimensions(String value) {
        return new JAXBElement<String>(_AttributeDimensions_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ServiceURL")
    public JAXBElement<String> createServiceURL(String value) {
        return new JAXBElement<String>(_ServiceURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "username")
    public JAXBElement<String> createUsername(String value) {
        return new JAXBElement<String>(_Username_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LookupID")
    public JAXBElement<String> createLookupID(String value) {
        return new JAXBElement<String>(_LookupID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Alias")
    public JAXBElement<String> createAlias(String value) {
        return new JAXBElement<String>(_Alias_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PlanID")
    public JAXBElement<String> createPlanID(String value) {
        return new JAXBElement<String>(_PlanID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "modelFile")
    public JAXBElement<String> createModelFile(String value) {
        return new JAXBElement<String>(_ModelFile_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "modelFolder")
    public JAXBElement<String> createModelFolder(String value) {
        return new JAXBElement<String>(_ModelFolder_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "URL")
    public JAXBElement<String> createURL(String value) {
        return new JAXBElement<String>(_URL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "namespace")
    public JAXBElement<String> createNamespace(String value) {
        return new JAXBElement<String>(_Namespace_QNAME, String.class, null, value);
    }

}
