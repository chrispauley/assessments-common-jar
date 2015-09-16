package org.hros.common.model;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.*;
import javax.xml.namespace.QName;
import javax.xml.transform.stream.StreamSource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;

import junit.framework.TestCase;

import org.assessments.common2.jar.Wrapper;
import org.eclipse.persistence.jaxb.MarshallerProperties;

public class ComplexTypesWrapperTest extends TestCase {

	static final String FILENAME = "BaseTest";
	static final String FILENAME_AmountType = "AmountType_Test01";

	protected void setUp() throws Exception {

		super.setUp();
	}

	public void testWebType() {
		WebType wt = new WebType();
		wt.setUrl("http://my.domain.com");
		System.out.println("\n=== XML ====");
		showXML(wt);
		System.out.println("\n=== JSON ====");
		showJSON(wt);
		assertTrue(true);
	}

	public void testComplexType_WebType(){
		ComplexType ct = new ComplexType();
		WebType wt = new WebType();
		ct.setWeb(wt);
		wt.setUrl("http://my.domain.com");
		String filename = wt.getClass().getSimpleName();
		System.out.println(filename);
		System.out.println("\n=== XML ====");
		showXML(wt);
		writeXML(ct, filename + ".xml");
		//ComplexType retObj = (ComplexType) this.readXML(wt,"data/Common/" + filename + ".xml");
//		showXML(retObj);
		System.out.println("\n=== JSON ====");
		showJSON(ct);
		writeJson(ct, filename + ".json");
		assertTrue(true);
	}
	
	public <T> Object readXML(T object, String filename){
		
		try { 
			JAXBContext context = JAXBContext.newInstance(object.getClass());
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			File f = new File(filename);
			Object returnObj =  (Object) unmarshaller.unmarshal(f);
			return returnObj;
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	
	}
		
	public CommentType readJSON(String filename){
		CommentType aoj = null;
		try {
			JAXBContext context = JAXBContext.newInstance(CommentType.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			unmarshaller.setProperty("eclipselink.media-type", "application/json");
	        unmarshaller.setProperty("eclipselink.json.include-root", true);
			
			File f = new File("./data/" + filename);
			
			aoj = (CommentType) unmarshaller.unmarshal(f);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aoj;		
	}
	
	public <T> void writeJson(T object, String filename){
		try {
			JAXBContext jc = JAXBContext.newInstance(object.getClass());
			Marshaller m = jc.createMarshaller();
			m.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			File f = new File("./data/Common/" + filename);
			m.marshal(object, f);
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	public <T> void writeXML(T object, String filename){
		try {
			JAXBContext jc = JAXBContext.newInstance(object.getClass());
			Marshaller m = jc.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			File f = new File("./data/Common/" + filename);
			m.marshal(object, f);
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}	

	public <T> void showXML(T object) {
		try {
			JAXBContext jc = JAXBContext.newInstance(object.getClass());
			Marshaller m = jc.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(object, System.out);

		} catch (JAXBException e) {
			System.out.println(e.getMessage());
		}

	}
	
	public <T> void showJSON(T object) {
		try {
			JAXBContext jc = JAXBContext.newInstance(object.getClass());
			Marshaller m = jc.createMarshaller();
			m.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
//			m.setProperty("eclipslink.json.include-root", true);
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(object, System.out);

		} catch (JAXBException e) {
			System.out.println(e.getMessage());
		}

	}	
}
