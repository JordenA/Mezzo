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
	
	
	public PrideIndividual() {
		
	}
	
	public PrideIndividual(DNA indiDNA){
		pDNA= indiDNA;
	}
	
	public PrideIndividual(Chunk[] DNAinChuncks){
		pDNA = new PrideDNA();
		for(Chunk c: DNAinChuncks) {
			pDNA.buildDNA(c);
		}
	}
	
	
	@Override
	public DNA getPrideDNA() {
		return pDNA;
	}
	
	@Override
	public void setPrideDNA(DNA prideDNA) {
		this.pDNA = prideDNA;
	}
	
	@Override
	public boolean isMale() {
		return isMale;
	}
	
	@Override
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	@Override
	public boolean isAlphaMale() {
		return isAlphaMale;
	}
	
	@Override
	public void setAlphaMale(boolean isAlphaMale) {
		this.isAlphaMale = isAlphaMale;
	}
	
	@Override
	public boolean isMutation() {
		return isMutation;
	}
	
	@Override
	public void setMutation(boolean isMutation) {
		this.isMutation = isMutation;
	}
	
	@Override
	public boolean isELite() {
		return isELite;
	}
	
	@Override
	public void setELite(boolean isELite) {
		this.isELite = isELite;
	}

	@Override
	public void addChunk(Chunk chunkToAdd) {
		pDNA.buildDNA(chunkToAdd);
		
	}
	
	
}
