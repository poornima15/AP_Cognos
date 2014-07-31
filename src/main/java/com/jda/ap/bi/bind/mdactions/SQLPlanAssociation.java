
package com.jda.ap.bi.bind.mdactions;

import java.math.BigInteger;
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
 *     &lt;extension base="{http://www.developer.cognos.com/schemas/fmsdk/1/0}action">
 *       &lt;sequence>
 *         &lt;element name="inputParams">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="relationshipName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="leftEndReference" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectReference"/>
 *                   &lt;element name="leftEndCardinality" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="rightEndReference" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectReference"/>
 *                   &lt;element name="rightEndCardinality" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}expression"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}createAutoSummary"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}maximumRowsToBeRetrieved"/>
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
@XmlRootElement(name = "SQLPlanAssociation", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class SQLPlanAssociation
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected SQLPlanAssociation.InputParams inputParams;
    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
    protected SQLPlanAssociation.OutputParams outputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link SQLPlanAssociation.InputParams }
     *     
     */
    public SQLPlanAssociation.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SQLPlanAssociation.InputParams }
     *     
     */
    public void setInputParams(SQLPlanAssociation.InputParams value) {
        this.inputParams = value;
    }

    /**
     * Gets the value of the outputParams property.
     * 
     * @return
     *     possible object is
     *     {@link SQLPlanAssociation.OutputParams }
     *     
     */
    public SQLPlanAssociation.OutputParams getOutputParams() {
        return outputParams;
    }

    /**
     * Sets the value of the outputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SQLPlanAssociation.OutputParams }
     *     
     */
    public void setOutputParams(SQLPlanAssociation.OutputParams value) {
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
     *         &lt;element name="relationshipName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="leftEndReference" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectReference"/>
     *         &lt;element name="leftEndCardinality" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="rightEndReference" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectReference"/>
     *         &lt;element name="rightEndCardinality" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}expression"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}createAutoSummary"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}maximumRowsToBeRetrieved"/>
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
        "relationshipName",
        "leftEndReference",
        "leftEndCardinality",
        "rightEndReference",
        "rightEndCardinality",
        "expression",
        "createAutoSummary",
        "maximumRowsToBeRetrieved"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String relationshipName;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String leftEndReference;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String leftEndCardinality;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String rightEndReference;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String rightEndCardinality;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String expression;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected boolean createAutoSummary;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected BigInteger maximumRowsToBeRetrieved;

        /**
         * Gets the value of the relationshipName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRelationshipName() {
            return relationshipName;
        }

        /**
         * Sets the value of the relationshipName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRelationshipName(String value) {
            this.relationshipName = value;
        }

        /**
         * Gets the value of the leftEndReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLeftEndReference() {
            return leftEndReference;
        }

        /**
         * Sets the value of the leftEndReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLeftEndReference(String value) {
            this.leftEndReference = value;
        }

        /**
         * Gets the value of the leftEndCardinality property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLeftEndCardinality() {
            return leftEndCardinality;
        }

        /**
         * Sets the value of the leftEndCardinality property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLeftEndCardinality(String value) {
            this.leftEndCardinality = value;
        }

        /**
         * Gets the value of the rightEndReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRightEndReference() {
            return rightEndReference;
        }

        /**
         * Sets the value of the rightEndReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRightEndReference(String value) {
            this.rightEndReference = value;
        }

        /**
         * Gets the value of the rightEndCardinality property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRightEndCardinality() {
            return rightEndCardinality;
        }

        /**
         * Sets the value of the rightEndCardinality property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRightEndCardinality(String value) {
            this.rightEndCardinality = value;
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
