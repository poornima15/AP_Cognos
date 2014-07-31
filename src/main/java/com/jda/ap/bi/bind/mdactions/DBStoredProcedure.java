
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
 *                   &lt;element name="storedProcedureQuerySubject" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle"/>
 *                   &lt;element name="storedProcedureSpec" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}node"/>
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
@XmlRootElement(name = "DBStoredProcedure", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class DBStoredProcedure
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected DBStoredProcedure.InputParams inputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link DBStoredProcedure.InputParams }
     *     
     */
    public DBStoredProcedure.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link DBStoredProcedure.InputParams }
     *     
     */
    public void setInputParams(DBStoredProcedure.InputParams value) {
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
     *         &lt;element name="storedProcedureSpec" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}node"/>
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
        "storedProcedureSpec"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String storedProcedureQuerySubject;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String storedProcedureSpec;

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
         * Gets the value of the storedProcedureSpec property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStoredProcedureSpec() {
            return storedProcedureSpec;
        }

        /**
         * Sets the value of the storedProcedureSpec property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStoredProcedureSpec(String value) {
            this.storedProcedureSpec = value;
        }

    }

}
