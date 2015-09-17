package org.hros.assessments.bod;

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
import org.hros.assessments.model.LanguageCodeEnumType;
import org.hros.assessments.model.MeasureTextType;
import org.hros.assessments.model.PartyType;
import org.hros.assessments.model.PersonContactType;
import org.hros.assessments.model.PersonNameType;
import org.hros.assessments.model.SpecifiedCompetencyType;
import org.hros.common.model.Serializer;
 
import junit.framework.TestCase;

public class ShowAssessmentCatalog extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testShowAssessmentCatalog(){
		
		try {
			AssessmentCatalogType ac = new AssessmentCatalogType();
			ac.setSupplierParty(createSupplierParty());
			
			ac.getAssessmentPackage().add(createAssessmentPackageOne());
			ac.getAssessmentPackage().add(createAssessmentPackageTwo());
			Serializer.marshalJSON(ac, System.out);
			String filename = "./data/Assessments/" + ShowAssessmentCatalog.class.getSimpleName() + ".json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(ac, fos);
			fos.close();
			
			String filename2 = "./data/Assessments/" + ShowAssessmentCatalog.class.getSimpleName() + ".xml";
			File file2 = new File(filename2);
			FileOutputStream fos2 = new FileOutputStream(file2);
			Serializer.marshal(ac, fos2);
			fos.close();
		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}
		 
	}

	private PartyType createSupplierParty() {
		PartyType pt = new PartyType();
//		pt.setPartyName("Healthcare SKA Assessments, Inc.");
		pt.setPartyTaxID(createIdentifier("Healthcare SKA Assessments, Inc."));
		return pt;
	}

	private IdentifierType createIdentifier(String value) {
		IdentifierType id = new IdentifierType();
		id.setValue(value);
		return id;
	}


	private AssessmentPackageType createAssessmentPackageOne() {
		AssessmentPackageType ap = new AssessmentPackageType();
		ap.getID().add("package_001");
		ap.setPackageCost("15.00 US");
		ap.setName("Healthcare Record Keeping Assessment");
		ap.getDescription().add("skills");
		ap.setAssessmentApplicability(createAssessmentApplicabilityType());
		ap.setAssessmentAdministration(createAssessmentAdmin_One());
		ap.setAssessmentFulfillment(createAssessmentFullfillment_PkgOne());
		return ap;
	}

	private AssessmentFulfillmentType createAssessmentFullfillment_PkgOne() {
		AssessmentFulfillmentType af = new AssessmentFulfillmentType();
		af.getDescription().add("A URL will be sent to the AssesmentRequestor upon order.");
		af.getReportLanguageCode().add(LanguageCodeEnumType.EN_US);
		return af;
	}

	private AssessmentAdministrationType createAssessmentAdmin_One() {
		AssessmentAdministrationType aa = new AssessmentAdministrationType();
		aa.setTimeEnforcedIndicator(Boolean.TRUE);
		aa.setProctoredAssessmentIndicator(Boolean.TRUE);
		aa.setTestDuration(createMeasureType("minutes", "5"));
		aa.getAssessmentDeliveryCode().add(createAssessmentDeliveryCode("online", Boolean.TRUE));
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
		aa.getAssessedCompetency().add(createSpecifiedCompetency("Record Keeping"));		
		return aa;
	}

	private SpecifiedCompetencyType createSpecifiedCompetency(String cName) {
		SpecifiedCompetencyType c = new SpecifiedCompetencyType();
		c.setCompetencyName(cName);
		c.getCompetencyID().add(createCompetencyIdentifierId());
		return c;
	}
	
	
	private IdentifierType createCompetencyIdentifierId() {
		// TODO Auto-generated method stub
		return null;
	}

	private AssessmentPackageType createAssessmentPackageTwo() {
		AssessmentPackageType ap = new AssessmentPackageType();
		ap.getID().add("package_002");
		ap.setPackageCost("45.00 US");
		ap.setName("Healthcare Scheduling Assessment");
		ap.getDescription().add("skills");
		ap.setAssessmentApplicability(createAssessmentApplicabilityTypeTwo());
		ap.setAssessmentAdministration(createAssessmentAdmin_Two());
		ap.setAssessmentFulfillment(createAssessmentFullfillment_PkgTwo());
		return ap;
	}

	private AssessmentApplicabilityType createAssessmentApplicabilityTypeTwo() {
		AssessmentApplicabilityType aa = new AssessmentApplicabilityType();
		aa.getAssessedCompetency().add(createSpecifiedCompetency("Scheduling"));		
		return aa;
	}
	
	private AssessmentAdministrationType createAssessmentAdmin_Two() {
		AssessmentAdministrationType aa = new AssessmentAdministrationType();
		aa.setTimeEnforcedIndicator(Boolean.TRUE);
		aa.setProctoredAssessmentIndicator(Boolean.TRUE);
		aa.setTestDuration(createMeasureType("minutes", "15"));
		aa.getAssessmentDeliveryCode().add(createAssessmentDeliveryCode("online", Boolean.TRUE));
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
		af.getDescription().add("A URL will be sent to the AssesmentRequestor upon order.");
		af.getReportLanguageCode().add(LanguageCodeEnumType.EN_US);
		af.getScoreProfileName().add("Online Test Profile");
		return af;
	}
}
