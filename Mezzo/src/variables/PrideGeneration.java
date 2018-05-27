package variables;

import java.util.List;

import algorithm.Algorithm;
import algorithm.alphaAlgo;

public class PrideGeneration implements Generation {
	int fitness;
	Algorithm algo;
	Individual[] pool;
	
	PrideGeneration(){ 
		algo= new alphaAlgo();
		//pool = this.algo.createFirstPool();
	}
	

	@Override
	public Individual[] getGeneration() {
		return pool;
	}

	@Override
	public void reproduce() {
		algo.reproduce(this);
	}


	@Override
	public Individual getAlpha() {
		for(int i = 0; i < pool.length ; i++) {
			if(indi[i].isAlphaMale() == true)
				return indi[i];
		}
		
		return null;
	}


	@Override
	public Individual getMutation() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Individual> getMales() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Individual> getFemales() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
