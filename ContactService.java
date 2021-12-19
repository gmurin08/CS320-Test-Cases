package app;

import java.util.ArrayList;

public class ContactService {
	//ArrayList to hold our contact objects 
	ArrayList<Contact> contacts;
	
	//default constructor
	public ContactService() {
		this.contacts = new ArrayList<>();
	}
	
	/**
	 *  Validates the provided contactId parameter and 
	 *  instantiates a new contact object. Adds contact 
	 *  to the contacts array list. Outputs an error 
	 *  message if contactId is not unique.
	 *  
	 * @param contactId - Must be unique and not null
	 * @param firstName - Must not be null
	 * @param lastName - Must not be null
	 * @param address - Must not be null
	 * @param phoneNumber - Must not be null
	 */
	public void addContact(Contact contact) {
		for(int i = 0; i < contacts.size(); i++) {
			//IF the contactID already exists, output error and return
			if(contact.getContactID() == contacts.get(i).getContactID()) {
				System.out.println("Contact ID already exists."
						+ " Please Try Again");
				return;
			}
			
		}
		contacts.add(contact);
	}
	
	//Returns the size of the contacts ArrayList
	public int getNumContacts() {
		return contacts.size();
	}
	
	//Traverses contacts list and returns first matching object
	public ArrayList<Contact> getContactList() {
		return contacts;
	}
	
	/**
	 * Deletes the specified contact from the contacts ArrayList.
	 * 
	 * @param contactId -Provide the contactId of the contact
	 * to be deleted
	 */
	public void deleteContact(String contactId) {
		for(int i = 0; i < contacts.size(); i++) {
			//IF the contactID exists remove it
			if(contactId == contacts.get(i).getContactID()) {
				contacts.remove(i);
			}
		}
		//If no matching result print not found
		System.out.print("not found");
	}
	
	/**
	 * Updates contact first name.
	 * Traverses the list of contacts
	 * for a matching Id and either updates the 
	 * objects info or outputs "not found".
	 * 
	 * @param contactId
	 * @param firstName
	 */
	public void updateFirstName(String contactId, String firstName) {
		for(int i = 0; i < contacts.size(); i++) {
			//IF the contactID exists update firstName
			if(contactId == contacts.get(i).getContactID()) {
				contacts.get(i).setFirstName(firstName);
				break;
			}
		}
		//If no matching result print not found
		System.out.print("not found");
	}
	
	/**
	 * Updates contact last name.
	 * Traverses the list of contacts
	 * for a matching Id and either updates the 
	 * objects info or outputs "not found".
	 * 
	 * @param contactId
	 * @param firstName
	 */
	public void updateLastName(String contactId, String lastName) {
		for(int i = 0; i < contacts.size(); i++) {
			//IF the contactID exists update lastName
			if(contactId == contacts.get(i).getContactID()) {
				contacts.get(i).setLastName(lastName);
				break;
			}
		}
		//If no matching result print not found
		System.out.print("not found");
	}
	
	/**
	 * Updates contact last name.
	 * Traverses the list of contacts
	 * for a matching Id and either updates the 
	 * objects info or outputs "not found".
	 * 
	 * @param contactId
	 * @param firstName
	 */
	public void updateAddress(String contactId, String address) {
		for(int i = 0; i < contacts.size(); i++) {
			//IF the contactID update the address
			if(contactId == contacts.get(i).getContactID()) {
				contacts.get(i).setAddress(address);
				break;
			}
		}
		//If no matching result print not found
		System.out.print("not found");
	}
	
	/**
	 * Updates contact phone number.
	 * Traverses the list of contacts
	 * for a matching Id and either updates the 
	 * objects info or outputs "not found".
	 * 
	 * @param contactId
	 * @param firstName
	 */
	public void updatePhoneNumber(String contactId, String phoneNumber) {
		for(int i = 0; i < contacts.size(); i++) {
			//IF the contactID exists update the phone number
			if(contactId == contacts.get(i).getContactID()) {
				contacts.get(i).setPhoneNumber(phoneNumber);
				break;
			}
		}
		//If no matching result print not found
		System.out.print("not found");
	}
}
