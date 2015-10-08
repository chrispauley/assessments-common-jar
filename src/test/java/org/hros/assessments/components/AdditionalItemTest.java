package org.hros.assessments.components;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;

import javax.xml.bind.JAXBException;

import org.hros.assessments.bod.Serializer;
import org.hros.assessments.model.*;

import junit.framework.TestCase;

public class AdditionalItemTest extends TestCase {
	static final String FILENAME = "AdditionalItemTest";
	private final String FILE_PATH = "./data/Assessments/components/";	
	
	protected void setUp() throws Exception {
		super.setUp();
	}
	public void testAdditionalItemType(){
		
		try {
			AdditionalItemType ai = new AdditionalItemType();
			ai.setID("ThisIsTheID");
			ai.setName("AdditionalItemName");
			ai.setContent("The content of AdditionalItemType");
			ai.setSequence(BigInteger.valueOf(1));
			ai.getTypeCodes().add(createCodeType("TypeOne"));
			ai.getTypeCodes().add(createCodeType("TypeTwo"));
			
			Serializer.marshalJSON(ai, System.out);
			String filename = FILE_PATH + FILENAME + "_01.json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(ai, fos);
			fos.close();

			String filename2= FILE_PATH + FILENAME + "_01.xml";
			File file2 = new File(filename2);
			FileOutputStream fos2 = new FileOutputStream(file2);
			Serializer.marshal(ai, fos2);
			fos2.close();			
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
