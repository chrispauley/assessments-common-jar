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
 * <p>Java class for SearchFeeCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchFeeCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="General"/>
 *     &lt;enumeration value="Clear"/>
 *     &lt;enumeration value="Hit"/>
 *     &lt;enumeration value="CourtFee"/>
 *     &lt;enumeration value="DocumentRetrieval"/>
 *     &lt;enumeration value="CopyFeePerPage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchFeeCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum SearchFeeCodeEnumType {

    @XmlEnumValue("General")
    GENERAL("General"),
    @XmlEnumValue("Clear")
    CLEAR("Clear"),
    @XmlEnumValue("Hit")
    HIT("Hit"),
    @XmlEnumValue("CourtFee")
    COURT_FEE("CourtFee"),
    @XmlEnumValue("DocumentRetrieval")
    DOCUMENT_RETRIEVAL("DocumentRetrieval"),
    @XmlEnumValue("CopyFeePerPage")
    COPY_FEE_PER_PAGE("CopyFeePerPage");
    private final String value;

    SearchFeeCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchFeeCodeEnumType fromValue(String v) {
        for (SearchFeeCodeEnumType c: SearchFeeCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
