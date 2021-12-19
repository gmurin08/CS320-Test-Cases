/**
 * ContactTest.java
 * 
 * @author gino.murin_snhu
 *
 * The following test cases for the Contact
 * class ensure that each object throws an error
 * when one of its field variables is null or has
 * the incorrect number of characters
 */
package tests;

//importing our contact class to be tested
import app.Contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {
	//Tests normal instantiation of contact object
	@Test
	void testContactClass() {
		Contact contact = new Contact("1234", "John", "Doe", 
				"123 Main St.", "4121234567");
		assertTrue(contact.getContactID().equals("1234"));
		assertTrue(contact.getFirstName().equals("John"));
		assertTrue(contact.getLastName().equals("Doe"));
		assertTrue(contact.getAddress().equals("123 Main St."));
		assertTrue(contact.getPhoneNumber().equals("4121234567"));
	}
	//Test case for an object with a first name that's over 10 characters
	@Test
	void testContactClassFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("1234", "ReallyLongName", "Doe",
					"123 Main St.", "4121234567");
		});
	}
	
	//Test case for an object with a last name that's over 10 characters
	@Test
	void testContactClassLastNameTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class, ()->{
				new Contact("1234", "John", "ReallyLongLastName",
						"123 Main St.", "4121234567");
			});
		}
		
	//Test case for an object with a contact ID that's over 10 characters
	@Test
	void testContactClassContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("123456789101", "John", "Doe",
					"123 Main St.", "4121234567");
		});
	}
	
	//Test case for an object with an id field over 30 characters
	@Test
	void testContactClassAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("1234", "John", "Doe",
					"This is an address field that is over"
					+ "30 charecters. We are testing to make sure"
					+ "an error is thrown.", "4121234567");
		});
	}
	
	//Test case for an object with a phone number field over 10 characters
	@Test
	void testContactClassPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("123456789101", "John", "Doe",
					"123 Main St.", "InvalidPhoneNumberField");
		});
	}
		
    //Test case for an object with a null contactId
	@Test
	void testContactClassIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact(null, "John", "Doe", 
					"123 Main St.", "4121234567");
		});
	}
	
	//Test case for an object with a null firstName field
	@Test
	void testContactClassFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("1234", null, "Doe", 
					"123 Main St.", "4121234567");
		});
	}
	
	//Test case for an object with a null lastName field
	@Test
	void testContactClassLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("1234", "John", null, 
					"123 Main St.", "4121234567");
		});
	}
	//Test case for an object with a null address field
	@Test
	void testContactClassAddressNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("1234", "John", "Doe", 
					null, "4121234567");
		});
	}
	
	//Test case for an object with a null phoneNumber field
	@Test
	void testContactClassPhoneIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("1234", "John", "Doe", 
					"123 Main St.", null);
		});
	}

}
