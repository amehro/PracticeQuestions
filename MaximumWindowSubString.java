package misc;

import java.util.ArrayList;
import java.util.HashMap;

public class MaximumWindowSubString {


	private static String minWindow(String s, String t)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			for (char c : t.toCharArray())
			{
				Integer x =map.get(c);
				if (x !=null) {
					map.put(c, x+1);
				} else {
					map.put(c, x);
				}
				

			}
			int counter = t.length();
			int begin = 0;
			int end = 0;
			int d = Integer.MAX_VALUE;;
			int head = 0;
			while (end < s.length())
			{
				if (map.containsKey(s.charAt(end++)))
				{
					counter--; //in t
				}
				while (counter == 0)
				{ //valid
					if (end - begin < d)
					{
						d = end - (head = begin);
					}
					if (map.containsKey(s.charAt(begin++))   &&     map.get(s.charAt(begin++)) + 1 ==0  )

					{
						counter++; //make it invalid
					}
				}
			}
			return d == Integer.MAX_VALUE? "":s.substring(head, head + d);
	}

		
	
	
	public static void main(String[] args) {
		String s ="ab";
		String t = "b";
		System.out.println(minWindow(s, t));
	}

	
}
