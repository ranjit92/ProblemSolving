package problems.common;

import java.util.PriorityQueue;

public class TopKElement {

    public static void main(String[] args) {
        int[] arr = new int[]{3,5,6,7,8,9,1,2};
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) ->o2-o1);

        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        for(int i=0; i<arr.length; i++){
         System.out.println(pq.poll());
        }
    }
}
