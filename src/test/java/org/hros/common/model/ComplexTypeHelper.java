package org.hros.common.model;


import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.eclipse.persistence.jaxb.MarshallerProperties;
import org.hros.common.model.*;

public class ComplexTypeHelper {

	public static void writeXML(ComplexObject ct, String filename){
		try {
			JAXBContext context = JAXBContext.newInstance(ComplexObject.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			StringWriter sw = new StringWriter();
			marshaller.marshal(ct, sw);
			
			File f = new File( filename);
			marshaller.marshal(ct, f);
			
			System.out.println(sw.toString());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeJson(ComplexType ct, String filename){
		try {
			JAXBContext context = JAXBContext.newInstance(ComplexType.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			StringWriter sw = new StringWriter();
			marshaller.marshal(ct, sw);
			
			File f = new File( filename);
			marshaller.marshal(ct, f);
			
			System.out.println(sw.toString());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public static void showJSON(ComplexType ct) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(ComplexType.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
//			m.setProperty("eclipslink.json.include-root", true);
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(ct, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static void showXML(ComplexObject ct) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(ComplexObject.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(ct, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public ComplexObject readXML(String filename){
		ComplexObject aoj = null;
		try { 
			JAXBContext context = JAXBContext.newInstance(ComplexObject.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			File f = new File( filename);
			
			aoj = (ComplexObject) unmarshaller.unmarshal(f);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aoj;		
	}
		
	public ComplexObject readJSON(String filename){
		ComplexObject aoj = null;
		try {
			JAXBContext context = JAXBContext.newInstance(ComplexObject.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			unmarshaller.setProperty("eclipselink.media-type", "application/json");
	        unmarshaller.setProperty("eclipselink.json.include-root", true);
			
			File f = new File( filename);
			
			aoj = (ComplexObject) unmarshaller.unmarshal(f);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aoj;		
	}	
}
