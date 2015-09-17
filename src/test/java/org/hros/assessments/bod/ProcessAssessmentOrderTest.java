package org.hros.assessments.bod;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.hros.assessments.model.*;
import org.hros.common.model.Serializer;

import junit.framework.TestCase;

public class ProcessAssessmentOrderTest extends TestCase {

	public ProcessAssessmentOrderTest(String name) {
		super(name);
	}
	
	public void testAssessmentOrder() {
		AssessmentOrderType ao = this.createAssessmentOrderType();
		
		try {
			Serializer.marshalJSON(ao, System.out);
			String filename = "./data/Assessments/" + AssessmentOrderType.class.getSimpleName() + ".json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(ao, fos);
			fos.close();
			
			String filename2 = "./data/Assessments/" + AssessmentOrderType.class.getSimpleName() + ".xml";
			File file2 = new File(filename2);
			FileOutputStream fos2 = new FileOutputStream(file2);
			Serializer.marshal(ao, fos2);
			fos.close();
		} catch  (JAXBException | IOException e) {
			e.printStackTrace();
		} 
		
	}
	
	public void testAssessmentOrder2() {
		AssessmentOrderType ao = this.createAssessmentOrderType();
		AssessmentOrderHelper.showJSON(ao);
		
		
	}	
	
	private AssessmentOrderType createAssessmentOrderType()  {

		try {
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
		//	System.out.println(dateFormat.format(date));
			GregorianCalendar c = new GregorianCalendar();
			c.setTime(date);
			XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			//aat.setCreationDateTime(date2);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		 
		
		AssessmentOrderType ao = new AssessmentOrderType();
		
		
		ao.setDocumentID(this.createIdentifierType("docId"));
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
