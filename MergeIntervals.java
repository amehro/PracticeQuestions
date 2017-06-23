package misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class hh {
    int start;
    int end;
    hh() { start = 0; end = 0; }
    hh(int s, int e) { start = s; end = e; }
}


// Given [1,3],[2,6],[8,10],[15,18],
//  [1,6],[8,10],[15,18]
public class MergeIntervals {
	public static void main(String[] args) {		
		List<hh> intervals= new ArrayList<hh>();
		hh x1 = new hh(0,2);
		hh x2 = new hh(1,4);
		hh x3 = new hh(3,15);		
		//hh x4 = new hh(15,18);
		intervals.add(x1);intervals.add(x2); intervals.add(x3); //intervals.add(x4);
        Collections.sort(intervals, new IntervalsSort());
        List<hh> listing = sortIntervalsStartTime(intervals);
        for (hh x: listing) {
        	System.out.println(x.start +  "    " + x.end);
        }
        
	}

    public static List<hh> sortIntervalsStartTime(List<hh> intervals) {
        
        
		
	List<hh> mergedInterval= new ArrayList<hh>();          
    
        int j=0;int i=0;
        hh newInterval = new hh();
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
   
        
        
            
         for (i =1; i< intervals.size();i++) {
        	 
         if(end > intervals.get(i).start) {
        	 end = Math.max(end, intervals.get(i).end);
        	 start = Math.min(start, intervals.get(i).start);

             
            
        } else {
        	mergedInterval.add(new hh(start,end) );
            end = intervals.get(i).end;
            start = intervals.get(i).start;
        }
        
            
            
        }//while end
            
         mergedInterval.add(new hh(start,end) );
         
       
       

 return mergedInterval; 
}
}



  


    






