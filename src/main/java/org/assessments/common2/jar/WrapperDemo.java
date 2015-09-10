package org.assessments.common2.jar;

import java.util.List;
import javax.xml.bind.*;
import javax.xml.namespace.QName;
import javax.xml.transform.stream.StreamSource;

public class WrapperDemo {

	 
    public static void main(String[] args) throws Exception {
        JAXBContext jc = JAXBContext.newInstance(Wrapper.class, Person.class,
                Address.class);
 
        // Unmarshal
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        List<Address> addresses = unmarshal(unmarshaller, Address.class, "data/wrapper-demo/addresses.xml");
        List<Person> persons = unmarshal(unmarshaller, Person.class, "data/wrapper-demo/persons.xml");
         
        // Marshal
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshal(marshaller, addresses, "addresses");
        marshal(marshaller, persons, "PERSONS");
     }
 
    /**
     * Unmarshal XML to Wrapper and return List value.
     */
    private static <T> List<T> unmarshal(Unmarshaller unmarshaller,
            Class<T> clazz, String xmlLocation) throws JAXBException {
        StreamSource xml = new StreamSource(xmlLocation);
        Wrapper<T> wrapper = (Wrapper<T>) unmarshaller.unmarshal(xml,
                Wrapper.class).getValue();
        return wrapper.getItems();
    }
 
    /**
     * Wrap List in Wrapper, then leverage JAXBElement to supply root element 
     * information.
     */
    private static void marshal(Marshaller marshaller, List<?> list, String name)
            throws JAXBException {
        QName qName = new QName(name);
        Wrapper wrapper = new Wrapper(list);
        JAXBElement<Wrapper> jaxbElement = new JAXBElement<Wrapper>(qName,
                Wrapper.class, wrapper);
        marshaller.marshal(jaxbElement, System.out);
    }
 
}
