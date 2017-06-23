package misc;

import java.util.ArrayList;

public class StairsRecursion {
	public int countStairs(int x, int y) {
		
		
		if (x == y){
			return 1;
			
		}
		if (x > y) {
			return 0;
		}
		
		
		int tot = countStairs(x+1, y) + countStairs(x+2, y) + countStairs(x+3, y);
		//System.out.println(tot);
		return tot;
		
		
	}
	
	public static void main(String[] args) {
		StairsRecursion ob = new StairsRecursion();
		System.out.println(ob.countStairs(1, 3));
	}
}
