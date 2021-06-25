package problems.common;

public class MoveAllNegativeAndPositive {

	public static void main(String[] args) {
		
		int[] arr = new int[] { 2, 5, -1, 6, 3, -5, 4, -2}; 
		int pivot = 0;
		int pIndex = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < pivot) {
				swap(i, pIndex, arr);
				pIndex++;
			}
		}
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
	}

	private static void swap(int i, int pIndex, int[] arr) {
		int temp = arr[pIndex];
		arr[pIndex] = arr[i];
		arr[i] = temp;
	}
}
