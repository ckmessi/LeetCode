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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return this.build(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);      
    }
    
    public TreeNode build(int[] inorder, int istart, int iend, int[] postorder, int pstart, int pend){
        if(istart > iend){
            return null;
        }
        else{
            int rval = postorder[pend];
            int pos = 0;
            for(int i = istart; i <= iend; i++){
                if(inorder[i] == rval){
                    pos = i;
                    break;
                }
            }
            TreeNode root = new TreeNode(rval);
            root.left = this.build(inorder, istart, pos - 1, postorder, pstart, pos - 1 - istart + pstart);
            root.right = this.build(inorder, pos + 1, iend, postorder, pend - 1 - iend + pos + 1, pend - 1);
            return root;
        }
    }
}
