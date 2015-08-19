package org.hros.assessments.model;


import java.math.BigInteger;

import org.hros.assessments.model.IdentifierType;
import org.hros.assessments.model.PartyType;

import junit.framework.TestCase;

public class AssessmentOrderTest_01 extends TestCase {

	static final String FILENAME = "SampleAssessmentOrder_01";

	public AssessmentOrderTest_01(String name) {
		super(name);
	}

	private AssessmentOrderType createAssessmentOrderType() {
		AssessmentOrderType ac = new AssessmentOrderType();
		ac.setDocumentID("documentId_01");
		
		ac.setDocumentSequence(BigInteger.valueOf(1));
		ac.setCustomerParty(this.createCustomerParty("CustomerParty",
				"customer name"));
		ac.setSupplierParty(this.createSupplierParty("John Jones",
				"ATS Supplier, Inc."));
		ac.setRequesterParty(this.createRequestorParty("RequestorParty",
				"Requestor Name"));
		ac.setAssessmentSubject(this.createAssessmentSubject());
		
		return ac;
	}

	private PartyType createRequestorParty(String partyName, String string2) {
		PartyType pt = new PartyType();
		pt.setPartyName(partyName);
		pt.getPartyReportingIDs().add(createIdentifier("partyReportingID"));
		pt.getCommunication().add(createRequestorPartyCommunication());
		pt.getCommunication().add(this.createCommunicationABIE_MobilePhone());
		return pt;
	}

	private CommunicationABIEType createRequestorPartyCommunication() {
		CommunicationABIEType com = new CommunicationABIEType();
		com.setUseCode(UseCodeType.BUSINESS);
		com.setDialNumber("+01 (215)-555-0123");
		return com;
	}

	private PartyType createSupplierParty(String contactName, String partyName) {
		PartyType pt = new PartyType();
		pt.setPartyName(partyName);
		pt.getPersonContact().add(createSupplierContact(contactName));
		pt.getPartyReportingIDs().add(createIdentifier("partyReportingID"));
		pt.getCommunication().add(createSupplierPartyCommunication());
		return pt;
	}

	private PersonContactType createSupplierContact(String contactName) {
		PersonContactType pc = new PersonContactType();
		pc.setPersonName(createPersonName(contactName));
		return pc;
	}

	private PersonNameType createPersonName(String fullname) {
		PersonNameType pn = new PersonNameType();
		pn.setFormattedName(fullname);
		pn.setPreferredSalutationCode("Mr.");
		return pn;
	}

	private CommunicationABIEType createSupplierPartyCommunication() {
		CommunicationABIEType com = new CommunicationABIEType();
		com.setSequence(BigInteger.valueOf(1));
		com.setUseCode(UseCodeType.BUSINESS);
		com.setDialNumber("+01 (800)-555-9876");
		return com;
	}

	private PartyType createCustomerParty(String string, String partyName) {
		PartyType pt = new PartyType();
		pt.setPartyName(partyName);
		pt.getPartyReportingIDs().add(createIdentifier("partyReportingID"));
		pt.getCommunication().add(createCustomerPartyCommunication());
		pt.getCommunication().add(this.createCommunicationABIE_MobilePhone());
		return pt;
	}

	private CommunicationABIEType createCustomerPartyCommunication() {
		CommunicationABIEType com = new CommunicationABIEType();
		com.setSequence(BigInteger.valueOf(1));
		com.setUseCode(UseCodeType.PERSONAL);
		com.setDialNumber("+01 (215)-555-0123");
		return com;
	}

	private AssessmentSubjectType createAssessmentSubject() {
		AssessmentSubjectType as = new AssessmentSubjectType();
		as.setPersonName("Chris Pauley");
		as.setSubjectID(createIdentifier("candidate_001"));
		as.getPersonLegalID().add(this.createIdentifier("legal_id"));
		as.getCommunication().add(createCommunicationABIE_HomePhone());
		as.getCommunication().add(createCommunicationABIE_WorkPhone("(800)555-1234"));
		as.getCommunication().add(createCommunicationABIE_MobilePhone());
		as.getCommunication().add(createCommunicationABIE_IM_Address());
		as.getCommunication().add(createCommunicationABIE_Work_Address());
		return as;
	}

	private CommunicationABIEType createCommunicationABIE_Work_Address() {
		CommunicationABIEType com = new CommunicationABIEType();
		com.setAddress(createWorkAddress());
		com.setSequence(BigInteger.valueOf(5));
		return com;
	}

	private AddressBaseType createWorkAddress() {
		AddressBaseType ab = new AddressBaseType();
//		ab.getAddressLine().add(createSequencedTextType(1, "Line 1"));
//		ab.getAddressLine().add(createSequencedTextType(2, "Line 2"));
//		ab.getAddressLine().add(createSequencedTextType(3, "Line 3"));
		ab.setLineOne("This is Line One");
		ab.setLineTwo("Line two");
		ab.setBuildingName("Blg 1");
		ab.setCityName("Philadelphia");
		ab.setCountryCode("US");
		ab.setPostalCode("19020-2222");
		ab.setStreetName("Broad Street");
		ab.setType("Delivery Address");
		return ab;
	}

	private SequencedTextType createSequencedTextType(int seq, String value) {
		SequencedTextType st = new SequencedTextType();
		st.setSequence(BigInteger.valueOf(seq));
		st.setValue(value);
		return st;
	}

	private CommunicationABIEType createCommunicationABIE_IM_Address() {
		CommunicationABIEType com = new CommunicationABIEType();
		com.setChannelCode(ChannelCodeType.INSTANT_MESSAGE);
		com.setAccess("chris.candidate");
		com.setUseCode(UseCodeType.PERSONAL);
		com.setSequence(BigInteger.valueOf(4));
		return com;
	}

	private CommunicationABIEType createCommunicationABIE_HomePhone() {
		CommunicationABIEType com = new CommunicationABIEType();
		com.setChannelCode(ChannelCodeType.TELEPHONE);
		com.setDialNumber("(215)555-1234");
		com.setUseCode(UseCodeType.PERSONAL);
//		com.setSequence(BigInteger.valueOf(1));
		return com;
	}
	
	private CommunicationABIEType createCommunicationABIE_WorkPhone(String dialNumber) {
		CommunicationABIEType com = new CommunicationABIEType();
		com.setChannelCode(ChannelCodeType.TELEPHONE);
		com.setDialNumber(dialNumber);
		com.setUseCode(UseCodeType.BUSINESS);
//		com.setSequence(BigInteger.valueOf(2));
		return com;
	}
	
	private CommunicationABIEType createCommunicationABIE_MobilePhone() {
		CommunicationABIEType com = new CommunicationABIEType();
		com.setChannelCode(ChannelCodeType.MOBILE_TELEPHONE);
		com.setDialNumber("(215)555-5678");
		com.setUseCode(UseCodeType.PERSONAL);
//		com.setSequence(BigInteger.valueOf(3));
		return com;
	}	

	private IdentifierType createIdentifier(String value) {
		IdentifierType it = new IdentifierType();
		it.setValue(value);
		return it;
	}
//
//	private PartyType createPartyType(String partyName, String value) {
//		PartyType pt = new PartyType();
//		pt.setPartyName(partyName);
//		IdentifierType id = new IdentifierType();
//		id.setValue(value);
//		// pt.setPartyTaxID(id);
//		// pt.setUserArea(new UserAreaType());
//		return pt;
//	}

	public void test_SaveAll() {
		AssessmentOrderType obj = this.createAssessmentOrderType();
		AssessmentOrderHelper.writeXML(obj, FILENAME + ".xml");
		System.out.println("\n====JSON====");
		AssessmentOrderHelper.writeJson(obj, FILENAME + ".json");
		assertTrue(true);
	}

	public void testShowXML() {
		AssessmentOrderType obj = this.createAssessmentOrderType();
		AssessmentOrderHelper.showXML(obj);
		assertTrue(true);
	}

	public void testShowJSON() {
		AssessmentOrderType obj = this.createAssessmentOrderType();
		AssessmentOrderHelper.showJSON(obj);
		assertTrue(true);
	}

	public void testRead_XML() {
		AssessmentOrderHelper helper = new AssessmentOrderHelper();
		AssessmentOrderType obj = helper.readXML(FILENAME + ".xml");
		AssessmentOrderHelper.showXML(obj);
		assertTrue(true);
	}

	public void testRead_JSON() {
		AssessmentOrderHelper helper = new AssessmentOrderHelper();
		AssessmentOrderType obj = helper.readJSON(FILENAME + ".json");
		AssessmentOrderHelper.showJSON(obj);
		assertTrue(true);
	}

}
