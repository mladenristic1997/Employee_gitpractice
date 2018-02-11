package person_classes;
/*
 * extends person
 * has office, salary and date hired
 */
public class Employee extends Person{

	private String office;
	private double sallary;
	private String date;
	
	public Employee(){
		
	}

	public Employee(String name, String address, String phoneNumber, String mail, String office, double sallary, String date) {
		setName(name);
		setAddress(address);
		setPhoneNumber(phoneNumber);
		setMail(mail);
		this.sallary = sallary;
		this.office = office;
		this.date = date;
		
	}

	

	

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSallary() {
		return sallary;
	}

	public void setSallary(double sallary) {
		this.sallary = sallary;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public String toString() {
		return "Class name " + Employee.class + " employee name: " + getName();
	}
	

}
