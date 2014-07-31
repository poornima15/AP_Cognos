
package com.jda.ap.bi.bind.mdactions;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *                   &lt;element name="passport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="selectedModelItems" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}node"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}gatewayURI"/>
 *                   &lt;element name="outputResults" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                   &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
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
@XmlRootElement(name = "ShowImpact", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class ShowImpact
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected ShowImpact.InputParams inputParams;
    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
    protected ShowImpact.OutputParams outputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link ShowImpact.InputParams }
     *     
     */
    public ShowImpact.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowImpact.InputParams }
     *     
     */
    public void setInputParams(ShowImpact.InputParams value) {
        this.inputParams = value;
    }

    /**
     * Gets the value of the outputParams property.
     * 
     * @return
     *     possible object is
     *     {@link ShowImpact.OutputParams }
     *     
     */
    public ShowImpact.OutputParams getOutputParams() {
        return outputParams;
    }

    /**
     * Sets the value of the outputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowImpact.OutputParams }
     *     
     */
    public void setOutputParams(ShowImpact.OutputParams value) {
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
     *         &lt;element name="passport" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="selectedModelItems" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}node"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}gatewayURI"/>
     *         &lt;element name="outputResults" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "passport",
        "selectedModelItems",
        "gatewayURI",
        "outputResults"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String passport;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String selectedModelItems;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String gatewayURI;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String outputResults;

        /**
         * Gets the value of the passport property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassport() {
            return passport;
        }

        /**
         * Sets the value of the passport property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassport(String value) {
            this.passport = value;
        }

        /**
         * Gets the value of the selectedModelItems property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectedModelItems() {
            return selectedModelItems;
        }

        /**
         * Sets the value of the selectedModelItems property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectedModelItems(String value) {
            this.selectedModelItems = value;
        }

        /**
         * Gets the value of the gatewayURI property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGatewayURI() {
            return gatewayURI;
        }

        /**
         * Sets the value of the gatewayURI property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGatewayURI(String value) {
            this.gatewayURI = value;
        }

        /**
         * Gets the value of the outputResults property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOutputResults() {
            return outputResults;
        }

        /**
         * Sets the value of the outputResults property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOutputResults(String value) {
            this.outputResults = value;
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
     *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
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
        "returnCode"
    })
    public static class OutputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger returnCode;

        /**
         * Gets the value of the returnCode property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getReturnCode() {
            return returnCode;
        }

        /**
         * Sets the value of the returnCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setReturnCode(BigInteger value) {
            this.returnCode = value;
        }

    }

}
