package misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;


//csutomesort function from hackerrank
//The function sorts the array elments in ascending order of frequency.
//If two elements have the same frequency then elemnt with lower value is printed first

public class ArrayCustomSort {

	private static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	public static int[] customSort(int[] nums) {
		
		
			for (int i=0; i< nums.length; i++) {
				if (map.containsKey(nums[i])) {
					int x = map.get(nums[i]) +1;
					map.put(nums[i], x);
					
				} else {
					map.put(nums[i],  1);
				}
			}		
		
		   List<Integer> list = new ArrayList<Integer>(map.keySet());		
		
			Comparator<Integer> cmp = new Comparator<Integer>() {	

				@Override
				public int compare(Integer x, Integer y) {
					if (map.get(x) != map.get(y)) {
						return map.get(x) - map.get(y);
					} else {
						return x -y;
					}
				}		
				
			};
			
		
	    Collections.sort(list, cmp);
	    
	    Integer[] integerArray = list.toArray(new Integer[0]);
	    List<Integer> list1 = new ArrayList<Integer>();
	   
	    
	    for (int i =0; i< integerArray.length; i++) {
	    	for (int j =0; j< map.get(integerArray[i]); j++) {
	    		list1.add(integerArray[i]);
	    		
	    	}
	    }
	    
	    Integer[] integerArray1 = list1.toArray(new Integer[0]);
	    int[] x = new int[list1.size()];
	    for (int i =0; i< integerArray1.length; i++) {
	    	x[i] = integerArray1[i];
	    }
		return x;
	}
	public static void main(String[] args) {
		int[] num = {5,8,9,10,8,8,8, 9};
		int[] arr = customSort(num);
		for (int i =0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}

