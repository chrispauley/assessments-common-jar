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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.openapplications.oagis._9.AmountType;


/**
 * A term used within HR-XML in the context of stock programs, including stock options.
 * 			Fair market value is a concept with similar meaning in other contexts (asset valuations, etc.). This is
 * 			a monetary amount, that also includes HR-XML standard effective dating attributes. For public companies, 
 * 			fair market value is typically the price at which the company's stock is traded on the 
 * 			date of the grant. In the case of a privately held company, this value is typically based upon an independent 
 * 			appraisal conducted by one or more third parties or determined by the board of directors based upon all 
 * 			of the relevant facts and circumstances.
 * 
 * <p>Java class for FairMarketValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FairMarketValueType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.openapplications.org/oagis/9>AmountType">
 *       &lt;attGroup ref="{http://www.hr-xml.org/3}EffectiveDateAttributeGroup"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FairMarketValueType")
public class FairMarketValueType
    extends AmountType
{

    @XmlAttribute
    protected List<String> validFrom;
    @XmlAttribute
    protected List<String> validTo;

    /**
     * Gets the value of the validFrom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validFrom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidFrom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValidFrom() {
        if (validFrom == null) {
            validFrom = new ArrayList<String>();
        }
        return this.validFrom;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValidTo() {
        if (validTo == null) {
            validTo = new ArrayList<String>();
        }
        return this.validTo;
    }

}
