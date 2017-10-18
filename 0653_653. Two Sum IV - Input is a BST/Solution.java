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
    public HashSet<Integer> valSet = new HashSet<Integer>();
    
    public boolean findTarget(TreeNode root, int k) {
        if(root == null){
            return false;
        }
        if(this.valSet.contains(k - root.val) == true){
            return true;
        }
        this.valSet.add(root.val);
        return this.findTarget(root.left, k) || this.findTarget(root.right, k);
    }
    
}
