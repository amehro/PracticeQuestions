package misc;

public class power {
    public static double myPow(double x, int n) {
        
        
        if (n==1) {
        	return x;
        }
        
        if (n%2 == 0) {
          double y = myPow(x, n/2);
           return y*y;
        } else {
          double z   = myPow(x,n/2);
            return x*z*z;
        }
    }
    
    public static void main(String[] args) {
    	 double x = 2;
         int n = -3;
         if (n < 0){
             x = 1/x;
             n = -n;
             
         }
     	System.out.println(myPow(x,n));
     }
    }

