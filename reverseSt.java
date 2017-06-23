package misc;

public class reverseSt {
	
	public static String reverse(String str) {
		int length = str.length();
		char arr[] = str.toCharArray();
		//System.out.println();
		
		String x = str.replaceAll("\\s{2,}", " ").trim();
		return x.trim();
		
//		for (int i=0; i< length/2; i++) {			
//			char temp = str.charAt(i);
//			arr[i] = arr[length -i-1];
//			arr[length -i-1] = temp;	
//			
//		}
		
//		StringBuilder s = new StringBuilder();
//		
//		
//		for (int i=length-1; i>=0; i--) {
//			
//			if (arr[i] != 0) {
//				s.append(arr[i]);
//			}
//			
//		}
//		System.out.println(s);
//		return String.valueOf(s);
		//return s.toString();
	}
	
	

	public static void main(String[] args) {
		System.out.println(reverse("     the     blue    "));
	}
}
