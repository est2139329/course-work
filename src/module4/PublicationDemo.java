package module4activity2;

/**
 * 
 * @author Dilshad
 *
 */

public class PublicationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Using the name of the interface as a reference type
	Publication pub1 = new Magazine();
	
//Using the name of the interface as a reference type
	Publication pub2 = new Book();
	
	//type casting to get to setTitle
	((Magazine)pub1).setTitle("The Atlantic");
	 ((Book)pub2).setTitle("Java Foundations");
	
	System.out.println(pub1);
	System.out.println(pub2);
		
	}

}
