
package com.jda.ap.bi.bind.credentials;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jda.ap.bi.bind.credentials package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jda.ap.bi.bind.credentials
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link Credentials.Parameter }
     * 
     */
    public Credentials.Parameter createCredentialsParameter() {
        return new Credentials.Parameter();
    }

    /**
     * Create an instance of {@link SecurityObjectType }
     * 
     */
    public SecurityObjectType createSecurityObjectType() {
        return new SecurityObjectType();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }


}
