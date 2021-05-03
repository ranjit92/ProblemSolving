import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ranjit
 * 
 *         Sherlock and the Valid String
 * 
 * 
 *         https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 *         https://www.youtube.com/watch?v=G5aK5CuvnSk
 */
public class ValidString {
	public static void main(String[] args) throws IOException {
		String str = isValid("aabbccddeefghi");
		System.out.println(str);
	}

	public static String isValid(String s) {
		// Write your code here
		Map<Character, Integer> map = new HashMap<>();
		Map<Integer, Integer> freq = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}
		System.out.println(map);
		for (int value : map.values()) {
			freq.put(value, freq.getOrDefault(value, 0) + 1);
		}
		System.out.println(freq);

		// cases
		// case1
		if (freq.size() == 1)
			return "YES";
		else if (freq.size() > 2)
			return "NO";

		int min = 0;
		int max = 0;
		int[] arr = new int[2];
		int index = 0;
		for (int i : freq.keySet()) {
			arr[index++] = i;
		}
		if (arr[0] > arr[1]) {
			min = arr[1];
			max = arr[0];
		} else {
			min = arr[0];
			max = arr[1];
		}

		if (min == 1 && freq.get(min) == 1)
			return "YES";
		if (max - min == 1 && freq.get(max) == 1)
			return "YES";

		return "NO";
	}
}
