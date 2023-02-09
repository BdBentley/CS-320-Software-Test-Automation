package contactservice;
/*
 * This file contains the Contact Class
 * - Brian Bentley 2023
 */

// Create the public Contact class
public class Contact {
	// Declare the contactId String, originally went with string but changed my data type after 
	// re-reading the requirements.
	private String contactId;
	// Declare first name, last name, phone, and contact addresses as strings.
	private String contactFirstName;
	private String contactLastName;
	private String contactPhone;
	private String contactAddress;
	
	// Declare the set and get methods for the Contact class. 
	public Contact(String contactId, String firstName,String lastName,String phone,String address) {
		if(contactId.length() <= 10 && contactId != null) {
			this.contactId = contactId;
		}
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPhone(phone);
		this.setAddress(address);
	}
		// If the first name is less than 10 characters and not null this is the first name.
		public void setFirstName(String firstName){
			if(firstName.length() <= 10 && firstName != null) {
				this.contactFirstName = firstName;
			}
		}
		// If the last name is less than 10 characters and not null this is the last name.
		public void setLastName(String lastName){
			if(lastName.length() <= 10 && lastName != null) {
				this.contactLastName = lastName;
			}
		}
		// if the Phone number is not less than 10 characters and not null this is the phone number.
		public void setPhone(String phone){
			if(phone.length() == 10 && phone != null) {
				this.contactPhone = phone;
			}
		}
		// If the address is less than 
		public void setAddress(String address){
			if(address.length() <= 30 && address != null) {
				this.contactAddress = address;
			}
		}
		// get the contact id
		public String getContactId() {
			return contactId;
		}
		// get the contact first name
		public String getContactFirstName() {
			return contactFirstName;
		}
		// get the contact last name 
		public String getContactLastName() {
			return contactLastName;
		}
		// get the contact phone number 
		public String getPhone() {
			return contactPhone;
		}
		//get the contact address
		public String getContactAddress() {
			return contactAddress;
		}
		
		public String toString() {
			return "Contact [Contact ID = " + contactId + ", First Name = " + contactFirstName + ", Last Name = " + contactLastName
					+ ", phoneNumber = " + contactPhone + ", Address = " + contactAddress + "]";
		}
		
}