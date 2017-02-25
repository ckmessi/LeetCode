/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {

    public Stack<TreeNode> stack = new Stack<TreeNode>();
    
    public BSTIterator(TreeNode root) {
        if(root == null){
            return;
        }
        else{
            this.stack.push(root);
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(this.stack.empty() == true){
            return false;
        }
        else{
            TreeNode node = this.stack.pop();
            while(node.left != null){
                TreeNode left = node.left;
                node.left = null;
                stack.push(node);
                node = left;
            }
            this.stack.push(node);
            return true;
        }
    }

    /** @return the next smallest number */
    public int next() {
        // assert that the stack is not empty
        TreeNode node = this.stack.pop();
        if(node.right != null){
            this.stack.push(node.right);
            node.right = null;
        }
        return node.val;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
