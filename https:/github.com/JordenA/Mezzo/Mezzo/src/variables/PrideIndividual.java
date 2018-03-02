package variables;

public class PrideIndividual implements Individual {
	private DNA prideDNA;
	private boolean isMale;
	private boolean isAlphaMale;
	private boolean isMutation;
	private boolean isELite;
	
	public PrideIndividual(DNA indiDNA){
		prideDNA= indiDNA;
	}
	public PrideIndividual(PrideDNA pDNA){
		prideDNA= pDNA;
	}
	public DNA getPrideDNA() {
		return prideDNA;
	}
	public void setPrideDNA(DNA prideDNA) {
		this.prideDNA = prideDNA;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public boolean isAlphaMale() {
		return isAlphaMale;
	}
	public void setAlphaMale(boolean isAlphaMale) {
		this.isAlphaMale = isAlphaMale;
	}
	public boolean isMutation() {
		return isMutation;
	}
	public void setMutation(boolean isMutation) {
		this.isMutation = isMutation;
	}
	public boolean isELite() {
		return isELite;
	}
	public void setELite(boolean isELite) {
		this.isELite = isELite;
	}
	
}
