//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.16 at 01:33:22 PM EDT 
//


package org.hros.assessments.model;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class AssessmentResult
    extends JAXBElement<AssessmentResultType>
{

    protected final static QName NAME = new QName("", "AssessmentResult");

    public AssessmentResult(AssessmentResultType value) {
        super(NAME, ((Class) AssessmentResultType.class), null, value);
    }

    public AssessmentResult() {
        super(NAME, ((Class) AssessmentResultType.class), null, null);
    }

}
