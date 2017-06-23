package misc;

import java.util.HashSet;
import java.util.Set;

public class LongSubstring {
	
	public static String findLongestSubstring(String str) {
		int max;
		Set<Character> lookup = new HashSet<Character>();
		int index =0;
		int length = str.length();
		StringBuffer b = new StringBuffer();
		int longestSubstrlen = 0;
		int substrLen = 0;
		String longestString = "";
		int start = 0;
		while (index < length) {
			
			char c = str.charAt(index);
			if (!lookup.contains(c)) {
				
				lookup.add(c);				
				index++;
				if (index - start > longestString.length()) {
					longestString = str.substring(start, index);
				}
				continue;			
		  }
			
			lookup.removeAll(lookup);			
			start = index;
			
			
		
		
	}
		return longestString;}
	
	public static void main(String[] args) {
		System.out.println(findLongestSubstring("abccdefghhhhhijklmnopqrs"));
	}
	
	
	
}
