package org.hros.assessments.usecase2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.hros.assessments.model.AssessmentAdministrationType;
import org.hros.assessments.model.AssessmentApplicabilityType;
import org.hros.assessments.model.AssessmentCatalogType;
import org.hros.assessments.model.AssessmentDeliveryCodeType;
import org.hros.assessments.model.AssessmentFulfillmentType;
import org.hros.assessments.model.AssessmentPackageType;
import org.hros.assessments.model.IdentifierType;
import org.hros.assessments.model.LanguageCodeList;
import org.hros.assessments.model.MeasureTextType;
import org.hros.assessments.model.PartyType;
import org.hros.assessments.model.SpecifiedCompetencyType;
import org.hros.common.model.Serializer;

import junit.framework.TestCase;

public class ShowAssessmentCatalog extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	private final String FILE_PATH = "./data/Assessments/UseCase02/";
	private final String FILENAME = "Step_01_UC2_ShowShowAssessmentCatalog";
	private final String SUPPLIER_PARTY = "Healthcare SKA Assessments, Inc.";
	private final String PACKAGE_ID_01 = "packageId_01";
	private final String PACKAGE_ID_02 = "packageId_02";
	private final String PACKAGE_ID_03 = "packageId_03";
	private final String PACKAGE_ID_04 = "packageId_04";
	private final String PACKAGE_ID_05 = "packageId_05";
	private final String PACKAGE_ID_06 = "packageId_06";
	private final String PACKAGE_ID_07 = "packageId_07";
	private final String PACKAGE_ID_08 = "packageId_08";
	private final String SPECIFIED_COMPETENCY = "Medical Billing Process";
	private final String SPECIFIED_COMPETENCY_ID = "Billing_101";

	public void testShowAssessmentCatalog() {

		try {
			AssessmentCatalogType ac = new AssessmentCatalogType();
			ac.setSupplierParty(createSupplierParty());

			createPackages(ac);
			
			Serializer.marshalJSON(ac, System.out);
			String filename = FILE_PATH + FILENAME + ".json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(ac, fos);
			fos.close();

			String filename2 = FILE_PATH + FILENAME + ".xml";
			File file2 = new File(filename2);
			FileOutputStream fos2 = new FileOutputStream(file2);
			Serializer.marshal(ac, fos2);
			fos2.close();
		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}

	}
	private void createPackages(AssessmentCatalogType ac) {
		ac.getAssessmentPackages().add(createAssessmentPackageOne());
		ac.getAssessmentPackages().add(createAssessmentPackageTwo());

		ac.getAssessmentPackages().add(
				AssessmentPackageHelper.createAssessmentPackage(
						PACKAGE_ID_03, "$65 US", "package 3", "pkg3 text"));
		ac.getAssessmentPackages().add(
				AssessmentPackageHelper.createAssessmentPackage(
						PACKAGE_ID_04, "$75 US", "package 4", "pkg4 text"));
		ac.getAssessmentPackages().add(
				AssessmentPackageHelper.createAssessmentPackage(
						PACKAGE_ID_05, "$65 US", "package 5", "pkg5 text"));
		ac.getAssessmentPackages().add(
				AssessmentPackageHelper.createAssessmentPackage(
						PACKAGE_ID_06, "$76 US", "package 6", "pkg6 text"));
		ac.getAssessmentPackages().add(
				AssessmentPackageHelper.createAssessmentPackage(
						PACKAGE_ID_07, "$67 US", "package 7", "pkg7 text"));
		ac.getAssessmentPackages().add(
				AssessmentPackageHelper.createAssessmentPackage(
						PACKAGE_ID_08, "$78 US", "package 8", "pkg8 text"));
	}

	private PartyType createSupplierParty() {
		PartyType pt = new PartyType();
		// pt.setPartyName("Healthcare SKA Assessments, Inc.");
		pt.setTaxId(createIdentifier(SUPPLIER_PARTY));
		return pt;
	}

	private IdentifierType createIdentifier(String value) {
		IdentifierType id = new IdentifierType();
		id.setValue(value);
		return id;
	}

	private AssessmentPackageType createAssessmentPackageOne() {
		AssessmentPackageType ap = new AssessmentPackageType();
		ap.getID().add(PACKAGE_ID_01);
		ap.setPackageCost("85.00 US");
		ap.setName(SPECIFIED_COMPETENCY);
		ap.getDescription().add("skills");
		ap.setAssessmentApplicability(createAssessmentApplicabilityType());
		ap.setAssessmentAdministration(createAssessmentAdmin_One());
		ap.setAssessmentFulfillment(createAssessmentFullfillment_PkgOne());
		return ap;
	}

	private AssessmentFulfillmentType createAssessmentFullfillment_PkgOne() {
		AssessmentFulfillmentType af = new AssessmentFulfillmentType();
		af.getDescriptions().add(
				"A URL will be sent to the AssesmentRequestor upon order.");
		af.getReportLanguageCodes().add(LanguageCodeList.EN_US);
		return af;
	}

	private AssessmentAdministrationType createAssessmentAdmin_One() {
		AssessmentAdministrationType aa = new AssessmentAdministrationType();
		aa.setTimeEnforcedIndicator(Boolean.TRUE);
		aa.setProctoredAssessmentIndicator(Boolean.TRUE);
		aa.setTestDuration(createMeasureType("minutes", "25"));
		aa.getAssessmentDeliveryCode().add(
				createAssessmentDeliveryCode("online", Boolean.TRUE));
		return aa;
	}

	private MeasureTextType createMeasureType(String property, String value) {
		MeasureTextType mt = new MeasureTextType();
		mt.setUnitCode(property);
		mt.setValue(value);
		return mt;
	}

	private AssessmentApplicabilityType createAssessmentApplicabilityType() {
		AssessmentApplicabilityType aa = new AssessmentApplicabilityType();
		aa.getAssessedCompetencies().add(
				createSpecifiedCompetency("Record Keeping"));
		return aa;
	}

	private SpecifiedCompetencyType createSpecifiedCompetency(String cName) {
		SpecifiedCompetencyType c = new SpecifiedCompetencyType();
		c.setCompetencyName(cName);
		c.getCompetencyIds().add(createCompetencyIdentifierId(""));
		return c;
	}

	private IdentifierType createCompetencyIdentifierId(String value) {
		IdentifierType id = new IdentifierType();
		id.setValue(value);
		return id;
	}

	private AssessmentPackageType createAssessmentPackageTwo() {
		AssessmentPackageType ap = new AssessmentPackageType();
		ap.getID().add(PACKAGE_ID_02);
		ap.setPackageCost("45.00 US");
		ap.setName("ICD-10 Medical Coding and Billing");
		ap.getDescription().add("skills");
		ap.setAssessmentApplicability(createAssessmentApplicabilityTypeTwo());
		ap.setAssessmentAdministration(createAssessmentAdmin_Two());
		ap.setAssessmentFulfillment(createAssessmentFullfillment_PkgTwo());
		return ap;
	}

	private AssessmentApplicabilityType createAssessmentApplicabilityTypeTwo() {
		AssessmentApplicabilityType aa = new AssessmentApplicabilityType();
		aa.getAssessedCompetencies().add(
				createSpecifiedCompetency("Medical Coding and Billing"));
		return aa;
	}

	private AssessmentAdministrationType createAssessmentAdmin_Two() {
		AssessmentAdministrationType aa = new AssessmentAdministrationType();
		aa.setTimeEnforcedIndicator(Boolean.TRUE);
		aa.setProctoredAssessmentIndicator(Boolean.TRUE);
		aa.setTestDuration(createMeasureType("minutes", "15"));
		aa.getAssessmentDeliveryCode().add(
				createAssessmentDeliveryCode("online", Boolean.TRUE));
		return aa;
	}

	private AssessmentDeliveryCodeType createAssessmentDeliveryCode(
			String code, Boolean required) {
		AssessmentDeliveryCodeType ad = new AssessmentDeliveryCodeType();
		ad.setSchedulingRequiredIndicator(required);
		ad.setValue(code);
		return ad;
	}

	private AssessmentFulfillmentType createAssessmentFullfillment_PkgTwo() {
		AssessmentFulfillmentType af = new AssessmentFulfillmentType();
		af.getDescriptions().add(
				"A URL will be sent to the AssesmentRequestor upon order.");
		af.getReportLanguageCodes().add(LanguageCodeList.EN_US);
		af.getScoreProfileNames().add("Online Test Profile");
		return af;
	}
}
