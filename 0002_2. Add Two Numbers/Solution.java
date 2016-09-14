/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1 == null){
            return l2;
        }
        
        if(l2 == null){
            return l1;
        }
        
        ListNode head = new ListNode(-1);
        ListNode p = null;
        ListNode preNode = head;
        
        ListNode p1 = l1;
        ListNode p2 = l2;
        int flag = 0;
        while(p1 != null || p2 != null){
            int sum = 0;
            if(p1 != null){
                sum += p1.val;
                p1 = p1.next;
            }
            if(p2 != null){
                sum += p2.val;
                p2 = p2.next;
            }
            sum = sum + flag;
            flag = sum / 10;
            sum = sum % 10;
            p = new ListNode(sum);
            preNode.next = p;
            preNode = p;
        }
        
        if(flag != 0){
            p = new ListNode(flag);
            preNode.next = p;
        }
        
        return head.next;
        
    }
}
