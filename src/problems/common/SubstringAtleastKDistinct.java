package problems.common;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ranjit
 *Count number of substrings having at least K distinct characters
 */
public class SubstringAtleastKDistinct {
	
	public static void main(String[] args) {
		int i =subStringAtleastKDistinct("abcca", 4);
		System.out.println(i);
	}

	public static int subStringAtleastKDistinct(String s, int k) {

		int index = 0;
		Map<Character, Integer> map = new HashMap<>();
		int end = 0;
		int result = 0;

		while (end < s.length()) {

			map.put(s.charAt(end), map.getOrDefault(s.charAt(end), 0) + 1);

			end++;

			if (map.size() >= k) {

				while (map.size() >= k) {
					map.put(s.charAt(index), map.get(s.charAt(index)) - 1);

					if (map.get(s.charAt(index)) == 0) {
						map.remove(s.charAt(index));
					}

					index++;
					result += s.length() - end+1;
				}

			}
		}
		return result;
	}
}
