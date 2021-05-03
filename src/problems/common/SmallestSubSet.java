package problems.common;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ranjit
 *
 *         Given an array arr[] consisting of N integers, the task is to print
 *         the smaller of the two subsets obtained by splitting the array into
 *         two subsets such that the sum of the smaller subset is maximized.
 */
public class SmallestSubSet {
	
	public static void main(String[] args) {
		List<Integer> list  = findSubSet(new int[] {5, 3, 2, 4, 1, 2});
		if (list !=null){
			list.forEach(System.out::println);
		}
	}

	public static List<Integer> findSubSet(int[] arr) {
		List<Integer> result = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		int sumOfSmallerSubset = 0;
		int sum = 0;
		int arrLength = arr.length;

		for (int i = 0; i < arrLength; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			sum += arr[i];
		}

		Arrays.sort(arr);
		int i = arrLength - 1;
		while (i >= 0) {
			int freq = map.get(arr[i]);
			int sizeIfAdded = freq + result.size();
			int reaming = arrLength - sizeIfAdded;

			// check the current list size less then remaining because it should be smaller
			// than other subset
			if (sizeIfAdded < reaming) {
				for(int k = 0; k <freq; k++) {
					result.add(arr[i]);
					sumOfSmallerSubset += arr[i];
					sum -=arr[i];
				}
				i--;
			}
			else {
				i = i-freq;
			}
			
		}
		
		if(sumOfSmallerSubset > sum) {
			return result;
		}

		return null;
	}

}
