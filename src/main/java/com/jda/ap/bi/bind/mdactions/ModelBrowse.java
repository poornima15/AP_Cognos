
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
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}modelPath"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}importSourceSpecModel"/>
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
@XmlRootElement(name = "ModelBrowse", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class ModelBrowse
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected ModelBrowse.InputParams inputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link ModelBrowse.InputParams }
     *     
     */
    public ModelBrowse.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelBrowse.InputParams }
     *     
     */
    public void setInputParams(ModelBrowse.InputParams value) {
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
        "importSourceSpecModel"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String modelPath;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String importSourceSpecModel;

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

    }

}
