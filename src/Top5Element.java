import java.util.PriorityQueue;

public class Top5Element {

	public static void main(String[] args) {
		int[] arr = new int[] {3,7,2,6,9,10,23,-1};
		
		
		PriorityQueue<Integer>  pq = new PriorityQueue<>((a,b) -> b-a);
		
		for(int i=0; i<arr.length; i++) {
			pq.add(arr[i]);
		}
		int i = 0;
		while(i < 5) {
			System.out.println(pq.poll());
			i++;
		}
	}
}
