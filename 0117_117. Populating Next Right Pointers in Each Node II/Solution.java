/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        
        if(root == null){
            return;
        }
        
        TreeLinkNode x = root;
        while(x != null){
        
            if(x.left != null){
                if(x.right != null){
                    x.left.next = x.right;
                }
                else{
                    x.left.next = this.getNextNode(x.next);
                }
            }
            if(x.right != null){
                x.right.next = this.getNextNode(x.next);
            }
            x = x.next;
        }
            
        this.connect(root.left);
        this.connect(root.right);
    }
    
    public TreeLinkNode getNextNode(TreeLinkNode root){
        if(root == null){
            return null;
        }
        while(root != null){
            if(root.left != null){
                return root.left;
            }
            if(root.right != null){
                return root.right;
            }
            root = root.next;
        }
        return null;
    }
}
