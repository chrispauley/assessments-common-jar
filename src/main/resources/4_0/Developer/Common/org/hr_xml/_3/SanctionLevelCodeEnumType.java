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
 * <p>Java class for SanctionLevelCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SanctionLevelCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Level 1 Individual"/>
 *     &lt;enumeration value="Level 2 Individual"/>
 *     &lt;enumeration value="Level 3 Individual"/>
 *     &lt;enumeration value="Level 1 Organization"/>
 *     &lt;enumeration value="Level 2 Organization"/>
 *     &lt;enumeration value="Level 3 Organization"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SanctionLevelCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum SanctionLevelCodeEnumType {

    @XmlEnumValue("Level 1 Individual")
    LEVEL_1_INDIVIDUAL("Level 1 Individual"),
    @XmlEnumValue("Level 2 Individual")
    LEVEL_2_INDIVIDUAL("Level 2 Individual"),
    @XmlEnumValue("Level 3 Individual")
    LEVEL_3_INDIVIDUAL("Level 3 Individual"),
    @XmlEnumValue("Level 1 Organization")
    LEVEL_1_ORGANIZATION("Level 1 Organization"),
    @XmlEnumValue("Level 2 Organization")
    LEVEL_2_ORGANIZATION("Level 2 Organization"),
    @XmlEnumValue("Level 3 Organization")
    LEVEL_3_ORGANIZATION("Level 3 Organization");
    private final String value;

    SanctionLevelCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SanctionLevelCodeEnumType fromValue(String v) {
        for (SanctionLevelCodeEnumType c: SanctionLevelCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
