package module3;

public class Book extends Publication implements PubType {

	public Book() {
		super();
		type = "Book";
	}
	@Override
	public String getPublicationType() {
		return type;
	}
	
	
}
