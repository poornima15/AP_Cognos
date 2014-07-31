
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
 *                   &lt;element name="storedProcedureQuerySubject" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle"/>
 *                   &lt;element name="procParameter" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}propertyHandle"/>
 *                   &lt;element name="removeSourceQuerySubject">
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
@XmlRootElement(name = "TransformFunction", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class TransformFunction
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected TransformFunction.InputParams inputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link TransformFunction.InputParams }
     *     
     */
    public TransformFunction.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformFunction.InputParams }
     *     
     */
    public void setInputParams(TransformFunction.InputParams value) {
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
     *         &lt;element name="storedProcedureQuerySubject" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle"/>
     *         &lt;element name="procParameter" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}propertyHandle"/>
     *         &lt;element name="removeSourceQuerySubject">
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
        "storedProcedureQuerySubject",
        "procParameter",
        "removeSourceQuerySubject"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String storedProcedureQuerySubject;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String procParameter;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String removeSourceQuerySubject;

        /**
         * Gets the value of the storedProcedureQuerySubject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStoredProcedureQuerySubject() {
            return storedProcedureQuerySubject;
        }

        /**
         * Sets the value of the storedProcedureQuerySubject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStoredProcedureQuerySubject(String value) {
            this.storedProcedureQuerySubject = value;
        }

        /**
         * Gets the value of the procParameter property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProcParameter() {
            return procParameter;
        }

        /**
         * Sets the value of the procParameter property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProcParameter(String value) {
            this.procParameter = value;
        }

        /**
         * Gets the value of the removeSourceQuerySubject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemoveSourceQuerySubject() {
            return removeSourceQuerySubject;
        }

        /**
         * Sets the value of the removeSourceQuerySubject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemoveSourceQuerySubject(String value) {
            this.removeSourceQuerySubject = value;
        }

    }

}
