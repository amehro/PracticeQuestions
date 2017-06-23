package misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class permutation {
	HashSet<String> hs = new HashSet<String>();
	HashMap m = new HashMap();
	
	public ArrayList<String> getPerms(String str) {
		
		if (str == null) {
			return null;
		}
		
		ArrayList<String> permutations = new ArrayList<String>();
		
		if (str.length() == 0) { // base case
			permutations.add("");
			return permutations;
		}
	            
		char first = str.charAt(0); // get the first character
		String remainder = str.substring(1); // remove the first character
		ArrayList<String> words = getPerms(remainder);	
		System.out.println("PPPPPPPP+" +words);
		for (String word : words) {			
			for (int j = 0; j <= word.length(); j++) {				
				String s = insertCharAt(word, first, j);
//				if (s == null) {
//					continue;
//				}
				hs.add(s);
				
				permutations.add(s);
			}
		}
		
		return permutations;
		
		
		
	}

	
	private String insertCharAt(String word, char c, int i) {
		// TODO Auto-generated method stub		
		String start = word.substring(0, i);
		String end = word.substring(i);
		if (hs.contains(start + c + end)) {
			return null;
		}
		System.out.println(start + c + end);
		return start + c + end;
	}


	public static void main(String[] args) {
		permutation ob = new permutation();
		
		System.out.println(ob.getPerms("abc"));
	}
}
