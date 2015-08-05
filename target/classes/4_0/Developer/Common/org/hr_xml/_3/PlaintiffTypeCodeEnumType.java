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
 * <p>Java class for PlaintiffTypeCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlaintiffTypeCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Primary"/>
 *     &lt;enumeration value="Additional"/>
 *     &lt;enumeration value="Corporate"/>
 *     &lt;enumeration value="CrossParty"/>
 *     &lt;enumeration value="CounterParty"/>
 *     &lt;enumeration value="ThirdParty"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PlaintiffTypeCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum PlaintiffTypeCodeEnumType {

    @XmlEnumValue("Primary")
    PRIMARY("Primary"),
    @XmlEnumValue("Additional")
    ADDITIONAL("Additional"),
    @XmlEnumValue("Corporate")
    CORPORATE("Corporate"),
    @XmlEnumValue("CrossParty")
    CROSS_PARTY("CrossParty"),
    @XmlEnumValue("CounterParty")
    COUNTER_PARTY("CounterParty"),
    @XmlEnumValue("ThirdParty")
    THIRD_PARTY("ThirdParty");
    private final String value;

    PlaintiffTypeCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlaintiffTypeCodeEnumType fromValue(String v) {
        for (PlaintiffTypeCodeEnumType c: PlaintiffTypeCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
