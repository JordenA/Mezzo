package variables;

import java.util.List;

public interface Generation {
	public Individual[] indi= new Individual[20];
	public Individual[] getGeneration();
	public void reproduce();
	public Individual getAlpha();
	public Individual getMutation();
	public List<Individual> getMales();
	public List<Individual> getFemales();
	
	
	

}
