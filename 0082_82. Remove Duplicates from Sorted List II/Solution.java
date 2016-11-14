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
        
        ListNode dummyHead = new ListNode(-1);
        ListNode preNode = head;
        ListNode p = head.next;
        ListNode m = dummyHead;
        
        boolean tailValid = true;
        while(p != null){
            if(p.val != preNode.val){
                if(tailValid == true){
                    m.next = preNode;
                    m = m.next;
                    preNode = p;
                    p = p.next;
                }
                else{
                    preNode = p;
                    p = p.next;
                }
                tailValid = true;
            }
            else{
                tailValid = false;
                p = p.next;
            }
        }
        if(tailValid == true){
            m.next = preNode;
            m.next.next = null;
        }
        else{
            m.next = null;
        }
        
        return dummyHead.next;
    }
}
