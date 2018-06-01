package textReader;

import DNA.Chunk;
import DNA.MoodChunk;

import java.util.Arrays;

public class ReaderWrapper extends AbstractReader {

	Reader moodReader;
	Reader InfuencedByReader;
	Reader InfluencingReader;
	Reader keywordReader;
	Reader propertiesReader;
	
	
	public ReaderWrapper(){
		Reader moodReader = new MoodReader();
		Reader InfuencedByReader = new InfluencedByReader();
		Reader InfluencingReader = new InfluencingReader();
		Reader keywordReader = new KeywordReader();
		Reader propertiesReader = new PropertiesReader();
	}
	@Override
	public Chunk[] readChunk(String strToRead) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Chunk[] readIndividualChunks(String[] strToRead){
		
		for(int i = 0; i < strToRead.length ; i ++) {
			
		}
		
		return null;
	}
	
	public Chunk[][] ReadGenerationChunks(String[][] strToRead){
		Chunk[][] toReturn  = new Chunk[20][25];
		for(int i = 0; i < strToRead.length ; i++) {
			Chunk[] mds = moodReader.readChunk(strToRead[i][0]);
			Chunk[] infBy = InfuencedByReader.readChunk(strToRead[i][1]);
			Chunk[] infing = moodReader.readChunk(strToRead[i][2]);
			Chunk[] kywrds = moodReader.readChunk(strToRead[i][3]);
			Chunk[] prprts = moodReader.readChunk(strToRead[i][4]);
			//toReturn[i]
		}
		
		return null;
	}
	
	private Chunk[] chopChunks(Chunk[] toChop, int numberForOutput) {
		Chunk[] toReturn;
		switch(toChop.getClass().getName()) {
			case "MoodReader":
				toReturn = new MoodChunk[6];
		}
		//Chunk[] toReturn = new 
		
		return null;
	}
	

}
