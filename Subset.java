package misc;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> mainList= new ArrayList();
        ArrayList<Integer> tempList = new ArrayList<Integer>();
         backTrack(tempList, mainList, nums, 0);
        System.out.println(mainList);
        return mainList;
    }


    public void backTrack(ArrayList<Integer> tempList,List<List<Integer>> mainList, int[] nums, int start ) {
    
        mainList.add(new ArrayList<>(tempList));
        System.out.println(mainList);

        for (int i=start ;i< nums.length; i++) {
        	System.out.println(" i == start ==" + i + " " + start);
        	if(i > start && nums[i] == nums[i-1]) continue; // skip duplicates
            tempList.add(nums[i]);
            backTrack(tempList,mainList, nums, i+1);
            System.out.println("i" + i);
            tempList.remove(tempList.size() -1);
            System.out.println("tempList" + tempList);
        }
        
    }
    
public static void main(String[] args) {
	Subset s= new Subset();
	int[] nums = new int[3];
	nums[0]=1;
	nums[1]=2;
	nums[2]=2;
	s.subsets(nums);
}
}
