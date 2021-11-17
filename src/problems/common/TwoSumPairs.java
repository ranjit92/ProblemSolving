package problems.common;

import java.util.Arrays;

public class TwoSumPairs {

	public static void main(String[] args) {
		int[] arr = new int[] {3,4,5,8,1,2,6};
		int target = 7;
		
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length-1;
		
		while(start < end) {
			int curr = arr[start] + arr[end];
			if(curr == target) {
				System.out.println(arr[start] +" "+ arr[end]);
				
				start++;
				end--;
			}
			else if(curr > target) {
				end--;
			}
			else {
				start++;
			}
		}
	}
}
