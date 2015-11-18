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

public class AssessmentAdministrationTypeTest extends TestCase {
	static final String FILENAME = "AssessmentAdministrationType";
    final String FILE_PATH = "./data/Assessments/components/";
	final String FILE_PATH_SCHEMA = "./src/main/resources/assessments/json/assessmentsCommon.json";

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testAssessmentAdministrationType() {

		try {
			String filename = FILE_PATH + FILENAME + "_01.json";
			AssessmentAdministrationType ai = new AssessmentAdministrationType();
			ai.setProctoredAssessmentIndicator(Boolean.TRUE);
			ai.setTimeEnforcedIndicator(Boolean.TRUE);
			ai.setTestDuration(createMeasureTextType("minutes","25"));
			ai.getDescriptions().add("testAssessmentAdministrationType");
			ai.getDescriptions().add("filename is: " +FILENAME + "_01.json");
			ai.getAssessmentDeliveryCodes().add(createAssessmentDeliverCode(true, "online"));
			ai.getAssessmentDeliveryCodes().add(createAssessmentDeliverCode(true, "telephone"));

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

	private AssessmentDeliveryCodeType createAssessmentDeliverCode(Boolean scheduled, String type) {
		AssessmentDeliveryCodeType adc = new AssessmentDeliveryCodeType();
		adc.setSchedulingRequiredIndicator(scheduled);
		adc.setValue(type);
		return adc;
	}

	private MeasureTextType createMeasureTextType(String units, String value) {
		MeasureTextType mt = new MeasureTextType();
		mt.setUnitCode(units);
		mt.setValue(value);
		return mt;
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
