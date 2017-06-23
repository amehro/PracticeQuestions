package misc;

class Node1 {
	Node1 left;
	Node1 right;
	int data;
	public Node1(int x) {
		this.data = x;
		left=right=null;
		
	}
}

 class Sibling {
	
  private static boolean isSibling(Node1 x, Node1 n1, Node1 n2) {
	  boolean ans1 = false;
	  if (x ==null || n1 == null || n2 == null || n1.data == x.data || n2.data == x.data ) {
		  return false;
	  }
	  
		
	  if ((x.left == n2 && x.right == n1) || (x.left == n1 && x.right == n2)) {
		  return true;
	  }
	  boolean ans = isSibling(x.left,n1,n2) || isSibling(x.right,n1,n2);
	  
	  
	  
		
	  return ans;
  }	
  
  private static int findLevel(Node1 x, Node1 n1, int level) {
	  
	 int lev = 0; 
	 if (x == null) {
		 return 0;
	 }
	  
	if (x.left.data == n1.data || x.right.data == n1.data) {
		return level +1;
	}
	
	lev= findLevel(x.left, n1, level + 1);
	if (lev ==0) {
		lev = findLevel(x.right, n1, level + 1);
	}
	
	
	return lev;
	  
  }
  
  
  public static void main(String[] args) {
	  
	  Node1 x = new Node1(50);
	  x.left = new Node1(35);
	  x.right = new Node1(60);
	  x.left.left = new Node1(34);
	  x.left.right = new Node1(36);
	  x.right.right = new Node1(100);
	  
	  System.out.println(findLevel(x, x.left.left, 0));
	  //boolean ans = isSibling(x, x.left, x.right);
	  //System.out.println(ans);
	 
  }
  
  




}


