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
 * <p>Java class for EmploymentTermCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmploymentTermCodeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.hr-xml.org/3>EmploymentTermCodeEnumType">
 *       &lt;attribute name="seasonalIndicator" type="{http://www.openapplications.org/oagis/9}IndicatorType" />
 *       &lt;attribute name="internshipIndicator" type="{http://www.openapplications.org/oagis/9}IndicatorType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmploymentTermCodeType", propOrder = {
    "value"
})
public class EmploymentTermCodeType {

    @XmlValue
    protected EmploymentTermCodeEnumType value;
    @XmlAttribute
    protected Boolean seasonalIndicator;
    @XmlAttribute
    protected Boolean internshipIndicator;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentTermCodeEnumType }
     *     
     */
    public EmploymentTermCodeEnumType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentTermCodeEnumType }
     *     
     */
    public void setValue(EmploymentTermCodeEnumType value) {
        this.value = value;
    }

    /**
     * Gets the value of the seasonalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeasonalIndicator() {
        return seasonalIndicator;
    }

    /**
     * Sets the value of the seasonalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeasonalIndicator(Boolean value) {
        this.seasonalIndicator = value;
    }

    /**
     * Gets the value of the internshipIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInternshipIndicator() {
        return internshipIndicator;
    }

    /**
     * Sets the value of the internshipIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInternshipIndicator(Boolean value) {
        this.internshipIndicator = value;
    }

}
