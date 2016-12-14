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
    public boolean isBalanced(TreeNode root) {
        
        int height = this.checkBalance(root);
        if(height < 0){
            return false;
        }
        else{
            return true;
        }
    }
    
    public int checkBalance(TreeNode root){
        if(root == null){
            return 0;
        }
        
        int leftHeight = this.checkBalance(root.left);
        int rightHeight = this.checkBalance(root.right);
        if(leftHeight < 0 || rightHeight < 0){
            return -1;
        }
        else if (Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        }
        else{
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
