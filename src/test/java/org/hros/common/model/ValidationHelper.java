package org.hros.common.model;

import java.io.IOException;
import java.net.URI;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jsonschema.cfg.LoadingConfiguration;
import com.github.fge.jsonschema.exceptions.ProcessingException;
import com.github.fge.jsonschema.load.Dereferencing;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.report.ProcessingReport;
import com.github.fge.jsonschema.util.JsonLoader;


public class ValidationHelper {
	public static boolean testValidate(String schemaFilePath, String jsonFilePath) {
		boolean result = false;
		
        try {
			final JsonNode fstabSchema = JsonLoader.fromPath(schemaFilePath);
			//"./src/main/resources/Common/json/ExternalIdentifierType.json");
			final JsonNode json1 = JsonLoader.fromPath(jsonFilePath);
				//"./data/Common/base/ExternalIdentifierType_ein.json");

			final LoadingConfiguration cfg = LoadingConfiguration.newBuilder()
			    .dereferencing(Dereferencing.INLINE).freeze();


			final JsonSchemaFactory factory = JsonSchemaFactory.newBuilder()
			    .setLoadingConfiguration(cfg).freeze();

			final com.github.fge.jsonschema.main.JsonSchema schema = factory.getJsonSchema(fstabSchema);

			ProcessingReport report;

			report = schema.validate(json1);
			System.out.println(report);
			
			result = report.isSuccess();

		} catch (IOException | ProcessingException e) {
			e.printStackTrace();
		}
        return result;
	}
}
