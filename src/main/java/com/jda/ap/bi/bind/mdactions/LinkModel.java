
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
 *                   &lt;element name="linkParent" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="targetModelConnection" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="linkObjectPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="persistLink">
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
@XmlRootElement(name = "LinkModel", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class LinkModel
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected LinkModel.InputParams inputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link LinkModel.InputParams }
     *     
     */
    public LinkModel.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkModel.InputParams }
     *     
     */
    public void setInputParams(LinkModel.InputParams value) {
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
     *         &lt;element name="linkParent" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="targetModelConnection" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="linkObjectPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="persistLink">
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
        "linkParent",
        "targetModelConnection",
        "linkObjectPath",
        "persistLink"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected Object linkParent;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String targetModelConnection;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String linkObjectPath;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String persistLink;

        /**
         * Gets the value of the linkParent property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getLinkParent() {
            return linkParent;
        }

        /**
         * Sets the value of the linkParent property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setLinkParent(Object value) {
            this.linkParent = value;
        }

        /**
         * Gets the value of the targetModelConnection property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTargetModelConnection() {
            return targetModelConnection;
        }

        /**
         * Sets the value of the targetModelConnection property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTargetModelConnection(String value) {
            this.targetModelConnection = value;
        }

        /**
         * Gets the value of the linkObjectPath property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLinkObjectPath() {
            return linkObjectPath;
        }

        /**
         * Sets the value of the linkObjectPath property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLinkObjectPath(String value) {
            this.linkObjectPath = value;
        }

        /**
         * Gets the value of the persistLink property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPersistLink() {
            return persistLink;
        }

        /**
         * Sets the value of the persistLink property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPersistLink(String value) {
            this.persistLink = value;
        }

    }

}
