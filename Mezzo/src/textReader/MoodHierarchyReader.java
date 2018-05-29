package textReader;

import DNA.TagChunk;
import musicData.Mood;
import musicData.MoodHierarchy;

public class MoodHierarchyReader {
	
	String toRead = "{\"results\":[{\"uid\":\"8E4F875D-7087-64ED-DECA-5295038D9A12\",\"name\":\"Above (Fire)\",\"children\":[{\"uid\":\"8A74B98A-887C-A9BC-ECDF-A495765820BE\",\"name\":\"imagination\",\"children\":[{\"uid\":\"294C147F-4015-7350-55C2-F00EB4B0D97F\",\"name\":\"floating\",\"children\":[]},{\"uid\":\"F6BEBC77-7E49-421B-6485-6C27D9EB0E72\",\"name\":\"daydreaming\",\"children\":[]},{\"uid\":\"A6B1D594-D4C4-4279-A59E-73491BBFD67A\",\"name\":\"graceful\",\"children\":[]},{\"uid\":\"9C4B52AC-B826-835A-529C-A120D17115B5\",\"name\":\"imaginary\",\"children\":[]},{\"uid\":\"446DDB2A-513B-0BDB-B2FD-6F25C401428A\",\"name\":\"thoughtful\",\"children\":[]},{\"uid\":\"00FF8A09-FAFF-3A5F-84CF-6021DB8272AC\",\"name\":\"subtle\",\"children\":[]},{\"uid\":\"3950E503-C4C9-5776-816D-EE3959AB6AE4\",\"name\":\"dreaming\",\"children\":[]},{\"uid\":\"754C7C6E-2651-176F-630A-3F32085A7DA5\",\"name\":\"luminous\",\"children\":[]},{\"uid\":\"A629ED96-CCF8-D2A2-7811-4015EF09D0AC\",\"name\":\"androgynous\",\"children\":[]},{\"uid\":\"08CE4943-4F6E-D54C-6A89-EA7B7541AEB2\",\"name\":\"enchanting\",\"children\":[]},{\"uid\":\"058B88F7-2754-B3CA-F95B-F879D8DEA7D8\",\"name\":\"majestic\",\"children\":[]},{\"uid\":\"86712840-0F9C-3AA0-74C5-DFBA82E879D1\",\"name\":\"aesthetic\",\"children\":[]},{\"uid\":\"A424620A-6B62-5AE4-7201-AECD3BDD9BBB\",\"name\":\"odd\",\"children\":[]}]},{\"uid\":\"38161F57-8D19-7675-03A6-51505BC8261A\",\"name\":\"self control\",\"children\":[{\"uid\":\"515746E4-4781-D94D-D962-57924B6438FF\",\"name\":\"absolute\",\"children\":[]},{\"uid\":\"10566D87-115D-CC00-3239-488AED4C2613\",\"name\":\"vertical\",\"children\":[]},{\"uid\":\"216A6949-6569-7369-7ECC-55523A3FF749\",\"name\":\"flawless\",\"children\":[]},{\"uid\":\"8CE7BC69-1374-D131-3284-B50986ED8462\",\"name\":\"seeking\",\"children\":[]},{\"uid\":\"57EDB459-31A5-727C-3702-369473AB1521\",\"name\":\"inspired\",\"children\":[]}]},{\"uid\":\"633210E7-D8C2-9E3C-07A6-03968D0298AC\",\"name\":\"spirituality\",\"children\":[{\"uid\":\"3419CB61-7C05-DD3B-432E-98F2C463B403\",\"name\":\"intuitive\",\"children\":[]},{\"uid\":\"7AD88EA9-8191-E4C1-86AD-9AD66035AAE8\",\"name\":\"sublime\",\"children\":[]},{\"uid\":\"9E77C2E6-1EB2-15B1-FB71-0AA7B9BF7E37\",\"name\":\"divine\",\"children\":[]},{\"uid\":\"722FB97F-797A-F29E-99C6-4A7E8CFDE9F9\",\"name\":\"intangible\",\"children\":[]},{\"uid\":\"A71A5E02-A4B7-BD50-0DC6-824BFADB2666\",\"name\":\"contemplative\",\"children\":[]},{\"uid\":\"918D8945-7DE0-2D8E-6190-5171A28719DA\",\"name\":\"meditative\",\"children\":[]},{\"uid\":\"3212CFA7-0B20-4EC4-CD3D-08E291F6620A\",\"name\":\"serene\",\"children\":[]},{\"uid\":\"24E39BD5-83BB-7663-ECAD-0AE8BA506987\",\"name\":\"calm\",\"children\":[]},{\"uid\":\"1F650C5F-3B9F-DA31-649E-C7CF36EAD35B\",\"name\":\"unique\",\"children\":[]}]}]},{\"uid\":\"962C3966-5E12-696F-EF7E-68ABF6A2AFA7\",\"name\":\"Down (Metal)\",\"children\":[{\"uid\":\"C56B7569-62B0-9BDA-A116-40DC13465D16\",\"name\":\"coldness\",\"children\":[{\"uid\":\"A2C40F67-10C1-55A0-9350-0FCBAF68A070\",\"name\":\"ironic\",\"children\":[]},{\"uid\":\"9B574DAE-6872-1F28-48B3-2C4FDC33AEA7\",\"name\":\"metallic\",\"children\":[]},{\"uid\":\"541463D8-F4EB-E9F4-36EA-482B96DB6807\",\"name\":\"dull\",\"children\":[]},{\"uid\":\"21910E30-8989-346F-0280-9D3D45E5D2D2\",\"name\":\"distant\",\"children\":[]},{\"uid\":\"920A2CCD-7C51-B3FF-56A8-B056208C4498\",\"name\":\"bitter\",\"children\":[]},{\"uid\":\"C2FAA0CF-DC3C-2F74-2EA4-C87A4317E7E1\",\"name\":\"clinical\",\"children\":[]},{\"uid\":\"BAFE4EDF-9FDD-0362-66B3-9AA6C6632BBB\",\"name\":\"sanitized\",\"children\":[]},{\"uid\":\"6B3663FC-BCD7-34A2-1598-2F4BA82EA6F5\",\"name\":\"manic\",\"children\":[]},{\"uid\":\"EBD9117A-0D69-66FF-EADB-FDDDE57F158D\",\"name\":\"sharp\",\"children\":[]},{\"uid\":\"E062FF9A-D4EB-AE9D-FDB5-C6B5E562FA36\",\"name\":\"incisive\",\"children\":[]},{\"uid\":\"2E135095-8C4D-34C5-4344-FD60E20718C6\",\"name\":\"cynical\",\"children\":[]},{\"uid\":\"C8CE51CC-9806-10C7-C5DB-5F14EA3D69A1\",\"name\":\"biting\",\"children\":[]},{\"uid\":\"E23CDC4A-1991-F807-027E-2EFCAF617B94\",\"name\":\"nasty\",\"children\":[]}]},{\"uid\":\"6D5AE713-FA4A-2067-6CC8-B296D29EF57B\",\"name\":\"sensibility\",\"children\":[{\"uid\":\"C1DA3F70-3D54-D0B4-102E-C99F21781EE2\",\"name\":\"disconsolate\",\"children\":[]},{\"uid\":\"056281D8-8CE9-955C-3B57-75ECF50071B8\",\"name\":\"enigmatic\",\"children\":[]},{\"uid\":\"80B02A5D-3853-D70D-7336-8E3CC5CB5457\",\"name\":\"refined\",\"children\":[]},{\"uid\":\"104AC159-974B-14CE-7A73-63D91126F4F9\",\"name\":\"sentimental\",\"children\":[]},{\"uid\":\"6CEBAF4C-A524-2EF9-9061-6B5CA6490EA3\",\"name\":\"pretty\",\"children\":[]},{\"uid\":\"A4592BA4-C56E-F654-8939-0772675E3919\",\"name\":\"intimate\",\"children\":[]},{\"uid\":\"78AB3FB8-D41B-9369-06A9-2FFC278F9DAB\",\"name\":\"desirable\",\"children\":[]},{\"uid\":\"993E5DF5-6A3E-EF42-D236-91F34FB8D1CA\",\"name\":\"delicate\",\"children\":[]},{\"uid\":\"DD640E4F-94C6-57B3-E373-2D68E5F90CFC\",\"name\":\"melancholic\",\"children\":[]},{\"uid\":\"255CD3EC-C275-09A3-2682-9C8CB4BA375E\",\"name\":\"sad\",\"children\":[]},{\"uid\":\"27FD4EE3-26D4-FB05-83F2-790E0F91D3F9\",\"name\":\"anxious\",\"children\":[]},{\"uid\":\"044BC3C6-9073-B7F4-E171-31F09E59FD73\",\"name\":\"deep\",\"children\":[]},{\"uid\":\"7D5104F0-F92B-162F-544F-D6578F14E850\",\"name\":\"obscure\",\"children\":[]},{\"uid\":\"F89DEB79-525C-7DBF-A04C-44FC4833743B\",\"name\":\"lightless\",\"children\":[]},{\"uid\":\"213BBCF2-F9B1-5AE8-1440-3C8EFAEE7EAF\",\"name\":\"anxiety\",\"children\":[]},{\"uid\":\"A15DDD60-8379-2972-6DFF-610FDC2343E6\",\"name\":\"autumnal\",\"children\":[]},{\"uid\":\"738D9847-E8D3-1103-62F3-544560487171\",\"name\":\"monotonous\",\"children\":[]},{\"uid\":\"30DF5DDC-46B1-3BD8-0D2D-DC0CC813624B\",\"name\":\"fragile\",\"children\":[]},{\"uid\":\"90E92479-7B16-3224-3D57-3074064EFC7A\",\"name\":\"mysterious\",\"children\":[]},{\"uid\":\"FC883530-E528-6A79-B963-B903ADD9FC29\",\"name\":\"nostalgic\",\"children\":[]},{\"uid\":\"0599F73B-6A25-E9DA-4668-589A71739A73\",\"name\":\"pretentious\",\"children\":[]},{\"uid\":\"9FCC01A9-1AE4-18BD-B5AE-6CD1C7A1D09E\",\"name\":\"romantic\",\"children\":[]}]},{\"uid\":\"F695778E-6475-F312-350C-66114B1BDEC8\",\"name\":\"withdrawal\",\"children\":[{\"uid\":\"EBAB39A2-D671-7DDC-D6B6-10189BE56A92\",\"name\":\"punch-drunk\",\"children\":[]},{\"uid\":\"6224027F-950C-0C12-BD5B-8541C8F2FDB1\",\"name\":\"introvert\",\"children\":[]},{\"uid\":\"308A7A63-573F-3643-1B65-596B18F8A1B9\",\"name\":\"self-destructive\",\"children\":[]},{\"uid\":\"BBC15824-B336-06D6-77D0-8D8A5F0378DD\",\"name\":\"organised\",\"children\":[]},{\"uid\":\"BBBEB03B-DE97-EC0E-D6EC-94EF10DED278\",\"name\":\"inhibited\",\"children\":[]},{\"uid\":\"6BE29A1A-B01F-AD6A-7CA5-AF3AE60A1419\",\"name\":\"discreet\",\"children\":[]},{\"uid\":\"7D74E2A1-DDA2-E4F8-D396-71508B8A5053\",\"name\":\"reserved\",\"children\":[]},{\"uid\":\"68F64A5D-CC1E-8E08-7A53-ADEFCBF94626\",\"name\":\"methodical\",\"children\":[]},{\"uid\":\"AEEC9A7C-02BD-46AB-ABF5-91817B003BB6\",\"name\":\"precise\",\"children\":[]},{\"uid\":\"8DB328A2-4E1D-BDF3-B889-86184C58535C\",\"name\":\"civilized\",\"children\":[]},{\"uid\":\"6EA33110-3D34-D405-417A-C16AC9A7CE69\",\"name\":\"hesitant\",\"children\":[]},{\"uid\":\"F296867D-35E5-E26F-87BA-EFB02D6C9871\",\"name\":\"doubtful\",\"children\":[]},{\"uid\":\"D94BBF20-AD9E-BC99-5C79-7DD81A21B9C9\",\"name\":\"shy\",\"children\":[]},{\"uid\":\"9F23A24B-47A8-0A5D-6F30-EA5A613F0650\",\"name\":\"off-putting\",\"children\":[]},{\"uid\":\"327BE7E4-B1F0-D3EE-016C-08C7D85F4F0F\",\"name\":\"austere\",\"children\":[]},{\"uid\":\"F7948819-E666-5D98-EB31-AACB6ABEEA9D\",\"name\":\"isolated\",\"children\":[]},{\"uid\":\"4456A94C-9709-0939-C5F5-1575F60C4CF8\",\"name\":\"crushed\",\"children\":[]},{\"uid\":\"03913886-FE4A-5982-68E1-E14E91ADBAAF\",\"name\":\"maniac\",\"children\":[]},{\"uid\":\"4EC1DBCB-A22D-D414-9B2B-7F7279BA0470\",\"name\":\"paranoid\",\"children\":[]}]}]},{\"uid\":\"59B0964A-D326-E5B8-22FE-659B160B8EFF\",\"name\":\"In\\/within (Water)\",\"children\":[{\"uid\":\"6755A82E-689A-E825-EE02-5551736CDB4D\",\"name\":\"love\",\"children\":[{\"uid\":\"4A834601-9E64-3B0C-5B99-2E533B4746C9\",\"name\":\"gentle\",\"children\":[]},{\"uid\":\"88E4D296-5FD6-4A9E-C4E4-5E1DD302CB8B\",\"name\":\"intense\",\"children\":[]},{\"uid\":\"A10C9421-7F41-1C06-268E-2E921D877595\",\"name\":\"soft\",\"children\":[]},{\"uid\":\"EB24ACA7-651C-9BFB-E187-67A8155CA646\",\"name\":\"tolerant\",\"children\":[]},{\"uid\":\"5BC6DCE0-5979-2889-25B7-52C05CE2D721\",\"name\":\"emotional\",\"children\":[]},{\"uid\":\"6C998DCC-6FB2-CC67-1848-535B67DE834E\",\"name\":\"sensual\",\"children\":[]},{\"uid\":\"E7C1011A-063E-927F-2203-4CB236BEA20D\",\"name\":\"caring\",\"children\":[]},{\"uid\":\"0528C3BF-5461-1249-B384-AFC2FE7F35F2\",\"name\":\"seductive\",\"children\":[]},{\"uid\":\"2BE15410-02D8-7604-1972-88C229BE9261\",\"name\":\"sexual\",\"children\":[]},{\"uid\":\"62482C44-67CE-6A87-BC39-B6D15D6CF153\",\"name\":\"bittersweet\",\"children\":[]},{\"uid\":\"B371AD0E-0532-CBAD-105E-A00B0314E1ED\",\"name\":\"glamourous\",\"children\":[]}]},{\"uid\":\"1BEECA8A-0184-F79B-6924-5188DAF241BD\",\"name\":\"nourishment\",\"children\":[{\"uid\":\"F99048F4-BCB1-5C66-C27A-2B853BC76112\",\"name\":\"round\",\"children\":[]},{\"uid\":\"83E38EEF-C34F-8F75-A789-91BBC6A934E0\",\"name\":\"revitalizing\",\"children\":[]},{\"uid\":\"62D58746-0F32-8042-27A8-84F605A48BF9\",\"name\":\"pulsating\",\"children\":[]},{\"uid\":\"5B2C527B-3B75-3F83-9636-5107B3AD96D9\",\"name\":\"peaceful\",\"children\":[]},{\"uid\":\"DC8328DD-5BC7-677B-F6B0-CFCAFFD4D69E\",\"name\":\"wavering\",\"children\":[]},{\"uid\":\"ED52197F-AF23-4B72-B63E-EECD0B60FD47\",\"name\":\"healthy\",\"children\":[]},{\"uid\":\"4975732F-3C0C-2F7B-F7A9-7C31398B1569\",\"name\":\"soothing\",\"children\":[]},{\"uid\":\"EDFDE5F5-1B7B-5B3E-3C0C-DB3A7996C7C3\",\"name\":\"confident\",\"children\":[]},{\"uid\":\"11FAD47C-FC9E-7C82-6EA8-14F6F4EE15FA\",\"name\":\"inviting\",\"children\":[]},{\"uid\":\"B0740C6D-7607-3999-9F6C-F66D5E268A50\",\"name\":\"friendly\",\"children\":[]},{\"uid\":\"D96D8067-DADB-A63B-172F-1F055493EC24\",\"name\":\"hedonist\",\"children\":[]},{\"uid\":\"083AE5B4-A1B7-CF1F-4701-F4F2C2CFF60B\",\"name\":\"hypnotic\",\"children\":[]},{\"uid\":\"071FA363-D13D-A011-643C-019F3F34A816\",\"name\":\"laid-back\",\"children\":[]},{\"uid\":\"FAB610E7-2224-1ADA-F35C-181D09A46E90\",\"name\":\"cool\",\"children\":[]},{\"uid\":\"EB81AEF8-DF23-8F56-A5A9-33DE89C845CB\",\"name\":\"relaxed\",\"children\":[]}]},{\"uid\":\"AEC666EF-1869-A54E-18F0-A8F87FB1FEC8\",\"name\":\"intellect\",\"children\":[{\"uid\":\"A58FF1BE-221B-FB43-B65F-F952EE168128\",\"name\":\"intricate\",\"children\":[]},{\"uid\":\"7488B6B9-5EB0-09B7-02C4-21FBC68090FB\",\"name\":\"sophisticated\",\"children\":[]},{\"uid\":\"859A9B2A-B8C8-82AC-05DD-1A6FDB881295\",\"name\":\"technical\",\"children\":[]},{\"uid\":\"CB33F8DA-CE51-5869-89B0-80FD78F3176B\",\"name\":\"exploratory\",\"children\":[]},{\"uid\":\"6338D4BD-8531-AEF0-50D7-B7CF0286C845\",\"name\":\"evolving\",\"children\":[]},{\"uid\":\"63093204-017F-A80B-359E-9B5CC8908878\",\"name\":\"analytical\",\"children\":[]},{\"uid\":\"06CB5405-5031-9D8B-B099-9B6966AFDB6A\",\"name\":\"cerebral\",\"children\":[]},{\"uid\":\"596EC170-93CD-EBA6-8ACC-A3B51ABB3F18\",\"name\":\"intellectual\",\"children\":[]},{\"uid\":\"79859BD2-3DCC-3F81-2048-0F0897C04104\",\"name\":\"experimental\",\"children\":[]},{\"uid\":\"C605F3A0-4A1A-554A-DED0-884C7883CE60\",\"name\":\"meticulous\",\"children\":[]},{\"uid\":\"6933A010-6D30-A84F-BD02-0B5F385C2B26\",\"name\":\"ambitious\",\"children\":[]},{\"uid\":\"6F1D3063-E8E1-C3FF-48C4-FD8C81913DCA\",\"name\":\"complex\",\"children\":[]},{\"uid\":\"BD7BA5CE-1C02-ABE0-F767-58EA2B13E98B\",\"name\":\"difficult\",\"children\":[]},{\"uid\":\"55411BD6-A3B1-0A19-1F69-A5236DF4D240\",\"name\":\"epic\",\"children\":[]},{\"uid\":\"39ACA5F9-01D8-57AA-1E6F-CE6ACF27B6DA\",\"name\":\"mannered\",\"children\":[]}]}]},{\"uid\":\"404BFE84-FF2E-528E-FA9A-47DE57E17BAC\",\"name\":\"On (Ground)\",\"children\":[{\"uid\":\"9FFC5764-3EE0-1C96-A840-4EE4FD0F974F\",\"name\":\"playfulness\",\"children\":[{\"uid\":\"C9A7795C-6088-AD6D-EF05-050B5CE013E3\",\"name\":\"duelling\",\"children\":[]},{\"uid\":\"B3774AF3-B6B4-FB42-30C7-4E2BFE0C9306\",\"name\":\"competing\",\"children\":[]},{\"uid\":\"2A6B8129-F257-FE95-A0CA-9D4F3097E708\",\"name\":\"performing\",\"children\":[]},{\"uid\":\"B4C4223B-69C9-6556-BDD5-3EDBF6041C38\",\"name\":\"challenging\",\"children\":[]},{\"uid\":\"5E579C46-BD0F-D09B-1B52-498CAE52A095\",\"name\":\"bravado\",\"children\":[]}]},{\"uid\":\"CE8CFA4A-2FD0-6408-7497-C141256C7489\",\"name\":\"warrior\",\"children\":[{\"uid\":\"04EAD4A4-2A90-BC36-579D-408F47E4F0AC\",\"name\":\"bright\",\"children\":[]},{\"uid\":\"FB7512D3-477D-362B-CAA6-66F5278E40FD\",\"name\":\"conquering\",\"children\":[]},{\"uid\":\"0F009D11-53FD-52C7-FCF3-B12A853DA171\",\"name\":\"determined\",\"children\":[]},{\"uid\":\"8A6740FA-59F2-5D2C-F5E6-C3FCE7ECA68F\",\"name\":\"vigorous\",\"children\":[]},{\"uid\":\"6601B9A2-5928-401D-52D3-3BE0A3A04450\",\"name\":\"tuned\",\"children\":[]},{\"uid\":\"9A617502-7C7B-2478-F110-CFE191A1BDD2\",\"name\":\"brave\",\"children\":[]},{\"uid\":\"2A67558C-2FF3-2D44-6DFB-523F80176453\",\"name\":\"powerful\",\"children\":[]},{\"uid\":\"6305D635-B152-77EA-BD91-6B8336331BA4\",\"name\":\"active\",\"children\":[]},{\"uid\":\"FD1F84B8-9FBB-428D-6469-0C9FA70E5AA5\",\"name\":\"strong\",\"children\":[]},{\"uid\":\"458E616F-1B47-310F-755B-CA07EA19E8B6\",\"name\":\"proud\",\"children\":[]},{\"uid\":\"C86494B7-B7E3-1492-419C-9A761C3F03C8\",\"name\":\"serious\",\"children\":[]},{\"uid\":\"07CDD1CC-6525-41FC-AC33-8D6324609A18\",\"name\":\"solid\",\"children\":[]},{\"uid\":\"EFE2C415-2781-B731-1AD1-FEEDD20B370A\",\"name\":\"heroic\",\"children\":[]}]},{\"uid\":\"2294612B-1233-4F34-B5B6-BDCEA772B1CC\",\"name\":\"roots\",\"children\":[{\"uid\":\"C5AFA786-A7F8-0AC3-1469-05800BA2537A\",\"name\":\" circular\",\"children\":[]},{\"uid\":\"8B3FF0C8-C5D1-56ED-CA65-49909BCA2D81\",\"name\":\"essential\",\"children\":[]},{\"uid\":\"B4DF9818-FAB2-528F-A427-4B82652C9BBC\",\"name\":\" resourceful\",\"children\":[]},{\"uid\":\"14A46D5F-43C3-81F5-EB1C-5417BC4B468F\",\"name\":\"static\",\"children\":[]},{\"uid\":\"B634F842-B62B-345A-F644-47B9BEE6D6A9\",\"name\":\"weighty\",\"children\":[]},{\"uid\":\"423CF317-3707-3AAB-AADC-F97B40C26A46\",\"name\":\"trance-like\",\"children\":[]},{\"uid\":\"AD0FF4C6-8830-95F7-E7DA-F13DA98BA966\",\"name\":\"repetitive\",\"children\":[]},{\"uid\":\"55BEDE8D-6CC4-0C4A-F362-15A8560151C8\",\"name\":\"organic\",\"children\":[]}]}]},{\"uid\":\"C616FB42-6F61-630A-E681-D170F84D1742\",\"name\":\"Out (Wood)\",\"children\":[{\"uid\":\"A03A702B-0EC4-300A-D18C-1542C9023315\",\"name\":\"good vibrations\",\"children\":[{\"uid\":\"FEFDED43-5D30-3F03-4BB1-B3173C2CFB29\",\"name\":\"charming\",\"children\":[]},{\"uid\":\"6CB564CA-20C6-2F4F-338F-BB987726FF30\",\"name\":\"solar\",\"children\":[]},{\"uid\":\"C898EEA1-7475-3902-4F1A-942C9B5E1995\",\"name\":\"amicable\",\"children\":[]},{\"uid\":\"0453B572-1071-6CE7-7994-F626E4CA8A95\",\"name\":\"generous\",\"children\":[]},{\"uid\":\"2B1D85F5-311E-C9FB-2595-170408E48556\",\"name\":\"nice\",\"children\":[]},{\"uid\":\"E50384B0-7F88-3104-39A2-184147A58DE2\",\"name\":\"communicative\",\"children\":[]},{\"uid\":\"5DAB7738-1405-04D9-27ED-338BB51280BF\",\"name\":\"open-minded\",\"children\":[]},{\"uid\":\"F14B73B9-C320-B6E1-0911-CC6D7837D8F5\",\"name\":\"loud\",\"children\":[]},{\"uid\":\"72B27930-5336-000C-470B-59A6786F254D\",\"name\":\"ample\",\"children\":[]},{\"uid\":\"13F575EB-9BD7-BC37-61A8-4E80DED7F1AD\",\"name\":\"warm-hearted\",\"children\":[]},{\"uid\":\"10B25425-2F30-F0C5-BFFA-EC729F7C9BD6\",\"name\":\"summery\",\"children\":[]}]},{\"uid\":\"92E96FA3-74B5-75B2-27C1-96B7D22D4BBB\",\"name\":\"manliness\",\"children\":[{\"uid\":\"B7004C0A-AB8F-E12B-F1F5-1A8B65867C55\",\"name\":\"rude\",\"children\":[]},{\"uid\":\"A8DE1C29-7A49-4CCA-F84A-DF76EE19A6BD\",\"name\":\"shameless\",\"children\":[]},{\"uid\":\"0E5D5934-00DE-EFEA-82BA-5BCED3998EE0\",\"name\":\"fierce\",\"children\":[]},{\"uid\":\"7FF53DF0-40DC-2E0D-7B6E-3D13A1A4314C\",\"name\":\"nihilist\",\"children\":[]},{\"uid\":\"25ECF7DC-8DF6-C4B2-DB84-5D1E28CAE5DD\",\"name\":\"vicious\",\"children\":[]},{\"uid\":\"C88C7AFC-FC19-0AF3-D982-546E6864EB1E\",\"name\":\"wild\",\"children\":[]},{\"uid\":\"679B00B2-1FE1-44AF-50B9-10C8961F3048\",\"name\":\"virile\",\"children\":[]},{\"uid\":\"5A452A1D-1AF5-9E1A-B83D-5D77A64CE5A0\",\"name\":\"raucous\",\"children\":[]},{\"uid\":\"A5EC5598-85AC-830B-B96F-7B6C8B43FDCF\",\"name\":\"offensive\",\"children\":[]},{\"uid\":\"1C7508D1-F8C1-45DE-B1C1-842978F73B26\",\"name\":\"angry\",\"children\":[]},{\"uid\":\"58C520F0-3293-66D9-8608-2516EDBAD6EF\",\"name\":\"vengeful\",\"children\":[]},{\"uid\":\"1239178A-A38F-AD13-0A21-689206A78F1E\",\"name\":\"provocative\",\"children\":[]},{\"uid\":\"28616911-1D92-1E6F-87F6-471C3D6A35B9\",\"name\":\"burdensome\",\"children\":[]},{\"uid\":\"3CD8FE90-F6BC-B74E-6770-460A4C8DC5F4\",\"name\":\"rebellious\",\"children\":[]},{\"uid\":\"9F0A9F9C-501D-F853-4376-AD2F9A856D1C\",\"name\":\"aggressive\",\"children\":[]},{\"uid\":\"78BCC1B7-FD5E-0031-3703-372B5E3482B0\",\"name\":\"upset\",\"children\":[]},{\"uid\":\"87BA8902-D4FB-BB32-4CA6-BD5AD90A8625\",\"name\":\"violent\",\"children\":[]},{\"uid\":\"B37C6A6B-5485-DD02-D472-7E1F2EC55E5C\",\"name\":\"hostile\",\"children\":[]},{\"uid\":\"49336459-DB72-CBF7-ED17-AE9CBFADC7E4\",\"name\":\"tough\",\"children\":[]},{\"uid\":\"F6C5910A-03A8-EF23-F5B6-1AA0258C419D\",\"name\":\"threatening\",\"children\":[]},{\"uid\":\"5E3783EF-4AB7-5B09-1666-DFBD953EA068\",\"name\":\"sinister\",\"children\":[]}]},{\"uid\":\"9B58478C-75C0-502B-A8D1-02EB242E8E38\",\"name\":\"extroversion\",\"children\":[{\"uid\":\"63BBD315-A0CF-3DEC-1192-03FA23766CED\",\"name\":\"reckless\",\"children\":[]},{\"uid\":\"6DCC7FFC-A6D0-8352-8198-97448BCEDF7D\",\"name\":\"exaggerated\",\"children\":[]},{\"uid\":\"F87F7D70-70F1-D5A1-865C-AEC83B0E6BE7\",\"name\":\"vulgar\",\"children\":[]},{\"uid\":\"B45AD70C-F647-D61D-7542-072AFDE3A526\",\"name\":\"flashy\",\"children\":[]},{\"uid\":\"412E2463-7085-1C4E-B601-B74286465235\",\"name\":\"extravagant\",\"children\":[]},{\"uid\":\"FDB39FC5-786B-412D-9C0E-0BA799B375A4\",\"name\":\"unconventional\",\"children\":[]},{\"uid\":\"C5131D74-04FA-F960-16D8-49570FB115E5\",\"name\":\"impulsive\",\"children\":[]},{\"uid\":\"EB092E2F-5B20-DBB0-63D8-26A4898DD944\",\"name\":\"tacky\",\"children\":[]},{\"uid\":\"7D4A6714-A918-43F7-D1F5-96A1963DFC00\",\"name\":\"in your face\",\"children\":[]}]}]},{\"uid\":\"C5EF7029-5E84-7F61-B2D1-97D8030F514C\",\"name\":\"Up (Air)\",\"children\":[{\"uid\":\"F05F72AD-E056-CEA2-3BD2-E109EFA0C02B\",\"name\":\"happiness\",\"children\":[{\"uid\":\"45906DA4-ECAD-A561-F90C-7A0362F27064\",\"name\":\"aerial\",\"children\":[]},{\"uid\":\"DEDFE024-87DC-6B08-E403-2245982D5899\",\"name\":\"amusing\",\"children\":[]},{\"uid\":\"19F1971C-46D1-80DB-659D-7ECA064B86B5\",\"name\":\"innocent\",\"children\":[]},{\"uid\":\"2BC4856C-BB03-00E7-9A56-C9231437AE2D\",\"name\":\"dizzy\",\"children\":[]},{\"uid\":\"1E089F14-4FA3-839E-C702-1A371051F7E6\",\"name\":\"light\",\"children\":[]},{\"uid\":\"10936331-149D-BFEA-F8EA-70CFE8B2836D\",\"name\":\"positive\",\"children\":[]},{\"uid\":\"CEA1F49D-EB15-1EF2-99E8-560ECE45E13B\",\"name\":\"lively\",\"children\":[]},{\"uid\":\"B8AAF601-F425-F663-327C-442BB68D995E\",\"name\":\"ethereal\",\"children\":[]},{\"uid\":\"146F0CDC-A8BA-328C-D8FA-129456B7CD1B\",\"name\":\"festive\",\"children\":[]},{\"uid\":\"B96012D1-87BB-3B0A-62D5-DD749C5F0A25\",\"name\":\"wakeful\",\"children\":[]},{\"uid\":\"B6DF5F89-E389-EFD3-2175-7EF6BE38FF43\",\"name\":\"atmospheric\",\"children\":[]},{\"uid\":\"5FCD7DCD-9C2C-F96D-1EE8-D9A3EF5886AB\",\"name\":\"sensitive\",\"children\":[]},{\"uid\":\"6EDA4243-4259-6949-D95E-31F430B9E50F\",\"name\":\"free\",\"children\":[]},{\"uid\":\"81AE192F-C3B4-2677-7E35-EB342BD95DBF\",\"name\":\"careless\",\"children\":[]},{\"uid\":\"D0F2CB86-0D10-9F76-CF84-750E9CCA6FDA\",\"name\":\"fun\",\"children\":[]},{\"uid\":\"5B7FD160-AB1A-5916-A939-0FE1411B3B87\",\"name\":\"naive\",\"children\":[]},{\"uid\":\"3A9A56D6-5138-0E95-3B40-4C1C795D1680\",\"name\":\"happy\",\"children\":[]}]},{\"uid\":\"1E66C428-F242-7510-C474-303C768870F4\",\"name\":\"dynamism\",\"children\":[{\"uid\":\"B88EE51E-B7EE-B1C1-6989-C1CC81ED2F08\",\"name\":\"purifying\",\"children\":[]},{\"uid\":\"6B2F1E41-F8A9-DBAE-1910-19E99A0A1B55\",\"name\":\"liberating\",\"children\":[]},{\"uid\":\"984A4E07-7EBC-717E-BF1E-64E48A5C5960\",\"name\":\"letting go\",\"children\":[]},{\"uid\":\"3FF28522-10B9-0E07-484D-0E17D75DBB34\",\"name\":\"spring\",\"children\":[]},{\"uid\":\"139EE6DA-6198-FB8D-479C-021BFB06A80B\",\"name\":\"bouncy\",\"children\":[]},{\"uid\":\"E0B561D5-83DF-F347-D5B6-213CA348745A\",\"name\":\"sparkling\",\"children\":[]},{\"uid\":\"6ECFA963-98FE-C166-CD1D-EF38E9D5C543\",\"name\":\"exultant\",\"children\":[]},{\"uid\":\"D70B66E1-B04C-EBA9-578C-0C1B986CC26F\",\"name\":\"rhythmic\",\"children\":[]},{\"uid\":\"1C1BC590-FD60-DDBA-D89E-558BE4CB6C68\",\"name\":\"loose\",\"children\":[]},{\"uid\":\"F56B6D0A-C6D6-50A1-4150-389E59F67972\",\"name\":\"changing\",\"children\":[]},{\"uid\":\"2AD989FA-7E04-54B0-5ED8-924EE47604C0\",\"name\":\"energetic\",\"children\":[]},{\"uid\":\"AFA2F319-53CC-EC1A-7F30-BF3B0F951AD8\",\"name\":\"driving\",\"children\":[]},{\"uid\":\"C482D5A7-ED0E-D1BA-34C4-A52B20798975\",\"name\":\"romping\",\"children\":[]},{\"uid\":\"B38CF6B8-2C47-96B1-E568-7A7CA3C88A6F\",\"name\":\"cathartic\",\"children\":[]},{\"uid\":\"871BFE45-D885-93BF-9D08-669B102FA0F9\",\"name\":\"vivacious\",\"children\":[]},{\"uid\":\"15417A9D-9D27-B98A-863A-E7498421B08E\",\"name\":\"fresh\",\"children\":[]},{\"uid\":\"40B9437C-5F2F-7FF2-C23D-2D70A9EDEBA3\",\"name\":\"lazy\",\"children\":[]}]},{\"uid\":\"C63CE1D1-6178-7984-8629-6C70B180270A\",\"name\":\"temperament\",\"children\":[{\"uid\":\"C3A6C907-6F5E-CDF9-120E-61EDA96F7B19\",\"name\":\"funny\",\"children\":[]},{\"uid\":\"EBD72BDD-08AC-1AF2-B72F-DA30FF41730F\",\"name\":\"melodramatic\",\"children\":[]},{\"uid\":\"D7D91543-9EF2-2965-D4CC-A7A44D86E442\",\"name\":\"spirited\",\"children\":[]},{\"uid\":\"478D1E46-362A-308F-F876-6B6998FA04F2\",\"name\":\"crazy\",\"children\":[]},{\"uid\":\"CF7D9EA4-6181-7C04-B025-75A9CFED953A\",\"name\":\"spontaneous\",\"children\":[]},{\"uid\":\"E0546129-DB97-6517-05E7-63C9720E2AE5\",\"name\":\"vulnerable\",\"children\":[]},{\"uid\":\"29DE99C2-54D1-BDB7-90BA-9ACAE094D4F8\",\"name\":\"kitsch\",\"children\":[]},{\"uid\":\"61446A69-ECBF-0C45-D544-0B22F1DC65B0\",\"name\":\"witty\",\"children\":[]},{\"uid\":\"5C6AF01E-4C5E-7F5C-4BCF-A70530EBC7AD\",\"name\":\"humorous\",\"children\":[]}]}]}]}\r\n";

	public MoodHierarchy readMoodHierarchy(String strToRead) {
		MoodHierarchy toReturn = new MoodHierarchy();
		Mood currentParent = toReturn.getRoot();
		String curpar = currentParent.getName();
		String mood;
		mood = toRead.substring(toRead.indexOf("\"results") + 10);
		for(int i = 0; i < 256 ; i++) {
			//getting UID
			mood = mood.substring(mood.indexOf("uid\":\"") + "uid\":\"".length());
			String moodUID = mood.substring(0, mood.indexOf("\""));
			//System.out.println(moodUID);
			mood = mood.substring(mood.indexOf("\"name\":\"") + "\"name\":\"".length());
			String moodName = mood.substring(0, mood.indexOf("\""));
			//removing the mood we used
			mood = mood.substring(mood.indexOf("\",\"") + 3);
			System.out.println("adding mood " + moodName + " with UID " + moodUID + " with parent " + curpar);
			toReturn.addMood(moodName,moodUID, curpar);
			mood = mood.substring(mood.indexOf("children\":[") + "children\":[".length());
			if(mood.startsWith("{")) {
				curpar = moodName;
			}//removing the first one
			else if(mood.startsWith("]}")) {
				mood = mood.substring(mood.indexOf("]}") + "]}".length());
			}
			while(mood.startsWith("]}")) {
				mood = mood.substring(mood.indexOf("]}") + "]}".length());
				System.out.println("current parent is now " + curpar);
				if(!curpar.equals("nullParent")) {
					curpar = toReturn.getParentName(curpar);
				}
				else {
					break;
				}
				
			}
			
			
			
			/**
			else if(mood.startsWith("\"children\":[]},{")) {
				System.out.println("adding mood " + moodName + " with parent " + curpar);
				toReturn.addMood(moodName,curpar);
			}else if(mood.startsWith("\"children\":[]}]},")) {
				if(moodName.equals("intellect")) {
					System.out.println("we re here!");
				}
				curpar = toReturn.getParentName(curpar);
			}
			
			//toReturn[i] = new TagChunk(tagName, "100");
			**/
		}
		return toReturn;
	}
}