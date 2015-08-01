//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.15 at 03:07:29 PM EST 
//


package org.hr_xml._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for LaborBargainingUnitMemberCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LaborBargainingUnitMemberCodeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.hr-xml.org/3>LaborBargainingUnitCodeEnumType">
 *       &lt;attribute name="bargainingUnitID" type="{http://www.openapplications.org/oagis/9}StringType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LaborBargainingUnitMemberCodeType", propOrder = {
    "value"
})
public class LaborBargainingUnitMemberCodeType {

    @XmlValue
    protected LaborBargainingUnitCodeEnumType value;
    @XmlAttribute
    protected String bargainingUnitID;

    /**
     * 
     * 				
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:clm54217="http://www.openapplications.org/oagis/9/currencycode/54217:2001" xmlns:oac="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Labor Bargaining Unit. Member Status. Code&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * 				
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DefinitionText xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:clm54217="http://www.openapplications.org/oagis/9/currencycode/54217:2001" xmlns:oac="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Values that classify an individual's membership status within a given labor bargaining unit (a sector of an employer workforce represented by a union.)&lt;/ccts:DefinitionText&gt;
     * </pre>
     * 
     * 			
     * 
     * @return
     *     possible object is
     *     {@link LaborBargainingUnitCodeEnumType }
     *     
     */
    public LaborBargainingUnitCodeEnumType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaborBargainingUnitCodeEnumType }
     *     
     */
    public void setValue(LaborBargainingUnitCodeEnumType value) {
        this.value = value;
    }

    /**
     * Gets the value of the bargainingUnitID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBargainingUnitID() {
        return bargainingUnitID;
    }

    /**
     * Sets the value of the bargainingUnitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBargainingUnitID(String value) {
        this.bargainingUnitID = value;
    }

}
