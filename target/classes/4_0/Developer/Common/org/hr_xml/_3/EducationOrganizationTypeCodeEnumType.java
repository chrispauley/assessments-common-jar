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
 * <p>Java class for EducationOrganizationTypeCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EducationOrganizationTypeCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Department"/>
 *     &lt;enumeration value="SubSchool"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EducationOrganizationTypeCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum EducationOrganizationTypeCodeEnumType {

    @XmlEnumValue("Department")
    DEPARTMENT("Department"),
    @XmlEnumValue("SubSchool")
    SUB_SCHOOL("SubSchool");
    private final String value;

    EducationOrganizationTypeCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EducationOrganizationTypeCodeEnumType fromValue(String v) {
        for (EducationOrganizationTypeCodeEnumType c: EducationOrganizationTypeCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
