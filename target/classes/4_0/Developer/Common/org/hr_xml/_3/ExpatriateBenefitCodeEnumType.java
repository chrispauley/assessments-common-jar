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
 * <p>Java class for ExpatriateBenefitCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExpatriateBenefitCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="RelocationPackage"/>
 *     &lt;enumeration value="SchoolFees"/>
 *     &lt;enumeration value="Vehicle"/>
 *     &lt;enumeration value="ProfessionalServiceFees"/>
 *     &lt;enumeration value="LanguageInstruction"/>
 *     &lt;enumeration value="ClubMembership"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExpatriateBenefitCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum ExpatriateBenefitCodeEnumType {

    @XmlEnumValue("RelocationPackage")
    RELOCATION_PACKAGE("RelocationPackage"),
    @XmlEnumValue("SchoolFees")
    SCHOOL_FEES("SchoolFees"),
    @XmlEnumValue("Vehicle")
    VEHICLE("Vehicle"),
    @XmlEnumValue("ProfessionalServiceFees")
    PROFESSIONAL_SERVICE_FEES("ProfessionalServiceFees"),
    @XmlEnumValue("LanguageInstruction")
    LANGUAGE_INSTRUCTION("LanguageInstruction"),
    @XmlEnumValue("ClubMembership")
    CLUB_MEMBERSHIP("ClubMembership");
    private final String value;

    ExpatriateBenefitCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExpatriateBenefitCodeEnumType fromValue(String v) {
        for (ExpatriateBenefitCodeEnumType c: ExpatriateBenefitCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
