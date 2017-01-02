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
    
    public int sum = 0;
    public int sumNumbers(TreeNode root) {
        if(root == null){
            return 0;
        }
        else{
            this.dfsFind(root, 0);
            return this.sum;
        }
    }
    public void dfsFind(TreeNode root, int curValue){
        // assert root != null
        curValue = curValue * 10 + root.val;
        
        if(root.right == null && root.left == null){
            this.sum += curValue;
            return;
        }
        else if (root.right == null){
            this.dfsFind(root.left, curValue);
        }
        else if (root.left == null){
            this.dfsFind(root.right, curValue);
        }
        else {
            this.dfsFind(root.left, curValue);
            this.dfsFind(root.right, curValue);
        }
    }
}
