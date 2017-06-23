package misc;

import java.util.*;

public class Angram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        //Arrays.sort(strs);
        //System.out.println(strs);
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<String>());
            map.get(keyStr).add(s);
           // List<String> x = map.get(keyStr);
        }
        return new ArrayList<List<String>>(map.values());
    }
    
    
    public static void main(String[] args) {
    	//String[] str = new String[5];
    	
    	String[] str = {"cat", "dog", "act", "door", "odor"};
    	System.out.println(groupAnagrams(str));
    }
}