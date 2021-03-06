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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.openapplications.oagis._9.TextType;


/**
 * This is a formatted presentation of a name 
 * 	(for example, a person name) that might alternatively 
 * 	presented as discretely fielded components or it could otherwise be a name that
 * 	has alternative formatted representations. 
 * 	
 * 	The formatCode is an optional attribute available to specify the applicable "mask" or 
 * 	type of format presentation to which the contents conforms. For example, in the 
 * 	case of the FormattedName of person formatCodes could be items such as:
 *   "Family Name, Given Name"	
 *   "Given Name, Middle Initial, Family Name"
 *   "First Initial, Family Name"
 *   "Given Name, Last Initial"
 *   "Nick Name, Family Name" 	
 * 	
 * 
 * <p>Java class for FormattedNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormattedNameType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.openapplications.org/oagis/9>TextType">
 *       &lt;attribute name="formatCode" type="{http://www.openapplications.org/oagis/9}NormalizedStringType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormattedNameType")
public class FormattedNameType
    extends TextType
{

    @XmlAttribute
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String formatCode;

    /**
     * Gets the value of the formatCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatCode() {
        return formatCode;
    }

    /**
     * Sets the value of the formatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatCode(String value) {
        this.formatCode = value;
    }

}
