package org.hros.common.model;
import org.hros.common.model.AmountType;
import java.math.BigDecimal;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import junit.framework.TestCase;

import org.eclipse.persistence.jaxb.MarshallerProperties;


public class CommentTypesTest extends TestCase {

	static final String FILENAME = "CommentTypes_Test01";
	
    
    public void testCommentType()
    {
    	CommentType ct = new CommentType();
    	ct.setAuthor("Mark Smith");
    	ct.setNote("This is the comment text");
    	ct.setStatus("status_code_goes_here");
    	ct.setType("type_comment_property");
//    	ct.setDatetime();
    	CommentTypesHelper.showJSON(ct);
        assertTrue(true);
    }	
    
    public void testCommentsString()
    {
    	Comment c = new Comment();
    	c.setValue("This comment is merely a string.");
    	CommentsHelper.showJSON(c);
        assertTrue(true);
    }    

    public void testComment_CommentType()
    {
    	Comment c = new Comment();
    	c.setComment(createComment("Mark Miller", "info", "open", "Just an informative note. This uses one CommentType as a child node."));
    	CommentsHelper.showJSON(c);
        assertTrue(true);
    }        
    public void testCommentsArray()
    {
    	Comment c = new Comment();
    	c.getComments().add(createComment("Joan Jones", "info", "open", "Just an informative note."));
    	c.getComments().add(createComment("Bill Bonds", "alert", "open", "Here is a concern that needs to be addressed immediately."));
    	c.getComments().add(createComment("Dave Jones", "aside", "open", "Bill needs to relax."));
    	CommentsHelper.showJSON(c);
        assertTrue(true);
    }

	
	private CommentType createComment(String author, String type, String status, String note) {
    	CommentType ct = new CommentType();
    	ct.setType(type);
    	ct.setAuthor(author);
    	ct.setNote(note);
    	ct.setStatus(status);
//    	ct.setDatetime();
    	return ct;
	}	
}
