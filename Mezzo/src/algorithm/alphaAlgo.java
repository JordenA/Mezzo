package algorithm;
import java.util.Random;
import java.util.Scanner;

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

	@Override
	public Individual[] createFirstPool() {
		String[] topArists = new String[20];
		Individual[] firstPool = new Individual[20];
		topArists[0] = printquestion("britney", "beyonce");
		
		
		return null;
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
	
	

}
