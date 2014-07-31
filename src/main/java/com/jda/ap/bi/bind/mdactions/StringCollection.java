
package com.jda.ap.bi.bind.mdactions;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;para xmlns:fmsdk="http://www.developer.cognos.com/schemas/fmsdk/1/0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Maps to a parameter of type stringCollection in the action logs.&lt;/para&gt;
 * </pre>
 * 
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;para xmlns:fmsdk="http://www.developer.cognos.com/schemas/fmsdk/1/0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Represents a collection of strings that are encoded as an XML fragment with a root element called stringCollection and each string in its own item element. However, all reserved XML characters are escaped in the encoded value.&lt;/para&gt;
 * </pre>
 * 
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;para xmlns:fmsdk="http://www.developer.cognos.com/schemas/fmsdk/1/0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;For example, a parameter of this type with strings "COUNTRY", "SALES", and "PRODUCTS" would be encoded as &amp;lt;stringCollection&amp;gt;&amp;lt;item&amp;gt;COUNTRY&amp;lt;/item&amp;gt;&amp;lt;item&amp;gt;SALES&amp;lt;/item&amp;gt;&amp;lt;item&amp;gt;PRODUCT&amp;lt;/item&amp;gt;&amp;lt;/stringCollection&amp;gt;&lt;/para&gt;
 * </pre>
 * 
 * 
 * 
 * <p>Java class for stringCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stringCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stringValue" maxOccurs="unbounded">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stringCollection", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", propOrder = {
    "stringValue"
})
public class StringCollection {

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected List<String> stringValue;

    /**
     * Gets the value of the stringValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stringValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStringValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStringValue() {
        if (stringValue == null) {
            stringValue = new ArrayList<String>();
        }
        return this.stringValue;
    }

}
