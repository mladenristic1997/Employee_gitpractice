package person_classes;
/*
 * extends person
 * has title
 */
public class Staff extends Person {
	
	private String title;
	
	
	
public Staff() {
	
}

public Staff(String title, String name) {
	this.title = title;
	setName(name);
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}





public String toString(){
	return "Staff class " + Staff.class + " title: " + getTitle() + " Staff name: " + getName();
}

}
