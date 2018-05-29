package DNA;

public abstract class AbstractChunk implements Chunk {

	String name;
	String UID;
	int score;
	
	AbstractChunk(String name,String UID, String score){
		this.name = name;
		this.UID = UID;
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
	
	@Override
	public String getUID() {
		return UID;
	}

}
