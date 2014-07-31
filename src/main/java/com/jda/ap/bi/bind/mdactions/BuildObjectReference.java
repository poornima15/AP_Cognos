
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
 *                   &lt;element name="parentObject" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle"/>
 *                   &lt;element name="childObjectHandle" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle"/>
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
 *                   &lt;element name="builtObjectReference" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectReference"/>
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
@XmlRootElement(name = "BuildObjectReference", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class BuildObjectReference
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected BuildObjectReference.InputParams inputParams;
    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
    protected BuildObjectReference.OutputParams outputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link BuildObjectReference.InputParams }
     *     
     */
    public BuildObjectReference.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildObjectReference.InputParams }
     *     
     */
    public void setInputParams(BuildObjectReference.InputParams value) {
        this.inputParams = value;
    }

    /**
     * Gets the value of the outputParams property.
     * 
     * @return
     *     possible object is
     *     {@link BuildObjectReference.OutputParams }
     *     
     */
    public BuildObjectReference.OutputParams getOutputParams() {
        return outputParams;
    }

    /**
     * Sets the value of the outputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildObjectReference.OutputParams }
     *     
     */
    public void setOutputParams(BuildObjectReference.OutputParams value) {
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
     *         &lt;element name="parentObject" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle"/>
     *         &lt;element name="childObjectHandle" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle"/>
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
        "childObjectHandle"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String parentObject;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String childObjectHandle;

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
         * Gets the value of the childObjectHandle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChildObjectHandle() {
            return childObjectHandle;
        }

        /**
         * Sets the value of the childObjectHandle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChildObjectHandle(String value) {
            this.childObjectHandle = value;
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
     *         &lt;element name="builtObjectReference" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectReference"/>
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
        "builtObjectReference"
    })
    public static class OutputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String builtObjectReference;

        /**
         * Gets the value of the builtObjectReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBuiltObjectReference() {
            return builtObjectReference;
        }

        /**
         * Sets the value of the builtObjectReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBuiltObjectReference(String value) {
            this.builtObjectReference = value;
        }

    }

}
