package misc;

import java.util.HashMap;

public class LRUCache {
	HashMap<Integer, LinkedList> hm;
	public static int max_capacity = 3;
	LinkedList head;
	LinkedList tail;

	
	
	
	public LinkedList getValue(int key) {
		if (hm.containsKey(key)) {
			LinkedList node = hm.get(key);
			removeFromLinkedList(node);
			insertNodeAtFrontOfLinkedList(key, node.value);
		}
		
		return hm.get(key);
		
	}
	
	public void removeKey(int key) {
		LinkedList node;
		if (hm.containsKey(key)) {
			node = hm.remove(key);
			removeFromLinkedList(node);
		} else {
			return;
		}		
	}
	
	public void putValue(int key, String value) {
		// important trick
		removeKey(key);
		if (hm.size() == max_capacity) {
			removeKey(key);			
		}
		LinkedList node = new LinkedList();
		node.key = key;
		node.value = value;
		insertNodeAtFrontOfLinkedList(node.key, node.value);
		hm.put(key, node);
	}
	

	
	public void removeFromLinkedList(LinkedList node) {
		if (node == null) {return;}
		if (node.prev != null) {
			node.prev.next = node.next;
		} else if (node.prev == null) {
			head = node;
		}
		
		if (node.next != null) {
			node.next.prev = node.prev;
		} else if (node.next == null) {
			tail = node;
		}
		
	}
	
	
	
	private void insertNodeAtFrontOfLinkedList(int key, String value) {
		LinkedList node = new LinkedList();
		node.key = key;
		node.value = value;
		if (this.head == null) {
			head = node;
			tail = node;
		} else {
			head.prev = node;
			node.next = head;
			head = node;
		}
	}	
	
	
	class LinkedList {
		LinkedList next, prev;
		int key;
		String value;
		
	}
}
