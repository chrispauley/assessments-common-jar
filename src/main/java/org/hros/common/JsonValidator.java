package org.hros.common;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jsonschema.exceptions.ProcessingException;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.report.ProcessingMessage;
import com.github.fge.jsonschema.report.ProcessingReport;
import com.github.fge.jsonschema.util.JsonLoader;

public class JsonValidator {

	static final String FILE_PATH = "Common/base/";

	public static void main(String[] args) {
		System.out.println("Starting Json Validation.");
		// JsonValidationExample app = new JsonValidationExample();
		String jsonData = "\"Redemption\"";
		String jsonSchema = "{ \"type\": \"string\", \"minLength\": 2, \"maxLength\": 11}";
		if (validate(jsonData, jsonSchema)) {
			System.out.println("One");
		}
		jsonData = "Agony"; // Quotes not included
		if (validate(jsonData, jsonSchema)) {
			System.out.println("Two - Quotes missing.");
		}

		jsonData = "42";
		if (validate(jsonData, jsonSchema)) {
			System.out.println("Three");
		}
		jsonData = "\"A\"";
		if (validate(jsonData, jsonSchema)) {
			System.out.println("Four");
		}
		jsonData = "\"The pity of Bilbo may rule the fate of many.\"";
		if (validate(jsonData, jsonSchema)) {
			System.out.println("Five");
		}
	}

	public static boolean validate(String jsonData, String jsonSchema) {
		ProcessingReport report = null;
		boolean result = false;
		try {
			System.out.println("Applying schema: " + jsonSchema
					+ " to data: \n" + jsonData + "\n");

			JsonNode schemaNode = JsonLoader.fromString(jsonSchema);
			JsonNode data = JsonLoader.fromString(jsonData);
			JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
			JsonSchema schema = factory.getJsonSchema(schemaNode);
			report = schema.validate(data);

		} catch (JsonParseException jpex) {
			System.out
					.println("Error. Something went wrong trying to parse json data: \n"
							+ jsonData
							+ "\n or json schema: "
							+ jsonSchema
							+ ". Are the double quotes included? "
							+ jpex.getMessage());
			// jpex.printStackTrace();
		} catch (ProcessingException pe) {
			System.out
					.println("Error. Something went wrong trying to process json data: \n"
							+ jsonData
							+ " with json schema: "
							+ jsonSchema
							+ " " + pe.getMessage());
			// pe.printStackTrace();
		} catch (IOException e) {
			System.out
					.println("Error. Something went wrong trying to read json data: \n"
							+ jsonData + " or json schema: " + jsonSchema + "");
			// e.printStackTrace();
		}
		if (report != null) {
			Iterator<ProcessingMessage> iter = report.iterator();
			while (iter.hasNext()) {
				ProcessingMessage pm = iter.next();
				System.out.println("\nProcessing Message: " + pm.getMessage());
			}
			result = report.isSuccess();
		}
		System.out.println(" Result=" + result);
		return result;
	}

	public static String readFile(String filename) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				line = br.readLine();
			}
			br.close();
			return sb.toString();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
}
