/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode dummyHead = new ListNode(-1);
        ListNode preNode = dummyHead;
        dummyHead.next = head;
        ListNode p = head;
        
        while(p != null && p.next != null){
            preNode.next = p.next;
            p.next = p.next.next;
            preNode.next.next = p;
            
            preNode = p;
            p = p.next;
        }
        
        return dummyHead.next;
        
    }
}
