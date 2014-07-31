//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.18 at 10:35:14 AM MDT 
//


package com.cognos.developer.schemas.bmt._60._7;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="qosOverride" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="functionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="qosLevel" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         &lt;enumeration value="unavailable"/>
 *                         &lt;enumeration value="restricted"/>
 *                         &lt;enumeration value="limited"/>
 *                         &lt;enumeration value="ok"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="description" type="{http://www.developer.cognos.com/schemas/bmt/60/7}nameType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
    "qosOverride"
})
@XmlRootElement(name = "qosOverrides")
public class QosOverrides {

    protected List<com.cognos.developer.schemas.bmt._60._7.QosOverrides.QosOverride> qosOverride;

    /**
     * Gets the value of the qosOverride property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qosOverride property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQosOverride().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.cognos.developer.schemas.bmt._60._7.QosOverrides.QosOverride }
     *
     *
     */
    public List<com.cognos.developer.schemas.bmt._60._7.QosOverrides.QosOverride> getQosOverride() {
        if (qosOverride == null) {
            qosOverride = new ArrayList<com.cognos.developer.schemas.bmt._60._7.QosOverrides.QosOverride>();
        }
        return this.qosOverride;
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
     *         &lt;element name="functionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="qosLevel" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               &lt;enumeration value="unavailable"/>
     *               &lt;enumeration value="restricted"/>
     *               &lt;enumeration value="limited"/>
     *               &lt;enumeration value="ok"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="description" type="{http://www.developer.cognos.com/schemas/bmt/60/7}nameType" maxOccurs="unbounded" minOccurs="0"/>
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
        "functionId",
        "qosLevel",
        "description"
    })
    public static class QosOverride {

        @XmlElement(required = true)
        protected String functionId;
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String qosLevel;
        protected List<com.cognos.developer.schemas.bmt._60._7.NameType> description;

        /**
         * Gets the value of the functionId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFunctionId() {
            return functionId;
        }

        /**
         * Sets the value of the functionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFunctionId(String value) {
            this.functionId = value;
        }

        /**
         * Gets the value of the qosLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQosLevel() {
            return qosLevel;
        }

        /**
         * Sets the value of the qosLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQosLevel(String value) {
            this.qosLevel = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the description property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link com.cognos.developer.schemas.bmt._60._7.NameType }
         * 
         * 
         */
        public List<com.cognos.developer.schemas.bmt._60._7.NameType> getDescription() {
            if (description == null) {
                description = new ArrayList<com.cognos.developer.schemas.bmt._60._7.NameType>();
            }
            return this.description;
        }

    }

}