package misc;

import java.util.HashMap;

public class Ismorphic {
	
	public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }        
        HashMap<Character, Character> keyValue = new HashMap<Character, Character>();
        HashMap<Character, Character> valueKey = new HashMap<Character, Character>();
        int i=0; int j=0;
        while (i < s.length() && j < t.length()) {
            if (!(keyValue.containsKey(s.charAt(i))) && !(valueKey.containsKey(t.charAt(j)))) {
                    keyValue.put(s.charAt(i), t.charAt(j));
                    valueKey.put(t.charAt(j), s.charAt(i));
                    i++; j++;
            } else if (keyValue.containsKey(s.charAt(i)) && keyValue.get(s.charAt(i)) == t.charAt(j)){
                i++;j++;
                System.out.println(keyValue);
            } else if (valueKey.containsKey(t.charAt(j)) && valueKey.get(t.charAt(j)) == s.charAt(i)) {
                i++;j++;
            } else {
                return false;
            }
        }
        return true;
	}
	    public static void main(String[] args) {
	    	System.out.println(isIsomorphic("aa","ab"));
	    }
	}

