package person_classes;
/*
 * extends person
 * has title
 */
public class Staff {
	
	private String title;
	private String name;
	
	
public Staff() {
	
}

public Staff(String title, String name) {
	this.title = title;
	this.name = name;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String toString(){
	return "Staff class " + Staff.class + " title: " + getTitle() + " Staff name: " + getName();
}

}
