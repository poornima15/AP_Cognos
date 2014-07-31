
package com.jda.ap.bi.bind.mdactions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.developer.cognos.com/schemas/fmsdk/1/0}action">
 *       &lt;sequence>
 *         &lt;element name="inputParams">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dataSourceIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceName"/>
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}catalogName"/>
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}schemaName"/>
 *                       &lt;sequence minOccurs="0">
 *                         &lt;element name="cubeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                       &lt;/sequence>
 *                     &lt;/sequence>
 *                   &lt;/sequence>
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
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}dataSource"/>
 *                   &lt;element name="findOrCreateDataSourceStatus">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         &lt;enumeration value="0"/>
 *                         &lt;enumeration value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
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
@XmlRootElement(name = "FindOrCreateDataSource", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class FindOrCreateDataSource
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected FindOrCreateDataSource.InputParams inputParams;
    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
    protected FindOrCreateDataSource.OutputParams outputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link FindOrCreateDataSource.InputParams }
     *     
     */
    public FindOrCreateDataSource.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindOrCreateDataSource.InputParams }
     *     
     */
    public void setInputParams(FindOrCreateDataSource.InputParams value) {
        this.inputParams = value;
    }

    /**
     * Gets the value of the outputParams property.
     * 
     * @return
     *     possible object is
     *     {@link FindOrCreateDataSource.OutputParams }
     *     
     */
    public FindOrCreateDataSource.OutputParams getOutputParams() {
        return outputParams;
    }

    /**
     * Sets the value of the outputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindOrCreateDataSource.OutputParams }
     *     
     */
    public void setOutputParams(FindOrCreateDataSource.OutputParams value) {
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
     *         &lt;element name="dataSourceIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceName"/>
     *         &lt;sequence minOccurs="0">
     *           &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}catalogName"/>
     *           &lt;sequence minOccurs="0">
     *             &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}schemaName"/>
     *             &lt;sequence minOccurs="0">
     *               &lt;element name="cubeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *             &lt;/sequence>
     *           &lt;/sequence>
     *         &lt;/sequence>
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
        "dataSourceIndicator",
        "crnDataSourceName",
        "catalogName",
        "schemaName",
        "cubeName"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String dataSourceIndicator;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String crnDataSourceName;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String catalogName;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String schemaName;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String cubeName;

        /**
         * Gets the value of the dataSourceIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataSourceIndicator() {
            return dataSourceIndicator;
        }

        /**
         * Sets the value of the dataSourceIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataSourceIndicator(String value) {
            this.dataSourceIndicator = value;
        }

        /**
         * Gets the value of the crnDataSourceName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCrnDataSourceName() {
            return crnDataSourceName;
        }

        /**
         * Sets the value of the crnDataSourceName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCrnDataSourceName(String value) {
            this.crnDataSourceName = value;
        }

        /**
         * Gets the value of the catalogName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCatalogName() {
            return catalogName;
        }

        /**
         * Sets the value of the catalogName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCatalogName(String value) {
            this.catalogName = value;
        }

        /**
         * Gets the value of the schemaName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchemaName() {
            return schemaName;
        }

        /**
         * Sets the value of the schemaName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchemaName(String value) {
            this.schemaName = value;
        }

        /**
         * Gets the value of the cubeName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCubeName() {
            return cubeName;
        }

        /**
         * Sets the value of the cubeName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCubeName(String value) {
            this.cubeName = value;
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
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}dataSource"/>
     *         &lt;element name="findOrCreateDataSourceStatus">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               &lt;enumeration value="0"/>
     *               &lt;enumeration value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "dataSource",
        "findOrCreateDataSourceStatus"
    })
    public static class OutputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String dataSource;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String findOrCreateDataSourceStatus;

        /**
         * Gets the value of the dataSource property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataSource() {
            return dataSource;
        }

        /**
         * Sets the value of the dataSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataSource(String value) {
            this.dataSource = value;
        }

        /**
         * Gets the value of the findOrCreateDataSourceStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFindOrCreateDataSourceStatus() {
            return findOrCreateDataSourceStatus;
        }

        /**
         * Sets the value of the findOrCreateDataSourceStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFindOrCreateDataSourceStatus(String value) {
            this.findOrCreateDataSourceStatus = value;
        }

    }

}
