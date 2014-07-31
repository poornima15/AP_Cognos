
package com.jda.ap.bi.bind.mdactions;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *     &lt;extension base="{http://www.developer.cognos.com/schemas/fmsdk/1/0}action">
 *       &lt;sequence>
 *         &lt;element name="inputParams">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}securityViewOrPackage"/>
 *                   &lt;sequence maxOccurs="unbounded">
 *                     &lt;choice>
 *                       &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}reportObject"/>
 *                       &lt;element name="securityView" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle"/>
 *                     &lt;/choice>
 *                     &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}includeRule"/>
 *                   &lt;/sequence>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inputParams"
})
@XmlRootElement(name = "SetSecurityViewDefinition", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class SetSecurityViewDefinition
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected SetSecurityViewDefinition.InputParams inputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link SetSecurityViewDefinition.InputParams }
     *     
     */
    public SetSecurityViewDefinition.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetSecurityViewDefinition.InputParams }
     *     
     */
    public void setInputParams(SetSecurityViewDefinition.InputParams value) {
        this.inputParams = value;
    }


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
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}securityViewOrPackage"/>
     *         &lt;sequence maxOccurs="unbounded">
     *           &lt;choice>
     *             &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}reportObject"/>
     *             &lt;element name="securityView" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle"/>
     *           &lt;/choice>
     *           &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}includeRule"/>
     *         &lt;/sequence>
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
        "securityViewOrPackage",
        "reportObjectOrSecurityViewAndIncludeRule"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String securityViewOrPackage;
        @XmlElementRefs({
            @XmlElementRef(name = "reportObject", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class),
            @XmlElementRef(name = "securityView", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class),
            @XmlElementRef(name = "includeRule", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class)
        })
        protected List<JAXBElement<String>> reportObjectOrSecurityViewAndIncludeRule;

        /**
         * Gets the value of the securityViewOrPackage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecurityViewOrPackage() {
            return securityViewOrPackage;
        }

        /**
         * Sets the value of the securityViewOrPackage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecurityViewOrPackage(String value) {
            this.securityViewOrPackage = value;
        }

        /**
         * Gets the value of the reportObjectOrSecurityViewAndIncludeRule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reportObjectOrSecurityViewAndIncludeRule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReportObjectOrSecurityViewAndIncludeRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * 
         * 
         */
        public List<JAXBElement<String>> getReportObjectOrSecurityViewAndIncludeRule() {
            if (reportObjectOrSecurityViewAndIncludeRule == null) {
                reportObjectOrSecurityViewAndIncludeRule = new ArrayList<JAXBElement<String>>();
            }
            return this.reportObjectOrSecurityViewAndIncludeRule;
        }

    }

}
