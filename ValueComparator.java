package misc;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class ValueComparator implements Comparator<String> {
	 
    Map<String, Integer> base;
 
    public ValueComparator(Map<String, Integer> base) {
        this.base = base;
    }
 
    public int compare(String a, String b) {
        return base.get(a) - base.get(b) ;

    }



public static void main(String[] args) {
	HashMap<String, Integer> countMap = new HashMap<String, Integer>();
	//add a lot of entries
	countMap.put("aks", -9);
	countMap.put("ads", 20);
	countMap.put("azx", 10);
	 
	ValueComparator vc =  new ValueComparator(countMap);
	TreeMap<String,Integer> sortedMap = new TreeMap<String,Integer>(vc);
	TreeMap<String,Integer> sortedMapKeys = new TreeMap<String,Integer>(countMap);
	 
	sortedMap.putAll(countMap); 
	String[] x = (String[]) sortedMap.keySet().toArray();
	int x66=3; double y66=  6.8;double z66;
	 z66 = (double) (x66-y66);
	 Integer xp =  null;
	 
	 
	
	sortedMap.putAll(countMap); 
	System.out.println(sortedMap);
	System.out.println(sortedMapKeys);
	//printMap(sortedMap);
}
}
