package test;

import algorithm.Algorithm;
import algorithm.alphaAlgo;
import textReader.MoodReader;
import textReader.Reader;

public class Test {
	
	Reader rdr = new MoodReader();
	boolean printInfo = true;
	String st;
	
	public void testering() {
		Algorithm alg = new alphaAlgo();
		alg.createFirstPool();
	}
	
	public Test(){
		st = new String("[nickname] => Beyoncé [moods] => Array ( [0] => Array ( [uid] => 86712840-0F9C-3AA0-74C5-DFBA82E879D1 [name] => aesthetic [importance] => 10 ) [1] => Array ( [uid] => 6D5AE713-FA4A-2067-6CC8-B296D29EF57B [name] => sensibility [importance] => 33 ) [2] => Array ( [uid] => 1BEECA8A-0184-F79B-6924-5188DAF241BD [name] => nourishment [importance] => 40 ) [3] => Array ( [uid] => AEEC9A7C-02BD-46AB-ABF5-91817B003BB6 [name] => precise [importance] => 77 ) [4] => Array ( [uid] => 2AD989FA-7E04-54B0-5ED8-924EE47604C0 [name] => energetic [importance] => 89 ) [5] => Array ( [uid] => 11FAD47C-FC9E-7C82-6EA8-14F6F4EE15FA [name] => inviting [importance] => 66 ) [6] => Array ( [uid] => D0F2CB86-0D10-9F76-CF84-750E9CCA6FDA [name] => fun [importance] => 100 ) [7] => Array ( [uid] => 0599F73B-6A25-E9DA-4668-589A71739A73 [name] => pretentious [importance] => 33 ) [8] => Array ( [uid] => 6755A82E-689A-E825-EE02-5551736CDB4D [name] => love [importance] => 55 ) [9] => Array ( [uid] => A03A702B-0EC4-300A-D18C-1542C9023315 [name] => good vibrations [importance] => 44 ) [10] => Array ( [uid] => 80B02A5D-3853-D70D-7336-8E3CC5CB5457 [name] => refined [importance] => 66 ) [11] => Array ( [uid] => EDFDE5F5-1B7B-5B3E-3C0C-DB3A7996C7C3 [name] => confident [importance] => 55 ) [12] => Array ( [uid] => 72B27930-5336-000C-470B-59A6786F254D [name] => ample [importance] => 11 ) [13] => Array ( [uid] => 633210E7-D8C2-9E3C-07A6-03968D0298AC [name] => spirituality [importance] => 1 ) [14] => Array ( [uid] => B371AD0E-0532-CBAD-105E-A00B0314E1ED [name] => glamourous [importance] => 88 ) [15] => Array ( [uid] => E50384B0-7F88-3104-39A2-184147A58DE2 [name] => communicative [importance] => 55 ) [16] => Array ( [uid] => 962C3966-5E12-696F-EF7E-68ABF6A2AFA7 [name] => Down (Metal) [importance] => 12 ) [17] => Array ( [uid] => 13F575EB-9BD7-BC37-61A8-4E80DED7F1AD [name] => warm-hearted [importance] => 66 ) [18] => Array ( [uid] => 88E4D296-5FD6-4A9E-C4E4-5E1DD302CB8B [name] => intense [importance] => 44 ) [19] => Array ( [uid] => 5DAB7738-1405-04D9-27ED-338BB51280BF [name] => open-minded [importance] => 55 ) [20] => Array ( [uid] => C5EF7029-5E84-7F61-B2D1-97D8030F514C [name] => Up (Air) [importance] => 19 ) [21] => Array ( [uid] => A10C9421-7F41-1C06-268E-2E921D877595 [name] => soft [importance] => 22 ) [22] => Array ( [uid] => 5BC6DCE0-5979-2889-25B7-52C05CE2D721 [name] => emotional [importance] => 55 ) [23] => Array ( [uid] => 4A834601-9E64-3B0C-5B99-2E533B4746C9 [name] => gentle [importance] => 44 ) [24] => Array ( [uid] => 7488B6B9-5EB0-09B7-02C4-21FBC68090FB [name] => sophisticated [importance] => 27 ) [25] => Array ( [uid] => 62482C44-67CE-6A87-BC39-B6D15D6CF153 [name] => bittersweet [importance] => 33 ) [26] => Array ( [uid] => C63CE1D1-6178-7984-8629-6C70B180270A [name] => temperament [importance] => 29 ) [27] => Array ( [uid] => 083AE5B4-A1B7-CF1F-4701-F4F2C2CFF60B [name] => hypnotic [importance] => 22 ) [28] => Array ( [uid] => EBD72BDD-08AC-1AF2-B72F-DA30FF41730F [name] => melodramatic [importance] => 100 ) [29] => Array ( [uid] => 68F64A5D-CC1E-8E08-7A53-ADEFCBF94626 [name] => methodical [importance] => 17 ) [30] => Array ( [uid] => D7D91543-9EF2-2965-D4CC-A7A44D86E442 [name] => spirited [importance] => 33 ) [31] => Array ( [uid] => FEFDED43-5D30-3F03-4BB1-B3173C2CFB29 [name] => charming [importance] => 50 ) [32] => Array ( [uid] => 6C998DCC-6FB2-CC67-1848-535B67DE834E [name] => sensual [importance] => 50 ) [33] => Array ( [uid] => 1E66C428-F242-7510-C474-303C768870F4 [name] => dynamism [importance] => 17 ) [34] => Array ( [uid] => 2BE15410-02D8-7604-1972-88C229BE9261 [name] => sexual [importance] => 77 ) [35] => Array ( [uid] => 92E96FA3-74B5-75B2-27C1-96B7D22D4BBB [name] => manliness [importance] => 1 ) [36] => Array ( [uid] => AFA2F319-53CC-EC1A-7F30-BF3B0F951AD8 [name] => driving [importance] => 77 ) [37] => Array ( [uid] => AEC666EF-1869-A54E-18F0-A8F87FB1FEC8 [name] => intellect [importance] => 1 ) [38] => Array ( [uid] => B0740C6D-7607-3999-9F6C-F66D5E268A50 [name] => friendly [importance] => 55 ) [39] => Array ( [uid] => 83E38EEF-C34F-8F75-A789-91BBC6A934E0 [name] => revitalizing [importance] => 66 ) [40] => Array ( [uid] => CE8CFA4A-2FD0-6408-7497-C141256C7489 [name] => warrior [importance] => 12 ) [41] => Array ( [uid] => B4DF9818-FAB2-528F-A427-4B82652C9BBC [name] => resourceful [importance] => 66 ) [42] => Array ( [uid] => 2B1D85F5-311E-C9FB-2595-170408E48556 [name] => nice [importance] => 66 ) [43] => Array ( [uid] => 044BC3C6-9073-B7F4-E171-31F09E59FD73 [name] => deep [importance] => 55 ) [44] => Array ( [uid] => 0F009D11-53FD-52C7-FCF3-B12A853DA171 [name] => determined [importance] => 100 ) [45] => Array ( [uid] => 515746E4-4781-D94D-D962-57924B6438FF [name] => absolute [importance] => 15 ) [46] => Array ( [uid] => 2A67558C-2FF3-2D44-6DFB-523F80176453 [name] => powerful [importance] => 33 ) [47] => Array ( [uid] => 5E579C46-BD0F-D09B-1B52-498CAE52A095 [name] => bravado [importance] => 10 ) [48] => Array ( [uid] => 78AB3FB8-D41B-9369-06A9-2FFC278F9DAB [name] => desirable [importance] => 66 ) [49] => Array ( [uid] => 2294612B-1233-4F34-B5B6-BDCEA772B1CC [name] => roots [importance] => 8 ) [50] => Array ( [uid] => 6DCC7FFC-A6D0-8352-8198-97448BCEDF7D [name] => exaggerated [importance] => 88 ) [51] => Array ( [uid] => 9B58478C-75C0-502B-A8D1-02EB242E8E38 [name] => extroversion [importance] => 40 ) [52] => Array ( [uid] => FD1F84B8-9FBB-428D-6469-0C9FA70E5AA5 [name] => strong [importance] => 25 ) [53] => Array ( [uid] => 40B9437C-5F2F-7FF2-C23D-2D70A9EDEBA3 [name] => lazy [importance] => 22 ) [54] => Array ( [uid] => 9FCC01A9-1AE4-18BD-B5AE-6CD1C7A1D09E [name] => romantic [importance] => 66 ) [55] => Array ( [uid] => 984A4E07-7EBC-717E-BF1E-64E48A5C5960 [name] => letting go [importance] => 55 ) [56] => Array ( [uid] => C5131D74-04FA-F960-16D8-49570FB115E5 [name] => impulsive [importance] => 77 ) [57] => Array ( [uid] => 8E4F875D-7087-64ED-DECA-5295038D9A12 [name] => Above (Fire) [importance] => 1 ) [58] => Array ( [uid] => 146F0CDC-A8BA-328C-D8FA-129456B7CD1B [name] => festive [importance] => 90 ) [59] => Array ( [uid] => F695778E-6475-F312-350C-66114B1BDEC8 [name] => withdrawal [importance] => 4 ) [60] => Array ( [uid] => C616FB42-6F61-630A-E681-D170F84D1742 [name] => Out (Wood) [importance] => 19 ) [61] => Array ( [uid] => A15DDD60-8379-2972-6DFF-610FDC2343E6 [name] => autumnal [importance] => 50 ) [62] => Array ( [uid] => 38161F57-8D19-7675-03A6-51505BC8261A [name] => self control [importance] => 3 ) [63] => Array ( [uid] => C8CE51CC-9806-10C7-C5DB-5F14EA3D69A1 [name] => biting [importance] => 33 ) [64] => Array ( [uid] => 9FFC5764-3EE0-1C96-A840-4EE4FD0F974F [name] => playfulness [importance] => 7 ) [65] => Array ( [uid] => 2A6B8129-F257-FE95-A0CA-9D4F3097E708 [name] => performing [importance] => 12 ) [66] => Array ( [uid] => 0528C3BF-5461-1249-B384-AFC2FE7F35F2 [name] => seductive [importance] => 77 ) [67] => Array ( [uid] => 6CEBAF4C-A524-2EF9-9061-6B5CA6490EA3 [name] => pretty [importance] => 12 ) [68] => Array ( [uid] => 10936331-149D-BFEA-F8EA-70CFE8B2836D [name] => positive [importance] => 10 ) [69] => Array ( [uid] => 412E2463-7085-1C4E-B601-B74286465235 [name] => extravagant [importance] => 100 ) [70] => Array ( [uid] => F05F72AD-E056-CEA2-3BD2-E109EFA0C02B [name] => happiness [importance] => 11 ) [71] => Array ( [uid] => 404BFE84-FF2E-528E-FA9A-47DE57E17BAC [name] => On (Ground) [importance] => 9 ) [72] => Array ( [uid] => 071FA363-D13D-A011-643C-019F3F34A816 [name] => laid-back [importance] => 22 ) [73] => Array ( [uid] => CF7D9EA4-6181-7C04-B025-75A9CFED953A [name] => spontaneous [importance] => 33 ) [74] => Array ( [uid] => E062FF9A-D4EB-AE9D-FDB5-C6B5E562FA36 [name] => incisive [importance] => 50 ) [75] => Array ( [uid] => 61446A69-ECBF-0C45-D544-0B22F1DC65B0 [name] => witty [importance] => 88 ) [76] => Array ( [uid] => 8A74B98A-887C-A9BC-ECDF-A495765820BE [name] => imagination [importance] => 1 ) [77] => Array ( [uid] => 62D58746-0F32-8042-27A8-84F605A48BF9 [name] => pulsating [importance] => 44 ) [78] => Array ( [uid] => 139EE6DA-6198-FB8D-479C-021BFB06A80B [name] => bouncy [importance] => 55 ) [79] => Array ( [uid] => 29DE99C2-54D1-BDB7-90BA-9ACAE094D4F8 [name] => kitsch [importance] => 12 ) [80] => Array ( [uid] => C56B7569-62B0-9BDA-A116-40DC13465D16 [name] => coldness [importance] => 4 ) [81] => Array ( [uid] => C898EEA1-7475-3902-4F1A-942C9B5E1995 [name] => amicable [importance] => 66 ) [82] => Array ( [uid] => B45AD70C-F647-D61D-7542-072AFDE3A526 [name] => flashy [importance] => 55 ) [83] => Array ( [uid] => 59B0964A-D326-E5B8-22FE-659B160B8EFF [name] => In/within (Water) [importance] => 34 ) [84] => Array ( [uid] => FC883530-E528-6A79-B963-B903ADD9FC29 [name] => nostalgic [importance] => 50 ) [85] => Array ( [uid] => 104AC159-974B-14CE-7A73-63D91126F4F9 [name] => sentimental [importance] => 77 ) [86] => Array ( [uid] => EB092E2F-5B20-DBB0-63D8-26A4898DD944 [name] => tacky [importance] => 43 ) ) [score] => 100 ) ) )");
	}
	
	
	public String run() {
		if(printInfo) {
			System.out.println("the string is now " + st);
		}
		alphaAlgo alg = new alphaAlgo();
		String toReturn = alg.getDataFromInput(st);
		System.out.println("the string we we got from method is " + toReturn);
		
		return toReturn;
	}
	
	public String testerTwo() {
		rdr.read(st);
		
		return null;
	}

}
