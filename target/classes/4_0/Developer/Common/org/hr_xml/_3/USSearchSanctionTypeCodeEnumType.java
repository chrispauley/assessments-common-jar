//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.15 at 03:08:51 PM EST 
//


package org.hr_xml._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USSearchSanctionTypeCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="USSearchSanctionTypeCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="FraudAndAbuse"/>
 *     &lt;enumeration value="GSA"/>
 *     &lt;enumeration value="Medicaid"/>
 *     &lt;enumeration value="OFAC"/>
 *     &lt;enumeration value="OIG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "USSearchSanctionTypeCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum USSearchSanctionTypeCodeEnumType {


    /**
     *  An example of a "Fraud and Abuse" search might be a search of FACIS.com or a similar database.
     * 
     */
    @XmlEnumValue("FraudAndAbuse")
    FRAUD_AND_ABUSE("FraudAndAbuse"),

    /**
     * U.S. General Services Administration
     * 
     */
    GSA("GSA"),

    /**
     * Sanction under U.S. Federal/State Medicaid programs.
     * 
     */
    @XmlEnumValue("Medicaid")
    MEDICAID("Medicaid"),

    /**
     * Office of Foreign Assets Control is an office of the Treasury Department.
     * 
     */
    OFAC("OFAC"),

    /**
     * U.S. Health and Human Services Office of Inspector General
     * 
     */
    OIG("OIG");
    private final String value;

    USSearchSanctionTypeCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static USSearchSanctionTypeCodeEnumType fromValue(String v) {
        for (USSearchSanctionTypeCodeEnumType c: USSearchSanctionTypeCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}