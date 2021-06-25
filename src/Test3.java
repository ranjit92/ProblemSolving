import java.util.Arrays;

public class Test3 {


	public static void main(String[] args) {
		int[][] arr = new int[][] {{1,3},{2,6},{8,10},{15,18},{3,7}};
		
		Arrays.sort(arr, (arr1, arr2) -> arr1[0] - arr2[0]);
		
		for(int i = 0; i < arr.length; i++) {
			
			int[] temp = arr[0];
			System.out.print("{"+arr[i][0] +" "+ arr[i][1] + "} ");
		}
	}
}
