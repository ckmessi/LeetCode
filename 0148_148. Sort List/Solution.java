/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode medianNode = this.getMedianNode(head);
        ListNode secondHead = medianNode.next;
        medianNode.next = null;
        
        head = this.mergeList(this.sortList(head), this.sortList(secondHead));
        
        return head;
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
    public ListNode mergeList(ListNode l1, ListNode l2){
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode dummyHead = new ListNode(-1);
        ListNode q = dummyHead;
        while(p1 != null || p2 != null){
            if(p1 == null){
                q.next = p2;
                p2 = p2.next;
                q = q.next;
            }
            else if (p2 == null){
                q.next = p1;
                p1 = p1.next;
                q = q.next;
            }
            else{
                if(p1.val < p2.val){
                    q.next = p1;
                    p1 = p1.next;
                    q = q.next;
                }
                else{
                    q.next = p2;
                    p2 = p2.next;
                    q = q.next;
                }
            }
        }
        return dummyHead.next;
    }
    
}
