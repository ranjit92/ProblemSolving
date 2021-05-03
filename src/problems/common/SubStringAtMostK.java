package problems.common;
import java.util.HashMap;
import java.util.Map;

public class SubStringAtMostK {
	public static void main(String[] args) {
		int i = atMostK(new int[] {1,2,1,2,3}, 2);
	}

	static int atMostK(int[] A, int K) {
		int i = 0, res = 0;
		Map<Integer, Integer> count = new HashMap<>();
		for (int j = 0; j < A.length; ++j) {
			if (count.getOrDefault(A[j], 0) == 0)
				K--;
			count.put(A[j], count.getOrDefault(A[j], 0) + 1);
			while (K < 0) {
				count.put(A[i], count.get(A[i]) - 1);
				if (count.get(A[i]) == 0)
					K++;
				i++;
			}
			res += j - i + 1;
		}
		return res;
	}
}
