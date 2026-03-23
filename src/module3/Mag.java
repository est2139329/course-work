package module3;

public class Mag extends Publication implements PubType {

	public Mag() {
		super(); 
		type = "Magazine";
	}
	@Override
	public String getPublicationType() {
		return type;
	}
	
}

