//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.16 at 01:33:22 PM EDT 
//


package org.hros.assessments.model;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DisabilityTypeCode
    extends JAXBElement<CodeType>
{

    protected final static QName NAME = new QName("", "DisabilityTypeCode");

    public DisabilityTypeCode(CodeType value) {
        super(NAME, ((Class) CodeType.class), null, value);
    }

    public DisabilityTypeCode() {
        super(NAME, ((Class) CodeType.class), null, null);
    }

}