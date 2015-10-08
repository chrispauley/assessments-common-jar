package org.hros.assessments.components;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.hros.assessments.bod.Serializer;
import org.hros.assessments.model.*;

import junit.framework.TestCase;

public class AssessmentFulfillmentTypeTest extends TestCase {
	static final String FILENAME = "AssessmentFulfillmentTypeTest";
	private final String FILE_PATH = "./data/Assessments/components/";	
	
	protected void setUp() throws Exception {
		super.setUp();
	}
	public void testAssessmentFulfillmentTypeTest(){
		
		try {
			AssessmentFulfillmentType adc = new AssessmentFulfillmentType();
			adc.getDescriptions().add("Description one");
			adc.getDescriptions().add("Description two");
			adc.getDescriptions().add("Description Three");
			adc.getEffectivePeriodDescriptions().add(createMeasureTextType("valueGoesHere", "units"));
			adc.getEffectivePeriodDescriptions().add(createMeasureTextType("1", "hour"));
			adc.getEffectivePeriodDescriptions().add(createMeasureTextType("35", "minutes"));
			adc.getReportLanguageCodes().add(LanguageCodeList.EN_US);
			adc.getReportLanguageCodes().add(LanguageCodeList.EN_CA);
			adc.getScoreProfileNames().add("ScoreProfileNameGoesHere");
			adc.getScoreProfileNames().add("Profile_001");

			Serializer.marshalJSON(adc, System.out);
			String filename = FILE_PATH + FILENAME + "_01.json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(adc, fos);
			fos.close();

			String filename2= FILE_PATH + FILENAME + "_01.xml";
			File file2 = new File(filename2);
			FileOutputStream fos2 = new FileOutputStream(file2);
			Serializer.marshal(adc, fos2);
			fos2.close();			
		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}
		
	}

	private MeasureTextType createMeasureTextType(String value, String unitCode) {
		MeasureTextType mt = new MeasureTextType();
		mt.setUnitCode(unitCode);
		mt.setValue(value);
		return mt;
	}
	private CodeType createCodeType(String value) {
		CodeType ct = new CodeType();
		ct.setValue(value);
		return ct;
	}
	
	
}
