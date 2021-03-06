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
 * <p>Java class for DrugTestOrderCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DrugTestOrderCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Ordered"/>
 *     &lt;enumeration value="Scheduled"/>
 *     &lt;enumeration value="DonorArrived"/>
 *     &lt;enumeration value="Expired"/>
 *     &lt;enumeration value="OrderCancelled"/>
 *     &lt;enumeration value="CollectionInProcess"/>
 *     &lt;enumeration value="CollectionSuspended"/>
 *     &lt;enumeration value="CollectionCompleted"/>
 *     &lt;enumeration value="ConfirmationCompleted"/>
 *     &lt;enumeration value="SentToLab"/>
 *     &lt;enumeration value="ReceivedAtLab"/>
 *     &lt;enumeration value="LabInProcess"/>
 *     &lt;enumeration value="LabSuspended"/>
 *     &lt;enumeration value="LabCompleted"/>
 *     &lt;enumeration value="ReceivedAtMRO"/>
 *     &lt;enumeration value="InMROReview"/>
 *     &lt;enumeration value="MROCompleted"/>
 *     &lt;enumeration value="MROCancelled"/>
 *     &lt;enumeration value="TestNotPerformed"/>
 *     &lt;enumeration value="RequiresFurtherTesting"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DrugTestOrderCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum DrugTestOrderCodeEnumType {

    @XmlEnumValue("Ordered")
    ORDERED("Ordered"),
    @XmlEnumValue("Scheduled")
    SCHEDULED("Scheduled"),
    @XmlEnumValue("DonorArrived")
    DONOR_ARRIVED("DonorArrived"),
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),
    @XmlEnumValue("OrderCancelled")
    ORDER_CANCELLED("OrderCancelled"),
    @XmlEnumValue("CollectionInProcess")
    COLLECTION_IN_PROCESS("CollectionInProcess"),
    @XmlEnumValue("CollectionSuspended")
    COLLECTION_SUSPENDED("CollectionSuspended"),
    @XmlEnumValue("CollectionCompleted")
    COLLECTION_COMPLETED("CollectionCompleted"),
    @XmlEnumValue("ConfirmationCompleted")
    CONFIRMATION_COMPLETED("ConfirmationCompleted"),
    @XmlEnumValue("SentToLab")
    SENT_TO_LAB("SentToLab"),
    @XmlEnumValue("ReceivedAtLab")
    RECEIVED_AT_LAB("ReceivedAtLab"),
    @XmlEnumValue("LabInProcess")
    LAB_IN_PROCESS("LabInProcess"),
    @XmlEnumValue("LabSuspended")
    LAB_SUSPENDED("LabSuspended"),
    @XmlEnumValue("LabCompleted")
    LAB_COMPLETED("LabCompleted"),
    @XmlEnumValue("ReceivedAtMRO")
    RECEIVED_AT_MRO("ReceivedAtMRO"),
    @XmlEnumValue("InMROReview")
    IN_MRO_REVIEW("InMROReview"),
    @XmlEnumValue("MROCompleted")
    MRO_COMPLETED("MROCompleted"),
    @XmlEnumValue("MROCancelled")
    MRO_CANCELLED("MROCancelled"),
    @XmlEnumValue("TestNotPerformed")
    TEST_NOT_PERFORMED("TestNotPerformed"),
    @XmlEnumValue("RequiresFurtherTesting")
    REQUIRES_FURTHER_TESTING("RequiresFurtherTesting");
    private final String value;

    DrugTestOrderCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DrugTestOrderCodeEnumType fromValue(String v) {
        for (DrugTestOrderCodeEnumType c: DrugTestOrderCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
