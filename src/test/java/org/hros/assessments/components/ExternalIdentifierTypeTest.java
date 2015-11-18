package org.hros.assessments.components;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;

import javax.xml.bind.JAXBException;

import org.hros.assessments.bod.Serializer;
import org.hros.assessments.model.*;

import junit.framework.TestCase;

public class ExternalIdentifierTypeTest extends TestCase {
	static final String FILENAME = "ExternalIdentifierType";
	private final String FILE_PATH = "./data/Common/base/";	
	
	protected void setUp() throws Exception {
		super.setUp();
	}

	public static ExternalIdentifierType create(String schemeName, String agencyId, String agencyName, 
			String schemeDataURI, String schemeURI, String schemeId, String version, String value) {
		ExternalIdentifierType ei = new ExternalIdentifierType();
		ei.setSchemeName(schemeName);
		ei.setAgencyId(agencyId);
		ei.setAgencyName(agencyName);
		ei.setSchemeDataURI(schemeDataURI);
		ei.setSchemeURI(schemeURI);
		ei.setValue(value);
		ei.setVersionId(version);
		ei.setSchemeId(schemeId);
	return ei;
}

	public void testExternalIdentifierType_EIN(){
		
		try {
			ExternalIdentifierType ei = new ExternalIdentifierType();
			ei.setSchemeName("US-Federal Employer Identification Number");
			ei.setAgencyId("IRS");
			ei.setAgencyName("Internal Revenue Service");
			ei.setSchemeDataURI("https://www.us.gov/burearu_of_schemas/irs/");
			ei.setSchemeURI("https://www.us.gov/burearu_of_schemas/irs/ein_schema.json");
			ei.setValue("123456789");
			ei.setVersionId("1.1");
			ei.setSchemeId("US-EIN");
						
			Serializer.marshalJSON(ei, System.out);
			String filename = FILE_PATH + FILENAME + "_ein.json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(ei, fos);
			fos.close();
			
		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}
		
	}

	public void testExternalIdentifierType_ICC(){
		
		try {
			ExternalIdentifierType ei = new ExternalIdentifierType();
			ei.setSchemeName("ICC Member Id");
			ei.setAgencyId("ICC");
			ei.setAgencyName("International Chamber of Commerce");
			ei.setSchemeDataURI("http://www.iccwbo.org/worldwide-membership/members/schema/");
			ei.setSchemeURI("http://www.iccwbo.org/worldwide-membership/");
			ei.setValue("90992");
			ei.setSchemeId("ICC-Members");
			ei.setVersionId("1.9");
			
			Serializer.marshalJSON(ei, System.out);
			String filename = FILE_PATH + FILENAME + "_icc.json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(ei, fos);
			fos.close();
		
		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}
	}
}
