
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
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}dataSourceName"/>
 *                   &lt;element name="dataSourceQuery" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="interfaceClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlRootElement(name = "GetDataSourceInfo", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class GetDataSourceInfo
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected GetDataSourceInfo.InputParams inputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link GetDataSourceInfo.InputParams }
     *     
     */
    public GetDataSourceInfo.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDataSourceInfo.InputParams }
     *     
     */
    public void setInputParams(GetDataSourceInfo.InputParams value) {
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
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}dataSourceName"/>
     *         &lt;element name="dataSourceQuery" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="interfaceClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "dataSourceName",
        "dataSourceQuery",
        "interfaceClass"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String dataSourceName;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String dataSourceQuery;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String interfaceClass;

        /**
         * Gets the value of the dataSourceName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataSourceName() {
            return dataSourceName;
        }

        /**
         * Sets the value of the dataSourceName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataSourceName(String value) {
            this.dataSourceName = value;
        }

        /**
         * Gets the value of the dataSourceQuery property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataSourceQuery() {
            return dataSourceQuery;
        }

        /**
         * Sets the value of the dataSourceQuery property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataSourceQuery(String value) {
            this.dataSourceQuery = value;
        }

        /**
         * Gets the value of the interfaceClass property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInterfaceClass() {
            return interfaceClass;
        }

        /**
         * Sets the value of the interfaceClass property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInterfaceClass(String value) {
            this.interfaceClass = value;
        }

    }

}
