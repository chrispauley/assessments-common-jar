package org.hra.assessments.model;


import org.hra.model.bod.*;
import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.eclipse.persistence.jaxb.MarshallerProperties;

public class AssessmentOrderJSONHelper {

	public static void writeAssessmentOrderJSONTypeXML(AssessmentOrderJSONType aoj, String filename){
		try {
			JAXBContext context = JAXBContext.newInstance(AssessmentOrderJSONType.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			StringWriter sw = new StringWriter();
			marshaller.marshal(aoj, sw);
			
			File f = new File("./data/" + filename);
			marshaller.marshal(aoj, f);
			
			System.out.println(sw.toString());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeAssessmentOrderJSONType_json(AssessmentOrderJSONType aoj, String filename){
		try {
			JAXBContext context = JAXBContext.newInstance(AssessmentOrderJSONType.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			StringWriter sw = new StringWriter();
			marshaller.marshal(aoj, sw);
			
			File f = new File("./data/" + filename);
			marshaller.marshal(aoj, f);
			
			System.out.println(sw.toString());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static void showAssessmentOrderJSONType(AssessmentOrderJSONType pao) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(AssessmentOrderJSONType.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
//			m.setProperty("eclipslink.json.include-root", true);
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(pao, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static void showAssessmentOrderJSONType_XML(AssessmentOrderJSONType aoj) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(ProcessAssessmentOrder.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(aoj, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public AssessmentOrderJSONType readAssessmentOrderJSONType_XML(String filename){
		AssessmentOrderJSONType aoj = null;
		try { 
			JAXBContext context = JAXBContext.newInstance(AssessmentOrderJSONType.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			File f = new File("./data/" + filename);
			
			aoj = (AssessmentOrderJSONType) unmarshaller.unmarshal(f);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aoj;		
	}
		
	public AssessmentOrderJSONType readAssessmentOrderJSONType_JSON(String filename){
		AssessmentOrderJSONType aoj = null;
		try {
			JAXBContext context = JAXBContext.newInstance(AssessmentOrderJSONType.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			unmarshaller.setProperty("eclipselink.media-type", "application/json");
	        unmarshaller.setProperty("eclipselink.json.include-root", true);
			
			File f = new File("./data/" + filename);
			
			aoj = (AssessmentOrderJSONType) unmarshaller.unmarshal(f);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aoj;		
	}	
}
