package misc;

public class URLShortener {
  private static final String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
  private static final int size = Alphabet.length();
  
  
  private String encode(int num) {
	  StringBuilder s = new StringBuilder();
	  while(num > 0) {
		  s.append(Alphabet.charAt(num%size));
		  num=num/size;
	  }
	  return s.reverse().toString();
	  
  }
  
  private int decode(String str) {
	 int len = str.length();int x = 0;
	 for (int i =len-1 ; i>=0; i--) {
		x +=  (Math.pow(62, len-(i+1)) * Alphabet.indexOf(str.charAt(i)));
	 }
	return x;
	  
  }
  
//  public  int decode(String str) {
//      int num = 0;
//      for ( int i = 0; i < str.length(); i++ )
//          num = num * size + Alphabet.indexOf(str.charAt(i));
//      return num;
//  }   
  public static void main(String[] args) {
		URLShortener ob = new URLShortener();
		String x = ob.encode(212901212);
		System.out.println(x);
		System.out.println(ob.decode(x));
  }

}


