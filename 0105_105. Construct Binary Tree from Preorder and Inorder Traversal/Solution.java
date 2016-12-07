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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        return this.build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
    
    public TreeNode build(int[] preorder, int pstart, int pend, int[] inorder, int istart, int iend){
        if(pstart > pend){
            return null;
        }
        else{
            int rootval = preorder[pstart];
            int pos = 0;
            for(int i = istart; i <= iend; i++){
                if(inorder[i] == rootval){
                    pos = i;
                    break;
                }
            }
            TreeNode root = new TreeNode(rootval);
            root.left = this.build(preorder, pstart + 1, pos - 1 - istart + pstart + 1, inorder, istart, pos - 1);
            root.right = this.build(preorder, pend - iend + pos + 1, pend, inorder, pos + 1, iend);
            return root;
        }
    }
}
