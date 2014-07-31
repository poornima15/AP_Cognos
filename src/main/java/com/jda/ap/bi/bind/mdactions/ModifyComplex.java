
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
 *                   &lt;element name="complexProperty" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}propertyHandle"/>
 *                   &lt;choice>
 *                     &lt;element name="newComplexValueString" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}complexPropertyValue"/>
 *                     &lt;element name="newComplexValueSpec" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}node"/>
 *                   &lt;/choice>
 *                   &lt;element name="forceModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlRootElement(name = "ModifyComplex", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class ModifyComplex
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected ModifyComplex.InputParams inputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyComplex.InputParams }
     *     
     */
    public ModifyComplex.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyComplex.InputParams }
     *     
     */
    public void setInputParams(ModifyComplex.InputParams value) {
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
     *         &lt;element name="complexProperty" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}propertyHandle"/>
     *         &lt;choice>
     *           &lt;element name="newComplexValueString" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}complexPropertyValue"/>
     *           &lt;element name="newComplexValueSpec" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}node"/>
     *         &lt;/choice>
     *         &lt;element name="forceModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "complexProperty",
        "newComplexValueString",
        "newComplexValueSpec",
        "forceModify"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String complexProperty;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected ComplexPropertyValue newComplexValueString;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String newComplexValueSpec;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", defaultValue = "false")
        protected Boolean forceModify;

        /**
         * Gets the value of the complexProperty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComplexProperty() {
            return complexProperty;
        }

        /**
         * Sets the value of the complexProperty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComplexProperty(String value) {
            this.complexProperty = value;
        }

        /**
         * Gets the value of the newComplexValueString property.
         * 
         * @return
         *     possible object is
         *     {@link ComplexPropertyValue }
         *     
         */
        public ComplexPropertyValue getNewComplexValueString() {
            return newComplexValueString;
        }

        /**
         * Sets the value of the newComplexValueString property.
         * 
         * @param value
         *     allowed object is
         *     {@link ComplexPropertyValue }
         *     
         */
        public void setNewComplexValueString(ComplexPropertyValue value) {
            this.newComplexValueString = value;
        }

        /**
         * Gets the value of the newComplexValueSpec property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewComplexValueSpec() {
            return newComplexValueSpec;
        }

        /**
         * Sets the value of the newComplexValueSpec property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewComplexValueSpec(String value) {
            this.newComplexValueSpec = value;
        }

        /**
         * Gets the value of the forceModify property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isForceModify() {
            return forceModify;
        }

        /**
         * Sets the value of the forceModify property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setForceModify(Boolean value) {
            this.forceModify = value;
        }

    }

}
