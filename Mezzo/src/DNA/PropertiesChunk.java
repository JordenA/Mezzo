package DNA;

public class PropertiesChunk extends AbstractChunk {
	
	String catagory;
	
	public PropertiesChunk(String name,String catagory, String score) {
		super(name, score);
		this.catagory = catagory;
	}

}
