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

public class ProcessAssessmentCatalog_Example_1 extends TestCase {

	static final String FILENAME = "ProcessAssessmentCatalog_Example_1";

	public ProcessAssessmentCatalog_Example_1(String name) {
		super(name);
	}

	private AssessmentCatalogType createAssessmentCatalogType() {
		AssessmentCatalogType ac = new AssessmentCatalogType();
		ac.setDocumentID("AW_UseCase_004");
		ac.getAlternateDocumentID().add(this.FILENAME);
		ac.getAlternateDocumentID().add("usecase_004");
		ac.setDocumentSequence(BigInteger.valueOf(2));
		ac.setSupplierParty(this.createPartyType("SupplierParty",
				"PSI_Example_Only"));
		ac.getAssessmentPackage().add(this.createAssessmentPackageEAS1("Employee Aptitude Survey Test #1 - Verbal Comprehension"));
		ac.getAssessmentPackage().add(this.createAssessmentPackagePET("Professional Employment Test"));
		ac.getAssessmentPackage().add(this.createAssessmentPackageSureHire("SureHire"));		
		return ac;
	}
	
	
	private AssessmentPackageType createAssessmentPackageSureHire(String name) {
		AssessmentPackageType ap = new AssessmentPackageType();
		ap.setName(name);
		ap.getDescription().add("SureHire® is an instrument that is specifically " +
		    "designed to measure the competencies necessary for job success in a " +
			"retail environment. Comprised of 50 multiple-choice items, it can be" +
		    "completed by most applicants in 25 minutes or less. SureHire® affords" +
			"a broad understanding of potential employees by assessing both problem" +
		    "solving skills (such as making change and following written procedures)" +
			"as well as attitudes toward work and customer service.");
		ap.getID().add("SureHire");
		ap.setAssessmentApplicability(
				createAssessmentApplicabilityType_pkg3());
		ap.setAssessmentAdministration(
				createAssessmentAdministrationType_Pkg3());
		ap.setAssessmentFulfillment(createAssessmentFulfillment_pkg3());
		return ap;
	}	

	private AssessmentApplicabilityType createAssessmentApplicabilityType_pkg3() {
		AssessmentApplicabilityType aa = new AssessmentApplicabilityType();
		aa.getAssessedCompetency().add(createSpecifiedCompetencyType_Three());
		aa.getAssessedCompetency().add(this.createSpecifiedCompetencyType_Five());
		aa.getAssessedCompetency().add(this.createSpecifiedCompetencyType_SIX());
		aa.getJobCategoryCode().add(addRetailJobCategoryCode("Job Industry","Retail"));
		aa.getApplicableRegion().add(this.createJurisdictionTypeFR());
		aa.getApplicableRegion().add(this.createJurisdictionTypeUS());
		aa.getAvailableLanguageCode().add(LanguageCodeList.EN_US);
		return aa;
	}

	private SpecifiedCompetencyType createSpecifiedCompetencyType_Five() {
		SpecifiedCompetencyType sc = new SpecifiedCompetencyType();
		sc.setCompetencyName("Problem Solving");
		sc.getCompetencyID().add(this.createIdentifierType("F1"));
		return sc;
	}

	private SpecifiedCompetencyType createSpecifiedCompetencyType_SIX() {
		SpecifiedCompetencyType sc = new SpecifiedCompetencyType();
		sc.setCompetencyName("Work Orientation");
		sc.getCompetencyID().add(this.createIdentifierType("G1"));
		return sc;
	}	

	private AssessmentPackageType createAssessmentPackagePET(String name) {
		AssessmentPackageType ap = new AssessmentPackageType();
		ap.setName(name);
		ap.getDescription().add("The Professional Employment Test (PET) is designed " +
		     "to assess the cognitive abilities that are important for the successful" + 
				"performance of work behaviors in professional occupations. It is " + 
		     "comprised of 40 multiple choice items with an 80 minute time limit. " +
				"Questions on the PET focus upon data interpretation, reasoning, " +
		     "quantitative problem solving, and reading comprehension. The PET is " +
				"intended for use in the selection of personnel for professional, " +
		     "administrative, and managerial occupations.");
		ap.getID().add("PET");
		ap.setAssessmentApplicability(
				createAssessmentApplicabilityType_pkg2());
		ap.setAssessmentAdministration(
				createAssessmentAdministrationType());
		ap.setAssessmentFulfillment(createAssessmentFulfillment_pkg2());
		return ap;
	}
	
	private AssessmentApplicabilityType createAssessmentApplicabilityType_pkg2() {
		AssessmentApplicabilityType aa = new AssessmentApplicabilityType();
		aa.getAssessedCompetency().add(createSpecifiedCompetencyType_Three());
		aa.getAssessedCompetency().add(this.createSpecifiedCompetencyType_Four());
		aa.getJobCategoryCode().add(addSOCJobCategoryCode("","Professional"));
		aa.setCareerLevelCode(createCareerLevelCode("name", "Executive"));
		aa.getApplicableRegion().add(createJurisdictionTypeMX());
		aa.getAvailableLanguageCode().add(LanguageCodeList.ES);		
		return aa;
	}

	private SpecifiedCompetencyType createSpecifiedCompetencyType_Three() {
		SpecifiedCompetencyType sc = new SpecifiedCompetencyType();
		sc.setCompetencyName("Verbal Comprehension");
		sc.getCompetencyID().add(this.createIdentifierType("C1"));
		sc.getCompetencyID().add(this.createIdentifierType("C2"));
		sc.setProficiencyLevel(this.createBaseScoreType_2());
		return sc;
	}
	
	private SpecifiedCompetencyType createSpecifiedCompetencyType_Four() {
		SpecifiedCompetencyType sc = new SpecifiedCompetencyType();
		sc.setCompetencyName("Quantitative Problem Solving");
		sc.getCompetencyID().add(this.createIdentifierType("E1"));
		sc.getCompetencyID().add(this.createIdentifierType("E2"));
		sc.setProficiencyLevel(this.createBaseScoreType_2());
		return sc;
	}

	private AssessmentFulfillmentType createAssessmentFulfillment_pkg1() {
		AssessmentFulfillmentType af = new AssessmentFulfillmentType();
		af.getScoreProfileName().add("PET Profile 1");
		af.getReportLanguageCode().add(LanguageCodeList.EN_US);
		return af;
	}

	private AssessmentFulfillmentType createAssessmentFulfillment_pkg2() {
		AssessmentFulfillmentType af = new AssessmentFulfillmentType();
		af.getScoreProfileName().add("PET Profile 1");
		af.getReportLanguageCode().add(LanguageCodeList.FR_FR);
		return af;
	}
	private AssessmentFulfillmentType createAssessmentFulfillment_pkg3() {
		AssessmentFulfillmentType af = new AssessmentFulfillmentType();
		af.getScoreProfileName().add("SureHire Result Profile");
		af.getReportLanguageCode().add(LanguageCodeList.FR_FR);
		return af;
	}
	
	private AssessmentAdministrationType createAssessmentAdministrationType_Pkg3() {
		AssessmentAdministrationType a = new AssessmentAdministrationType();
		a.setProctoredAssessmentIndicator(Boolean.FALSE);
		a.setTimeEnforcedIndicator(Boolean.TRUE);
		MeasureTextType mt = new MeasureTextType();
		mt.setUnitCode("minutes");
		mt.setValue("10");
		a.setTestDuration(mt);
		AssessmentDeliveryCodeType adc = new AssessmentDeliveryCodeType();
		adc.setValue("online");
		adc.setSchedulingRequiredIndicator(Boolean.TRUE);
		a.getAssessmentDeliveryCode().add(adc);
		AssessmentDeliveryCodeType adc2 = new AssessmentDeliveryCodeType();
		adc2.setValue("fax");
		adc2.setSchedulingRequiredIndicator(Boolean.TRUE);
		a.getAssessmentDeliveryCode().add(adc2);
		return a;
	}	
	
	private AssessmentAdministrationType createAssessmentAdministrationType() {
		AssessmentAdministrationType a = new AssessmentAdministrationType();
		a.getDescription().add("This is a time enforced assessment");
		a.setProctoredAssessmentIndicator(Boolean.FALSE);
		a.setTimeEnforcedIndicator(Boolean.TRUE);
		MeasureTextType mt = new MeasureTextType();
		mt.setUnitCode("minutes");
		mt.setValue("10");
		a.setTestDuration(mt);
		AssessmentDeliveryCodeType adc = new AssessmentDeliveryCodeType();
		adc.setValue("online");
		adc.setSchedulingRequiredIndicator(Boolean.FALSE);
		a.getAssessmentDeliveryCode().add(adc);
		AssessmentDeliveryCodeType adc2 = new AssessmentDeliveryCodeType();
		adc2.setValue("fax");
		adc2.setSchedulingRequiredIndicator(Boolean.TRUE);
		a.getAssessmentDeliveryCode().add(adc2);
		return a;
	}

	private AssessmentApplicabilityType createAssessmentApplicabilityType_pkg1() {
		AssessmentApplicabilityType aa = new AssessmentApplicabilityType();
		aa.getDescription().add("skills");
		aa.getAssessmentTypeCode().add(AssessmentTypeCodeEnumType.SKILL);
		aa.getAssessedCompetency().add(createSpecifiedCompetencyType_One());
		aa.getAssessedCompetency().add(createSpecifiedCompetencyType_Two());	
		aa.getJobCategoryCode().add(addSOCJobCategoryCode("","Professional"));
		aa.setCareerLevelCode(createCareerLevelCode("name", "Executive"));
		aa.getApplicableRegion().add(createJurisdictionTypeMX());
		aa.getAvailableLanguageCode().add(LanguageCodeList.ES);
		return aa;
	}



	private JurisdictionType createJurisdictionTypeFR() {
		JurisdictionType jt = new JurisdictionType();
		jt.setCountryCode(CountryCodeEnumType.FR);
		return jt;
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
//		ct.setListID(listId);
		return ct;
	}
	private CodeType addRetailJobCategoryCode(String listId, String value) {
		CodeType ct = new CodeType();
		ct.setValue(value);
		ct.setListID(listId);
		return ct;
	}
	
	private SpecifiedCompetencyType createSpecifiedCompetencyType_Two() {
		SpecifiedCompetencyType ct = new SpecifiedCompetencyType();
		ct.setCompetencyName("Verbal Comprehension");
		ct.getCompetencyID().add(createIdentifierType("E1"));
		ct.getCompetencyID().add(createIdentifierType("E2"));
		ct.setProficiencyLevel(createBaseScoreType_2());
		return ct;
	}
	
	private BaseScoreType createBaseScoreType_2() {
		BaseScoreType bt = new BaseScoreType();
		bt.getScoreText().add("Mid-Level");
		return bt;
	}

	private SpecifiedCompetencyType createSpecifiedCompetencyType_One() {
		SpecifiedCompetencyType ct = new SpecifiedCompetencyType();
		ct.setCompetencyName("Verbal Comprehension");
		ct.getCompetencyID().add(createIdentifierType("A1"));
		ct.getCompetencyID().add(createIdentifierType("A2"));
		ct.setProficiencyLevel(createBaseScoreType());
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
		return bs;
	}

	private ScoreNumericType createNumericScore() {
		ScoreNumericType sn = new ScoreNumericType();
		sn.setScoreNumericCode(new BigDecimal(70));
		sn.setMaximumScoreNumeric(new BigDecimal(100));
		sn.setMinimumScoreNumeric(new BigDecimal(0));
		sn.setInterval(new BigDecimal(100));
		return sn;
	}

	private AssessmentPackageType createAssessmentPackageEAS1(String name) {
		AssessmentPackageType ap = new AssessmentPackageType();
		ap.setName(name);
		ap.getDescription().add("Employee Aptitude Survey Test #1 - " +
		        "Verbal Comprehension measures the ability to understand written words " +
				"and the ideas associated with them. The test taker selects the synonym " +
		        "for a designated word from the four possibilities presented. " +
				"This test is comprised of 30 multiple choice items and has a 5 " +
		        "minute time limit. It is designed to assess verbal ability.");
		ap.getID().add("EAS1");
		ap.getParentGroupID().add("EAS");
		
		ap.setAssessmentApplicability(
				createAssessmentApplicabilityType_pkg1());
		ap.setAssessmentAdministration(
				createAssessmentAdministrationType());
		ap.setAssessmentFulfillment(createAssessmentFulfillment_pkg1());
		return ap;
	}

	private PartyType createPartyType(String partyName, String value) {
		PartyType pt = new PartyType();
//		pt.setName(partyName);
		IdentifierType id = new IdentifierType();
		id.setValue(value);
		pt.setTaxID(id);
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
