
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
 *         &lt;element ref="{}port"/>
 *         &lt;element ref="{}debug"/>
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
    "port",
    "debug"
})
@XmlRootElement(name = "General")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
public class General {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    protected short port;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    protected String debug;

    /**
     * Gets the value of the port property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public short getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public void setPort(short value) {
        this.port = value;
    }

    /**
     * Gets the value of the debug property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public String getDebug() {
        return debug;
    }

    /**
     * Sets the value of the debug property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public void setDebug(String value) {
        this.debug = value;
    }

}
