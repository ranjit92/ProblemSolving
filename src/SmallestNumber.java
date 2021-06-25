import java.util.HashSet;
import java.util.Set;

public class SmallestNumber {

	public static void main(String[] args) {
		
		
		int[] arr = new int[] {5,4,9,6,10};
		Set<Integer> set = new HashSet<>();
		int s = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(s > arr[i]) {
				s = arr[i];
			}
		}
		set.add(s);
		System.out.println(s);
	}
	
}
