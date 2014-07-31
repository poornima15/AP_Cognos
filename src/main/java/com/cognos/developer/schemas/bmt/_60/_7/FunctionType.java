//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.18 at 10:35:14 AM MDT 
//


package com.cognos.developer.schemas.bmt._60._7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for functionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="functionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.developer.cognos.com/schemas/bmt/60/7}reportObjectType">
 *       &lt;sequence>
 *         &lt;element name="syntaxTip" type="{http://www.developer.cognos.com/schemas/bmt/60/7}nameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="canonicalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.developer.cognos.com/schemas/bmt/60/7}dataSourceRef" minOccurs="0"/>
 *         &lt;element name="result">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;group ref="{http://www.developer.cognos.com/schemas/bmt/60/7}dataColumnProperties"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="procParameters">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="procParameter" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;group ref="{http://www.developer.cognos.com/schemas/bmt/60/7}callParameterProperties"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "functionType", propOrder = {
    "syntaxTip",
    "canonicalName",
    "dataSourceRef",
    "result",
    "procParameters"
})
public class FunctionType
    extends ReportObjectType
{

    protected List<NameType> syntaxTip;
    @XmlElement(required = true)
    protected String canonicalName;
    protected String dataSourceRef;
    @XmlElement(required = true)
    protected com.cognos.developer.schemas.bmt._60._7.FunctionType.Result result;
    @XmlElement(required = true)
    protected com.cognos.developer.schemas.bmt._60._7.FunctionType.ProcParameters procParameters;

    /**
     * Gets the value of the syntaxTip property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the syntaxTip property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSyntaxTip().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     *
     *
     */
    public List<NameType> getSyntaxTip() {
        if (syntaxTip == null) {
            syntaxTip = new ArrayList<NameType>();
        }
        return this.syntaxTip;
    }

    /**
     * Gets the value of the canonicalName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCanonicalName() {
        return canonicalName;
    }

    /**
     * Sets the value of the canonicalName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCanonicalName(String value) {
        this.canonicalName = value;
    }

    /**
     * Gets the value of the dataSourceRef property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDataSourceRef() {
        return dataSourceRef;
    }

    /**
     * Sets the value of the dataSourceRef property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDataSourceRef(String value) {
        this.dataSourceRef = value;
    }

    /**
     * Gets the value of the result property.
     *
     * @return
     *     possible object is
     *     {@link com.cognos.developer.schemas.bmt._60._7.FunctionType.Result }
     *
     */
    public com.cognos.developer.schemas.bmt._60._7.FunctionType.Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     *
     * @param value
     *     allowed object is
     *     {@link com.cognos.developer.schemas.bmt._60._7.FunctionType.Result }
     *
     */
    public void setResult(com.cognos.developer.schemas.bmt._60._7.FunctionType.Result value) {
        this.result = value;
    }

    /**
     * Gets the value of the procParameters property.
     *
     * @return
     *     possible object is
     *     {@link com.cognos.developer.schemas.bmt._60._7.FunctionType.ProcParameters }
     *
     */
    public com.cognos.developer.schemas.bmt._60._7.FunctionType.ProcParameters getProcParameters() {
        return procParameters;
    }

    /**
     * Sets the value of the procParameters property.
     *
     * @param value
     *     allowed object is
     *     {@link com.cognos.developer.schemas.bmt._60._7.FunctionType.ProcParameters }
     *
     */
    public void setProcParameters(com.cognos.developer.schemas.bmt._60._7.FunctionType.ProcParameters value) {
        this.procParameters = value;
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
     *         &lt;element name="procParameter" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;group ref="{http://www.developer.cognos.com/schemas/bmt/60/7}callParameterProperties"/>
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
        "procParameter"
    })
    public static class ProcParameters {

        protected List<com.cognos.developer.schemas.bmt._60._7.FunctionType.ProcParameters.ProcParameter> procParameter;

        /**
         * Gets the value of the procParameter property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the procParameter property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProcParameter().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link com.cognos.developer.schemas.bmt._60._7.FunctionType.ProcParameters.ProcParameter }
         *
         *
         */
        public List<com.cognos.developer.schemas.bmt._60._7.FunctionType.ProcParameters.ProcParameter> getProcParameter() {
            if (procParameter == null) {
                procParameter = new ArrayList<com.cognos.developer.schemas.bmt._60._7.FunctionType.ProcParameters.ProcParameter>();
            }
            return this.procParameter;
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
         *         &lt;group ref="{http://www.developer.cognos.com/schemas/bmt/60/7}callParameterProperties"/>
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
            "parameterName",
            "mode",
            "datatype",
            "precision",
            "scale",
            "size",
            "nullable",
            "aggregationRule"
        })
        public static class ProcParameter {

            @XmlElement(required = true)
            protected String parameterName;
            @XmlElement(required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String mode;
            @XmlElement(defaultValue = "unknown")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String datatype;
            protected BigInteger precision;
            @XmlElement(defaultValue = "0")
            protected BigInteger scale;
            protected Long size;
            @XmlElement(defaultValue = "false")
            protected Boolean nullable;
            protected RegularAggregateType aggregationRule;

            /**
             * Gets the value of the parameterName property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getParameterName() {
                return parameterName;
            }

            /**
             * Sets the value of the parameterName property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setParameterName(String value) {
                this.parameterName = value;
            }

            /**
             * Gets the value of the mode property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getMode() {
                return mode;
            }

            /**
             * Sets the value of the mode property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setMode(String value) {
                this.mode = value;
            }

            /**
             * Gets the value of the datatype property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDatatype() {
                return datatype;
            }

            /**
             * Sets the value of the datatype property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDatatype(String value) {
                this.datatype = value;
            }

            /**
             * Gets the value of the precision property.
             *
             * @return
             *     possible object is
             *     {@link java.math.BigInteger }
             *
             */
            public BigInteger getPrecision() {
                return precision;
            }

            /**
             * Sets the value of the precision property.
             *
             * @param value
             *     allowed object is
             *     {@link java.math.BigInteger }
             *
             */
            public void setPrecision(BigInteger value) {
                this.precision = value;
            }

            /**
             * Gets the value of the scale property.
             *
             * @return
             *     possible object is
             *     {@link java.math.BigInteger }
             *
             */
            public BigInteger getScale() {
                return scale;
            }

            /**
             * Sets the value of the scale property.
             *
             * @param value
             *     allowed object is
             *     {@link java.math.BigInteger }
             *
             */
            public void setScale(BigInteger value) {
                this.scale = value;
            }

            /**
             * Gets the value of the size property.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getSize() {
                return size;
            }

            /**
             * Sets the value of the size property.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setSize(Long value) {
                this.size = value;
            }

            /**
             * Gets the value of the nullable property.
             *
             * @return
             *     possible object is
             *     {@link Boolean }
             *
             */
            public Boolean isNullable() {
                return nullable;
            }

            /**
             * Sets the value of the nullable property.
             *
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *
             */
            public void setNullable(Boolean value) {
                this.nullable = value;
            }

            /**
             * Gets the value of the aggregationRule property.
             *
             * @return
             *     possible object is
             *     {@link RegularAggregateType }
             *
             */
            public RegularAggregateType getAggregationRule() {
                return aggregationRule;
            }

            /**
             * Sets the value of the aggregationRule property.
             *
             * @param value
             *     allowed object is
             *     {@link RegularAggregateType }
             *
             */
            public void setAggregationRule(RegularAggregateType value) {
                this.aggregationRule = value;
            }

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
     *       &lt;group ref="{http://www.developer.cognos.com/schemas/bmt/60/7}dataColumnProperties"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "datatype",
        "precision",
        "scale",
        "size",
        "nullable",
        "aggregationRule"
    })
    public static class Result {

        @XmlElement(defaultValue = "unknown")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String datatype;
        protected BigInteger precision;
        @XmlElement(defaultValue = "0")
        protected BigInteger scale;
        protected Long size;
        @XmlElement(defaultValue = "false")
        protected Boolean nullable;
        protected RegularAggregateType aggregationRule;

        /**
         * Gets the value of the datatype property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDatatype() {
            return datatype;
        }

        /**
         * Sets the value of the datatype property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDatatype(String value) {
            this.datatype = value;
        }

        /**
         * Gets the value of the precision property.
         *
         * @return
         *     possible object is
         *     {@link java.math.BigInteger }
         *
         */
        public BigInteger getPrecision() {
            return precision;
        }

        /**
         * Sets the value of the precision property.
         *
         * @param value
         *     allowed object is
         *     {@link java.math.BigInteger }
         *
         */
        public void setPrecision(BigInteger value) {
            this.precision = value;
        }

        /**
         * Gets the value of the scale property.
         *
         * @return
         *     possible object is
         *     {@link java.math.BigInteger }
         *
         */
        public BigInteger getScale() {
            return scale;
        }

        /**
         * Sets the value of the scale property.
         *
         * @param value
         *     allowed object is
         *     {@link java.math.BigInteger }
         *     
         */
        public void setScale(BigInteger value) {
            this.scale = value;
        }

        /**
         * Gets the value of the size property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getSize() {
            return size;
        }

        /**
         * Sets the value of the size property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setSize(Long value) {
            this.size = value;
        }

        /**
         * Gets the value of the nullable property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNullable() {
            return nullable;
        }

        /**
         * Sets the value of the nullable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNullable(Boolean value) {
            this.nullable = value;
        }

        /**
         * Gets the value of the aggregationRule property.
         * 
         * @return
         *     possible object is
         *     {@link RegularAggregateType }
         *     
         */
        public RegularAggregateType getAggregationRule() {
            return aggregationRule;
        }

        /**
         * Sets the value of the aggregationRule property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegularAggregateType }
         *     
         */
        public void setAggregationRule(RegularAggregateType value) {
            this.aggregationRule = value;
        }

    }

}