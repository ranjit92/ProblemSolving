package problems.leetcode.may;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
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
//		System.out.println(maxSubarraySumCircular(b));
		
		
		int[][] array1 = {{0,1,1,1},{1,1,1,1},{0,1,1,1}};
		System.out.println(countSquares(array1));
		
		int[][] array2 = {{0,1,1,1},{1,1,1,1},{0,1,1,1}};
		System.out.println(countMaxSquares(array2));
		
		
		System.out.println(frequencySort("tree"));
		
		int[][] arrayA = {{0,2},{5,10},{13,23},{24,25}};
		int[][] arrayB = {{1,5},{8,12},{15,24},{25,26}};
		int[][] result = intervalIntersectionOptimize(arrayA, arrayB);
		
		for(int[] array : result)
			System.out.println("["+array[0]+","+array[1] +"]");
		
		
		System.out.println(maxUncrossedLines(new int[]{1,4,2}, new int[]{1,2,4}));
		
		
		System.out.println(findMaxLength(new int[]{0,1,1}));
		
		
		System.out.println(possibleBipartition(10, new int[][]{{4,7},{4,8},{2,8},{8,9},{1,6},{5,8},{1,2},{6,7},{3,10},{8,10},{1,5},{7,10},{1,10},{3,5},{3,6},{1,4},{3,9},{2,3},{1,9},{7,9},{2,7},{6,8},{5,7},{3,4}}));
		
		
		
		
		
//		System.out.println(checkInclusion("abcdxabcde", "abcdeabcdx"));
		
		System.out.println(minDistance("horse", "ros"));
				

	}

	/**
	 * Majority Element
	 * 
	 * 
	 * Given an array of size n, find the majority element. The majority element is
	 * the element that appears more than ⌊ n/2 ⌋ times.
	 * 
	 * You may assume that the array is non-empty and the majority element always
	 * exist in the array.
	 * 
	 * Example 1:
	 * 
	 * Input: [3,2,3] Output: 3
	 * 
	 * Example 2:
	 * 
	 * Input: [2,2,1,1,1,2,2] Output: 2
	 * 
	 * 
	 * @param nums
	 * @return
	 */
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

	
	
	/**
	 * First Unique Character in a String
	 * 
	 * 
	 * Given a string, find the first non-repeating character in it and return it's
	 * index. If it doesn't exist, return -1.
	 * 
	 * Examples:
	 * 
	 * s = "leetcode" return 0.
	 * 
	 * s = "loveleetcode", return 2.
	 * 
	 * Note: You may assume the string contain only lowercase letters.
	 * 
	 * 
	 * 
	 * @param s
	 * @return
	 */
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

	/**
	 * 
	 * Number Complement
	 * 
	 * 
	 * Given a positive integer num, output its complement number. The complement
	 * strategy is to flip the bits of its binary representation.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: num = 5 Output: 2 Explanation: The binary representation of 5 is 101
	 * (no leading zero bits), and its complement is 010. So you need to output 2.
	 * 
	 * 
	 * Example 2:
	 * 
	 * Input: num = 1 Output: 0 Explanation: The binary representation of 1 is 1 (no
	 * leading zero bits), and its complement is 0. So you need to output 0.
	 * 
	 * 
	 * Constraints:
	 * 
	 * The given integer num is guaranteed to fit within the range of a 32-bit
	 * signed integer. num >= 1 You could assume no leading zero bit in the
	 * integer’s binary representation. This question is the same as 1009:
	 * https://leetcode.com/problems/complement-of-base-10-integer/
	 * 
	 * 
	 * 
	 * 
	 * @param num
	 * @return
	 */
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

	/**
	 * Ransom Note
	 * 
	 * 
	 * Given an arbitrary ransom note string and another string containing letters
	 * from all the magazines, write a function that will return true if the ransom
	 * note can be constructed from the magazines ; otherwise, it will return false.
	 * 
	 * Each letter in the magazine string can only be used once in your ransom note.
	 * 
	 * Example 1:
	 * 
	 * Input: ransomNote = "a", magazine = "b" Output: false
	 * 
	 * Example 2:
	 * 
	 * Input: ransomNote = "aa", magazine = "ab" Output: false
	 * 
	 * Example 3:
	 * 
	 * Input: ransomNote = "aa", magazine = "aab" Output: true
	 * 
	 * 
	 * Constraints:
	 * 
	 * You may assume that both strings contain only lowercase letters.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @param ransomNote
	 * @param magazine
	 * @return
	 */
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

	/**
	 * Check If It Is a Straight Line
	 * 
	 * You are given an array coordinates, coordinates[i] = [x, y], where [x, y]
	 * represents the coordinate of a point. Check if these points make a straight
	 * line in the XY plane.
	 * 
	 * Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]] Output: true
	 * 
	 * Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]] Output: false
	 * 
	 * Constraints:
	 * 
	 * 2 <= coordinates.length <= 1000 coordinates[i].length == 2 -10^4 <=
	 * coordinates[i][0], coordinates[i][1] <= 10^4 coordinates contains no
	 * duplicate point.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * How To Determine If Points Are Collinear In Coordinate Geometry? Slope
	 * formula method to find that points are collinear. 1. Two points always
	 * collinear 2. three or more points are collinear even if slop of any two
	 * points are same like below (y2-y1)/(x2-x1) == (yn-yn-1)/(xn-xn-1)
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

			if ((x2 - x1) == 0)
				return false;
			g = (y2 - y1) / (x2 - x1);

			for (int i = 2; i < coordinates.length; i++) {

				int xnth = coordinates[i][0];
				int ynth = coordinates[i][1];

				if ((xnth - x2) == 0)
					return false;
				int tempG = (ynth - y2) / (xnth - x2);

				if (tempG != g)
					return false;
			}
			return true;
		}
		return false;

	}
	
	
	/**
	 * Reduce the loop overhead while checking unit place digit.
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
	
	
	
	/**
	 * Valid Perfect Square
	 * 
	 * 
	 * Given a positive integer num, write a function which returns True if num is a
	 * perfect square else False.
	 * 
	 * Follow up: Do not use any built-in library function such as sqrt.
	 * 
	 * Example 1:
	 * 
	 * Input: num = 16 Output: true
	 * 
	 * Example 2:
	 * 
	 * Input: num = 14 Output: false
	 * 
	 * Constraints:
	 * 
	 * 1 <= num <= 2^31 - 1
	 * 
	 * 
	 * @param num
	 * @return
	 */
	public static boolean isPerfectSquareWithBS(int num) {

		long left = 1;
		long right = num;

		if (num == 1)
			return true;
		while (left < right) {

			long mid = left + (right - left) / 2;
			if ((mid * mid) == num) {
				return true;
			}
			if ((mid * mid) > num) {
				right = mid - 1;

			} else {
				left = mid + 1;
			}

			if (left == right) {
				System.out.println(left);
			}
		}
		if (left * left == num)
			return true;
		return false;

	}
	
	 
	/**
	 * Jewels and Stones
	 * 
	 * 
	 * You're given strings J representing the types of stones that are jewels, and
	 * S representing the stones you have. Each character in S is a type of stone
	 * you have. You want to know how many of the stones you have are also jewels.
	 * 
	 * The letters in J are guaranteed distinct, and all characters in J and S are
	 * letters. Letters are case sensitive, so "a" is considered a different type of
	 * stone from "A".
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: J = "aA", S = "aAAbbbb" Output: 3
	 * 
	 * Example 2:
	 * 
	 * Input: J = "z", S = "ZZ" Output: 0
	 * 
	 * 
	 * Note:
	 * 
	 * S and J will consist of letters and have length at most 50. The characters in
	 * J are distinct.
	 * 
	 * 
	 * 
	 * @param J
	 * @param S
	 * @return
	 */
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
		for (int i = 0; i < J.length(); i++) {
			if (elementMap.containsKey(J.charAt(i))) {
				count += elementMap.get(J.charAt(i));
			}
		}

		return count;
	}
	 
	 
	/**
	 * 
	 * First Bad Version
	 * 
	 * You are a product manager and currently leading a team to develop a new
	 * product. Unfortunately, the latest version of your product fails the quality
	 * check. Since each version is developed based on the previous version, all the
	 * versions after a bad version are also bad.
	 * 
	 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first
	 * bad one, which causes all the following ones to be bad.
	 * 
	 * You are given an API bool isBadVersion(version) which will return whether
	 * version is bad. Implement a function to find the first bad version. You
	 * should minimize the number of calls to the API.
	 * 
	 * 
	 * 
	 * Example:
	 * 
	 * Given n = 5, and version = 4 is the first bad version.
	 * 
	 * call isBadVersion(3) -> false call isBadVersion(5) -> true call
	 * isBadVersion(4) -> true
	 * 
	 * Then 4 is the first bad version.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * The isBadVersion API is defined in the parent class VersionControl. boolean
	 * isBadVersion(int version); Using binary search for O(log(n)) complexity as
	 * its a sorted array
	 **/
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
	 * Find the Town Judge
	 * 
	 * 
	 * In a town, there are N people labelled from 1 to N. There is a rumor that one
	 * of these people is secretly the town judge.
	 * 
	 * If the town judge exists, then:
	 * 
	 * The town judge trusts nobody. Everybody (except for the town judge) trusts
	 * the town judge. There is exactly one person that satisfies properties 1 and
	 * 2. You are given trust, an array of pairs trust[i] = [a, b] representing that
	 * the person labelled a trusts the person labelled b.
	 * 
	 * If the town judge exists and can be identified, return the label of the town
	 * judge. Otherwise, return -1.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: N = 2, trust = [[1,2]] Output: 2
	 * 
	 * 
	 * Example 2:
	 * 
	 * Input: N = 3, trust = [[1,3],[2,3]] Output: 3
	 * 
	 * 
	 * Example 3:
	 * 
	 * Input: N = 3, trust = [[1,3],[2,3],[3,1]] Output: -1
	 * 
	 * 
	 * Example 4:
	 * 
	 * Input: N = 3, trust = [[1,2],[2,3]] Output: -1
	 * 
	 * 
	 * Example 5:
	 * 
	 * Input: N = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]] Output: 3
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 1 <= N <= 1000 trust.length <= 10000 trust[i] are all different trust[i][0]
	 * != trust[i][1] 1 <= trust[i][0], trust[i][1] <= N
	 **/
	public static int findJudge(int N, int[][] trust) {
		if (N == 1 && trust.length == 0)
			return 1;
		if (trust.length == 1)
			return trust[0][1];

		Map<Integer, TreeSet<Integer>> trustMap = new HashMap<>();

		for (int i = 0; i < trust.length; i++) {
			int a = trust[i][0];
			int b = trust[i][1];

			if (trustMap.containsKey(b)) {
				TreeSet<Integer> newTreeSet = trustMap.get(b);
				newTreeSet.add(a);
				trustMap.put(b, newTreeSet);
			} else {
				TreeSet<Integer> newTreeSet = new TreeSet<>();
				newTreeSet.add(a);
				trustMap.put(b, newTreeSet);
			}
		}

		int trueKey = -1;
		for (int key : trustMap.keySet()) {
			if (trustMap.get(key).size() == N - 1) {
				trueKey = key;
				break;
			}

		}
		if (trueKey > 0) {
			for (int key : trustMap.keySet()) {
				if (trustMap.get(key).contains(trueKey))
					trueKey = -1;
			}

		}

		return trueKey;
	}
	 
	 
	
	/**
	 * Flood Fill
	 * 
	 * An image is represented by a 2-D array of integers, each integer representing
	 * the pixel value of the image (from 0 to 65535).
	 * 
	 * Given a coordinate (sr, sc) representing the starting pixel (row and column)
	 * of the flood fill, and a pixel value newColor, "flood fill" the image.
	 * 
	 * To perform a "flood fill", consider the starting pixel, plus any pixels
	 * connected 4-directionally to the starting pixel of the same color as the
	 * starting pixel, plus any pixels connected 4-directionally to those pixels
	 * (also with the same color as the starting pixel), and so on. Replace the
	 * color of all of the aforementioned pixels with the newColor.
	 * 
	 * At the end, return the modified image.
	 * 
	 * Example 1: 
	 * 
	 * Input: image = [[1,1,1],[1,1,0],[1,0,1]] sr = 1, sc = 1, newColor
	 * = 2 Output: [[2,2,2],[2,2,0],[2,0,1]] Explanation: From the center of the
	 * image (with position (sr, sc) = (1, 1)), all pixels connected by a path of
	 * the same color as the starting pixel are colored with the new color. Note the
	 * bottom corner is not colored 2, because it is not 4-directionally connected
	 * to the starting pixel.
	 * 
	 * 
	 * Note:
	 * 
	 * The length of image and image[0] will be in the range [1, 50]. The given
	 * starting pixel will satisfy 0 <= sr < image.length and 0 <= sc <
	 * image[0].length. The value of each color in image[i][j] and newColor will be
	 * an integer in [0, 65535].
	 * 
	 * 
	 * 
	 * @param image
	 * @param sr       (stating row)
	 * @param sc       (starting column)
	 * @param newColor (new color to fill if matrix neighbor matches with stating
	 *                 pixel value)
	 * @return modified image
	 */
	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

		int h = image.length;
		int l = image[0].length;

		boolean[][] visited = new boolean[h][l];
		return DFSImage(image, sr, sc, visited, newColor, image[sr][sc]);

	}

	private static int[][] DFSImage(int[][] image, int sr, int sc, boolean[][] visited, int newColor,
			int startingPixel) {
		int H = image.length;
		int L = image[0].length;

		if (sr < 0 || sc < 0 || sr >= H || sc >= L || visited[sr][sc])
			return image;

		visited[sr][sc] = true;

		if (image[sr][sc] == startingPixel) {
			image[sr][sc] = newColor;
		}

		DFSImage(image, sr + 1, sc, visited, newColor, startingPixel); // go down neighbor
		DFSImage(image, sr - 1, sc, visited, newColor, startingPixel); // go up neighbor
		DFSImage(image, sr, sc + 1, visited, newColor, startingPixel); // go right neighbor
		DFSImage(image, sr, sc - 1, visited, newColor, startingPixel); // go left neighbor

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
	 
	
	
	
	/**
	 * Single Element in a Sorted Array
	 * 
	 * 
	 * You are given a sorted array consisting of only integers where every element
	 * appears exactly twice, except for one element which appears exactly once.
	 * Find this single element that appears only once.
	 * 
	 * Follow up: Your solution should run in O(log n) time and O(1) space.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [1,1,2,3,3,4,4,8,8] Output: 2
	 * 
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [3,3,7,7,10,11,11] Output: 10
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= nums.length <= 10^5 0 <= nums[i] <= 10^5
	 * 
	 * 
	 * 
	 * 
	 * @param nums
	 * @return
	 * 
	 * 
	 *  with O(log n) time and O(1) space
	 */ 
	public static int singleNonDuplicateBS(int[] nums) {

		if (nums.length == 1)
			return nums[0];
		int l = 0;
		int h = nums.length - 1;

		while (l < h) {
			int mid = l + (h - l) / 2;

			if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1])
				return nums[mid];

			if (l == mid - 1 && h == mid + 1) {
				if (nums[mid] == nums[h])
					return nums[l];
				else
					return nums[h];
			}

			if ((h - mid) % 2 == 0) {
				if (nums[mid] == nums[mid - 1]) {
					h = mid - 2;
				} else {
					l = mid + 2;
				}
			} else {
				if (nums[mid] == nums[mid - 1]) {
					l = mid + 1;
				} else {
					h = mid - 1;
				}
			}
		}

		return nums[l];
	}
	  
	  

	/**
	 * Remove K Digits
	 * 
	 * 
	 * Given a non-negative integer num represented as a string, remove k digits
	 * from the number so that the new number is the smallest possible.
	 * 
	 * Note: The length of num is less than 10002 and will be ≥ k. The given num
	 * does not contain any leading zero.
	 * 
	 * Example 1:
	 * 
	 * Input: num = "1432219", k = 3 Output: "1219" Explanation: Remove the three
	 * digits 4, 3, and 2 to form the new number 1219 which is the smallest.
	 * 
	 * 
	 * Example 2:
	 * 
	 * Input: num = "10200", k = 1 Output: "200" Explanation: Remove the leading 1
	 * and the number is 200. Note that the output must not contain leading zeroes.
	 * 
	 * Example 3:
	 * 
	 * Input: num = "10", k = 2 Output: "0" Explanation: Remove all the digits from
	 * the number and it is left with nothing which is 0.
	 * 
	 * 
	 * 
	 * @param num
	 * @param k
	 * @return
	 */
	public static String removeKdigitsStack(String num, int k) {
		int l = num.length();

//		corner case
		if (num.length() == k)
			return "0";

		Stack<Character> stack = new Stack<>();

		int i = 0;
		while (i < l) {
			while (!stack.isEmpty() && k > 0 && stack.peek() > num.charAt(i)) {
				stack.pop();
				k--;
			}
			stack.push(num.charAt(i));
			i++;

		}

//		corner case like 1111 or 5119
		while (!stack.isEmpty() && k > 0) {
			stack.pop();
			k--;
		}

		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}

		sb.reverse();

//		removing leading zero.
		while (sb.length() > 1 && sb.charAt(0) == '0') {
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
	
	
	
	/**
	 * Maximum Sum Circular Subarray
	 * 
	 * 
	 * Given a circular array C of integers represented by A, find the maximum
	 * possible sum of a non-empty subarray of C.
	 * 
	 * Here, a circular array means the end of the array connects to the beginning
	 * of the array. (Formally, C[i] = A[i] when 0 <= i < A.length, and
	 * C[i+A.length] = C[i] when i >= 0.)
	 * 
	 * Also, a subarray may only include each element of the fixed buffer A at most
	 * once. (Formally, for a subarray C[i], C[i+1], ..., C[j], there does not exist
	 * i <= k1, k2 <= j with k1 % A.length = k2 % A.length.)
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: [1,-2,3,-2] Output: 3 Explanation: Subarray [3] has maximum sum 3
	 * 
	 * 
	 * Example 2:
	 * 
	 * Input: [5,-3,5] Output: 10 Explanation: Subarray [5,5] has maximum sum 5 + 5
	 * = 10
	 * 
	 * 
	 * Example 3:
	 * 
	 * Input: [3,-1,2,-1] Output: 4 Explanation: Subarray [2,-1,3] has maximum sum 2
	 * + (-1) + 3 = 4
	 * 
	 * 
	 * Example 4:
	 * 
	 * Input: [3,-2,2,-3] Output: 3 Explanation: Subarray [3] and [3,-2,2] both have
	 * maximum sum 3
	 * 
	 * 
	 * 
	 * Example 5:
	 * 
	 * Input: [-2,-3,-1] Output: -1 Explanation: Subarray [-1] has maximum sum -1
	 * 
	 * Note:
	 * 
	 * -30000 <= A[i] <= 30000 1 <= A.length <= 30000
	 * 
	 * 
	 * 
	 * 
	 * @param A
	 * @return
	 */
	public static int maxSubarraySumCircular(int[] A) {
		int min = Integer.MIN_VALUE;
		boolean isPositive = false;

		/*
		 * We will also handle a special case. If all the numbers are negative, then we
		 * will return the smallest negative number from below for loop.
		 */

		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				isPositive = true;
				break;
			}

			if (A[i] > min) {
				min = A[i];
			}
		}

		if (!isPositive)
			return min;

		int maxSumOrginal = kadane(A);
		int totalSum = Arrays.stream(A).sum();

		for (int i = 0; i < A.length; i++) {
			A[i] = -A[i];
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
	
	
	/**
	 * Find All Anagrams in a String
	 * 
	 * 
	 * Given a string s and a non-empty string p, find all the start indices of p's
	 * anagrams in s.
	 * 
	 * Strings consists of lowercase English letters only and the length of both
	 * strings s and p will not be larger than 20,100.
	 * 
	 * The order of output does not matter.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s: "cbaebabacd" p: "abc"
	 * 
	 * Output: [0, 6]
	 * 
	 * Explanation: The substring with start index = 0 is "cba", which is an anagram
	 * of "abc". The substring with start index = 6 is "bac", which is an anagram of
	 * "abc".
	 * 
	 * 
	 * 
	 * Example 2:
	 * 
	 * Input: s: "abab" p: "ab"
	 * 
	 * Output: [0, 1, 2]
	 * 
	 * Explanation: The substring with start index = 0 is "ab", which is an anagram
	 * of "ab". The substring with start index = 1 is "ba", which is an anagram of
	 * "ab". The substring with start index = 2 is "ab", which is an anagram of
	 * "ab".
	 * 
	 * 
	 * 
	 * @param s
	 * @param p
	 * @return
	 * 
	 * 
	 *         Sliding window approach using hash table
	 */
	public List<Integer> findAnagrams(String s, String p) {

		List<Integer> result = new ArrayList<>();

		if (s == null || s.isEmpty())
			return result;

		Map<Character, Integer> charMap = new HashMap<>();
		for (char c : p.toCharArray()) {
			charMap.put(c, charMap.getOrDefault(c, 0) + 1);
		}

//		distinct count of string p
		int count = charMap.size();

		for (int left = 0, right = 0; right < s.length(); right++) {
			char rChar = s.charAt(right);
			if (charMap.containsKey(rChar)) {
				charMap.put(rChar, charMap.get(rChar) - 1);

				if (charMap.get(rChar) == 0) {
					count--;
				}
			}

			while (count <= 0) {
				char lChar = s.charAt(left);
				if (charMap.containsKey(lChar)) {
					charMap.put(lChar, charMap.get(lChar) + 1);

					if (charMap.get(lChar) > 0) {
						count++;
					}
				}

				if (right - left + 1 == p.length()) {
					result.add(left);
				}
				left++;

			}
		}
		return result;

	}
	
	
	/**
	 * Permutation in String
	 * 
	 * 
	 * Given two strings s1 and s2, write a function to return true if s2 contains
	 * the permutation of s1. In other words, one of the first string's permutations
	 * is the substring of the second string.
	 * 
	 * Example 1:
	 * 
	 * Input: s1 = "ab" s2 = "eidbaooo" Output: True Explanation: s2 contains one
	 * permutation of s1 ("ba").
	 * 
	 * 
	 * Example 2:
	 * 
	 * Input:s1= "ab" s2 = "eidboaoo" Output: False
	 * 
	 * 
	 * Constraints:
	 * 
	 * The input strings only contain lower case letters. The length of both given
	 * strings is in range [1, 10,000].
	 * 
	 * 
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 * 
	 * 
	 *         Sliding window approach using hash table.
	 */
	public static boolean checkInclusion(String s1, String s2) {

		if (s1 == null || s1.isEmpty() || s2.isEmpty() || s2 == null)
			return false;

		Map<Character, Integer> charMap = new HashMap<>();
		for (char c : s1.toCharArray()) {
			charMap.put(c, charMap.getOrDefault(c, 0) + 1);
		}

		int count = charMap.size();

		for (int left = 0, right = 0; right < s2.length(); right++) {
			char rChar = s2.charAt(right);
			if (charMap.containsKey(rChar)) {
				charMap.put(rChar, charMap.get(rChar) - 1);

				if (charMap.get(rChar) == 0) {
					count--;
				}
			}

			while (count <= 0) {
				char lChar = s2.charAt(left);
				if (charMap.containsKey(lChar)) {
					charMap.put(lChar, charMap.get(lChar) + 1);

					if (charMap.get(lChar) > 0) {
						count++;
					}
				}

				if (right - left + 1 == s1.length()) {
					return true;
				}
				left++;
			}
		}
		return false;
	}
	
	
	
	
	/**
	 * Count Square Submatrices with All Ones
	 * 
	 * 
	 * Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.
	 * 
	 * 
	 * Example 1:

	 *Input: matrix =
	 *[
  	 *[0,1,1,1],
  	 *[1,1,1,1],
  	 *[0,1,1,1]
	 *]
	 *Output: 15
	 *Explanation: 
	 *There are 10 squares of side 1.
	 *There are 4 squares of side 2.
	 *There is  1 square of side 3.
	 *Total number of squares = 10 + 4 + 1 = 15.


	 *Example 2:

	 *Input: matrix = 
	 *[
  	 *[1,0,1],
  	 *[1,1,0],
  	 *[1,1,0]
	 *]
	 *Output: 7
	 *Explanation: 
	 *There are 6 squares of side 1.  
	 *There is 1 square of side 2. 
	 *Total number of squares = 6 + 1 = 7.
	 *
	 *
	 *Constraints:

	 *1 <= arr.length <= 300
	 *1 <= arr[0].length <= 300
	 *0 <= arr[i][j] <= 1
	 *
	 *
	 *
	 * @param matrix
	 * @return  
	 * 
	 * 
	 * |0	1	1	1|         |0	1	1	1|          
	 * |			 |         |			 |     
	 * |1	1	1	1|	>>>	   |1	1	2	2|
	 * |			 |         |			 |
	 * |0	1	1	1|         |0	1	2	3|
	 * 
	 * Transform given matrix such that each element in matrix represent the number of square matrix they can form including itself.
	 */
	public static int countSquares(int[][] matrix) {
		
//		result for summing up the number of square matrix at each element in matrix 
		int result = 0;
		int row = matrix.length;
		int column = matrix[0].length;
		
		if(matrix.length == 0) return 0;
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				
//				handling boundaries case i.e all the element from 1st row and 1st column
//				because for these elements no neighbor will present so either they can form 1 x 1 matrix or not  
				if(i == 0 || j ==0) {
					result += matrix[i][j]; 
					continue;
				}
				
				if(matrix[i][j] != 0) {
					//check left of current node >> (i, j-1)
					//check top of current node >> (i-1, j)
					//check diagonal of current node >> (i-1, j-1)
					//And find minimum of all neighbor + 1(because its it self creating 1 x 1 matrix)
					
					matrix[i][j] += Math.min(matrix[i][j-1], Math.min(matrix[i-1][j], matrix[i-1][j-1]));
					result += matrix[i][j];  
				}
				
			}
		}
		
		return result;
		
	}
	
	
	/** Given a m * n matrix of ones and zeros, return max length square sub-matrices of all sub-matrices have all ones.
	 * @param matrix
	 * @return
	 */
	public static int countMaxSquares(int[][] matrix) {
		
//		result for summing up the number of square matrix at each element in matrix 
		int result = Integer.MIN_VALUE;
		int row = matrix.length;
		int column = matrix[0].length;
		
		if(matrix.length == 0) return 0;
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				
//				handling boundaries case i.e all the element from 1st row and 1st column
//				because for these elements no neighbor will present so either they can form 1 x 1 matrix or not  
				if(i == 0 || j ==0) {
					if(result < matrix[i][j])
						result = matrix[i][j]; 
					
					continue;
				}
				
				if(matrix[i][j] != 0) {
					//check left of current node >> (i, j-1)
					//check top of current node >> (i-1, j)
					//check diagonal of current node >> (i-1, j-1)
					//And find minimum of all neighbor + 1(because its it self creating 1 x 1 matrix)
					
					matrix[i][j] += Math.min(matrix[i][j-1], Math.min(matrix[i-1][j], matrix[i-1][j-1]));
					if(result < matrix[i][j])
						result = matrix[i][j];  
				}
				
			}
		}
		
		return result;
		
	}
	
	
	
	/**
	 * Sort Characters By Frequency Given a string, sort it in decreasing order
	 * based on the frequency of characters. Example 1:
	 * 
	 * Input: "tree"
	 * 
	 * Output: "eert"
	 * 
	 * Explanation: 'e' appears twice while 'r' and 't' both appear once. So 'e'
	 * must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
	 * 
	 * 
	 * Example 2:
	 * 
	 * Input: "cccaaa"
	 * 
	 * Output: "cccaaa"
	 * 
	 * Explanation: Both 'c' and 'a' appear three times, so "aaaccc" is also a valid
	 * answer. Note that "cacaca" is incorrect, as the same characters must be
	 * together. 
	 * 
	 * 
	 * Example 3:
	 * 
	 * Input: "Aabb"
	 * 
	 * Output: "bbAa"
	 * 
	 * Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect. Note
	 * that 'A' and 'a' are treated as two different characters.
	 * 
	 * 
	 * 
	 * @param s
	 * @return
	 * 
	 * 
	 * Using Hash table and in-build priority queue and passing the custom comparator to build max heap   
	 * 
	 * 
	 */
	public static String frequencySort(String s) {

		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}
		
		PriorityQueue<Character> maxPQ = new PriorityQueue<>((a,b) -> map.get(b)-map.get(a));
		maxPQ.addAll(map.keySet());
		
		StringBuilder sb = new StringBuilder();
		while(!maxPQ.isEmpty()) {
			char c = maxPQ.poll();
			
			for(int i = 0; i < map.get(c); i++) {
				sb.append(c);
			}
		}
		
		return sb.toString();
	}
	
	
	
	
	public static int[][] intervalIntersection(int[][] A, int[][] B) {

		List<int[]> resultList = new ArrayList<>();
		if (A.length <= 0 || B.length <= 0)
			return resultList.toArray(new int[0][0]);

//		int[] current_array = A[0];

		for (int[] array1 : A) {
			int array1Start = array1[0];
			int array1End = array1[1];

			for (int[] array2 : B) {
				int array2Start = array2[0];
				int array2End = array2[1];

				if (array2Start <= array1End) {
					if (array1Start <= array2End) {
						int[] temp = new int[2];
						temp[0] = Math.max(array1Start, array2Start);
						temp[1] = Math.min(array1End, array2End);
						resultList.add(temp);

					}
				} else {
					break;
				}

			}

		}
//		System.out.println(resultList);
		return resultList.toArray(new int[resultList.size()][2]);
	}
	
	

	/**
	 * 
	 * Interval List Intersections
	 * 
	 * 
	 * 
	 * Given two lists of closed intervals, each list of intervals is pairwise
	 * disjoint and in sorted order.
	 * 
	 * Return the intersection of these two interval lists.
	 * 
	 * (Formally, a closed interval [a, b] (with a <= b) denotes the set of real
	 * numbers x with a <= x <= b. The intersection of two closed intervals is a set
	 * of real numbers that is either empty, or can be represented as a closed
	 * interval. For example, the intersection of [1, 3] and [2, 4] is [2, 3].)
	 * 
	 * 
	 * @param A
	 * @param B
	 * @return
	 * 
	 *         Input: A = [[0,2],[5,10],[13,23],[24,25]], B =
	 *         [[1,5],[8,12],[15,24],[25,26]]
	 * 
	 *         Output: [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
	 *
	 *
	 *         Note:
	 * 
	 *         0 <= A.length < 1000 0 <= B.length < 1000 0 <= A[i].start, A[i].end,
	 *         B[i].start, B[i].end < 10^9
	 *
	 * 
	 * 
	 */
	public static int[][] intervalIntersectionOptimize(int[][] A, int[][] B) {
		
		List<int[]> resultList = new ArrayList<>();
		if (A.length <= 0 || B.length <= 0)
			return resultList.toArray(new int[0][0]);
		
		int a = 0;
		int b = 0;
		
		
		while (a < A.length && b < B.length) {
			
			int maxFirst = Math.max(A[a][0], B[b][0]);
			int minSecond  = Math.min(A[a][1], B[b][1]);
			
			if(maxFirst <= minSecond) {
				resultList.add(new int[] {maxFirst,minSecond});
			}
			if(B[b][1] >= A[a][1]) {
				a++;
			}
			else if(A[a][1] >= B[b][0]) {
				b++;
			}
			else {
				
				a++; b++;
			}
			
			
		}
		
		
		return  resultList.toArray(new int[resultList.size()][2]);
		
		
	}
	
	
	
	
	/**
	 * Uncrossed Lines
	 * 
	 * We write the integers of A and B (in the order they are given) on two
	 * separate horizontal lines.
	 * 
	 * Now, we may draw connecting lines: a straight line connecting two numbers
	 * A[i] and B[j] such that:
	 * 
	 * A[i] == B[j]; The line we draw does not intersect any other connecting
	 * (non-horizontal) line. Note that a connecting lines cannot intersect even at
	 * the endpoints: each number can only belong to one connecting line.
	 * 
	 * Return the maximum number of connecting lines we can draw in this way.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * 
	 * Input: A = [1,4,2], B = [1,2,4] Output: 2 Explanation: We can draw 2
	 * uncrossed lines as in the diagram. We cannot draw 3 uncrossed lines, because
	 * the line from A[1]=4 to B[2]=4 will intersect the line from A[2]=2 to B[1]=2.
	 * Example 2:
	 * 
	 * Input: A = [2,5,1,2,5], B = [10,5,2,1,5,2] Output: 3 Example 3:
	 * 
	 * Input: A = [1,3,7,1,7,5], B = [1,9,2,5,1] Output: 2
	 * 
	 * 
	 * Note:
	 * 
	 * 1 <= A.length <= 500 1 <= B.length <= 500 1 <= A[i], B[i] <= 2000
	 * 
	 * 
	 * 
	 * 
	 * Approach : Longest common sub sequence problem based on dynamic programming
	 * Because sub sequence never cross each other because its progressive way
	 * 
	 * 
	 * 
	 * example: A[] = 2, 5, 1, 2, 5 B[] = 10, 5, 2, 1, 5, 2
	 * 
	 * longest sub sequence are >> 5 1 2, 5 2 5, 2 5 2
	 * 
	 * 2 5 1 and 2 1 5 is not common sub sequence because order are different in
	 * both and its crossing with 5 1 and 1 5
	 * 
	 * 
	 * Initializing the dp[][] with one extra column and and extra row that contains
	 * 0,0 then looking at elements from A and B.
	 * 
	 * 1. if A[i] == b[i] means its creating a sub sequence so dp[i][j] = 1 + best
	 * we did excluding current match so diagonal one 2. if A[i] != b[i] so dp[i][j]
	 * = max of current left and current top
	 * 
	 * 
	 * @param A
	 * @param B
	 * @return
	 */
	public static int maxUncrossedLines(int[] A, int[] B) {

		int lengthA = A.length;
		int lengthB = B.length;
		int[][] dp = new int[lengthA + 1][lengthB + 1];

		for (int i = 1; i < lengthA + 1; i++) {
			for (int j = 1; j < lengthB + 1; j++) {
				if (A[i - 1] == B[j - 1]) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}

		return dp[lengthA][lengthB];
	}
	
	
	
	
	
	/**
	 * 
	 * Contiguous Array
	 * 
	 * 
	 * Given a binary array, find the maximum length of a contiguous subarray with
	 * equal number of 0 and 1.
	 * 
	 * Example 1: Input: [0,1] Output: 2 Explanation: [0, 1] is the longest
	 * contiguous subarray with equal number of 0 and 1. 
	 * 
	 * 
	 * Example 2: Input: [0,1,0]
	 * 
	 * Output: 2 Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray
	 * with equal number of 0 and 1. Note: The length of the given binary array will
	 * not exceed 50,000.
	 * 
	 * 
	 * Refer: https://leetcode.com/problems/contiguous-array/solution/
	 * 
	 * 
	 * @param nums
	 * @return
	 */
	public static int findMaxLength(int[] nums) {

		Map<Integer, Integer> countMemoization  = new HashMap<>();
		countMemoization.put(0, -1);
		int count = 0;
		int maxLengthArray = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 0)
				count--;
			else
				count++;
			
//			We start traversing the array from the beginning. If at any moment, the count becomes zero, it implies that we've encountered equal number of zeros and ones from the beginning till the current index of the array(i).
//			if(count==0)
//				maxLengthArray = Math.max(maxLengthArray, i+1); //i + 1 because zero based index example i 3 means sub-array of size 3+1=4 or use countMemoization(0,-1) count '0' at index -1
			
			if(countMemoization.containsKey(count)) {
				maxLengthArray = Math.max(maxLengthArray, i-countMemoization.get(count));
			}
			else
				countMemoization.put(count, i);
		}
		return maxLengthArray;
	}
	
	
	
	
	/**
	 * Possible Bipartition
	 * 
	 * 
	 * Given a set of N people (numbered 1, 2, ..., N), we would like to split
	 * everyone into two groups of any size.
	 * 
	 * Each person may dislike some other people, and they should not go into the
	 * same group.
	 * 
	 * Formally, if dislikes[i] = [a, b], it means it is not allowed to put the
	 * people numbered a and b into the same group.
	 * 
	 * Return true if and only if it is possible to split everyone into two groups
	 * in this way.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: N = 4, dislikes = [[1,2],[1,3],[2,4]] Output: true Explanation: group1
	 * [1,4], group2 [2,3] 
	 * 
	 * 
	 * Example 2:
	 * 
	 * Input: N = 3, dislikes = [[1,2],[1,3],[2,3]] Output: false 
	 * 
	 * 
	 * Example 3:
	 * 
	 * Input: N = 5, dislikes = [[1,2],[2,3],[3,4],[4,5],[1,5]] Output: false
	 * 
	 * 
	 * Note:
	 * 
	 * 1 <= N <= 2000 0 <= dislikes.length <= 10000 1 <= dislikes[i][j] <= N
	 * dislikes[i][0] < dislikes[i][1] There does not exist i != j for which
	 * dislikes[i] == dislikes[j].
	 * 
	 * 
	 * 
	 * 
	 * @param N
	 * @param dislikes
	 * @return
	 * 
	 * 
	 * Will solve this using Bipartition graph using BFS concept
	 * 
	 */
	public static boolean possibleBipartition(int N, int[][] dislikes) {

		List<Integer>[] graph = constructGraph(N, dislikes);

		return bfs(N, graph);
	}

	
	
	private static boolean bfs(int N, List<Integer>[] graph) {
		
		int[] colors = new int[N];  //default value 0 means unvisited Node of graph 1 = group1 and -1 = group2 
		for(int i = 0; i < N; i++) {
			if(colors[i] !=0)
				continue; // colors[i] !=0 means its already colored
			
			colors[i] = 1;
			Queue<Integer> queue = new LinkedList<>();
			queue.add(i);
			
			while(!queue.isEmpty()) {
				int currentVertex = queue.poll();
				
				List<Integer> adjsentVertices = graph[currentVertex];
				for(int adjVertex : adjsentVertices) {
					if(colors[adjVertex] == colors[currentVertex])
						return false;
					
					if(colors[adjVertex] ==0) {
						colors[adjVertex] = -colors[currentVertex];
						queue.add(adjVertex);
					}
						
				}
			}
		}
		
		
		return true;
	}

//	build graph with N vertices and edges
	private static List<Integer>[] constructGraph(int N, int[][] edges) {

		List<Integer>[] graph = new ArrayList[N];

		for (int i = 0; i < N; i++) {
			graph[i] = new ArrayList<>();
		}

		for (int[] edge : edges) {
			int u = edge[0] - 1; // -1 as its zero based if its [1,2] it will treat as [0,1]
			int v = edge[1] - 1;

//			Added bi-directional mapping as 1 dislike 2 so 2 also dislike 1,
			graph[u].add(v);
			graph[v].add(u);
		}

		return graph;
	}
	
	
	/**
	 * 
	 * Counting Bits
	 * 
	 * 
	 * Given a non negative integer number num. For every numbers i in the range 0 ≤
	 * i ≤ num calculate the number of 1's in their binary representation and return
	 * them as an array.
	 * 
	 * Example 1:
	 * 
	 * Input: 2 Output: [0,1,1] 
	 * 
	 * 
	 * Example 2:
	 * 
	 * Input: 5 Output: [0,1,1,2,1,2] Follow up:
	 * 
	 * It is very easy to come up with a solution with run time
	 * O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a
	 * single pass? Space complexity should be O(n). Can you do it like a boss? Do
	 * it without using any builtin function like __builtin_popcount in c++ or in
	 * any other language.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Solution odd even 1's count with Dynamic programming lookup Time complexity O(N)
	 * 
	 * 1 > 1 > 1 
	 * 2 > 10 > 1
	 * 3 > 11 > 2
	 * 4 > 100 > 1
	 * 5 > 101 > 2
	 * 6 > 110 > 2
	 * 7 > 111 > 3
	 * 8 > 1000 > 1
	 * 9 > 1001 > 2
	 * 10 > 1010 > 2
	 * 
	 * so for odd "i" the set bit is =  set bit of i/2 + 1 
	 * and for even "i" the set bit is = set bit of i/2 
	 * 
	 * 
	 * 
	 * 
	 * @param num
	 * @return
	 * 
	 * 
	 */
	public int[] countBits(int num) {

		int[] dp = new int[num+1]; // we are using this dp array for lookup previous value also as we processing further
		
		for(int i = 0; i <= num; i++) {
			if(i % 2 == 0) {
				dp[i] = dp[i/2]; 
			}
			else {
				dp[i] = dp[i/2]+1;
			}
		}
		
		return dp;
		
	}
	
	
	
	
	/**
	 * K Closest Points to Origin
	 * 
	 * 
	 * We have a list of points on the plane. Find the K closest points to the
	 * origin (0, 0).
	 * 
	 * (Here, the distance between two points on a plane is the Euclidean distance.)
	 * 
	 * You may return the answer in any order. The answer is guaranteed to be unique
	 * (except for the order that it is in.)
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: points = [[1,3],[-2,2]], K = 1 Output: [[-2,2]] Explanation: The
	 * distance between (1, 3) and the origin is sqrt(10). The distance between (-2,
	 * 2) and the origin is sqrt(8). Since sqrt(8) < sqrt(10), (-2, 2) is closer to
	 * the origin. We only want the closest K = 1 points from the origin, so the
	 * answer is just [[-2,2]].
	 * 
	 * 
	 * 
	 * Example 2:
	 * 
	 * Input: points = [[3,3],[5,-1],[-2,4]], K = 2 Output: [[3,3],[-2,4]] (The
	 * answer [[-2,4],[3,3]] would also be accepted.)
	 * 
	 * 
	 * 
	 * Note:
	 * 
	 * 1 <= K <= points.length <= 10000 -10000 < points[i][0] < 10000 -10000 <
	 * points[i][1] < 10000
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @param points
	 * @param K
	 * @return
	 */
	public int[][] kClosest(int[][] points, int K) {

		Map<Double, ArrayList<Integer>> pointTodistance = new HashMap<>();
		int[][] result = new int[K][2];
		
		for(int i = 0 ; i< points.length; i++) {
			double value  = Math.sqrt(points[i][0] * points[i][0] + points[i][1] * points[i][1]);
			
			if(pointTodistance.containsKey(value)) {
				ArrayList<Integer> pointList = pointTodistance.get(value);
				pointList.add(i);
				pointTodistance.put(value, pointList);
			}
			else {
				ArrayList<Integer> pointList = new ArrayList<>();
				pointList.add(i);
				pointTodistance.put(value, pointList);
			}
			
		}
		
		PriorityQueue<Double> minHeapPriority = new PriorityQueue<>();
		minHeapPriority.addAll(pointTodistance.keySet());
		
		int count = 0;
		while(!minHeapPriority.isEmpty() && count != K) {
			ArrayList<Integer> closestPointList = pointTodistance.get(minHeapPriority.poll());
			for(int point : closestPointList) {
				result[count++] = points[point]; 
			}
			
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	/**
	 * 
	 * Edit Distance
	 * 
	 * 
	 * Given two words word1 and word2, find the minimum number of operations
	 * required to convert word1 to word2.
	 * 
	 * You have the following 3 operations permitted on a word:
	 * 
	 * Insert a character Delete a character Replace a character 
	 * 
	 * Example 1:
	 * 
	 * Input: word1 = "horse", word2 = "ros" Output: 3 Explanation: horse -> rorse
	 * (replace 'h' with 'r') rorse -> rose (remove 'r') rose -> ros (remove 'e')
	 * 
	 * 
	 * 
	 * 
	 * Example 2:
	 * 
	 * Input: word1 = "intention", word2 = "execution" Output: 5 Explanation:
	 * intention -> inention (remove 't') inention -> enention (replace 'i' with
	 * 'e') enention -> exention (replace 'n' with 'x') exention -> exection
	 * (replace 'n' with 'c') exection -> execution (insert 'u')
	 * 
	 * 
	 * 
	 * Refer : https://www.youtube.com/watch?v=We3YDTzNXEk
	 * 
	 * 
	 * 
	 * @param word1
	 * @param word2
	 * @return
	 */
	public static int minDistance(String word1, String word2) {

		int word1L = word1.length();
		int word2L = word2.length();
		
		int[][] dp = new int[word2L+1][word1L+1];
		
		for(int i = 0; i < word1L+1; i++) {
			dp[0][i] = i;
		}
		
		for(int j = 0; j < word2L+1; j++) {
			dp[j][0] = j;
		}
		
		
		for(int i = 1; i < word2L+1; i++) {
			for(int j = 1; j < word1L+1; j++) {
				if(word2.charAt(i-1) == word1.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1];
				}
				else {
					dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i][j-1], dp[i-1][j]))+1;
				}
			}
		}
		
		return dp[word2L][word1L];
	}
	
	
}



