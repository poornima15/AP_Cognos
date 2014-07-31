
package com.jda.ap.bi.bind.mdactions;

import java.math.BigInteger;
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
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}createAutoSummary"/>
 *                   &lt;element name="expression" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}maximumRowsToBeRetrieved"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}executionReportDetailLevel"/>
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
@XmlRootElement(name = "ExpressionQuery", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class ExpressionQuery
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected ExpressionQuery.InputParams inputParams;
    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
    protected ExpressionQuery.OutputParams outputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionQuery.InputParams }
     *     
     */
    public ExpressionQuery.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionQuery.InputParams }
     *     
     */
    public void setInputParams(ExpressionQuery.InputParams value) {
        this.inputParams = value;
    }

    /**
     * Gets the value of the outputParams property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionQuery.OutputParams }
     *     
     */
    public ExpressionQuery.OutputParams getOutputParams() {
        return outputParams;
    }

    /**
     * Sets the value of the outputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionQuery.OutputParams }
     *     
     */
    public void setOutputParams(ExpressionQuery.OutputParams value) {
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
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}createAutoSummary"/>
     *         &lt;element name="expression" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}maximumRowsToBeRetrieved"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}executionReportDetailLevel"/>
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
        "createAutoSummary",
        "expression",
        "maximumRowsToBeRetrieved",
        "executionReportDetailLevel"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected boolean createAutoSummary;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String expression;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected BigInteger maximumRowsToBeRetrieved;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true, defaultValue = "1")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String executionReportDetailLevel;

        /**
         * Gets the value of the createAutoSummary property.
         * 
         */
        public boolean isCreateAutoSummary() {
            return createAutoSummary;
        }

        /**
         * Sets the value of the createAutoSummary property.
         * 
         */
        public void setCreateAutoSummary(boolean value) {
            this.createAutoSummary = value;
        }

        /**
         * Gets the value of the expression property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpression() {
            return expression;
        }

        /**
         * Sets the value of the expression property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpression(String value) {
            this.expression = value;
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
