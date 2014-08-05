
package com.jda.ap.bi.bind;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{}Name"/>
 *         &lt;element ref="{}Table"/>
 *         &lt;element ref="{}Alias"/>
 *       &lt;/sequence>
 *       &lt;attribute name="columns" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ignore" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "table",
    "alias"
})
@XmlRootElement(name = "View")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
public class View {

    @XmlElement(name = "Name", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    protected String name;
    @XmlElement(name = "Table", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    protected String table;
    @XmlElement(name = "Alias", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    protected String alias;
    @XmlAttribute(name = "columns")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    protected String columns;
    @XmlAttribute(name = "ignore")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    protected String ignore;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public String getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public void setTable(String value) {
        this.table = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public String getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public void setColumns(String value) {
        this.columns = value;
    }

    /**
     * Gets the value of the ignore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public String getIgnore() {
        return ignore;
    }

    /**
     * Sets the value of the ignore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-08-04T04:29:47-06:00", comments = "JAXB RI v2.2.4-2")
    public void setIgnore(String value) {
        this.ignore = value;
    }

}
