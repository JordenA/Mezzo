package DNA;
import java.util.List;

public interface DNA {
	void initDNA();
	void initDNA(List arr);
	List getDNA();
	void buildDNA(Chunk chunkToAdd);
}
