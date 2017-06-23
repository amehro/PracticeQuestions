package misc;

import java.util.HashMap;
import java.util.Map;
//
public class LongSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
                System.out.println(i);
            }
            ans = Math.max(ans, j - i );
            map.put(s.charAt(j), j );
        }
        return ans;
    }
    
    public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abccbgd"));
	}
}
