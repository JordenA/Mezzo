package DNA;

public abstract class AbstractChunk implements Chunk {

	String name;
	int score;
	
	AbstractChunk(String name, String score){
		this.name = name;
		this.score = Integer.parseInt(score);
	}
	
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;	
	}

}
