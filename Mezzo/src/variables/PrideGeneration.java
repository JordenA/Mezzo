package variables;

import algorithm.Algorithm;
import algorithm.alphaAlgo;

public class PrideGeneration implements Generation {
	int fitness;
	Algorithm algo= new alphaAlgo();
	
	PrideGeneration(){ 
		fitness=0;
		for(int i=0;i<20; i++){
			Individual person= algo.generateIndividual();
			indi[i] =person; //filing the generation with 19 persons for the first time(each person has DNA)
		}
		int[] arr={1,0,1,1,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,0,0,0,1,0,0,0,0,0,1,0,0,1,1,1,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1};
		// in the future will be user choice
		//indi[20] = new PrideIndividual(new PrideDNA(arr));
	}
	
	@Override
	public Individual[] getGeneration() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reproduce() {
		algo.reproduce(indi);

	}
	
}
