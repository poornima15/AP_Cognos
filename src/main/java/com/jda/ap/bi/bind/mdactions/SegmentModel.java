
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
 *                   &lt;element name="segmentObject" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle"/>
 *                   &lt;element name="segmentTargetModelPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="sourceControlRepositoryPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "SegmentModel", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class SegmentModel
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected SegmentModel.InputParams inputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentModel.InputParams }
     *     
     */
    public SegmentModel.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentModel.InputParams }
     *     
     */
    public void setInputParams(SegmentModel.InputParams value) {
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
     *         &lt;element name="segmentObject" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle"/>
     *         &lt;element name="segmentTargetModelPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="sourceControlRepositoryPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "segmentObject",
        "segmentTargetModelPath",
        "sourceControlRepositoryPath"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String segmentObject;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String segmentTargetModelPath;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String sourceControlRepositoryPath;

        /**
         * Gets the value of the segmentObject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSegmentObject() {
            return segmentObject;
        }

        /**
         * Sets the value of the segmentObject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSegmentObject(String value) {
            this.segmentObject = value;
        }

        /**
         * Gets the value of the segmentTargetModelPath property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSegmentTargetModelPath() {
            return segmentTargetModelPath;
        }

        /**
         * Sets the value of the segmentTargetModelPath property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSegmentTargetModelPath(String value) {
            this.segmentTargetModelPath = value;
        }

        /**
         * Gets the value of the sourceControlRepositoryPath property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceControlRepositoryPath() {
            return sourceControlRepositoryPath;
        }

        /**
         * Sets the value of the sourceControlRepositoryPath property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceControlRepositoryPath(String value) {
            this.sourceControlRepositoryPath = value;
        }

    }

}
