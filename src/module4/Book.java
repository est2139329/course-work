package module4activity2;

/**
 * 
 * @author Dilshad Haleem
 * This class creates objects of Book and Magazine
 * using the interface Publication as reference type
 * They both are implementing this interface
 * <p>
 * output
 * Publication Type : Magazine  Title: The Atlantic
 * Publication Type :  Book   Title: Java Foundations
 *
 */

public class Book implements Publication {

	private String title;
	
/**
 * 
 * @return title of the publication
 */
	public String getTitle() {
		return title;
	}

	/**
	 * 
	 * @param title sets the title of the publication
	 */
	public void setTitle(String title) {
		
	     this.title = title;
	}
	/**
	 * @ return String representation 
	 */
	public String toString() {
		
		return "Publication Type : " + getPublicationType () + "  Title: " + title;
	}
	/**
	 * Implementation of the abstract method in the 
	 * Publication interface
	 */
	@Override
	public String getPublicationType() {
		// TODO Auto-generated method stub
		return " Book ";
	}

	
}
