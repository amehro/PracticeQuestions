package misc;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

//class Sorting implements Comparator<String> {
//
//	HashMap<String, Integer> map = new HashMap<String, Integer>();
//	
//	Sorting(HashMap<String, Integer> hm) {
//		// TODO Auto-generated constructor stub
//		this.map = hm;
//	}
//
//	
//	
//	
//	public int compare(String x,String y ) {
//		if (this.map.get(x) < this.map.get(y)) {
//			return 1;
//		} else {
//			return -1;
//		}
//		
//		
//	}
//}


class Sorting implements Comparator<String> {

	

	
	
	@Override
	public int compare(String obj1,String obj2 ) {
		 if (obj1 == obj2) {
		        return 0;
		    }
		    if (obj1 == null || obj2 == null) {
		        return -1;
		    }
		   
		    return obj1.compareTo(obj2);
		
		
	}




	
	
}
public class HotestKeywords {
	static HashMap<String, Integer> hm = new HashMap<String, Integer>();
  
	private static void makeMap(String[] words) {
		
		for (String x: words) {
			
			if (hm.containsKey(x)) {
				hm.put(x, hm.get(x) + 1);
			} else {
				hm.put(x, 1);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] words={"cat","cat","dog","pot","luck","lion","lion","lion","sheep","sheep","sheep","sheep"};
		makeMap(words);
		System.out.println(hm);
		Sorting ob = new Sorting();
		TreeMap tm = new TreeMap<>(ob);
		
		tm.putAll(hm);
		System.out.println(tm);
		
	}
}


