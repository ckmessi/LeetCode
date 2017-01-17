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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root == null){
            return list;
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        while(p != null){
            list.add(p.val);
            if(p.right != null){
                stack.push(p.right);
                p.right = null;
            }
            if(p.left != null){
                stack.push(p.left);
                p.left = null;
            }
            if(stack.empty() == false){
                p = stack.pop();
            }
            else{
                p = null;
            }
        }
        return list;
    }
}
