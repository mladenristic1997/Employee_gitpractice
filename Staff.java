package person_classes;
/*
 * extends person
 * has title
 */
public class Staff extends Person {
	
	private String title;
	
	public Staff(String title, String name, String address, String phoneNumber, String mail) {
		super(name, address, phoneNumber, mail);
		this.title = title;
		
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "" + this.getClass() + "\nName: " + getName() + "\n";
	}
	
	

}
