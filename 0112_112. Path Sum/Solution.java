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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        
        boolean res = this.checkPathSum(root, sum);
        return res;
    }
    
    public boolean checkPathSum(TreeNode root, int sum){
        // asset root != null
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            if(root.val == sum){
                return true;
            }
            else{
                return false;
            }
        }
        else if (root.right == null){
            return this.checkPathSum(root.left, sum - root.val);
        }
        else if (root.left == null){
            return this.checkPathSum(root.right, sum - root.val);
        }
        else{
            boolean r1 = this.checkPathSum(root.left, sum - root.val);
            boolean r2 = this.checkPathSum(root.right, sum - root.val);
            return r1 || r2;
        }
    }
}
