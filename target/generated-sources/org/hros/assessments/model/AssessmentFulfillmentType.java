//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.12 at 01:46:54 PM EDT 
//


package org.hros.assessments.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A set of information describing options and
 * 				characteristics relating to the way an assessment result is
 * 				provided. For example, the language or available languages of the
 * 				assessment report; the period for which the result is recognized as
 * 				valid or reliable, the name or identity of the scoring profile used
 * 				in calculating the result; etc.
 * 			
 * 
 * <p>Java class for AssessmentFulfillmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentFulfillmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EffectivePeriodDescription" type="{}MeasureTextType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ScoreProfileName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ReportLanguageCode" type="{}LanguageCodeEnumType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AssessmentFulfillmentType", propOrder = {
    "description",
    "effectivePeriodDescription",
    "scoreProfileName",
    "reportLanguageCode",
    "userArea"
})
public class AssessmentFulfillmentType {

    @XmlElement(name = "Description")
    protected List<String> description;
    @XmlElement(name = "EffectivePeriodDescription")
    protected List<MeasureTextType> effectivePeriodDescription;
    @XmlElement(name = "ScoreProfileName")
    protected List<String> scoreProfileName;
    @XmlElement(name = "ReportLanguageCode")
    @XmlSchemaType(name = "normalizedString")
    protected List<LanguageCodeEnumType> reportLanguageCode;
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
     * Gets the value of the effectivePeriodDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectivePeriodDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectivePeriodDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasureTextType }
     * 
     * 
     */
    public List<MeasureTextType> getEffectivePeriodDescription() {
        if (effectivePeriodDescription == null) {
            effectivePeriodDescription = new ArrayList<MeasureTextType>();
        }
        return this.effectivePeriodDescription;
    }

    /**
     * Gets the value of the scoreProfileName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreProfileName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreProfileName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreProfileName() {
        if (scoreProfileName == null) {
            scoreProfileName = new ArrayList<String>();
        }
        return this.scoreProfileName;
    }

    /**
     * Gets the value of the reportLanguageCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportLanguageCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportLanguageCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageCodeEnumType }
     * 
     * 
     */
    public List<LanguageCodeEnumType> getReportLanguageCode() {
        if (reportLanguageCode == null) {
            reportLanguageCode = new ArrayList<LanguageCodeEnumType>();
        }
        return this.reportLanguageCode;
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
