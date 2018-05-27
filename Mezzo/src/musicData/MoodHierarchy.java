package musicData;

import java.util.HashMap;
import java.util.Map;

public class MoodHierarchy {

	Mood root = new Mood("Base", null);
	Map<String, Mood> allMoods;
	
	public MoodHierarchy() {
		allMoods = new HashMap<String, Mood>();
	}
	public Mood getRoot() {
		return root;
	}

	public String getRootName() {
		return root.getName();
	}

	public String getParentName(String curpar) {
		return allMoods.get(curpar).getName();
	}
	
	public void addMood(String name, String parentName) {
		//Mood MoodParent = allMoods.get(parentName);
		Mood MoodToAdd = new Mood(name, allMoods.get(parentName));
		allMoods.put(name, MoodToAdd);
	}
	
	public Map<String, Mood> getMap(){
		return allMoods;
	}

}
