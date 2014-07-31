
package com.jda.ap.bi.bind.mdactions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;para xmlns:fmsdk="http://www.developer.cognos.com/schemas/fmsdk/1/0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Maps to a string and represents a simple value being set on a property. The value is simple in that child properties will not be inferred from it, even if the value is an XML fragment and the property in question is complex, in that it can contain child properties.&lt;/para&gt;
 * </pre>
 * 
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;para xmlns:fmsdk="http://www.developer.cognos.com/schemas/fmsdk/1/0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;For example, the following value being set on an instance of an existing package/functionSets property:&lt;/para&gt;
 * </pre>
 * 
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;para xmlns:fmsdk="http://www.developer.cognos.com/schemas/fmsdk/1/0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;    &amp;lt;functionSet&amp;gt;&amp;lt;functionSetID&amp;gt;V_DB2&amp;lt;/functionSetID&amp;gt; &amp;lt;/functionSet&amp;gt;&lt;/para&gt;
 * </pre>
 * 
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;para xmlns:fmsdk="http://www.developer.cognos.com/schemas/fmsdk/1/0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;    &amp;lt;functionSet&amp;gt;&amp;lt;functionSetID&amp;gt;V_MSAccess&amp;lt;/functionSetID&amp;gt;&amp;lt;/functionSet&amp;gt;&lt;/para&gt;
 * </pre>
 * 
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;para xmlns:fmsdk="http://www.developer.cognos.com/schemas/fmsdk/1/0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;    &amp;lt;functionSet&amp;gt;&amp;lt;functionSetID&amp;gt;V_Oracle&amp;lt;/functionSetID&amp;gt;&amp;lt;/functionSet&amp;gt;&lt;/para&gt;
 * </pre>
 * 
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;para xmlns:fmsdk="http://www.developer.cognos.com/schemas/fmsdk/1/0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The value of the functionSets property will be set to this XML fragment and child properties are not created for the functionSetID elements that appear in the value. &lt;/para&gt;
 * </pre>
 * 
 * 
 * 
 * <p>Java class for simplePropertyValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="simplePropertyValue">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://www.developer.cognos.com/schemas/fmsdk/1/0>propertyValue">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simplePropertyValue", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class SimplePropertyValue
    extends PropertyValue
{


}
