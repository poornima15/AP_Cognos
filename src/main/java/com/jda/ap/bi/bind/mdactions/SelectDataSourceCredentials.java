
package com.jda.ap.bi.bind.mdactions;

import java.math.BigInteger;
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
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceName"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceConnectionName"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceConnectionSignonUser"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceConnectionSignonPassword"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceConnectionCubePassword" minOccurs="0"/>
 *                   &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceConnectionCubePasswordEncrypted" minOccurs="0"/>
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
@XmlRootElement(name = "SelectDataSourceCredentials", namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
public class SelectDataSourceCredentials
    extends Action
{

    @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
    protected SelectDataSourceCredentials.InputParams inputParams;

    /**
     * Gets the value of the inputParams property.
     * 
     * @return
     *     possible object is
     *     {@link SelectDataSourceCredentials.InputParams }
     *     
     */
    public SelectDataSourceCredentials.InputParams getInputParams() {
        return inputParams;
    }

    /**
     * Sets the value of the inputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectDataSourceCredentials.InputParams }
     *     
     */
    public void setInputParams(SelectDataSourceCredentials.InputParams value) {
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
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceName"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceConnectionName"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceConnectionSignonUser"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceConnectionSignonPassword"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceConnectionCubePassword" minOccurs="0"/>
     *         &lt;element ref="{http://www.developer.cognos.com/schemas/fmsdk/1/0}crnDataSourceConnectionCubePasswordEncrypted" minOccurs="0"/>
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
        "crnDataSourceName",
        "crnDataSourceConnectionName",
        "crnDataSourceConnectionSignonUser",
        "crnDataSourceConnectionSignonPassword",
        "crnDataSourceConnectionCubePassword",
        "crnDataSourceConnectionCubePasswordEncrypted"
    })
    public static class InputParams {

        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String crnDataSourceName;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String crnDataSourceConnectionName;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String crnDataSourceConnectionSignonUser;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0", required = true)
        protected String crnDataSourceConnectionSignonPassword;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected String crnDataSourceConnectionCubePassword;
        @XmlElement(namespace = "http://www.developer.cognos.com/schemas/fmsdk/1/0")
        protected BigInteger crnDataSourceConnectionCubePasswordEncrypted;

        /**
         * Gets the value of the crnDataSourceName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCrnDataSourceName() {
            return crnDataSourceName;
        }

        /**
         * Sets the value of the crnDataSourceName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCrnDataSourceName(String value) {
            this.crnDataSourceName = value;
        }

        /**
         * Gets the value of the crnDataSourceConnectionName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCrnDataSourceConnectionName() {
            return crnDataSourceConnectionName;
        }

        /**
         * Sets the value of the crnDataSourceConnectionName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCrnDataSourceConnectionName(String value) {
            this.crnDataSourceConnectionName = value;
        }

        /**
         * Gets the value of the crnDataSourceConnectionSignonUser property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCrnDataSourceConnectionSignonUser() {
            return crnDataSourceConnectionSignonUser;
        }

        /**
         * Sets the value of the crnDataSourceConnectionSignonUser property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCrnDataSourceConnectionSignonUser(String value) {
            this.crnDataSourceConnectionSignonUser = value;
        }

        /**
         * Gets the value of the crnDataSourceConnectionSignonPassword property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCrnDataSourceConnectionSignonPassword() {
            return crnDataSourceConnectionSignonPassword;
        }

        /**
         * Sets the value of the crnDataSourceConnectionSignonPassword property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCrnDataSourceConnectionSignonPassword(String value) {
            this.crnDataSourceConnectionSignonPassword = value;
        }

        /**
         * Gets the value of the crnDataSourceConnectionCubePassword property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCrnDataSourceConnectionCubePassword() {
            return crnDataSourceConnectionCubePassword;
        }

        /**
         * Sets the value of the crnDataSourceConnectionCubePassword property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCrnDataSourceConnectionCubePassword(String value) {
            this.crnDataSourceConnectionCubePassword = value;
        }

        /**
         * Gets the value of the crnDataSourceConnectionCubePasswordEncrypted property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCrnDataSourceConnectionCubePasswordEncrypted() {
            return crnDataSourceConnectionCubePasswordEncrypted;
        }

        /**
         * Sets the value of the crnDataSourceConnectionCubePasswordEncrypted property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCrnDataSourceConnectionCubePasswordEncrypted(BigInteger value) {
            this.crnDataSourceConnectionCubePasswordEncrypted = value;
        }

    }

}
