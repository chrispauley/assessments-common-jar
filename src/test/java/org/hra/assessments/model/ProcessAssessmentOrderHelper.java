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

public class ProcessAssessmentOrderHelper {

	public static void writeProcessOrderTypeXML(ProcessAssessmentOrder pao, String filename){
		try {
			JAXBContext context = JAXBContext.newInstance(ProcessAssessmentOrder.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			StringWriter sw = new StringWriter();
			marshaller.marshal(pao, sw);
			
			File f = new File("./data/" + filename);
			marshaller.marshal(pao, f);
			
			System.out.println(sw.toString());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeProcessOrderTypeJSON(ProcessAssessmentOrder pao, String filename){
		try {
			JAXBContext context = JAXBContext.newInstance(ProcessAssessmentOrder.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			StringWriter sw = new StringWriter();
			marshaller.marshal(pao, sw);
			
			File f = new File("./data/" + filename);
			marshaller.marshal(pao, f);
			
			System.out.println(sw.toString());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static void showProcessAssessmentOrderTypeJSON(ProcessAssessmentOrder pao) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(ProcessAssessmentOrder.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
//			m.setProperty("eclipslink.json.include-root", true);
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(pao, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static void showProcessAssessmentOrderTypeXML(ProcessAssessmentOrder pao) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(ProcessAssessmentOrder.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(pao, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public ProcessAssessmentOrder readProcessAssessmentOrderXML(String filename){
		ProcessAssessmentOrder pao = null;
		try { 
			JAXBContext context = JAXBContext.newInstance(ProcessAssessmentOrder.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			File f = new File("./data/" + filename);
			
			pao = (ProcessAssessmentOrder) unmarshaller.unmarshal(f);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pao;		
	}
		
	public ProcessAssessmentOrder readProcessAssessmentOrderJSON(String filename){
		ProcessAssessmentOrder pao = null;
		try {
			JAXBContext context = JAXBContext.newInstance(ProcessAssessmentOrder.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			unmarshaller.setProperty("eclipselink.media-type", "application/json");
	        unmarshaller.setProperty("eclipselink.json.include-root", true);
			
			File f = new File("./data/" + filename);
			
			pao = (ProcessAssessmentOrder) unmarshaller.unmarshal(f);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pao;		
	}	
}
