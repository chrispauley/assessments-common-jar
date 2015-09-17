package org.hros.assessments.model;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.hros.assessments.model.AssessmentApplicabilityType;
import org.hros.assessments.model.AssessmentCatalogType;
import org.hros.assessments.model.AssessmentPackageType;
import org.hros.assessments.model.AssessmentTypeCodeEnumType;
import org.hros.assessments.model.BaseScoreType;
import org.hros.assessments.model.IdentifierType;
import org.hros.assessments.model.PartyType;
import org.hros.assessments.model.ScoreNumericType;
import org.hros.assessments.model.ServiceAvailabilityCodeEnumType;
import org.hros.assessments.model.SpecifiedCompetencyType;

import junit.framework.TestCase;

public class AssessmentCatalogTest_02 extends TestCase {

	static final String FILENAME = "SampleAssessmentCatalog_02";

	public AssessmentCatalogTest_02(String name) {
		super(name);
	}

	private AssessmentCatalogType createAssessmentCatalogType() {
		AssessmentCatalogType ac = new AssessmentCatalogType();
		ac.setDocumentID("documentId_02");
		ac.getAlternateDocumentID().add("alternateId-04");
		ac.getAlternateDocumentID().add("alternateId-05");
		ac.setDocumentSequence(BigInteger.valueOf(1));
		ac.setCustomerParty(this.createPartyType("CustomerParty",
				"customer name"));
		ac.setSupplierParty(this.createPartyType("SupplierParty",
				"supplier name"));
		ac.setRequesterParty(this.createPartyType("RequestorParty",
				"Requestor Name"));
		
		ac.getAssessmentPackage().add(this.createAssessmentPackage("Package2 Name",
				"$250.00"));
		return ac;
	}

	private AssessmentFulfillmentType createAssessmentFulfillment() {
		AssessmentFulfillmentType af = new AssessmentFulfillmentType();
		af.getDescription().add("Description of Fulfillment");
		
		MeasureTextType mt = new MeasureTextType();
		mt.setUnitCode("prop 1");
		mt.setValue("value of mt");
		af.getEffectivePeriodDescription().add(mt);
		
		af.getScoreProfileName().add("Profile1");
		af.getScoreProfileName().add("Profile2");
		
		af.getReportLanguageCode().add(LanguageCodeEnumType.EN_US);
		af.getReportLanguageCode().add(LanguageCodeEnumType.FR_CA);
		af.setUserArea(new UserAreaType());
		af.getUserArea().getAny().add("{}");
		
		return af;
	}

	private AssessmentAdministrationType createAssessmentAdministrationType() {
		AssessmentAdministrationType a = new AssessmentAdministrationType();
		a.getDescription().add("This is an online test.");
		a.setProctoredAssessmentIndicator(Boolean.TRUE);
		a.setTimeEnforcedIndicator(Boolean.TRUE);
		MeasureTextType mt = new MeasureTextType();
		mt.setUnitCode("prop 1");
		mt.setValue("value of mt");
		a.setTestDuration(mt);
		a.getAssessmentDeliveryCode().add(new AssessmentDeliveryCodeType());
		AssessmentDeliveryCodeType adc = new AssessmentDeliveryCodeType();
		adc.setValue("Code1");
		adc.setSchedulingRequiredIndicator(Boolean.TRUE);
		a.getAssessmentDeliveryCode().add(adc);
		return a;
	}

	private AssessmentApplicabilityType createAssessmentApplicabilityType() {
		AssessmentApplicabilityType aa = new AssessmentApplicabilityType();
		aa.getDescription().add("Description for AssessmentApplicability");
		aa.getAssessmentTypeCode().add(AssessmentTypeCodeEnumType.ABILITY);
		aa.getAssessmentTypeCode().add(AssessmentTypeCodeEnumType.KNOWLEDGE);
		aa.getAssessedCompetency().add(createSpecifiedCompetencyType());
		
		aa.getJobCategoryCode().add(addSOCJobCategoryCode("Computer Programmer","15-1131"));
		aa.getJobCategoryCode().add(addISCOJobCategoryCode("Software and applications developers and analysts","251"));
		aa.getJobCategoryCode().add(addNOCJobCategoryCode("Computer Programmer","2174"));
		
		aa.setCareerLevelCode(createCareerLevelCode("name", "Mid-Career"));
		return aa;
	}



	private CodeType createCareerLevelCode(String name, String value) {
		CodeType ct = new CodeType();
		ct.setName(name);
		ct.setValue(value);
		return ct;
	}

	private CodeType addSOCJobCategoryCode(String name, String value) {
		CodeType ct = new CodeType();
		ct.setName(name);
		ct.setValue(value);
		ct.setListID("SOC");
		ct.setLanguageID("en-US");
		ct.setListName("Standard Occupational Classification System");
		ct.setListAgencyID("BLS");
		ct.setListAgencyName("Bureau of Labor Statistics");
		ct.setListSchemeURI("http://bls.gov/soc");
		ct.setListURI("http://www.bls.gov/soc/2010");
		ct.setListVersionID("2010");
		return ct;
	}

	private CodeType addISCOJobCategoryCode(String name, String value) {
		CodeType ct = new CodeType();
		ct.setName(name);
		ct.setValue(value);
		ct.setListID("ISCO");
		ct.setLanguageID("en-US");
		ct.setListName("International Standard Classification of Occupations");
		ct.setListAgencyID("ILO");
		ct.setListAgencyName("International Labour Organization");
//		ct.setListSchemeURI("http://bls.gov/soc");
//		ct.setListURI("http://www.bls.gov/soc/2010");
		ct.setListVersionID("ISCO-08");
		return ct;
	}
	
	private CodeType addNOCJobCategoryCode(String name, String value) {
		CodeType ct = new CodeType();
		ct.setName(name);
		ct.setValue(value);
		ct.setListID("NOC");
		ct.setLanguageID("fr-CA");
		ct.setListName("National Occupational Classification");
		ct.setListAgencyID("ILO");
		ct.setListAgencyName("Government of Canada");
//		ct.setListSchemeURI("http://bls.gov/soc");
//		ct.setListURI("http://www.bls.gov/soc/2010");
		ct.setListVersionID("2011");
		return ct;
	}
	
	private SpecifiedCompetencyType createSpecifiedCompetencyType() {
		SpecifiedCompetencyType ct = new SpecifiedCompetencyType();
		ct.setCompetencyName("CompetencyName One");
		ct.setProficiencyLevel(createBaseScoreType());
		return ct;
	}

	private BaseScoreType createBaseScoreType() {
		BaseScoreType bs = new BaseScoreType();
		bs.getScoreNumeric().add(createNumericScore());
		return null;
	}

	private ScoreNumericType createNumericScore() {
		ScoreNumericType sn = new ScoreNumericType();
		sn.setScoreNumericCode(new BigDecimal(70));
		sn.setMaximumScoreNumeric(new BigDecimal(100));
		sn.setMinimumScoreNumeric(new BigDecimal(0));
		sn.setInterval(new BigDecimal(100));
		return null;
	}

	private AssessmentPackageType createAssessmentPackage(String name,
			String cost) {
		AssessmentPackageType ap = new AssessmentPackageType();
		ap.setName(name);
		ap.setPackageCost(cost);
		ap.setServiceAvailabilityCode(ServiceAvailabilityCodeEnumType.AVAILABLE);
		ap.getDescription().add("Package Description");
		ap.getID().add("package-002");
		ap.getPackageTypeCode().add("typeCode1");
		ap.getParentGroupID().add("Hiring Manager");
		ap.getPartyReportingIDs().add("Manager-001");
		ap.setAssessmentApplicability(
				createAssessmentApplicabilityType());
		ap.setAssessmentAdministration(
				createAssessmentAdministrationType());
		ap.setAssessmentFulfillment(createAssessmentFulfillment());	
		return ap;
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
		AssessmentCatalogType ac = this.createAssessmentCatalogType();
		AssessmentCatalogHelper.writeXML(ac, FILENAME + ".xml");
		System.out.println("\n====JSON====");
		AssessmentCatalogHelper.writeJson(ac, FILENAME + ".json");
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

	public void testRead_XML() {
		AssessmentCatalogHelper helper = new AssessmentCatalogHelper();
		AssessmentCatalogType ac = helper.readXML(FILENAME + ".xml");
		AssessmentCatalogHelper.showXML(ac);
		assertTrue(true);
	}

	public void testRead_JSON() {
		AssessmentCatalogHelper helper = new AssessmentCatalogHelper();
		AssessmentCatalogType ac = helper.readJSON(FILENAME + ".json");
		AssessmentCatalogHelper.showJSON(ac);
		assertTrue(true);
	}

}
