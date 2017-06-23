package misc;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class kprimesum {
	
	
	
  public boolean iskprimesum(int n, int k, LinkedHashSet<Integer> primeset) {
		
	 
	for (int x: primeset) {	  
	  if(k==1) {
		  if (primeset.contains(n)) {
			  return true;
		  } else {
			  return false;
		  }
	  } else if (k >= 2) {
		  boolean ret = iskprimesum(n-x, k-1, primeset);
		  if (ret == true) {
			  return true;
		  }
	  }
	}
	  return false;
	  
  }
			
	  
  
  
  public static void main(String[] args) {
	  kprimesum ob = new kprimesum();
	  LinkedHashSet<Integer> primeset = new LinkedHashSet<Integer>();
	  primeset.add(2);
	    for(int i = 2; i < 20 ; i++) {
	    	boolean flag= false;
	    	 //check to see if the number is prime
            for(int j=2; j < i ; j++){
                   
                    if ((i % j == 0)){
                    	flag = true;
                    	   break;
                            
                    }
                 
            }
            
            if (flag == false) {  
          	  primeset.add(i);
            }
	      
	    }
	    System.out.println(primeset);
	  System.out.println(ob.iskprimesum(20,3, primeset));
	  //2,3,5,7,11,13,17,19
  }
}
