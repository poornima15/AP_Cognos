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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.developer.cognos.com/schemas/bmt/60/7}reportObjectType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/bmt/60/7}hierarchy"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/bmt/60/7}hierarchyFolder"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hierarchyOrHierarchyFolder"
})
@XmlRootElement(name = "hierarchyFolder")
public class HierarchyFolder
    extends com.cognos.developer.schemas.bmt._60._7.ReportObjectType
{

    @XmlElements({
        @XmlElement(name = "hierarchy", type = com.cognos.developer.schemas.bmt._60._7.Hierarchy.class),
        @XmlElement(name = "hierarchyFolder", type = com.cognos.developer.schemas.bmt._60._7.HierarchyFolder.class)
    })
    protected List<com.cognos.developer.schemas.bmt._60._7.ReportObjectType> hierarchyOrHierarchyFolder;

    /**
     * Gets the value of the hierarchyOrHierarchyFolder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hierarchyOrHierarchyFolder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHierarchyOrHierarchyFolder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.cognos.developer.schemas.bmt._60._7.Hierarchy }
     * {@link com.cognos.developer.schemas.bmt._60._7.HierarchyFolder }
     * 
     * 
     */
    public List<com.cognos.developer.schemas.bmt._60._7.ReportObjectType> getHierarchyOrHierarchyFolder() {
        if (hierarchyOrHierarchyFolder == null) {
            hierarchyOrHierarchyFolder = new ArrayList<com.cognos.developer.schemas.bmt._60._7.ReportObjectType>();
        }
        return this.hierarchyOrHierarchyFolder;
    }

}
