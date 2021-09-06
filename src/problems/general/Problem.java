package problems.general;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem {

	// 0  1  2  3  4  5  6  7
	// 10 30 50 30 50 60 70 50
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		int count = 4;
		int start = 0;
		int end = 0;
		
		Set<Integer> ele = new HashSet<>();
		while(end < list.size()) {
			
			if(end - start == count-1) {
				
				System.out.println(ele.size());
				for(Integer i: ele) {
					ele.remove(i);
					break;
				}
				start++;
				end++;
				
			}
			else {
				ele.add(end);
				end++;
			}
			
			
		}
		
	}
	
	
}
