package org.hra.assessments.model;

import java.math.BigInteger;

import junit.framework.TestCase;

public class AssessmentCatalogTest_01 extends TestCase {

	public AssessmentCatalogTest_01(String name) {
		super(name);
	}

	private AssessmentCatalogType createAssessmentCatalogType() {
		AssessmentCatalogType ac = new AssessmentCatalogType();
		ac.setDocumentID("documentId_01");
		ac.setDocumentSequence(BigInteger.valueOf(1));
		ac.setCustomerParty(this.createPartyType("CustomerParty", "value01"));
		ac.setSupplierParty(this.createPartyType("SupplierParty", "value02") );
		ac.setInvitationByPartyCode("invitationPartyCodeGoesHere");
		return ac;
	}

	private PartyType createPartyType(String partyType, String value){
		PartyType pt = new PartyType();
		pt.setPartyName(partyType);
		IdentifierType id = new IdentifierType();
		id.setValue(value);
//		pt.setPartyTaxID(id);
//		pt.setUserArea(new UserAreaType());
		return pt;
	}
	public void test_SaveAll() {
		AssessmentCatalogType ac = this.createAssessmentCatalogType();
		AssessmentCatalogHelper.writeXML(ac, "SampleAssessmentCatalog_01.xml");
		System.out.println("\n====JSON====");
		AssessmentCatalogHelper
				.writeJson(ac, "SampleAssessmentCatalog_01.json");
		assertTrue(true);
	}

	public void testShowXML() {
		AssessmentCatalogType ac = this.createAssessmentCatalogType();
		AssessmentCatalogHelper.showXML(ac);
		assertTrue(true);
	}

	public void testShowJSON() {
		AssessmentCatalogType ac = this.createAssessmentCatalogType();
		AssessmentCatalogHelper.showJSON(ac);
		assertTrue(true);
	}

	public void testReadAssessmentCatalog_XML() {
		AssessmentCatalogHelper helper = new AssessmentCatalogHelper();
		String filename = "SampleAssessmentCatalog_01.xml";
		AssessmentCatalogType ac = helper.readXML(filename);
		AssessmentCatalogHelper.showXML(ac);
		assertTrue(true);
	}

	public void testAssessmentCatalog_JSON() {
		AssessmentCatalogHelper helper = new AssessmentCatalogHelper();
		String filename = "SampleAssessmentCatalog_01.json";
		AssessmentCatalogType ac = helper.readJSON(filename);
		AssessmentCatalogHelper.showJSON(ac);
		assertTrue(true);
	}

}
