package org.hros.assessments.model;


import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.eclipse.persistence.jaxb.MarshallerProperties;
import org.hros.assessments.model.AssessmentCatalogType;

public class AssessmentCatalogHelper {

	public static void writeXML(AssessmentCatalogType ac, String filename){
		try {
			JAXBContext context = JAXBContext.newInstance(AssessmentCatalogType.class);
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
	
	public static void writeJson(AssessmentCatalogType ac, String filename){
		try {
			JAXBContext context = JAXBContext.newInstance(AssessmentCatalogType.class);
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
	
	public static void showJSON(AssessmentCatalogType ac) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(AssessmentCatalogType.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
//			m.setProperty("eclipslink.json.include-root", true);
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(ac, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static void showXML(AssessmentCatalogType ac) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(AssessmentCatalogType.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(ac, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public AssessmentCatalogType readXML(String filename){
		AssessmentCatalogType aoj = null;
		try { 
			JAXBContext context = JAXBContext.newInstance(AssessmentCatalogType.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			File f = new File("./data/" + filename);
			
			aoj = (AssessmentCatalogType) unmarshaller.unmarshal(f);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aoj;		
	}
		
	public AssessmentCatalogType readJSON(String filename){
		AssessmentCatalogType aoj = null;
		try {
			JAXBContext context = JAXBContext.newInstance(AssessmentCatalogType.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			unmarshaller.setProperty("eclipselink.media-type", "application/json");
	        unmarshaller.setProperty("eclipselink.json.include-root", true);
			
			File f = new File("./data/" + filename);
			
			aoj = (AssessmentCatalogType) unmarshaller.unmarshal(f);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aoj;		
	}	
}
