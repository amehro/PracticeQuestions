package misc;

import java.util.HashMap;
class cloningExample{

  public static void main(String args[]) {
	  
	  
	  String x6 = "abc";
			  String y=x6;
			  String ab = new String("abch");
			  System.out.println(x6.equals(y));
			  System.out.println(x6==y);
			  System.out.println(ab.equals(y));
			  System.out.println(ab==y);
	  
 
     // Create a HashMap
     HashMap<Integer, String> hmap = new HashMap<Integer, String>(); 
 
 
     // Adding few elements
     hmap.put(11, "Jack");
     hmap.put(22, "Rock");
     hmap.put(33, "Rick");
     hmap.put(44, "Smith");
     hmap.put(55, "Will");
     
     System.out.println("HashMap contains: "+hmap);
 
     // Creating a new HashMap
     HashMap<Integer, String> hmap2 = new HashMap<Integer, String>(); 
 
     // cloning first HashMap in the second one
     hmap2=(HashMap)hmap.clone();
     //System.out.println("Cloned Map contains: "+hmap2); 
     String x = hmap.get(11);
	 x = "aks";
	 hmap.put(11, x);
	 hmap.put(99, "kdkshkjshdk");
 
	 System.out.println("Cloned Map contains: "+hmap); 
     System.out.println("Cloned Map contains: "+hmap2); 
  } 
}