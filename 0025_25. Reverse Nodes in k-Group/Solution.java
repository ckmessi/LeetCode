/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        
        if(head == null || head.next == null){
            return head;
        }
        
      
        if(k == 1){
            return head;
        }
        
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode preNode = dummyHead;
        ListNode p = head;
        
        ListNode preTail = preNode;
        
        while(p != null){
            int count = 0;
            for(int i = 0; i < k; i++){
                if(p == null){
                    break;
                }
                else{
                    preNode = p;
                    p = p.next;
                    count++;
                }
            }
            if(count < k){
                break;
            }
            
            ListNode preQ = p;
            ListNode currentTail = preTail.next;
            ListNode q = preTail.next;
            
            while(q != p){
                ListNode tmp = q.next;
                q.next = preQ;
                preQ = q;
                q = tmp;
            }
            preTail.next = preNode;
            
            preTail = currentTail;
            
        }
        
        return dummyHead.next;
    }
}
