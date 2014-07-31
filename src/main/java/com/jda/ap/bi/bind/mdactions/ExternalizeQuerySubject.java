
package com.jda.ap.bi.bind.mdactions;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="inputParams">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}externalizeRootDirectory"/>
 *                   &lt;sequence maxOccurs="unbounded">
 *                     &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}querySubject"/>
 *                   &lt;/sequence>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}modelPath" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="outputParams" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}externalizeReport" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "", propOrder = {
    "inputParams",
    "outputParams"
})
@XmlRootElement(name = "externalizeQuerySubject", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class ExternalizeQuerySubject {

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected ExternalizeQuerySubject.InputParams inputParams;
    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
    protected ExternalizeQuerySubject.OutputParams outputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalizeQuerySubject.InputParams }
     *     
     */
    public ExternalizeQuerySubject.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalizeQuerySubject.InputParams }
     *     
     */
    public void setInputParams(ExternalizeQuerySubject.InputParams value) {
        this.inputParams = value;
    }

    /**
     * Gets the value of the outputParams property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalizeQuerySubject.OutputParams }
     *     
     */
    public ExternalizeQuerySubject.OutputParams getOutputParams() {
        return outputParams;
    }

    /**
     * Sets the value of the outputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalizeQuerySubject.OutputParams }
     *     
     */
    public void setOutputParams(ExternalizeQuerySubject.OutputParams value) {
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
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}externalizeRootDirectory"/>
     *         &lt;sequence maxOccurs="unbounded">
     *           &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}querySubject"/>
     *         &lt;/sequence>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}modelPath" minOccurs="0"/>
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
        "externalizeRootDirectory",
        "querySubject",
        "modelPath"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String externalizeRootDirectory;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected List<String> querySubject;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String modelPath;

        /**
         * Gets the value of the externalizeRootDirectory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExternalizeRootDirectory() {
            return externalizeRootDirectory;
        }

        /**
         * Sets the value of the externalizeRootDirectory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExternalizeRootDirectory(String value) {
            this.externalizeRootDirectory = value;
        }

        /**
         * Gets the value of the querySubject property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the querySubject property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQuerySubject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getQuerySubject() {
            if (querySubject == null) {
                querySubject = new ArrayList<String>();
            }
            return this.querySubject;
        }

        /**
         * Gets the value of the modelPath property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModelPath() {
            return modelPath;
        }

        /**
         * Sets the value of the modelPath property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModelPath(String value) {
            this.modelPath = value;
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
     *       &lt;sequence minOccurs="0">
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}externalizeReport" minOccurs="0"/>
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
        "externalizeReport"
    })
    public static class OutputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String externalizeReport;

        /**
         * Gets the value of the externalizeReport property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExternalizeReport() {
            return externalizeReport;
        }

        /**
         * Sets the value of the externalizeReport property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExternalizeReport(String value) {
            this.externalizeReport = value;
        }

    }

}
