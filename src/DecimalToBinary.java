import java.util.ArrayList;
import java.util.List;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		int decimal = -20;
		List<Integer> binary = new ArrayList<>();
		List<Integer> ones = new ArrayList<>();
		
		int converted = Math.abs(decimal);
		
		while(converted > 0) {
			binary.add(converted % 2);
			converted = converted/2;
		}
		
		if(decimal < 0) {
			for(int i=0; i < binary.size(); i++) {
				if(binary.get(i) == 1) {
					ones.add(0);
				}
				else {
					ones.add(1);
				}
			}
			
			StringBuilder sb = new StringBuilder();
			int carry = 0;
			int add = 1;
			for(int i = binary.size()-1; i >=0 ; i--) {
				
				if(i == 0 && binary.get(i) == 1 && ones.get(i) == 1) {
					//sb.append()
				}
				
			}
			
			
		}
		
		
		binary.forEach(System.out::println);
		
		System.out.println("-------------------------------------");
		int [][] arr = {{1,2,3}, {4,5,6}, {7,8,5}};
		
		System.out.println(diff2(arr));
		
	}
	
	
	public static int diff(int[][] grid) {
		int sum1 = 0;
		int sum2 = 0;
		
		int len = grid.length;
		for(int i=0; i < len; i++) {
			for(int j=0; j < len; j++) {
				
				if(i==j) {
					sum1 += grid[i][j];
				}
				
				if(i+j == len-1) {
					sum2 += grid[i][j];
				}
			}
		}
		return Math.abs(sum1-sum2);
		
	}
	
	
	public static int diff2(int[][] grid) {
		int sum1 = 0;
		int sum2 = 0;
		
		int len = grid.length;
		for(int i=0; i < len; i++) {
			sum1 += grid[i][i];
			sum2 += grid[i][len-i-1];

		}
		return Math.abs(sum1-sum2);
		
	}
	
}
