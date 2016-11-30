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
    public boolean isValidBST(TreeNode root) {
        return checkValid(root, false, Integer.MIN_VALUE, false, Integer.MAX_VALUE);
    }
    
    public boolean checkValid(TreeNode root, boolean minValid, int allowMin, boolean maxValid, int allowMax){
        if(root == null){
            return true;
        }
        if(minValid == true && root.val <= allowMin){
            return false;
        }
        if(maxValid == true && root.val >= allowMax){
            return false;
        }
        
        boolean res1 = this.checkValid(root.left, minValid, allowMin, true, Math.min(root.val, allowMax));
        boolean res2 = this.checkValid(root.right, true, Math.max(allowMin, root.val), maxValid, allowMax);
        return res1 && res2;
        
    }
}
