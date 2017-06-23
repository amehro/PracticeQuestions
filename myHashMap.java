package misc;

public class myHashMap {
	
	final static int bucketSize = 3;
	// stores linked list
	protected Node[] arr= new Node[bucketSize];
	
	
	
	public String get(String key) {		
		
		int value = 0;
		Node node;
		int position = key.hashCode() % bucketSize;
		node = arr[position];
		//System.out.println("jkgjkgjk   " + node.getKey());
		while(node != null) {
			
			if (node.getKey().equals(key)) {
				return node.getValue();
			}
			node = node.next;
		}
		
		return null;
		
		
	}
	
	

	
	public void put(String key, String value) {
		int position = key.hashCode() % bucketSize;
		Node newNode = new Node(key, value);;
		Node prev = null;
		//System.out.println("newnode   " + newNode.getKey());
		if (arr[position] == null) {
			arr[position] = newNode;
			
		} else {
			Node x = arr[position];
			while (x !=null) {
				if (x.getKey().equals(newNode.getKey())) {
					x.setValue(value);
					return;
				}
				prev = x;
				x = x.next;
			}
			prev.next = newNode;
			
		}
		
	}
	
		  




class Node {
	private String key;
	private String value;
	private Node next;
	
	Node(String key, String value) {
		this.key = key;
		this.value = value;
		//next = null;
	}
	
	
	public void setKey(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return this.key;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
}


public static void main(String[] args) {
	myHashMap ob = new myHashMap();
	//ob.put("cat", "animal");
	ob.put("abhi", "cruel");
	System.out.println(ob.get("abhi"));
	ob.put("abhi", "cunning");
	System.out.println(ob.get("cat"));
	System.out.println(ob.get("abhi"));
	
	
}
}
