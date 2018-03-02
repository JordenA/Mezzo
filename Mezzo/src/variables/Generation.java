package variables;



public interface Generation {
	Individual[] indi= new Individual[20];
	Individual[] getGeneration();
	void reproduce();

}
