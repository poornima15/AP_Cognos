
package com.jda.ap.bi.bind.mdactions;

import java.util.ArrayList;
import java.util.List;
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
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}querySubjectOrDimension" maxOccurs="unbounded"/>
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="transformType">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                           &lt;enumeration value="0"/>
 *                           &lt;enumeration value="1"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="transformTarget">
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                             &lt;enumeration value="0"/>
 *                             &lt;enumeration value="1"/>
 *                             &lt;enumeration value="2"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/element>
 *                       &lt;sequence minOccurs="0">
 *                         &lt;element name="transformSelection">
 *                           &lt;simpleType>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                               &lt;enumeration value="0"/>
 *                               &lt;enumeration value="1"/>
 *                             &lt;/restriction>
 *                           &lt;/simpleType>
 *                         &lt;/element>
 *                         &lt;sequence minOccurs="0">
 *                           &lt;element name="starSchemaGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                         &lt;/sequence>
 *                       &lt;/sequence>
 *                     &lt;/sequence>
 *                   &lt;/sequence>
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
 *                   &lt;element name="starGroupingResultObject" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle" maxOccurs="unbounded"/>
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
@XmlRootElement(name = "TransformCreateStarGrouping", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class TransformCreateStarGrouping
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected TransformCreateStarGrouping.InputParams inputParams;
    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
    protected TransformCreateStarGrouping.OutputParams outputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link TransformCreateStarGrouping.InputParams }
     *     
     */
    public TransformCreateStarGrouping.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformCreateStarGrouping.InputParams }
     *     
     */
    public void setInputParams(TransformCreateStarGrouping.InputParams value) {
        this.inputParams = value;
    }

    /**
     * Gets the value of the outputParams property.
     * 
     * @return
     *     possible object is
     *     {@link TransformCreateStarGrouping.OutputParams }
     *     
     */
    public TransformCreateStarGrouping.OutputParams getOutputParams() {
        return outputParams;
    }

    /**
     * Sets the value of the outputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformCreateStarGrouping.OutputParams }
     *     
     */
    public void setOutputParams(TransformCreateStarGrouping.OutputParams value) {
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
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}querySubjectOrDimension" maxOccurs="unbounded"/>
     *         &lt;sequence minOccurs="0">
     *           &lt;element name="transformType">
     *             &lt;simpleType>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                 &lt;enumeration value="0"/>
     *                 &lt;enumeration value="1"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/element>
     *           &lt;sequence minOccurs="0">
     *             &lt;element name="transformTarget">
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                   &lt;enumeration value="0"/>
     *                   &lt;enumeration value="1"/>
     *                   &lt;enumeration value="2"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/element>
     *             &lt;sequence minOccurs="0">
     *               &lt;element name="transformSelection">
     *                 &lt;simpleType>
     *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                     &lt;enumeration value="0"/>
     *                     &lt;enumeration value="1"/>
     *                   &lt;/restriction>
     *                 &lt;/simpleType>
     *               &lt;/element>
     *               &lt;sequence minOccurs="0">
     *                 &lt;element name="starSchemaGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *               &lt;/sequence>
     *             &lt;/sequence>
     *           &lt;/sequence>
     *         &lt;/sequence>
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
        "querySubjectOrDimension",
        "transformType",
        "transformTarget",
        "transformSelection",
        "starSchemaGroupName"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected List<String> querySubjectOrDimension;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", defaultValue = "0")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String transformType;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", defaultValue = "1")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String transformTarget;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", defaultValue = "1")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String transformSelection;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String starSchemaGroupName;

        /**
         * Gets the value of the querySubjectOrDimension property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the querySubjectOrDimension property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQuerySubjectOrDimension().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getQuerySubjectOrDimension() {
            if (querySubjectOrDimension == null) {
                querySubjectOrDimension = new ArrayList<String>();
            }
            return this.querySubjectOrDimension;
        }

        /**
         * Gets the value of the transformType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransformType() {
            return transformType;
        }

        /**
         * Sets the value of the transformType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransformType(String value) {
            this.transformType = value;
        }

        /**
         * Gets the value of the transformTarget property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransformTarget() {
            return transformTarget;
        }

        /**
         * Sets the value of the transformTarget property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransformTarget(String value) {
            this.transformTarget = value;
        }

        /**
         * Gets the value of the transformSelection property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransformSelection() {
            return transformSelection;
        }

        /**
         * Sets the value of the transformSelection property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransformSelection(String value) {
            this.transformSelection = value;
        }

        /**
         * Gets the value of the starSchemaGroupName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStarSchemaGroupName() {
            return starSchemaGroupName;
        }

        /**
         * Sets the value of the starSchemaGroupName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStarSchemaGroupName(String value) {
            this.starSchemaGroupName = value;
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
     *         &lt;element name="starGroupingResultObject" type="{http://www.developer.cognos.com/schemas/fmsdk/1/0}objectHandle" maxOccurs="unbounded"/>
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
        "starGroupingResultObject"
    })
    public static class OutputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected List<String> starGroupingResultObject;

        /**
         * Gets the value of the starGroupingResultObject property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the starGroupingResultObject property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStarGroupingResultObject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getStarGroupingResultObject() {
            if (starGroupingResultObject == null) {
                starGroupingResultObject = new ArrayList<String>();
            }
            return this.starGroupingResultObject;
        }

    }

}
