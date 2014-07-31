
package com.jda.ap.bi.bind.mdactions;

import java.util.ArrayList;
import java.util.List;
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
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}querySubject" maxOccurs="unbounded"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}joinOptionProcessExternalJoins"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}joinOptionProcessInternalJoins"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}joinOptionProcessKeys"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}joinOptionProcessMatchingIndexColumns"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}joinOptionProcessMatchingQueryItemNames"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}joinOptionProcessOuterJoinOption"/>
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
@XmlRootElement(name = "TransformRelationship", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class TransformRelationship
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected TransformRelationship.InputParams inputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link TransformRelationship.InputParams }
     *     
     */
    public TransformRelationship.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformRelationship.InputParams }
     *     
     */
    public void setInputParams(TransformRelationship.InputParams value) {
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
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}querySubject" maxOccurs="unbounded"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}joinOptionProcessExternalJoins"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}joinOptionProcessInternalJoins"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}joinOptionProcessKeys"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}joinOptionProcessMatchingIndexColumns"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}joinOptionProcessMatchingQueryItemNames"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}joinOptionProcessOuterJoinOption"/>
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
        "querySubject",
        "joinOptionProcessExternalJoins",
        "joinOptionProcessInternalJoins",
        "joinOptionProcessKeys",
        "joinOptionProcessMatchingIndexColumns",
        "joinOptionProcessMatchingQueryItemNames",
        "joinOptionProcessOuterJoinOption"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected List<String> querySubject;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected boolean joinOptionProcessExternalJoins;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected boolean joinOptionProcessInternalJoins;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected boolean joinOptionProcessKeys;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected boolean joinOptionProcessMatchingIndexColumns;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected boolean joinOptionProcessMatchingQueryItemNames;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected boolean joinOptionProcessOuterJoinOption;

        /**
         * Gets the value of the querySubject property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the querySubject property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQuerySubject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getQuerySubject() {
            if (querySubject == null) {
                querySubject = new ArrayList<String>();
            }
            return this.querySubject;
        }

        /**
         * Gets the value of the joinOptionProcessExternalJoins property.
         * 
         */
        public boolean isJoinOptionProcessExternalJoins() {
            return joinOptionProcessExternalJoins;
        }

        /**
         * Sets the value of the joinOptionProcessExternalJoins property.
         * 
         */
        public void setJoinOptionProcessExternalJoins(boolean value) {
            this.joinOptionProcessExternalJoins = value;
        }

        /**
         * Gets the value of the joinOptionProcessInternalJoins property.
         * 
         */
        public boolean isJoinOptionProcessInternalJoins() {
            return joinOptionProcessInternalJoins;
        }

        /**
         * Sets the value of the joinOptionProcessInternalJoins property.
         * 
         */
        public void setJoinOptionProcessInternalJoins(boolean value) {
            this.joinOptionProcessInternalJoins = value;
        }

        /**
         * Gets the value of the joinOptionProcessKeys property.
         * 
         */
        public boolean isJoinOptionProcessKeys() {
            return joinOptionProcessKeys;
        }

        /**
         * Sets the value of the joinOptionProcessKeys property.
         * 
         */
        public void setJoinOptionProcessKeys(boolean value) {
            this.joinOptionProcessKeys = value;
        }

        /**
         * Gets the value of the joinOptionProcessMatchingIndexColumns property.
         * 
         */
        public boolean isJoinOptionProcessMatchingIndexColumns() {
            return joinOptionProcessMatchingIndexColumns;
        }

        /**
         * Sets the value of the joinOptionProcessMatchingIndexColumns property.
         * 
         */
        public void setJoinOptionProcessMatchingIndexColumns(boolean value) {
            this.joinOptionProcessMatchingIndexColumns = value;
        }

        /**
         * Gets the value of the joinOptionProcessMatchingQueryItemNames property.
         * 
         */
        public boolean isJoinOptionProcessMatchingQueryItemNames() {
            return joinOptionProcessMatchingQueryItemNames;
        }

        /**
         * Sets the value of the joinOptionProcessMatchingQueryItemNames property.
         * 
         */
        public void setJoinOptionProcessMatchingQueryItemNames(boolean value) {
            this.joinOptionProcessMatchingQueryItemNames = value;
        }

        /**
         * Gets the value of the joinOptionProcessOuterJoinOption property.
         * 
         */
        public boolean isJoinOptionProcessOuterJoinOption() {
            return joinOptionProcessOuterJoinOption;
        }

        /**
         * Sets the value of the joinOptionProcessOuterJoinOption property.
         * 
         */
        public void setJoinOptionProcessOuterJoinOption(boolean value) {
            this.joinOptionProcessOuterJoinOption = value;
        }

    }

}
