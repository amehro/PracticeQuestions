package misc;

import java.util.PriorityQueue;

public class kkargest {
	public static int findKthLargest(int[] nums, int k) {

	    final PriorityQueue<Integer> pq = new PriorityQueue<>();
	    for(int val : nums) {
	    	System.out.println("value is  " + val);
	        pq.offer(val);

	        if(pq.size() > k) {
	        	System.out.println("pooling out  " + pq.peek());
	            pq.poll();
	        }
	    }
	    return pq.peek();
	}
	
	public static void main(String[] args) {
		int nums[] = {35,1,12,9,8,48};
		System.out.println(findKthLargest(nums , 4));
	}
}
