package org.hros.assessments.components;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;

import javax.xml.bind.JAXBException;

import org.hros.assessments.bod.Serializer;
import org.hros.assessments.model.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jsonschema.cfg.LoadingConfiguration;
import com.github.fge.jsonschema.exceptions.ProcessingException;
import com.github.fge.jsonschema.load.Dereferencing;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.report.ProcessingReport;
import com.github.fge.jsonschema.util.JsonLoader;

import junit.framework.TestCase;

public class AccessPointTypeTest extends TestCase {
	static final String FILENAME = "AccessPointType";
    final String FILE_PATH = "./data/Assessments/components/";
	final String FILE_PATH_SCHEMA = "./src/main/resources/assessments/json/assessmentsCommon.json";

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testAccessPointType_01() {

		try {
			String filename = FILE_PATH + FILENAME + "_01.json";
			AccessPointType ai = new AccessPointType();
			ai.setTypeCode("type access point");
			ai.setURI("http://test.ats-company.com/assessment/v1/test");
			ai.setUserId("user001");
			ai.setValidFrom("2015-11-01");
			ai.setValidTo("2015-11-30");
			ai.getAccessCredential().add(this.createAccessCredentialType());
			
			Serializer.marshalJSON(ai, System.out);
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(ai, fos);
			fos.close();

			this.testValidate(filename);

		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}

	}

	private LoginInformationType createLoginInformationType() {
		LoginInformationType li = new LoginInformationType();
		li.setUserId("userId_01");
		li.getAccessCredentials().add(createAccessCredentialType());
		return li;
	}

	private AccessCredentialType createAccessCredentialType() {
		AccessCredentialType ac = new AccessCredentialType();
		ac.setAccessCredentialTypeCode(createCodeType("login"));
		ac.setAccessCredentialValue("password001");
		return ac;
	}

	private CodeType createCodeType(String value) {
		CodeType ct = new CodeType();
		ct.setValue(value);
		return ct;
	}

	public void testValidate(String instance) {

		System.out.println("\nValidating: " + instance + "\n\t" + this.FILE_PATH_SCHEMA);
		try {
			JsonNode fstabSchema = JsonLoader.fromPath(FILE_PATH_SCHEMA);
			JsonNode json1 = JsonLoader.fromPath(instance);

			LoadingConfiguration cfg = LoadingConfiguration.newBuilder()
					.dereferencing(Dereferencing.INLINE).freeze();
			JsonSchemaFactory factory = JsonSchemaFactory.newBuilder()
					.setLoadingConfiguration(cfg).freeze();

			com.github.fge.jsonschema.main.JsonSchema schema = factory
					.getJsonSchema(fstabSchema);

			ProcessingReport report;

			report = schema.validate(json1);
			System.out.println(report);

		} catch (IOException | ProcessingException e) {
			e.printStackTrace();
		}
	}
}
