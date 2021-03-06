//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.18 at 10:35:14 AM MDT 
//


package com.cognos.developer.schemas.bmt._60._7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for relationshipShortcutType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="relationshipShortcutType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.developer.cognos.com/schemas/bmt/60/7}modelObjectType">
 *       &lt;sequence>
 *         &lt;element name="left">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="refobj" type="{http://www.developer.cognos.com/schemas/bmt/60/7}refType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="right">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="refobj" type="{http://www.developer.cognos.com/schemas/bmt/60/7}refType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="relationshipRef" type="{http://www.developer.cognos.com/schemas/bmt/60/7}refType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relationshipShortcutType", propOrder = {
    "left",
    "right",
    "relationshipRef"
})
public class RelationshipShortcutType
    extends com.cognos.developer.schemas.bmt._60._7.ModelObjectType
{

    @XmlElement(required = true)
    protected com.cognos.developer.schemas.bmt._60._7.RelationshipShortcutType.Left left;
    @XmlElement(required = true)
    protected com.cognos.developer.schemas.bmt._60._7.RelationshipShortcutType.Right right;
    @XmlElement(required = true)
    protected String relationshipRef;

    /**
     * Gets the value of the left property.
     *
     * @return
     *     possible object is
     *     {@link com.cognos.developer.schemas.bmt._60._7.RelationshipShortcutType.Left }
     *
     */
    public com.cognos.developer.schemas.bmt._60._7.RelationshipShortcutType.Left getLeft() {
        return left;
    }

    /**
     * Sets the value of the left property.
     *
     * @param value
     *     allowed object is
     *     {@link com.cognos.developer.schemas.bmt._60._7.RelationshipShortcutType.Left }
     *
     */
    public void setLeft(com.cognos.developer.schemas.bmt._60._7.RelationshipShortcutType.Left value) {
        this.left = value;
    }

    /**
     * Gets the value of the right property.
     *
     * @return
     *     possible object is
     *     {@link com.cognos.developer.schemas.bmt._60._7.RelationshipShortcutType.Right }
     *
     */
    public com.cognos.developer.schemas.bmt._60._7.RelationshipShortcutType.Right getRight() {
        return right;
    }

    /**
     * Sets the value of the right property.
     *
     * @param value
     *     allowed object is
     *     {@link com.cognos.developer.schemas.bmt._60._7.RelationshipShortcutType.Right }
     *
     */
    public void setRight(com.cognos.developer.schemas.bmt._60._7.RelationshipShortcutType.Right value) {
        this.right = value;
    }

    /**
     * Gets the value of the relationshipRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipRef() {
        return relationshipRef;
    }

    /**
     * Sets the value of the relationshipRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipRef(String value) {
        this.relationshipRef = value;
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
     *         &lt;element name="refobj" type="{http://www.developer.cognos.com/schemas/bmt/60/7}refType"/>
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
        "refobj"
    })
    public static class Left {

        @XmlElement(required = true)
        protected String refobj;

        /**
         * Gets the value of the refobj property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefobj() {
            return refobj;
        }

        /**
         * Sets the value of the refobj property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefobj(String value) {
            this.refobj = value;
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
     *         &lt;element name="refobj" type="{http://www.developer.cognos.com/schemas/bmt/60/7}refType"/>
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
        "refobj"
    })
    public static class Right {

        @XmlElement(required = true)
        protected String refobj;

        /**
         * Gets the value of the refobj property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefobj() {
            return refobj;
        }

        /**
         * Sets the value of the refobj property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefobj(String value) {
            this.refobj = value;
        }

    }

}
