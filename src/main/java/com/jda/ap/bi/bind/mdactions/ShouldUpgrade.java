
package com.jda.ap.bi.bind.mdactions;

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
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}modelPath"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}schemaPath"/>
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
 *                   &lt;element name="modelSchemaVersionComparisonResult">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         &lt;enumeration value="-1"/>
 *                         &lt;enumeration value="0"/>
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="modelVersionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="schemaVersionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlRootElement(name = "shouldUpgrade", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class ShouldUpgrade
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected ShouldUpgrade.InputParams inputParams;
    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
    protected ShouldUpgrade.OutputParams outputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link ShouldUpgrade.InputParams }
     *     
     */
    public ShouldUpgrade.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShouldUpgrade.InputParams }
     *     
     */
    public void setInputParams(ShouldUpgrade.InputParams value) {
        this.inputParams = value;
    }

    /**
     * Gets the value of the outputParams property.
     * 
     * @return
     *     possible object is
     *     {@link ShouldUpgrade.OutputParams }
     *     
     */
    public ShouldUpgrade.OutputParams getOutputParams() {
        return outputParams;
    }

    /**
     * Sets the value of the outputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShouldUpgrade.OutputParams }
     *     
     */
    public void setOutputParams(ShouldUpgrade.OutputParams value) {
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
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}modelPath"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}schemaPath"/>
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
        "modelPath",
        "schemaPath"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String modelPath;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String schemaPath;

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

        /**
         * Gets the value of the schemaPath property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchemaPath() {
            return schemaPath;
        }

        /**
         * Sets the value of the schemaPath property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchemaPath(String value) {
            this.schemaPath = value;
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
     *         &lt;element name="modelSchemaVersionComparisonResult">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               &lt;enumeration value="-1"/>
     *               &lt;enumeration value="0"/>
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="modelVersionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="schemaVersionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "modelSchemaVersionComparisonResult",
        "modelVersionNumber",
        "schemaVersionNumber"
    })
    public static class OutputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String modelSchemaVersionComparisonResult;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String modelVersionNumber;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String schemaVersionNumber;

        /**
         * Gets the value of the modelSchemaVersionComparisonResult property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModelSchemaVersionComparisonResult() {
            return modelSchemaVersionComparisonResult;
        }

        /**
         * Sets the value of the modelSchemaVersionComparisonResult property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModelSchemaVersionComparisonResult(String value) {
            this.modelSchemaVersionComparisonResult = value;
        }

        /**
         * Gets the value of the modelVersionNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModelVersionNumber() {
            return modelVersionNumber;
        }

        /**
         * Sets the value of the modelVersionNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModelVersionNumber(String value) {
            this.modelVersionNumber = value;
        }

        /**
         * Gets the value of the schemaVersionNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchemaVersionNumber() {
            return schemaVersionNumber;
        }

        /**
         * Sets the value of the schemaVersionNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchemaVersionNumber(String value) {
            this.schemaVersionNumber = value;
        }

    }

}
