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
 * <p>Java class for ScreeningPermissiblePurposeCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScreeningPermissiblePurposeCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="AccountManagement"/>
 *     &lt;enumeration value="ConsumerInitiated"/>
 *     &lt;enumeration value="WrittenConsent"/>
 *     &lt;enumeration value="DebtCollection"/>
 *     &lt;enumeration value="ChildSupport"/>
 *     &lt;enumeration value="CreditTransaction"/>
 *     &lt;enumeration value="Employment"/>
 *     &lt;enumeration value="GovernmentLicenseOrBenefit"/>
 *     &lt;enumeration value="AccountServicingOrUnderwritingOrInvestment"/>
 *     &lt;enumeration value="AccountReview"/>
 *     &lt;enumeration value="CourtOrder"/>
 *     &lt;enumeration value="TenantScreening"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScreeningPermissiblePurposeCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum ScreeningPermissiblePurposeCodeEnumType {


    /**
     * 
     * For purposes of acquiring, servicing, or insure an account.
     * 
     */
    @XmlEnumValue("AccountManagement")
    ACCOUNT_MANAGEMENT("AccountManagement"),

    /**
     * 
     * A consumer searching his or her own credit or consumer records.
     * 
     */
    @XmlEnumValue("ConsumerInitiated")
    CONSUMER_INITIATED("ConsumerInitiated"),

    /**
     * 
     * A type of search other than other enumerated values conducted with the search subject's written consent. Note that other search types typically require the search subject's written consent.
     * 
     */
    @XmlEnumValue("WrittenConsent")
    WRITTEN_CONSENT("WrittenConsent"),

    /**
     * Related to "review or collection of an account of, the consumer."
     * 
     */
    @XmlEnumValue("DebtCollection")
    DEBT_COLLECTION("DebtCollection"),

    /**
     * 
     * Related to a request by the head of a State or local child support enforcement agency for the purpose of establishing an individual's capacity to make child support payments or determining the appropriate level of such payments.
     * 
     */
    @XmlEnumValue("ChildSupport")
    CHILD_SUPPORT("ChildSupport"),

    /**
     * Related to a credit transaction involving the consumer on whom the information is to be furnished and involving the extension of credit to, or review or collection of an account of, the consumer.
     * 
     */
    @XmlEnumValue("CreditTransaction")
    CREDIT_TRANSACTION("CreditTransaction"),

    /**
     * Related to "employment purposes." For example, the evaluation of a candidate or review of an employee.
     * 
     */
    @XmlEnumValue("Employment")
    EMPLOYMENT("Employment"),

    /**
     * Intended use of the information in connection with a determination of the consumer's eligibility for a license or other benefit granted by a governmental instrumentality required by law to consider an applicant's financial responsibility or status."
     * 
     */
    @XmlEnumValue("GovernmentLicenseOrBenefit")
    GOVERNMENT_LICENSE_OR_BENEFIT("GovernmentLicenseOrBenefit"),

    /**
     * To review 	"information, as a potential investor or servicer, or current insurer, in connection with a valuation of, or an assessment of the credit or prepayment risks associated with, an existing credit obligation"
     * 
     */
    @XmlEnumValue("AccountServicingOrUnderwritingOrInvestment")
    ACCOUNT_SERVICING_OR_UNDERWRITING_OR_INVESTMENT("AccountServicingOrUnderwritingOrInvestment"),

    /**
     * "To review an account to determine whether the consumer continues to meet the terms of the account."
     * 
     */
    @XmlEnumValue("AccountReview")
    ACCOUNT_REVIEW("AccountReview"),

    /**
     * "In response to the order of a court having jurisdiction to issue such an order, or a subpoena issued in connection with proceedings before a Federal grand jury."
     * 
     */
    @XmlEnumValue("CourtOrder")
    COURT_ORDER("CourtOrder"),

    /**
     * Relating to rental to a tenant.
     * 
     */
    @XmlEnumValue("TenantScreening")
    TENANT_SCREENING("TenantScreening");
    private final String value;

    ScreeningPermissiblePurposeCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScreeningPermissiblePurposeCodeEnumType fromValue(String v) {
        for (ScreeningPermissiblePurposeCodeEnumType c: ScreeningPermissiblePurposeCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
