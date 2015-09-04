package org.hros.assessments.model;

import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.eclipse.persistence.jaxb.MarshallerProperties;
import org.hros.assessments.model.*;

import junit.framework.TestCase;

public class AccessCredentialTest extends TestCase {

	static final String FILENAME = "AccessCredentialTest_01";

	public AccessCredentialTest(String name) {
		super(name);
	}


	private AccessCredentialType createAccessCredentialType() {
		AccessCredentialType ac = new AccessCredentialType();
		ac.setAccessCredentialTypeCode(createCodeType());
		ac.setAccessCredentialValue("value goes here");
		return ac;
	}
	
	private CodeType createCodeType() {
		CodeType ct = new CodeType();
		ct.setName("ct name");
		return ct;
	}


	public void test_SaveAll() {
		AccessCredentialType ac = this.createAccessCredentialType();
		this.writeXML(ac, FILENAME + ".xml");
		System.out.println("\n====JSON====");
		writeJson(ac, FILENAME + ".json");
		assertTrue(true);
	}

	public void testShowXML() {
		AccessCredentialType ac = this.createAccessCredentialType();
		showXML(ac);
		assertTrue(true);
	}

	public void testShowJSON() {
		AccessCredentialType ac = this.createAccessCredentialType();
		showJSON(ac);
		assertTrue(true);
	}

	public void testRead_XML() {
		AccessCredentialType ac = readXML(FILENAME + ".xml");
		showXML(ac);
		assertTrue(true);
	}

	public void testRead_JSON() {
		AssessmentCatalogHelper helper = new AssessmentCatalogHelper();
		AccessCredentialType ac = readJSON(FILENAME + ".json");
		showJSON(ac);
		assertTrue(true);
	}
	
	public  void writeXML(AccessCredentialType ac, String filename){
		try {
			JAXBContext context = JAXBContext.newInstance(AccessCredentialType.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			StringWriter sw = new StringWriter();
			marshaller.marshal(ac, sw);
			
			File f = new File("./data/" + filename);
			marshaller.marshal(ac, f);
			
			System.out.println(sw.toString());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public  void writeJson(AccessCredentialType ac, String filename){
		try {
			JAXBContext context = JAXBContext.newInstance(AccessCredentialType.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			StringWriter sw = new StringWriter();
			marshaller.marshal(ac, sw);
			
			File f = new File("./data/" + filename);
			marshaller.marshal(ac, f);
			
			System.out.println(sw.toString());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public  void showJSON(AccessCredentialType ac) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(AccessCredentialType.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
//			m.setProperty("eclipslink.json.include-root", true);
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(ac, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public  void showXML(AccessCredentialType ac) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(AccessCredentialType.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(ac, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public AccessCredentialType readXML(String filename){
		AccessCredentialType aoj = null;
		try { 
			JAXBContext context = JAXBContext.newInstance(AccessCredentialType.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			File f = new File("./data/" + filename);
			
			aoj = (AccessCredentialType) unmarshaller.unmarshal(f);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aoj;		
	}
		
	public AccessCredentialType readJSON(String filename){
		AccessCredentialType aoj = null;
		try {
			JAXBContext context = JAXBContext.newInstance(AccessCredentialType.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			unmarshaller.setProperty("eclipselink.media-type", "application/json");
	        unmarshaller.setProperty("eclipselink.json.include-root", true);
			
			File f = new File("./data/" + filename);
			
			aoj = (AccessCredentialType) unmarshaller.unmarshal(f);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aoj;		
	}	
}
