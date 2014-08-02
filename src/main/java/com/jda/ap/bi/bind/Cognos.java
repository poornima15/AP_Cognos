
package com.jda.ap.bi.bind;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{}username"/>
 *         &lt;element ref="{}password"/>
 *         &lt;element ref="{}namespace"/>
 *         &lt;element ref="{}ServiceURL"/>
 *         &lt;element ref="{}modelFolder"/>
 *         &lt;element ref="{}modelFile"/>
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
    "username",
    "password",
    "namespace",
    "serviceURL",
    "modelFolder",
    "modelFile"
})
@XmlRootElement(name = "Cognos")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
public class Cognos {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
    protected String username;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
    protected String password;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
    protected String namespace;
    @XmlElement(name = "ServiceURL", required = true)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
    protected String serviceURL;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
    protected String modelFolder;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
    protected String modelFile;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
    public String getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
    public void setNamespace(String value) {
        this.namespace = value;
    }

    /**
     * Gets the value of the serviceURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
    public String getServiceURL() {
        return serviceURL;
    }

    /**
     * Sets the value of the serviceURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
    public void setServiceURL(String value) {
        this.serviceURL = value;
    }

    /**
     * Gets the value of the modelFolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
    public String getModelFolder() {
        return modelFolder;
    }

    /**
     * Sets the value of the modelFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
    public void setModelFolder(String value) {
        this.modelFolder = value;
    }

    /**
     * Gets the value of the modelFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
    public String getModelFile() {
        return modelFile;
    }

    /**
     * Sets the value of the modelFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2014-07-31T10:48:19-06:00", comments = "JAXB RI v2.2.4-2")
    public void setModelFile(String value) {
        this.modelFile = value;
    }

}
