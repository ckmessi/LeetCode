/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        
        ListNode median = this.getMedianNode(head);
        ListNode secondHead = median.next;
        median.next = null;
        secondHead = this.reverseList(secondHead);
        
        ListNode p1 = head;
        ListNode p2 = secondHead;
        while(p1 != null && p2 != null){
            if(p1.val != p2.val){
                return false;
            }
            else{
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        return true;
        
    }
    
    public ListNode getMedianNode(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
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
