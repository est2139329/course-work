package module1;

public class Person {
	private String name;
	private int birthYear;
	
	public Person() {
		this.name = "unknown";
		this.birthYear = 0;
		
	}
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public String getName() {
		return name;
	}
	
	public int getBirthYear() {
		return birthYear;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public int calculateAge(int currentYr) {
		return currentYr - birthYear;
	}
	
	public boolean equals(Person obj) {
		return this.birthYear == obj.birthYear;
	}
	
	public String toString() {
		return "\tName: " + this.name + "\n    Birth Year: " + birthYear;
	}
	
}
