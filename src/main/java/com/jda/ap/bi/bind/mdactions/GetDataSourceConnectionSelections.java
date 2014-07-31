
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
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}dataSourceName"/>
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
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceConnectionName"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceConnectionSignonName"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceConnectionSignonUser"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceConnectionSignonPassword"/>
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
@XmlRootElement(name = "GetDataSourceConnectionSelections", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class GetDataSourceConnectionSelections
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected GetDataSourceConnectionSelections.InputParams inputParams;
    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
    protected GetDataSourceConnectionSelections.OutputParams outputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link GetDataSourceConnectionSelections.InputParams }
     *     
     */
    public GetDataSourceConnectionSelections.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDataSourceConnectionSelections.InputParams }
     *     
     */
    public void setInputParams(GetDataSourceConnectionSelections.InputParams value) {
        this.inputParams = value;
    }

    /**
     * Gets the value of the outputParams property.
     * 
     * @return
     *     possible object is
     *     {@link GetDataSourceConnectionSelections.OutputParams }
     *     
     */
    public GetDataSourceConnectionSelections.OutputParams getOutputParams() {
        return outputParams;
    }

    /**
     * Sets the value of the outputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDataSourceConnectionSelections.OutputParams }
     *     
     */
    public void setOutputParams(GetDataSourceConnectionSelections.OutputParams value) {
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
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}dataSourceName"/>
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
        "dataSourceName"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String dataSourceName;

        /**
         * Gets the value of the dataSourceName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataSourceName() {
            return dataSourceName;
        }

        /**
         * Sets the value of the dataSourceName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataSourceName(String value) {
            this.dataSourceName = value;
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
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceConnectionName"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceConnectionSignonName"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceConnectionSignonUser"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceConnectionSignonPassword"/>
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
        "crnDataSourceConnectionName",
        "crnDataSourceConnectionSignonName",
        "crnDataSourceConnectionSignonUser",
        "crnDataSourceConnectionSignonPassword"
    })
    public static class OutputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String crnDataSourceConnectionName;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String crnDataSourceConnectionSignonName;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String crnDataSourceConnectionSignonUser;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String crnDataSourceConnectionSignonPassword;

        /**
         * Gets the value of the crnDataSourceConnectionName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCrnDataSourceConnectionName() {
            return crnDataSourceConnectionName;
        }

        /**
         * Sets the value of the crnDataSourceConnectionName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCrnDataSourceConnectionName(String value) {
            this.crnDataSourceConnectionName = value;
        }

        /**
         * Gets the value of the crnDataSourceConnectionSignonName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCrnDataSourceConnectionSignonName() {
            return crnDataSourceConnectionSignonName;
        }

        /**
         * Sets the value of the crnDataSourceConnectionSignonName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCrnDataSourceConnectionSignonName(String value) {
            this.crnDataSourceConnectionSignonName = value;
        }

        /**
         * Gets the value of the crnDataSourceConnectionSignonUser property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCrnDataSourceConnectionSignonUser() {
            return crnDataSourceConnectionSignonUser;
        }

        /**
         * Sets the value of the crnDataSourceConnectionSignonUser property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCrnDataSourceConnectionSignonUser(String value) {
            this.crnDataSourceConnectionSignonUser = value;
        }

        /**
         * Gets the value of the crnDataSourceConnectionSignonPassword property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCrnDataSourceConnectionSignonPassword() {
            return crnDataSourceConnectionSignonPassword;
        }

        /**
         * Sets the value of the crnDataSourceConnectionSignonPassword property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCrnDataSourceConnectionSignonPassword(String value) {
            this.crnDataSourceConnectionSignonPassword = value;
        }

    }

}
