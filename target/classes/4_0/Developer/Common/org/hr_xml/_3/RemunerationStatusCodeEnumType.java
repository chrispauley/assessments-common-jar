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
 * <p>Java class for RemunerationStatusCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RemunerationStatusCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Paid"/>
 *     &lt;enumeration value="Unpaid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RemunerationStatusCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum RemunerationStatusCodeEnumType {

    @XmlEnumValue("Paid")
    PAID("Paid"),
    @XmlEnumValue("Unpaid")
    UNPAID("Unpaid");
    private final String value;

    RemunerationStatusCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RemunerationStatusCodeEnumType fromValue(String v) {
        for (RemunerationStatusCodeEnumType c: RemunerationStatusCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
