/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode p = head;
        ListNode preNode = dummyHead;
        while(p != null){
            if(p.val != val){
                preNode = p;
                p = p.next;
            }
            else{
                preNode.next = p.next;
                p = p.next;
            }
        }
        return dummyHead.next;
    }
}
