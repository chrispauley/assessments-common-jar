//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.15 at 03:07:29 PM EST 
//


package org.hr_xml._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openapplications.oagis._9.DescriptionType;


/**
 * <p>Java class for ExpatriateBenefitsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpatriateBenefitsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}ExpatriateBenefitsIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ExpatriateBenefitsCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Description" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpatriateBenefitsType", propOrder = {
    "expatriateBenefitsIndicator",
    "expatriateBenefitsCode",
    "description"
})
public class ExpatriateBenefitsType {

    @XmlElement(name = "ExpatriateBenefitsIndicator")
    protected Boolean expatriateBenefitsIndicator;
    @XmlElement(name = "ExpatriateBenefitsCode")
    protected List<String> expatriateBenefitsCode;
    @XmlElement(name = "Description", namespace = "http://www.openapplications.org/oagis/9")
    protected DescriptionType description;

    /**
     * Gets the value of the expatriateBenefitsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpatriateBenefitsIndicator() {
        return expatriateBenefitsIndicator;
    }

    /**
     * Sets the value of the expatriateBenefitsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpatriateBenefitsIndicator(Boolean value) {
        this.expatriateBenefitsIndicator = value;
    }

    /**
     * Gets the value of the expatriateBenefitsCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expatriateBenefitsCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpatriateBenefitsCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExpatriateBenefitsCode() {
        if (expatriateBenefitsCode == null) {
            expatriateBenefitsCode = new ArrayList<String>();
        }
        return this.expatriateBenefitsCode;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionType }
     *     
     */
    public DescriptionType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionType }
     *     
     */
    public void setDescription(DescriptionType value) {
        this.description = value;
    }

}
