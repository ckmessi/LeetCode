/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode dummyHead = new ListNode(-1);
        ListNode p = head;
        ListNode q = null;
        ListNode m = dummyHead.next;
        ListNode preMNode = dummyHead;
        while(p != null){
            q = p.next;
            p.next = null;
            // insert to another list
            preMNode = dummyHead;
            m = dummyHead.next;
            while(m != null && m.val < p.val){
                preMNode = m;
                m = m.next;
            }
            preMNode.next = p;
            p.next = m;
            
            p = q;
        }
        
        return dummyHead.next;
        
    }
}
