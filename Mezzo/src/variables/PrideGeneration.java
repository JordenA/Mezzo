package variables;

import algorithm.Algorithm;
import algorithm.alphaAlgo;

public class PrideGeneration implements Generation {
	int fitness;
	Algorithm algo;
	Individual[] pool;
	
	PrideGeneration(){ 
		algo= new alphaAlgo();
		pool = this.algo.createFirstPool();
	}
	

	@Override
	public Individual[] getGeneration() {
		return pool;
	}

	@Override
	public void reproduce() {
		algo.reproduce(indi);
	}
	
}
