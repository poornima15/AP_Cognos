
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
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceName"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceConnectionName"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceConnectionSignonName" minOccurs="0"/>
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
    "inputParams"
})
@XmlRootElement(name = "SelectDataSourceConnection", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class SelectDataSourceConnection
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected SelectDataSourceConnection.InputParams inputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link SelectDataSourceConnection.InputParams }
     *     
     */
    public SelectDataSourceConnection.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectDataSourceConnection.InputParams }
     *     
     */
    public void setInputParams(SelectDataSourceConnection.InputParams value) {
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
     *       &lt;sequence>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceName"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceConnectionName"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceConnectionSignonName" minOccurs="0"/>
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
        "crnDataSourceName",
        "crnDataSourceConnectionName",
        "crnDataSourceConnectionSignonName"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String crnDataSourceName;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String crnDataSourceConnectionName;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String crnDataSourceConnectionSignonName;

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

    }

}
