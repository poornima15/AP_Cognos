
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
 *                   &lt;group ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}inputParamsImportTranslations"/>
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
 *                   &lt;element name="updatedMultilingualProperty" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}propertyHandle" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlRootElement(name = "ImportTranslations", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class ImportTranslations
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected ImportTranslations.InputParams inputParams;
    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
    protected ImportTranslations.OutputParams outputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link ImportTranslations.InputParams }
     *     
     */
    public ImportTranslations.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportTranslations.InputParams }
     *     
     */
    public void setInputParams(ImportTranslations.InputParams value) {
        this.inputParams = value;
    }

    /**
     * Gets the value of the outputParams property.
     * 
     * @return
     *     possible object is
     *     {@link ImportTranslations.OutputParams }
     *     
     */
    public ImportTranslations.OutputParams getOutputParams() {
        return outputParams;
    }

    /**
     * Sets the value of the outputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportTranslations.OutputParams }
     *     
     */
    public void setOutputParams(ImportTranslations.OutputParams value) {
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
     *         &lt;group ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}inputParamsImportTranslations"/>
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
        "keyLocale",
        "applyLocales",
        "importTranslationsRootObject",
        "selectedObjectsProcessingLevel"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String translationsFilePath;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String keyLocale;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected LocaleCollection applyLocales;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected List<Object> importTranslationsRootObject;
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
         * Gets the value of the keyLocale property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKeyLocale() {
            return keyLocale;
        }

        /**
         * Sets the value of the keyLocale property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKeyLocale(String value) {
            this.keyLocale = value;
        }

        /**
         * Gets the value of the applyLocales property.
         * 
         * @return
         *     possible object is
         *     {@link LocaleCollection }
         *     
         */
        public LocaleCollection getApplyLocales() {
            return applyLocales;
        }

        /**
         * Sets the value of the applyLocales property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocaleCollection }
         *     
         */
        public void setApplyLocales(LocaleCollection value) {
            this.applyLocales = value;
        }

        /**
         * Gets the value of the importTranslationsRootObject property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the importTranslationsRootObject property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getImportTranslationsRootObject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getImportTranslationsRootObject() {
            if (importTranslationsRootObject == null) {
                importTranslationsRootObject = new ArrayList<Object>();
            }
            return this.importTranslationsRootObject;
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
     *         &lt;element name="updatedMultilingualProperty" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}propertyHandle" maxOccurs="unbounded" minOccurs="0"/>
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
        "updatedMultilingualProperty"
    })
    public static class OutputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected List<String> updatedMultilingualProperty;

        /**
         * Gets the value of the updatedMultilingualProperty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the updatedMultilingualProperty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUpdatedMultilingualProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getUpdatedMultilingualProperty() {
            if (updatedMultilingualProperty == null) {
                updatedMultilingualProperty = new ArrayList<String>();
            }
            return this.updatedMultilingualProperty;
        }

    }

}
