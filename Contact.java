package app;


public class Contact {
	//Private field variables
	private String contactId;
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
	
	//Default constructor. Validates contact ID since there will be no 
	//setter defined.
	public Contact(String contactId, String firstName, String lastName,
			String address, String phoneNumber) {
		//IF contactId is null OR more than 10 characters throw exception.
		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid contactId");
		}
		this.contactId = contactId;
		this.setAddress(address);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPhoneNumber(phoneNumber);
	}
	
	//Getter Methods 
	public String getContactID() {
		return this.contactId;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	// Setter methods - All methods validate that fields are
	// not null and at least 10 characters per requirements
	public void setFirstName(String firstName) {
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		this.lastName = lastName;
	}
	
	public void setAddress(String address) {
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		this.address = address;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if(phoneNumber == null || phoneNumber.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		this.phoneNumber = phoneNumber;
	}
}
