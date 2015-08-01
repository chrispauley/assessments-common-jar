package org.hra.assessments.model;
import org.hra.model.bod.*;

import java.math.BigInteger;

import junit.framework.TestCase;

public class AssessmentOrderJSONTest_uc_01 extends TestCase {

	public AssessmentOrderJSONTest_uc_01(String name) {
		super(name);
	}
	private AssessmentOrderJSONType createAssessmentOrderJSONType() {
		AssessmentOrderJSONType aoj = new AssessmentOrderJSONType();
		aoj.setLanguageCode("en-US");
		aoj.setReleaseID("4.0");
		aoj.setSystemEnvironmentCode("dev");
		
		
		
		AssessmentOrderType ao = new AssessmentOrderType();
		
		aoj.setClientID("cliend-id-001");
		aoj.setClientPwd("509FGJHG999");
		aoj.setCustomerName("ClientNameGoesHere");
		aoj.setAssessmentID("AId-00001");
		aoj.setJobTitleID("jobTitle");
		aoj.setFirstName("Chris");
		aoj.setLastName("Pauley");
		aoj.setEmail("myemail@gmail.com");
		aoj.setExternalApplicationID("extID12345");
		aoj.setExternalJobReqID("ExtJobReqId8763874638");
		aoj.setOrderID("orderid-0001");
		aoj.setReturnURL("https://api.ats_world.com/rest/assessments/orderid-0001");
		ao.setDocumentID("00001");
		
		
		return aoj;
	}
	



    public void testProcessAssessmentOrderType_Save()
    {
//    	ProcessAssessmentOrder pao = this.createAssessmentOrderType();
//    	ProcessAssessmentOrderHelper.writeProcessOrderTypeXML(pao, "test01.xml");
//    	System.out.println("\n====JSON====");
//    	ProcessAssessmentOrderHelper.writeProcessOrderTypeJSON(pao, "test01.json");
        assertTrue(true);
    }
	
    public void testAssessmentOrderJSONType_XML()
    {
    	AssessmentOrderJSONType aoj = this.createAssessmentOrderJSONType();
    	AssessmentOrderJSONHelper.showAssessmentOrderJSONType_XML(aoj);
        assertTrue(true);
    }
	

    public void testAssessmentOrderJSON_ShowJsonOutput()
    {
    	AssessmentOrderJSONType obj = this.createAssessmentOrderJSONType();
    	AssessmentOrderJSONHelper.showAssessmentOrderJSONType(obj);
        assertTrue(true);
    } 
    
    public void testReadAssessmentOrderJSONType_XML()
    {
    	AssessmentOrderJSONHelper helper = new AssessmentOrderJSONHelper();
//    	String filename = "testProcessAssessmentOrder_01.xml";
//    	AssessmentOrderJSON pao = helper.readAssessmentOrderJSONXML(filename);
//    	AssessmentOrderJSONHelper.showAssessmentOrderJSONTypeXML(pao);
        assertTrue(true);
    }
    
    public void testReadAssessmentOrderJSONType_JSON()
    {
//    	AssessmentOrderJSONHelper helper = new AssessmentOrderJSONHelper();
//    	String filename = "test01.json";
//    	ProcessAssessmentOrder pao = helper.readProcessAssessmentOrderJSON(filename);
//    	ProcessAssessmentOrderHelper.showProcessAssessmentOrderTypeJSON(pao);
        assertTrue(true);
    }
    
}
