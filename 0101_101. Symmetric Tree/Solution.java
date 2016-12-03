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
    public boolean isSymmetric(TreeNode root) {
        
        if(root == null){
            return true;
        }
        
        return this.checkSymmetric(root.left, root.right);
        
    }
    public boolean checkSymmetric(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        else if (left == null || right == null){
            return false;
        }
        else{
            if(left.val != right.val){
                return false;
            }
            else{
                return this.checkSymmetric(left.left, right.right) && this.checkSymmetric(left.right, right.left);
            }
        }
    }
}
