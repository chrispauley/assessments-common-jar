package org.hros.common.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
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
import org.hros.assessments.bod.Serializer;
import org.hros.assessments.model.AdditionalItemType;
import org.hros.common.JsonValidator;
import org.jvnet.staxex.Base64EncoderStream;

import com.sun.xml.bind.v2.runtime.unmarshaller.Base64Data;

import sun.misc.BASE64Encoder;

import org.hros.common.JsonValidator;


public class BaseTypesTest extends TestCase {

	static final String FILENAME = "BaseTest";
	static final String FILE_PATH = "./data/Common/base/";		

	
	
	public void testAmountType() {

		try {
			AmountType at = new AmountType();
			at.setCurrency(CurrencyCodeList.USD);
			at.setValue(BigDecimal.valueOf(95.00));
			
			Serializer.marshalJSON(at, System.out);
			String filename = FILE_PATH + "testAmountType_01.json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(at, fos);
			fos.close();
			
		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}		
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
		
		try {
			CodeType ct = new CodeType();
			ct.setName("CodeTypeName");
			ct.setValue("valueGoesHere");
			
			Serializer.marshalJSON(ct, System.out);
			String filename = FILE_PATH + "testCodeType_01.json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(ct, fos);
			fos.close();
			
		} catch (JAXBException | IOException e) {
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
			String filename = FILE_PATH + "testPeriodType_01.json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(f, fos);
			fos.close();			

		} catch (JAXBException  | IOException e) {
			e.printStackTrace();
		}
	}
	
	public void testPeriodType_FormattedDateTimeType() {
		try {
			PeriodType f = new PeriodType();
			f.setFormattedDateTimeType("A month from now...");

			Serializer.marshalJSON(f, System.out);
			String filename = FILE_PATH + "testPeriodType_FormattedDateTime_01.json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(f, fos);
			fos.close();			

		} catch (JAXBException  | IOException e) {
			e.printStackTrace();
		}
	}	
	
	public void testPeriodType_DatePeriod() {
		try {
			PeriodType f = new PeriodType();
			f.setDatePeriodType(createDatePeriod());

			Serializer.marshalJSON(f, System.out);
			String filename = FILE_PATH + "testPeriodType_DatePeriod_01.json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(f, fos);
			fos.close();			

		} catch (JAXBException  | IOException e) {
			e.printStackTrace();
		}
	}

	public void testPeriodType_DateTimePeriod() {
		try {
			PeriodType f = new PeriodType();
			f.setDateTimePeriodType(createDateTimePeriod());

			Serializer.marshalJSON(f, System.out);
			String filename = FILE_PATH + "testPeriodType_DateTimePeriod_01.json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(f, fos);
			fos.close();			

		} catch (JAXBException  | IOException e) {
			e.printStackTrace();
		}
	}	

	public void testPeriodType_YearMonthPeriodType() {
		try {
			PeriodType f = new PeriodType();
			f.setYearMonthPeriodType(createYearMonthPeriodType());

			Serializer.marshalJSON(f, System.out);
			String filename = FILE_PATH + "testPeriodType_YearMonthPeriodType_01.json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(f, fos);
			fos.close();			

		} catch (JAXBException  | IOException e) {
			e.printStackTrace();
		}
	}	
	

	public void testPeriodType_YearPeriodType() {
		try {
			PeriodType f = new PeriodType();
			f.setYearPeriodType(createYearPeriodType());

			Serializer.marshalJSON(f, System.out);
			String filename = FILE_PATH + "testPeriodType_YearPeriodType_01.json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(f, fos);
			fos.close();			

		} catch (JAXBException  | IOException e) {
			e.printStackTrace();
		}
	}	
	

	public void testEffectiveTimePeriodType() {
		try {
			EffectiveTimePeriod f = new EffectiveTimePeriod();
			f.setValidFrom(createXMLGregorianDateYearMonth(2014, 11, 4));
			f.setValidTo(createXMLGregorianDateYearMonth(2015, 01, 4));

			Serializer.marshalJSON(f, System.out);
			String filename = FILE_PATH + "testEffectiveTimePeriodType_01.json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(f, fos);
			fos.close();			

		} catch (JAXBException  | IOException e) {
			e.printStackTrace();
		}
	}	
	
	public void testEntityType() {
		try {
			EntityType f = new EntityType();
			f.setCode("entityCodeGoesHere");
			f.setId("entityId_GoesHere");
			f.setName("entityName");
			f.setValue("entityValue");

			Serializer.marshalJSON(f, System.out);
			String filename = FILE_PATH + "testEntityType_01.json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(f, fos);
			fos.close();			

		} catch (JAXBException  | IOException e) {
			e.printStackTrace();
		}
	}
	
	public void testGeoType() {
		try {
			GeoType f = new GeoType();
			f.setLatitude(BigDecimal.valueOf(40.75773));
			f.setLongitude(BigDecimal.valueOf(-73.9885));
			f.setAltitude(BigDecimal.valueOf(65));
			

			Serializer.marshalJSON(f, System.out);
			String filename = FILE_PATH + "testGeoType_01.json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(f, fos);
			fos.close();			

		} catch (JAXBException  | IOException e) {
			e.printStackTrace();
		}
	}	

	public void testIdentifierType() {
		try {
			IdentifierType f = new IdentifierType();
			f.setValue("identifierValue");
			

			Serializer.marshalJSON(f, System.out);
			String filename = FILE_PATH + "testIdentifierType_01.json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(f, fos);
			fos.close();			

		} catch (JAXBException  | IOException e) {
			e.printStackTrace();
		}
	}	
	
	public void testIdentifierType_02() {
		try {
			IdentifierType f = new IdentifierType();
			f.setValue("identifierValue");
			f.setSchemeName("schemaName");
			f.setSchemeDataURI("http://hros.org/schemas/IdentifierType.json");
			

			Serializer.marshalJSON(f, System.out);
			String filename = FILE_PATH + "testIdentifierType_02.json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(f, fos);
			fos.close();			

		} catch (JAXBException  | IOException e) {
			e.printStackTrace();
		}
	}	
	
	public void testMeasureTextType() {
		try {
			MeasureTextType f = new MeasureTextType();
			f.setUnitCode("minutes");
			f.setValue("45");

			Serializer.marshalJSON(f, System.out);
			String filename = FILE_PATH + "testMeasureTextType_01.json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(f, fos);
			fos.close();			

		} catch (JAXBException  | IOException e) {
			e.printStackTrace();
		}
	}	
	
	public void testNameType() {
		try {
			NameType f = new NameType();
			f.setValue("valueGoesHere");
			f.setLanguageCode(LanguageCodeList.EN_US);

			Serializer.marshalJSON(f, System.out);
			String filename = FILE_PATH + "testNameType_01.json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(f, fos);
			fos.close();			

		} catch (JAXBException  | IOException e) {
			e.printStackTrace();
		}
	}
	
	public void testBaseTypeTestObject() {
		try {
			BaseTypeTest b = new BaseTypeTest();
			NumberType f = new NumberType();
			f.setValue(BigDecimal.valueOf(8901234.00002));
			b.setNumberType(f);
			
			NameType n = new NameType();
			n.setValue("valueGoesHere");
			n.setLanguageCode(LanguageCodeList.EN_US);
			b.setNameType(n);
			
			Serializer.marshalJSON(b, System.out);
			String filename = FILE_PATH + "testBaseTypeTestObject_01.json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(b, fos);
			fos.close();			

		} catch (JAXBException  | IOException e) {
			e.printStackTrace();
		}
	}
	
	public void testNumberType() {
		try {
			NumberType f = new NumberType();
			f.setValue(BigDecimal.valueOf(8901234.00002));

			Serializer.marshalJSON(f, System.out);
			String filename = FILE_PATH + "testNumberType_01.json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(f, fos);
			fos.close();	

			String schema = JsonValidator.readFile("src/main/resources/Common/json/base.json");
			String json = JsonValidator.readFile(FILE_PATH + "testNumberType_01.json");
			JsonValidator.validate(json, schema);
		    

		} catch (JAXBException  | IOException e) {
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
