package misc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

// Alien Dictionary
/*
There is a new alien language which uses the latin alphabet. 
However, the order among letters are unknown to you. 
You receive a list of words from the dictionary, where words are sorted lexicographically by the rules of this new language. 
Derive the order of letters in this language.
For example,
Given the following words in dictionary,
[
  "wrt",
  "wrf",
  "er",
  "ett",
  "rftt"
]
The correct order is: "wertf".
Note:
You may assume all letters are in lowercase.
If the order is invalid, return an empty string.
There may be multiple valid order of letters, return any one of them is fine.
Hide Company Tags Google Facebook
Hide Tags Graph Topological Sort
Hide Similar Problems (M) Course Schedule II
*/
public class Alien {
	public static String alienOrder(String[] words) {
	    if(words == null || words.length == 0) return "";
	    StringBuilder sb = new StringBuilder();
	    Map<Character, Integer> degree = new HashMap<Character, Integer>();
	    Map<Character, Set<Character>> toMap = new HashMap<Character, Set<Character>>();
	    
	    for(String s: words){
	        for(char c: s.toCharArray()){
	            degree.put(c, 0);
	        }
	    }
	    
	    for(int i = 0; i < words.length - 1; i++){
	        int length = Math.min(words[i].length(), words[i+1].length());
	        for(int j = 0; j < length; j++){
	            char cur = words[i].charAt(j), next = words[i+1].charAt(j);
	            if(cur == next) continue;
	            
	            if(toMap.containsKey(cur)){
	                if(!toMap.get(cur).contains(next)){
	                    toMap.get(cur).add(next);
	                    degree.put(next, degree.get(next) + 1);
	                } 
	            } else {
	                Set<Character> set = new HashSet<Character>();
	                set.add(next);
	                toMap.put(cur, set);
	                degree.put(next, degree.get(next) + 1);
	            }
	            break;
	        }
	    }
	    
	    Queue<Character> queue = new LinkedList<Character>();
	    for(char c : degree.keySet())
	        if(degree.get(c) == 0)
	            queue.offer(c);
	            
	    while(!queue.isEmpty()){
	        char cur = queue.poll();
	        sb.append(cur);
	        if(!toMap.containsKey(cur)) continue;
	        for(Character next : toMap.get(cur)){
	            degree.put(next, degree.get(next) - 1);
	            if(degree.get(next) == 0){
	                queue.add(next);
	            }
	        }
	    }
	    if(sb.length() != degree.size()) return "";
	    return sb.toString();
	}
	
	public static void main(String[] args) {
		//String[] s = {"wrt", "wrf", "er", "ett", "rftt"};
		String[] s ={"caa", "aaa", "aab"};
	    System.out.println(alienOrder(s));
		
	}

}
