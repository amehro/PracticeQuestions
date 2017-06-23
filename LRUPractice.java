package misc;

import java.util.LinkedHashMap;

class ListNode {
	int data;
	ListNode prev;
	ListNode next;
}

public class LRUPractice {

	static final int MAX_CAPACITY = 3;
	static int LRU_CURRENT_SIZE=0;
	LinkedHashMap<Integer,ListNode> lhm= new LinkedHashMap<Integer,ListNode>();
	ListNode head;
	ListNode tail;	
	
	public void put(int x, int value) {
		if (LRU_CURRENT_SIZE >= MAX_CAPACITY) {
			evictElement();
		}
		ListNode node = new ListNode();
		insertNode(node, value);
		lhm.put(x, node);
		
	}
	
	
	public  int get(int key) {
		if (lhm.containsKey(key)) {
			ListNode x= lhm.get(key);
			// Doing a get will make this node the most recently used
			// hence moving it to the end of the list
			if (x.prev != null && x.next != null) {
				//delete this node
				x.prev.next = x.next;
				x.next.prev = x.prev;
			} else if (x.prev == null && x.next != null) {
				x.next.prev = null;
				head = head.next;
			} 
			insertNode(new ListNode(), x.data);
			//We do not need another else if block here
				// because if the key is already a tail node, we are good to go
			
			
			return x.data;
		} 
		// no keye exists
		return -1;
	}


	private void insertNode(ListNode node, int data) {
		if (head != tail) {
			// Inserting node at end of linkedlist			
			node.data = data;
			node.next = null;
			node.prev = tail;
			tail.next = node;
			tail = tail.next;			
		} else {
			/// if first node is being created
			node.data = data;
			node.next = null;
			node.prev = null;
			head = node;
			tail = node;			
		}
		// TODO Auto-generated method stub
		
	}


	public void evictElement() {
		// remove first node of doubly linked list
		head.next.prev = null;
		head = head.next;		
		//head.next = null; check this
	}
	
}
