package algorithm;
import java.net.NetworkInterface;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import DNA.Chunk;
import DNA.DNA;
import DNA.MoodChunk;
import DNA.PrideDNA;
import convertors.Convertor;
import convertors.MoodConvertor;
import variables.Generation;
import variables.Individual;
import variables.PrideIndividual;

public class alphaAlgo implements Algorithm {


	Convertor moodConvrtr;

	public alphaAlgo(){
		moodConvrtr = new MoodConvertor();
	}
	@Override
	public void fitness() {
		// TODO Auto-generated method stub 

	}
	
	//for now only for first indivdual in first generation
	@Override
	public Individual generateIndividual(Chunk[] allQualities) {
		Individual toReturn = new PrideIndividual();
		for(Chunk c:allQualities) {
			toReturn.addChunk(c);
		}
		return toReturn;
	}

	@Override
	public Individual[] reproduce(Generation currentGeneration) {
		return null;
		
		
	}
	
	@Override
	public Individual[] createFirstPool(Chunk[][] userPicks) {
		Individual[] firstPool = new PrideIndividual[20];
		for(int i = 0; i < userPicks.length ;i++) {
			firstPool[i] = this.generateIndividual(userPicks[i]);
		}
		
		return firstPool;
	}

	
	public void setGeneration(String [] strings) {
		for(int i = 0; i < strings.length ; i++) {
			
		}
	}
	
	public String getDataFromInput(String input) {
		/**
		Map<String, String> ToReturn = new HashMap<String, String>();
		String[] partsMood = input.split("\\[moods\\]");
		String afterMoods = partsMood[1];
		for(int i = 0; i < 10 ; i ++) {
			ToReturn.put(getSpeficDataFromInput, value)getSpeficDataFromInput
		}
		return moodName;
		
		**/
		
		return null;
	}
	/**
	private String getSpeficDataFromInput(String input) {
		String[] partsName = input.split("\\[name\\]");
		String afterName = partsName[1];
		String[] partsArrow = afterName.split("=> ");
		String moodNameWithTail = partsArrow[1];
		String[] noTail = moodNameWithTail.split("\\[");
		return noTail[0];
	}
	**/
	private Individual[] reproduceHelper(Individual alphaMale, Individual[] ElliteFemales, Individual[] elliteMales, Individual mutation) {
		
		return null;
	}
	
	private Individual makeChild(Individual parentA, Individual parentB) {
		Date d = new Date();
		Random rand = new Random(d.getTime());
		//making sure no null
		Individual toReturn = new PrideIndividual();
		int iterationNumberA = parentA.getPrideDNA().getDNA().size();
		int iterationNumberB = parentB.getPrideDNA().getDNA().size();
		int iterationNumber = Math.max(iterationNumberA, iterationNumberB);
		for(int i = 0; i < iterationNumber; i++) {
			Chunk toAdd;
			int randNum = rand.nextInt(2);
			if(randNum == 0) {
				toAdd = parentA.getPrideDNA().getDNA().get(i);
			}else {
				toAdd = parentB.getPrideDNA().getDNA().get(i);
			}
			toReturn.addChunk(toAdd);
		}
		
		return toReturn;
	}
	
	

}
