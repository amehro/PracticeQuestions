package misc;

public class dorrecursion {
	public static void x(int n) {  
		   
        for (int i = 0; i < n; i++) {  
   
   
            System.out.print("   "+n);  
            x(n - 1);  
        }  
    }  
	
	public static void main(String[] args) {
		dorrecursion.x(2);
	}
}
