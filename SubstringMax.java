package misc;

import java.util.ArrayList;
import java.util.HashMap;

public class SubstringMax {
    ArrayList<Character> al = new ArrayList<Character>();
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        int l = s.length();
        int nextIndex =0;
        int index =0;
        int max =-99999;
        for (int i=0; i < l ; i = nextIndex) {
            if (hm.containsKey(s.charAt(i))) {
                max = Math.max(hm.size(), max);
                index = hm.get(s.charAt(i));
                nextIndex = i;
                hm.remove(s.charAt(i));
            } else {
                hm.put(s.charAt(i), i);
                nextIndex = i+1;
            }
        }
        
        return Math.max(max, hm.size());
        
}
    
    public static void main(String[] args) {
    	System.out.println(lengthOfLongestSubstring(""));
    }
}
