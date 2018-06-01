package variables;

import java.util.List;

import algorithm.Algorithm;
import algorithm.alphaAlgo;

public class PrideGeneration implements Generation {
	
	int fitness;
	Algorithm algo;
	Individual[] pool;
	
	public PrideGeneration(){ 
		//change from null
		algo= new alphaAlgo(null);
		//pool = this.algo.createFirstPool();
	}
	

	@Override
	public Individual[] getGeneration() {
		return pool;
	}

	@Override
	public void reproduce(Individual[] pickedSongs) {
		pool = algo.reproduce(pickedSongs);
	}






	
	
	
}
