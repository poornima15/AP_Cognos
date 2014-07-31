
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
 *                   &lt;element name="parameterMap" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle"/>
 *                   &lt;element name="parameterMapKeyQueryItem" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle"/>
 *                   &lt;element name="parameterMapValueQueryItem" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle"/>
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
@XmlRootElement(name = "SetQueryItemParameterMap", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class SetQueryItemParameterMap
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected SetQueryItemParameterMap.InputParams inputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link SetQueryItemParameterMap.InputParams }
     *     
     */
    public SetQueryItemParameterMap.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetQueryItemParameterMap.InputParams }
     *     
     */
    public void setInputParams(SetQueryItemParameterMap.InputParams value) {
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
     *         &lt;element name="parameterMap" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle"/>
     *         &lt;element name="parameterMapKeyQueryItem" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle"/>
     *         &lt;element name="parameterMapValueQueryItem" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle"/>
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
        "parameterMap",
        "parameterMapKeyQueryItem",
        "parameterMapValueQueryItem"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String parameterMap;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String parameterMapKeyQueryItem;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String parameterMapValueQueryItem;

        /**
         * Gets the value of the parameterMap property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParameterMap() {
            return parameterMap;
        }

        /**
         * Sets the value of the parameterMap property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParameterMap(String value) {
            this.parameterMap = value;
        }

        /**
         * Gets the value of the parameterMapKeyQueryItem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParameterMapKeyQueryItem() {
            return parameterMapKeyQueryItem;
        }

        /**
         * Sets the value of the parameterMapKeyQueryItem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParameterMapKeyQueryItem(String value) {
            this.parameterMapKeyQueryItem = value;
        }

        /**
         * Gets the value of the parameterMapValueQueryItem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParameterMapValueQueryItem() {
            return parameterMapValueQueryItem;
        }

        /**
         * Sets the value of the parameterMapValueQueryItem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParameterMapValueQueryItem(String value) {
            this.parameterMapValueQueryItem = value;
        }

    }

}
