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

public class LoginInformationTypeTest extends TestCase {

	static final String FILENAME = "LoginInformationTypeTest_01";

	public LoginInformationTypeTest(String name) {
		super(name);
	}


	private LoginInformationType createLoginInformationType() {
		LoginInformationType li = new LoginInformationType();
		li.setUserId("candidate1");
		li.getAccessCredential().add(createAccessCredentialType());
//		li.getAccessCredential().add(createAccessCredentialTypeVerbose());
		li.getAccessCredential().add(createAccessCredential_MAC_Key());
		li.getAccessCredential().add(createAccessCredential_Bearer_Key());
		li.getAccessCredential().add(createAccessViaURL());
		return li;
	}
	
	private AccessCredentialType createAccessViaURL() {
		AccessCredentialType ac = new AccessCredentialType();
		CodeType ct = new CodeType();
		ct.setName("RedirectURL");
		ct.setValue("http://www.ats-company.com/app/v1/assessmentorder?orderID=1234&access_token=k3k4uyahg3");
		ct.setListAgencyID("");
		ac.setAccessCredentialTypeCode(ct);
		return ac;
	}


	private AccessCredentialType createAccessCredential_Bearer_Key() {
		AccessCredentialType ac = new AccessCredentialType();
		CodeType ct = new CodeType();
		ct.setName("Bearer");
		ct.setValue("abcdef");
		ct.setListName("oAuth2");
		ac.setAccessCredentialTypeCode(ct);
		return ac;
	}


	private AccessCredentialType createAccessCredential_MAC_Key() {
		AccessCredentialType ac = new AccessCredentialType();
		//ac.setAccessCredentialValue("bearer_token");
		ac.setAccessCredentialTypeCode(createMAC_CodeType());
		return ac;
	}


	private CodeType createMAC_CodeType() {
		CodeType ct = new CodeType();
		ct.setName("MAC");
		ct.setValue("14197230929s0df90s09d");
		ct.setListName("oAuth2");
		return ct;
	}


	private AccessCredentialType createAccessCredentialType() {
		AccessCredentialType ac = new AccessCredentialType();
		ac.setAccessCredentialTypeCode(createPasswordCodeType());
		return ac;
	}
	
	private AccessCredentialType createAccessCredentialTypeVerbose() {
		AccessCredentialType ac = new AccessCredentialType();
		ac.setAccessCredentialTypeCode(createPasswordCodeType_Full());
		return ac;
	}


	private CodeType createPasswordCodeType_Full() {
		CodeType ct = new CodeType();
		ct.setName("password");
		ct.setValue("password_goes_here");
		ct.setLanguageID("en");
		ct.setListAgencyID("agency_ID");
		ct.setListAgencyName("agency_name");
		ct.setListSchemeURI("http://uri.org/password_definition");
		ct.setListVersionID("2.1.1");
		ct.setListID("list_id");
		return ct;
	}


	private CodeType createPasswordCodeType() {
		CodeType ct = new CodeType();
		ct.setName("password");
		ct.setValue("value_goes_here");
		return ct;
	}


	public void test_SaveAll() {
		LoginInformationType ac = this.createLoginInformationType();
		this.writeXML(ac, FILENAME + ".xml");
		System.out.println("\n====JSON====");
		writeJson(ac, FILENAME + ".json");
		assertTrue(true);
	}

	public void testShowXML() {
		LoginInformationType ac = this.createLoginInformationType();
		showXML(ac);
		assertTrue(true);
	}

	public void testShowJSON() {
		LoginInformationType ac = this.createLoginInformationType();
		showJSON(ac);
		assertTrue(true);
	}

	public void testRead_XML() {
		LoginInformationType ac = readXML(FILENAME + ".xml");
		showXML(ac);
		assertTrue(true);
	}

	public void testRead_JSON() {
		LoginInformationType ac = readJSON(FILENAME + ".json");
		showJSON(ac);
		assertTrue(true);
	}
	
	public  void writeXML(LoginInformationType ac, String filename){
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
	
	public  void writeJson(LoginInformationType ac, String filename){
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
	
	public  void showJSON(LoginInformationType ac) {
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
	
	public  void showXML(LoginInformationType ac) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(LoginInformationType.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(ac, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public LoginInformationType readXML(String filename){
		LoginInformationType aoj = null;
		try { 
			JAXBContext context = JAXBContext.newInstance(AccessCredentialType.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			File f = new File("./data/" + filename);
			
			aoj = (LoginInformationType) unmarshaller.unmarshal(f);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aoj;		
	}
		
	public LoginInformationType readJSON(String filename){
		LoginInformationType aoj = null;
		try {
			JAXBContext context = JAXBContext.newInstance(AccessCredentialType.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			unmarshaller.setProperty("eclipselink.media-type", "application/json");
	        unmarshaller.setProperty("eclipselink.json.include-root", true);
			
			File f = new File("./data/" + filename);
			
			aoj = (LoginInformationType) unmarshaller.unmarshal(f);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aoj;		
	}	
}
