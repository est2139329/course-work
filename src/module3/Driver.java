package module3;

public class Driver {

	public static void main(String[] args) {

		Book book1 = new Book();
		book1.setTitle("Java Foundations");
		Mag mag1 = new Mag();
		mag1.setTitle("Times");
		Book book2 = new Book();
		book2.setTitle("Computer Organization");
		Mag mag2 = new Mag();
		mag2.setTitle("Atlantic");
		
		System.out.println(mag1.toString());
		System.out.println(mag1.getPublicationType());
		
		System.out.println(book1.toString());
		System.out.println(book1.getPublicationType());
		
		System.out.println(mag2.toString());
		System.out.println(mag2.getPublicationType());
		
		System.out.println(book2.toString());
		System.out.println(book2.getPublicationType());
		
	}

}
/*
	Abstract class is useful while using inheritance because it helps with writing more flexible code while working with
*	higher level programming, and it keeps it organized to prevent errors. 
*/