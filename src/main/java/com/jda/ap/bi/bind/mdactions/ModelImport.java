
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
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}importSourceSpecModel"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}targetContainer"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}nameConflictOptionImport"/>
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="displaySummaryOption">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                           &lt;enumeration value="0"/>
 *                           &lt;enumeration value="1"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="containerConflictOption">
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                             &lt;enumeration value="0"/>
 *                             &lt;enumeration value="1"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/element>
 *                       &lt;sequence minOccurs="0">
 *                         &lt;element name="emptyContainerOption">
 *                           &lt;simpleType>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                               &lt;enumeration value="0"/>
 *                               &lt;enumeration value="1"/>
 *                             &lt;/restriction>
 *                           &lt;/simpleType>
 *                         &lt;/element>
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
@XmlRootElement(name = "ModelImport", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class ModelImport
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected ModelImport.InputParams inputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link ModelImport.InputParams }
     *     
     */
    public ModelImport.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelImport.InputParams }
     *     
     */
    public void setInputParams(ModelImport.InputParams value) {
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
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}modelPath"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}importSourceSpecModel"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}targetContainer"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}nameConflictOptionImport"/>
     *         &lt;sequence minOccurs="0">
     *           &lt;element name="displaySummaryOption">
     *             &lt;simpleType>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                 &lt;enumeration value="0"/>
     *                 &lt;enumeration value="1"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/element>
     *           &lt;sequence minOccurs="0">
     *             &lt;element name="containerConflictOption">
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                   &lt;enumeration value="0"/>
     *                   &lt;enumeration value="1"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/element>
     *             &lt;sequence minOccurs="0">
     *               &lt;element name="emptyContainerOption">
     *                 &lt;simpleType>
     *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                     &lt;enumeration value="0"/>
     *                     &lt;enumeration value="1"/>
     *                   &lt;/restriction>
     *                 &lt;/simpleType>
     *               &lt;/element>
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
        "modelPath",
        "importSourceSpecModel",
        "targetContainer",
        "nameConflictOptionImport",
        "displaySummaryOption",
        "containerConflictOption",
        "emptyContainerOption"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String modelPath;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String importSourceSpecModel;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String targetContainer;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String nameConflictOptionImport;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", defaultValue = "0")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String displaySummaryOption;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", defaultValue = "0")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String containerConflictOption;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", defaultValue = "1")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String emptyContainerOption;

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
         * Gets the value of the importSourceSpecModel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImportSourceSpecModel() {
            return importSourceSpecModel;
        }

        /**
         * Sets the value of the importSourceSpecModel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImportSourceSpecModel(String value) {
            this.importSourceSpecModel = value;
        }

        /**
         * Gets the value of the targetContainer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTargetContainer() {
            return targetContainer;
        }

        /**
         * Sets the value of the targetContainer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTargetContainer(String value) {
            this.targetContainer = value;
        }

        /**
         * Gets the value of the nameConflictOptionImport property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNameConflictOptionImport() {
            return nameConflictOptionImport;
        }

        /**
         * Sets the value of the nameConflictOptionImport property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNameConflictOptionImport(String value) {
            this.nameConflictOptionImport = value;
        }

        /**
         * Gets the value of the displaySummaryOption property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisplaySummaryOption() {
            return displaySummaryOption;
        }

        /**
         * Sets the value of the displaySummaryOption property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisplaySummaryOption(String value) {
            this.displaySummaryOption = value;
        }

        /**
         * Gets the value of the containerConflictOption property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContainerConflictOption() {
            return containerConflictOption;
        }

        /**
         * Sets the value of the containerConflictOption property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContainerConflictOption(String value) {
            this.containerConflictOption = value;
        }

        /**
         * Gets the value of the emptyContainerOption property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmptyContainerOption() {
            return emptyContainerOption;
        }

        /**
         * Sets the value of the emptyContainerOption property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmptyContainerOption(String value) {
            this.emptyContainerOption = value;
        }

    }

}
