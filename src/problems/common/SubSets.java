package problems.common;
import java.util.ArrayList;
import java.util.List;

public class SubSets {
	
	public static void main(String[] args) {
		subsetsWithDup(new int[] {1,2,3});
	}

	public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> collect = new ArrayList<>();
        
        subsetsWithDupHelper(result, collect, nums, 0);
        return result;
    }
    
    public static void subsetsWithDupHelper(List<List<Integer>> result, List<Integer> collect, int[] nums, int start){
        
        result.add(new ArrayList(collect));
        
        for(int i = start; i < nums.length; i++){
            //if(i > start && nums[i] == nums[i-1]) continue;
            collect.add(nums[i]);
            subsetsWithDupHelper(result, collect, nums, i+1);
            collect.remove(collect.size()-1);
        }
    }
}
