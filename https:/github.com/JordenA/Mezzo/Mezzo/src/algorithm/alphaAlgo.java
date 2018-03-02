package algorithm;
import java.util.Random;

import variables.DNA;
import variables.Individual;
import variables.PrideDNA;
import variables.PrideIndividual;

public class alphaAlgo implements Algorithm {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fitness() {
		// TODO Auto-generated method stub

	}

	//create random DNA and returning person with this DNA
	@Override
	public Individual generateIndividual() {
		int[] arrDNA= new int[50];
		Random rand = new Random((System.currentTimeMillis()));
		for (int i=0; i<50; i++){
			arrDNA[i] = (rand.nextInt(50))%2;
		}
		DNA DNARes= new PrideDNA(arrDNA); 
		return new PrideIndividual(DNARes);
		
	}

	@Override
	public Individual[] reproduce(Individual[] currentGeneration) {
		return null;
		
		
	}
	
	

}
