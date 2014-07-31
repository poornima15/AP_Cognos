
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
 *                   &lt;element name="reorderObject" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle" maxOccurs="unbounded"/>
 *                   &lt;element name="reorderBeforeObject" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle"/>
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
@XmlRootElement(name = "ReorderBefore", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class ReorderBefore
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected ReorderBefore.InputParams inputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link ReorderBefore.InputParams }
     *     
     */
    public ReorderBefore.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReorderBefore.InputParams }
     *     
     */
    public void setInputParams(ReorderBefore.InputParams value) {
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
     *         &lt;element name="reorderObject" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle" maxOccurs="unbounded"/>
     *         &lt;element name="reorderBeforeObject" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle"/>
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
        "reorderObject",
        "reorderBeforeObject"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected List<String> reorderObject;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String reorderBeforeObject;

        /**
         * Gets the value of the reorderObject property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reorderObject property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReorderObject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getReorderObject() {
            if (reorderObject == null) {
                reorderObject = new ArrayList<String>();
            }
            return this.reorderObject;
        }

        /**
         * Gets the value of the reorderBeforeObject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReorderBeforeObject() {
            return reorderBeforeObject;
        }

        /**
         * Sets the value of the reorderBeforeObject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReorderBeforeObject(String value) {
            this.reorderBeforeObject = value;
        }

    }

}
