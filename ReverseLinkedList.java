package misc;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
         ListNode previous = null;
         ListNode current = null;
        while(current!= null){
           current = head.next;
           head.next = previous;
           previous = head;
           head =current;
           
        }
        return head;
    }
}

ListNode next = head.next;
head.next = newHead;
newHead = head;
head = next;