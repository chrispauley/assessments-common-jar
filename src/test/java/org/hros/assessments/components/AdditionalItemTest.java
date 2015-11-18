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

public class AdditionalItemTest extends TestCase {
	static final String FILENAME = "AdditionalItemTest";
    final String FILE_PATH = "./data/Assessments/components/";
	final String FILE_PATH_SCHEMA = "./src/main/resources/assessments/json/assessmentsCommon.json";

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testAdditionalItemType() {

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

			String filename2 = FILE_PATH + FILENAME + "_01.xml";
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
