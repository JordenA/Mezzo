package DNA;

import java.util.LinkedList;
import java.util.List;

public class PrideDNA implements DNA {

	List<Chunk> myDNA;
	
	@Override
	public void initDNA() {
		myDNA = new LinkedList<>();

	}

	@Override
	public List<Chunk> getDNA() {
		return myDNA;
	}

	@Override
	public void initDNA(List arr) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void buildDNA(Chunk chunkToAdd) {
		myDNA.add(chunkToAdd);
	}

}
