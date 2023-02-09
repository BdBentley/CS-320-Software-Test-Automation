package contactservice;

import static org.junit.Assert.*;
import org.junit.Test;

// Create the ContactServiceTest class
public class ContactServiceTest {

	
	// This method will test the add contact method for passing data	
	@Test public void testAddPass() {
		ContactService cs = new ContactService();
		Contact contact1 = new Contact("001","Mike","Craig","18007779999","401 St.");
		Contact contact2 = new Contact("002","Ashley","Kunawari","18605556666","900 St.");
		Contact contact3 = new Contact("003","Jose","Guevara","18665547891","200 St.");
		assertEquals(true, cs.addContact(contact1));
		assertEquals(true, cs.addContact(contact2));
		assertEquals(true, cs.addContact(contact3));
	}
	
	// This method will test the add contact method for failing data
	@Test public void testAddFail() {
		ContactService cs = new ContactService();
		Contact contact1 = new Contact("123111", "John", "Jacobs", "1-100", "401 St.");
		Contact contact2 = new Contact("0203212314", "Joke", "Reynolds", "1801444", "900 St.");
		Contact contact3 = new Contact("897845212516", "John", "Jacobs", "17412", "200 St.");
		assertEquals(true, cs.addContact(contact1));
		assertEquals(true, cs.addContact(contact2));
		assertEquals(true, cs.addContact(contact3));
		
		assertEquals(false, cs.addContact(contact1));
	}
	
	// This method will test the delete contact method for passing data.
	@Test public void testDeletePass() {
		ContactService cs = new ContactService();
		Contact contact1 = new Contact("001","Mike","Craig","18007779999","401 St.");
		Contact contact2 = new Contact("002","Ashley","Kunawari","18605556666","900 St.");
		Contact contact3 = new Contact("003","Jose","Guevara","18665547891","200 St.");
		assertEquals(true, cs.addContact(contact1));
		assertEquals(true, cs.addContact(contact2));
		assertEquals(true, cs.addContact(contact3));
		
		assertEquals(true, cs.deleteContact("001"));
		assertEquals(true, cs.deleteContact("002"));	
	}
	
	// This method will test the delete contact method for failing data.
	@Test public void testDeleteFail() {
		ContactService cs = new ContactService();
		Contact contact1 = new Contact("001","Mike","Craig","18007779999","401 St.");
		Contact contact2 = new Contact("002","Ashley","Kunawari","18605556666","900 St.");
		Contact contact3 = new Contact("003","Jose","Guevara","18665547891","200 St.");
		assertEquals(true, cs.addContact(contact1));
		assertEquals(true, cs.addContact(contact2));
		assertEquals(true, cs.addContact(contact3));
		
		assertEquals(false, cs.deleteContact("004"));
		assertEquals(false, cs.deleteContact("005"));	
	}
	
	// This method will test the update contact first name method for passing data.
	
	@Test public void testUpdateFirstNamePass() {
		ContactService cs = new ContactService();
		Contact contact1 = new Contact("001","Mike","Craig","18007779999","401 St.");
		Contact contact2 = new Contact("002","Ashley","Kunawari","18605556666","900 St.");
		Contact contact3 = new Contact("003","Jose","Guevara","18665547891","200 St.");
		assertEquals(true, cs.addContact(contact1));
		assertEquals(true, cs.addContact(contact2));
		assertEquals(true, cs.addContact(contact3));
		
		assertEquals(true, cs.updateContactFirstName("001","Johnny"));
		assertEquals(true, cs.updateContactFirstName("002","Ava"));	
	}
	
	// This method will test the update contact first name method for failing data.
	@Test public void testUpdateFirstNameFail() {
		ContactService cs = new ContactService();
		Contact contact1 = new Contact("001","Mike","Craig","18007779999","401 St.");
		Contact contact2 = new Contact("002","Ashley","Kunawari","18605556666","900 St.");
		Contact contact3 = new Contact("003","Jose","Guevara","18665547891","200 St.");
		assertEquals(true, cs.addContact(contact1));
		assertEquals(true, cs.addContact(contact2));
		assertEquals(true, cs.addContact(contact3));
		
		assertEquals(false, cs.updateContactFirstName("004","Johnny"));
		assertEquals(false, cs.updateContactFirstName("123","Ava"));	
	}
	
	// This method will test the update contact last name method for passing data.
	
	@Test public void testUpdateLastNamePass() {
		ContactService cs = new ContactService();
		Contact contact1 = new Contact("001","Mike","Craig","18007779999","401 St.");
		Contact contact2 = new Contact("002","Ashley","Kunawari","18605556666","900 St.");
		Contact contact3 = new Contact("003","Jose","Guevara","18665547891","200 St.");
		assertEquals(true, cs.addContact(contact1));
		assertEquals(true, cs.addContact(contact2));
		assertEquals(true, cs.addContact(contact3));
		
		assertEquals(true, cs.updateContactLastName("001","Jones"));
		assertEquals(true, cs.updateContactLastName("002","Mercado"));	
	}
	
	// This method will test the update contact last name method for failing data.
	
	@Test public void testUpdateLastNameFail() {
		ContactService cs = new ContactService();
		Contact contact1 = new Contact("001","Mike","Craig","18007779999","401 St.");
		Contact contact2 = new Contact("002","Ashley","Kunawari","18605556666","900 St.");
		Contact contact3 = new Contact("003","Jose","Guevara","18665547891","200 St.");
		assertEquals(true, cs.addContact(contact1));
		assertEquals(true, cs.addContact(contact2));
		assertEquals(true, cs.addContact(contact3));
		
		assertEquals(false, cs.updateContactLastName("006","Jones"));
		assertEquals(false, cs.updateContactLastName("999","Mercado"));	
	}
	
	// This method will test the update contact phone number method for passing data.
	
	@Test public void testUpdateContactNumberPass() {
		ContactService cs = new ContactService();
		Contact contact1 = new Contact("001","Mike","Craig","18007779999","401 St.");
		Contact contact2 = new Contact("002","Ashley","Kunawari","18605556666","900 St.");
		Contact contact3 = new Contact("003","Jose","Guevara","18665547891","200 St.");
		assertEquals(true, cs.addContact(contact1));
		assertEquals(true, cs.addContact(contact2));
		assertEquals(true, cs.addContact(contact3));
		
		assertEquals(true, cs.updateContactNumber("001","8007009000"));
		assertEquals(true, cs.updateContactNumber("002","6005004000"));	
	}
	
	// This method will test the update contact phone number method for failing data.
	
	@Test public void testUpdateContactNumberFail() {
		ContactService cs = new ContactService();
		Contact contact1 = new Contact("001","Mike","Craig","18007779999","401 St.");
		Contact contact2 = new Contact("002","Ashley","Kunawari","18605556666","900 St.");
		Contact contact3 = new Contact("003","Jose","Guevara","18665547891","200 St.");
		assertEquals(true, cs.addContact(contact1));
		assertEquals(true, cs.addContact(contact2));
		assertEquals(true, cs.addContact(contact3));
		
		assertEquals(false, cs.updateContactNumber("000","6"));
		assertEquals(false, cs.updateContactNumber("006","18888888888888"));	
	}
	
	// This method will test the update contact address method for passing data.
	
	@Test public void testUpdateContactAddressPass() {
		ContactService cs = new ContactService();
		Contact contact1 = new Contact("001","Mike","Craig","18007779999","401 St.");
		Contact contact2 = new Contact("002","Ashley","Kunawari","18605556666","900 St.");
		Contact contact3 = new Contact("003","Jose","Guevara","18665547891","200 St.");
		assertEquals(true, cs.addContact(contact1));
		assertEquals(true, cs.addContact(contact2));
		assertEquals(true, cs.addContact(contact3));
		
		assertEquals(true, cs.updateContactAddress("001","866 Boston Highway"));
		assertEquals(true, cs.updateContactAddress("002","11th Avenue"));	
	}
	
	// This method will test the update contact address method for failing data.
	
	@Test public void testUpdateContactAddressFail() {
		ContactService cs = new ContactService();
		Contact contact1 = new Contact("001","Mike","Craig","18007779999","401 St.");
		Contact contact2 = new Contact("002","Ashley","Kunawari","18605556666","900 St.");
		Contact contact3 = new Contact("003","Jose","Guevara","18665547891","200 St.");
		assertEquals(true, cs.addContact(contact1));
		assertEquals(true, cs.addContact(contact2));
		assertEquals(true, cs.addContact(contact3));
		
		assertEquals(false, cs.updateContactAddress("121","1800700900000000000000000000000"));
		assertEquals(false, cs.updateContactAddress("655","1600500400011111111100000000000"));	
	}
	
	
}