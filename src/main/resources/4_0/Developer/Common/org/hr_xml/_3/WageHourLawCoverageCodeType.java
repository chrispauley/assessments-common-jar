//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.15 at 03:07:29 PM EST 
//


package org.hr_xml._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for WageHourLawCoverageCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WageHourLawCoverageCodeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.hr-xml.org/3>WageHourCoverageEnumType">
 *       &lt;attribute name="typeCode" type="{http://www.openapplications.org/oagis/9}StringType" />
 *       &lt;attribute name="countryCode" type="{http://www.hr-xml.org/3}CountryCodeContentType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WageHourLawCoverageCodeType", propOrder = {
    "value"
})
public class WageHourLawCoverageCodeType {

    @XmlValue
    protected WageHourCoverageEnumType value;
    @XmlAttribute
    protected String typeCode;
    @XmlAttribute
    protected String countryCode;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link WageHourCoverageEnumType }
     *     
     */
    public WageHourCoverageEnumType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link WageHourCoverageEnumType }
     *     
     */
    public void setValue(WageHourCoverageEnumType value) {
        this.value = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

}
