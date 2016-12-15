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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        else if (root.left == null && root.right == null){
            return 1;
        }
        else if (root.left == null){
            return this.minDepth(root.right) + 1;
        }
        else if (root.right == null){
            return this.minDepth(root.left) + 1;
        }
        else{
            return Math.min(this.minDepth(root.left), this.minDepth(root.right)) + 1;
        }
    }
}
