package org.hros.assessments.model;

import java.math.BigInteger;

public class AssessmentSubjectHelper {

	public static AssessmentSubjectType CreateAssessmentSubject() {
		AssessmentSubjectType as = new AssessmentSubjectType();
		as.setPersonName("Chris Pauley");
		as.setSubjectId(createIdentifier("candidate_001"));
		as.getPersonLegalIds().add(createIdentifier("legal_id"));
		as.getCommunications().add(createCommunicationABIE_HomePhone());
		as.getCommunications().add(
				createCommunicationABIE_WorkPhone("(800)555-1234"));
		as.getCommunications().add(createCommunicationABIE_MobilePhone());
		as.getCommunications().add(createCommunicationABIE_IM_Address());
		as.getCommunications().add(createCommunicationABIE_Work_Address());
		return as;
	}
	
	private static IdentifierType createIdentifier(String value) {
		IdentifierType it = new IdentifierType();
		it.setValue(value);
		return it;
	}
	

	private static CommunicationType createCommunicationABIE_IM_Address() {
		CommunicationType com = new CommunicationType();
//		com.setChannelCode(ChannelCodeEnumType.INSTANT_MESSAGE);
//		com.setAccess("chris.candidate");
//		com.setUseCode(UseCodeType.PERSONAL);
//		com.setSequence(BigInteger.valueOf(4));
		return com;
	}

	private static CommunicationType createCommunicationABIE_HomePhone() {
		CommunicationType com = new CommunicationType();
//		com.setChannelCode(ChannelCodeEnumType.TELEPHONE);
//		com.setDialNumber("(215)555-1234");
//		com.setUseCode(UseCodeType.PERSONAL);
		// com.setSequence(BigInteger.valueOf(1));
		return com;
	}

	private static CommunicationType createCommunicationABIE_WorkPhone(
			String dialNumber) {
		CommunicationType com = new CommunicationType();
//		com.setChannelCode(ChannelCodeEnumType.TELEPHONE);
//		com.setDialNumber(dialNumber);
//		com.setUseCode(UseCodeType.BUSINESS);
		// com.setSequence(BigInteger.valueOf(2));
		return com;
	}
	
	private static CommunicationType createCommunicationABIE_Work_Address() {
		CommunicationType com = new CommunicationType();
//		com.setAddress(createWorkAddress());
//		com.setSequence(BigInteger.valueOf(5));
		return com;
	}
	
	private static AddressType createWorkAddress() {
		AddressType ab = new AddressType();
		// ab.getAddressLine().add(createSequencedTextType(1, "Line 1"));
		// ab.getAddressLine().add(createSequencedTextType(2, "Line 2"));
		// ab.getAddressLine().add(createSequencedTextType(3, "Line 3"));
//		ab.setLineOne("This is Line One");
//		ab.setLineTwo("Line two");
//		ab.setBuildingName("Blg 1");
//		ab.setCityName("Philadelphia");
//		ab.setCountryCode("US");
//		ab.setPostalCode("19020-2222");
//		ab.setStreetName("Broad Street");
//		ab.setType("Delivery Address");
		return ab;
	}

	private static CommunicationType createCommunicationABIE_MobilePhone() {
		CommunicationType com = new CommunicationType();
//		com.setChannelCode(ChannelCodeEnumType.MOBILE_TELEPHONE);
//		com.setDialNumber("(215)555-5678");
//		com.setUseCode(UseCodeType.PERSONAL);
		// com.setSequence(BigInteger.valueOf(3));
		return com;
	}
}
