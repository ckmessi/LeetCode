/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists.length == 0){
            return null;
        }
        
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(1001, new Comparator<ListNode>(){
            public int compare(ListNode l1, ListNode l2){
                return l1.val - l2.val;
            }
        });
        
        for(int i = 0; i < lists.length; i++){
            if(lists[i] != null){
                pq.offer(lists[i]);
            }
        }
        
        ListNode dummyHead = new ListNode(-1);
        ListNode p = dummyHead;
        while(pq.size() > 0){
            ListNode current = pq.poll();
            ListNode nextNode = current.next;
            current.next = null;
            p.next = current;
            p = p.next;
            if(nextNode != null){
                pq.offer(nextNode);
            }
        }
        
        return dummyHead.next;
        
    }
}
