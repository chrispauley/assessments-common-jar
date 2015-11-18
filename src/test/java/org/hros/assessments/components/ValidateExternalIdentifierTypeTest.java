package org.hros.assessments.components;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.github.fge.jsonschema.cfg.LoadingConfiguration;
import com.github.fge.jsonschema.exceptions.ProcessingException;
//import com.github.fge.jackson.JacksonUtils;
//import com.github.fge.jsonschema.examples.Utils;
import com.github.fge.jsonschema.load.Dereferencing;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.report.ProcessingReport;
import com.github.fge.jsonschema.util.JsonLoader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;

import javax.xml.bind.JAXBException;

import org.hros.assessments.bod.Serializer;
import org.hros.assessments.model.*;

import junit.framework.TestCase;

public class ValidateExternalIdentifierTypeTest extends TestCase {
	static final String FILENAME = "ExternalIdentifierType";
	static final String FILE_PATH = "./data/Common/base/";
	static final String FILE_PATH_SCHEMA = "./src/main/resources/Common/json/ExternalIdentifierType.json";

	protected void setUp() throws Exception {
		super.setUp();
	}

	public static ExternalIdentifierType create(String schemeName,
			String agencyId, String agencyName, String schemeDataURI,
			String schemeURI, String schemeId, String version, String value) {
		ExternalIdentifierType ei = new ExternalIdentifierType();
		ei.setSchemeName(schemeName);
		ei.setAgencyId(agencyId);
		ei.setAgencyName(agencyName);
		ei.setSchemeDataURI(schemeDataURI);
		ei.setSchemeURI(schemeURI);
		ei.setValue(value);
		ei.setVersionId(version);
		ei.setSchemeId(schemeId);
		return ei;
	}

	public void testValidate() {
        try {
			final JsonNode fstabSchema = JsonLoader.fromPath(FILE_PATH_SCHEMA);
			final JsonNode json1 = JsonLoader.fromPath("./data/Common/base/ExternalIdentifierType_ein.json");
			final JsonNode json2 = JsonLoader.fromPath("./data/Common/base/ExternalIdentifierType_icc.json");
			final JsonNode bad2 = JsonLoader.fromPath("./data/Common/base/TestAmountType_01.json");
//			final JsonNode bad = JsonHelper.loadResource("/fstab-bad.json");
//			final JsonNode bad2 = JsonHelper.loadResource("/fstab-bad2.json");

			final LoadingConfiguration cfg = LoadingConfiguration.newBuilder()
			    .dereferencing(Dereferencing.INLINE).freeze();
			final JsonSchemaFactory factory = JsonSchemaFactory.newBuilder()
			    .setLoadingConfiguration(cfg).freeze();

			final com.github.fge.jsonschema.main.JsonSchema schema = factory.getJsonSchema(fstabSchema);

			ProcessingReport report;

			report = schema.validate(json1);
			System.out.println(report);

			report = schema.validate(json2);
			System.out.println(report);

			report = schema.validate(bad2);
			System.out.println(report);
		} catch (IOException | ProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
