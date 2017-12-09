
public class Day2 {
	
	public static void main(String[] args){
		
		// The input I was given:
		String s1 = "798	1976	1866	1862	559	1797	1129	747	85	1108	104	2000	248	131	87	95";
		String s2 = "201	419	336	65	208	57	74	433	68	360	390	412	355	209	330	135";
		String s3 = "967	84	492	1425	1502	1324	1268	1113	1259	81	310	1360	773	69	68	290";
		String s4 = "169	264	107	298	38	149	56	126	276	45	305	403	89	179	394	172";
		String s5 = "3069	387	2914	2748	1294	1143	3099	152	2867	3082	113	145	2827	2545	134	469";
		String s6 = "3885	1098	2638	5806	4655	4787	186	4024	2286	5585	5590	215	5336	2738	218	266";
		String s7 = "661	789	393	159	172	355	820	891	196	831	345	784	65	971	396	234";
		String s8 = "4095	191	4333	161	3184	193	4830	4153	2070	3759	1207	3222	185	176	2914	4152";
		String s9 = "131	298	279	304	118	135	300	74	269	96	366	341	139	159	17	149";
		String s10 = "1155	5131	373	136	103	5168	3424	5126	122	5046	4315	126	236	4668	4595	4959";
		String s11 = "664	635	588	673	354	656	70	86	211	139	95	40	84	413	618	31";
		String s12 = "2163	127	957	2500	2370	2344	2224	1432	125	1984	2392	379	2292	98	456	154";
		String s13 = "271	4026	2960	6444	2896	228	819	676	6612	6987	265	2231	2565	6603	207	6236";
		String s14 = "91	683	1736	1998	1960	1727	84	1992	1072	1588	1768	74	58	1956	1627	893";
		String s15 = "3591	1843	3448	1775	3564	2632	1002	3065	77	3579	78	99	1668	98	2963	3553";
		String s16 = "2155	225	2856	3061	105	204	1269	171	2505	2852	977	1377	181	1856	2952	2262";
		
		
		
		// the variables checkSum and checkDiv, and the functions findDiff and findDiv refer to parts 1 and 2 of the question respectively
		String[] arr = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16};
		int checkSum = 0;
		int checkDiv = 0;
		
		for(int i = 0; i < arr.length; i++){
			checkSum += findDiff(arr[i]);
			checkDiv += findDiv(arr[i]);
		}
		
		System.out.println("Checksum = " + checkSum);
		System.out.println("Checkdiv = " + checkDiv);
		
		
		
		
		
	}
	
	public static int min(String[] arr){
		int min = Integer.valueOf(arr[0]);
		
		for(int i = 0; i < arr.length; i++){
			if(Integer.valueOf(arr[i]) < min){
				min = Integer.valueOf(arr[i]);
			}
		}
		return min;
	}
	
	public static int max(String[] arr){
		int max = Integer.valueOf(arr[0]);
				
		for(int i = 0; i < arr.length; i++){
			if(Integer.valueOf(arr[i]) > max){
				max = Integer.valueOf(arr[i]);
			}
		}
		return max;
	}
	
	public static int findDiff(String[] arr){
		int diff = max(arr) - min(arr);
		//System.out.println(diff);
		return diff;
	}
	
	public static int findDiff(String s){
		return findDiff(s.split("	"));
	}

	public static int findDiv(String[] arr){
		int firstVal;
		
		for(int i = 0; i < arr.length; i++){
			
			firstVal = Integer.valueOf(arr[i]);
			
			for(int j = 0; j < arr.length; j++){
				if((firstVal % Integer.valueOf(arr[j]) == 0) && (firstVal > Integer.valueOf(arr[j]))){
					//System.out.println(firstVal/Integer.valueOf(arr[j]));
					return firstVal/Integer.valueOf(arr[j]);
				}
			}
		}
		
		return -1;
		
		
	}

	public static int findDiv(String s){
		return findDiv(s.split("	"));
	}
}
