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
 *       &lt;sequence>
 *         &lt;element name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.developer.cognos.com/schemas/bmt/60/7}measure"/>
 *           &lt;element ref="{http://www.developer.cognos.com/schemas/bmt/60/7}measureFolder"/>
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
@XmlType(name = "", propOrder = {
    "hidden",
    "measureOrMeasureFolder"
})
@XmlRootElement(name = "measureFolder")
public class MeasureFolder
    extends com.cognos.developer.schemas.bmt._60._7.ReportObjectType
{

    protected Boolean hidden;
    @XmlElements({
        @XmlElement(name = "measure", type = Measure.class),
        @XmlElement(name = "measureFolder", type = com.cognos.developer.schemas.bmt._60._7.MeasureFolder.class)
    })
    protected List<com.cognos.developer.schemas.bmt._60._7.ReportObjectType> measureOrMeasureFolder;

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
     * Gets the value of the measureOrMeasureFolder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measureOrMeasureFolder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasureOrMeasureFolder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Measure }
     * {@link com.cognos.developer.schemas.bmt._60._7.MeasureFolder }
     * 
     * 
     */
    public List<com.cognos.developer.schemas.bmt._60._7.ReportObjectType> getMeasureOrMeasureFolder() {
        if (measureOrMeasureFolder == null) {
            measureOrMeasureFolder = new ArrayList<com.cognos.developer.schemas.bmt._60._7.ReportObjectType>();
        }
        return this.measureOrMeasureFolder;
    }

}
