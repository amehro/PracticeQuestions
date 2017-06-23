package misc;

public class MaxProductSubArray {
	int prod = 1;
	int max_prod = 1;
	protected void max_prod(int[] array) {
		 for (int i =0; i< array.length;i++) {
		 prod = prod * array[i];
		 if (prod > max_prod) {
			 max_prod = prod;
		 } else if (prod ==0 ) {
			 prod =1;
			 
		 }	 
		 
	  }
		 System.out.println(max_prod);
	}
 
 public static void main(String[] args) {
	 int [] arr = {1,-9,3,4};
	 MaxProductSubArray ob = new MaxProductSubArray();
	 ob.max_prod(arr);
 }
}
