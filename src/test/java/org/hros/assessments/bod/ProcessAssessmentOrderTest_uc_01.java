package org.hros.assessments.bod;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;

import javax.xml.bind.JAXBException;

import org.hros.assessments.model.AssessmentCatalogType;
import org.hros.assessments.model.AssessmentOrderType;
import org.hros.assessments.model.AssessmentSubjectType;
import org.hros.assessments.model.IdentifierType;
import org.hros.assessments.model.PartyType;
import org.hros.common.model.Serializer;

import junit.framework.TestCase;

public class ProcessAssessmentOrderTest_uc_01 extends TestCase {

	public ProcessAssessmentOrderTest_uc_01(String name) {
		super(name);
	}
	
	public void testAssessmentOrder() {
		try {
			AssessmentOrderType ac = this.createAssessmentOrderType();
			

			Serializer.marshalJSON(ac, System.out);
			String filename = "./data/Assessments/" + ProcessAssessmentOrderTest_uc_01.class.getSimpleName() + ".json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(ac, fos);
			fos.close();
			
			String filename2 = "./data/Assessments/" + ProcessAssessmentOrderTest_uc_01.class.getSimpleName() + ".xml";
			File file2 = new File(filename2);
			FileOutputStream fos2 = new FileOutputStream(file2);
			Serializer.marshal(ac, fos2);
			fos.close();
		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}
	}
	
	private AssessmentOrderType createAssessmentOrderType() {
		
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
		//ao.setRedirectURL("http://hropen.org");
		
		ao.setAssessmentSubject(this.createAssessmentSubject());
		
		return ao;
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
    
}
