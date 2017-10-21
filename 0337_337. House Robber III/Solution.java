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
    public int rob(TreeNode root) {
        return this.dfsTravel(root, false);
    }
    
    public int dfsTravel(TreeNode root, boolean parentRobbed){
        if(root == null){
            return 0;
        }
        if(parentRobbed == true){
            return this.dfsTravel(root.left, false) + this.dfsTravel(root.right, false);
        }
        else{
            int res1 = this.dfsTravel(root.left, true) + this.dfsTravel(root.right, true);
            int res2 = this.dfsTravel(root.left, false) + this.dfsTravel(root.right, false);
            return Math.max(res1 + root.val, res2);
        }
    }
}
