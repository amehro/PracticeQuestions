package misc;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;

public class PriorityQue {
	public static HashMap<String, Integer> hm = new HashMap<String, Integer>();

	
	
    public static PriorityQueue<HottestWord> topKHeap = new PriorityQueue<HottestWord>(3, new HottestWord()) ;
    	
    	
    	
	
	private static  void addWord(String[] words) {
		
		for (String x: words) {
			
			if (hm.containsKey(x)) {
				hm.put(x, hm.get(x) + 1);
			} else {
				hm.put(x, 1);
			}
		}
		
	}
	
	

	
	
	public static void main(String[] args) {
		String[] words={"cat","cat","cat","sheep","sheep","sheep","sheep", "dog"};
		addWord(words);
		for (Map.Entry<String, Integer> entry: hm.entrySet()) {
			if (topKHeap.size() < 3) {
				topKHeap.add(new HottestWord(entry.getKey(), entry.getValue()));
			} else {
				if (topKHeap.peek().freq < entry.getValue()) {
					topKHeap.poll();
					topKHeap.add(new HottestWord(entry.getKey(), entry.getValue()));
				}
			}
		}
		
	    // extract the top K
	    final String[] topK = new String[3];
	    int i = 0;
	    while (topKHeap.size() > 0) {
	        topK[i++] = topKHeap.poll().word;
	    }

	    System.out.println(topK[0]);
	    System.out.println(topK[1]);
	    System.out.println(topK[2]);
	}
	
}




class HottestWord implements Comparator<HottestWord>{
	
	String word;
	int freq;
	
	public HottestWord(final String w, final int c) {
        word = w;
        freq = c;
    }
	
	public HottestWord() {
		// TODO Auto-generated constructor stub
	}

	public int compare(HottestWord m1, HottestWord m2)
    {
        if (m1.freq > m2.freq) return 1;
        if (m1.freq > m2.freq) return -1;
        else return 0;
    }
}
