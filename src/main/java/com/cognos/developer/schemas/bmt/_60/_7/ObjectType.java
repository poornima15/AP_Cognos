//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.18 at 10:35:14 AM MDT 
//


package com.cognos.developer.schemas.bmt._60._7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for objectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="objectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.developer.cognos.com/schemas/bmt/60/7}reportObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/bmt/60/7}object" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objectType", propOrder = {
    "object"
})
@XmlSeeAlso({
    Hierarchy.class
})
public class ObjectType
    extends com.cognos.developer.schemas.bmt._60._7.ReportObjectType
{

    protected List<com.cognos.developer.schemas.bmt._60._7.ObjectType> object;

    /**
     * Gets the value of the object property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the object property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.cognos.developer.schemas.bmt._60._7.ObjectType }
     * 
     * 
     */
    public List<com.cognos.developer.schemas.bmt._60._7.ObjectType> getObject() {
        if (object == null) {
            object = new ArrayList<com.cognos.developer.schemas.bmt._60._7.ObjectType>();
        }
        return this.object;
    }

}