/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        int length = 0;
        ListNode p = head;
        while(p != null){
            length++;
            p = p.next;
        }
        k = k % length;
        if(k == 0){
            return head;
        }
        
        ListNode preNode = head;
        p = head;
        for(int i = 0; i < length - k; i++){
            preNode = p;
            p = p.next;
        }
        
        ListNode newHead = p;
        while(p.next != null){
            p = p.next;
        }
        p.next = head;
        preNode.next = null;
        
        return newHead;
        
    }
}
