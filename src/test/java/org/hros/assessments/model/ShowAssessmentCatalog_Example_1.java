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

public class ShowAssessmentCatalog_Example_1 extends TestCase {

	static final String FILENAME = "ShowAssessmentCatalog_Example_1";

	public ShowAssessmentCatalog_Example_1(String name) {
		super(name);
	}

	private AssessmentCatalogType createAssessmentCatalogType() {
		AssessmentCatalogType ac = new AssessmentCatalogType();
		ac.setDocumentID("AW_UseCase_003");
		ac.getAlternateDocumentIds().add(this.FILENAME);
		ac.getAlternateDocumentIds().add("usecase_003");
		ac.setDocumentSequence(BigInteger.valueOf(2));
		ac.setSupplierParty(this.createPartyType("SupplierParty",
				"PSI_Example_Only"));
		
		ac.getAssessmentPackages().add(this.createAssessmentPackage("Employee Aptitude Survey Test #1 - Verbal Comprehension"));
		return ac;
	}

	private AssessmentFulfillmentType createAssessmentFulfillment() {
		AssessmentFulfillmentType af = new AssessmentFulfillmentType();
		af.getScoreProfileNames().add("EAS1");
		af.getReportLanguageCodes().add(LanguageCodeList.EN_US);
		return af;
	}

	private AssessmentAdministrationType createAssessmentAdministrationType() {
		AssessmentAdministrationType a = new AssessmentAdministrationType();
		a.setProctoredAssessmentIndicator(Boolean.TRUE);
		a.setTimeEnforcedIndicator(Boolean.TRUE);
		MeasureTextType mt = new MeasureTextType();
		mt.setUnitCode("minutes");
		mt.setValue("5");
		a.setTestDuration(mt);
		AssessmentDeliveryCodeType adc = new AssessmentDeliveryCodeType();
		adc.setValue("online");
		adc.setSchedulingRequiredIndicator(Boolean.TRUE);
		a.getAssessmentDeliveryCode().add(adc);
		AssessmentDeliveryCodeType adc2 = new AssessmentDeliveryCodeType();
		adc2.setValue("telephone");
		adc2.setSchedulingRequiredIndicator(Boolean.TRUE);
		a.getAssessmentDeliveryCode().add(adc2);
		return a;
	}

	private AssessmentApplicabilityType createAssessmentApplicabilityType() {
		AssessmentApplicabilityType aa = new AssessmentApplicabilityType();
		aa.getAssessedCompetencies().add(createSpecifiedCompetencyType());
		aa.getJobCategoryCodes().add(addSOCJobCategoryCode("Functional Area","Sales"));
//		aa.setCareerLevelCode(createCareerLevelCode("name", "Mid-Level"));
		
		aa.getApplicableRegions().add(createJurisdictionTypeUS());
		aa.getApplicableRegions().add(createJurisdictionTypeCA());
		aa.getApplicableRegions().add(createJurisdictionTypeMX());
		aa.getAvailableLanguageCodes().add(LanguageCodeList.EN_US);
		aa.getAvailableLanguageCodes().add(LanguageCodeList.FR_CA);
		aa.getAvailableLanguageCodes().add(LanguageCodeList.ES);
		return aa;
	}



	private JurisdictionType createJurisdictionTypeUS() {
		JurisdictionType jt = new JurisdictionType();
		jt.setCountryCode(CountryCodeEnumType.US);
		return jt;
	}
	private JurisdictionType createJurisdictionTypeCA() {
		JurisdictionType jt = new JurisdictionType();
		jt.setCountryCode(CountryCodeEnumType.CA);
		return jt;
	}	
	private JurisdictionType createJurisdictionTypeMX() {
		JurisdictionType jt = new JurisdictionType();
		jt.setCountryCode(CountryCodeEnumType.MX);
		return jt;
	}
	private CodeType createCareerLevelCode(String name, String value) {
		CodeType ct = new CodeType();
//		ct.setName(name);
		ct.setValue(value);
		return ct;
	}

	private CodeType addSOCJobCategoryCode(String listId, String value) {
		CodeType ct = new CodeType();
		ct.setValue(value);
		ct.setListID(listId);
		return ct;
	}
	
	private SpecifiedCompetencyType createSpecifiedCompetencyType() {
		SpecifiedCompetencyType ct = new SpecifiedCompetencyType();
		ct.setCompetencyName("Verbal Comprehension");
		ct.getCompetencyIds().add(createIdentifierType("A2"));
		return ct;
	}

	private IdentifierType createIdentifierType(String string) {
		IdentifierType it = new IdentifierType();
		it.setValue(string);
		return it;
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

	private AssessmentPackageType createAssessmentPackage(String name) {
		AssessmentPackageType ap = new AssessmentPackageType();
		ap.setName(name);
		ap.getDescription().add("Employee Aptitude Survey Test #1 - " +
		        "Verbal Comprehension measures the ability to understand written words " +
				"and the ideas associated with them. The test taker selects the synonym " +
		        "for a designated word from the four possibilities presented. " +
				"This test is comprised of 30 multiple choice items and has a 5 " +
		        "minute time limit. It is designed to assess verbal ability.");
		ap.getID().add("EAS1");
		ap.getParentGroupIds().add("EAS");	
		ap.setAssessmentApplicability(
				createAssessmentApplicabilityType());
		ap.setAssessmentAdministration(
				createAssessmentAdministrationType());
		ap.setAssessmentFulfillment(createAssessmentFulfillment());		
		return ap;
	}

	private PartyType createPartyType(String partyName, String value) {
		PartyType pt = new PartyType();
//		pt.setName(partyName);
		IdentifierType id = new IdentifierType();
		id.setValue(value);
		pt.setTaxId(id);
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
