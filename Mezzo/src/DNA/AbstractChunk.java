package DNA;

public abstract class AbstractChunk implements Chunk {

	String name;
	int score;
	
	AbstractChunk(String name, String score){
		this.name = name;
		Double tempDouble = Double.parseDouble(score);
		this.score = tempDouble.intValue();
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
