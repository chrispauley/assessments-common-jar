//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.17 at 03:34:39 PM EST 
//


package org.hros.assessments.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This is typically used in pre-provisioning a partner system
 * 				with user
 * 				account information rather than in actual authentication
 * 				processes
 * 				(in which case the appropriate token would typically be
 * 				passed in a
 * 				SOAP security header). Where used, this components
 * 				generally would
 * 				be repeatable to allow for multiple credentials or
 * 				tokens. This also
 * 				would generally be used in a context in which a
 * 				UserID was supplied.
 * 				See UserID-element. See UserAccount-noun.
 * 			
 * 
 * <p>Java class for AccessCredentialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccessCredentialType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessCredentialTypeCode" type="{}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="accessCredentialValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userArea" type="{}UserAreaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessCredentialType", propOrder = {
    "accessCredentialTypeCode",
    "accessCredentialValue",
    "userArea"
})
public class AccessCredentialType {

    protected CodeType accessCredentialTypeCode;
    protected String accessCredentialValue;
    protected UserAreaType userArea;

    /**
     * Gets the value of the accessCredentialTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAccessCredentialTypeCode() {
        return accessCredentialTypeCode;
    }

    /**
     * Sets the value of the accessCredentialTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAccessCredentialTypeCode(CodeType value) {
        this.accessCredentialTypeCode = value;
    }

    /**
     * Gets the value of the accessCredentialValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessCredentialValue() {
        return accessCredentialValue;
    }

    /**
     * Sets the value of the accessCredentialValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessCredentialValue(String value) {
        this.accessCredentialValue = value;
    }

    /**
     * Gets the value of the userArea property.
     * 
     * @return
     *     possible object is
     *     {@link UserAreaType }
     *     
     */
    public UserAreaType getUserArea() {
        return userArea;
    }

    /**
     * Sets the value of the userArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAreaType }
     *     
     */
    public void setUserArea(UserAreaType value) {
        this.userArea = value;
    }

}
