/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if(head == null || head.next == null || head.next.next == null){
            return null;
        }
        
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        
        if(fast != slow){
            return null;
        }
        
        ListNode p = head;
        while(p != slow){
            p = p.next;
            slow = slow.next;
        }
        
        return p;
        
    }
}
