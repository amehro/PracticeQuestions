package misc;

import java.util.ArrayList;

public class MaxSubstring {
    static ArrayList<Character> al = new ArrayList<Character>();
    public static int lengthOfLongestSubstring(String s) {
        String maxSubStringEndingHere = Character.toString(s.charAt(0) );
        String maxStringSoFar = Character.toString(s.charAt(0) );
        int res = 1;
        al.add(s.charAt(0));
        for (int i=1; i< s.length();i++) {
            if (al.indexOf(s.charAt(i)) > -1) {
               
                res = Math.max(res, maxSubStringEndingHere.length());
                System.out.println(res);
                maxSubStringEndingHere = Character.toString(s.charAt(i));
                al.clear();
                al.add(s.charAt(i));
            }
            else {
                maxSubStringEndingHere += Character.toString(s.charAt(i));
                al.add(s.charAt(i));
               
                
            }
        }
        
        return res;
    }
    
    public static void main (String[] args){
    	lengthOfLongestSubstring("abcabcdddd");
    }
}
