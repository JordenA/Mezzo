package textReader;

import java.util.HashMap;
import java.util.Map;

import DNA.Chunk;
import DNA.MoodChunk;

public class MoodReader extends AbsractReader {


	
	
	@Override
	public Chunk[] read(String strToRead) {
		Chunk[] toReturn = new Chunk[20];
		String mood;
		mood = strToRead.substring(strToRead.lastIndexOf(" [moods] =>") + 1);
		for(int i = 0; i < 20 ; i++) {
			//removing everything from what we want to assign
			mood = mood.substring(mood.indexOf("[name]")+ 10);
			//creating new empty mood
			String moodToAssign = mood.substring(0, mood.indexOf(" "));
			//removing the mood we used
			mood = mood.substring(mood.indexOf("[importance] =>") + 16);
			
			String moodImportance = mood.substring(0, mood.indexOf(" "));
			System.out.println(moodToAssign);
			System.out.println(moodImportance);
			toReturn[i] = new MoodChunk(moodToAssign, moodImportance);
		}
		// TODO Auto-generated method stub
		return toReturn;
	}
	
	

}
