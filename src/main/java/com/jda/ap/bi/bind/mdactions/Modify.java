
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
 *                 &lt;group ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}inputParamsModify"/>
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
@XmlRootElement(name = "Modify", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class Modify
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected Modify.InputParams inputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link Modify.InputParams }
     *     
     */
    public Modify.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modify.InputParams }
     *     
     */
    public void setInputParams(Modify.InputParams value) {
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
     *       &lt;group ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}inputParamsModify"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "simpleProperty",
        "newSimpleValue"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String simpleProperty;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected SimplePropertyValue newSimpleValue;

        /**
         * Gets the value of the simpleProperty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSimpleProperty() {
            return simpleProperty;
        }

        /**
         * Sets the value of the simpleProperty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSimpleProperty(String value) {
            this.simpleProperty = value;
        }

        /**
         * Gets the value of the newSimpleValue property.
         * 
         * @return
         *     possible object is
         *     {@link SimplePropertyValue }
         *     
         */
        public SimplePropertyValue getNewSimpleValue() {
            return newSimpleValue;
        }

        /**
         * Sets the value of the newSimpleValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link SimplePropertyValue }
         *     
         */
        public void setNewSimpleValue(SimplePropertyValue value) {
            this.newSimpleValue = value;
        }

    }

}
