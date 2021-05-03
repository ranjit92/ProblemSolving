import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Asked in quicker

public class QuickerInterview {

	public static void main(String[] args) {
		String str = getSubStringInDictionary("hotdog", "hot, oh, xyz, ot, hot, def, og, tg, dog, go, tdog");
		System.out.println(str);
		
		List<Integer> r = getInterSection(new int[] {1, 3, 4, 7, 8, 13, 19},new int[] {1, 2, 4, 8, 13, 15, 19});
		r.forEach(System.out::println);
	}

	// Input: ["hotdog","ho, oh, xyz, ot, hot, def, og, tg, dog, go, tdog"]
	// Success Output: "hot,dog" , 
	// False case output: not possible"
	public static String getSubStringInDictionary(String word, String dis) {
		String[] distArray = dis.split(", ");
		Set<String> set = new HashSet<>();

		for (int i = 0; i < distArray.length; i++) {
			set.add(distArray[i]);
		}

		int length = word.length();
		for (int i = 0; i < length; i++) {
			String sub1 = word.substring(0, i + 1);
			String sub2 = word.substring(i + 1, length);
			if (set.contains(sub1) && set.contains(sub2)) {
				return sub1 + "," + sub2;
			}
		}
		return "Not Possible";

	}

	// Input is 2 arrays ["1, 3, 4, 7, 13", "1, 2, 4, 13, 15, 16, 18"] both the arrays are
	// sorted
	// Output : Intersection : [1,4,13] common element
	public static List<Integer> getInterSection(int[] a, int[] b) {
		List<Integer> list = new ArrayList<>();
		int p1 = 0;
		int p2 = 0;

		int l1 = a.length;
		int l2 = b.length;

		while (p1 < l1 && p2 < l2) {
			if (a[p1] == b[p2]) {
				list.add(a[p1]);
				p1++;
				p2++;
			}
			else if (a[p1] > b[p2]) {
				p2++;
			} else {
				p1++;
			}
		}
		return list;
	}

}
