//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.12 at 01:46:54 PM EDT 
//


package org.hros.assessments.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Allows any digital Signatures to be added to the Instance of the BOD Instance in order to sign for any portion of the BOD content.
 * 
 * <p>Java class for SignatureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignatureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;any minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="qualifyingAgencyId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureType", propOrder = {
    "any"
})
public class SignatureType {

    @XmlAnyElement(lax = true)
    protected Object any;
    @XmlAttribute(name = "qualifyingAgencyId")
    protected String qualifyingAgencyId;

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

    /**
     * Gets the value of the qualifyingAgencyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifyingAgencyId() {
        return qualifyingAgencyId;
    }

    /**
     * Sets the value of the qualifyingAgencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifyingAgencyId(String value) {
        this.qualifyingAgencyId = value;
    }

}
