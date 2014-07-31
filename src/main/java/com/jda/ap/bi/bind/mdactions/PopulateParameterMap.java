
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
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}parameterMap"/>
 *                   &lt;element name="parameterMapEntriesSourceFilePath" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}delimitedFilePath"/>
 *                   &lt;element name="nameConflictOptionPopulateParameterMap" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         &lt;enumeration value="0"/>
 *                         &lt;enumeration value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
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
@XmlRootElement(name = "PopulateParameterMap", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class PopulateParameterMap
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected PopulateParameterMap.InputParams inputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link PopulateParameterMap.InputParams }
     *     
     */
    public PopulateParameterMap.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link PopulateParameterMap.InputParams }
     *     
     */
    public void setInputParams(PopulateParameterMap.InputParams value) {
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
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}parameterMap"/>
     *         &lt;element name="parameterMapEntriesSourceFilePath" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}delimitedFilePath"/>
     *         &lt;element name="nameConflictOptionPopulateParameterMap" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               &lt;enumeration value="0"/>
     *               &lt;enumeration value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
        "parameterMapEntriesSourceFilePath",
        "nameConflictOptionPopulateParameterMap"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected Object parameterMap;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String parameterMapEntriesSourceFilePath;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", defaultValue = "0")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String nameConflictOptionPopulateParameterMap;

        /**
         * Gets the value of the parameterMap property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getParameterMap() {
            return parameterMap;
        }

        /**
         * Sets the value of the parameterMap property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setParameterMap(Object value) {
            this.parameterMap = value;
        }

        /**
         * Gets the value of the parameterMapEntriesSourceFilePath property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParameterMapEntriesSourceFilePath() {
            return parameterMapEntriesSourceFilePath;
        }

        /**
         * Sets the value of the parameterMapEntriesSourceFilePath property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParameterMapEntriesSourceFilePath(String value) {
            this.parameterMapEntriesSourceFilePath = value;
        }

        /**
         * Gets the value of the nameConflictOptionPopulateParameterMap property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNameConflictOptionPopulateParameterMap() {
            return nameConflictOptionPopulateParameterMap;
        }

        /**
         * Sets the value of the nameConflictOptionPopulateParameterMap property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNameConflictOptionPopulateParameterMap(String value) {
            this.nameConflictOptionPopulateParameterMap = value;
        }

    }

}
