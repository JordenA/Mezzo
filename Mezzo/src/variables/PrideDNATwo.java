package variables;

import java.util.LinkedList;
import java.util.List;

public class PrideDNATwo implements DNA {

	List<BaseSixtyFour> myDNA;
	
	@Override
	public void initDNA() {
		myDNA = new LinkedList<BaseSixtyFour>();

	}

	@Override
	public void initDNA(List arr) {
		myDNA = new LinkedList<BaseSixtyFour>(arr);

	}

	@Override
	public List getDNA() {
		return myDNA;
	}

}
