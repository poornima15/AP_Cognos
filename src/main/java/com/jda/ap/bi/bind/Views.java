
package com.jda.ap.bi.bind;

import javax.annotation.Generated;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}AttributeViews"/>
 *         &lt;element ref="{}HierarchyViews"/>
 *         &lt;element ref="{}PlanViews"/>
 *         &lt;element ref="{}LookupViews"/>
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
    "attributeViews",
    "hierarchyViews",
    "planViews",
    "lookupViews"
})
@XmlRootElement(name = "Views")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
public class Views {

    @XmlElement(name = "AttributeViews", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    protected AttributeViews attributeViews;
    @XmlElement(name = "HierarchyViews", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    protected HierarchyViews hierarchyViews;
    @XmlElement(name = "PlanViews", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    protected PlanViews planViews;
    @XmlElement(name = "LookupViews", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    protected LookupViews lookupViews;

    /**
     * Gets the value of the attributeViews property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeViews }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public AttributeViews getAttributeViews() {
        return attributeViews;
    }

    /**
     * Sets the value of the attributeViews property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeViews }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public void setAttributeViews(AttributeViews value) {
        this.attributeViews = value;
    }

    /**
     * Gets the value of the hierarchyViews property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchyViews }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public HierarchyViews getHierarchyViews() {
        return hierarchyViews;
    }

    /**
     * Sets the value of the hierarchyViews property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchyViews }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public void setHierarchyViews(HierarchyViews value) {
        this.hierarchyViews = value;
    }

    /**
     * Gets the value of the planViews property.
     * 
     * @return
     *     possible object is
     *     {@link PlanViews }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public PlanViews getPlanViews() {
        return planViews;
    }

    /**
     * Sets the value of the planViews property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanViews }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public void setPlanViews(PlanViews value) {
        this.planViews = value;
    }

    /**
     * Gets the value of the lookupViews property.
     * 
     * @return
     *     possible object is
     *     {@link LookupViews }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public LookupViews getLookupViews() {
        return lookupViews;
    }

    /**
     * Sets the value of the lookupViews property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupViews }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public void setLookupViews(LookupViews value) {
        this.lookupViews = value;
    }

}
