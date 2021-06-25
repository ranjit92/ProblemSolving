package problems.common;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class VimeoInterview {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 4, 1, 4, 4 };
		int stairs = 6;

		for (int i = 0; i < arr.length; i++) {
			int j = Math.abs(arr[i]);
			if (arr[j] > 0) {
				arr[j] = -arr[j];
			} else {
				System.out.println(j);
				break;
			}

		}
		
		System.out.println("------------------------------------------");
		
		
		int[] arr2 = new int[stairs+1];
		arr2[0] = 1;
		arr2[1] = 1;
		arr2[2] = 2;
		
		for(int i = 3; i<=stairs; i++) {
			arr2[i] = arr2[i-1] + arr2[i-2] + arr2[i-3];
		}
		System.out.println(arr2[stairs]);
		
		//1 2 3 
		//10, 1 2 3 4 5 6 7 8 9 10
		//6 , 1 2 3 4 5 6 
		//{1, 1, 1, 1, 1, 1}, {1, 1, 1, ,1 }
		List<List<Integer>> list = new ArrayList<>();
		int end = stairs + 1;
		List<Integer> arr3 = IntStream.range(1, 4).boxed().collect(Collectors.toList());
		
		List<Integer> inline = new ArrayList<>();
		
		helper(list, arr3, inline, stairs, 0);
		
		System.out.println(list.size());
		
		for(List<Integer> listEach : list) {
			for(int i : listEach) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		

	}
	
	
	public static void helper(List<List<Integer>> list, List<Integer> arr3, List<Integer> inline, int target, int start) {
		
		if(target == 0) {
			list.add(new ArrayList<>(inline));
			return;
		}
		
		for(int i = start; i < arr3.size(); i++) {
			
			if(arr3.get(i) > target) {
				break;
			}
			
			inline.add(arr3.get(i));
			helper(list, arr3, inline, target-arr3.get(i), i);
			inline.remove(inline.size()-1);
		}
	}  
	
	
	
	
	
	
}
