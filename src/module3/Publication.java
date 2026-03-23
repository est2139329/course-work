package module3;

public class Publication implements PubType{

	protected String title;
	protected String type;
	
	public Publication() {
		title = "";
		type = "";
	}
	@Override
	public String getPublicationType() {
		// TODO Auto-generated method stub
		type = "Publication";
		return type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String toString() {
		return "Publication: " + "\tTitle: " + title;
	}

	
}
