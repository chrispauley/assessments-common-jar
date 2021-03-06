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
 * <p>Java class for ScreeningSubjectTypeCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScreeningSubjectTypeCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Alias"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Current"/>
 *     &lt;enumeration value="Prior"/>
 *     &lt;enumeration value="NotSpecified"/>
 *     &lt;enumeration value="Vendor"/>
 *     &lt;enumeration value="DoingBusinessAs"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScreeningSubjectTypeCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum ScreeningSubjectTypeCodeEnumType {

    @XmlEnumValue("Alias")
    ALIAS("Alias"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Current")
    CURRENT("Current"),
    @XmlEnumValue("Prior")
    PRIOR("Prior"),
    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified"),
    @XmlEnumValue("Vendor")
    VENDOR("Vendor"),

    /**
     * Added 2011-04-27 by Screenings Work group. Used for Organizational screenings.
     * 
     */
    @XmlEnumValue("DoingBusinessAs")
    DOING_BUSINESS_AS("DoingBusinessAs");
    private final String value;

    ScreeningSubjectTypeCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScreeningSubjectTypeCodeEnumType fromValue(String v) {
        for (ScreeningSubjectTypeCodeEnumType c: ScreeningSubjectTypeCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
