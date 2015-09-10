//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.10 at 01:41:03 PM EDT 
//


package org.hros.assessments.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChannelCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChannelCodeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="Telephone"/&gt;
 *     &lt;enumeration value="MobileTelephone"/&gt;
 *     &lt;enumeration value="Fax"/&gt;
 *     &lt;enumeration value="Email"/&gt;
 *     &lt;enumeration value="InstantMessage"/&gt;
 *     &lt;enumeration value="Web"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChannelCodeEnumType")
@XmlEnum
public enum ChannelCodeEnumType {

    @XmlEnumValue("Telephone")
    TELEPHONE("Telephone"),
    @XmlEnumValue("MobileTelephone")
    MOBILE_TELEPHONE("MobileTelephone"),
    @XmlEnumValue("Fax")
    FAX("Fax"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("InstantMessage")
    INSTANT_MESSAGE("InstantMessage"),
    @XmlEnumValue("Web")
    WEB("Web");
    private final String value;

    ChannelCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChannelCodeEnumType fromValue(String v) {
        for (ChannelCodeEnumType c: ChannelCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}