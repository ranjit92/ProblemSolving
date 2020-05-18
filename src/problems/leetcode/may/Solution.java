package problems.leetcode.may;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Solution {

	static Map<Integer, Boolean> memoization = new HashMap<>();
	public static void main(String[] args) {
//		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
//		System.out.println(majorityElement(nums));

//		String str = "lletcod";
//		System.out.println(firstUniqChar(str));

//		decimalToBinary(7);
//		System.out.println(binaryToDecimal("111"));
//		System.out.println(decimalToBinaryWithoutRecursion(13393220));

//		System.out.println(canConstruct("aac","aba"));
		
//		int[][] array = {{-175,50},{647,21},{-600,301},{-731,300},{-998,-704},{194,683},{-773,294},{-617,629},{897,329},{-15,-564},{-800,223},{-655,-455},{857,917},{112,-13},{238,-573},{-61,846},{640,-645},{44,-979},{704,-7},{-564,81},{461,-375},{-247,-301},{-851,-288},{-991,-929},{-875,853},{403,61},{770,-203},{689,990},{58,-580},{6,597},{404,778},{-656,726},{-703,956},{225,7},{786,895},{-483,430},{321,-832},{171,821},{-161,641},{621,22},{-12,515},{-705,-91},{851,-699},{737,178},{139,219},{-204,422},{-213,507},{-971,561},{-611,-145},{-831,862},{-810,864},{862,986},{876,-799},{-410,328},{864,271},{627,-964},{74,-278},{-30,-472},{889,37},{-496,606},{917,386},{-80,-158},{-15,-43},{-398,400},{294,-364},{-268,137},{962,-864},{121,-753},{749,-2},{-957,-742},{-18,-568},{191,-836},{414,-613},{-190,573},{-820,-5},{-782,-91},{161,-69},{-313,728},{414,1000},{860,227},{736,184},{-812,-342},{-184,-376},{-843,-833},{-132,992},{-368,-18},{-987,-676},{-901,521},{-642,-404},{382,-704},{459,741},{-880,-994},{-31,-688},{966,-342},{-6,707},{-637,673},{969,-73},{-363,-816},{-672,452},{-152,592},{-576,-451},{-58,112},{660,-422},{-33,711},{-364,831},{368,-88},{81,-802},{838,-834},{-509,561},{273,-50},{-173,500},{-574,-134},{933,-418},{-129,893},{970,715},{-718,-692},{562,-646},{-70,-481},{950,-661},{504,438},{483,-60},{-883,482},{610,-205},{994,-471},{-849,857},{-171,577},{207,990},{629,993},{-875,418},{-713,-151},{-582,-24},{784,987},{-491,970},{-125,-589},{-789,21},{-340,-752},{-333,-117},{-968,-247},{851,831},{-167,144},{-98,943},{-929,677},{-855,246},{464,343},{-126,-352},{934,980},{274,-963},{652,49},{307,771},{-719,213},{502,904},{-177,334},{-651,-723},{921,906},{-871,304},{-556,-266},{-241,215},{-220,-763},{729,-462},{41,515},{-610,-553},{405,925},{-370,135},{-933,522},{-49,-857},{-925,-282},{113,503},{-415,-960},{-900,967},{-739,-678},{125,-859},{-69,-106},{91,284},{-575,-449},{860,-712},{866,957},{985,-847},{832,-172},{827,-366},{315,-679},{380,227},{271,-822},{985,-564},{-293,13},{248,-445},{-445,521},{129,232},{317,-189},{-765,-208},{-387,-614},{991,63},{72,69},{-55,167},{492,-491},{484,650},{846,-240},{-953,-543},{299,-577},{370,68},{692,-480},{-128,785},{-639,879},{-928,43},{-916,-783},{-996,430},{-111,716},{327,767},{845,126},{-418,-7},{475,220},{574,-648},{173,864},{65,-575},{699,320},{476,530},{-165,-614},{90,-114},{95,861},{753,179},{186,-881},{328,-702},{712,993},{515,407},{-448,854},{693,866},{240,-30},{455,868},{-226,252},{-621,-126},{-129,470},{-636,954},{612,538},{198,-403},{-663,562},{-700,-446},{749,521},{703,-322},{148,977},{-695,966},{-457,-461},{-406,-283},{362,-316},{-39,516},{-391,-156},{-699,177},{427,450},{-910,-636},{-240,-222},{694,366},{-346,35},{-940,-406},{325,-19},{-217,-362},{220,134},{131,-82},{376,724},{-14,663},{827,634},{549,519},{886,175},{801,-434},{585,956},{830,-394},{674,-128},{-364,-633},{369,-43},{-660,-272},{-762,602},{-265,103},{-280,964},{-605,120},{636,-353},{-13,-250},{974,-141},{-207,866},{951,84},{-784,-133},{175,-346},{703,-936},{-110,-280},{550,-429},{693,404},{902,231},{-489,-929},{464,156},{532,906},{562,-686},{378,121},{-615,-149},{-613,-428},{-120,-990},{-945,-574},{-873,701},{71,319},{-440,-558},{-960,713},{-634,-148},{-248,411},{-966,-397},{404,-15},{-17,721},{-305,492},{-957,601},{-13,499},{-328,709},{484,-18},{-874,-237},{642,261},{111,314},{456,996},{253,-922},{715,420},{-99,989},{247,-149},{597,285},{135,-263},{-3,97},{21,927},{236,-911},{968,-504},{128,329},{866,-872},{-146,969},{547,-889},{985,995},{141,631},{-137,-784},{-164,336},{978,-40},{-886,496},{618,972},{820,743},{15,-355},{468,361},{-413,-855},{983,-998},{265,-634},{827,758},{-307,-149},{74,-151},{65,-29},{956,-783},{-158,-580},{889,199},{628,-995},{613,-338},{-674,-342},{-19,498},{-342,251},{782,-306},{-34,228},{-799,669},{-722,744},{-576,567},{235,-237},{188,965},{596,-70},{-414,829},{99,588},{-122,42},{903,466},{-143,-129},{770,823},{-454,-865},{-472,435},{-854,888},{404,-301},{-996,-965},{-149,632},{-848,-551},{23,-26},{228,-317},{222,-217},{902,-827},{-53,263},{243,-782},{-306,817},{727,170},{-533,-804},{950,335},{577,484},{-436,-314},{-645,-982},{-72,-349},{-944,-203},{-694,161},{-895,-246},{-278,-317},{-711,-932},{339,-632},{-336,-111},{-939,-780},{551,276},{372,-233},{-84,-901},{-524,931},{-951,-606},{672,655},{-143,-226},{72,-150},{-881,328},{-32,927},{-172,-751},{720,555},{-425,-278},{-240,671},{-142,-850},{207,725},{843,-419},{11,375},{393,-821},{-275,-910},{942,686},{-109,469},{172,117},{-378,-828},{-106,-808},{-145,-958},{734,53},{-357,-40},{-425,-335},{-51,-444},{-635,-281},{-767,379},{-125,606},{-211,411},{-398,349},{949,-277},{-428,389},{-750,776},{102,-37},{-722,387},{458,-617},{-920,-497},{799,829},{489,-748},{743,634},{408,166},{-967,440},{192,88},{-366,389},{-168,-50},{94,860},{-515,-553},{464,-115},{123,483},{745,729},{-279,-724},{-526,-169},{547,782},{-650,281},{688,491},{-607,632},{-151,-95},{-312,-361},{-920,-348},{649,584},{-648,-421},{-743,25},{-164,579},{531,770},{-490,167},{-492,-109},{581,-164},{-986,-726},{841,-842},{89,787},{662,-92},{17,547},{380,-306},{-590,284},{-819,883},{878,-786},{956,-263},{-692,553},{-970,0},{-372,438},{40,-647},{636,-379},{-529,118},{329,-736},{295,384},{-638,636},{554,356},{572,831},{-555,673},{-398,-904},{-473,-965},{-383,814},{838,640},{840,255},{-687,-163},{-916,-539},{268,-635},{-921,-758},{426,-710},{171,-523},{-50,148},{815,-525},{118,189},{853,-501},{-120,112},{73,-942},{930,260},{761,-413},{-262,-128},{-410,-214},{-513,527},{161,-316},{393,-996},{-941,568},{705,-593},{389,-646},{-789,-562},{616,-325},{-939,-692},{-236,-786},{285,-976},{845,-863},{339,626},{86,-617},{-121,751},{-617,-801},{-371,-914},{577,-819},{190,-873},{484,-645},{-526,-761},{-484,-593},{-426,306},{286,-975},{663,608},{491,65},{464,448},{-140,-228},{528,-263},{-259,664},{-241,176},{-537,888},{510,392},{554,236},{-663,-874},{977,-391},{-513,-350},{-703,-185},{-976,185},{501,44},{817,79},{-133,-393},{-651,-236},{718,-886},{-600,941},{711,954},{1000,-66},{151,396},{285,-402},{613,-4},{-704,904},{177,-690},{443,-771},{615,233},{234,721},{-156,5},{-569,-773},{65,49},{1000,637},{385,540},{675,-220},{-781,-66},{-827,-60},{401,915},{914,547},{93,40},{339,966},{-521,-309},{-854,-205},{5,882},{-547,-768},{-1,-266},{-596,50},{326,825},{-418,-438},{-142,786},{899,752},{908,669},{370,-971},{181,-538},{-630,-189},{-13,798},{-640,1},{-60,359},{-219,607},{735,402},{-849,980},{212,-226},{-462,-188},{-256,626},{317,192},{561,671},{510,31},{760,759},{-507,-576},{-608,-738},{888,331},{699,-759},{-275,-332},{-82,-329},{99,453},{-92,-342},{179,636},{-553,811},{-414,-53},{-256,-814},{-300,-661},{-534,274},{667,231},{812,816},{363,-392},{-987,-733},{-552,-567},{20,365},{386,-697},{615,-151},{889,36},{690,-722},{896,-488},{654,967},{600,-59},{-529,-56},{-28,214},{167,-975},{59,-823},{-886,-93},{205,256},{337,996},{-828,765},{135,-573},{-336,-661},{317,-741},{-490,-360},{451,589},{622,-686},{-304,445},{576,338},{-693,-704},{-453,778},{-469,-940},{404,870},{-174,681},{-541,-461},{-154,-710},{-615,-740},{274,672},{-91,112},{-829,598},{109,-40},{-365,283},{748,-269},{-45,965},{935,786},{-234,336},{906,824},{-185,721},{-941,544},{497,375},{-225,-64},{681,812},{-465,858},{-92,779},{647,3},{147,-811},{404,748},{-748,-660},{882,-500},{-128,-337},{-660,192},{245,-608},{-697,-352},{-89,-186},{437,-319},{-542,715},{260,813},{-659,-686},{751,274},{114,9},{-102,-473},{78,35},{911,19},{-722,462},{-937,-948},{-848,141},{-676,-941},{-485,-841},{-38,-774},{-652,84},{-787,218},{-907,744},{955,390},{-201,-990},{622,-722},{-626,-61},{828,621},{-263,-568},{-902,-698},{946,30},{-582,338},{-734,915},{-17,87},{-365,730},{221,-961},{918,357},{447,-271},{-669,-632},{-946,454},{320,-853},{-527,780},{896,100},{-55,-8},{326,-623},{-895,225},{-25,-87},{-476,583},{-258,-459},{-760,-884},{269,270},{-455,479},{965,-628},{513,177},{209,-268},{987,-211},{-150,399},{331,951},{-913,-675},{570,75},{-569,496},{996,53},{-469,559},{670,-135},{927,-907},{694,863},{-720,-296},{299,678},{714,-547},{72,793},{-859,-279},{-714,962},{83,-685},{-219,656},{-812,-30},{-646,797},{-743,268},{718,-724},{278,-188},{656,-302},{66,943},{752,-82},{283,995},{65,-543},{846,854},{-525,277},{801,259},{-623,-762},{-312,119},{-306,958},{596,-427},{-579,-162},{670,-740},{157,418},{-878,-196},{979,685},{6,-399},{-974,-950},{-106,-930},{-601,-733},{-968,702},{487,885},{-332,-83},{-493,-385},{782,-795},{897,-212},{-642,161},{676,-539},{87,776},{-621,964},{476,904},{491,-160},{201,-611},{323,-356},{34,-126},{682,-713},{185,892},{-217,47},{957,-216},{-946,-205},{297,-779},{257,-816},{37,-468},{159,400},{-367,715},{329,-458},{730,354},{350,-437},{693,-226},{-893,-622},{51,633},{-691,850},{998,685},{10,439},{-604,-161},{101,-420},{-756,264},{-686,-9},{-450,890},{512,-587},{963,-669},{-7,882},{-335,509},{-716,-513},{-168,-881},{-685,569},{209,985},{-146,910},{-802,574},{-236,815},{90,653},{672,861},{-139,856},{-493,-267},{-608,-223},{848,-438},{222,-733},{-887,834},{-508,-398},{388,-124},{215,412},{784,636},{773,989},{-528,507},{439,643},{-528,372},{38,315},{166,785},{-641,255},{-879,-732},{365,-21},{-34,-197},{192,-810},{843,869},{43,-184},{187,-686},{695,488},{-857,-729},{-118,178},{-646,-56},{-927,648},{928,229},{768,-182},{161,-484},{141,-312},{-221,-931},{-890,-559},{394,822},{565,-206},{-211,-523},{107,-890},{312,-12},{-358,-750},{323,69},{646,-727},{802,-956},{-169,-16},{576,717},{-102,60},{732,872},{-148,-584},{446,342},{403,502},{-840,876},{-305,762},{-696,99},{-736,-817},{582,-442},{-553,689},{-612,-201},{-652,372},{126,706},{258,-822},{-328,-562},{90,-91},{703,696},{596,690},{369,-915},{-647,-834},{968,12},{-790,-726},{-250,-132},{609,-636},{-175,-641},{869,-786},{612,-841},{452,-647},{-901,638},{950,134},{552,-645},{45,714},{-469,-26},{180,368},{179,744},{463,-499},{615,591},{-493,6},{310,-298},{-144,226},{527,-374},{803,299},{-753,-708},{-343,-899},{-206,947},{737,-599},{-738,190},{-544,702},{-998,-115},{-267,716},{310,767},{-983,211},{-966,304},{631,345},{887,667},{944,-141},{958,788},{-352,621},{101,-243},{567,-952},{-896,626},{-891,345},{199,-219},{9,286},{-162,-470},{916,360},{332,-650},{-586,885},{378,-881},{785,-90},{67,54},{-171,-292},{-384,811},{923,-751},{-649,122},{-383,-726},{-822,509},{-320,776},{-528,-207},{815,108},{300,129},{-498,-304},{717,365},{-154,-117},{840,586},{200,927},{516,304},{-839,-178},{-476,-106},{-128,552},{-928,-632},{855,568},{894,-25},{-320,188},{959,860},{-808,595},{-259,380},{628,280},{126,99},{-640,78},{967,193},{-378,395},{413,-982},{537,146},{-117,893},{432,700},{-214,824},{-924,-937},{219,-642},{393,741},{69,482},{-285,-677},{-572,-964},{725,-554},{-924,-849},{-488,-955},{481,-625},{-480,-628},{735,-207},{471,405},{-185,624},{878,975},{716,-661},{994,216},{336,120},{834,68},{-307,-885}};
//		System.out.println(checkStraightLine(array));
//		
//		System.out.println(isPerfectSquare(16));
//		
//		
//		System.out.println(isPerfectSquareWithBS(104976));
//		
//		int[][] array1 = {{1,2}};
//		System.out.println(findJudge(4,array1));
//		
//		
//		
//		int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
//		
//		int[][] imageUpdated = floodFill(image, 1, 1, 2);
//		System.out.println();
//		
//		
//		for(int i = 0; i < imageUpdated.length; i++) {
//			for(int j = 0; j < imageUpdated[0].length; j++ ) {
//				System.out.print(imageUpdated[i][j]+"  ");
//			}
//			System.out.println();
//		}
		
		
//		int a = 3 >> 1;
//			System.out.println(a);
//			
//		int[] b = {1,1,2,3,3,4,4,8,8};
//		System.out.println(singleNonDuplicateBS(b));
		
		
//		System.out.println(removeKdigits2("5337", 2));
		
		int[] b = {5,-3,5};
		System.out.println(maxSubarraySumCircular(b));
		
		
		
		
		System.out.println(checkInclusion("abcdxabcde", "abcdeabcdx"));
		
		
				

	}

	public static int majorityElement(int[] nums) {

		int size = nums.length;
		Map<Integer, Integer> elementMap = new HashMap<>();

		for (int i : nums) {
			if (elementMap.containsKey(i)) {
				int newCount = elementMap.get(i) + 1;
				elementMap.put(i, newCount);
			} else
				elementMap.put(i, 1);
		}

		for (int j : elementMap.keySet()) {
			if (elementMap.get(j) > (size / 2)) {
				return j;
			}
		}

		return -1;
	}

	public static int firstUniqChar(String s) {
		int size = s.length();
		Map<Character, Integer> elementMap = new LinkedHashMap<>();

		for (int i = 0; i < size; i++) {
			if (elementMap.containsKey(s.charAt(i))) {
				int newCount = elementMap.get(s.charAt(i)) + 1;
				elementMap.put(s.charAt(i), newCount);
			} else
				elementMap.put(s.charAt(i), 1);

		}

		for (char j : elementMap.keySet()) {
			if (elementMap.get(j) == 1) {
				return s.indexOf(j);
			}
		}
		return -1;

	}

	public static void decimalToBinary(int num) {

		if (num > 1)
			decimalToBinary(num / 2);

		System.out.print(num % 2);
	}

	public static String decimalToBinaryWithoutRecursion(int num) {

		StringBuilder sb = new StringBuilder();
		Stack<Integer> binaryStack = new Stack<>();
		if (num == 0)
			return "0";

		while (num > 0) {
			binaryStack.push(num % 2);
			num = num / 2;
		}
		while (!binaryStack.isEmpty()) {
			int complement = binaryStack.pop() == 1 ? 0 : 1;
			sb.append(complement);
		}

		return sb.toString();
	}

	public static int binaryToDecimal(String binaryNumber) {

		int decimal = 0;
		int base = 1; // as 2^0 = 1

//		1        1        1        0
//		1*2^3  + 1*2^2  + 1*2^1  + 0*2^0 = 8+4+2+0 = 14

//		while (binaryNumber > 0) {
		for (int i = binaryNumber.length() - 1; i >= 0; i--) {

//				long lastNumber = binaryNumber % 10;
//				decimal += lastNumber * base;
//				binaryNumber = binaryNumber / 10;
//				base = base * 2;

			decimal += Integer.parseInt(Character.toString(binaryNumber.charAt(i))) * base;
			base = base * 2;
		}
//		}

		return decimal;
	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		Map<Character, Integer> magazineMap = new HashMap<>();
		for (int i = 0; i < magazine.length(); i++) {
			if (magazineMap.containsKey(magazine.charAt(i))) {
				int newCount = magazineMap.get(magazine.charAt(i)) + 1;
				magazineMap.put(magazine.charAt(i), newCount);
			} else
				magazineMap.put(magazine.charAt(i), 1);
		}

		for (int i = 0; i < ransomNote.length(); i++) {

			if (!magazineMap.containsKey(ransomNote.charAt(i)) || magazineMap.get(ransomNote.charAt(i)).equals(0))
				return false;
			else {
				int newSize = magazineMap.get(ransomNote.charAt(i)) - 1;
				magazineMap.put(ransomNote.charAt(i), newSize);

			}
		}
		return true;
	}

	/**How To Determine If Points Are Collinear In Coordinate Geometry?
	 * Slope formula method to find that points are collinear.
	 * 1. Two points always collinear
	 * 2. three or more points are collinear even if slop of any two points are same like below
	 * (y2-y1)/(x2-x1) == (yn-yn-1)/(xn-xn-1)
	 * 
	 * @param coordinates int[][] array
	 * @return boolean
	 */
	public static boolean checkStraightLine(int[][] coordinates) {

		int x1 = 0, y1 = 0, x2 = 0, y2 = 0, g = 0;
		if (coordinates.length == 2)
			return true;

		if (coordinates.length > 2 && coordinates.length <= 1000) {
			x1 = coordinates[0][0];
			y1 = coordinates[0][1];

			x2 = coordinates[1][0];
			y2 = coordinates[1][1];

			if((x2 - x1) ==0) return false;
			g = (y2 - y1) / (x2 - x1);

			for (int i = 2; i < coordinates.length; i++) {

				int xnth = coordinates[i][0];
				int ynth = coordinates[i][1];
				
				if((xnth - x2) == 0) return false;
				int tempG = (ynth - y2) / (xnth - x2);

				if (tempG != g)
					return false;
			}
			return true;
		}
		return false;

	}
	
	
	
	/**Reduce the loop overhead while checking unit place digit.
	 * If unit place digit either of (2,3,7,8) so its not a perfect square 
	 * @param num
	 * @return true/false
	 */
	public static boolean isPerfectSquare(int num) {

		List<Integer> donotContains = Arrays.asList(2,3,7,8);
		if(donotContains.contains(num%10))
			return false;

		for(int i = 1; i * i <= num; i++) {
			
			
			if(i*i == num)
				return true;
		}
		return false;
		
	}
	
	
	
	public static boolean isPerfectSquareWithBS(int num) {

		long left = 1;
		long right = num;

		if(num == 1) return true;
		while (left < right) {
			
			long mid = left + (right - left) / 2;
			if ((mid*mid) == num) {
				return true;
			}
			if((mid*mid) > num) {
				right = mid-1;
				
			} else {
				left = mid + 1;
			}

			if(left == right) {
				System.out.println(left);
			}
		}
		if(left * left == num) return true;
		return false;
		
	}
	
	 
	public int numJewelsInStones(String J, String S) {

		Map<Character, Integer> elementMap = new HashMap<>();

		for (int i = 0; i < S.length(); i++) {
			if (elementMap.containsKey(S.charAt(i))) {
				int newCount = elementMap.get(S.charAt(i)) + 1;
				elementMap.put(S.charAt(i), newCount);
			} else
				elementMap.put(S.charAt(i), 1);
		}
		int count = 0;
		for(int i = 0; i < J.length(); i++) {
			if(elementMap.containsKey(J.charAt(i))) {
				count += elementMap.get(J.charAt(i));
			}
		}
		
		return count;
	}
	 
	 
	/* The isBadVersion API is defined in the parent class VersionControl.
    boolean isBadVersion(int version); 
    Using binary search for O(log(n)) complexity as its a sorted array*/
	public int firstBadVersion(int n) {

		int left = 1;
		int right = n;

		while (left < right) {
			int mid = left + (right - left) / 2;
			if (isBadVersion(mid)) {
				right = mid;
			} else {
				left = mid + 1;
			}

		}
		return right;

	}
	
	
	 
	private boolean isBadVersion(int mid) {
		return false;
	}

	/**
	 * 1 <= N <= 1000 
	 * trust.length <= 10000 
	 * trust[i] are all different 
	 * trust[i][0] != trust[i][1] 
	 * 1 <= trust[i][0], trust[i][1] <= N
	 **/
	public static int findJudge(int N, int[][] trust) {
		if(N==1 && trust.length == 0)
			return 1;
		if(trust.length ==1)
			return trust[0][1];
		
		Map<Integer, TreeSet<Integer>> trustMap = new HashMap<>();
		
		for(int i = 0; i < trust.length; i++) {
			int a = trust[i][0];
			int b = trust[i][1];
			
			if(trustMap.containsKey(b)) {
				TreeSet<Integer> newTreeSet = trustMap.get(b);
				newTreeSet.add(a);
				trustMap.put(b, newTreeSet);
			}
			else {
				TreeSet<Integer> newTreeSet = new TreeSet<>();
				newTreeSet.add(a);
				trustMap.put(b, newTreeSet);
			}
		}
		
		
		int trueKey = -1;
			for(int key : trustMap.keySet()) {
				if(trustMap.get(key).size()==N-1) {
					trueKey = key;
					break;
				}
					
			}
			if(trueKey > 0) {
				for(int key : trustMap.keySet()) {
					if(trustMap.get(key).contains(trueKey))
						trueKey = -1;
				}
				
			}
		
		return trueKey;
	}
	 
	 
	
	/**
	 * @param image
	 * @param sr (stating row) 
	 * @param sc (starting column)
	 * @param newColor (new color to fill if matrix neighbor matches with stating pixel value)
	 * @return modified image
	 */
	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

		int h = image.length;
		int l = image[0].length;
		
		boolean [][] visited = new boolean[h][l];
		return DFSImage(image, sr,  sc, visited, newColor, image[sr][sc]);

	}

	private static int[][] DFSImage(int[][] image, int sr, int sc, boolean[][] visited, int newColor, int startingPixel) {
		int H = image.length;
        int L = image[0].length;
        
        if (sr < 0 || sc < 0 || sr >= H || sc >= L || visited[sr][sc])
            return image;
		
        
        visited[sr][sc] = true;
        
        if(image[sr][sc]== startingPixel) {
        	image[sr][sc]=newColor;
        }
        
        
        DFSImage(image, sr+ 1, sc,visited, newColor, startingPixel); // go down neighbor
        DFSImage(image, sr- 1, sc,visited, newColor, startingPixel); //go up neighbor
        DFSImage(image, sr, sc + 1,visited, newColor, startingPixel); //go right neighbor
        DFSImage(image, sr, sc - 1,visited, newColor, startingPixel); // go left neighbor
        
        return image;
	}
	 
	  public int singleNonDuplicate(int[] nums) {
      	Map<Integer, Integer> intMap = new HashMap<>();
		
		for(int i: nums) {
			if(intMap.containsKey(i)) {
				intMap.remove(i);
			}else
				intMap.put(i, 1);
		}
		
		if(intMap.size()==1)
			return intMap.keySet().iterator().next();
		
		return -1;
  }
	 
//	  with O(log n) time and O(1) space
	  public static  int singleNonDuplicateBS(int[] nums) {
	      	
		  if(nums.length == 1) return nums[0];
		  int l = 0;
	      	int h = nums.length-1;
	      	
	      	while(l < h) {
	      		int mid = l+(h-l)/2;
	      		
	      		if(nums[mid] !=nums[mid+1] && nums[mid] !=nums[mid-1])
	      			return nums[mid];
	      		
	      		if(l == mid-1 && h == mid+1) {
	      			if(nums[mid] == nums[h])
	      				return nums[l];
	      			else
	      				return nums[h];
	      		}
	      		
	      		if((h-mid)%2==0) {
	      			if(nums[mid] == nums[mid-1]) {
	      				h = mid-2;
	      			}else {
	      				l = mid+2;
	      			}
	      		}
	      		else {
	      			if(nums[mid] == nums[mid-1]) {
	      				l = mid + 1;
	      			}else {
	      				h = mid-1;
	      			}
	      		}
	      	}
	      	
	      	return nums[l];
	  }
	  
	  

	
	public static String removeKdigitsStack(String num, int k) {
		int l = num.length();

//		corner case
		if (num.length() == k)
			return "0";
		
		
		Stack<Character> stack = new Stack<>();

		int i = 0;
		while (i < l) {
			while(!stack.isEmpty() && k > 0 && stack.peek() > num.charAt(i)) {
				stack.pop();
				k--;
			}
			stack.push(num.charAt(i));
			i++;

		}
		
//		corner case like 1111 or 5119
		while(!stack.isEmpty() && k > 0) {
			stack.pop();
			k--;
		}

		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		sb.reverse();
		
//		removing leading zero.
		while(sb.length() > 1 && sb.charAt(0) == '0') {
				sb.deleteCharAt(0);
		}
		
		return sb.toString();

	}
	 
	
	public static String removeKdigits2(String num, int k) {

//		corner case
		if (num.length() == k)
			return "0";
		
		StringBuilder sb = new StringBuilder(num);
		
		for(int j = 0; j < k; j++) {
			int i = 0;
			while(i < sb.length()-1 && sb.charAt(i) <= sb.charAt(i+1)) {
				i++;
			}
			sb.delete(i,i+1);
		}
		
//		removing leading zero.
		while(sb.length() > 1 && sb.charAt(0) == '0') {
				sb.deleteCharAt(0);
		}
		
		return sb.toString();
		
	}
	
	
	
	public static int maxSubarraySumCircular(int[] A) {
		int min = Integer.MIN_VALUE;
		boolean isPositive = false;
		
		
		/*
		 * We will also handle a special case. If all the numbers are negative, then we
		 * will return the smallest negative number from below for loop.
		 */
		
		for(int i = 0; i < A.length; i++) {
			if(A[i] > 0) {
				isPositive = true;
				break;
			}
			
			if(A[i] > min) {
				min = A[i];
			}
		}
		
		if(!isPositive)
			return min;
		
		
		
		int maxSumOrginal = kadane(A);
		int totalSum = Arrays.stream(A).sum();
		
		for(int i = 0; i < A.length; i++) {
			A[i] = - A[i];
		}
				
		int negativeMaxSum = kadane(A);
		
		return Math.max(maxSumOrginal, totalSum - (-negativeMaxSum));
		
	}
	
	public static int kadane(int[] A) {
		int maxSum = A[0];
		int currentMax = maxSum;
	
		
		for(int i = 1; i < A.length; i++) {

		
			if((currentMax + A[i]) < A[i]) {
				currentMax = A[i];
			}
			else {
				currentMax = currentMax + A[i];
			}
			
			if(currentMax > maxSum) {
				maxSum = currentMax;
			}
		}
		return maxSum;
	}
	
	
	
//	Sliding window approach using hash table
	public List<Integer> findAnagrams(String s, String p) {

		List<Integer> result = new ArrayList<>();
		
		if( s == null || s.isEmpty()) return result;
		
		Map<Character, Integer> charMap = new HashMap<>();
		for(char c : p.toCharArray()) {
			charMap.put(c, charMap.getOrDefault(c, 0)+1);
		}
		
//		distinct count of string p
		int count = charMap.size();
		
		for(int left = 0, right = 0; right < s.length(); right++) {
			char rChar = s.charAt(right);
			if(charMap.containsKey(rChar)) {
				charMap.put(rChar, charMap.get(rChar)-1);
				
				if(charMap.get(rChar) == 0) {
					count--;
				}
			}
			
			while(count <= 0) {
				char lChar = s.charAt(left);
				if(charMap.containsKey(lChar)) {
					charMap.put(lChar, charMap.get(lChar)+1);
					
					if(charMap.get(lChar) > 0) {
						count++;
					}
				}
				
				if(right - left + 1 == p.length()) {
					result.add(left);
				}
				left++;
				
			}
		}
		return result;
		
	}
	
	
//	Sliding window approach using hash table.
	public static boolean checkInclusion(String s1, String s2) {


		if( s1 == null || s1.isEmpty() || s2.isEmpty() || s2 == null) return false;
		
		Map<Character, Integer> charMap = new HashMap<>();
		for(char c : s1.toCharArray()) {
			charMap.put(c, charMap.getOrDefault(c, 0)+1);
		}
		
		int count = charMap.size();
		
		for(int left = 0, right = 0; right < s2.length(); right ++) {
			char rChar = s2.charAt(right);
			if(charMap.containsKey(rChar)) {
				charMap.put(rChar, charMap.get(rChar)-1);
				
				if(charMap.get(rChar) == 0) {
					count--;
				}
			}
			
			while(count <= 0) {
				char lChar = s2.charAt(left);
				if(charMap.containsKey(lChar)) {
					charMap.put(lChar, charMap.get(lChar)+1);
					
					if(charMap.get(lChar) > 0) {
						count++;
					}
				}
				
				if(right - left + 1 == s1.length()) {
					return true;
				}
				left++;
			}
		}
		return false;
	}
	
	
}
