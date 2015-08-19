package org.hros.assessments.model;


import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.eclipse.persistence.jaxb.MarshallerProperties;
import org.hros.assessments.model.AssessmentReportType;
import org.hros.assessments.model.ProcessAssessmentOrder;

public class AssessmentReportHelper {

	public static void writeXML(AssessmentReportType ac, String filename){
		try {
			JAXBContext context = JAXBContext.newInstance(AssessmentReportType.class);
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
	
	public static void writeJson(AssessmentReportType ac, String filename){
		try {
			JAXBContext context = JAXBContext.newInstance(AssessmentReportType.class);
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
	
	public static void showJSON(AssessmentReportType ac) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(AssessmentReportType.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
//			m.setProperty("eclipslink.json.include-root", true);
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(ac, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static void showXML(AssessmentReportType ac) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(ProcessAssessmentOrder.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(ac, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public AssessmentReportType readXML(String filename){
		AssessmentReportType aoj = null;
		try { 
			JAXBContext context = JAXBContext.newInstance(AssessmentReportType.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			File f = new File("./data/" + filename);
			
			aoj = (AssessmentReportType) unmarshaller.unmarshal(f);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aoj;		
	}
		
	public AssessmentReportType readJSON(String filename){
		AssessmentReportType aoj = null;
		try {
			JAXBContext context = JAXBContext.newInstance(AssessmentReportType.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			unmarshaller.setProperty("eclipselink.media-type", "application/json");
	        unmarshaller.setProperty("eclipselink.json.include-root", true);
			
			File f = new File("./data/" + filename);
			
			aoj = (AssessmentReportType) unmarshaller.unmarshal(f);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aoj;		
	}	
}
