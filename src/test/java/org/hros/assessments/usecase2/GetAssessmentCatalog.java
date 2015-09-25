package org.hros.assessments.usecase2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.hros.assessments.bod.Serializer;
import org.hros.assessments.model.AssessmentApplicabilityType;
import org.hros.assessments.model.AssessmentCatalogType;
import org.hros.assessments.model.AssessmentPackageType;
import org.hros.assessments.model.SpecifiedCompetencyType;

import junit.framework.TestCase;

public class GetAssessmentCatalog extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}
	private final String FILE_PATH = "./data/Assessments/UseCase02/";
	private final String ALT_ID = "AssessmentsWorkGroup_StepByStepTest_02";
	private final String FILENAME = "Step_01_UC2_GetAssessmentCatalog";	
	private final String SPECIFIED_COMPETENCY = "Medical Billing Process";	
	
	public void testGetAssessmentCatalog(){
		
		try {
			AssessmentCatalogType ac = new AssessmentCatalogType();
			ac.getAlternateDocumentID().add(ALT_ID);
			ac.getAlternateDocumentID().add(FILENAME);
			ac.getAssessmentPackage().add(createAssessmentPackage());
			Serializer.marshalJSON(ac, System.out);
			String filename = FILE_PATH + FILENAME + ".json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(ac, fos);
			fos.close();

			String filename2= FILE_PATH + FILENAME + ".xml";
			File file2 = new File(filename2);
			FileOutputStream fos2 = new FileOutputStream(file2);
			Serializer.marshal(ac, fos2);
			fos2.close();			
		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}
		
	}

	private AssessmentPackageType createAssessmentPackage() {
		AssessmentPackageType ap = new AssessmentPackageType();
		ap.setAssessmentApplicability(createAssessmentApplicabilityType());
		return ap;
	}

	private AssessmentApplicabilityType createAssessmentApplicabilityType() {
		AssessmentApplicabilityType aa = new AssessmentApplicabilityType();
		aa.getAssessedCompetency().add(createSpecifiedCompetency(SPECIFIED_COMPETENCY));
		return aa;
	}

	private SpecifiedCompetencyType createSpecifiedCompetency(String cName) {
		SpecifiedCompetencyType c = new SpecifiedCompetencyType();
		c.setCompetencyName(cName);
		return c;
	}
}
