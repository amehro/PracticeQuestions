package misc;

public class OneeDIT {
	
  public static boolean countEdit(String s, String t) {
		if (s.length() == t.length()) {
			return checkModify(s,t);
		}
		return isOneDel("abde", "ad");
		//return 0;
  }
  
  
  public static boolean isOneDel(String s,String t){
	    for(int i=0,j=0;i<s.length() && j<t.length();i++,j++){
	        if(s.charAt(i) != t.charAt(j)){
	            boolean x =s.substring(i+1).equals(t.substring(j));
	            return x;
	        }
	    }
	    return true;
	}
  
  private static boolean checkEdit(String s, String t) {
	  int diff =0;
	  // TODO Auto-generated method stub
	  for (int i=0; i<s.length();i++) {
		  if (s.charAt(i)!=t.charAt(i)) {
			  diff++;
			  if (diff > 1) {
				  break;
			  }
		  }
	  }
	  return diff == 1;
	
 }
	
	
  private static boolean  checkModify(String s, String t) {
	  int diff =0;
	  // TODO Auto-generated method stub
	  for (int i=0; i<s.length();i++) {
		  if (s.charAt(i)!=t.charAt(i)) {
			  diff++;
			  if (diff > 1) {
				  break;
			  }
		  }
	  }
	  return diff == 1;
	
 }


public static void main(String[] args) {
	System.out.println(countEdit("abde", "ad"));
  }
}
