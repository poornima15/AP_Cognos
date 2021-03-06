//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.18 at 10:35:14 AM MDT 
//


package com.cognos.developer.schemas.bmt._60._7;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * Objects that are visible in IBM Cognos 10. Properties are typically localizable NOTE: if a property is localizable, there must be exactly one instance of it for each locale supported in this model (see project/locales).
 * 
 * <p>Java class for reportObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reportObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.developer.cognos.com/schemas/bmt/60/7}nameType" maxOccurs="unbounded"/>
 *         &lt;element name="description" type="{http://www.developer.cognos.com/schemas/bmt/60/7}nameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.developer.cognos.com/schemas/bmt/60/7}changeManagement"/>
 *         &lt;element name="screenTip" type="{http://www.developer.cognos.com/schemas/bmt/60/7}nameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/bmt/60/7}property" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reportObjectType", propOrder = {
    "name",
    "description",
    "guid",
    "lastChanged",
    "lastChangedBy",
    "comment",
    "screenTip",
    "property"
})
@XmlSeeAlso({
    PackageViewType.class,
    com.cognos.developer.schemas.bmt._60._7.FunctionType.class,
    ShortcutType.class,
    com.cognos.developer.schemas.bmt._60._7.FilterType.class,
    com.cognos.developer.schemas.bmt._60._7.CalculationType.class,
    HierarchyFolder.class,
    com.cognos.developer.schemas.bmt._60._7.QueryItemFolderType.class,
    ObjectType.class,
    com.cognos.developer.schemas.bmt._60._7.QuerySubjectType.class,
    SectionType.class,
    MeasureFolder.class,
    QueryItemType.class
})
public class ReportObjectType {

    @XmlElement(required = true)
    protected List<NameType> name;
    protected List<NameType> description;
    protected Object guid;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastChanged;
    protected String lastChangedBy;
    protected String comment;
    protected List<NameType> screenTip;
    protected List<Property> property;

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getName() {
        if (name == null) {
            name = new ArrayList<NameType>();
        }
        return this.name;
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
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getDescription() {
        if (description == null) {
            description = new ArrayList<NameType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setGuid(Object value) {
        this.guid = value;
    }

    /**
     * Gets the value of the lastChanged property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getLastChanged() {
        return lastChanged;
    }

    /**
     * Sets the value of the lastChanged property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public void setLastChanged(XMLGregorianCalendar value) {
        this.lastChanged = value;
    }

    /**
     * Gets the value of the lastChangedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastChangedBy() {
        return lastChangedBy;
    }

    /**
     * Sets the value of the lastChangedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastChangedBy(String value) {
        this.lastChangedBy = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the screenTip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the screenTip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScreenTip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getScreenTip() {
        if (screenTip == null) {
            screenTip = new ArrayList<NameType>();
        }
        return this.screenTip;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Property }
     * 
     * 
     */
    public List<Property> getProperty() {
        if (property == null) {
            property = new ArrayList<Property>();
        }
        return this.property;
    }

}
