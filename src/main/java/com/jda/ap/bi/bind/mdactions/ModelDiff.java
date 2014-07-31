
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
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}regularPackage"/>
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
@XmlRootElement(name = "ModelDiff", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class ModelDiff
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected ModelDiff.InputParams inputParams;
    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
    protected ModelDiff.OutputParams outputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link ModelDiff.InputParams }
     *     
     */
    public ModelDiff.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelDiff.InputParams }
     *     
     */
    public void setInputParams(ModelDiff.InputParams value) {
        this.inputParams = value;
    }

    /**
     * Gets the value of the outputParams property.
     * 
     * @return
     *     possible object is
     *     {@link ModelDiff.OutputParams }
     *     
     */
    public ModelDiff.OutputParams getOutputParams() {
        return outputParams;
    }

    /**
     * Sets the value of the outputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelDiff.OutputParams }
     *     
     */
    public void setOutputParams(ModelDiff.OutputParams value) {
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
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}regularPackage"/>
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
        "regularPackage",
        "outputResults"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String passport;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String regularPackage;
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
         * Gets the value of the regularPackage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegularPackage() {
            return regularPackage;
        }

        /**
         * Sets the value of the regularPackage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegularPackage(String value) {
            this.regularPackage = value;
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
