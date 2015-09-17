package org.hros.common.model;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import junit.framework.TestCase;

import org.apache.tools.ant.util.Base64Converter;
import org.eclipse.persistence.internal.oxm.conversion.Base64;
import org.eclipse.persistence.jaxb.MarshallerProperties;
import org.jvnet.staxex.Base64EncoderStream;

import com.sun.xml.bind.v2.runtime.unmarshaller.Base64Data;

import sun.misc.BASE64Encoder;

public class BaseTypesTest extends TestCase {

	static final String FILENAME = "BaseTest";
	static final String FILENAME_AmountType = "AmountType_Test01";

	public void testAmountType() {
		AmountType at = new AmountType();
		at.setCurrencyID(CurrencyCodeList.USD);
		at.setValue(BigDecimal.valueOf(95.00));
		// BaseTypeHelper.showJSON(at);
		// BaseTypeHelper.showXML(at);
		BaseTypesHelper.writeJson(at, FILENAME_AmountType + ".json");
		BaseTypesHelper.writeXML(at, FILENAME_AmountType + ".xml");
		assertTrue(true);
	}

//	public void testBinaryObjectType(){
//	
//		BinaryObjectType obj = new BinaryObjectType();
//		
//		obj.setValue("test".getBytes());
//		obj.setFormat("Base64");
//		System.out.println(" " + obj.getValue().toString());
//		
//		String auth = "Basic " + Base64.base64Encode("test".getBytes());
//		System.out.println(auth);
//		try {
//			Serializer.marshalJSON(obj, System.out);
//		} catch (JAXBException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	private byte[] createBinaryObjectType() {
//		byte[] obj = "test".getBytes();
//		return obj;
//	}

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
		try {
			PeriodType f = new PeriodType();

			f.setFormattedDateTimeType("A month from now...");

			f.setDatePeriodType(createDatePeriod());

			f.setDateTimePeriodType(createDateTimePeriod());

			f.setYearMonthPeriodType(createYearMonthPeriodType());

			f.setYearPeriodType(createYearPeriodType());

			Serializer.marshalJSON(f, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	private YearPeriodType createYearPeriodType() {
		YearPeriodType dt = new YearPeriodType();
		dt.setStart(createXMLGregorianYear(2014));
		dt.setEnd(createXMLGregorianYear(2015));
		return dt;
	}

	private YearMonthPeriodType createYearMonthPeriodType() {
		YearMonthPeriodType dt = new YearMonthPeriodType();
		dt.setStart(this.createXMLGregorianDateYearMonth(2014, 11, 4));
		dt.setEnd(this.createXMLGregorianDateYearMonth(2015, 01, 4));
		return dt;
	}

	private DateTimePeriodType createDateTimePeriod() {
		DateTimePeriodType dt = new DateTimePeriodType();
		Date start = new Date();
		dt.setStart(createXMLGregorianDate(start));
		Date end = new Date();
		dt.setEnd(createXMLGregorianDate(end));
		return dt;
	}

	private DatePeriodType createDatePeriod() {
		try {
			DatePeriodType dt = new DatePeriodType();
			dt.setStart(this.createXMLGregorianDate(2014, 11, 10, 4));
			dt.setEnd(this.createXMLGregorianDate(2015, 01, 10, 4));
			return dt;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private XMLGregorianCalendar createXMLGregorianDate(java.util.Date date) {
		try {
			GregorianCalendar c = new GregorianCalendar();
			c.setTime(date);
			XMLGregorianCalendar xgdc = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(c);
			return xgdc;
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return null;
	}

	private XMLGregorianCalendar createXMLGregorianYear(int year) {
		try {
			XMLGregorianCalendar xgc = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar();
			xgc.setYear(year);
			return xgc;
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}

		return null;
	}

	private XMLGregorianCalendar createXMLGregorianDate(int year, int month,
			int day, int timezone) {
		try {
			XMLGregorianCalendar xgc = DatatypeFactory.newInstance()
					.newXMLGregorianCalendarDate(year, month, day, timezone);
			return xgc;
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}

		return null;
	}

	private XMLGregorianCalendar createXMLGregorianDateYearMonth(int year,
			int month, int timezone) {
		try {
			XMLGregorianCalendar xgc = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar();
			xgc.setYear(year);
			xgc.setMonth(month);
			// xgc.setTimezone(timezone);
			return xgc;
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}

		return null;
	}
	

}
