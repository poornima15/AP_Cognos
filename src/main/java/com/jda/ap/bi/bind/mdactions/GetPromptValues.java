
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
 *         &lt;element name="outputParams" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;sequence>
 *                     &lt;element name="promptNames" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}stringCollection"/>
 *                     &lt;element name="promptValues" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}stringCollection"/>
 *                   &lt;/sequence>
 *                   &lt;element name="parametersNode" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}node"/>
 *                 &lt;/choice>
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
    "outputParams"
})
@XmlRootElement(name = "GetPromptValues", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class GetPromptValues
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
    protected GetPromptValues.OutputParams outputParams;

    /**
     * Gets the value of the outputParams property.
     * 
     * @return
     *     possible object is
     *     {@link GetPromptValues.OutputParams }
     *     
     */
    public GetPromptValues.OutputParams getOutputParams() {
        return outputParams;
    }

    /**
     * Sets the value of the outputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPromptValues.OutputParams }
     *     
     */
    public void setOutputParams(GetPromptValues.OutputParams value) {
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
     *       &lt;choice>
     *         &lt;sequence>
     *           &lt;element name="promptNames" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}stringCollection"/>
     *           &lt;element name="promptValues" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}stringCollection"/>
     *         &lt;/sequence>
     *         &lt;element name="parametersNode" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}node"/>
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
        "promptNames",
        "promptValues",
        "parametersNode"
    })
    public static class OutputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected StringCollection promptNames;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected StringCollection promptValues;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String parametersNode;

        /**
         * Gets the value of the promptNames property.
         * 
         * @return
         *     possible object is
         *     {@link StringCollection }
         *     
         */
        public StringCollection getPromptNames() {
            return promptNames;
        }

        /**
         * Sets the value of the promptNames property.
         * 
         * @param value
         *     allowed object is
         *     {@link StringCollection }
         *     
         */
        public void setPromptNames(StringCollection value) {
            this.promptNames = value;
        }

        /**
         * Gets the value of the promptValues property.
         * 
         * @return
         *     possible object is
         *     {@link StringCollection }
         *     
         */
        public StringCollection getPromptValues() {
            return promptValues;
        }

        /**
         * Sets the value of the promptValues property.
         * 
         * @param value
         *     allowed object is
         *     {@link StringCollection }
         *     
         */
        public void setPromptValues(StringCollection value) {
            this.promptValues = value;
        }

        /**
         * Gets the value of the parametersNode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParametersNode() {
            return parametersNode;
        }

        /**
         * Sets the value of the parametersNode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParametersNode(String value) {
            this.parametersNode = value;
        }

    }

}
