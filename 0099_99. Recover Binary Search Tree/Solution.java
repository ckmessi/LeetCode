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
    public TreeNode p = null;
    public TreeNode q = null;
    public void recoverTree(TreeNode root) {
        if(root == null){
            return;
        }
        
        this.dfsFind(root, null);
        if(this.p != null){
            int tmp = this.p.val;
            this.p.val = this.q.val;
            this.q.val = tmp;
        }
        
        return;
    }
    
    public TreeNode dfsFind(TreeNode root, TreeNode preNode){
        if(root == null){
            return preNode;
        }
        
        if(root.left != null){
            preNode = this.dfsFind(root.left, preNode);
        }
        
        if(preNode != null && preNode.val >= root.val){
            if(this.p == null){
                this.p = preNode;
                this.q = root;
            }
            else{
                this.q = root;
            }
        }
        
        preNode = this.dfsFind(root.right, root);
        return preNode;
    }
}
