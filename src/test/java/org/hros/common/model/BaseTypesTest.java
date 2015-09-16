package org.hros.common.model;

import java.math.BigDecimal;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import junit.framework.TestCase;

import org.eclipse.persistence.jaxb.MarshallerProperties;

//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.GregorianCalendar;
//import java.util.Locale;

//import javax.xml.datatype.DatatypeConfigurationException;
//import javax.xml.datatype.DatatypeFactory;
//import javax.xml.datatype.XMLGregorianCalendar;
public class BaseTypesTest extends TestCase {

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
    
    public void testCodeType() {
    	CodeType ct = new CodeType();
    	ct.setName("CodeTypeName");
    	ct.setValue("valueGoesHere");
    	try {
			Serializer.marshalJSON(ct, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
    }
    public void testPeriodType() {
    	PeriodType f = new PeriodType();
    	
    	f.setValue0("stringHere");
    	try {
			Serializer.marshalJSON(f, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
    }

//    
//    public void testDatePeriodType(){
//    	DatePeriodType dpt = new DatePeriodType();
//    	
//    	
//    	java.util.Date today = new Date();
//    	
//    	  XMLGregorianCalendar value = toXMLGregorianCalendar(today);
//          System.out.println("XMLGregorianCalendar from Date in Java      : " + value) ;
//    	dpt.setStart(value);
//    	dpt.setEnd(value);
//    	try {
//			Serializer.marshalJSON(dpt, System.out);
//		} catch (JAXBException e) {
//			e.printStackTrace();
//		}
//    }
//    
//    /*
//     * Converts java.util.Date to javax.xml.datatype.XMLGregorianCalendar
//     */
//    public static XMLGregorianCalendar toXMLGregorianCalendar(java.util.Date date){
//        GregorianCalendar gCalendar = new GregorianCalendar();
//        gCalendar.setTime(date);
//        XMLGregorianCalendar xmlCalendar = null;
//        try {
//            xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
//        } catch (DatatypeConfigurationException ex) {
//            ex.printStackTrace();
//        }
//        return xmlCalendar;
//    }
//    
//    /*
//     * Converts XMLGregorianCalendar to java.util.Date in Java
//     */
//    public static Date toDate(XMLGregorianCalendar calendar){
//        if(calendar == null) {
//            return null;
//        }
//        return calendar.toGregorianCalendar().getTime();
//    }

}
