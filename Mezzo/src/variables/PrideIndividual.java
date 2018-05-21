package variables;

import DNA.Chunk;
import DNA.DNA;
import DNA.PrideDNA;

public class PrideIndividual implements Individual {
	private DNA pDNA;
	private boolean isMale;
	private boolean isAlphaMale;
	private boolean isMutation;
	private boolean isELite;
	
	public PrideIndividual(DNA indiDNA){
		pDNA= indiDNA;
	}
	
	public PrideIndividual(Chunk[] DNAinChuncks){
		pDNA = new PrideDNA();
		for(Chunk c: DNAinChuncks) {
			pDNA.buildDNA(c);
		}
	}
	
	
	
	public DNA getPrideDNA() {
		return pDNA;
	}
	
	public void setPrideDNA(DNA prideDNA) {
		this.pDNA = prideDNA;
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

	@Override
	public void addChunk(Chunk chunkToAdd) {
		pDNA.buildDNA(chunkToAdd);
		
	}
	
	
}
