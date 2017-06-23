package misc;

import java.util.Arrays;
import java.util.Comparator;

public class meetingSchedule implements Comparator<Meeting> {
  
	  
	@Override
	public int compare(misc.Meeting m1, misc.Meeting m2) {
		// TODO Auto-generated method stub
		return m1.startTime - m2.startTime;
	}
	
	public static int findRooms(Meeting[] m) {
		int len = m.length;
		//System.out.println("hello" + len);
		int room = 0;
		
		for (int i = 0 ; i < len-1 ; i++) {
			Meeting prev = m[i];
			Meeting curr = m[i+1];			
			if (prev.endTime > curr.startTime ) {
				room++;
				
			}
			
		}
		return room;
		
	}
	


	public static void main(String[] args) {
		Meeting m1 = new Meeting (5,6);
		Meeting m2 = new Meeting(1,4);
		Meeting m3 = new Meeting(8,9);
		Meeting m4 = new Meeting(2,6);
		Meeting[] m = {m1,m2,m3,m4};	
		System.out.println("Before sorting: " + Arrays.toString(m));
		 
		Arrays.sort(m, new meetingSchedule());
		 
		System.out.println("After sorting: " + Arrays.toString(m));
		System.out.println(findRooms(m));
	}




	
		
	



	
	
}




