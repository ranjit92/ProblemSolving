package problems.common;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ranjit
 *Asked in Palo alto.
 *
 *index k is named as fair if four sub array sum are equal. 
 *(A[0]+...+A[k-1]), (A[k]+...+A[n-1]), (B[0]+...+B[k-1]), (B[k]+...+B[n-1])
 *Note: Arrays are not sorted. 
 */
public class GetPointK {
	public static void main(String[] args) {
		int a = solution(new int[] { 2, -2, -3, 3 }, new int[] { 0, 0, 4, -4 });
		System.out.println(a);
	}

	public static int solution(int[] A, int[] B) {
		// write your code in Java SE 8

		int[] suma = new int[A.length];
		int[] sumb = new int[B.length];
		

		Set<Integer> list = new HashSet<>();
		int k = -1;

		suma[0] = A[0];
		for (int i = 1; i < A.length; i++) {
			suma[i] = suma[i - 1] + A[i];
		}

		sumb[0] = B[0];
		for (int i = 1; i < B.length; i++) {
			sumb[i] = sumb[i - 1] + B[i];
		}

		for (int i = 0; i < suma.length; i++) {
			int lsum = (i == 0) ? 0 : suma[i - 1];
			int rsum = (i == 0) ? suma[A.length - 1] : suma[A.length - 1] - suma[i - 1];

			if (lsum == rsum) {
				list.add(i);
			}
		}

		for (int i = 0; i < sumb.length; i++) {
			int lsum = (i == 0) ? 0 : sumb[i - 1];
			int rsum = (i == 0) ? sumb[A.length - 1] : sumb[A.length - 1] - sumb[i - 1];

			if (lsum == rsum && list.contains(i)) {
				k = i;
				break;
			}
		}

		return k;

	}
}
