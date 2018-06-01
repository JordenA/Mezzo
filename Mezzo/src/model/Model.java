package model;

import DNA.Chunk;
import convertors.Convertor;
import convertors.MoodConvertor;
import textReader.InfluencedByReader;
import textReader.InfluencingReader;
import textReader.KeywordReader;
import textReader.MoodReader;
import textReader.PropertiesReader;
import textReader.Reader;
import textReader.TagReader;
import textReader.UIDReader;
import variables.Generation;
import variables.Individual;
import variables.PrideGeneration;
import variables.PrideIndividual;

public class Model {
	
	Generation currentGeneration;
	Reader rdrMood;
	Reader rdrInf;
	Reader rdrInfBy;
	Reader rdrUID;
	Reader rdrProp;
	Reader rdrTag;
	Reader keyWordRdr;
	public Model(){
		rdrMood = new MoodReader();
		rdrInf = new InfluencingReader();
		rdrInfBy = new InfluencedByReader();
		rdrUID = new UIDReader();
		rdrProp = new PropertiesReader();
		rdrTag = new TagReader();
		keyWordRdr = new KeywordReader();
	}
	
	public Generation createFirstPool(String[][] firstUserInput) {
		Generation toReturn = new PrideGeneration();
		for(int i = 0 ; i < firstUserInput.length; i++) {
			Individual toAdd = new PrideIndividual();
			Chunk[] moods = rdrMood.readChunk(firstUserInput[i][0]);
			//check if right
			Chunk[] infFrm = rdrInf.readChunk(firstUserInput[i][1]);
			Chunk[] infTo = rdrInfBy.readChunk(firstUserInput[i][2]);
			Chunk[] infKeywords = keyWordRdr.readChunk(firstUserInput[i][3]);
			Chunk[] infProp = rdrProp.readChunk(firstUserInput[i][4]);
			
			
		}
		//problem!
		return null;
	}

}
