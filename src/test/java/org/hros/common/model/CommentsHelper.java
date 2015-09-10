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

public class CommentsHelper {

	public static void writeXML(Comment comment, String filename){
		try {
			JAXBContext context = JAXBContext.newInstance(Comment.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			StringWriter sw = new StringWriter();
			marshaller.marshal(comment, sw);
			
			File f = new File("./data/Common/" + filename);
			marshaller.marshal(comment, f);
			
			System.out.println(sw.toString());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeJson(Comment comment, String filename){
		try {
			JAXBContext context = JAXBContext.newInstance(Comment.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			StringWriter sw = new StringWriter();
			marshaller.marshal(comment, sw);
			
			File f = new File("./data/Common/" + filename);
			marshaller.marshal(comment, f);
			
			System.out.println(sw.toString());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public static void showJSON(Comment comment) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(Comment.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
//			m.setProperty("eclipslink.json.include-root", true);
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(comment, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static void showXML(Comment comment) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(Comment.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(comment, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public Comment readXML(String filename){
		Comment aoj = null;
		try { 
			JAXBContext context = JAXBContext.newInstance(Comment.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			File f = new File("./data/" + filename);
			
			aoj = (Comment) unmarshaller.unmarshal(f);
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return aoj;		
	}
		
	public Comment readJSON(String filename){
		Comment aoj = null;
		try {
			JAXBContext context = JAXBContext.newInstance(Comment.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			unmarshaller.setProperty("eclipselink.media-type", "application/json");
	        unmarshaller.setProperty("eclipselink.json.include-root", true);
			
			File f = new File("./data/" + filename);
			
			aoj = (Comment) unmarshaller.unmarshal(f);
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return aoj;		
	}	
}
