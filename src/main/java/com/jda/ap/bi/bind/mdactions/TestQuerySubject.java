
package com.jda.ap.bi.bind.mdactions;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}reportItemOrReportItemContainer" maxOccurs="unbounded"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}maximumRowsToBeRetrieved"/>
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="applyRelevantDesignModeFilters" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}executionReportDetailLevel"/>
 *                       &lt;sequence minOccurs="0">
 *                         &lt;element name="suppressDivisionByZeroErrors" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                       &lt;/sequence>
 *                     &lt;/sequence>
 *                   &lt;/sequence>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="outputParams" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}qsapiResponseSpec"/>
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
@XmlRootElement(name = "TestQuerySubject", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class TestQuerySubject
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected TestQuerySubject.InputParams inputParams;
    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
    protected TestQuerySubject.OutputParams outputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link TestQuerySubject.InputParams }
     *     
     */
    public TestQuerySubject.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestQuerySubject.InputParams }
     *     
     */
    public void setInputParams(TestQuerySubject.InputParams value) {
        this.inputParams = value;
    }

    /**
     * Gets the value of the outputParams property.
     * 
     * @return
     *     possible object is
     *     {@link TestQuerySubject.OutputParams }
     *     
     */
    public TestQuerySubject.OutputParams getOutputParams() {
        return outputParams;
    }

    /**
     * Sets the value of the outputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestQuerySubject.OutputParams }
     *     
     */
    public void setOutputParams(TestQuerySubject.OutputParams value) {
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
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}reportItemOrReportItemContainer" maxOccurs="unbounded"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}maximumRowsToBeRetrieved"/>
     *         &lt;sequence minOccurs="0">
     *           &lt;element name="applyRelevantDesignModeFilters" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           &lt;sequence minOccurs="0">
     *             &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}executionReportDetailLevel"/>
     *             &lt;sequence minOccurs="0">
     *               &lt;element name="suppressDivisionByZeroErrors" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *             &lt;/sequence>
     *           &lt;/sequence>
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
        "reportItemOrReportItemContainer",
        "maximumRowsToBeRetrieved",
        "applyRelevantDesignModeFilters",
        "executionReportDetailLevel",
        "suppressDivisionByZeroErrors"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected List<String> reportItemOrReportItemContainer;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected BigInteger maximumRowsToBeRetrieved;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", defaultValue = "true")
        protected Boolean applyRelevantDesignModeFilters;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", defaultValue = "1")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String executionReportDetailLevel;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", defaultValue = "true")
        protected Boolean suppressDivisionByZeroErrors;

        /**
         * Gets the value of the reportItemOrReportItemContainer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reportItemOrReportItemContainer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReportItemOrReportItemContainer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getReportItemOrReportItemContainer() {
            if (reportItemOrReportItemContainer == null) {
                reportItemOrReportItemContainer = new ArrayList<String>();
            }
            return this.reportItemOrReportItemContainer;
        }

        /**
         * Gets the value of the maximumRowsToBeRetrieved property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaximumRowsToBeRetrieved() {
            return maximumRowsToBeRetrieved;
        }

        /**
         * Sets the value of the maximumRowsToBeRetrieved property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaximumRowsToBeRetrieved(BigInteger value) {
            this.maximumRowsToBeRetrieved = value;
        }

        /**
         * Gets the value of the applyRelevantDesignModeFilters property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isApplyRelevantDesignModeFilters() {
            return applyRelevantDesignModeFilters;
        }

        /**
         * Sets the value of the applyRelevantDesignModeFilters property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setApplyRelevantDesignModeFilters(Boolean value) {
            this.applyRelevantDesignModeFilters = value;
        }

        /**
         * Gets the value of the executionReportDetailLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExecutionReportDetailLevel() {
            return executionReportDetailLevel;
        }

        /**
         * Sets the value of the executionReportDetailLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExecutionReportDetailLevel(String value) {
            this.executionReportDetailLevel = value;
        }

        /**
         * Gets the value of the suppressDivisionByZeroErrors property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSuppressDivisionByZeroErrors() {
            return suppressDivisionByZeroErrors;
        }

        /**
         * Sets the value of the suppressDivisionByZeroErrors property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSuppressDivisionByZeroErrors(Boolean value) {
            this.suppressDivisionByZeroErrors = value;
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
     *       &lt;sequence>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}qsapiResponseSpec"/>
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
        "qsapiResponseSpec"
    })
    public static class OutputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String qsapiResponseSpec;

        /**
         * Gets the value of the qsapiResponseSpec property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQsapiResponseSpec() {
            return qsapiResponseSpec;
        }

        /**
         * Sets the value of the qsapiResponseSpec property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQsapiResponseSpec(String value) {
            this.qsapiResponseSpec = value;
        }

    }

}
