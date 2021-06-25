package problems.common;


/**
 * question from freshworks
 * quest
 * @author ranjit
 *
 */
public class First3MinFromArray {

	public static void main(String[] args) {
		int[] arr = new int[] {2,4,1,7,3,5,9,8,0};
		
		int firstMin = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		int thirdMin = Integer.MAX_VALUE;
		
		
		for(int i=0; i< arr.length; i++) {
			if(arr[i] < firstMin) {
				thirdMin = secondMin;
				secondMin = firstMin;
				firstMin = arr[i];
			}
			
			else if(arr[i] < secondMin) {
				thirdMin = secondMin;
				secondMin = arr[i];
			}
			
			else if(arr[i] < thirdMin) {
				thirdMin = arr[i];
			}
		}
		
		System.out.println(firstMin+" "+secondMin+" "+thirdMin);
		
	}
}
