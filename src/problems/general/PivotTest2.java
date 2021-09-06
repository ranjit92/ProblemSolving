package problems.general;

public class PivotTest2 {

	public static void main(String[] args) {
		int[] nums = new int[] {5,7,7,8,8,10};
		int target = 8;
		
		PivotTest2 ob  = new PivotTest2();
		  int[] r = new int[2];
	        r[0] = ob.searchForLeft(nums, target);
	        r[1] = ob.searchForRight(nums, target);
	       System.out.println(r[0] +" "+ r[1]);
	}
	
	
	 public int searchForLeft(int[] nums, int target){
         
	       
	        int low = 0;
	        int high = nums.length-1;
	       int id = -1;
	        
	        while(low <= high){
	            int mid = low + ((high - low)/2);
	            
	            if(nums[mid] == target){
	               id = mid;        
	            }
	            if(target <= nums[mid]){
	                high = mid - 1;
	            }
	            else{
	                low = mid+1;
	            }
	            
	            
	        }
	        return id;
	        
	    }
	    
	    
	    
	    
	   

	public int searchForRight(int[] nums, int target){
	         
	       
	       int low = 0;
	       int high = nums.length-1;
	       int id = -1;
	        
	        while(low <= high){
	            int mid = low + ((high - low)/2);
	            
	            if(nums[mid] == target){
	               id = mid;        
	            }
	            if(target >= nums[mid]){
	                low = mid + 1;
	            }
	            else{
	                high = mid - 1;
	            }
	            
	            
	        }
	        return id;
	        
	    }
}
