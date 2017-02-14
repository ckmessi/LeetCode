/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int lengthA = 0;
        int lengthB = 0;
        ListNode pa = headA;
        while(pa != null){
            lengthA++;
            pa = pa.next;
        }
        ListNode pb = headB;
        while(pb != null){
            lengthB++;
            pb = pb.next;
        }
        
        pa = headA;
        pb = headB;
        if(lengthA >= lengthB){
            for(int i = 0; i < lengthA - lengthB; i++){
                pa = pa.next;
            }
        }
        else{
            for(int i = 0; i < lengthB - lengthA; i++){
                pb = pb.next;
            }
        }
        
        while(pa != null && pb != null){
            if(pa == pb){
                break;
            }
            pa = pa.next;
            pb = pb.next;
        }
        return pa;
        
    }
}
