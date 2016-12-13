/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null){
            return null;
        }
        else if (head.next == null){
            TreeNode root = new TreeNode(head.val);
            return root;
        }
        else{
            ListNode preMedian = this.findPreMedian(head);
            ListNode median = preMedian.next;
            preMedian.next = null;
            ListNode secondHead = median.next;
            median.next = null;
            
            TreeNode root = new TreeNode(median.val);
            root.left = this.sortedListToBST(head);
            root.right = this.sortedListToBST(secondHead);
            
            return root;
        }
    }
    
    public ListNode findPreMedian(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode preNode = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            preNode = slow;
            slow = slow.next;
        }
        return preNode;
    }
}
