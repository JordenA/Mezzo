package algorithm;

import java.util.Map;

import DNA.Chunk;
import DNA.DNA;
import variables.Individual;

public interface Algorithm {

	void fitness();
	Individual[] reproduce(Individual[] currentGeneration);
	Individual generateIndividual();
	Individual[] createFirstPool();
	Individual generateIndividual(Chunk[] allQualities);
	Individual[] createFirstPool(Chunk[][] userPicks); 

	
}
