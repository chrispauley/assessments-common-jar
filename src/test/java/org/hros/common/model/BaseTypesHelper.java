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

public class BaseTypesHelper {

	public static void writeXML(AmountType ac, String filename){
		try {
			JAXBContext context = JAXBContext.newInstance(AmountType.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			StringWriter sw = new StringWriter();
			marshaller.marshal(ac, sw);
			
			File f = new File("./data/Common/" + filename);
			marshaller.marshal(ac, f);
			
			System.out.println(sw.toString());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeJson(AmountType ac, String filename){
		try {
			JAXBContext context = JAXBContext.newInstance(AmountType.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			StringWriter sw = new StringWriter();
			marshaller.marshal(ac, sw);
			
			File f = new File("./data/Common/" + filename);
			marshaller.marshal(ac, f);
			
			System.out.println(sw.toString());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public static void showJSON(AmountType ac) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(AmountType.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
//			m.setProperty("eclipslink.json.include-root", true);
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(ac, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static void showXML(AmountType ac) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(AmountType.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(ac, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public AmountType readXML(String filename){
		AmountType aoj = null;
		try { 
			JAXBContext context = JAXBContext.newInstance(AmountType.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			File f = new File("./data/" + filename);
			
			aoj = (AmountType) unmarshaller.unmarshal(f);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aoj;		
	}
		
	public AmountType readJSON(String filename){
		AmountType aoj = null;
		try {
			JAXBContext context = JAXBContext.newInstance(AmountType.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			unmarshaller.setProperty("eclipselink.media-type", "application/json");
	        unmarshaller.setProperty("eclipselink.json.include-root", true);
			
			File f = new File("./data/" + filename);
			
			aoj = (AmountType) unmarshaller.unmarshal(f);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aoj;		
	}	
}
