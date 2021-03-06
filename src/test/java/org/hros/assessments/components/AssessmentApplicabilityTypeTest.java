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

public class AssessmentApplicabilityTypeTest extends TestCase {
	static final String FILENAME = "AssessmentApplicabilityType";
	final String FILE_PATH = "./data/Assessments/components/";
	final String FILE_PATH_SCHEMA = "./src/main/resources/assessments/json/assessmentsCommon.json";

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testAssessmentApplicabilityType() {

		try {
			String filename = FILE_PATH + FILENAME + "_01.json";
			AssessmentApplicabilityType ai = new AssessmentApplicabilityType();
			ai.getApplicableRegions().add(
					createJurisdictionType(CountryCodeEnumType.US, "", ""));
			ai.getApplicableRegions().add(
					createJurisdictionType(CountryCodeEnumType.MX, "", ""));
			ai.getApplicableRegions().add(
					createJurisdictionType(CountryCodeEnumType.CA, "", "English Speaking Canada"));

			ai.getAssessmentTypeCodes().add(AssessmentTypeCodeEnumType.ABILITY);
			ai.getAvailableLanguageCodes().add(LanguageCodeList.EN_US);
			ai.getAvailableLanguageCodes().add(LanguageCodeList.ES);
			
			ai.getAssessedCompetencies().add(createSpecifiedCompencyType());

			ai.getDescriptions().add("testAssessmentApplicabilityType");
			ai.getDescriptions().add("filename is: " + FILENAME + "_01.json");
			
			ai.getJobCategoryCodes().add(createCodeType("JC_001"));
			ai.getJobCategoryCodes().add(createCodeType("JC_002"));
			
			ai.setCareerLevelCode(CareerLevelCodeType.MID_CAREER);

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

	private SpecifiedCompetencyType createSpecifiedCompencyType() {
		SpecifiedCompetencyType sc = new SpecifiedCompetencyType();
		sc.setCompetencyName("Competency Name");
		sc.setProficiencyLevel(createBaseScoreType());
		sc.getCompetencyIds().add(createIdentifierType("CID_001"));
		return sc;
	}

	private IdentifierType createIdentifierType(String string) {
		IdentifierType id = new IdentifierType();
		id.setValue(string);
		return id;
	}

	private BaseScoreType createBaseScoreType() {
		BaseScoreType bst = new BaseScoreType();
		bst.getScoreText().add("base score type text");
		return bst;
	}

	private JurisdictionType createJurisdictionType(CountryCodeEnumType cc,
			String city, String subdiv) {
		JurisdictionType jt = new JurisdictionType();
		if (city.length() > 0) {
			jt.setCityName(city);
		}
		if (subdiv.length() > 0) {
			jt.getCountrySubDivisionCodes().add(subdiv);
		}
		jt.setCountryCode(cc);
		return jt;
	}

	private CodeType createCodeType(String value) {
		CodeType ct = new CodeType();
		ct.setValue(value);
		return ct;
	}

	public void testValidate(String instance) {

		System.out.println("\nValidating: " + instance + "\n\t"
				+ this.FILE_PATH_SCHEMA);
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
