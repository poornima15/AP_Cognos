
package com.jda.ap.bi.bind.mdactions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;extension base="{http://www.developer.cognos.com/schemas/fmsdk/1/0}action">
 *       &lt;sequence>
 *         &lt;element name="inputParams">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;group ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}inputParamsDynamicImportPublish"/>
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
    "inputParams"
})
@XmlRootElement(name = "DynamicImportPublish", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class DynamicImportPublish
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected DynamicImportPublish.InputParams inputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicImportPublish.InputParams }
     *     
     */
    public DynamicImportPublish.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicImportPublish.InputParams }
     *     
     */
    public void setInputParams(DynamicImportPublish.InputParams value) {
        this.inputParams = value;
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
     *       &lt;group ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}inputParamsDynamicImportPublish"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "crnDataSourceName",
        "targetPackageName",
        "catalogName",
        "schemaName",
        "cubeName",
        "db2AliasLocales",
        "db2AliasNames"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String crnDataSourceName;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String targetPackageName;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String catalogName;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String schemaName;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String cubeName;
        @XmlElement(name = "DB2AliasLocales", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected LocaleCollection db2AliasLocales;
        @XmlElement(name = "DB2AliasNames", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected StringCollection db2AliasNames;

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
         * Gets the value of the targetPackageName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTargetPackageName() {
            return targetPackageName;
        }

        /**
         * Sets the value of the targetPackageName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTargetPackageName(String value) {
            this.targetPackageName = value;
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

        /**
         * Gets the value of the db2AliasLocales property.
         * 
         * @return
         *     possible object is
         *     {@link LocaleCollection }
         *     
         */
        public LocaleCollection getDB2AliasLocales() {
            return db2AliasLocales;
        }

        /**
         * Sets the value of the db2AliasLocales property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocaleCollection }
         *     
         */
        public void setDB2AliasLocales(LocaleCollection value) {
            this.db2AliasLocales = value;
        }

        /**
         * Gets the value of the db2AliasNames property.
         * 
         * @return
         *     possible object is
         *     {@link StringCollection }
         *     
         */
        public StringCollection getDB2AliasNames() {
            return db2AliasNames;
        }

        /**
         * Sets the value of the db2AliasNames property.
         * 
         * @param value
         *     allowed object is
         *     {@link StringCollection }
         *     
         */
        public void setDB2AliasNames(StringCollection value) {
            this.db2AliasNames = value;
        }

    }

}
