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
 * <p>Java class for LicenseTypeCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LicenseTypeCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Aviation"/>
 *     &lt;enumeration value="Communications"/>
 *     &lt;enumeration value="LicensedPracticalNurse"/>
 *     &lt;enumeration value="MotorVehiclePersonal"/>
 *     &lt;enumeration value="MotorVehiclePersonalCommercial"/>
 *     &lt;enumeration value="MotorVehicleCommercial"/>
 *     &lt;enumeration value="CDLIS"/>
 *     &lt;enumeration value="MotorVehicleNationalDriverRegister"/>
 *     &lt;enumeration value="NDR"/>
 *     &lt;enumeration value="Nurse"/>
 *     &lt;enumeration value="Pharmacy"/>
 *     &lt;enumeration value="Physician"/>
 *     &lt;enumeration value="RadiationTechnologist"/>
 *     &lt;enumeration value="ARRT"/>
 *     &lt;enumeration value="CNA"/>
 *     &lt;enumeration value="PhysicalTherapist"/>
 *     &lt;enumeration value="OccupationalTherapist"/>
 *     &lt;enumeration value="SocialWorker"/>
 *     &lt;enumeration value="CertifiedPublicAccountant"/>
 *     &lt;enumeration value="Engineer"/>
 *     &lt;enumeration value="LicensedVocationalNurse"/>
 *     &lt;enumeration value="Dietician"/>
 *     &lt;enumeration value="SpeechTherapist"/>
 *     &lt;enumeration value="Lawyer"/>
 *     &lt;enumeration value="Radiology"/>
 *     &lt;enumeration value="EmergencyMedicalTechnician"/>
 *     &lt;enumeration value="Paramedic"/>
 *     &lt;enumeration value="Teacher"/>
 *     &lt;enumeration value="Dentist"/>
 *     &lt;enumeration value="Optometrist"/>
 *     &lt;enumeration value="RegisteredNurse"/>
 *     &lt;enumeration value="Medical"/>
 *     &lt;enumeration value="Legal"/>
 *     &lt;enumeration value="Financial"/>
 *     &lt;enumeration value="Insurance"/>
 *     &lt;enumeration value="InformationTechnology"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LicenseTypeCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum LicenseTypeCodeEnumType {


    /**
     * Aviation-related licenses. For example, a pilot license. In the United States,
     *             the type of licenses regulated by the U.S. Federal Aviation Administration.
     * 
     */
    @XmlEnumValue("Aviation")
    AVIATION("Aviation"),

    /**
     * 
     *             A class of licenses to operate or maintain radio, television, or
     *             other devices/services using the public radio spectrum. For example, in the United States,
     *             the type of licenses regulated by the U.S. Federal Communications Commission.		
     * 			
     * 
     */
    @XmlEnumValue("Communications")
    COMMUNICATIONS("Communications"),

    /**
     * An "LPN" or Licensed Practical Nurse License or equivalent license.
     * 
     */
    @XmlEnumValue("LicensedPracticalNurse")
    LICENSED_PRACTICAL_NURSE("LicensedPracticalNurse"),

    /**
     * A personal license to operate a motor vehicle (MV Personal).
     * 
     */
    @XmlEnumValue("MotorVehiclePersonal")
    MOTOR_VEHICLE_PERSONAL("MotorVehiclePersonal"),

    /**
     * A license to operate a motor vehicle that may be dual purpose -- for commercial and personal use.
     * 
     */
    @XmlEnumValue("MotorVehiclePersonalCommercial")
    MOTOR_VEHICLE_PERSONAL_COMMERCIAL("MotorVehiclePersonalCommercial"),

    /**
     * A commerical license to operate a motor vehicle.
     * 
     */
    @XmlEnumValue("MotorVehicleCommercial")
    MOTOR_VEHICLE_COMMERCIAL("MotorVehicleCommercial"),

    /**
     * Commercial Driver's License Information System. Used to specify a license that will be verified through, or is within the scope of, the CDLIS.
     * 
     */
    CDLIS("CDLIS"),

    /**
     * National Driver Register.
     * 
     */
    @XmlEnumValue("MotorVehicleNationalDriverRegister")
    MOTOR_VEHICLE_NATIONAL_DRIVER_REGISTER("MotorVehicleNationalDriverRegister"),

    /**
     * National Driver Register containing drivers who have had their licenses revoked or suspended, or who have been convicted of serious traffic violations such as driving while impaired by alcohol or drugs.
     * 
     */
    NDR("NDR"),
    @XmlEnumValue("Nurse")
    NURSE("Nurse"),
    @XmlEnumValue("Pharmacy")
    PHARMACY("Pharmacy"),
    @XmlEnumValue("Physician")
    PHYSICIAN("Physician"),
    @XmlEnumValue("RadiationTechnologist")
    RADIATION_TECHNOLOGIST("RadiationTechnologist"),

    /**
     * American Registry of Radiologic Technologists
     * 
     */
    ARRT("ARRT"),

    /**
     * Certified Nursing Assistant
     * 
     */
    CNA("CNA"),
    @XmlEnumValue("PhysicalTherapist")
    PHYSICAL_THERAPIST("PhysicalTherapist"),
    @XmlEnumValue("OccupationalTherapist")
    OCCUPATIONAL_THERAPIST("OccupationalTherapist"),
    @XmlEnumValue("SocialWorker")
    SOCIAL_WORKER("SocialWorker"),
    @XmlEnumValue("CertifiedPublicAccountant")
    CERTIFIED_PUBLIC_ACCOUNTANT("CertifiedPublicAccountant"),
    @XmlEnumValue("Engineer")
    ENGINEER("Engineer"),

    /**
     * An "LVN" or "Licensed Vocational Nurse" License or equivalent license.
     * 
     */
    @XmlEnumValue("LicensedVocationalNurse")
    LICENSED_VOCATIONAL_NURSE("LicensedVocationalNurse"),
    @XmlEnumValue("Dietician")
    DIETICIAN("Dietician"),
    @XmlEnumValue("SpeechTherapist")
    SPEECH_THERAPIST("SpeechTherapist"),
    @XmlEnumValue("Lawyer")
    LAWYER("Lawyer"),
    @XmlEnumValue("Radiology")
    RADIOLOGY("Radiology"),
    @XmlEnumValue("EmergencyMedicalTechnician")
    EMERGENCY_MEDICAL_TECHNICIAN("EmergencyMedicalTechnician"),
    @XmlEnumValue("Paramedic")
    PARAMEDIC("Paramedic"),
    @XmlEnumValue("Teacher")
    TEACHER("Teacher"),
    @XmlEnumValue("Dentist")
    DENTIST("Dentist"),
    @XmlEnumValue("Optometrist")
    OPTOMETRIST("Optometrist"),
    @XmlEnumValue("RegisteredNurse")
    REGISTERED_NURSE("RegisteredNurse"),
    @XmlEnumValue("Medical")
    MEDICAL("Medical"),
    @XmlEnumValue("Legal")
    LEGAL("Legal"),
    @XmlEnumValue("Financial")
    FINANCIAL("Financial"),
    @XmlEnumValue("Insurance")
    INSURANCE("Insurance"),
    @XmlEnumValue("InformationTechnology")
    INFORMATION_TECHNOLOGY("InformationTechnology");
    private final String value;

    LicenseTypeCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LicenseTypeCodeEnumType fromValue(String v) {
        for (LicenseTypeCodeEnumType c: LicenseTypeCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
