/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    private int maxDiameter = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }
        maxHeight(root);
        return maxDiameter;
    }
    
    
    public int maxHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            maxDiameter = Math.max(maxDiameter, 0);
            return 1;
        }
        else if (root.left == null) {
            int rightHeight = maxHeight(root.right);
            maxDiameter = Math.max(maxDiameter, rightHeight);
            return rightHeight + 1;
        }
        else if (root.right == null) {
            int leftHeight = maxHeight(root.left);
            maxDiameter = Math.max(maxDiameter, leftHeight);
            return leftHeight + 1;
        }
        else{
            int leftHeight = maxHeight(root.left);
            int rightHeight = maxHeight(root.right);
            maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);
            // System.out.println("root.val:" + root.val + ", maxDiameter:" + maxDiameter);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
