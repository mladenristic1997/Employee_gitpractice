package person_classes;
/*
 * extends person
 * has office, salary and date hired
 */
public class Employee {
	
	private String name;
	private String office;
	private double sallary;
	private String date;
	
	
	public Employee() {
		
	}

	public Employee(String name, String office, double sallary, String date) {
		this.name = name;
		this.office = office;
		this.sallary = sallary;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
