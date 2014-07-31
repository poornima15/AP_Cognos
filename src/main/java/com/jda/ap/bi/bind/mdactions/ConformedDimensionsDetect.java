
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
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}targetDimension"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}conformedDimensionCandidate" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="outputParams" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}conformedDimensionCandidate" maxOccurs="unbounded" minOccurs="0"/>
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
    "inputParams",
    "outputParams"
})
@XmlRootElement(name = "ConformedDimensionsDetect", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class ConformedDimensionsDetect
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected ConformedDimensionsDetect.InputParams inputParams;
    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
    protected ConformedDimensionsDetect.OutputParams outputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link ConformedDimensionsDetect.InputParams }
     *     
     */
    public ConformedDimensionsDetect.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConformedDimensionsDetect.InputParams }
     *     
     */
    public void setInputParams(ConformedDimensionsDetect.InputParams value) {
        this.inputParams = value;
    }

    /**
     * Gets the value of the outputParams property.
     * 
     * @return
     *     possible object is
     *     {@link ConformedDimensionsDetect.OutputParams }
     *     
     */
    public ConformedDimensionsDetect.OutputParams getOutputParams() {
        return outputParams;
    }

    /**
     * Sets the value of the outputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConformedDimensionsDetect.OutputParams }
     *     
     */
    public void setOutputParams(ConformedDimensionsDetect.OutputParams value) {
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
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}targetDimension"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}conformedDimensionCandidate" maxOccurs="unbounded"/>
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
        "targetDimension",
        "conformedDimensionCandidate"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String targetDimension;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected List<String> conformedDimensionCandidate;

        /**
         * Gets the value of the targetDimension property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTargetDimension() {
            return targetDimension;
        }

        /**
         * Sets the value of the targetDimension property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTargetDimension(String value) {
            this.targetDimension = value;
        }

        /**
         * Gets the value of the conformedDimensionCandidate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conformedDimensionCandidate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConformedDimensionCandidate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getConformedDimensionCandidate() {
            if (conformedDimensionCandidate == null) {
                conformedDimensionCandidate = new ArrayList<String>();
            }
            return this.conformedDimensionCandidate;
        }

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
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}conformedDimensionCandidate" maxOccurs="unbounded" minOccurs="0"/>
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
        "conformedDimensionCandidate"
    })
    public static class OutputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected List<String> conformedDimensionCandidate;

        /**
         * Gets the value of the conformedDimensionCandidate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conformedDimensionCandidate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConformedDimensionCandidate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getConformedDimensionCandidate() {
            if (conformedDimensionCandidate == null) {
                conformedDimensionCandidate = new ArrayList<String>();
            }
            return this.conformedDimensionCandidate;
        }

    }

}
