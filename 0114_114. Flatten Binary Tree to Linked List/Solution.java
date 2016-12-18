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
    public void flatten(TreeNode root) {
        
        if(root == null){
            return;
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        while(stack.isEmpty() == false || p != null){
            if(p.left == null && p.right == null){
                if(stack.isEmpty() == false){
                    TreeNode q = stack.pop();
                    p.right = q;
                    p = q;
                }
                else{
                    p = null;
                }
            }
            else if (p.right == null){
                p.right = p.left;
                p.left = null;
                p = p.right;
            }
            else if (p.left == null){
                p = p.right; 
            }
            else{
                stack.push(p.right);
                p.right = p.left;
                p.left = null;
                p = p.right;
            }
        }
        
        return;
        
    }
}
