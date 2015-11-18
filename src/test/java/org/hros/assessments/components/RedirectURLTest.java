package org.hros.assessments.components;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
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

public class RedirectURLTest extends TestCase {
	static final String FILENAME = "RedirectURLTest";
	final String FILE_PATH = "./data/Assessments/components/";
	final String FILE_PATH_SCHEMA = "./src/main/resources/assessments/json/redirectURL.json";

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testRedirectURLType() {

		try {
			String filename = FILE_PATH + FILENAME + "_01.json";
			RedirectURLType ai = new RedirectURLType();
			//ai.setAgencyId(createAgencyId("agencyIdValueHere"));
			ai.setValidFrom("Today");
			ai.setValidTo("Tomorrow");
			ai.setMessage("Message goes here.");
			ai.setStatusCode("Code goes here");
			ai.setURI("http://www.example.com/api/v1/resource?nextAssessmentStep=2&userId=123456");
			ai.setTimeOut(BigInteger.valueOf(60000));
			
			Serializer.marshalJSON(ai, System.out);
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(ai, fos);
			fos.close();

			this.testValidate(filename);

		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}




	public void testValidate(String instance) {

		System.out.println("\nValidating: " + instance + "\n\t"
				+ this.FILE_PATH_SCHEMA);
		try {
			JsonNode fstabSchema = JsonLoader.fromPath(FILE_PATH_SCHEMA);
			JsonNode json1 = JsonLoader.fromPath(instance);

			LoadingConfiguration cfg = LoadingConfiguration.newBuilder()
					.dereferencing(Dereferencing.CANONICAL).freeze();
			
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
