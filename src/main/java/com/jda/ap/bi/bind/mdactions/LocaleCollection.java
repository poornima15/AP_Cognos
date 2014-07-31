
package com.jda.ap.bi.bind.mdactions;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;para xmlns:fmsdk="http://www.developer.cognos.com/schemas/fmsdk/1/0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Maps to a parameter of type stringCollection in the action logs.&lt;/para&gt;
 * </pre>
 * 
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;para xmlns:fmsdk="http://www.developer.cognos.com/schemas/fmsdk/1/0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Encoded in the same way as stringCollection, but the value for every item must be a valid XML language code.&lt;/para&gt;
 * </pre>
 * 
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;para xmlns:fmsdk="http://www.developer.cognos.com/schemas/fmsdk/1/0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;For example, a parameter containing the languages English, German and French (Canada) would be encoded as: &amp;lt;stringCollection&amp;gt;&amp;lt;item&amp;gt;en&amp;lt;/item&amp;gt;&amp;lt;item&amp;gt;de&amp;lt;/item&amp;gt;&amp;lt;item&amp;gt;fr-ca&amp;lt;/item&amp;gt;&amp;lt;/stringCollection&amp;gt;&lt;/para&gt;
 * </pre>
 * 
 * 
 * 
 * <p>Java class for localeCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="localeCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locale" type="{http://www.w3.org/2001/XMLSchema}language" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "localeCollection", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", propOrder = {
    "locale"
})
public class LocaleCollection {

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected List<String> locale;

    /**
     * Gets the value of the locale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLocale() {
        if (locale == null) {
            locale = new ArrayList<String>();
        }
        return this.locale;
    }

}
