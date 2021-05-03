package problems.common;

//Number of substrings with count of each character as k
public class SubStringCountEachK {
	
	
	public static void main(String[] args) {
		int count = subStringWithEachCountK("aabbcc", 2);
		System.out.println(count);
	}

	public static int subStringWithEachCountK(String s, int k) {
		int count =0;
		
		for(int i=0; i<s.length(); i++) {
			int[] charArr = new int[26];
			
			for(int j=i; j<s.length(); j++) {
				
				int index = s.charAt(j)-'a';
				charArr[index]++;
				
				if(charArr[index] > k) break;
				if(charArr[index] == k && check(charArr, k)) {
					count++;
				}
				
			}
		}
		
		return count;
		
	}

	private static boolean check(int[] charArr, int k) {
		for(int i=0; i<26; i++) {
			if(charArr[i] > 0 && charArr[i] !=k) return false;
		}
		return true;
	} 
}
