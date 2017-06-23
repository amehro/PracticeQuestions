package misc;

public class substring {
	static boolean flag = false;
	 static boolean isSubstring(String str, String substr) {
          for (int i = 0; i < str.length(); i++ ) {
        	  flag = true;
			for (int j = 0 ; j < substr.length();  j++) {
				if (str.charAt(i + j) != substr.charAt(j)) {
					flag = false;
					break;
				} 
					
				
			}
			if (flag!= false) {
				return true;
			}
          }
		
		return flag;
		
	}
 public static void main(String[] args) {
	 System.out.println(isSubstring("abhishhek", "shek"));
	 
 }
}
