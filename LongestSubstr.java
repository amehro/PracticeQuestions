package misc;

import java.util.Arrays;

public class LongestSubstr {
	public static int getLongest(String str) {
		char[] map = new char[256];		
		int pos = 0;
		int len=0;
		int maxLen =0;
		
		Arrays.fill(map, '0');
		for (int i=0;i<str.length();) {
			if (map[str.charAt(i)] != '0') {
				pos = map[str.charAt(i)];i++;
				if (len > maxLen) {
					maxLen = len;
					i = pos +1;
					len = 0;
					Arrays.fill(map, '0');
				}
			} else {
				map[str.charAt(i)] =  (char) i;
				len++;i++;
			}
		}
		return maxLen;
	}
  public static void main(String[] args) {
	  int x = getLongest("abcbdefgh");
	  System.out.println(x);
  }
}
