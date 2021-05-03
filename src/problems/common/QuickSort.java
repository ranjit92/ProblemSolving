package problems.common;
import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = new int[] {7,2,1,6,8,5,3,4};
		//partation(arr, 0, 7);
		quicksort(arr, 0, 7);
		Arrays.stream(arr).forEach(System.out::println);
	}
	
	
	public static void quicksort(int[] arr, int start, int end) {
		
		if(start < end) {
			int pindex = partation(arr, start, end);
			quicksort(arr, start, pindex-1);
			quicksort(arr, pindex+1, end);
		}
	}
	
	public static int partation(int[] arr, int start, int end) {
		
		int pivot = arr[end];
		int pindex = start;
		
		for(int i = start; i < end; i++) {
			if(arr[i] < pivot) {
				swap(i, pindex, arr);
				pindex++;
			}
		}
		swap(pindex, end, arr);
		return pindex;
	}
	
	public static void swap(int a, int b, int[] arr) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
