package algorithm;

import java.util.HashMap;
import java.util.Map;

public class AlphaDataBase implements DataBase {

	Map<String, String> moods;

	@Override
	public void generateMoodsMap() {
		moods = new HashMap<String, String>();
		moods.put("962C3966-5E12-696F-EF7E-68ABF6A2AFA7", "1");
		
	}
}
