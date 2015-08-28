package org.hros.assessments.model;

import java.math.BigInteger;

import org.hros.assessments.model.ApplicationAreaType;
import org.hros.assessments.model.AssessmentOrderType;
import org.hros.assessments.model.AssessmentSubjectType;
import org.hros.assessments.model.DataAreaType;
import org.hros.assessments.model.IdentifierType;
import org.hros.assessments.model.PartyType;
import org.hros.assessments.model.ProcessAssessmentOrder;

import junit.framework.TestCase;

public class ProcessAssessmentOrderTest_uc_01 extends TestCase {

	public ProcessAssessmentOrderTest_uc_01(String name) {
		super(name);
	}
	private ProcessAssessmentOrder createAssessmentOrderType() {
		ProcessAssessmentOrder pao = new ProcessAssessmentOrder();
		pao.setLanguageCode("en-US");
		pao.setReleaseID("4.0");
		pao.setSystemEnvironmentCode("dev");
		
		ApplicationAreaType aat = new ApplicationAreaType();		
		aat.setBODID("bodId");
		pao.setApplicationArea(aat);
		 
		// 
		DataAreaType da = new DataAreaType();
		pao.setDataArea(da);
		
		AssessmentOrderType ao = new AssessmentOrderType();
		
		
		ao.setDocumentID(new IdentifierType());
		ao.setDocumentSequence(BigInteger.valueOf(1));
		ao.setMajorVersionID("4.0");
		PartyType requestorParty = this.createPartyType("RequestorPartyName");
		requestorParty.getPartyID().add(this.createIdentifierType("requestorID"));
		ao.setRequesterParty(requestorParty);
		
		PartyType supplierParty = this.createPartyType("SupplierPartyName");
		supplierParty.getPartyID().add(this.createIdentifierType("supplierID"));
		ao.setSupplierParty(supplierParty);
		
		ao.setPackageID(this.createIdentifierType("packageId_01"));
		ao.getComparisonGroupID().add(this.createIdentifierType("new_hire"));
		
		ao.setAssessmentRequesterName("Chris Pauley");
		ao.setRedirectURL("http://hropen.org");
		
		ao.setAssessmentSubject(this.createAssessmentSubject());
		da.setAssessmentOrder(ao);
		
		
		return pao;
	}
	
	private AssessmentSubjectType createAssessmentSubject(){
		AssessmentSubjectType ast = new AssessmentSubjectType();
		ast.setPersonName("Joe Smith");
//		ast.getCommunication().add("cell: (215)555-5555");
		return ast;
	}
	
	private PartyType createPartyType(String partyName){
		PartyType pt = new PartyType();
		pt.setPartyName(partyName);
		return pt;
	}
	private IdentifierType createIdentifierType(String value){
		IdentifierType it = new IdentifierType();
		it.setValue(value);
		return it;
	}


    public void testProcessAssessmentOrderType_Save()
    {
    	ProcessAssessmentOrder pao = this.createAssessmentOrderType();
    	ProcessAssessmentOrderHelper.writeProcessOrderTypeXML(pao, "test01.xml");
    	System.out.println("\n====JSON====");
    	ProcessAssessmentOrderHelper.writeProcessOrderTypeJSON(pao, "test01.json");
        assertTrue(true);
    }
	
    public void testShowXML()
    {
    	ProcessAssessmentOrder pao = this.createAssessmentOrderType();
    	ProcessAssessmentOrderHelper.showProcessAssessmentOrderTypeXML(pao);
        assertTrue(true);
    }
	

    public void testShowJSON()
    {
    	ProcessAssessmentOrder pao = this.createAssessmentOrderType();
    	ProcessAssessmentOrderHelper.showProcessAssessmentOrderTypeJSON(pao);
        assertTrue(true);
    } 
    
    public void testReadXML()
    {
    	ProcessAssessmentOrderHelper helper = new ProcessAssessmentOrderHelper();
    	String filename = "test01.xml";
    	ProcessAssessmentOrder pao = helper.readProcessAssessmentOrderXML(filename);
    	ProcessAssessmentOrderHelper.showProcessAssessmentOrderTypeXML(pao);
        assertTrue(true);
    }
    
    public void testReadJSON()
    {
    	ProcessAssessmentOrderHelper helper = new ProcessAssessmentOrderHelper();
    	String filename = "test01.json";
    	ProcessAssessmentOrder pao = helper.readProcessAssessmentOrderJSON(filename);
    	ProcessAssessmentOrderHelper.showProcessAssessmentOrderTypeJSON(pao);
        assertTrue(true);
    }
    
}
