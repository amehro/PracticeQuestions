package misc;

import java.util.HashMap;

interface Operator {
	public int eval(int x,int y);
}
public class ReversePolishNotation {
  public static final HashMap<String, Operator> map = new HashMap<String, Operator>() {{
	  
	  put("+", new Operator() {
		  public int eval(int x, int y) { return x + y; }
		  });
  
  
  }};
  
  HashMap<String, Operator> h = new HashMap<String, Operator>() {{
	  
  put("k",  new Operator() 
   {
	  public int eval(int x, int y) {
	    return x + y;
	    
	  }
   }
  }};

  
  
//  {
//	  public int eval(int x, int y) {
//		  return x+y;
//	  }
//  });
  
  
  
  private static void reversePolish(String[] x) {
		
	  
		
	}
  
  public static void main(String[] args) {
	  String[] x = {"2", "1", "+"};
	  reversePolish(x);
  }



  
}
