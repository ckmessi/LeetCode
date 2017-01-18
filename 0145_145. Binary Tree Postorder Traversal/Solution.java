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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root == null){
            return list;
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        TreeNode p = null;
        while(stack.empty() == false){
            p = stack.pop();
            if(p.left == null && p.right == null){
                list.add(p.val);
            }
            else if (p.left == null) {
                TreeNode q = p.right;
                p.right = null;
                stack.push(p);
                stack.push(q);
            }
            else if (p.right == null){
                TreeNode q = p.left;
                p.left = null;
                stack.push(p);
                stack.push(q);
            }
            else{
                TreeNode q1 = p.left;
                TreeNode q2 = p.right;
                p.left = null;
                p.right = null;
                stack.push(p);
                stack.push(q2);
                stack.push(q1);
            }
        }
        
        return list;
        
    }
}
