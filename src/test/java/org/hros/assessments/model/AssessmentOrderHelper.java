package org.hros.assessments.model;


import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.eclipse.persistence.jaxb.MarshallerProperties;
import org.hros.assessments.model.AssessmentOrderType;

public class AssessmentOrderHelper {

	public static void writeXML(AssessmentOrderType ac, String filename){
		try {
			JAXBContext context = JAXBContext.newInstance(AssessmentOrderType.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			StringWriter sw = new StringWriter();
			marshaller.marshal(ac, sw);
			
			File f = new File("./data/" + filename);
			marshaller.marshal(ac, f);
			
			System.out.println(sw.toString());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeJson(AssessmentOrderType ac, String filename){
		try {
			JAXBContext context = JAXBContext.newInstance(AssessmentOrderType.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			StringWriter sw = new StringWriter();
			marshaller.marshal(ac, sw);
			
			File f = new File("./data/" + filename);
			marshaller.marshal(ac, f);
			
			System.out.println(sw.toString());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static void showJSON(AssessmentOrderType ac) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(AssessmentOrderType.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
//			m.setProperty("eclipslink.json.include-root", true);
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(ac, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static void showXML(AssessmentOrderType ac) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(AssessmentOrderType.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(ac, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public AssessmentOrderType readXML(String filename){
		AssessmentOrderType aoj = null;
		try { 
			JAXBContext context = JAXBContext.newInstance(AssessmentOrderType.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			File f = new File("./data/" + filename);
			
			aoj = (AssessmentOrderType) unmarshaller.unmarshal(f);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aoj;		
	}
		
	public AssessmentOrderType readJSON(String filename){
		AssessmentOrderType aoj = null;
		try {
			JAXBContext context = JAXBContext.newInstance(AssessmentOrderType.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			unmarshaller.setProperty("eclipselink.media-type", "application/json");
	        unmarshaller.setProperty("eclipselink.json.include-root", true);
			
			File f = new File("./data/" + filename);
			
			aoj = (AssessmentOrderType) unmarshaller.unmarshal(f);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aoj;		
	}	
}
