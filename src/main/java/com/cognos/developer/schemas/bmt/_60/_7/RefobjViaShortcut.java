//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.18 at 10:35:14 AM MDT 
//


package com.cognos.developer.schemas.bmt._60._7;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
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
 *         &lt;element name="refobj" type="{http://www.developer.cognos.com/schemas/bmt/60/7}refType"/>
 *         &lt;element name="refobj" type="{http://www.developer.cognos.com/schemas/bmt/60/7}refType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dataItemName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "refobjViaShortcut")
public class RefobjViaShortcut {

    @XmlElementRef(name = "refobj", namespace = "http://www.developer.cognos.com/schemas/bmt/60/7", type = JAXBElement.class, required = false)
    protected List<JAXBElement<String>> content;
    @XmlAttribute(name = "dataItemName")
    protected String dataItemName;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Refobj" is used by two different parts of a schema. See: 
     * line 3285 of file:/D:/github/AP_Cognos_Services/src/main/resources/BMTModelSpecification.xsd
     * line 3280 of file:/D:/github/AP_Cognos_Services/src/main/resources/BMTModelSpecification.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<String>>();
        }
        return this.content;
    }

    /**
     * Gets the value of the dataItemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataItemName() {
        return dataItemName;
    }

    /**
     * Sets the value of the dataItemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataItemName(String value) {
        this.dataItemName = value;
    }

}
