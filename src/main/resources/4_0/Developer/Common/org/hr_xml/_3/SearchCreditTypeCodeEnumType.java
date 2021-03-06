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
 * <p>Java class for SearchCreditTypeCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchCreditTypeCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="Summary"/>
 *     &lt;enumeration value="Merged"/>
 *     &lt;enumeration value="Business"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchCreditTypeCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum SearchCreditTypeCodeEnumType {

    @XmlEnumValue("Full")
    FULL("Full"),

    /**
     * In U.S. equivalent to "SSN Trace" or "Credit Record Header" searches.
     * 
     */
    @XmlEnumValue("Summary")
    SUMMARY("Summary"),
    @XmlEnumValue("Merged")
    MERGED("Merged"),
    @XmlEnumValue("Business")
    BUSINESS("Business");
    private final String value;

    SearchCreditTypeCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchCreditTypeCodeEnumType fromValue(String v) {
        for (SearchCreditTypeCodeEnumType c: SearchCreditTypeCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
