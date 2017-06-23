package misc;

import java.util.ArrayList;
import java.util.HashMap;

public class twosum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
        
        for (int i =0;i< nums.length;i++) {
            hs.put(nums[i], i);
            
        }
        ArrayList<Integer> ob = new ArrayList<Integer>();
        ob.add(1);ob.add(2);ob.add(45);
        String[] st ={"2", "1", "+", "3", "*"};
        for (String s: st) {
        	System.out.println(s.charAt(0));
        }
        
        //Integer[] arr =  (Integer[])ob.toArray();
        Integer[] arr = ob.toArray(new Integer[0]);
        
        System.out.println(hs.size());
        for (int i =0;i< nums.length;i++) {
        	System.out.println(hs.keySet());
            if (hs.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = hs.get(target - nums[i]);
                break;
            }
            
            
        }
        
        return result;
        
        
        
        
        
        
    }
    
    public static void main(String[] args) {
    	twosum ts = new twosum();
    	int []nums = {2,4,8,9};
    	int[] result = new int[2];
    	result = ts.twoSum(nums, 12);
    	System.out.println(result[0]);
    	System.out.println(result[1]);
    }
}
