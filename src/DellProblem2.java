import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DellProblem2 {

//	mynameistest
//	mynaeist
	public static void main(String[] args) {
		
		
		String s = "mynameistest";
		Set<Character> set = new LinkedHashSet<>();
		
		for(int i=0; i<s.length(); i++) {
			set.add(s.charAt(i));
		}
		
		for(Character c: set) {
			System.out.print(c+"");
		}
		
		System.out.println("-------------------------------");
		
		
		
		int[] chararr = new int[26];
		
		for(int i=0; i<s.length(); i++) {
			chararr[s.charAt(i)-'a']++;
		}
		
		String st = "";
		for(int i=0; i<s.length(); i++) {
			int val = chararr[s.charAt(i)-'a'];
			if(val !=0 && val >= 1) {
				st = st + s.charAt(i);
				chararr[s.charAt(i)-'a'] = 0;
			}
		}
		
		System.out.println(st);
		
	}
}
