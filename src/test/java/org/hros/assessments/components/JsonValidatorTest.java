package org.hros.assessments.components;

import junit.framework.TestCase;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Iterator;

import org.hros.common.model.AmountType;
import org.hros.common.model.BaseTypesHelper;
import org.hros.common.model.CurrencyCodeList;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jsonschema.exceptions.ProcessingException;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.report.ProcessingMessage;
import com.github.fge.jsonschema.report.ProcessingReport;
import com.github.fge.jsonschema.util.JsonLoader;

public class JsonValidatorTest extends TestCase {
	static final String FILENAME = "BaseTest";
	static final String FILENAME_AmountType = "AmountType_Test01";
	static final String FILE_PATH = "Common/base/";
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testAmountType() {
		BaseTypesHelper helper = new BaseTypesHelper();
		AmountType at = helper.readJSON(FILE_PATH + "testAmountType_01.json");
		helper.showJSON(at);
		
		assertTrue(true);
	}
	
	public static void main(String[] args)
	{
	    System.out.println( "Starting Json Validation." );
//	    JsonValidationExample app = new JsonValidationExample();
	    String jsonData = "\"Redemption\"";
	    String jsonSchema = "{ \"type\": \"string\", \"minLength\": 2, \"maxLength\": 11}";
	    if (validate(jsonData, jsonSchema)){
	    	System.out.println("One");
	    }
	    jsonData = "Agony";  // Quotes not included
	    if (validate(jsonData, jsonSchema)){
	    	System.out.println("Two - Quotes missing.");
	    }	    

	    jsonData = "42";
	    if (validate(jsonData, jsonSchema)){
	    	System.out.println("Three");
	    }
	    jsonData = "\"A\"";
	    if (validate(jsonData, jsonSchema)){
	    	System.out.println("Four");
	    }
	    jsonData = "\"The pity of Bilbo may rule the fate of many.\"";
	    if (validate(jsonData, jsonSchema)){
	    	System.out.println("Five");
	    }
	}
	
	public static boolean validate(String jsonData, String jsonSchema) {
	    ProcessingReport report = null;
	    boolean result = false;
	    try {
	        System.out.println("Applying schema: @<@<"+jsonSchema+">@>@ to data: #<#<"+jsonData+">#>#");
	        JsonNode schemaNode = JsonLoader.fromString(jsonSchema);
	        JsonNode data = JsonLoader.fromString(jsonData);         
	        JsonSchemaFactory factory = JsonSchemaFactory.byDefault(); 
	        JsonSchema schema = factory.getJsonSchema(schemaNode);
	        report = schema.validate(data);
	    } catch (JsonParseException jpex) {
	        System.out.println("Error. Something went wrong trying to parse json data: #<#<"+jsonData+
	                ">#># or json schema: @<@<"+jsonSchema+">@>@. Are the double quotes included? "+jpex.getMessage());
	        //jpex.printStackTrace();
	    } catch (ProcessingException pex) {  
	        System.out.println("Error. Something went wrong trying to process json data: #<#<"+jsonData+
	                ">#># with json schema: @<@<"+jsonSchema+">@>@ "+pex.getMessage());
	        //pex.printStackTrace();
	    } catch (IOException e) {
	        System.out.println("Error. Something went wrong trying to read json data: #<#<"+jsonData+
	                ">#># or json schema: @<@<"+jsonSchema+">@>@");
	        //e.printStackTrace();
	    }
	    if (report != null) {
	        Iterator<ProcessingMessage> iter = report.iterator();
	        while (iter.hasNext()) {
	            ProcessingMessage pm = iter.next();
	            System.out.println("Processing Message: "+pm.getMessage());
	        }
	        result = report.isSuccess();
	    }
	    System.out.println(" Result=" +result);
	    return result;
	}
}
