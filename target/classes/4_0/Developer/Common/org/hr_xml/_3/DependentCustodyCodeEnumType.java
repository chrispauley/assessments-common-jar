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
 * <p>Java class for DependentCustodyCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DependentCustodyCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="BothParents"/>
 *     &lt;enumeration value="FormerSpouse"/>
 *     &lt;enumeration value="SubscriberOnly"/>
 *     &lt;enumeration value="OtherOrUnknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DependentCustodyCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum DependentCustodyCodeEnumType {

    @XmlEnumValue("BothParents")
    BOTH_PARENTS("BothParents"),
    @XmlEnumValue("FormerSpouse")
    FORMER_SPOUSE("FormerSpouse"),
    @XmlEnumValue("SubscriberOnly")
    SUBSCRIBER_ONLY("SubscriberOnly"),
    @XmlEnumValue("OtherOrUnknown")
    OTHER_OR_UNKNOWN("OtherOrUnknown");
    private final String value;

    DependentCustodyCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DependentCustodyCodeEnumType fromValue(String v) {
        for (DependentCustodyCodeEnumType c: DependentCustodyCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
