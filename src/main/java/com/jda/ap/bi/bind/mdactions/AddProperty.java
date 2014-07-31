
package com.jda.ap.bi.bind.mdactions;

import java.util.ArrayList;
import java.util.List;
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
 *                     &lt;element name="parentObject" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle"/>
 *                     &lt;element name="parentProperty" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}propertyHandle"/>
 *                   &lt;/choice>
 *                   &lt;element name="propertyPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;choice>
 *                     &lt;sequence>
 *                       &lt;element name="propertyValueTypeSimple" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}propertyValueTypeIdentifier"/>
 *                       &lt;element name="addPropertyValueSimple" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}simplePropertyValue"/>
 *                     &lt;/sequence>
 *                     &lt;sequence>
 *                       &lt;element name="propertyValueTypeComplex" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}propertyValueTypeIdentifier"/>
 *                       &lt;element name="addPropertyValueComplex" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}complexPropertyValue"/>
 *                     &lt;/sequence>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="outputParams" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="createdProperty" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}propertyHandle"/>
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
@XmlRootElement(name = "AddProperty", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class AddProperty
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected AddProperty.InputParams inputParams;
    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
    protected AddProperty.OutputParams outputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link AddProperty.InputParams }
     *     
     */
    public AddProperty.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddProperty.InputParams }
     *     
     */
    public void setInputParams(AddProperty.InputParams value) {
        this.inputParams = value;
    }

    /**
     * Gets the value of the outputParams property.
     * 
     * @return
     *     possible object is
     *     {@link AddProperty.OutputParams }
     *     
     */
    public AddProperty.OutputParams getOutputParams() {
        return outputParams;
    }

    /**
     * Sets the value of the outputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddProperty.OutputParams }
     *     
     */
    public void setOutputParams(AddProperty.OutputParams value) {
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
     *           &lt;element name="parentObject" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle"/>
     *           &lt;element name="parentProperty" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}propertyHandle"/>
     *         &lt;/choice>
     *         &lt;element name="propertyPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;choice>
     *           &lt;sequence>
     *             &lt;element name="propertyValueTypeSimple" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}propertyValueTypeIdentifier"/>
     *             &lt;element name="addPropertyValueSimple" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}simplePropertyValue"/>
     *           &lt;/sequence>
     *           &lt;sequence>
     *             &lt;element name="propertyValueTypeComplex" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}propertyValueTypeIdentifier"/>
     *             &lt;element name="addPropertyValueComplex" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}complexPropertyValue"/>
     *           &lt;/sequence>
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
        "parentObject",
        "parentProperty",
        "propertyPath",
        "propertyValueTypeSimple",
        "addPropertyValueSimple",
        "propertyValueTypeComplex",
        "addPropertyValueComplex"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String parentObject;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String parentProperty;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String propertyPath;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String propertyValueTypeSimple;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected SimplePropertyValue addPropertyValueSimple;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String propertyValueTypeComplex;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected ComplexPropertyValue addPropertyValueComplex;

        /**
         * Gets the value of the parentObject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParentObject() {
            return parentObject;
        }

        /**
         * Sets the value of the parentObject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParentObject(String value) {
            this.parentObject = value;
        }

        /**
         * Gets the value of the parentProperty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParentProperty() {
            return parentProperty;
        }

        /**
         * Sets the value of the parentProperty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParentProperty(String value) {
            this.parentProperty = value;
        }

        /**
         * Gets the value of the propertyPath property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPropertyPath() {
            return propertyPath;
        }

        /**
         * Sets the value of the propertyPath property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPropertyPath(String value) {
            this.propertyPath = value;
        }

        /**
         * Gets the value of the propertyValueTypeSimple property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPropertyValueTypeSimple() {
            return propertyValueTypeSimple;
        }

        /**
         * Sets the value of the propertyValueTypeSimple property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPropertyValueTypeSimple(String value) {
            this.propertyValueTypeSimple = value;
        }

        /**
         * Gets the value of the addPropertyValueSimple property.
         * 
         * @return
         *     possible object is
         *     {@link SimplePropertyValue }
         *     
         */
        public SimplePropertyValue getAddPropertyValueSimple() {
            return addPropertyValueSimple;
        }

        /**
         * Sets the value of the addPropertyValueSimple property.
         * 
         * @param value
         *     allowed object is
         *     {@link SimplePropertyValue }
         *     
         */
        public void setAddPropertyValueSimple(SimplePropertyValue value) {
            this.addPropertyValueSimple = value;
        }

        /**
         * Gets the value of the propertyValueTypeComplex property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPropertyValueTypeComplex() {
            return propertyValueTypeComplex;
        }

        /**
         * Sets the value of the propertyValueTypeComplex property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPropertyValueTypeComplex(String value) {
            this.propertyValueTypeComplex = value;
        }

        /**
         * Gets the value of the addPropertyValueComplex property.
         * 
         * @return
         *     possible object is
         *     {@link ComplexPropertyValue }
         *     
         */
        public ComplexPropertyValue getAddPropertyValueComplex() {
            return addPropertyValueComplex;
        }

        /**
         * Sets the value of the addPropertyValueComplex property.
         * 
         * @param value
         *     allowed object is
         *     {@link ComplexPropertyValue }
         *     
         */
        public void setAddPropertyValueComplex(ComplexPropertyValue value) {
            this.addPropertyValueComplex = value;
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
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="createdProperty" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}propertyHandle"/>
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
        "createdProperty"
    })
    public static class OutputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected List<String> createdProperty;

        /**
         * Gets the value of the createdProperty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the createdProperty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCreatedProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCreatedProperty() {
            if (createdProperty == null) {
                createdProperty = new ArrayList<String>();
            }
            return this.createdProperty;
        }

    }

}
