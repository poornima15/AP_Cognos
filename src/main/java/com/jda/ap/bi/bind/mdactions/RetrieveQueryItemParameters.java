
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
 *                   &lt;element name="queryItemBasedParameterMap" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle"/>
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
 *                   &lt;element name="retrievedKeys" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}stringCollection"/>
 *                   &lt;element name="retrievedValues" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}stringCollection"/>
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
@XmlRootElement(name = "RetrieveQueryItemParameters", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class RetrieveQueryItemParameters
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected RetrieveQueryItemParameters.InputParams inputParams;
    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
    protected RetrieveQueryItemParameters.OutputParams outputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveQueryItemParameters.InputParams }
     *     
     */
    public RetrieveQueryItemParameters.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveQueryItemParameters.InputParams }
     *     
     */
    public void setInputParams(RetrieveQueryItemParameters.InputParams value) {
        this.inputParams = value;
    }

    /**
     * Gets the value of the outputParams property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveQueryItemParameters.OutputParams }
     *     
     */
    public RetrieveQueryItemParameters.OutputParams getOutputParams() {
        return outputParams;
    }

    /**
     * Sets the value of the outputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveQueryItemParameters.OutputParams }
     *     
     */
    public void setOutputParams(RetrieveQueryItemParameters.OutputParams value) {
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
     *         &lt;element name="queryItemBasedParameterMap" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle"/>
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
        "queryItemBasedParameterMap"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String queryItemBasedParameterMap;

        /**
         * Gets the value of the queryItemBasedParameterMap property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueryItemBasedParameterMap() {
            return queryItemBasedParameterMap;
        }

        /**
         * Sets the value of the queryItemBasedParameterMap property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueryItemBasedParameterMap(String value) {
            this.queryItemBasedParameterMap = value;
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
     *         &lt;element name="retrievedKeys" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}stringCollection"/>
     *         &lt;element name="retrievedValues" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}stringCollection"/>
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
        "retrievedKeys",
        "retrievedValues"
    })
    public static class OutputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected StringCollection retrievedKeys;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected StringCollection retrievedValues;

        /**
         * Gets the value of the retrievedKeys property.
         * 
         * @return
         *     possible object is
         *     {@link StringCollection }
         *     
         */
        public StringCollection getRetrievedKeys() {
            return retrievedKeys;
        }

        /**
         * Sets the value of the retrievedKeys property.
         * 
         * @param value
         *     allowed object is
         *     {@link StringCollection }
         *     
         */
        public void setRetrievedKeys(StringCollection value) {
            this.retrievedKeys = value;
        }

        /**
         * Gets the value of the retrievedValues property.
         * 
         * @return
         *     possible object is
         *     {@link StringCollection }
         *     
         */
        public StringCollection getRetrievedValues() {
            return retrievedValues;
        }

        /**
         * Sets the value of the retrievedValues property.
         * 
         * @param value
         *     allowed object is
         *     {@link StringCollection }
         *     
         */
        public void setRetrievedValues(StringCollection value) {
            this.retrievedValues = value;
        }

    }

}
