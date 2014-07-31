
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
 *                   &lt;element name="joinOptionProcessInternalOrExternalJoins">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         &lt;enumeration value="0"/>
 *                         &lt;enumeration value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}joinOptionProcessOuterJoinOption"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}dataSource"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}querySubject" maxOccurs="unbounded"/>
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
@XmlRootElement(name = "DBImportJoinsOnKeys", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class DBImportJoinsOnKeys
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected DBImportJoinsOnKeys.InputParams inputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link DBImportJoinsOnKeys.InputParams }
     *     
     */
    public DBImportJoinsOnKeys.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link DBImportJoinsOnKeys.InputParams }
     *     
     */
    public void setInputParams(DBImportJoinsOnKeys.InputParams value) {
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
     *         &lt;element name="joinOptionProcessInternalOrExternalJoins">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               &lt;enumeration value="0"/>
     *               &lt;enumeration value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}joinOptionProcessOuterJoinOption"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}dataSource"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}querySubject" maxOccurs="unbounded"/>
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
        "joinOptionProcessInternalOrExternalJoins",
        "joinOptionProcessOuterJoinOption",
        "dataSource",
        "querySubject"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String joinOptionProcessInternalOrExternalJoins;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected boolean joinOptionProcessOuterJoinOption;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String dataSource;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected List<String> querySubject;

        /**
         * Gets the value of the joinOptionProcessInternalOrExternalJoins property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJoinOptionProcessInternalOrExternalJoins() {
            return joinOptionProcessInternalOrExternalJoins;
        }

        /**
         * Sets the value of the joinOptionProcessInternalOrExternalJoins property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJoinOptionProcessInternalOrExternalJoins(String value) {
            this.joinOptionProcessInternalOrExternalJoins = value;
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

        /**
         * Gets the value of the dataSource property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataSource() {
            return dataSource;
        }

        /**
         * Sets the value of the dataSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataSource(String value) {
            this.dataSource = value;
        }

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

    }

}
