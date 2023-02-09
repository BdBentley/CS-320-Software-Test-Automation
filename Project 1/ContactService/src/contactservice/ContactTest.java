package contactservice;

import org.junit.Test;
import static org.junit.Assert.*;

// Create the Contact test class
public class ContactTest {
	
	// Create a contact from the Contact class file.
	Contact contact = new Contact("001","firstName","lastName","1234567890","123 St.");

	// Get the contact ID
	@Test public void testContactGetId() {	
		assertEquals("001", contact.getContactId());
	}
	
	//Get the contact first name
	 @Test public void testContactGetFirstName() {
		 assertEquals("firstName", contact.getContactFirstName());
		}
	 
	 // Get the contact last name
	 @Test public void testContactGetLastName() {
		 assertEquals("lastName", contact.getContactLastName());
		}
	 
	 // Get the contact phone number 
	 @Test public void testContactGetPhone() {
		assertEquals("1234567890", contact.getPhone());
	}
	 
	 // Get the contact address
	 @Test public void testContactGetAddress() {
		assertEquals("123 St.", contact.getContactAddress());
	}	 
	 
}