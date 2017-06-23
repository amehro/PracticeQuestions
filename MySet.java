package misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class MySet<E> {
 private transient HashMap<E,Object> map;
 private static final Object PRESENT = new Object();
  
  public MySet() {
	 map =  new HashMap<E,Object>();
  }
  
  
  protected boolean add(E key) {
	  return map.put(key, PRESENT) == null;
  }
  
  
  public void delete(E key) {
	  map.remove(key);
  }
  
  public boolean isEmpty() {
	 return map.isEmpty();
  }
  
  public int size() {
	  return map.size();
	
	  
  }
  
  public boolean existsKey(E key) {
	  
	  return map.containsKey(key);
	
	  
  }
  
  public Iterator<E> iterartor() {
	return map.keySet().iterator();
	  
  }
  
  public Object clone() {
	  return map.clone();
	
	  
  }
  
//  public void display() {
//	  for (T name: map.keySet()) {
//          String key =name.toString();          
//          System.out.println(key);
//  }}
//	  
//  public List convertToArray() {
//	  map.keySet();
//  }
//  
//  public List union() {
//	  
//	  return 
//  }
//	  
	  
	  
	  

  
  
  public static void main(String[] args) {
	  MySet ob = new MySet();
	  ob.add(1);
	  ob.add(2);
	  System.out.println(ob.size());
	  System.out.println(ob.existsKey(1));
	 // ob.display();
	  System.out.println(ob.isEmpty());
	  
	  
  }
  

 }
  

