package misc;



 
public class LinkedMerge {
    public static ListNodes mergeTwoLists(ListNodes l1, ListNodes l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        
        ListNodes mergeHead;
        if(l1.val < l2.val){
            mergeHead = l1;
            mergeHead.next = mergeTwoLists(l1.next, l2);
        }
        else{
            mergeHead = l2;
            mergeHead.next = mergeTwoLists(l1, l2.next);
        }
        return mergeHead;
    }
    
 


    public static void main(String[] args) {
    	ListNodes l1 = new ListNodes(2);
    	l1.next = new ListNodes(10);
    	l1.next = new ListNodes(30);
    	
    	ListNodes l2 = new ListNodes(20);
    	l2.next = new ListNodes(40);
    	l2.next = new ListNodes(80);
    	
    	ListNodes l = mergeTwoLists(l1, l2);
    	while(l!=null) {
    		System.out.println(l.val);
    		l=l.next;
    	}
	}
}

class ListNodes {
    int val;
    ListNodes next;
    ListNodes(int x) { val = x; }
}
