package musimapApi;

public class MusimapApiMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String artist= new String();
		String track= new String();
		String uid= new String();
		artist= "coldplay";
		track= "clocks";
		uid= "37BF6FEF-4685-EF3D-0BAA-3256FD0BF933"; // uid of a song
		String[] arr = {"britney", "pink floyd", "david bowie", "katy perry", "bob marley", "the beatles", "bjork", "barry white", "edith piaf", "nirvana", "jimi hendrix", "justin bieber", "rihanna", "adele", "eminem", "cia", "shakira", "aqua", "prince", "taylor swift"};
		Api api = new Api();
		//api.getArtistInfluancedTo(artist);
		//api.getArtistInfluancedFrom(artist);
		//api.getArtistProperties(artist);
		//api.getArtistTags(artist);
		//api.getArtistKeywords(artist);
		//api.getArtistMemberships(artist);
		//api.getArtistReferences(artist);
		//api.getArtistMoods(artist);
		//api.getTrackAudioAnalysis(track);
		//api.initFirstDNA(arr);
		//api.getMoodsHierarchy();
		//api.getTrackByDNA();
		//api.getTrackInfluancedFrom(track);
		//api.getArtistUID(artist);
		//api.getSongMoodsBySongUid(uid);
		//api.getSongKeywordsBySongUid(uid);
		//api.getSongTagsBySongUid(uid);
		//api.getSongPropertiesBySongUid(uid);
		//api.getSongInfluancedTo(uid);
		//api.getSongInfluancedFrom(uid);
		api.getSongInfoBySongUid(uid);

		
		 
	   }
	

}
