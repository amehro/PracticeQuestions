package misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationDuplicates {
	public List<List<Integer>> permuteUnique(int[] nums) {
	    List<List<Integer>> list = new ArrayList<>();
	    Arrays.sort(nums);
	    backtrack(list, new ArrayList<>(), nums, new boolean[nums.length]);
	    return list;
	}

	private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, boolean [] used){
	    if(tempList.size() == nums.length){
	        list.add(new ArrayList<>(tempList));
	        
	    } else{
	        for(int i = 0; i < nums.length; i++){
	            if(used[i]) continue;
	            		if (i > 0 && nums[i] == nums[i-1] && used[i - 1] == false) continue;
	            if (i>0)
	            { System.out.println("used[i-1]" + used[i-1]);}
	            used[i] = true;
	            
	            tempList.add(nums[i]);
	            System.out.println("templist =" + tempList);
	            backtrack(list, tempList, nums, used);
	            System.out.println(tempList);
	            System.out.println("i =" + i);
	            used[i] = false; 
	            tempList.remove(tempList.size() - 1);
	            System.out.println("used[ =" + i + "]" + "=" + " ");
	            System.out.print(used[i]);
	        }
	    }
	}
	
	public static void main(String[] args) {
		PermutationDuplicates s= new PermutationDuplicates();
		int[] nums = new int[3];
		nums[0]=1;
		nums[1]=1;
		nums[2]=2;
		s.permuteUnique(nums);
	}
}
