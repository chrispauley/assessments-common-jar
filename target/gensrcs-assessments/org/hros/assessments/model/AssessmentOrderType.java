//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.17 at 03:34:39 PM EST 
//


package org.hros.assessments.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssessmentOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentOrderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="alternateDocumentIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="documentSequence" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="customerParty" type="{}PartyType"/&gt;
 *         &lt;element name="supplierParty" type="{}PartyType"/&gt;
 *         &lt;element name="requesterParty" type="{}PartyType"/&gt;
 *         &lt;element name="invitationByPartyCode" type="{}InvitationByPartyCodeEnumType" minOccurs="0"/&gt;
 *         &lt;element name="packageId" type="{}IdentifierType"/&gt;
 *         &lt;element name="comparisonGroupId" type="{}IdentifierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="assessmentRequesterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="assessmentSubject" type="{}AssessmentSubjectType" minOccurs="0"/&gt;
 *         &lt;element name="assessmentLanguageCode" type="{}LanguageCodeList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="assessmentResultLanguageCode" type="{}LanguageCodeList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="assessmentAccess" type="{}AssessmentAccessType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="testLocationID" type="{}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="redirectURL" type="{}RedirectURLType" minOccurs="0"/&gt;
 *         &lt;element name="userArea" type="{}UserAreaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="majorVersionID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="minorVersionID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="systemEnvironmentCode" type="{http://www.w3.org/2001/XMLSchema}string" default="Development" /&gt;
 *       &lt;attribute name="releaseID" type="{http://www.w3.org/2001/XMLSchema}string" default="4.0" /&gt;
 *       &lt;attribute name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string" default="en" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessmentOrderType", propOrder = {
    "documentId",
    "alternateDocumentIds",
    "documentSequence",
    "customerParty",
    "supplierParty",
    "requesterParty",
    "invitationByPartyCode",
    "packageId",
    "comparisonGroupId",
    "assessmentRequesterName",
    "assessmentSubject",
    "assessmentLanguageCode",
    "assessmentResultLanguageCode",
    "assessmentAccess",
    "testLocationID",
    "redirectURL",
    "userArea"
})
@XmlRootElement(name="AssessmentOrder")
public class AssessmentOrderType {

    @XmlElement(required = true)
    protected String documentId;
    @XmlElement(required = true)
    protected List<String> alternateDocumentIds;
    @XmlElement(required = true)
    protected BigInteger documentSequence;
    @XmlElement(required = true)
    protected PartyType customerParty;
    @XmlElement(required = true)
    protected PartyType supplierParty;
    @XmlElement(required = true)
    protected PartyType requesterParty;
    @XmlSchemaType(name = "normalizedString")
    protected InvitationByPartyCodeEnumType invitationByPartyCode;
    @XmlElement(required = true)
    protected IdentifierType packageId;
    protected List<IdentifierType> comparisonGroupId;
    protected String assessmentRequesterName;
    protected AssessmentSubjectType assessmentSubject;
    @XmlSchemaType(name = "normalizedString")
    protected List<LanguageCodeList> assessmentLanguageCode;
    @XmlSchemaType(name = "normalizedString")
    protected List<LanguageCodeList> assessmentResultLanguageCode;
    protected List<AssessmentAccessType> assessmentAccess;
    protected IdentifierType testLocationID;
    protected RedirectURLType redirectURL;
    protected UserAreaType userArea;
    @XmlAttribute(name = "majorVersionID")
    protected String majorVersionID;
    @XmlAttribute(name = "minorVersionID")
    protected String minorVersionID;
    @XmlAttribute(name = "systemEnvironmentCode")
    protected String systemEnvironmentCode;
    @XmlAttribute(name = "releaseID")
    protected String releaseID;
    @XmlAttribute(name = "languageCode")
    protected String languageCode;

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the alternateDocumentIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateDocumentIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateDocumentIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlternateDocumentIds() {
        if (alternateDocumentIds == null) {
            alternateDocumentIds = new ArrayList<String>();
        }
        return this.alternateDocumentIds;
    }

    /**
     * Gets the value of the documentSequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDocumentSequence() {
        return documentSequence;
    }

    /**
     * Sets the value of the documentSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDocumentSequence(BigInteger value) {
        this.documentSequence = value;
    }

    /**
     * Gets the value of the customerParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getCustomerParty() {
        return customerParty;
    }

    /**
     * Sets the value of the customerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setCustomerParty(PartyType value) {
        this.customerParty = value;
    }

    /**
     * Gets the value of the supplierParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getSupplierParty() {
        return supplierParty;
    }

    /**
     * Sets the value of the supplierParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setSupplierParty(PartyType value) {
        this.supplierParty = value;
    }

    /**
     * Gets the value of the requesterParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getRequesterParty() {
        return requesterParty;
    }

    /**
     * Sets the value of the requesterParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setRequesterParty(PartyType value) {
        this.requesterParty = value;
    }

    /**
     * Gets the value of the invitationByPartyCode property.
     * 
     * @return
     *     possible object is
     *     {@link InvitationByPartyCodeEnumType }
     *     
     */
    public InvitationByPartyCodeEnumType getInvitationByPartyCode() {
        return invitationByPartyCode;
    }

    /**
     * Sets the value of the invitationByPartyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvitationByPartyCodeEnumType }
     *     
     */
    public void setInvitationByPartyCode(InvitationByPartyCodeEnumType value) {
        this.invitationByPartyCode = value;
    }

    /**
     * Gets the value of the packageId property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getPackageId() {
        return packageId;
    }

    /**
     * Sets the value of the packageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setPackageId(IdentifierType value) {
        this.packageId = value;
    }

    /**
     * Gets the value of the comparisonGroupId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comparisonGroupId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComparisonGroupId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getComparisonGroupId() {
        if (comparisonGroupId == null) {
            comparisonGroupId = new ArrayList<IdentifierType>();
        }
        return this.comparisonGroupId;
    }

    /**
     * Gets the value of the assessmentRequesterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentRequesterName() {
        return assessmentRequesterName;
    }

    /**
     * Sets the value of the assessmentRequesterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentRequesterName(String value) {
        this.assessmentRequesterName = value;
    }

    /**
     * Gets the value of the assessmentSubject property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentSubjectType }
     *     
     */
    public AssessmentSubjectType getAssessmentSubject() {
        return assessmentSubject;
    }

    /**
     * Sets the value of the assessmentSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentSubjectType }
     *     
     */
    public void setAssessmentSubject(AssessmentSubjectType value) {
        this.assessmentSubject = value;
    }

    /**
     * Gets the value of the assessmentLanguageCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentLanguageCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentLanguageCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageCodeList }
     * 
     * 
     */
    public List<LanguageCodeList> getAssessmentLanguageCode() {
        if (assessmentLanguageCode == null) {
            assessmentLanguageCode = new ArrayList<LanguageCodeList>();
        }
        return this.assessmentLanguageCode;
    }

    /**
     * Gets the value of the assessmentResultLanguageCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentResultLanguageCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentResultLanguageCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageCodeList }
     * 
     * 
     */
    public List<LanguageCodeList> getAssessmentResultLanguageCode() {
        if (assessmentResultLanguageCode == null) {
            assessmentResultLanguageCode = new ArrayList<LanguageCodeList>();
        }
        return this.assessmentResultLanguageCode;
    }

    /**
     * Gets the value of the assessmentAccess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentAccess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssessmentAccessType }
     * 
     * 
     */
    public List<AssessmentAccessType> getAssessmentAccess() {
        if (assessmentAccess == null) {
            assessmentAccess = new ArrayList<AssessmentAccessType>();
        }
        return this.assessmentAccess;
    }

    /**
     * Gets the value of the testLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getTestLocationID() {
        return testLocationID;
    }

    /**
     * Sets the value of the testLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setTestLocationID(IdentifierType value) {
        this.testLocationID = value;
    }

    /**
     * Gets the value of the redirectURL property.
     * 
     * @return
     *     possible object is
     *     {@link RedirectURLType }
     *     
     */
    public RedirectURLType getRedirectURL() {
        return redirectURL;
    }

    /**
     * Sets the value of the redirectURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedirectURLType }
     *     
     */
    public void setRedirectURL(RedirectURLType value) {
        this.redirectURL = value;
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

    /**
     * Gets the value of the majorVersionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorVersionID() {
        return majorVersionID;
    }

    /**
     * Sets the value of the majorVersionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorVersionID(String value) {
        this.majorVersionID = value;
    }

    /**
     * Gets the value of the minorVersionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinorVersionID() {
        return minorVersionID;
    }

    /**
     * Sets the value of the minorVersionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinorVersionID(String value) {
        this.minorVersionID = value;
    }

    /**
     * Gets the value of the systemEnvironmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemEnvironmentCode() {
        if (systemEnvironmentCode == null) {
            return "Development";
        } else {
            return systemEnvironmentCode;
        }
    }

    /**
     * Sets the value of the systemEnvironmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemEnvironmentCode(String value) {
        this.systemEnvironmentCode = value;
    }

    /**
     * Gets the value of the releaseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseID() {
        if (releaseID == null) {
            return "4.0";
        } else {
            return releaseID;
        }
    }

    /**
     * Sets the value of the releaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseID(String value) {
        this.releaseID = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        if (languageCode == null) {
            return "en";
        } else {
            return languageCode;
        }
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

}
