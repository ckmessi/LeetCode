/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        
        if(head == null || head.next == null){
            return;
        }
        
        ListNode medianNode = this.getMedianNode(head);
        ListNode secondHead = medianNode.next;
        medianNode.next = null;
        
        secondHead = this.reverseList(secondHead);
        ListNode p = head;
        ListNode q = secondHead;
        while(p != null && q != null){
            ListNode tmp = p.next;
            p.next = q;
            p = tmp;
            tmp = q.next;
            q.next = p;
            q = tmp;
        }
        
        
    }
    public ListNode getMedianNode(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    
    public ListNode reverseList(ListNode head){
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
