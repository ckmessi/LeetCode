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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root == null){
            return list;
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        while(p != null){
            if(p.left != null){
                TreeNode q = p.left;
                p.left = null;
                stack.push(p);
                p = q;
            }
            else{
                list.add(p.val);
                p = p.right;
                if(p == null){
                    if(stack.empty() == false){
                        p = stack.pop();
                    }
                }
            }
        }
        return list;
    }
}
