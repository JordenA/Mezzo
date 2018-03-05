package algorithm;

import variables.DNA;
import variables.Individual;

public interface Algorithm {
	//public Individual[] init();
	void run();
	void fitness();
	Individual[] reproduce(Individual[] currentGeneration);
	Individual generateIndividual();

	
}