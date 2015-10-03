package org.hros.assessments.bod;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.xml.bind.JAXBException;

import junit.framework.TestCase;

import org.hros.common.model.*;
import org.hros.assessments.model.*;

public class GetAssessmentCatalog extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}
	private final String ALT_ID = "AssessmentsWorkGroup_StepByStepTest_01";
	private final String FILENAME = "Step_01_GetAssessmentCatalog";	
	
	public void testGetAssessmentCatalog(){
		
		try {
			AssessmentCatalogType ac = new AssessmentCatalogType();
			ac.getAlternateDocumentIds().add(ALT_ID);
			ac.getAlternateDocumentIds().add(FILENAME);
			ac.getAssessmentPackages().add(createAssessmentPackage());
			Serializer.marshalJSON(ac, System.out);
			String filename = "./data/Assessments/" + FILENAME + ".json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(ac, fos);
			fos.close();

			String filename2 = "./data/Assessments/" + FILENAME + ".xml";
			File file2 = new File(filename2);
			FileOutputStream fos2 = new FileOutputStream(file2);
			Serializer.marshal(ac, fos2);
			fos.close();			
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
		aa.getAssessedCompetencies().add(createSpecifiedCompetency("Record Keeping"));
		aa.getAssessedCompetencies().add(createSpecifiedCompetency("Scheduling"));		
		return aa;
	}

	private SpecifiedCompetencyType createSpecifiedCompetency(String cName) {
		SpecifiedCompetencyType c = new SpecifiedCompetencyType();
		c.setCompetencyName(cName);
		return c;
	}
}
