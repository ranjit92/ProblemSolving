
public class NegativeAndPositive {

	public static void main(String[] args) {
		int[] arr = {-1,7,4,-6,2};
		
		int pivot = 0;
		int pIndex = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] < pivot) {
				swap(i, pIndex, arr);
				pIndex++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void swap(int a, int b, int[] arr) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	
}
