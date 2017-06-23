package misc;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MeetingPlanner  {	
	
	protected int start;
	
	

	


	
public static void main(String[] args) {
	int[][] arrA = {
			{5,50},
			{20,10},
			{3,30},
			
	};
	int[][] arrB = {
			{4,50},
			{1,10},
			{3,30},
			
	};
	
	
	HashMap<String,Integer> m = new HashMap<String,Integer>();
	m.put("ad",2);
	m.put("addsd", 56);
	m.put("dsrrds", 434);
	Set<String> x = m.keySet();
	

	
	 Comparator<int[]> MeetingCompaartor  = new Comparator<int[]> () {



	@Override
	public int compare(int arr1[], int arr2[]) {
			int start1= arr1[0];
			int start2= arr2[0];
			return start2- start1;
	 }

	};
	//System.out.println("dsfksjdhfkjdshf");
	Arrays.sort(arrA[0]);
	Arrays.sort(arrA, MeetingCompaartor);
	Arrays.sort(arrB, MeetingCompaartor);
	int[] a = {23,543,554};
	
	Arrays.sort(a);
	for (int i =0; i< arrA.length;i++) {
		for (int j=0;j< arrB[0].length;j++) {
			System.out.print(arrA[i][j] + "   ");
		}
		System.out.println();
	}
	
	
	
}


	/*963.
	 * 
	 */
}


