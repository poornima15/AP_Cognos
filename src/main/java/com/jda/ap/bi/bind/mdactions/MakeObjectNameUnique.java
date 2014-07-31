
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
 *                   &lt;element name="objectType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}targetParent"/>
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}newObjectName"/>
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="uniquenessNamingSpecification">
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                             &lt;enumeration value="0"/>
 *                             &lt;enumeration value="1"/>
 *                             &lt;enumeration value="2"/>
 *                             &lt;enumeration value="3"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/element>
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
 *                   &lt;element name="uniqueObjectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlRootElement(name = "MakeObjectNameUnique", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class MakeObjectNameUnique
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected MakeObjectNameUnique.InputParams inputParams;
    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
    protected MakeObjectNameUnique.OutputParams outputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link MakeObjectNameUnique.InputParams }
     *     
     */
    public MakeObjectNameUnique.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link MakeObjectNameUnique.InputParams }
     *     
     */
    public void setInputParams(MakeObjectNameUnique.InputParams value) {
        this.inputParams = value;
    }

    /**
     * Gets the value of the outputParams property.
     * 
     * @return
     *     possible object is
     *     {@link MakeObjectNameUnique.OutputParams }
     *     
     */
    public MakeObjectNameUnique.OutputParams getOutputParams() {
        return outputParams;
    }

    /**
     * Sets the value of the outputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link MakeObjectNameUnique.OutputParams }
     *     
     */
    public void setOutputParams(MakeObjectNameUnique.OutputParams value) {
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
     *         &lt;element name="objectType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}targetParent"/>
     *         &lt;sequence minOccurs="0">
     *           &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}newObjectName"/>
     *           &lt;sequence minOccurs="0">
     *             &lt;element name="uniquenessNamingSpecification">
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                   &lt;enumeration value="0"/>
     *                   &lt;enumeration value="1"/>
     *                   &lt;enumeration value="2"/>
     *                   &lt;enumeration value="3"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/element>
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
        "objectType",
        "targetParent",
        "newObjectName",
        "uniquenessNamingSpecification"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String objectType;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String targetParent;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String newObjectName;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String uniquenessNamingSpecification;

        /**
         * Gets the value of the objectType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjectType() {
            return objectType;
        }

        /**
         * Sets the value of the objectType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjectType(String value) {
            this.objectType = value;
        }

        /**
         * Gets the value of the targetParent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTargetParent() {
            return targetParent;
        }

        /**
         * Sets the value of the targetParent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTargetParent(String value) {
            this.targetParent = value;
        }

        /**
         * Gets the value of the newObjectName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewObjectName() {
            return newObjectName;
        }

        /**
         * Sets the value of the newObjectName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewObjectName(String value) {
            this.newObjectName = value;
        }

        /**
         * Gets the value of the uniquenessNamingSpecification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUniquenessNamingSpecification() {
            return uniquenessNamingSpecification;
        }

        /**
         * Sets the value of the uniquenessNamingSpecification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUniquenessNamingSpecification(String value) {
            this.uniquenessNamingSpecification = value;
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
     *         &lt;element name="uniqueObjectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "uniqueObjectName"
    })
    public static class OutputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String uniqueObjectName;

        /**
         * Gets the value of the uniqueObjectName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUniqueObjectName() {
            return uniqueObjectName;
        }

        /**
         * Sets the value of the uniqueObjectName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUniqueObjectName(String value) {
            this.uniqueObjectName = value;
        }

    }

}
