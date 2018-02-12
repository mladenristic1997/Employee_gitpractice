package person_classes;
/*
 * extends person
 * class status (freshman, sophomore, junior, or senior) status je konstanta
 */
public class Student extends Person{
	
	final int FRESHMAN = 1;
	final int SOPHOMORE = 2;
	final int JUNIOR = 3;
	final int SENIOR = 4;

	int year;
	public Student(String name, String address, String phoneNumber, String mail, int year) {
		super(name, address, phoneNumber, mail);
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
		
}
