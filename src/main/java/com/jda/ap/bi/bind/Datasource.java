
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
 *         &lt;element ref="{}URL"/>
 *         &lt;element ref="{}username"/>
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
    "url",
    "username"
})
@XmlRootElement(name = "Datasource")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
public class Datasource {

    @XmlElement(name = "URL", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    protected String url;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    protected String username;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public void setUsername(String value) {
        this.username = value;
    }

}
