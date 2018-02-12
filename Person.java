package person_classes;
/*
 * name
 * address
 * phone number
 * email address
 */


public class Person {
	
	private String name;
	private String address;
	private String phoneNumber;
	private String mail;
	
	public Person(String name, String address, String phoneNumber, String mail){
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.mail = mail;
	}
	public Person() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
