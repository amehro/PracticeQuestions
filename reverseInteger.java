package misc;

public class reverseInteger {
    
	public static String reverse(String x) {
		if (x.length() == 1) {
			return x;
		}
		int len = x.length();
		String res = reverse(x.substring(0, len--));
		return res;
		
	}
	
	public static void main(String[] args) {
		
		String ch = String.valueOf(123);
		System.out.println(reverse(ch));
	}

	
}
