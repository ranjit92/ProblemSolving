package problems.common;

//Remove minimum number of characters so that two strings become anagram
public class RemoveCharToBecomeAnagram {
	public static void main(String[] args) {
		int r = minRemove("bcadeh", "hea");
		System.out.println(r);
	}

	public static int minRemove(String str1, String str2) {

		int[] charArr = new int[26];
		int result = 0;

		for (int i = 0; i < str1.length(); i++) {
			int index = str1.charAt(i) - 'a';
			charArr[index]++;
		}
		for (int i = 0; i < str2.length(); i++) {
			int index = str2.charAt(i) - 'a';
			charArr[index]--;
		}

		for (int i = 0; i < 26; i++) {
			
			
			result += Math.abs(charArr[i]);
		}
		return result;
	}
}
