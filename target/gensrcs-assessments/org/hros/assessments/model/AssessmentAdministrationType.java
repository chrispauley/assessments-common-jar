//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.16 at 01:33:22 PM EDT 
//


package org.hros.assessments.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssessmentAdministrationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentAdministrationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProctoredAssessmentIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeEnforcedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TestDuration" type="{}MeasureTextType" minOccurs="0"/&gt;
 *         &lt;element name="AssessmentDeliveryCode" type="{}AssessmentDeliveryCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UserArea" type="{}UserAreaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessmentAdministrationType", propOrder = {
    "description",
    "proctoredAssessmentIndicator",
    "timeEnforcedIndicator",
    "testDuration",
    "assessmentDeliveryCode",
    "userArea"
})
public class AssessmentAdministrationType {

    @XmlElement(name = "Description")
    protected List<String> description;
    @XmlElement(name = "ProctoredAssessmentIndicator")
    protected Boolean proctoredAssessmentIndicator;
    @XmlElement(name = "TimeEnforcedIndicator")
    protected Boolean timeEnforcedIndicator;
    @XmlElement(name = "TestDuration")
    protected MeasureTextType testDuration;
    @XmlElement(name = "AssessmentDeliveryCode")
    protected List<AssessmentDeliveryCodeType> assessmentDeliveryCode;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescription() {
        if (description == null) {
            description = new ArrayList<String>();
        }
        return this.description;
    }

    /**
     * Gets the value of the proctoredAssessmentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProctoredAssessmentIndicator() {
        return proctoredAssessmentIndicator;
    }

    /**
     * Sets the value of the proctoredAssessmentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProctoredAssessmentIndicator(Boolean value) {
        this.proctoredAssessmentIndicator = value;
    }

    /**
     * Gets the value of the timeEnforcedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeEnforcedIndicator() {
        return timeEnforcedIndicator;
    }

    /**
     * Sets the value of the timeEnforcedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeEnforcedIndicator(Boolean value) {
        this.timeEnforcedIndicator = value;
    }

    /**
     * Gets the value of the testDuration property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureTextType }
     *     
     */
    public MeasureTextType getTestDuration() {
        return testDuration;
    }

    /**
     * Sets the value of the testDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureTextType }
     *     
     */
    public void setTestDuration(MeasureTextType value) {
        this.testDuration = value;
    }

    /**
     * Gets the value of the assessmentDeliveryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentDeliveryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentDeliveryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssessmentDeliveryCodeType }
     * 
     * 
     */
    public List<AssessmentDeliveryCodeType> getAssessmentDeliveryCode() {
        if (assessmentDeliveryCode == null) {
            assessmentDeliveryCode = new ArrayList<AssessmentDeliveryCodeType>();
        }
        return this.assessmentDeliveryCode;
    }

    /**
     * Gets the value of the userArea property.
     * 
     * @return
     *     possible object is
     *     {@link UserAreaType }
     *     
     */
    public UserAreaType getUserArea() {
        return userArea;
    }

    /**
     * Sets the value of the userArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAreaType }
     *     
     */
    public void setUserArea(UserAreaType value) {
        this.userArea = value;
    }

}
