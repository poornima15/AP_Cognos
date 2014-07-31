
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
 *         &lt;element name="outputParams" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="modelLocales" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}localeCollection"/>
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
    "outputParams"
})
@XmlRootElement(name = "GetSupportedLocales", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class GetSupportedLocales
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
    protected GetSupportedLocales.OutputParams outputParams;

    /**
     * Gets the value of the outputParams property.
     * 
     * @return
     *     possible object is
     *     {@link GetSupportedLocales.OutputParams }
     *     
     */
    public GetSupportedLocales.OutputParams getOutputParams() {
        return outputParams;
    }

    /**
     * Sets the value of the outputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSupportedLocales.OutputParams }
     *     
     */
    public void setOutputParams(GetSupportedLocales.OutputParams value) {
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
     *         &lt;element name="modelLocales" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}localeCollection"/>
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
        "modelLocales"
    })
    public static class OutputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected LocaleCollection modelLocales;

        /**
         * Gets the value of the modelLocales property.
         * 
         * @return
         *     possible object is
         *     {@link LocaleCollection }
         *     
         */
        public LocaleCollection getModelLocales() {
            return modelLocales;
        }

        /**
         * Sets the value of the modelLocales property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocaleCollection }
         *     
         */
        public void setModelLocales(LocaleCollection value) {
            this.modelLocales = value;
        }

    }

}
