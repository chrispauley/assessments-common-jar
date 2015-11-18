package org.hros.assessments.components;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.hros.assessments.bod.Serializer;
import org.hros.assessments.model.*;

import junit.framework.TestCase;

public class AssessmentDeliveryCodeTest extends TestCase {
	static final String FILENAME = "AssessmentDeliveryCodeTest";
	private final String FILE_PATH = "./data/Assessments/components/";	
	
	protected void setUp() throws Exception {
		super.setUp();
	}
	public void testAssessmentDeliveryCodeType(){
		
		try {
			AssessmentDeliveryCodeType adc = new AssessmentDeliveryCodeType();
			adc.setSchedulingRequiredIndicator(true);
			adc.setValue("CodeTypevalueGoesHere");
			
			
			Serializer.marshalJSON(adc, System.out);
			String filename = FILE_PATH + FILENAME + "_01.json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(adc, fos);
			fos.close();

//			String filename2= FILE_PATH + FILENAME + "_01.xml";
//			File file2 = new File(filename2);
//			FileOutputStream fos2 = new FileOutputStream(file2);
//			Serializer.marshal(adc, fos2);
//			fos2.close();			
		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}
		
	}
	private CodeType createCodeType(String value) {
		CodeType ct = new CodeType();
		ct.setValue(value);
		return ct;
	}
	
	
}
