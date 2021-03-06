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
 * <p>Java class for MedicareEntitlementReasonCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MedicareEntitlementReasonCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Age"/>
 *     &lt;enumeration value="ESRD"/>
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="WorkingDisabled"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MedicareEntitlementReasonCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum MedicareEntitlementReasonCodeEnumType {

    @XmlEnumValue("Age")
    AGE("Age"),

    /**
     * ESRD (end-stage renal disease). An type of entitlement under Medicare for persons with permanent kidney failure. That stage of renal impairment that appears irreversible and permanent, and requires a regular course of dialysis or kidney transplantation to maintain life.
     * 
     */
    ESRD("ESRD"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("WorkingDisabled")
    WORKING_DISABLED("WorkingDisabled"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    MedicareEntitlementReasonCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MedicareEntitlementReasonCodeEnumType fromValue(String v) {
        for (MedicareEntitlementReasonCodeEnumType c: MedicareEntitlementReasonCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
