package org.hros.assessments.bod;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.hros.assessments.model.*;
import org.hros.common.model.Serializer;

import junit.framework.TestCase;

public class AcknowledgeAssessmentOrderTest extends TestCase {
	private final String FILENAME = "Step_02_AcknowledgeAssessmentOrder";
	private final String ALT_ID = "AssessmentsWorkGroup_StepByStepTest_01";
	private final String DOCUMENT_ID = "doc_01";
	private final String REQUESTOR_PARTY = "Healthcare Staffing, Associates";
	private final String SUPPLIER_PARTY = "Healthcare SKA Assessments, Inc.";
	private final String PACKAGE_ID = "packageId_01";
	private final String SUBJECT_NAME = "John Smith";
	private final String SUBJECT_PHONE = "(908)555-0984";
	private final String SUBJECT_ID = "candidateId:20150917_22";	
	
	private final String REDIRECT_URL = "https//hc-assessments.com/assessments/v1/test";
	
	public AcknowledgeAssessmentOrderTest(String name) {
		super(name);
	}
	
	public void testAssessmentOrder() {
		AssessmentOrderType ao = this.createAssessmentOrderType();
		
		try {
			Serializer.marshalJSON(ao, System.out);
			String filename = "./data/Assessments/" + FILENAME + ".json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(ao, fos);
			fos.close();
			
			String filename2 = "./data/Assessments/" + FILENAME + ".xml";
			File file2 = new File(filename2);
			FileOutputStream fos2 = new FileOutputStream(file2);
			Serializer.marshal(ao, fos2);
			fos.close();
		} catch  (JAXBException | IOException e) {
			e.printStackTrace();
		} 
		
	}
	
	public void testAssessmentOrder2() {
		AssessmentOrderType ao = this.createAssessmentOrderType();
		AssessmentOrderHelper.showJSON(ao);	
	}	
	
	private AssessmentOrderType createAssessmentOrderType()  {

		AssessmentOrderType ao = new AssessmentOrderType();
		
		ao.setDocumentId(DOCUMENT_ID);
		ao.getAlternateDocumentIds().add(FILENAME);
		ao.getAlternateDocumentIds().add(ALT_ID);
		ao.setDocumentSequence(BigInteger.valueOf(1));
//		ao.setMajorVersionID("4.0");
		ao.setRequesterParty(createPartyType(REQUESTOR_PARTY));
		
		ao.setSupplierParty(createPartyType(SUPPLIER_PARTY));
		
		ao.setPackageId(createIdentifierType(PACKAGE_ID));
		ao.getComparisonGroupId().add(this.createIdentifierType("new_hire"));
		
		ao.setAssessmentSubject(this.createAssessmentSubject());
		
		ao.setRedirectURL(createRedirectURL());
		return ao;
	}
	
	private RedirectURLType createRedirectURL() {
		RedirectURLType r = new RedirectURLType();
		r.setURI(REDIRECT_URL + "?packageId=" + PACKAGE_ID + "&amp;documentID=" + DOCUMENT_ID + "&amp;token=3JAJLEYYYZ");
		r.setValidFrom("today");
		r.setValidTo("next_week");
		r.setStatusCode("200");
		r.setMessage("Click here to start the test.");
		return r;
	}

	private AssessmentSubjectType createAssessmentSubject(){
		AssessmentSubjectType ast = new AssessmentSubjectType();
		ast.setPersonName(SUBJECT_NAME);
		ast.setSubjectId(createIdentifierType(SUBJECT_ID));
		ast.getSubjectId().setSchemeName("CandidateId");
		ast.getCommunications().add(createCommunicationType("cell", SUBJECT_PHONE));
		return ast;
	}
	
	
	private CommunicationType createCommunicationType(String type,
			String phone) {
		CommunicationType ct = new CommunicationType();
		ct.setType(type);
		ct.getPhone().add(createPhone(phone));
		return ct;
	}

	private PhoneType createPhone(String phone) {
		PhoneType pt = new PhoneType();
		pt.setFormattedNumber(phone);
		return pt;
	}

	private PartyType createPartyType(String taxId) {
		PartyType pt = new PartyType();
		pt.setName(taxId);
		return pt;
	}
	
	private IdentifierType createIdentifierType(String value){
		IdentifierType it = new IdentifierType();
		it.setValue(value);
		return it;
	}


    
}
