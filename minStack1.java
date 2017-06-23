package misc;

import java.util.Stack;

public class minStack1 {
	Stack<Integer> s1;
	Stack<Integer> s2;
	int min = Integer.MAX_VALUE;
	
	public  minStack1() {
		 s1 = new Stack<Integer>();
		 s2 = new Stack<Integer>();
	}
	
	public void push(int x) {
		s1.push(x);
		if (s2.isEmpty()) {
			s2.push(x);
			
		} else if (x < s2.peek()) {
			
			s2.push(x);
					
		} 
	}
	
	public void pop() {
        if (s1.isEmpty()) {
        	return;
        }
		if (!s1.isEmpty()) {	
			
			if (s1.peek() == s2.peek()) {
				System.out.println("popped     " + s1.pop());
				System.out.println("minimum popped   " + s2.pop());
				
				

			} else {
				s1.pop();
			}
		}
		
	}
	
	public int min() {
		if (!s2.isEmpty()) {
		return (int) s2.peek();
		}
		return 0;
	}
	
  public static void main(String[] args) {
	
	 minStack1 ms = new minStack1();
	 ms.push(100);
	 ms.push(1);
	 ms.push(76);
	 ms.push(78);
	 System.out.println("hello1" + ms.min());
	 
	 
	 System.out.println("hello2" + ms.min());
	 ms.pop();
	 ms.pop();ms.pop();
	 System.out.println("hello3" + ms.min());
	 ms.pop();
	 ms.pop();
	 ms.min();
	 ms.pop();ms.pop(); System.out.println("hello4" + ms.min());
	 
	 
	 
	 
 }

private static void sleep(int i) {
	// TODO Auto-generated method stub
	
}
}
