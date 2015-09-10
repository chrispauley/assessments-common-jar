package org.assessments.common2.jar;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address {
 
    private String street;
 
    public String getStreet() {
        return street;
    }
 
    public void setStreet(String street) {
        this.street = street;
    }
 
}