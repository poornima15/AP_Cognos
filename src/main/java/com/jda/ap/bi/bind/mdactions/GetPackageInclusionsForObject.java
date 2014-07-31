
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
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}reportObject"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="outputParams" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}reportObject"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}securityViewOrPackage"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}includeRule"/>
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
    "inputParams",
    "outputParams"
})
@XmlRootElement(name = "GetPackageInclusionsForObject", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class GetPackageInclusionsForObject
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected GetPackageInclusionsForObject.InputParams inputParams;
    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
    protected GetPackageInclusionsForObject.OutputParams outputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link GetPackageInclusionsForObject.InputParams }
     *     
     */
    public GetPackageInclusionsForObject.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPackageInclusionsForObject.InputParams }
     *     
     */
    public void setInputParams(GetPackageInclusionsForObject.InputParams value) {
        this.inputParams = value;
    }

    /**
     * Gets the value of the outputParams property.
     * 
     * @return
     *     possible object is
     *     {@link GetPackageInclusionsForObject.OutputParams }
     *     
     */
    public GetPackageInclusionsForObject.OutputParams getOutputParams() {
        return outputParams;
    }

    /**
     * Sets the value of the outputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPackageInclusionsForObject.OutputParams }
     *     
     */
    public void setOutputParams(GetPackageInclusionsForObject.OutputParams value) {
        this.outputParams = value;
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
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}reportObject"/>
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
        "reportObject"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String reportObject;

        /**
         * Gets the value of the reportObject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReportObject() {
            return reportObject;
        }

        /**
         * Sets the value of the reportObject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReportObject(String value) {
            this.reportObject = value;
        }

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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}reportObject"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}securityViewOrPackage"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}includeRule"/>
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
        "reportObjectAndSecurityViewOrPackageAndIncludeRule"
    })
    public static class OutputParams {

        @XmlElementRefs({
            @XmlElementRef(name = "reportObject", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "securityViewOrPackage", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "includeRule", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<String>> reportObjectAndSecurityViewOrPackageAndIncludeRule;

        /**
         * Gets the value of the reportObjectAndSecurityViewOrPackageAndIncludeRule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reportObjectAndSecurityViewOrPackageAndIncludeRule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReportObjectAndSecurityViewOrPackageAndIncludeRule().add(newItem);
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
        public List<JAXBElement<String>> getReportObjectAndSecurityViewOrPackageAndIncludeRule() {
            if (reportObjectAndSecurityViewOrPackageAndIncludeRule == null) {
                reportObjectAndSecurityViewOrPackageAndIncludeRule = new ArrayList<JAXBElement<String>>();
            }
            return this.reportObjectAndSecurityViewOrPackageAndIncludeRule;
        }

    }

}
