package org.hros.assessments.model;


import java.math.BigInteger;

import org.hros.assessments.model.IdentifierType;
import org.hros.assessments.model.PartyType;


import junit.framework.TestCase;

public class AssessmentReportTest_01 extends TestCase {

	static final String FILENAME = "SampleAssessmentReport_01";

	public AssessmentReportTest_01(String name) {
		super(name);
	}

	private AssessmentReportType createAssessmentReportType() {
		AssessmentReportType ar = new AssessmentReportType();
		ar.setDocumentID("documentId_01");
		
		ar.setDocumentSequence(BigInteger.valueOf(1));
		ar.setCustomerParty(this.createPartyType("CustomerParty",
				"customer name"));
		ar.setSupplierParty(this.createPartyType("SupplierParty",
				"supplier name"));
		ar.setRequesterParty(this.createPartyType("RequestorParty",
				"Requestor Name"));
		ar.setLanguageCode("en-US");

		AssessmentSubjectType as = this.createAssessmentSubject();
		return ar;
	}



	private AssessmentSubjectType createAssessmentSubject() {
		AssessmentSubjectType as = new AssessmentSubjectType();
		as.setPersonName("Chris Pauley");
		as.setSubjectID(new IdentifierType());
		as.getSubjectID().setValue("subject_id");
		return as;
	}

	private PartyType createPartyType(String partyName, String value) {
		PartyType pt = new PartyType();
		pt.setPartyName(partyName);
		IdentifierType id = new IdentifierType();
		id.setValue(value);
		// pt.setPartyTaxID(id);
		// pt.setUserArea(new UserAreaType());
		return pt;
	}

	public void test_SaveAll() {
		AssessmentReportType obj = this.createAssessmentReportType();
		AssessmentReportHelper.writeXML(obj, FILENAME + ".xml");
		System.out.println("\n====JSON====");
		AssessmentReportHelper.writeJson(obj, FILENAME + ".json");
		assertTrue(true);
	}

	public void testShowXML() {
		AssessmentReportType obj = this.createAssessmentReportType();
		AssessmentReportHelper.showXML(obj);
		assertTrue(true);
	}

	public void testShowJSON() {
		AssessmentReportType obj = this.createAssessmentReportType();
		AssessmentReportHelper.showJSON(obj);
		assertTrue(true);
	}

	public void testRead_XML() {
		AssessmentReportHelper helper = new AssessmentReportHelper();
		AssessmentReportType obj = helper.readXML(FILENAME + ".xml");
		AssessmentReportHelper.showXML(obj);
		assertTrue(true);
	}

	public void testRead_JSON() {
		AssessmentReportHelper helper = new AssessmentReportHelper();
		AssessmentReportType obj = helper.readJSON(FILENAME + ".json");
		AssessmentReportHelper.showJSON(obj);
		assertTrue(true);
	}

}
