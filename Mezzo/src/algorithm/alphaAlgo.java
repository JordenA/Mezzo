package algorithm;
import java.net.NetworkInterface;
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

	//create random DNA and returning person with this DNA
	@Override
	public Individual generateIndividual() {
		
		return null;
	}
	
	@Override
	public Individual generateIndividual(Chunk[] allQualities) {
		Individual toReturn = new PrideIndividual();
		for(Chunk c:allQualities) {
			toReturn.addChunk(c);
		}
		return toReturn;
	}

	@Override
	public Individual[] reproduce(Individual[] currentGeneration) {
		return null;
		
		
	}
	@Override
	public Individual[] createFirstPool() {
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
	
	private String printquestion(String firstArtist, String SecondArtist){
		Scanner reader = new Scanner(System.in);
		System.out.println("who do you prefer? " + firstArtist +  " or " + SecondArtist + "?");
		System.out.println("for " + firstArtist + " press 1 and for " + SecondArtist + " press 2");
		int n = reader.nextInt();
		reader.close();
		switch(n){
		case 1:
			return firstArtist;
		case 2:
			return SecondArtist;
		default:
			System.out.println("please type 1 OR 2 ONLY!!!!");
			return "ERROR";
		} 
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
	
	private String getSpeficDataFromInput(String input) {
		String[] partsName = input.split("\\[name\\]");
		String afterName = partsName[1];
		String[] partsArrow = afterName.split("=> ");
		String moodNameWithTail = partsArrow[1];
		String[] noTail = moodNameWithTail.split("\\[");
		return noTail[0];
	}
	
	

}
