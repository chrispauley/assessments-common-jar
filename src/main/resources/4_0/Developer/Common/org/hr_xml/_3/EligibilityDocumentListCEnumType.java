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
 * <p>Java class for EligibilityDocumentListCEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EligibilityDocumentListCEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="SSAccountNumberCard"/>
 *     &lt;enumeration value="BirthAbroadCertificateFS-545"/>
 *     &lt;enumeration value="BirthAbroadCertificateDS-1350"/>
 *     &lt;enumeration value="BirthCertificateWithSeal"/>
 *     &lt;enumeration value="NativeAmericanTribalDocument"/>
 *     &lt;enumeration value="USCitizenIDCard"/>
 *     &lt;enumeration value="ResidentCitizenIDCard"/>
 *     &lt;enumeration value="DHSEmploymentAuthorizationDocument"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EligibilityDocumentListCEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum EligibilityDocumentListCEnumType {

    @XmlEnumValue("SSAccountNumberCard")
    SS_ACCOUNT_NUMBER_CARD("SSAccountNumberCard"),
    @XmlEnumValue("BirthAbroadCertificateFS-545")
    BIRTH_ABROAD_CERTIFICATE_FS_545("BirthAbroadCertificateFS-545"),
    @XmlEnumValue("BirthAbroadCertificateDS-1350")
    BIRTH_ABROAD_CERTIFICATE_DS_1350("BirthAbroadCertificateDS-1350"),
    @XmlEnumValue("BirthCertificateWithSeal")
    BIRTH_CERTIFICATE_WITH_SEAL("BirthCertificateWithSeal"),
    @XmlEnumValue("NativeAmericanTribalDocument")
    NATIVE_AMERICAN_TRIBAL_DOCUMENT("NativeAmericanTribalDocument"),
    @XmlEnumValue("USCitizenIDCard")
    US_CITIZEN_ID_CARD("USCitizenIDCard"),
    @XmlEnumValue("ResidentCitizenIDCard")
    RESIDENT_CITIZEN_ID_CARD("ResidentCitizenIDCard"),
    @XmlEnumValue("DHSEmploymentAuthorizationDocument")
    DHS_EMPLOYMENT_AUTHORIZATION_DOCUMENT("DHSEmploymentAuthorizationDocument");
    private final String value;

    EligibilityDocumentListCEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EligibilityDocumentListCEnumType fromValue(String v) {
        for (EligibilityDocumentListCEnumType c: EligibilityDocumentListCEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
