package misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

class Node {
	char nodeName;
	ArrayList<Character> adj;
	
}

public class AlienDictionary  {
 
	LinkedHashMap<Character, ArrayList<Character>> lhm;
	HashMap<Character, Integer> degree; 
	
	public AlienDictionary() {
		lhm = new LinkedHashMap<Character, ArrayList<Character>>();
		degree = new HashMap<Character, Integer>();
		
	}	

	private void createDegreeMap(String[] words) {
		for (String word: words) {
			for (char c : word.toCharArray()) {
				degree.put(c,0);
			}
		}		
	}
	
	
	// topological sorting of graph
	public String toplogicalSort() {
		Queue<Character> q = new LinkedList();
		for(Entry<Character,Integer> x: degree.entrySet()) {
			if (x.getValue() ==0) {
				q.offer(x.getKey());
			}
		}
		StringBuilder sb = new StringBuilder();
		
		while(!q.isEmpty()) {
			char a =(char) q.poll();
			sb.append(a);
			if (!lhm.containsKey(a)) continue;
			for (Character cs:lhm.get(a)) {			  
			  degree.put(cs, degree.get(cs) - 1);
			  if (degree.get(cs) == 0) {
				  q.offer(cs);
			  }
			}
		}
		
		if (sb.toString().length() != degree.size()) {
			return "";			
		} 
		
		return sb.toString();
	}

	
	
	private  void createNode(char charAt1, char charAt2) {
		
		if (lhm.containsKey(charAt1)) {
			ArrayList<Character> al = lhm.get(charAt1);
			al.add(charAt2);
			lhm.put(charAt1, al);
			degree.put(charAt2, degree.get(charAt2) + 1);
		} else {
			ArrayList<Character> set = new ArrayList<Character>();
            set.add(charAt2);
            lhm.put(charAt1, set);
            

			lhm.put(charAt1, set);
			degree.put(charAt2, degree.get(charAt2) + 1);
		}
		
	}
	
	
	public static void main(String[] args) {
		AlienDictionary  ad = new AlienDictionary();
		
		String[] words = {"caa", "aaa", "aab"};
		ad.createDegreeMap(words);
		
		int length = words.length;
		for (int i=0;i< length - 1; i++) {
			int wordLength = words[i].length();
			int nextWordLength = words[i+1].length();
			int len = Math.min(wordLength,  nextWordLength);
			for(int j=0; j< len-1; j++) {
				if (words[i].charAt(j) != words[i+1].charAt(j)) {
					ad.createNode(words[i].charAt(j), words[i+1].charAt(j));
					// wee are treating words in lexicographical order
					break;
				}
			}
			System.out.println(ad.toplogicalSort());
		}
	}
}



















