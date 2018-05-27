package musicData;

import convertors.BaseSixtyFour;

public class Mood {
	private Category cat; 
	private String name;
	//private boolean isLeaf;
	private Mood parent;
	
	public Mood(String moodName, Mood moodParent) {
		
		this.name= moodName;
		this.parent = moodParent;
		if(moodParent != null) {
			this.cat = moodParent.getCategory();
		}else {
			cat = null;
		}
	}

	
	public void setParent(Mood parentMood) {
		this.parent = parentMood;
	}
	
	public void removeParent(Mood parentMood) {
		this.parent = null;
	}
	
	public Category getCategory() {
		return this.cat;
	}
	
	public String getName() {
		return name;
	}
	
	public String getParentName() {
		return this.parent.getName();
	}
	
	public enum Category{
		ABOVE, DOWN, IN, ON, OUT, UP
	}
	
}
