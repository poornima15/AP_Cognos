
package com.jda.ap.bi.bind.mdactions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;para xmlns:fmsdk="http://www.developer.cognos.com/schemas/fmsdk/1/0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Maps to a parameter of type i18nstring in the action logs.&lt;/para&gt;
 * </pre>
 * 
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;para xmlns:fmsdk="http://www.developer.cognos.com/schemas/fmsdk/1/0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Represents the value being set on a property being created or updated. If it is an XML fragment, all reserved XML characters must be escaped, according to W3C standards. For example, the less than character must be encoded as "&amp;lt;".&lt;/para&gt;
 * </pre>
 * 
 * 
 * 
 * <p>Java class for propertyValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertyValue">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertyValue", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", propOrder = {
    "value"
})
@XmlSeeAlso({
    ComplexPropertyValue.class,
    SimplePropertyValue.class
})
public abstract class PropertyValue {

    @XmlValue
    protected String value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
