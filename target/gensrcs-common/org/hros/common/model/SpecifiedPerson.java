//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.17 at 03:34:40 PM EST 
//


package org.hros.common.model;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SpecifiedPerson
    extends JAXBElement<SpecifiedPersonType>
{

    protected final static QName NAME = new QName("", "SpecifiedPerson");

    public SpecifiedPerson(SpecifiedPersonType value) {
        super(NAME, ((Class) SpecifiedPersonType.class), null, value);
    }

    public SpecifiedPerson() {
        super(NAME, ((Class) SpecifiedPersonType.class), null, null);
    }

}
