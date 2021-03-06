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
 * <p>Java class for RefereeTypeCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RefereeTypeCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Professional"/>
 *     &lt;enumeration value="Personal"/>
 *     &lt;enumeration value="Verification"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RefereeTypeCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum RefereeTypeCodeEnumType {


    /**
     * A professional reference which might include managers, co-workers, subordinates, professors, etc
     * 
     */
    @XmlEnumValue("Professional")
    PROFESSIONAL("Professional"),

    /**
     * A personal reference which typically includes friends and family.
     * 
     */
    @XmlEnumValue("Personal")
    PERSONAL("Personal"),

    /**
     * This reference would be used to verify employment. It might include the HR department, managers, staffing agencies, etc.
     * 
     */
    @XmlEnumValue("Verification")
    VERIFICATION("Verification");
    private final String value;

    RefereeTypeCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefereeTypeCodeEnumType fromValue(String v) {
        for (RefereeTypeCodeEnumType c: RefereeTypeCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
