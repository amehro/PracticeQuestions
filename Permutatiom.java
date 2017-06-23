package misc;

import java.util.ArrayList;
import java.util.List;

public class Permutatiom {
	public static List<List<Integer>> permute(int[] nums) {
		   List<List<Integer>> list = new ArrayList<>();
		   // Arrays.sort(nums); // not necessary
		   backtrack(list, new ArrayList<>(), nums);
		   System.out.println(list);
		   return list;
		}

		private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
		   if(tempList.size() == nums.length){
		      list.add(new ArrayList<>(tempList));
		      return;
		   } else{
		      for(int i = 0; i < nums.length; i++){ 
		         if(tempList.contains(nums[i])) continue; // element already exists, skip
		         tempList.add(nums[i]);
		         System.out.println(tempList);
		         backtrack(list, tempList, nums);
		         tempList.remove(tempList.size() - 1);
		         System.out.println("after backtrack" + tempList);
		         System.out.println("value of i" + i);
		      }
		   }
		}
		
		public static void main(String[] args) {
			int[] arr = new int[3];
			arr[0]=1;
			arr[1]=2;
			arr[2]=3;
			permute(arr);
		}
}
