package misc;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

class Interval {
	      int start;
	      int end;
	      Interval() { start = 0; end = 0; }
	      Interval(int s, int e) { start = s; end = e; }
	  }
	 
	 class mergeInterval {
		public List<mergeInterval> insert(List<Interval> intervals, Interval newInterval) {
	    List<mergeInterval> result = new LinkedList<>();
	    int i = 0;
	    // add all the intervals ending before newInterval starts
	    while (i < intervals.size() && intervals.get(i).end < newInterval.start)
	        result.addAll((Collection<? extends mergeInterval>) intervals.get(i++));
	    // merge all overlapping intervals to one considering newInterval
	    while (i < intervals.size() && intervals.get(i).start <= newInterval.end) {
	    	newInterval = new Interval( // we could mutate newInterval here also
	                Math.min(newInterval.start, intervals.get(i).start),
	                Math.max(newInterval.end, intervals.get(i).end));
	        //result.add(newInterval);
	        i++;
	    }
	   
	    result.addAll((Collection<? extends mergeInterval>) newInterval); // add the union of intervals we got
	    // add all the rest
	    while (i < intervals.size()) result.addAll((Collection<? extends mergeInterval>) intervals.get(i++)); 
	    return result;
	 }
		
		public static void main(String[] args) {
			Interval s = new Interval();
			s.start =4;
			s.end=9;
			Interval ob = new Interval();
			ob.start = 1;
			ob.end = 2;
			ob.start =8;
			ob.end = 10;
			List<Interval> list =   new LinkedList<>();			 
			list.add(ob);
			System.out.println(list.size());
			
			
			
			
		}
	}
	 

