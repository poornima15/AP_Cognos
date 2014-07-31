
package com.jda.ap.bi.bind.mdactions;

import java.math.BigInteger;
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
 *                 &lt;choice>
 *                   &lt;sequence>
 *                     &lt;element name="verifyCreateID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *                     &lt;group ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}inputParamsCreate"/>
 *                   &lt;/sequence>
 *                   &lt;sequence>
 *                     &lt;element name="verifyDeleteID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *                     &lt;group ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}inputParamsDelete"/>
 *                   &lt;/sequence>
 *                   &lt;sequence>
 *                     &lt;element name="verifyModifyID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *                     &lt;group ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}inputParamsModify"/>
 *                   &lt;/sequence>
 *                   &lt;sequence>
 *                     &lt;element name="verifyMoveID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *                     &lt;group ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}inputParamsMove"/>
 *                   &lt;/sequence>
 *                   &lt;sequence>
 *                     &lt;element name="verifyPublishID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *                     &lt;group ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}inputParamsPublish"/>
 *                   &lt;/sequence>
 *                   &lt;sequence>
 *                     &lt;element name="verifyImportTranslationsID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *                     &lt;group ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}inputParamsImportTranslations"/>
 *                   &lt;/sequence>
 *                 &lt;/choice>
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
@XmlRootElement(name = "Verify", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class Verify
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected Verify.InputParams inputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link Verify.InputParams }
     *     
     */
    public Verify.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Verify.InputParams }
     *     
     */
    public void setInputParams(Verify.InputParams value) {
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
     *       &lt;choice>
     *         &lt;sequence>
     *           &lt;element name="verifyCreateID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
     *           &lt;group ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}inputParamsCreate"/>
     *         &lt;/sequence>
     *         &lt;sequence>
     *           &lt;element name="verifyDeleteID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
     *           &lt;group ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}inputParamsDelete"/>
     *         &lt;/sequence>
     *         &lt;sequence>
     *           &lt;element name="verifyModifyID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
     *           &lt;group ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}inputParamsModify"/>
     *         &lt;/sequence>
     *         &lt;sequence>
     *           &lt;element name="verifyMoveID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
     *           &lt;group ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}inputParamsMove"/>
     *         &lt;/sequence>
     *         &lt;sequence>
     *           &lt;element name="verifyPublishID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
     *           &lt;group ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}inputParamsPublish"/>
     *         &lt;/sequence>
     *         &lt;sequence>
     *           &lt;element name="verifyImportTranslationsID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
     *           &lt;group ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}inputParamsImportTranslations"/>
     *         &lt;/sequence>
     *       &lt;/choice>
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
            @XmlElementRef(name = "selectedObjectsProcessingLevel", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "targetPackageName", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "newObjectName", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "verifyMoveID", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "deleteObject", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "moveObject", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "keyLocale", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "newSimpleValue", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "publishTargetType", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "verifyCreateID", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "verifyImportTranslationsID", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "verifyPublishID", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "targetLocation", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "externalizeQuerySubjects", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "nameConflictOptionCreate", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "permanentRetentionValue", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "deleteProperty", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "temporaryRetentionValue", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "simpleProperty", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "verifyModifyID", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "externalizeRootDirectory", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "importTranslationsRootObject", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "applyLocales", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "verifyDeleteID", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "packageExists", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "regularPackage", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "objectType", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "translationsFilePath", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "targetParent", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<?>> content;

        /**
         * Gets the rest of the content model. 
         * 
         * <p>
         * You are getting this "catch-all" property because of the following reason: 
         * The field name "TargetParent" is used by two different parts of a schema. See: 
         * line 523 of file:/D:/github/AP_Cognos/config/cognos/mdActions.xsd
         * line 439 of file:/D:/github/AP_Cognos/config/cognos/mdActions.xsd
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
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link SimplePropertyValue }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link Object }{@code >}
         * {@link JAXBElement }{@code <}{@link LocaleCollection }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
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
