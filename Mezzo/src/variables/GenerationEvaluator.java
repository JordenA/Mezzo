package variables;

import java.util.Date;
import java.util.Random;

import DNA.Chunk;

public class GenerationEvaluator {
	
	private Generation currentGeneration;
	private Individual PastAlpha;
	
	
	public GenerationEvaluator(Generation currentGeneration) {
		this.currentGeneration = currentGeneration;
	}
	
	public Individual getAlpha() {
		Individual toReturn;
		//first generation
		if (PastAlpha == null) {
			//random one out of all
			Date d = new Date();
			Random rand = new Random(d.getTime());
			//finding a random one 
			int randomIndi = rand.nextInt(currentGeneration.getGeneration().length);
			toReturn = currentGeneration.getGeneration()[randomIndi];
		}
		else {
			toReturn = evaluateGeneration();
		}
		
		return toReturn;
	}

	private Individual evaluateGeneration() {
		Individual toReturn = new PrideIndividual();
		int maxSimileraty = -1;
		for(int i = 0; i < currentGeneration.getGeneration().length; i++) {
			Individual temp = currentGeneration.getGeneration()[i];
			int currSimileraty = evaluateIndividual(temp);
			if(currSimileraty > maxSimileraty) {
				toReturn = temp;
				maxSimileraty = currSimileraty;
			}
		}		
		return toReturn;
	}
	
	private int evaluateIndividual(Individual toEvaluate) {
		int i = 0;
		for(Chunk c: PastAlpha.getPrideDNA().getDNA()) {
			if(PastAlpha.getPrideDNA().getDNA().contains(c)) {
				i++;
			}
		}
		
		return i;
	}
	

}
