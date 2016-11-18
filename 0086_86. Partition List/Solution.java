/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode dummyHead1 = new ListNode(-1);
        ListNode dummyHead2 = new ListNode(-2);
        ListNode p1 = dummyHead1;
        ListNode p2 = dummyHead2;
        
        ListNode p = head;
        while(p != null){
            if(p.val >= x){
                p2.next = p;
                p2 = p2.next;
            }
            else{
                p1.next = p;
                p1 = p1.next;
            }
            p = p.next;
        }
        
        p1.next = dummyHead2.next;
        p2.next = null;
        
        return dummyHead1.next;
        
        
    }
}
