package org.hra.assessments.model;

import org.hra.model.bod.*;

import java.math.BigInteger;

import junit.framework.TestCase;

public class AssessmentCatalogTest_01 extends TestCase {

	public AssessmentCatalogTest_01(String name) {
		super(name);
	}

	private AssessmentCatalogType createAssessmentCatalogType() {
		AssessmentCatalogType ac = new AssessmentCatalogType();
		ac.setCustomerParty(this.createPartyType("SupplierParty"));

		return ac;
	}

	private PartyType createPartyType(String partyType){
		PartyType pt = new PartyType();
		pt.setPartyName(partyType);
		IdentifierType id = new IdentifierType();
		id.setValue("id01");
		pt.setPartyTaxID(id);
		pt.setUserArea(new UserAreaType());
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
