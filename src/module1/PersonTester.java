package module1;

public class PersonTester {

	public static void main(String[] args) {
		Person[] pData = new Person[3];
		
		pData[0] = new Person("James Gosling", 1955);
		pData[1] = new Person("Dennis Ritchie", 1941);
		pData[2] = new Person();
		
		for (int i = 0; i < pData.length; i++) {
			System.out.println("The age of " + pData[i].getName() + " is " + pData[i].calculateAge(2020) + " years.");
			System.out.println();
		}
		
		for (Person people : pData) {
			System.out.println(people.toString());
		}

	}

}
