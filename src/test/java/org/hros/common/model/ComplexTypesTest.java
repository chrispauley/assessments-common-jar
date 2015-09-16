package org.hros.common.model;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.bind.JAXBException;

import junit.framework.TestCase;



public class ComplexTypesTest extends TestCase {

	static final String FILENAME = "ComplexTypesTest";
	
    public void testComplexObjectType2()
    {
    	ComplexType co = this.createComplexType();
    	try {
			Serializer.marshalJSON(co, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
    	
        assertTrue(true);
    }
    
    public void testComplexObjectType()
    {
    	ComplexType co = this.createComplexType();
//    	co.setValue(createComplexType());
    	ComplexTypeHelper.showJSON(co);
    	ComplexTypeHelper.writeJson(co, FILENAME + "_00.json");
    	
        assertTrue(true);
    }

	private ComplexType createComplexType() {
		
		ComplexType ct = new ComplexType();
		ct.setAddress(createAddressType());
		
		ct.setBaseNoun(createBaseNoun());
		
		ct.setCommunicationItem(createCommunicationItemType());
		
		//ct.setResource(createResourceClassification());
		ct.setPhone(createPhoneType());
		ct.setEmail(createEmailType("sample@example.com"));
		ct.setWeb(createWebType("http://website.com"));
		ct.setCommunication(createCommunicationTypeAddress());
		ct.setPersonName(createPersonNameTypeFull());
		return ct;
	}

	private PersonNameType createPersonNameTypeFull() {
		PersonNameType pt = new PersonNameType();
		pt.setFormatted("The Formatted Name, III");
		pt.setInitials("TFN");
		pt.setGenerationAffixCode(createGenerationCodeType("III"));
		pt.setGiven("TheGivenName");
		pt.setFamily("Family");
		pt.setFormerFamily("Formatted");
		pt.setLegal("Name");
		pt.setMiddle("Albert");
		pt.setPreferred("Al");
		pt.setPreferredSalutationCode(createSalutationCodeType("Your Highness"));
		return pt;
	}

	private CodeType createSalutationCodeType(String value) {
		CodeType ct = new CodeType();
		ct.setValue(value);
		return ct;
	}

	private CodeType createGenerationCodeType(String value) {
		CodeType ct = new CodeType();
		ct.setValue(value);
		return ct;
	}

	private CommunicationType createCommunicationTypeAddress() {
		CommunicationType ct = new CommunicationType();
		ct.setType("type??");
		ct.getAddress().add(this.createAddressType());
		return ct;
	}

	private WebType createWebType(String value) {
		WebType w = new WebType();
		w.setUrl(value);
		return w;
	}

	private EmailType createEmailType(String address) {
		EmailType et = new EmailType();
		et.setAddress(address);
		return et;
	}

	private PhoneType createPhoneType() {
		PhoneType pt = new PhoneType();
		pt.setFormattedNumber("888-555-1221");
		return pt;
	}

	private ResourceClassification createResourceClassification() {
		ResourceClassification rc = new ResourceClassification();
		rc.setManagerName("The Manager");
		rc.setSupervisorName("The Supervisor");
		rc.setContactName("The Contact");
		rc.setDepartment(createEntity("deptName", "deptId", "deptCode", "deptValue"));
		rc.setLocation(createEntity("locName", "locationId", "locCode", "locValue"));
		rc.setCostCenter(createEntity("costCenterName", "costCtrId", "costCtrCode", "costCenterValue"));
		rc.setJob(createEntity("jobName", "jobId", "jobCode", "jobValue"));
		rc.setAccount(createEntity("accountName", "accountId", "accountCode", "accountValue"));
		rc.setProject(createEntity("projectName", "projectId", "projectCode", "projectValue"));
		rc.setShift(createEntity("shiftName", "shiftId", "shiftCode", "shiftValue"));
		rc.setExternalOrderNumber("externalOrderNum_001");
		rc.setReferenceNumber("referenceNum_001");
		rc.setPurchaseOrderLineItem("001");
		rc.setPurchaseOrderNumber("po_Number_001");
		rc.getCostAllocations().add(createCostAllocationType());
		return rc;
	}

	private CostAllocationType createCostAllocationType() {
		CostAllocationType ca = new CostAllocationType();
		ca.setPercentage(createPercentType());
		ca.setDepartment(createEntity("deptName", "deptId", "deptCode", "deptValue"));
		ca.setLocation(createEntity("locName", "locationId", "locCode", "locValue"));
		ca.setCostCenter(createEntity("costCenterName", "costCenterId", "costCenterCode", "costCenterValue"));
		ca.setJob(createEntity("jobName", "jobId", "jobCode", "jobValue"));
		ca.setAccount(createEntity("accountName", "accountId", "accountCode", "accountValue"));
		ca.setProject(createEntity("projectName", "projectId", "projectCode", "projectValue"));
		ca.setShift(createEntity("shiftName", "shiftId", "shiftCode", "shiftValue"));
		return ca;
	}

	private PercentType createPercentType() {
		PercentType pt = new PercentType();
		pt.setValue(BigDecimal.valueOf(.23));
		return pt;
	}

	private EntityType createEntity(String name, String id, String code, String value) {
		EntityType et = new EntityType();
		et.setValue(value);
		et.setCode(code);
		et.setId(id);
		et.setName(name);
		return et;
	}



	private CommunicationItemType createCommunicationItemType() {
		CommunicationItemType ci = new CommunicationItemType();
		ci.setName("HOME");
		ci.setPreference(BigInteger.valueOf(1));
		ci.setUseCode(createUseCodeType());
		//ci.setAvailablePeriod(value);
		return ci;
	}

	private CodeType createUseCodeType() {
		CodeType ct = new CodeType();
		ct.setName("phone");
		ct.setValue("888-555-0123");
		return ct;
	}

	private BaseNounType createBaseNoun() {
		BaseNounType bn = new BaseNounType();
		bn.setDocumentId(createIdentifierType());
		return bn;
	}

	private IdentifierType createIdentifier(String value) {
		IdentifierType it = new IdentifierType();
		it.setValue(value);
		return it;
	}
	
	private IdentifierType createIdentifierType() {
		IdentifierType it = new IdentifierType();
		it.setValue("testIdentifierTypeValue");
		return it;
	}

	private AddressType createAddressType() {
		AddressType at = new AddressType();
		at.setType("home");
		at.getLine().add("1 First Street");
		at.setCity("Hometown");
		at.setCountryCode("US");
		at.setPostalCode("02134");
		return at;
	}	
	
}
