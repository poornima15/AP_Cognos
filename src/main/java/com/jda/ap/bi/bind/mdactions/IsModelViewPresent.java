
package com.jda.ap.bi.bind.mdactions;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}regularPackage"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}publishTargetType"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}targetLocation"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}targetPackageName"/>
 *                   &lt;element name="packageNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}packageExists"/>
 *                   &lt;element name="currentRetentionValue" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="existingModelCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
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
@XmlRootElement(name = "IsModelViewPresent", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class IsModelViewPresent
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected IsModelViewPresent.InputParams inputParams;
    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
    protected IsModelViewPresent.OutputParams outputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link IsModelViewPresent.InputParams }
     *     
     */
    public IsModelViewPresent.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsModelViewPresent.InputParams }
     *     
     */
    public void setInputParams(IsModelViewPresent.InputParams value) {
        this.inputParams = value;
    }

    /**
     * Gets the value of the outputParams property.
     * 
     * @return
     *     possible object is
     *     {@link IsModelViewPresent.OutputParams }
     *     
     */
    public IsModelViewPresent.OutputParams getOutputParams() {
        return outputParams;
    }

    /**
     * Sets the value of the outputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsModelViewPresent.OutputParams }
     *     
     */
    public void setOutputParams(IsModelViewPresent.OutputParams value) {
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
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}regularPackage"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}publishTargetType"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}targetLocation"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}targetPackageName"/>
     *         &lt;element name="packageNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "regularPackage",
        "publishTargetType",
        "targetLocation",
        "targetPackageName",
        "packageNames"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String regularPackage;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String publishTargetType;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String targetLocation;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String targetPackageName;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String packageNames;

        /**
         * Gets the value of the regularPackage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegularPackage() {
            return regularPackage;
        }

        /**
         * Sets the value of the regularPackage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegularPackage(String value) {
            this.regularPackage = value;
        }

        /**
         * Gets the value of the publishTargetType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPublishTargetType() {
            return publishTargetType;
        }

        /**
         * Sets the value of the publishTargetType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPublishTargetType(String value) {
            this.publishTargetType = value;
        }

        /**
         * Gets the value of the targetLocation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTargetLocation() {
            return targetLocation;
        }

        /**
         * Sets the value of the targetLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTargetLocation(String value) {
            this.targetLocation = value;
        }

        /**
         * Gets the value of the targetPackageName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTargetPackageName() {
            return targetPackageName;
        }

        /**
         * Sets the value of the targetPackageName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTargetPackageName(String value) {
            this.targetPackageName = value;
        }

        /**
         * Gets the value of the packageNames property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPackageNames() {
            return packageNames;
        }

        /**
         * Sets the value of the packageNames property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPackageNames(String value) {
            this.packageNames = value;
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
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}packageExists"/>
     *         &lt;element name="currentRetentionValue" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="existingModelCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
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
        "packageExists",
        "currentRetentionValue",
        "existingModelCount"
    })
    public static class OutputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String packageExists;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected BigInteger currentRetentionValue;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger existingModelCount;

        /**
         * Gets the value of the packageExists property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPackageExists() {
            return packageExists;
        }

        /**
         * Sets the value of the packageExists property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPackageExists(String value) {
            this.packageExists = value;
        }

        /**
         * Gets the value of the currentRetentionValue property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCurrentRetentionValue() {
            return currentRetentionValue;
        }

        /**
         * Sets the value of the currentRetentionValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCurrentRetentionValue(BigInteger value) {
            this.currentRetentionValue = value;
        }

        /**
         * Gets the value of the existingModelCount property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getExistingModelCount() {
            return existingModelCount;
        }

        /**
         * Sets the value of the existingModelCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setExistingModelCount(BigInteger value) {
            this.existingModelCount = value;
        }

    }

}
