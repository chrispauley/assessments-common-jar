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
 * <p>Java class for ScreeningResultCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScreeningResultCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Pass"/>
 *     &lt;enumeration value="Fail"/>
 *     &lt;enumeration value="Review"/>
 *     &lt;enumeration value="RecordFound"/>
 *     &lt;enumeration value="NoRecordFound"/>
 *     &lt;enumeration value="Clear"/>
 *     &lt;enumeration value="Hit"/>
 *     &lt;enumeration value="UnableToContact"/>
 *     &lt;enumeration value="UnableToFulfill"/>
 *     &lt;enumeration value="UnableToVerify"/>
 *     &lt;enumeration value="Positive"/>
 *     &lt;enumeration value="Negative"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScreeningResultCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum ScreeningResultCodeEnumType {


    /**
     * Indicates within the boundaries of any pre-existing understanding between screening service provider and customer that no disqualifying information resulted from the screening and/or that qualification requirements were confirmed.
     * 
     */
    @XmlEnumValue("Pass")
    PASS("Pass"),

    /**
     * Indicates within the boundaries of any pre-existing understanding between screening service provider and customer that disqualifying information resulted from the screening and/or that qualification requirements were not satisfied.
     * 
     */
    @XmlEnumValue("Fail")
    FAIL("Fail"),

    /**
     * Indicates the existence of interim and or final results requiring the customer's review.
     * 
     */
    @XmlEnumValue("Review")
    REVIEW("Review"),

    /**
     * Indicates the screening returned one or more record, which may or may not contain disqualifying information. This is a slightly more fine grain communicatione than "Review." In some cases, service providers report having a "Hit," which would be an equivalent. It is assumed that the customer needs to review "hits" to interpret their meaning and significance.
     * 
     */
    @XmlEnumValue("RecordFound")
    RECORD_FOUND("RecordFound"),

    /**
     * Indicates the screening did not return any records.  In some cases, service providers report "No Hits," which would be an equivalent. The customer needs to interpret the meaning and significance based on the type of screening and its
     * 			understanding with the screening provider. On its face, this result type is neither qualifying or disqualifying.
     * 
     */
    @XmlEnumValue("NoRecordFound")
    NO_RECORD_FOUND("NoRecordFound"),

    /**
     * Indicates the screening did not return any disqualifying results or records. Can be a slightly more fine grain communication than "No Record Found." 
     * 
     */
    @XmlEnumValue("Clear")
    CLEAR("Clear"),

    /**
     * Indicates within the boundaries of any pre-existing understanding between screening service provider and customer that disqualifying information resulted from the screening and/or that qualification requirements were not satisfied.
     * 
     */
    @XmlEnumValue("Hit")
    HIT("Hit"),
    @XmlEnumValue("UnableToContact")
    UNABLE_TO_CONTACT("UnableToContact"),
    @XmlEnumValue("UnableToFulfill")
    UNABLE_TO_FULFILL("UnableToFulfill"),
    @XmlEnumValue("UnableToVerify")
    UNABLE_TO_VERIFY("UnableToVerify"),

    /**
     * This result type is reserved for alcohol, drug, and similar medical tests. Indicates that the test was "positive." In the context of substance screenings, this communicates that a prohibited substance (or evidence thereof such as "metabolites") were found in quantities exceeding a threshold to be considered a positive result. Such a result usually would have been reviewed by a medical review officer who may have interpreted the test findings together with facts about the search subject's condition (weight, age, prescribed medicine, etc.).
     * 
     */
    @XmlEnumValue("Positive")
    POSITIVE("Positive"),

    /**
     * This result type is reserved for alcohol, drug, and similar medical tests. Indicates that the test was "negative." In the context of substance screenings, this communicates that a prohibited substance (or evidence thereof such as "metabolites") were NOT found in quantities exceeding a threshold to be considered a positive result. Such a result usually would have been reviewed by a medical review officer who may have interpreted the test findings together with facts about the search subject's condition (weight, age, prescribed medicine, etc.).
     * 
     */
    @XmlEnumValue("Negative")
    NEGATIVE("Negative");
    private final String value;

    ScreeningResultCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScreeningResultCodeEnumType fromValue(String v) {
        for (ScreeningResultCodeEnumType c: ScreeningResultCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
