package variables;

import java.util.Date;
import java.util.Random;

import DNA.Chunk;

/**
 * This class evalutes and scores the top 10 song that were picked by the user
 * @author Tuval
 *
 */
public class GenerationEvaluator {
	
	private Individual[] toEvaluate;
	private Individual PastAlpha;
	
	
	public GenerationEvaluator(Individual[] toEvaluate) {
		this.toEvaluate = toEvaluate;
	}
	
	public Individual getAlpha() {
		Individual toReturn;
		//first generation
		if (PastAlpha == null) {
			//random one out of all
			Date d = new Date();
			Random rand = new Random(d.getTime());
			//finding a random one 
			int randomIndi = rand.nextInt(toEvaluate.length);
			toReturn = toEvaluate[randomIndi];
		}
		else {
			toReturn = evaluateGeneration();
		}
		
		return toReturn;
	}

	private Individual evaluateGeneration() {
		Individual toReturn = new PrideIndividual();
		int maxSimileraty = -1;
		for(int i = 0; i < toEvaluate.length; i++) {
			Individual temp = toEvaluate[i];
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
	/**
	 * This method returns an ordered array of Individuals by this order
	 * 1.Alpha Individual
	 * 2. Ellitte female
	 * @return
	 */
	public Indivdual[] setIndividualRoll() {
		
	}
	
	

}
