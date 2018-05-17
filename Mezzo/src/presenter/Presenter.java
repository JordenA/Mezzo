package presenter;

import model.Model;
import view.View;

public class Presenter {
	private View view;
	private Model model;
	
	public Presenter(View view, Model model) {
	this.view = view;
	this.model = model;
	
	    }

}
