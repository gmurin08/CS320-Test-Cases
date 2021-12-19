package tests;

import app.Contact;
import app.ContactService;
import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	/*
	 * Tests that new objects added with addContact method are 
	 * appended to array
	 */
	@Test
	void testContactServiceAppendsArray() {
		//Instantiate contact and contact service objects
		ContactService service = new ContactService();
		Contact contact = new Contact("1234", "John", "Doe", 
				"123 Main St.", "4121234567");
		
		//Add contact to contact service
		service.addContact(contact);
		
		//IF our contacts list has 1 element then we know our logic holds
		assertTrue(service.getNumContacts() == 1);
	}
	
	//Ensures that duplicate IDs are rejected
	@Test
	void testContactServiceUniqueID() {
		//Instantiate a contact service object
		ContactService service = new ContactService();
		//Instantiate a contact object
		Contact contact = new Contact("1234", "John", "Doe", 
				"123 Main St.", "4121234567");
		//Instantiate a contact object with identical ID
		Contact contact2 = new Contact("1234", "Jane", "Doe", 
				"123 Main St.", "4121234568");
		//Attempt to add both contacts to contact service list
		service.addContact(contact);
		service.addContact(contact2);
		//IF the array size = 1 we know that our validation succeeded.
		assertTrue(service.getNumContacts() == 1);
	}
	
	/*
	 * Ensures that contacts can be deleted using the
	 * deleteContact() method with a unique ID argument
	 */
	@Test
	void testContactServiceDeletesContact() {
		//Instantiate a contact service object
		ContactService service = new ContactService();
		//Instantiate a contact object
		Contact contact = new Contact("1234", "John", "Doe", 
				"123 Main St.", "4121234567");
		//Add contact to contact service
		service.addContact(contact);
		//Remove contact with unique id 1234
		service.deleteContact("1234");
		//If our array is empty we know our contacts are being removed
		assertTrue(service.getNumContacts() == 0);
	}
	
	
	//Ensures that the updateFirstName() method performs as expected
	@Test
	void testContactServiceUpdatesFirstName() {
		//Instantiate a contact service object
		ContactService service = new ContactService();
		//Instantiate a contact object
		Contact contact = new Contact("1234", "John", "Doe", 
				"123 Main St.", "4121234567");
		//Add contact to contact service
		service.addContact(contact);
		//Update name
		service.updateFirstName("1234", "Jane");
		
		//Access the object at index and check that name updated
		assertTrue(service.getContactList().get(0)
				.getFirstName() == "Jane");
	}
	
	//Ensures that the updateLastName() method performs as expected
	@Test
	void testContactServiceUpdatesLastName() {
		//Instantiate a contact service object
		ContactService service = new ContactService();
		//Instantiate a contact object
		Contact contact = new Contact("1234", "John", "Doe", 
				"123 Main St.", "4121234567");
		//Add contact to contact service
		service.addContact(contact);
		//Update name
		service.updateLastName("1234", "Smith");
		//Access the object at index and check that name updated
		assertTrue(service.getContactList().get(0)
				.getLastName() == "Smith");
	}
	
	//Ensures that the updatePhoneNumber method performs as expected
	@Test
	void testContactServiceUpdatesPhoneNumber() {
		//Instantiate a contact service object
		ContactService service = new ContactService();
		//Instantiate a contact object
		Contact contact = new Contact("1234", "John", "Doe", 
				"123 Main St.", "4121234567");
		//Add contact to contact service
		service.addContact(contact);
		//Update name
		service.updatePhoneNumber("1234", "4121234568");;
		//Access the object at index and check that name updated
		assertTrue(service.getContactList().get(0)
				.getPhoneNumber() == "4121234568");
	}
	

}
