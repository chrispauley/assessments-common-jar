package org.hros.common.model;
import org.hros.common.model.AmountType;
import java.math.BigDecimal;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import junit.framework.TestCase;

import org.eclipse.persistence.jaxb.MarshallerProperties;


public class BaseTest extends TestCase {

	static final String FILENAME = "BaseTest";
	
	

    public void testAmountType_ShowJSON()
    {
    	AmountType at = new AmountType();
    	at.setCurrencyID(CurrencyCodeList.USD);
    	at.setValue(BigDecimal.valueOf(95.00));
    	this.showJSON(at);
        assertTrue(true);
    }	


	private void showJSON(AmountType at) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(org.hros.common.model.AmountType.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
//			m.setProperty("eclipslink.json.include-root", true);
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(at, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
}
