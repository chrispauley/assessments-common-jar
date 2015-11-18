package org.hros.assessments.components;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Iterator;

import javax.xml.bind.JAXBException;

import org.hros.assessments.bod.Serializer;
import org.hros.assessments.model.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jsonschema.cfg.LoadingConfiguration;
import com.github.fge.jsonschema.exceptions.ProcessingException;
import com.github.fge.jsonschema.load.Dereferencing;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.report.ProcessingMessage;
import com.github.fge.jsonschema.report.ProcessingReport;
import com.github.fge.jsonschema.util.JsonLoader;

import junit.framework.TestCase;

public class IdentifierTypeTest extends TestCase {
	static final String FILENAME = "IdentifierTypeTest";
    final String FILE_PATH = "./data/Assessments/components/";
	final String FILE_PATH_SCHEMA = "./src/main/resources/assessments/json/assessmentsCommon.json";

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testIdentifierType() {

		try {
			IdentifierType ai = new IdentifierType();
			ai.setValue("123456789");
			ai.setSchemeName("US-Federal Employer Identification Number");
			ai.setSchemeID("US-EIN");
			ai.setSchemeAgencyID("IRS");
			ai.setSchemeAgencyName("Internal Revenue Service");
			ai.setSchemeURI("https://www.us.gov/burearu_of_schemas/irs/ein_schema.json");
			ai.setSchemeDataURI("https://www.us.gov/burearu_of_schemas/irs/");
			ai.setSchemeVersionID("1.1");


			Serializer.marshalJSON(ai, System.out);
			String filename = FILE_PATH + FILENAME + "_01.json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(ai, fos);
			fos.close();

//			String filename2 = FILE_PATH + FILENAME + "_01.xml";
//			File file2 = new File(filename2);
//			FileOutputStream fos2 = new FileOutputStream(file2);
//			Serializer.marshal(ai, fos2);
//			fos2.close();
		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}

	}
	
	public void testMultipleIdentifierType() {

		try {
			IdentifierType ai = new IdentifierType();
			ai.setValue("123456789");
			ai.setSchemeName("US-Federal Employer Identification Number");
			ai.setSchemeID("US-EIN");
			ai.setSchemeAgencyID("IRS");
			ai.setSchemeAgencyName("Internal Revenue Service");
			ai.setSchemeURI("https://www.us.gov/burearu_of_schemas/irs/ein_schema.json");
			ai.setSchemeDataURI("https://www.us.gov/burearu_of_schemas/irs/");
			ai.setSchemeVersionID("1.1");


			Serializer.marshalJSON(ai, System.out);
			String filename = FILE_PATH + FILENAME + "_01.json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(ai, fos);
			fos.close();

//			String filename2 = FILE_PATH + FILENAME + "_01.xml";
//			File file2 = new File(filename2);
//			FileOutputStream fos2 = new FileOutputStream(file2);
//			Serializer.marshal(ai, fos2);
//			fos2.close();
		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}

	}

	public void testValidate_AdditionalItemType() {
		String filename = FILE_PATH + FILENAME + "_01.json";
		System.out.println("Validating: " + filename + "\n\t" + this.FILE_PATH_SCHEMA);
		try {
			JsonNode fstabSchema = JsonLoader.fromPath(FILE_PATH_SCHEMA);
			JsonNode json1 = JsonLoader.fromPath(filename);

			LoadingConfiguration cfg = LoadingConfiguration.newBuilder()
					.dereferencing(Dereferencing.INLINE).freeze();
			JsonSchemaFactory factory = JsonSchemaFactory.newBuilder()
					.setLoadingConfiguration(cfg).freeze();

			com.github.fge.jsonschema.main.JsonSchema schema = factory
					.getJsonSchema(fstabSchema);

			ProcessingReport report;

			report = schema.validate(json1);
			System.out.println(report);
			if (report != null) {
				Iterator<ProcessingMessage> iter = report.iterator();
				while (iter.hasNext()) {
					ProcessingMessage pm = iter.next();
					System.out.println("\nProcessing Message: " + pm.getMessage());
				}
			}

		} catch (IOException | ProcessingException e) {
			e.printStackTrace();
		}
	}
}
