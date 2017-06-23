package misc;

public class denomination {
	int count=0;int c1,c2;
	public int ways(int denom[], int x) {
		
		if (x == 0) {
						return 1;
		}
		
		if (x<0){
			return 0;
		}
		
		if (x > 0) {
			c1 = ways(denom,x -25); c2= ways(denom, x-50);
			
		}
		
		
		return c1+c2;
	}
	
	

	
	public static void main(String[] args) {
		denomination ob = new denomination();
		int denom[] = {25,50};
		
		System.out.println(ob.ways(denom, 150));
		
	}
}
