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
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }   
        
        int leftHeight = this.countLeftHeight(root.left);
        int rightHeight = this.countRightHeight(root.right);
        if(leftHeight == rightHeight){
            return (1 << (leftHeight + 1)) - 1;
        }
        else{
            return 1 + this.countNodes(root.left) + this.countNodes(root.right);
        }
    }
    
    public int countLeftHeight(TreeNode root){
        int left = 0;
        while(root != null){
            left++;
            root = root.left;
        }
        return left;
    }
    
    public int countRightHeight(TreeNode root){
        int right = 0;
        while(root != null){
            right++;
            root = root.right;
        }
        return right;
    }
    
}
