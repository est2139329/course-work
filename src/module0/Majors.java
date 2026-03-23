package module0;

import java.util.Scanner;

public class Majors {

	enum Major { CHEM, CSC, CIS, ENG, HIS, PHY;}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("The Majors we offer are: ");
		
		for (Major majors : Major.values()) 
			System.out.print(majors + " ");
		
		System.out.println();
		System.out.println();
		System.out.print("Enter your major: ");
		String input = scan.next();
		
		
			if (input.equals(Major.values().toString())); {
				switch (input) {
				case "CHEM" :
					System.out.println("You entered " + input);
					System.out.println("Your major is in the Science Division.");
					break;
				case "CSC" :
					System.out.println("You entered " + input);
					System.out.println("Your major is in the Math Division");
					break;
				case "CIS" :
					System.out.println("You entered " + input);
					System.out.println("Your major is in the Business Division");
					break;
				case "ENG" :
					System.out.println("You entered " + input);
					System.out.println("Your major is in the Humanities Division");
					break;	
				case "HIS" :
					System.out.println("You entered " + input);
					System.out.println("Your major is in the Humanities Division");
					break;
				case "PHY" :
					System.out.println("You entered " + input);
					System.out.println("Your major is in the Science Division.");
					break;	
				}
			}
		}
		
	}
	

		