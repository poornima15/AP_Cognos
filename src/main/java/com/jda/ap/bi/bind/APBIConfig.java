
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
 *         &lt;element ref="{}Datasource"/>
 *         &lt;element ref="{}BI"/>
 *         &lt;element ref="{}Views"/>
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
    "datasource",
    "bi",
    "views"
})
@XmlRootElement(name = "APBIConfig")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
public class APBIConfig {

    @XmlElement(name = "Datasource", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
    protected Datasource datasource;
    @XmlElement(name = "BI", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
    protected BI bi;
    @XmlElement(name = "Views", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
    protected Views views;

    /**
     * Gets the value of the datasource property.
     * 
     * @return
     *     possible object is
     *     {@link Datasource }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
    public Datasource getDatasource() {
        return datasource;
    }

    /**
     * Sets the value of the datasource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Datasource }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
    public void setDatasource(Datasource value) {
        this.datasource = value;
    }

    /**
     * Gets the value of the bi property.
     * 
     * @return
     *     possible object is
     *     {@link BI }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
    public BI getBI() {
        return bi;
    }

    /**
     * Sets the value of the bi property.
     * 
     * @param value
     *     allowed object is
     *     {@link BI }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
    public void setBI(BI value) {
        this.bi = value;
    }

    /**
     * Gets the value of the views property.
     * 
     * @return
     *     possible object is
     *     {@link Views }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
    public Views getViews() {
        return views;
    }

    /**
     * Sets the value of the views property.
     * 
     * @param value
     *     allowed object is
     *     {@link Views }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
    public void setViews(Views value) {
        this.views = value;
    }

}
