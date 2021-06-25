import java.util.ArrayList;
import java.util.List;

public class Test2 {

	private static Test2 test2;
	
	private Test2(){
		
	}
	
	public static Test2 getInstance() {
		
		if(test2 == null) {
			synchronized (Test2.class) {
				if(test2 == null) {
					test2 = new Test2();
					return test2;
				}
			}
		}
		return test2;
	}
	
	
//	input: {16, 17, 4, 3, 5, 2}output: {17, 5, 2}
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		int[] in = new int[] {16, 17, 4, 3, 5, 2};
		int c = in[in.length-1];
		list.add(c);
		
		for(int i = in.length-2; i >=0 ; i--) {
			if(in[i] > c) {
				c = in[i];
				list.add(in[i]);
			}
		}
		
		list.forEach(System.out::println);
		
		
		//{2, 3, 10, 6, 4, 8, 1}
		
		int[] prices = new int[] {2, 3, 10, 6, 4, 1, 10, 6};
		
		int min = Integer.MAX_VALUE;
		int pro = 0;
		
		for(int i = 0; i < prices.length; i++) {
			min = Math.min(min, prices[i]);
			pro = Math.max(pro, prices[i]-min);
			
		}
		
		System.out.println("-----------------------");
		System.out.println(pro);
		
		
		
	}
	
}













