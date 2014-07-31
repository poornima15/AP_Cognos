
package com.jda.ap.bi.bind.mdactions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;para xmlns:fmsdk="http://www.developer.cognos.com/schemas/fmsdk/1/0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;If the value is an XML fragment, new child properties are created under the property in question from the child elements or attributes that exist in this value.&lt;/para&gt;
 * </pre>
 * 
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;para xmlns:fmsdk="http://www.developer.cognos.com/schemas/fmsdk/1/0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;For example, in the following value being set on an instance of an existing package/functionSets property:&lt;/para&gt;
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;para xmlns:fmsdk="http://www.developer.cognos.com/schemas/fmsdk/1/0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Three instances of functionSetID child properties will be created under the functionSets property, and their values set to V_DB2, V_MSAccess, and V_Oracle, respectively. &lt;/para&gt;
 * </pre>
 * 
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;para xmlns:fmsdk="http://www.developer.cognos.com/schemas/fmsdk/1/0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;This type of value applies to a complex property. A complex property is one that can contain child properties of its own. In general, when dealing with a property that can have children, specify this option.&lt;/para&gt;
 * </pre>
 * 
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;para xmlns:fmsdk="http://www.developer.cognos.com/schemas/fmsdk/1/0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Note: All reserved XML characters must be escaped, even if the value is specified as an XML fragment.&lt;/para&gt;
 * </pre>
 * 
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;para xmlns:fmsdk="http://www.developer.cognos.com/schemas/fmsdk/1/0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;For more information, see the Framework Manager model schema.&lt;/para&gt;
 * </pre>
 * 
 * 
 * 
 * <p>Java class for complexPropertyValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complexPropertyValue">
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
@XmlType(name = "complexPropertyValue", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class ComplexPropertyValue
    extends PropertyValue
{


}
