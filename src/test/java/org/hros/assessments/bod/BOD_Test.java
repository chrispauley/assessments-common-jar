package org.hros.assessments.bod;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import junit.framework.TestCase;

import org.eclipse.persistence.jaxb.MarshallerProperties;
import org.hros.assessments.model.*;

public class BOD_Test extends TestCase {

	static final String FILENAME = "BODTest";
	
	

//    public void testBODType_ShowJSON()
//    {
////    	System.out.println("Start");
//    	BODType bod = new BODType();
////    	System.out.println("1");
//    	bod.setOriginalApplicationArea(new ApplicationAreaType());
//    	bod.getOriginalApplicationArea().setBODID("bod id");
//    	bod.getOriginalApplicationArea().setUserArea(createUserAreaType());
//    	bod.getDescription().add("Description goes here");
//    	this.showJSON(bod);
//        assertTrue(true);
//    }	
//    
//	private UserAreaType createUserAreaType() {
//		UserAreaType ua = new UserAreaType();
//		ua.getAny().add("This is the user area");
//		return ua;
//	}
//
//	private void showJSON(BODType bod) {
//		JAXBContext context;
//		try {
//			context = JAXBContext.newInstance(BODType.class);
//			Marshaller m = context.createMarshaller();
//			m.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
////			m.setProperty("eclipslink.json.include-root", true);
//			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//			m.marshal(bod, System.out);
//		} catch (JAXBException e) {
//			e.printStackTrace();
//		}
//	}
}
