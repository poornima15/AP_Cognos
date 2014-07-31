
package com.jda.ap.bi.bind.mdactions;

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
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}translationsFilePath"/>
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="exportLocales" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}localeCollection"/>
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="exportTranslationsRootObject" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded"/>
 *                       &lt;sequence minOccurs="0">
 *                         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}selectedObjectsProcessingLevel"/>
 *                       &lt;/sequence>
 *                     &lt;/sequence>
 *                   &lt;/sequence>
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
@XmlRootElement(name = "ExportTranslations", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class ExportTranslations
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected ExportTranslations.InputParams inputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link ExportTranslations.InputParams }
     *     
     */
    public ExportTranslations.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportTranslations.InputParams }
     *     
     */
    public void setInputParams(ExportTranslations.InputParams value) {
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
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}translationsFilePath"/>
     *         &lt;sequence minOccurs="0">
     *           &lt;element name="exportLocales" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}localeCollection"/>
     *           &lt;sequence minOccurs="0">
     *             &lt;element name="exportTranslationsRootObject" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded"/>
     *             &lt;sequence minOccurs="0">
     *               &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}selectedObjectsProcessingLevel"/>
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
        "translationsFilePath",
        "exportLocales",
        "exportTranslationsRootObject",
        "selectedObjectsProcessingLevel"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String translationsFilePath;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected LocaleCollection exportLocales;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected List<Object> exportTranslationsRootObject;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String selectedObjectsProcessingLevel;

        /**
         * Gets the value of the translationsFilePath property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTranslationsFilePath() {
            return translationsFilePath;
        }

        /**
         * Sets the value of the translationsFilePath property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTranslationsFilePath(String value) {
            this.translationsFilePath = value;
        }

        /**
         * Gets the value of the exportLocales property.
         * 
         * @return
         *     possible object is
         *     {@link LocaleCollection }
         *     
         */
        public LocaleCollection getExportLocales() {
            return exportLocales;
        }

        /**
         * Sets the value of the exportLocales property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocaleCollection }
         *     
         */
        public void setExportLocales(LocaleCollection value) {
            this.exportLocales = value;
        }

        /**
         * Gets the value of the exportTranslationsRootObject property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the exportTranslationsRootObject property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExportTranslationsRootObject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getExportTranslationsRootObject() {
            if (exportTranslationsRootObject == null) {
                exportTranslationsRootObject = new ArrayList<Object>();
            }
            return this.exportTranslationsRootObject;
        }

        /**
         * Gets the value of the selectedObjectsProcessingLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectedObjectsProcessingLevel() {
            return selectedObjectsProcessingLevel;
        }

        /**
         * Sets the value of the selectedObjectsProcessingLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectedObjectsProcessingLevel(String value) {
            this.selectedObjectsProcessingLevel = value;
        }

    }

}
