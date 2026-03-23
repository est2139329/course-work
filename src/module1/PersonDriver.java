package module1;

import java.util.Scanner;

public class PersonDriver {

	public static void main(String[] args) {
		String pName;
		int pBirthYear;
		int currentYear;
		int count = 1;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Creating Person Objects");
		System.out.println("----------------------");
		System.out.print("Enter a current year please: ");
		currentYear = scan.nextInt();
	//-------------------------------------------------------------------------------	
		scan.nextLine();
		System.out.println("\nPerson #" + count);
		System.out.print("Enter a name please: ");
		pName = scan.nextLine();
		System.out.print("Enter a birth year: ");
		pBirthYear = scan.nextInt();
		
		Person teacher = new Person(pName, pBirthYear);
		System.out.println("\nThe Person data is: ");
		System.out.println(teacher);
		System.out.println("\t age: " + teacher.calculateAge(currentYear));
		
		scan.nextLine();
		count++;
	//---------------------------------------------------------------------------------	
		System.out.println("\nPerson #" + count);
		System.out.print("Enter a name please: ");
		pName = scan.nextLine();
		
		
		System.out.print("Enter a birth year: ");
		pBirthYear = scan.nextInt();
		
		Person student = new Person(pName, pBirthYear);
		System.out.println("\nThe Person data is: ");
		System.out.println(student.toString());
		System.out.println("\t age: " + student.calculateAge(currentYear));
		
		if (teacher.equals(student)) {
			System.out.println("Teacher " + teacher.getName() + " is almost the same age as " + "Student " + student.getName());
			
		}
		else {
			System.out.println("Teacher " + teacher.getName() + " is NOT the same age as " + "Student " + student.getName());
		}
			
		
		scan.close();
	
}
}		
		/*
		Creating Person Objects
		----------------------
		Enter a current year please: 2022
		
		Person #1
		Enter a name please: Daniela
		Enter a birth year: 1993
		
		The Person data is: 
			Name: Daniela
		    Birth Year: 1993
			 age: 29
		
		Person #2
		Enter a name please: Esteban
		Enter a birth year: 1993
		
		The Person data is: 
			Name: Esteban
		    Birth Year: 1993
			 age: 29
		Teacher Daniela is almost the same age as Student Esteban
		*/