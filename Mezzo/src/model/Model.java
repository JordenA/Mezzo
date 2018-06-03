package model;

import java.util.LinkedList;
import java.util.List;

import DNA.Chunk;
import musicData.MoodHierarchy;
import textReader.MoodHierarchyReader;
import textReader.ReaderWrapper;
import variables.Generation;
import variables.GenerationEvaluator;
import variables.Individual;
import variables.PrideGeneration;
import variables.PrideIndividual;

public class Model {
	
	GenerationEvaluator GE;
	ReaderWrapper RR = new ReaderWrapper();
	Generation currentGeneration;
	MoodHierarchyReader MHR;
	MoodHierarchy MH;
	List<Individual> nextGeneration;

	public Model(){
		RR = new ReaderWrapper();
		nextGeneration = new LinkedList<>();
		MHR = new MoodHierarchyReader();
		MH = MHR.readMoodHierarchy("hhh");
		currentGeneration = new PrideGeneration(MH);
		
	}
	
	public void createFirstPool(String[][] firstUserInput) {
		Individual[] firstPool = RR.ReadGenerationChunks(firstUserInput);	
		currentGeneration = new PrideGeneration(firstPool, MH);	
	}
	
	public void repreduce() {
		currentGeneration.reproduce(nextGeneration);
	}
	
	public void addToNextGeneration(Individual toAdd) {
		//adding picked song
		nextGeneration.add(toAdd);
		//checking if generation is full
		if(nextGeneration.size() == 10) {
			GE = new GenerationEvaluator(nextGeneration);
			nextGeneration = GE.setIndividualRoll();
			repreduce();
			nextGeneration.clear();
			//fitness
		}
	}
	
	public Individual getIndividualFromAPI(String[] individualData) {
		Individual toReturn = RR.readIndividualChunks(individualData);;
		return toReturn;
	}
	
	public Generation getGeneration() {
		return this.currentGeneration;
	}

}