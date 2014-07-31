
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
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}targetContainer"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}importSourceSpecDataSource"/>
 *                   &lt;choice>
 *                     &lt;group ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}dbImportInputParametersRelational"/>
 *                     &lt;group ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}dbImportInputParametersSAPBW"/>
 *                   &lt;/choice>
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
@XmlRootElement(name = "DBImport", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class DBImport
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected DBImport.InputParams inputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link DBImport.InputParams }
     *     
     */
    public DBImport.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link DBImport.InputParams }
     *     
     */
    public void setInputParams(DBImport.InputParams value) {
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
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}targetContainer"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}importSourceSpecDataSource"/>
     *         &lt;choice>
     *           &lt;group ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}dbImportInputParametersRelational"/>
     *           &lt;group ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}dbImportInputParametersSAPBW"/>
     *         &lt;/choice>
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
        "content"
    })
    public static class InputParams {

        @XmlElementRefs({
            @XmlElementRef(name = "joinOptionProcessKeys", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "joinOptionProcessExternalJoins", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "displaySummaryMessageOption", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "sapbwImportOptionCreateConformedDimensions", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "targetContainer", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "joinOptionProcessInternalJoins", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "sapbwImportLocales", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "sapbwImportOptionObjectOrganization", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "joinOptionProcessMatchingIndexColumns", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "sapbwImportOptionUseOrLongNames", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "joinOptionProcessMatchingQueryItemNames", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "nameConflictOptionImport", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "storedProcedureOptionThrowExceptionOption", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "joinOptionProcessOuterJoinOption", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "importSourceSpecDataSource", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<?>> content;

        /**
         * Gets the rest of the content model. 
         * 
         * <p>
         * You are getting this "catch-all" property because of the following reason: 
         * The field name "NameConflictOptionImport" is used by two different parts of a schema. See: 
         * line 292 of file:/D:/github/AP_Cognos/config/cognos/mdActions.xsd
         * line 215 of file:/D:/github/AP_Cognos/config/cognos/mdActions.xsd
         * <p>
         * To get rid of this property, apply a property customization to one 
         * of both of the following declarations to change their names: 
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         * {@link JAXBElement }{@code <}{@link Object }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         * {@link JAXBElement }{@code <}{@link OptionalLocaleCollection }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * 
         * 
         */
        public List<JAXBElement<?>> getContent() {
            if (content == null) {
                content = new ArrayList<JAXBElement<?>>();
            }
            return this.content;
        }

    }

}
