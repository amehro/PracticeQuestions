package misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSorting{
    int x;
    int y;
    HashMap<String, Integer> hm = new HashMap<String,Integer>();
    
    public HashMapSorting(HashMap h) {
    	this.hm = h;
    }
    
	

//	@Override
//	public int compare(K o1, K o2) {
//		return hm.get(o1) - hm.get(o2);		
//	}
	
	


	
	
	//Read more: http://www.java67.com/2015/01/how-to-sort-hashmap-in-java-based-on.html#ixzz4dQ7FABaV
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		hm.put("2",3);
		hm.put("45", 3232);
		hm.put("23772", 39);
		hm.put("232", 1239);
		//Set<Entry<String, Integer>> tx = hm.entrySet()
				 Set<Entry<String, Integer>> entries = hm.entrySet();
				 List<Entry<String, Integer>> listOfEntries = new ArrayList<Entry<String, Integer>>(entries); // sorting HashMap by values using comparator Collections.sort(listOfEntries, valueComparator);

				 
				 Comparator<Entry<String, Integer>> valueComparator = new Comparator<Entry<String,Integer>>() {
		        		@Override public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) 
		        		{ Integer v1 = e1.getValue(); 
		        		  Integer v2 = e2.getValue(); 
		        		  return v1.compareTo(v2);
		        		  
		        		} };
				 Collections.sort(listOfEntries, valueComparator);
		
				// HashMapSorting ob1 = new HashMapSorting(hm);
				 LinkedHashMap<String, Integer> sortedByValue = new LinkedHashMap<String, Integer>(listOfEntries.size()); // copying entries from List to Map for(Entry<String, String> entry : listOfEntries){ sortedByValue.put(entry.getKey(), entry.getValue()); } System.out.println("HashMap after sorting entries by values "); Set<Entry<String, String>> entrySetSortedByValue = sortedByValue.entrySet();

				 //Read more: http://www.java67.com/2015/01/how-to-sort-hashmap-in-java-based-on.html#ixzz4dQAzDlUo
				 for(Entry<String, Integer> entry : listOfEntries)
				 { sortedByValue.put(entry.getKey(), entry.getValue()); } 
				 
				 System.out.println("HashMap after sorting entries by values "); 
				 Set<Entry<String, Integer>> entrySetSortedByValue = sortedByValue.entrySet();
				 for(Entry<String, Integer> mapping : entrySetSortedByValue){ System.out.println(mapping.getKey() + " ==> " + mapping.getValue()); }

				 //Read more: http://www.java67.com/2015/01/how-to-sort-hashmap-in-java-based-on.html#ixzz4dQBKlaNz
				// Read more: http://www.java67.com/2015/01/how-to-sort-hashmap-in-java-based-on.html#ixzz4dQBAZ0an

}
		
		
	}





