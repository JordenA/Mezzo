package variables;
import DNA.Chunk;
import DNA.DNA;

public interface Individual {
	
	public void addChunk(Chunk chunkToAdd);

	DNA getPrideDNA();

	void setPrideDNA(DNA prideDNA);

	boolean isMale();

	void setMale(boolean isMale);

	boolean isAlphaMale();

	void setAlphaMale(boolean isAlphaMale);

	boolean isMutation();

	void setMutation(boolean isMutation);

	boolean isELite();

	void setELite(boolean isELite);
	
}
