package misc;

import java.util.LinkedHashMap;
import java.util.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU1 extends LinkedHashMap {
  private int cacheSize;

  public LRU1(int cacheSize) {
    super(cacheSize,  0.75f, true);
    this.cacheSize = cacheSize;
  }

//  public LRU1() {
//	// TODO Auto-generated constructor stub
//}
  
protected boolean removeEldestEntry(Map.Entry eldest) {
    return size() >= cacheSize;
  }
  
  
  public static void main(String[] args) {
	  LRU1 x= new LRU1(3);
	  x.put(1, 1);
	  x.put(2, 2);
	  System.out.println(x);
	  x.put(3, 3);
	 
	  System.out.println(x);
  }
}
