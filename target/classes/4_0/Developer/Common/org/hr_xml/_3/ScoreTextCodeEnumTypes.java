//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.15 at 03:08:51 PM EST 
//


package org.hr_xml._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScoreTextCodeEnumTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScoreTextCodeEnumTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="CourseGrade"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScoreTextCodeEnumTypes", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum ScoreTextCodeEnumTypes {


    /**
     * A test score that is expressed as a mark (or grade) in an educational course.
     * 
     */
    @XmlEnumValue("CourseGrade")
    COURSE_GRADE("CourseGrade");
    private final String value;

    ScoreTextCodeEnumTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScoreTextCodeEnumTypes fromValue(String v) {
        for (ScoreTextCodeEnumTypes c: ScoreTextCodeEnumTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
