package variables;

import java.util.LinkedList;
import java.util.List;

public class Mood {
	
	private String name;
	private boolean isLeaf;
	private List<Mood> Moods;
	private Mood parent;
	
	public Mood() {
		Moods = new LinkedList<Mood>();
	}
	public void add(Mood newChild) {
		newChild.
		Moods.add(newChild);
	}
	
	public void remove(Mood childToRemove) {
		Moods.remove(childToRemove);
	}
	
	public void setParent(Mood parentMood) {
		this.parent = parentMood;
	}
	
	

}

enum mainCategory{
	OUT, UP, ABOVE, DOWN, IN, ON
}

enum SubCategory{
	extroversion, manliness, good_vibrations, 
}
