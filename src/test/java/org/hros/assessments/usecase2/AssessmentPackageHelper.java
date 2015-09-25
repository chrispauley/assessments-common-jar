package org.hros.assessments.usecase2;

import org.hros.assessments.model.AssessmentAdministrationType;
import org.hros.assessments.model.AssessmentApplicabilityType;
import org.hros.assessments.model.AssessmentDeliveryCodeType;
import org.hros.assessments.model.AssessmentFulfillmentType;
import org.hros.assessments.model.AssessmentPackageType;
import org.hros.assessments.model.IdentifierType;
import org.hros.assessments.model.LanguageCodeList;
import org.hros.assessments.model.MeasureTextType;
import org.hros.assessments.model.SpecifiedCompetencyType;

public class AssessmentPackageHelper {

	

	static public AssessmentPackageType createAssessmentPackage(String id, String cost, String name, String Description) {
		AssessmentPackageType ap = new AssessmentPackageType();
		ap.getID().add(id);
		ap.setPackageCost(cost);
		ap.setName(name);
		ap.getDescription().add("skills");
		ap.setAssessmentApplicability(createAssessmentApplicabilityType());
		ap.setAssessmentAdministration(createAssessmentAdministration());
		ap.setAssessmentFulfillment(createAssessmentFullfillment("A redirectURL available upon order."));
		return ap;
	}
	

	static public AssessmentApplicabilityType createAssessmentApplicabilityType() {
		AssessmentApplicabilityType aa = new AssessmentApplicabilityType();
		aa.getAssessedCompetency().add(createSpecifiedCompetency("Record Keeping", "001"));		
		return aa;
	}

	static public SpecifiedCompetencyType createSpecifiedCompetency(String cName, String competencyId) {
		SpecifiedCompetencyType c = new SpecifiedCompetencyType();
		c.setCompetencyName(cName);
		c.getCompetencyID().add(createCompetencyIdentifierId(competencyId));
		return c;
	}
	
	static public IdentifierType createCompetencyIdentifierId(String value) {
		IdentifierType id = new IdentifierType();
		id.setValue(value);
		return id;
	}
	
	static public AssessmentAdministrationType createAssessmentAdministration() {
		AssessmentAdministrationType aa = new AssessmentAdministrationType();
		aa.setTimeEnforcedIndicator(Boolean.TRUE);
		aa.setProctoredAssessmentIndicator(Boolean.TRUE);
		aa.setTestDuration(createMeasureType("minutes", "25"));
		aa.getAssessmentDeliveryCode().add(createAssessmentDeliveryCode("online", Boolean.TRUE));
		return aa;
	}

	static public MeasureTextType createMeasureType(String property, String value) {
		MeasureTextType mt = new MeasureTextType();
		mt.setUnitCode(property);
		mt.setValue(value);
		return mt;
	}	
	
	static public AssessmentFulfillmentType createAssessmentFullfillment(String message) {
		AssessmentFulfillmentType af = new AssessmentFulfillmentType();
		af.getDescription().add(message);
		af.getReportLanguageCode().add(LanguageCodeList.EN_US);
		return af;
	}
	
	static public AssessmentDeliveryCodeType createAssessmentDeliveryCode(
			String code, Boolean required) {
		AssessmentDeliveryCodeType ad = new AssessmentDeliveryCodeType();
		ad.setSchedulingRequiredIndicator(required);
		ad.setValue(code);
		return ad;
	}
}
