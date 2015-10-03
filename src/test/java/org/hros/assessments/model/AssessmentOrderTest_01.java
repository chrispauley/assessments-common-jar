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
		ac.setDocumentId("documentId_01");

		ac.setDocumentSequence(BigInteger.valueOf(1));
		ac.setPackageId(createPackageId("package_123"));
		ac.setCustomerParty(this.createCustomerParty("CustomerParty",
				"customer name"));
		ac.setSupplierParty(this.createSupplierParty("John Jones", "Mr.",
				"ATS Supplier, Inc."));
		ac.setRequesterParty(this.createRequestorParty("RequestorParty",
				"Requestor Name"));
		ac.setAssessmentSubject(this.createAssessmentSubject());

		ac.getAssessmentAccess().add(createAssessmentAccess());
		ac.setRedirectURL(createRedirectURL());
		return ac;
	}

	private RedirectURLType createRedirectURL() {
		RedirectURLType ru = new RedirectURLType();
		ru.setTimeOut(BigInteger.valueOf(10));
		ru.setMessage("Click here when you are done.");
		ru.setURI("http://www.ats-company.com/app/v2/assessmentreport?DocumentID=documentId_01&PackageID=package_123&auth_token=637jke723");
		ru.setStatusCode("200");
		ru.setValidFrom("20150904");
		ru.setValidTo("20150930");
		return ru;
	}

	private IdentifierType createPackageId(String packageId) {
		IdentifierType pi = new IdentifierType();
		pi.setValue(packageId);
		return pi;
	}

	private AssessmentAccessType createAssessmentAccess() {
		AssessmentAccessType aat = new AssessmentAccessType();
		aat.setID("assessmentAccessID");
		aat.setAccessCredentials(createLoginInformation());
		return aat;
	}

	private LoginInformationType createLoginInformation() {
		LoginInformationType li = new LoginInformationType();
		li.setUserId("User_01");
		li.getAccessCredentials().add(createAccessCredentials());
		return li;
	}

	private AccessCredentialType createAccessCredentials() {
		AccessCredentialType act = new AccessCredentialType();
		 CodeType ct = new CodeType();
		 ct.setName("password");
		 ct.setValue("the+password_value");
		 act.setAccessCredentialTypeCode(ct);
		act.setAccessCredentialValue("login123");
		return act;
	}

	private PartyType createRequestorParty(String partyName, String string2) {
		PartyType pt = new PartyType();
		pt.setName(partyName);
		//pt.getPartyReportingIDs().add(createIdentifier("partyReportingID"));
		pt.getCommunications().add(createRequestorPartyCommunication());
		pt.getCommunications().add(this.createCommunication_MobilePhone());
		return pt;
	}

	private CommunicationType createRequestorPartyCommunication() {
		CommunicationType com = new CommunicationType();
		com.setType("business");
		com.getPhone().add(createPhoneType("+01 (215)-555-0123"));
		return com;
	}

	private PhoneType createPhoneType(String phone) {
		PhoneType pt = new PhoneType();
		pt.setFormattedNumber(phone);
		return pt;
	}

	private PartyType createSupplierParty(String contactName, String salutation, String partyName) {
		PartyType pt = new PartyType();
		pt.setName(partyName);
		pt.getPersonContacts().add(createSupplierContact(contactName));
//		pt.getPartyReportingIDs().add(createIdentifier("partyReportingID"));
		pt.getCommunications().add(createSupplierPartyCommunication());
		return pt;
	}

	private PersonContactType createSupplierContact(String contactName) {
		PersonContactType pc = new PersonContactType();
		pc.setName(createPersonName(contactName));
		return pc;
	}

	private PersonNameType createPersonName(String fullname) {
		PersonNameType pn = new PersonNameType();
		pn.setFormatted(fullname);
		return pn;
	}

	private CommunicationType createSupplierPartyCommunication() {
		CommunicationType com = new CommunicationType();
		com.setType("business");
		com.getPhone().add(createPhoneType("+01 (800)-555-9876"));
		return com;
	}

	private PartyType createCustomerParty(String string, String partyName) {
		PartyType pt = new PartyType();
		pt.setName(partyName);
//		pt.getPartyReportingIDs().add(createIdentifier("partyReportingID"));
		pt.getCommunications().add(this.createSupplierPartyCommunication());
		pt.getCommunications().add(this.createCommunication_WorkPhone());
		return pt;
	}

	private CommunicationType createCustomerPartyCommunication() {
		CommunicationType com = new CommunicationType();
		com.setType("personal");
		com.getPhone().add(this.createPhoneType("+01 (609)-555-0123"));
		return com;
	}

	private AssessmentSubjectType createAssessmentSubject() {
		AssessmentSubjectType as = new AssessmentSubjectType();
		as.setPersonName("Chris Pauley");
		as.setSubjectId(createIdentifier("candidate_001"));
		as.getPersonLegalIds().add(this.createIdentifier("legal_id"));
		as.getCommunications().add(createCommunication_HomePhone());
		return as;
	}


	private AddressType createWorkAddress() {
		AddressType ab = new AddressType();
		// ab.getAddressLine().add(createSequencedTextType(1, "Line 1"));
		// ab.getAddressLine().add(createSequencedTextType(2, "Line 2"));
		// ab.getAddressLine().add(createSequencedTextType(3, "Line 3"));
		ab.setType("work");
		ab.getLine().add("The Working Co.");
		ab.getLine().add("12 Broad Street");
		ab.setCity("Philadelphia");
		ab.setCountryCode("US");
		ab.setPostalCode("19020-2222");
		return ab;
	}

	private SequencedTextType createSequencedTextType(int seq, String value) {
		SequencedTextType st = new SequencedTextType();
		st.setSequence(BigInteger.valueOf(seq));
		st.setValue(value);
		return st;
	}

	private CommunicationType createCommunication_IM_Address() {
		CommunicationType com = new CommunicationType();
		com.setType("instant message");
		com.getPhone().add(this.createPhoneType("888-555-2121"));
		return com;
	}

	private CommunicationType createCommunication_HomePhone() {
		CommunicationType com = new CommunicationType();
		com.setType("home");
		com.getPhone().add(this.createPhoneType("908-555-2121"));
		return com;
	}

	private CommunicationType createCommunication_WorkPhone() {
		CommunicationType com = new CommunicationType();
		com.setType("work");
		com.getPhone().add(this.createPhoneType("888-555-2121"));
		return com;
	}

	private CommunicationType createCommunication_MobilePhone() {
		CommunicationType com = new CommunicationType();
		com.setType("mobile");
		com.getPhone().add(this.createPhoneType("555-9191"));
		return com;
	}

	private IdentifierType createIdentifier(String value) {
		IdentifierType it = new IdentifierType();
		it.setValue(value);
		return it;
	}

	//
	// private PartyType createPartyType(String partyName, String value) {
	// PartyType pt = new PartyType();
	// pt.setPartyName(partyName);
	// IdentifierType id = new IdentifierType();
	// id.setValue(value);
	// // pt.setPartyTaxID(id);
	// // pt.setUserArea(new UserAreaType());
	// return pt;
	// }

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
