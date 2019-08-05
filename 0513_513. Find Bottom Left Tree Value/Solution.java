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
    private int maxDepth;
    private int targetValue;
    private boolean findTarget;
    
    public int findBottomLeftValue(TreeNode root) {
        this.maxDepth = findDepth(root);
        this.findTarget = false;
        
        this.preOrderTravel(root, 1);
        return this.targetValue;
        
    }
    
    private int findDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftDepth = findDepth(root.left);
        int rightDepth = findDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
    
    public void preOrderTravel(TreeNode root, int depth) {
        if(root == null){
            return;
        }
        if(this.findTarget == true){
            return;
        }
        
        if(depth == this.maxDepth) {
            targetValue = root.val;
            findTarget = true;
        }
        
        this.preOrderTravel(root.left, depth + 1);
        this.preOrderTravel(root.right, depth + 1);        
    }
}
