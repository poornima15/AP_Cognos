
package com.jda.ap.bi.bind.mdactions;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}parameterName"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}parameterValue"/>
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
@XmlRootElement(name = "SetRuntimeParameters", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class SetRuntimeParameters
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected SetRuntimeParameters.InputParams inputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link SetRuntimeParameters.InputParams }
     *     
     */
    public SetRuntimeParameters.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetRuntimeParameters.InputParams }
     *     
     */
    public void setInputParams(SetRuntimeParameters.InputParams value) {
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}parameterName"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}parameterValue"/>
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
        "parameterNameAndParameterValue"
    })
    public static class InputParams {

        @XmlElementRefs({
            @XmlElementRef(name = "parameterValue", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "parameterName", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<String>> parameterNameAndParameterValue;

        /**
         * Gets the value of the parameterNameAndParameterValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parameterNameAndParameterValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParameterNameAndParameterValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * 
         * 
         */
        public List<JAXBElement<String>> getParameterNameAndParameterValue() {
            if (parameterNameAndParameterValue == null) {
                parameterNameAndParameterValue = new ArrayList<JAXBElement<String>>();
            }
            return this.parameterNameAndParameterValue;
        }

    }

}
