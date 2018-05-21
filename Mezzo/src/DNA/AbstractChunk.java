package DNA;

public abstract class AbstractChunk implements Chunk {

	String name;
	int score;
	
	
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;	
	}

}
