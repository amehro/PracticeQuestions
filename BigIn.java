package misc;

public class BigIn {
private  int[] num1;
private  int[] num2;
private  String res;
  
  BigIn(int[] num1, int[] num2) {
	  this.num1 = num1;
	  this.num2 = num2;
  }
  
  BigIn(String res2) {
	  this.res = res2;
	  
  }
  
  
  
  public BigIn add(int[] num1, int[] num2) {
	  int len1 = num1.length;
	  int len2 = num2.length;
	  int i = len1-1; int j=len2-1;int carry =0;int k =0;
	  
	  int x=0;
	  StringBuilder res = new StringBuilder();
	  while(i>=0 && j>=0) {		  
		
		x = num1[i] + num2[j]+ carry;
		if (x > 10) {
			carry = x /10;
			res.append((x%10));   
		} else {
			res.append((x));
		}
		k++;
		i--;j--;		
	  }	  
	  
	  while (i >= 0 ) {
		  x =  (carry + num1[i]);
		  carry = x /10;
		  res.append((x%10));
		  k++;i--;
	  }
	  
	  while (j >= 0 ) {
		  x =  (carry + num2[j]);
		  carry = x /10;
		  res.append((x%10));
		  k++;i--;
	  }
	  
	  if (carry>=1){
		  res.append(carry);  
	  }
	  
	  
	return new BigIn(res.reverse().toString());
	
	
  }
  
  
  public static void main(String[] args) {
	  int[]  num1 = {9,2,9};
	  int[] num2 = {4,5,6};
	  BigIn ob = new BigIn(num1, num1);
	  System.out.println(ob.add(num1, num2).res);
	  
  }
  
  
  
}
