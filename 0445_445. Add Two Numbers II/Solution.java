/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int m = this.getListLength(l1);
        int n = this.getListLength(l2);
        
        ListNode currentHead = this.getAddList(l1, m, l2, n);
        
        ListNode finalHead = this.processAdvance(currentHead);
       
        return finalHead;
        
    }
    
    
    public int getListLength(ListNode head){
        int m = 0;
        ListNode p = head;
        while(p != null){
            m++;
            p = p.next;
        }
        return m;
    }
    
    public ListNode getAddList(ListNode l1, int m, ListNode l2, int n){
        
        ListNode dummyHead = new ListNode(-1);
        ListNode r = dummyHead;
        ListNode p = l1;
        ListNode q = l2;
        if(m >= n){
            for(int i = 0; i < m - n; i++){
                ListNode node = new ListNode(p.val);
                r.next = node;
                r = r.next;
                p = p.next;
            }
        }
        else{
            for(int i = 0; i < n - m; i++){
                ListNode node = new ListNode(q.val);
                r.next = node;
                r = r.next;
                q = q.next;
            }
        }
        while(p != null && q != null){
            int v = p.val + q.val;
            ListNode node = new ListNode(v);
            r.next = node;
            r = r.next;
            p = p.next;
            q = q.next;
        }
        ListNode currentHead = dummyHead.next;
        dummyHead.next = null;
        return currentHead;
    }
    
    public ListNode processAdvance(ListNode head){
        ListNode reverseList = this.reverseNode(head);
        ListNode r = reverseList;
        while(r != null){
            if(r.val >= 10){
                int flag = r.val / 10;
                r.val = r.val % 10;
                if(r.next == null){
                    ListNode newNode = new ListNode(flag);
                    r.next = newNode;
                }
                else{
                    r.next.val += flag;
                }
            }
            r = r.next;
        }
        ListNode finalHead = this.reverseNode(reverseList);
        return finalHead;
    }
    
    public ListNode reverseNode(ListNode head){
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
