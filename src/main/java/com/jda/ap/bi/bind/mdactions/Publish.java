
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
 *                 &lt;group ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}inputParamsPublish"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="outputParams" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="publishedPackageDisplayPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="adminAccessSpec" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}node"/>
 *                   &lt;/sequence>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}externalizeReport" minOccurs="0"/>
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
@XmlRootElement(name = "Publish", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class Publish
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected Publish.InputParams inputParams;
    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
    protected Publish.OutputParams outputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link Publish.InputParams }
     *     
     */
    public Publish.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Publish.InputParams }
     *     
     */
    public void setInputParams(Publish.InputParams value) {
        this.inputParams = value;
    }

    /**
     * Gets the value of the outputParams property.
     * 
     * @return
     *     possible object is
     *     {@link Publish.OutputParams }
     *     
     */
    public Publish.OutputParams getOutputParams() {
        return outputParams;
    }

    /**
     * Sets the value of the outputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Publish.OutputParams }
     *     
     */
    public void setOutputParams(Publish.OutputParams value) {
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
     *       &lt;group ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}inputParamsPublish"/>
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
        "packageExists",
        "temporaryRetentionValue",
        "permanentRetentionValue",
        "externalizeQuerySubjects",
        "externalizeRootDirectory"
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
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String packageExists;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected BigInteger temporaryRetentionValue;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected BigInteger permanentRetentionValue;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", defaultValue = "0")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String externalizeQuerySubjects;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String externalizeRootDirectory;

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
         * Gets the value of the temporaryRetentionValue property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTemporaryRetentionValue() {
            return temporaryRetentionValue;
        }

        /**
         * Sets the value of the temporaryRetentionValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTemporaryRetentionValue(BigInteger value) {
            this.temporaryRetentionValue = value;
        }

        /**
         * Gets the value of the permanentRetentionValue property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPermanentRetentionValue() {
            return permanentRetentionValue;
        }

        /**
         * Sets the value of the permanentRetentionValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPermanentRetentionValue(BigInteger value) {
            this.permanentRetentionValue = value;
        }

        /**
         * Gets the value of the externalizeQuerySubjects property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExternalizeQuerySubjects() {
            return externalizeQuerySubjects;
        }

        /**
         * Sets the value of the externalizeQuerySubjects property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExternalizeQuerySubjects(String value) {
            this.externalizeQuerySubjects = value;
        }

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
     *         &lt;element name="publishedPackageDisplayPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;sequence minOccurs="0">
     *           &lt;element name="adminAccessSpec" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}node"/>
     *         &lt;/sequence>
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
        "publishedPackageDisplayPath",
        "adminAccessSpec",
        "externalizeReport"
    })
    public static class OutputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String publishedPackageDisplayPath;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String adminAccessSpec;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String externalizeReport;

        /**
         * Gets the value of the publishedPackageDisplayPath property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPublishedPackageDisplayPath() {
            return publishedPackageDisplayPath;
        }

        /**
         * Sets the value of the publishedPackageDisplayPath property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPublishedPackageDisplayPath(String value) {
            this.publishedPackageDisplayPath = value;
        }

        /**
         * Gets the value of the adminAccessSpec property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdminAccessSpec() {
            return adminAccessSpec;
        }

        /**
         * Sets the value of the adminAccessSpec property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdminAccessSpec(String value) {
            this.adminAccessSpec = value;
        }

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
