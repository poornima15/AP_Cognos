
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
 *                   &lt;choice>
 *                     &lt;element name="actionSpec" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}node"/>
 *                     &lt;element name="actionXML" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;/choice>
 *                   &lt;element name="explainLevel">
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
 *         &lt;element name="outputParams" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="explainMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlRootElement(name = "ExplainLogFile", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class ExplainLogFile
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected ExplainLogFile.InputParams inputParams;
    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
    protected ExplainLogFile.OutputParams outputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link ExplainLogFile.InputParams }
     *     
     */
    public ExplainLogFile.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExplainLogFile.InputParams }
     *     
     */
    public void setInputParams(ExplainLogFile.InputParams value) {
        this.inputParams = value;
    }

    /**
     * Gets the value of the outputParams property.
     * 
     * @return
     *     possible object is
     *     {@link ExplainLogFile.OutputParams }
     *     
     */
    public ExplainLogFile.OutputParams getOutputParams() {
        return outputParams;
    }

    /**
     * Sets the value of the outputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExplainLogFile.OutputParams }
     *     
     */
    public void setOutputParams(ExplainLogFile.OutputParams value) {
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
     *         &lt;choice>
     *           &lt;element name="actionSpec" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}node"/>
     *           &lt;element name="actionXML" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;/choice>
     *         &lt;element name="explainLevel">
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
        "actionSpec",
        "actionXML",
        "explainLevel"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String actionSpec;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String actionXML;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String explainLevel;

        /**
         * Gets the value of the actionSpec property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActionSpec() {
            return actionSpec;
        }

        /**
         * Sets the value of the actionSpec property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActionSpec(String value) {
            this.actionSpec = value;
        }

        /**
         * Gets the value of the actionXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActionXML() {
            return actionXML;
        }

        /**
         * Sets the value of the actionXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActionXML(String value) {
            this.actionXML = value;
        }

        /**
         * Gets the value of the explainLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExplainLevel() {
            return explainLevel;
        }

        /**
         * Sets the value of the explainLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExplainLevel(String value) {
            this.explainLevel = value;
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
     *         &lt;element name="explainMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "explainMessage"
    })
    public static class OutputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String explainMessage;

        /**
         * Gets the value of the explainMessage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExplainMessage() {
            return explainMessage;
        }

        /**
         * Sets the value of the explainMessage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExplainMessage(String value) {
            this.explainMessage = value;
        }

    }

}
