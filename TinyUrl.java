package misc;

import java.util.HashMap;

public class TinyUrl {
	 public String shorturl(int id, int base, HashMap map) {
		  StringBuilder res = new StringBuilder();
		  while (id > 0) {
		    int digit = id % base;
		    res.append(map.get(digit));
		    id /= base;
		  }
		  //while (res.length() < 6)  res.append('0');
		  return res.reverse().toString();
		}
	 
	 
	 public int decode(String x, HashMap map) {
//		for (int i=0; i <)
//		 
//		return 0;
		 
	 }
	 
	 
	 
	 public static void main(String[] args) {
		 TinyUrl ob = new TinyUrl();
		 
		 HashMap hm = new HashMap();
		 hm.put(0, 0);
		 hm.put(1, 1);
		 hm.put(2,2);
		 hm.put(3, 3);
		 hm.put(4, 4);
		 hm.put(5, 5);
		 hm.put(6, 6);
		 hm.put(7, 7);
		 hm.put(8, 8);
		 hm.put(9, 'a');
		 hm.put(61, 'z');
		 System.out.println(ob.shorturl(123, 62, hm));
	 }
}
