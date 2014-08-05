
package com.jda.ap.bi.bind;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}View" maxOccurs="unbounded" minOccurs="0"/>
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
    "view"
})
@XmlRootElement(name = "HierarchyViews")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
public class HierarchyViews {

    @XmlElement(name = "View")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    protected List<View> view;

    /**
     * Gets the value of the view property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the view property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getView().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link View }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public List<View> getView() {
        if (view == null) {
            view = new ArrayList<View>();
        }
        return this.view;
    }

}
