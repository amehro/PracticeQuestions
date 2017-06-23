package misc;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
	
	public static List missRange(int[] arr) {
		List<String> res = new ArrayList<String>();
		int high=0;
		int low=0;
		for (int i=0; i< arr.length; i++) {
			System.out.println(res);
			if ((arr[i+1] - arr[i]) == 1) {
				continue;
			} else {
				if (arr[i]== arr.length-1)
					 {   high = 99;
					 } else {
						high = arr[i+1] -1;
					}
				
				low = arr[i] +1;
				if (high ==low) {	
					
					res.add(String.valueOf(high));
				} else {
					res.add(low + "->" + high);
				}
			}
		}
		return res;
	}

	
	
	public static void main(String[] args) {
		System.out.println(missRange(new int[]{1,2, 4,45,98}));
	}
}
