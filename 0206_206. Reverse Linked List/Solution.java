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
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode preNode = null;
        ListNode p = head;
        ListNode q = null;
        while(p != null){
            q = p.next;
            p.next = preNode;
            preNode = p;
            p = q;
        }
        
        return preNode;
    }
}
