package org.hros.assessments.components;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
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

public class AssessmentSubjectTypeTest extends TestCase {
	static final String FILENAME = "AssessmentSubjectType";
    final String FILE_PATH = "./data/Assessments/components/";
	final String FILE_PATH_SCHEMA = "./src/main/resources/assessments/json/AssessmentSubjectType.json";

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testAssessmentSubjectType() {

		try {
			String filename = FILE_PATH + FILENAME + "_01.json";
			AssessmentSubjectType ai = new AssessmentSubjectType();
			ai.setPersonName("William Candidate");
			ai.setAgeMeasure(createAgeMeasure(29));
			ai.setBirthDate("01/01/1986");
			ai.setGenderCode(GenderCodeEnumType.MALE);
			ai.setInternalCandidateIndicator(Boolean.TRUE);
			ai.setPrimaryLanguageCode(LanguageCodeList.EN_US);
			ai.setSubjectId(createIdentifierType("subjectId001"));
			ai.setDisabilityIndicator(createEffectiveDateIndicator());
			
			
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

	private EffectiveDatedIndicatorType createEffectiveDateIndicator() {
		EffectiveDatedIndicatorType edi = new EffectiveDatedIndicatorType();
		edi.setValidFrom("start date");
		edi.setValidTo("valid to date");
		return edi;
	}

	private IdentifierType createIdentifierType(String string) {
		IdentifierType id = new IdentifierType();
		id.setValue(string);
		return id;
	}


	private MeasureType createAgeMeasure(int i) {
		MeasureType mt = new MeasureType();
		mt.setValue(BigDecimal.valueOf(i));
		mt.setUnitCode("years");
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
