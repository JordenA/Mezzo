package algorithm;

import java.util.Map;

import DNA.Chunk;
import DNA.DNA;
import variables.Generation;
import variables.Individual;

public interface Algorithm {

	void fitness();
	Individual[] reproduce(Generation currentGeneration);
	Individual generateIndividual(Chunk[] allQualities);
	Individual[] createFirstPool(Chunk[][] userPicks); 

	
}
