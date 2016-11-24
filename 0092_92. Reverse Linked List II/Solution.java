/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        
        ListNode preNode = dummyHead;
        ListNode p = head;
        for(int i = 1; i < m; i++){
            preNode = p;
            p = p.next;
        }
        
        ListNode firstTail = preNode;
        ListNode secondTail = p;
        ListNode q = null;
        preNode = p;
        p = p.next;
        for(int i = m + 1; i <= n; i++){
            q = p.next;
            p.next = preNode;
            preNode = p;
            p = q;
        }
        
        // preNode is secondHead
        // p is thirdHead
        
        firstTail.next = preNode;
        secondTail.next = p;
        
        return dummyHead.next;
        
        
        
    }
}
