//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.15 at 03:07:29 PM EST 
//


package org.hr_xml._3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for BonusPercentageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BonusPercentageType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.openapplications.org/oagis/9>PercentType">
 *       &lt;attribute name="basisID" type="{http://www.openapplications.org/oagis/9}StringType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BonusPercentageType", propOrder = {
    "value"
})
public class BonusPercentageType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute
    protected String basisID;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the basisID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasisID() {
        return basisID;
    }

    /**
     * Sets the value of the basisID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasisID(String value) {
        this.basisID = value;
    }

}
