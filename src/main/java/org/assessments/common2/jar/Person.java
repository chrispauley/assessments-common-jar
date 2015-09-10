package org.assessments.common2.jar;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PERSON")
public class Person {
 
    private String name;
 
    @XmlElement(name="NAME")
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
     
}
