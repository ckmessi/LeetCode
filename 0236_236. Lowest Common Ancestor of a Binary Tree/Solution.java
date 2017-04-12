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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null){
            return null;
        }
        else if(root == p){
            return p;
        }
        else if(root == q){
            return q;
        }
        else {
            TreeNode left = this.lowestCommonAncestor(root.left, p, q);
            TreeNode right = this.lowestCommonAncestor(root.right, p, q);
            if(left == null){
                return right;
            }
            else if (right == null){
                return left;
            }
            else{
                return root;
            }
            
        }
        
    }
}
