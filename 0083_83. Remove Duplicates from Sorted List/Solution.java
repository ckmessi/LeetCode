/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode preNode = head;
        ListNode p = head.next;
        while(p != null){
            if(p.val != preNode.val){
                preNode.next = p;
                preNode = p;
                p = p.next;
            }
            else{
                p = p.next;
            }
        }
        preNode.next = null;
        
        return head;
    }
}
