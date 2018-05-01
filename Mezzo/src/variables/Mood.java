package variables;

import java.util.LinkedList;
import java.util.List;

public class Mood {
	
	private String name;
	private boolean isLeaf;
	private List<Mood> Moods;
	private Mood parent;
	private int number;
	
	public Mood(String moodName, Mood moodParent, int moodNumber) {
		Moods = new LinkedList<Mood>();
		name= moodName;
		this.parent = moodParent;
		this.number = moodNumber;
		parent.add(this);
	}
	public void add(Mood newChild) {
		newChild.setParent(this);
		Moods.add(newChild);
		if(isLeaf) {
			isLeaf = false;
		}
	}
	
	public void remove(Mood childToRemove) {
		Moods.remove(childToRemove);
		if(Moods.size() == 0) {
			isLeaf = true;
		}
	}
	
	public void setParent(Mood parentMood) {
		this.parent = parentMood;
	}
	
	public void removeParent(Mood parentMood) {
		this.parent = null;
	}
	
	public String getName() {
		return name;
	}
	
	
	

}
