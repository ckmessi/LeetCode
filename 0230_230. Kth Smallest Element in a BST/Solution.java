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
    
    public int count = 0;
    public int res = 0;
    
    public int kthSmallest(TreeNode root, int k) {
        
        this.dfsFind(root, k);
        return this.res;
    }
    public void dfsFind(TreeNode root, int k){
        if(root == null){
            return;
        }
        
        if(this.count > k){
            return;
        }
        
        this.dfsFind(root.left, k);
        
        this.count++;
        if(this.count == k){
            this.res = root.val;   
        }
        
        this.dfsFind(root.right, k);
        
    }
}
