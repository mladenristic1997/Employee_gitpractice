package person_classes;

/*
 * extends person
 * office hours(string, od koliko do koliko radite)
 * rank (izmislite nešto)
 */
public class Faculty extends Person {

	final int ASSISTANT_PROFESSOR = 1;
	final int ASSOCIATE_PROFESSOR = 2;
	final int FULL_PROFESSOR = 3;
	final int UNIVERSITY_PROFESSOR = 4;

	private String officeHours;
	private int rank;

	public Faculty(String name, String address, String phoneNumber, String mail, String officeHours, int rank) {
		super(name, address, phoneNumber, mail);
		setOfficeHours(officeHours);
		setRank(rank);
	}

	public String getOfficeHours() {
		return officeHours;
	}

	/**
	 * @return the rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @param officeHours
	 *            the officeHours to set
	 */
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	/**
	 * @param rank
	 *            the rank to set
	 */
	public void setRank(int rank) {
		if (rank >= ASSISTANT_PROFESSOR && rank <= UNIVERSITY_PROFESSOR) {
			this.rank = rank;
		}
	}

	@Override
	public String toString() {
		return "" + this.getClass() + "\nName:" + getName() + "\n";
	}

}
