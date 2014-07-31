//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.18 at 10:35:14 AM MDT 
//


package com.cognos.developer.schemas.bmt._60._7;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.developer.cognos.com/schemas/bmt/60/7}modelObjectType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.developer.cognos.com/schemas/bmt/60/7}projectProperties"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/bmt/60/7}namespace"/>
 *         &lt;element name="dataSources">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/bmt/60/7}dataSource"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="parameterMaps">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/bmt/60/7}parameterMap" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="securityViews">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/bmt/60/7}securityView" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="packages">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/bmt/60/7}package" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="useMFW" default="false">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *             &lt;enumeration value="always"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="containsDynamicContent" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="queryMode" default="mixed">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="mixed"/>
 *             &lt;enumeration value="dynamic"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "locales",
    "defaultLocale",
    "fixIdsToDefaultLocale",
    "qosOverrides",
    "isNullSuppressionAllowed",
    "isMultiEdgeNullSuppressionAllowed",
    "isAccessToNullSuppressionOptionsAllowed",
    "steward",
    "physicalSources",
    "namespace",
    "dataSources",
    "parameterMaps",
    "securityViews",
    "packages"
})
@XmlRootElement(name = "project")
public class Project
    extends ModelObjectType
{

    @XmlElement(required = true)
    protected SupportedLocalesType locales;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String defaultLocale;
    @XmlElement(defaultValue = "false")
    protected Boolean fixIdsToDefaultLocale;
    protected QosOverrides qosOverrides;
    @XmlElement(defaultValue = "true")
    protected Boolean isNullSuppressionAllowed;
    @XmlElement(defaultValue = "true")
    protected Boolean isMultiEdgeNullSuppressionAllowed;
    @XmlElement(defaultValue = "true")
    protected Boolean isAccessToNullSuppressionOptionsAllowed;
    protected String steward;
    protected com.cognos.developer.schemas.bmt._60._7.Project.PhysicalSources physicalSources;
    @XmlElement(required = true)
    protected Namespace namespace;
    @XmlElement(required = true)
    protected com.cognos.developer.schemas.bmt._60._7.Project.DataSources dataSources;
    @XmlElement(required = true)
    protected com.cognos.developer.schemas.bmt._60._7.Project.ParameterMaps parameterMaps;
    @XmlElement(required = true)
    protected com.cognos.developer.schemas.bmt._60._7.Project.SecurityViews securityViews;
    @XmlElement(required = true)
    protected com.cognos.developer.schemas.bmt._60._7.Project.Packages packages;
    @XmlAttribute(name = "useMFW")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String useMFW;
    @XmlAttribute(name = "containsDynamicContent")
    protected Boolean containsDynamicContent;
    @XmlAttribute(name = "queryMode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String queryMode;

    /**
     * Gets the value of the locales property.
     *
     * @return
     *     possible object is
     *     {@link SupportedLocalesType }
     *
     */
    public SupportedLocalesType getLocales() {
        return locales;
    }

    /**
     * Sets the value of the locales property.
     *
     * @param value
     *     allowed object is
     *     {@link SupportedLocalesType }
     *
     */
    public void setLocales(SupportedLocalesType value) {
        this.locales = value;
    }

    /**
     * Gets the value of the defaultLocale property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDefaultLocale() {
        return defaultLocale;
    }

    /**
     * Sets the value of the defaultLocale property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDefaultLocale(String value) {
        this.defaultLocale = value;
    }

    /**
     * Gets the value of the fixIdsToDefaultLocale property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isFixIdsToDefaultLocale() {
        return fixIdsToDefaultLocale;
    }

    /**
     * Sets the value of the fixIdsToDefaultLocale property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setFixIdsToDefaultLocale(Boolean value) {
        this.fixIdsToDefaultLocale = value;
    }

    /**
     * Gets the value of the qosOverrides property.
     *
     * @return
     *     possible object is
     *     {@link QosOverrides }
     *
     */
    public QosOverrides getQosOverrides() {
        return qosOverrides;
    }

    /**
     * Sets the value of the qosOverrides property.
     *
     * @param value
     *     allowed object is
     *     {@link QosOverrides }
     *
     */
    public void setQosOverrides(QosOverrides value) {
        this.qosOverrides = value;
    }

    /**
     * Gets the value of the isNullSuppressionAllowed property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsNullSuppressionAllowed() {
        return isNullSuppressionAllowed;
    }

    /**
     * Sets the value of the isNullSuppressionAllowed property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsNullSuppressionAllowed(Boolean value) {
        this.isNullSuppressionAllowed = value;
    }

    /**
     * Gets the value of the isMultiEdgeNullSuppressionAllowed property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsMultiEdgeNullSuppressionAllowed() {
        return isMultiEdgeNullSuppressionAllowed;
    }

    /**
     * Sets the value of the isMultiEdgeNullSuppressionAllowed property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsMultiEdgeNullSuppressionAllowed(Boolean value) {
        this.isMultiEdgeNullSuppressionAllowed = value;
    }

    /**
     * Gets the value of the isAccessToNullSuppressionOptionsAllowed property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsAccessToNullSuppressionOptionsAllowed() {
        return isAccessToNullSuppressionOptionsAllowed;
    }

    /**
     * Sets the value of the isAccessToNullSuppressionOptionsAllowed property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsAccessToNullSuppressionOptionsAllowed(Boolean value) {
        this.isAccessToNullSuppressionOptionsAllowed = value;
    }

    /**
     * Gets the value of the steward property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSteward() {
        return steward;
    }

    /**
     * Sets the value of the steward property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSteward(String value) {
        this.steward = value;
    }

    /**
     * Gets the value of the physicalSources property.
     *
     * @return
     *     possible object is
     *     {@link com.cognos.developer.schemas.bmt._60._7.Project.PhysicalSources }
     *
     */
    public com.cognos.developer.schemas.bmt._60._7.Project.PhysicalSources getPhysicalSources() {
        return physicalSources;
    }

    /**
     * Sets the value of the physicalSources property.
     *
     * @param value
     *     allowed object is
     *     {@link com.cognos.developer.schemas.bmt._60._7.Project.PhysicalSources }
     *
     */
    public void setPhysicalSources(com.cognos.developer.schemas.bmt._60._7.Project.PhysicalSources value) {
        this.physicalSources = value;
    }

    /**
     * Gets the value of the namespace property.
     *
     * @return
     *     possible object is
     *     {@link Namespace }
     *
     */
    public Namespace getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     *
     * @param value
     *     allowed object is
     *     {@link Namespace }
     *
     */
    public void setNamespace(Namespace value) {
        this.namespace = value;
    }

    /**
     * Gets the value of the dataSources property.
     *
     * @return
     *     possible object is
     *     {@link com.cognos.developer.schemas.bmt._60._7.Project.DataSources }
     *
     */
    public com.cognos.developer.schemas.bmt._60._7.Project.DataSources getDataSources() {
        return dataSources;
    }

    /**
     * Sets the value of the dataSources property.
     *
     * @param value
     *     allowed object is
     *     {@link com.cognos.developer.schemas.bmt._60._7.Project.DataSources }
     *
     */
    public void setDataSources(com.cognos.developer.schemas.bmt._60._7.Project.DataSources value) {
        this.dataSources = value;
    }

    /**
     * Gets the value of the parameterMaps property.
     *
     * @return
     *     possible object is
     *     {@link com.cognos.developer.schemas.bmt._60._7.Project.ParameterMaps }
     *
     */
    public com.cognos.developer.schemas.bmt._60._7.Project.ParameterMaps getParameterMaps() {
        return parameterMaps;
    }

    /**
     * Sets the value of the parameterMaps property.
     *
     * @param value
     *     allowed object is
     *     {@link com.cognos.developer.schemas.bmt._60._7.Project.ParameterMaps }
     *
     */
    public void setParameterMaps(com.cognos.developer.schemas.bmt._60._7.Project.ParameterMaps value) {
        this.parameterMaps = value;
    }

    /**
     * Gets the value of the securityViews property.
     *
     * @return
     *     possible object is
     *     {@link com.cognos.developer.schemas.bmt._60._7.Project.SecurityViews }
     *
     */
    public com.cognos.developer.schemas.bmt._60._7.Project.SecurityViews getSecurityViews() {
        return securityViews;
    }

    /**
     * Sets the value of the securityViews property.
     *
     * @param value
     *     allowed object is
     *     {@link com.cognos.developer.schemas.bmt._60._7.Project.SecurityViews }
     *
     */
    public void setSecurityViews(com.cognos.developer.schemas.bmt._60._7.Project.SecurityViews value) {
        this.securityViews = value;
    }

    /**
     * Gets the value of the packages property.
     *
     * @return
     *     possible object is
     *     {@link com.cognos.developer.schemas.bmt._60._7.Project.Packages }
     *
     */
    public com.cognos.developer.schemas.bmt._60._7.Project.Packages getPackages() {
        return packages;
    }

    /**
     * Sets the value of the packages property.
     *
     * @param value
     *     allowed object is
     *     {@link com.cognos.developer.schemas.bmt._60._7.Project.Packages }
     *
     */
    public void setPackages(com.cognos.developer.schemas.bmt._60._7.Project.Packages value) {
        this.packages = value;
    }

    /**
     * Gets the value of the useMFW property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUseMFW() {
        if (useMFW == null) {
            return "false";
        } else {
            return useMFW;
        }
    }

    /**
     * Sets the value of the useMFW property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUseMFW(String value) {
        this.useMFW = value;
    }

    /**
     * Gets the value of the containsDynamicContent property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isContainsDynamicContent() {
        if (containsDynamicContent == null) {
            return false;
        } else {
            return containsDynamicContent;
        }
    }

    /**
     * Sets the value of the containsDynamicContent property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setContainsDynamicContent(Boolean value) {
        this.containsDynamicContent = value;
    }

    /**
     * Gets the value of the queryMode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getQueryMode() {
        if (queryMode == null) {
            return "mixed";
        } else {
            return queryMode;
        }
    }

    /**
     * Sets the value of the queryMode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setQueryMode(String value) {
        this.queryMode = value;
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/bmt/60/7}dataSource"/>
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
        "dataSource"
    })
    public static class DataSources {

        protected List<DataSourceType> dataSource;

        /**
         * Gets the value of the dataSource property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dataSource property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDataSource().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DataSourceType }
         *
         *
         */
        public List<DataSourceType> getDataSource() {
            if (dataSource == null) {
                dataSource = new ArrayList<DataSourceType>();
            }
            return this.dataSource;
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
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/bmt/60/7}package" maxOccurs="unbounded" minOccurs="0"/>
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
        "_package"
    })
    public static class Packages {

        @XmlElement(name = "package")
        protected List<PackageViewType> _package;

        /**
         * Gets the value of the package property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the package property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPackage().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PackageViewType }
         *
         *
         */
        public List<PackageViewType> getPackage() {
            if (_package == null) {
                _package = new ArrayList<PackageViewType>();
            }
            return this._package;
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
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/bmt/60/7}parameterMap" maxOccurs="unbounded"/>
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
        "parameterMap"
    })
    public static class ParameterMaps {

        @XmlElement(required = true)
        protected List<ParameterMapType> parameterMap;

        /**
         * Gets the value of the parameterMap property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parameterMap property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParameterMap().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParameterMapType }
         *
         *
         */
        public List<ParameterMapType> getParameterMap() {
            if (parameterMap == null) {
                parameterMap = new ArrayList<ParameterMapType>();
            }
            return this.parameterMap;
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="physicalSource">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="filePath" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                   &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                 &lt;/choice>
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
        "physicalSource"
    })
    public static class PhysicalSources {

        protected List<com.cognos.developer.schemas.bmt._60._7.Project.PhysicalSources.PhysicalSource> physicalSource;

        /**
         * Gets the value of the physicalSource property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the physicalSource property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhysicalSource().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link com.cognos.developer.schemas.bmt._60._7.Project.PhysicalSources.PhysicalSource }
         *
         *
         */
        public List<com.cognos.developer.schemas.bmt._60._7.Project.PhysicalSources.PhysicalSource> getPhysicalSource() {
            if (physicalSource == null) {
                physicalSource = new ArrayList<com.cognos.developer.schemas.bmt._60._7.Project.PhysicalSources.PhysicalSource>();
            }
            return this.physicalSource;
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
         *       &lt;choice>
         *         &lt;element name="filePath" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
            "filePath",
            "content"
        })
        public static class PhysicalSource {

            protected Object filePath;
            protected Object content;

            /**
             * Gets the value of the filePath property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getFilePath() {
                return filePath;
            }

            /**
             * Sets the value of the filePath property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setFilePath(Object value) {
                this.filePath = value;
            }

            /**
             * Gets the value of the content property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getContent() {
                return content;
            }

            /**
             * Sets the value of the content property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setContent(Object value) {
                this.content = value;
            }

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
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/bmt/60/7}securityView" maxOccurs="unbounded" minOccurs="0"/>
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
        "securityView"
    })
    public static class SecurityViews {

        protected List<SecurityViewType> securityView;

        /**
         * Gets the value of the securityView property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the securityView property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSecurityView().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SecurityViewType }
         * 
         * 
         */
        public List<SecurityViewType> getSecurityView() {
            if (securityView == null) {
                securityView = new ArrayList<SecurityViewType>();
            }
            return this.securityView;
        }

    }

}
