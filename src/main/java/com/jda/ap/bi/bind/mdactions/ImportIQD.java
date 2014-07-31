
package com.jda.ap.bi.bind.mdactions;

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
 *                   &lt;element name="IQDFilePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ImportedFolder" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle"/>
 *                   &lt;element name="IQDFileSpec" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}node"/>
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
@XmlRootElement(name = "ImportIQD", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class ImportIQD
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected ImportIQD.InputParams inputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link ImportIQD.InputParams }
     *     
     */
    public ImportIQD.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportIQD.InputParams }
     *     
     */
    public void setInputParams(ImportIQD.InputParams value) {
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
     *         &lt;element name="IQDFilePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ImportedFolder" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle"/>
     *         &lt;element name="IQDFileSpec" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}node"/>
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
        "iqdFilePath",
        "importedFolder",
        "iqdFileSpec"
    })
    public static class InputParams {

        @XmlElement(name = "IQDFilePath", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String iqdFilePath;
        @XmlElement(name = "ImportedFolder", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String importedFolder;
        @XmlElement(name = "IQDFileSpec", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String iqdFileSpec;

        /**
         * Gets the value of the iqdFilePath property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIQDFilePath() {
            return iqdFilePath;
        }

        /**
         * Sets the value of the iqdFilePath property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIQDFilePath(String value) {
            this.iqdFilePath = value;
        }

        /**
         * Gets the value of the importedFolder property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImportedFolder() {
            return importedFolder;
        }

        /**
         * Sets the value of the importedFolder property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImportedFolder(String value) {
            this.importedFolder = value;
        }

        /**
         * Gets the value of the iqdFileSpec property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIQDFileSpec() {
            return iqdFileSpec;
        }

        /**
         * Sets the value of the iqdFileSpec property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIQDFileSpec(String value) {
            this.iqdFileSpec = value;
        }

    }

}
