package problems.common;

public class MissingNumber {

	public static void main(String[] args) {
		int i = getMissingNumber(new int[] {1, 2, 4, 6, 3, 7, 8,9,11,5});
		System.out.println(i);
	}
	public static int getMissingNumber(int[] arr) {
		
		int size = arr.length+1;
		int sum = size *(size+1)/2;
		
		for(int i =0; i < arr.length; i++) {
			sum -=arr[i];
		}
		return sum;
	}
}
