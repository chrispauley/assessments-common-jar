package org.hros.common.model;
import org.hros.common.model.AmountType;
import java.math.BigDecimal;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import junit.framework.TestCase;

import org.eclipse.persistence.jaxb.MarshallerProperties;


public class ComplexTypesTest extends TestCase {

	static final String FILENAME = "BaseTest";
	static final String FILENAME_AmountType = "AmountType_Test01";
	

    public void testAmountType()
    {
    	AmountType at = new AmountType();
    	at.setCurrencyID(CurrencyCodeList.USD);
    	at.setValue(BigDecimal.valueOf(95.00));
//    	BaseTypeHelper.showJSON(at);
//    	BaseTypeHelper.showXML(at);
    	BaseTypesHelper.writeJson(at, FILENAME_AmountType + ".json");
    	BaseTypesHelper.writeXML(at, FILENAME_AmountType + ".xml");
        assertTrue(true);
    }	
	
}
