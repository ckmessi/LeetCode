/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode oddHead = head;
        ListNode m = oddHead;
        ListNode evenHead = head.next;
        ListNode n = evenHead;
        ListNode p = head.next.next;
        oddHead.next = null;
        evenHead.next = null;
        int count = 0;
        while(p != null){
            count++;
            if(count % 2 == 1){
                m.next = p;
                m = m.next;
                p = p.next;
            }
            else{
                n.next = p;
                n = n.next;
                p = p.next;
            }
        }
        m.next = evenHead;
        n.next = null;
        return oddHead;
    }
}
