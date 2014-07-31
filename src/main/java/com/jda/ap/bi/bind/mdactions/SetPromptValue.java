
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
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}promptName"/>
 *                   &lt;choice>
 *                     &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}promptValue"/>
 *                     &lt;element name="promptValueDom" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}node"/>
 *                   &lt;/choice>
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
@XmlRootElement(name = "SetPromptValue", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class SetPromptValue
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected SetPromptValue.InputParams inputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link SetPromptValue.InputParams }
     *     
     */
    public SetPromptValue.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetPromptValue.InputParams }
     *     
     */
    public void setInputParams(SetPromptValue.InputParams value) {
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
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}promptName"/>
     *         &lt;choice>
     *           &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}promptValue"/>
     *           &lt;element name="promptValueDom" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}node"/>
     *         &lt;/choice>
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
        "promptName",
        "promptValue",
        "promptValueDom"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String promptName;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String promptValue;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String promptValueDom;

        /**
         * Gets the value of the promptName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPromptName() {
            return promptName;
        }

        /**
         * Sets the value of the promptName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPromptName(String value) {
            this.promptName = value;
        }

        /**
         * Gets the value of the promptValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPromptValue() {
            return promptValue;
        }

        /**
         * Sets the value of the promptValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPromptValue(String value) {
            this.promptValue = value;
        }

        /**
         * Gets the value of the promptValueDom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPromptValueDom() {
            return promptValueDom;
        }

        /**
         * Sets the value of the promptValueDom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPromptValueDom(String value) {
            this.promptValueDom = value;
        }

    }

}
