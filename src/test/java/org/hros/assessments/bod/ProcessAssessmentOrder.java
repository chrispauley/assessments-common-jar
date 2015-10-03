package org.hros.assessments.bod;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.hros.assessments.model.AssessmentOrderType;
import org.hros.assessments.model.AssessmentSubjectType;
import org.hros.assessments.model.CommunicationType;
import org.hros.assessments.model.EmailType;
import org.hros.assessments.model.IdentifierType;
import org.hros.assessments.model.PartyType;
import org.hros.assessments.model.PhoneType;
import org.hros.common.model.Serializer;

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

import org.hros.assessments.model.*;
import org.hros.common.model.Serializer;

import junit.framework.TestCase;

public class ProcessAssessmentOrder extends TestCase {
	private final String FILENAME = "Step_02_ProcessAssessmentOrder";
	private final String ALT_ID = "AssessmentsWorkGroup_StepByStepTest_01";
	private final String DOCUMENT_ID = "doc_01";
	private final String REQUESTOR_PARTY = "Healthcare Staffing, Associates";
	private final String SUPPLIER_PARTY = "Healthcare SKA Assessments, Inc.";
	private final String PACKAGE_ID = "packageId_01";
	private final String SUBJECT_NAME = "John Smith";
	private final String SUBJECT_PHONE = "(908)555-0984";
	private final String SUBJECT_EMAIL = "smithj@yahoo.com";
	private final String SUBJECT_ID = "candidateId:20150917_22";
	
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testProcessAssessmentOrder() {
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

	private AssessmentOrderType createAssessmentOrderType()  {

		AssessmentOrderType ao = new AssessmentOrderType();
		
		ao.setDocumentId(DOCUMENT_ID);
		ao.getAlternateDocumentIds().add(FILENAME);
		ao.getAlternateDocumentIds().add(ALT_ID);
		ao.setDocumentSequence(BigInteger.valueOf(1));
		ao.setRequesterParty(createPartyType(REQUESTOR_PARTY));
		
		ao.setSupplierParty(createPartyType(SUPPLIER_PARTY));
		
		ao.setPackageId(createIdentifierType(PACKAGE_ID));
		ao.getComparisonGroupId().add(this.createIdentifierType("new_hire"));
		
		ao.setAssessmentSubject(this.createAssessmentSubject());
		
		return ao;
	}

	private AssessmentSubjectType createAssessmentSubject(){
		AssessmentSubjectType ast = new AssessmentSubjectType();
		ast.setPersonName(SUBJECT_NAME);
		ast.setSubjectId(createIdentifierType(SUBJECT_ID));
		ast.getSubjectId().setSchemeName("CandidateId");
		ast.getCommunications().add(createCommunicationType("cell", SUBJECT_PHONE));
		ast.getCommunications().add(createCommunicationTypeEmail("email", SUBJECT_EMAIL));
		return ast;
	}
	
	
	private CommunicationType createCommunicationType(String type,
			String phone) {
		CommunicationType ct = new CommunicationType();
		ct.setType(type);
		ct.getPhone().add(createPhone(phone));
		return ct;
	}
	
	private CommunicationType createCommunicationTypeEmail(String type,
			String address) {
		CommunicationType ct = new CommunicationType();
		ct.setType(type);
		ct.getEmail().add(createEmail(address));
		return ct;
	}

	private EmailType createEmail(String address) {
		EmailType e = new EmailType();
		e.setAddress(address);
		return e;
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
