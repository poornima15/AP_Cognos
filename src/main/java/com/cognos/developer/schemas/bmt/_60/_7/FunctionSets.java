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
 *         &lt;element name="functionSet" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="functionSetID" type="{http://www.developer.cognos.com/schemas/bmt/60/7}functionSetIDType"/>
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
    "functionSet"
})
@XmlRootElement(name = "functionSets")
public class FunctionSets {

    protected List<com.cognos.developer.schemas.bmt._60._7.FunctionSets.FunctionSet> functionSet;

    /**
     * Gets the value of the functionSet property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the functionSet property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunctionSet().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.cognos.developer.schemas.bmt._60._7.FunctionSets.FunctionSet }
     *
     *
     */
    public List<com.cognos.developer.schemas.bmt._60._7.FunctionSets.FunctionSet> getFunctionSet() {
        if (functionSet == null) {
            functionSet = new ArrayList<com.cognos.developer.schemas.bmt._60._7.FunctionSets.FunctionSet>();
        }
        return this.functionSet;
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
     *         &lt;element name="functionSetID" type="{http://www.developer.cognos.com/schemas/bmt/60/7}functionSetIDType"/>
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
        "functionSetID"
    })
    public static class FunctionSet {

        @XmlElement(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String functionSetID;

        /**
         * Gets the value of the functionSetID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFunctionSetID() {
            return functionSetID;
        }

        /**
         * Sets the value of the functionSetID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFunctionSetID(String value) {
            this.functionSetID = value;
        }

    }

}
