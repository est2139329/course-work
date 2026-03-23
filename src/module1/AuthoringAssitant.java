package module1;
import java.util.Scanner;
public class AuthoringAssitant {
	
	
	public static char printMenu(Scanner scnr) {
		System.out.print("Enter a sample text: ");
		String userText = scnr.nextLine();
		
		
		System.out.println();
		System.out.println("You entered: " + userText);
		char userOption = ' ';
		
		
		while (userOption != 'q') {
		System.out.println();
		System.out.println("MENU");
		System.out.println("c - Number of non-whitespace characters");
		System.out.println("w - Number of words");
		System.out.println("f - Find text");
		System.out.println("r - Replace all !'s");
		System.out.println("s - Shorten spaces");
		System.out.println("q - Quit");
		System.out.println();
		System.out.println("Choose an option: ");
		
		userOption = scnr.nextLine().charAt(0);
		if (userOption == 'c') {
			System.out.print("Number of non-whitespace characters: ");
			System.out.println(getNumOfNonWSCharacters(userText));
		}
		if (userOption == 'w') {
			System.out.print("Number of words: ");
			System.out.println(getNumOfWords(userText));
		}
		if (userOption == 'f') {
			System.out.println(replaceExclamation(userText));
		}
		if (userOption == 'r') {
			System.out.println(shortenSpace(userText));
		}
		if (userOption == 's') {
			System.out.print("Edited Text: ");
			String find = scnr.nextLine();
			System.out.println(findText(find, userText));
		}
		if (userOption == 'q') {
			System.out.print("Goodbye!!");
		}
	}
			return userOption;
}
		
	
	public static int getNumOfNonWSCharacters(final String usrStr) {
		int count = 0;
		for (int i = 0; i < usrStr.length(); i++) {
			if (usrStr.charAt(i) != ' ') {
				count++;
			}
			
		}
		
		return count;
	}
	
	public static int getNumOfWords(final String usrStr) {
		int count = 1;
		 for (int i = 1;i < usrStr.length(); i++) {
			 if ((Character.isWhitespace(usrStr.charAt(i)) == true) && (Character.isWhitespace(usrStr.charAt(i-1)) == false)) {
				 count++;
			 }
		 }
		 return count;
	}
	
	public static String replaceExclamation(final String usrStr) {
		String str1 = " ";
		
		for (int i = 0; i < usrStr.length(); i++) {
			if (usrStr.charAt(i) != '!') {
				str1 += usrStr.charAt(i);
			}
			else {
				str1 += ".";
			}
		}
		return str1;
	}
	
	public static String shortenSpace(final String usrStr) {
		String str2 = " ";
		
		for (int i = 0; i < usrStr.length(); i++) {
			if (usrStr.charAt(i) != ' ' && ((i + 1) != usrStr.length() && usrStr.charAt(i + 1) != ' ')) {
				str2 += usrStr.charAt(i);
			}
		
		}
		
		return str2;
	}
	
	public static int findText(String toFind, String usrStr) {
		int count = 0;
		boolean end = false;
		int position = 0;
		
		while (end != true) {
			
			position = usrStr.indexOf(toFind, position);
			count++;
			if (position + toFind.length() < usrStr.length()) {
				position += toFind.length();
			}
			else {
				end = true;
			}
			if (position == 0) {
				end = true;
			}
		}
		return count;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		
		printMenu(scnr);
		
		
	}
}
