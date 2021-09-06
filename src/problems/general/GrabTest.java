package problems.general;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GrabTest {
	public static void main(String[] args) {
		int[] arr = new int[]{2,8,1,7,5,4,3,6};
		GrabTest obj = new GrabTest();
		Set<List<Integer>> set = obj.sum(arr, 10);
		
		for(List<Integer> arr_ : set) {
			System.out.println(arr_.get(0)+" "+arr_.get(1));
		}
		
	}
	
	public Set<List<Integer>> sum(int[] arr, int target){
		Set<List<Integer>> result  = new HashSet<>();
		
			for(int i= 0; i < arr.length; i++){
				int targetin = target;
				Map<Integer, Integer> map = new HashMap<>();
				targetin = targetin-arr[i];
				int curr = arr[i];
				for(int j =i+1; j < arr.length; j++){
					if(map.containsKey(targetin)){
						result.add(Arrays.asList(curr,targetin));
						break;
					}
					else{
						if(arr[j] == targetin) {
							result.add(Arrays.asList(arr[j],curr));
						} 
						map.put(arr[j], j);
					}
				
				}
			
			}
			return result;
		}

}
