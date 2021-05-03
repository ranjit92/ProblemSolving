package problems.common;
import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {
	public static void main(String[] args) {
		List<Integer> list = getDuplicate(new int[] {4,3,2,7,8,2,3,1});
		list.forEach(System.out::println);
	}

	public static List<Integer> getDuplicate(int[] arr){
		List<Integer> list = new ArrayList<>();
		int length = arr.length;
		for(int i = 0; i < arr.length; i++) {
			
			arr[arr[i] % length] = arr[arr[i] % length] + arr.length;
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= length *2) {
				list.add(i); // index "i" appears more than twise in original array;
			}
		}
		return list;
	}
}
