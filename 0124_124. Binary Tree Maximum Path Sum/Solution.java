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
    public int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root == null){
            return 0;
        }
        else {
            this.dfsFind(root);
            return this.maxSum;
        }
    }
    public int dfsFind(TreeNode root){
        if(root.left == null && root.right == null){
            this.maxSum = Math.max(maxSum, root.val);
            return root.val;
        }
        else if (root.left == null){
            int x = this.dfsFind(root.right);
            int currentMax = Math.max(root.val, root.val + x);
            this.maxSum = Math.max(this.maxSum, currentMax);
            return currentMax;
        }
        else if (root.right == null){
            int x = this.dfsFind(root.left);
            int currentMax = Math.max(root.val, root.val + x);
            this.maxSum = Math.max(this.maxSum, currentMax);
            return currentMax;
        }
        else{
            int leftx = this.dfsFind(root.left);
            int rightx = this.dfsFind(root.right);
            int currentMax = Math.max(root.val, root.val + leftx);
            currentMax = Math.max(currentMax, root.val + rightx);
            this.maxSum = Math.max(this.maxSum, currentMax);
            this.maxSum = Math.max(this.maxSum, root.val + leftx + rightx);
            return currentMax;
        }
    }
    
    
}
