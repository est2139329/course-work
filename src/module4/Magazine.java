package module4activity2;

/**
 * @author Dilshad Haleem
 * This class implements the Publication interface
 * and in doing so it provided definition of getPublication method
 */

public class Magazine implements Publication {
	
	private String title;
	
	/**
	 * 
	 * @return the title of the publication
	 */
	public String getTitle() {
		
		return title;
	}
	/**
	 * 
	 * @param title sets the title 
	 */
	public void setTitle(String title) {
		
	     this.title = title;
	}
	
	/**
	 * @return String 
	 * Implementation of the abstract method in the 
	 * Publication Interface
	 */

	@Override
	public String getPublicationType() {
		// TODO Auto-generated method stub
		return "Magazine";
	}

	/**
	 * @ Return a String representation
	 */
	public String toString() {
		
		return "Publication Type : " + getPublicationType () + "  Title: " + title;
	}
}
