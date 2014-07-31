//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.18 at 10:35:14 AM MDT 
//


package com.cognos.developer.schemas.bmt._60._7;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for queryItemFolderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryItemFolderType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.developer.cognos.com/schemas/bmt/60/7}reportObjectType">
 *       &lt;sequence>
 *         &lt;element name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.developer.cognos.com/schemas/bmt/60/7}queryItem"/>
 *           &lt;element ref="{http://www.developer.cognos.com/schemas/bmt/60/7}queryItemFolder"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryItemFolderType", propOrder = {
    "hidden",
    "queryItemOrQueryItemFolder"
})
@XmlSeeAlso({
    com.cognos.developer.schemas.bmt._60._7.Level.class
})
public class QueryItemFolderType
    extends ReportObjectType
{

    @XmlElement(defaultValue = "false")
    protected Boolean hidden;
    @XmlElements({
        @XmlElement(name = "queryItem", type = QueryItem.class),
        @XmlElement(name = "queryItemFolder", type = com.cognos.developer.schemas.bmt._60._7.QueryItemFolderType.class)
    })
    protected List<ReportObjectType> queryItemOrQueryItemFolder;

    /**
     * Gets the value of the hidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHidden(Boolean value) {
        this.hidden = value;
    }

    /**
     * Gets the value of the queryItemOrQueryItemFolder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryItemOrQueryItemFolder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryItemOrQueryItemFolder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryItem }
     * {@link com.cognos.developer.schemas.bmt._60._7.QueryItemFolderType }
     * 
     * 
     */
    public List<ReportObjectType> getQueryItemOrQueryItemFolder() {
        if (queryItemOrQueryItemFolder == null) {
            queryItemOrQueryItemFolder = new ArrayList<ReportObjectType>();
        }
        return this.queryItemOrQueryItemFolder;
    }

}
