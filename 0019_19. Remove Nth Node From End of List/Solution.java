/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        
        ListNode fast = head;
        ListNode slow = head;
        for(int i = 0; i < n; i++){
            if(fast == null){
                // 非法输入
                return null;
            }
            else{
                fast = fast.next;
            }
        }
        
        ListNode preNode = null;
        while(fast != null){
            fast = fast.next;
            preNode = slow;
            slow = slow.next;
        }
        
        if(preNode == null){
            // the node to delete is head
            return head.next;
        }
        else{
            preNode.next = preNode.next.next;
            return head;
        }
    }
}
