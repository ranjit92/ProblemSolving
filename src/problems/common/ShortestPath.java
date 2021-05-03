package problems.common;
import java.util.ArrayList;
import java.util.List;

//uncomplete
public class ShortestPath {

	
	public static void main(String[] args) {
		List<String> s = new ArrayList<>();
//		["hot","dot","dog","lot","log","cog"]
		s.add("hot");
		s.add("dot");
		s.add("dog");
		s.add("lot");
		s.add("log");
		s.add("cog");
		getPath("hot", "cog", s);
	}
	
	public static int getPath(String start, String end, List<String> list) {
		List<String> result = new ArrayList<>();
		
		
		
		List<String> differByOne = getAllDiff(start, list);
		differByOne.forEach(System.out::println);
		
		return 0;
	}
	
	public static List<String> getAllDiff(String s, List<String> list){
		List<String> result = new ArrayList<>();
		for(String s_ : list) {
			boolean b = checkScore(s, s_);
			if(b) result.add(s_);
		}
		return result;
	}
	
	
	public static boolean checkScore(String s1, String s2) {
		
		int[] freq  = new int[26];
		
		for(int i=0; i<s1.length(); i++) {
			int index = s1.charAt(i)-'a';
			freq[index]++;
			
		}
		
		for(int i=0; i<s2.length(); i++) {
			int index = s2.charAt(i)-'a';
			freq[index]--;
		}
		
		int sum =0;
		
		for(int i=0; i < 26; i++) {
			
			if(freq[i] >0)
				sum +=freq[i];
		}
		
		if(sum == 1) return true;
		return false;
	}
	
//	public int getWordSum(String s) {
//		int sum =0;
//		for(int i=0; i<s.length(); i++) {
//			sum += s.charAt(i);
//		}
//		return sum;
//	}
}
