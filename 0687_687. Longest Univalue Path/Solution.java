/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    
    
    class NodePathInfo {
        public int innerPath;
        public int rootPath;
    }
    
    public int longestUnivaluePath(TreeNode root) {
        if(root == null){
            return 0;
        }
        NodePathInfo nodePathInfo = this.dfsSearchTree(root);
        return nodePathInfo.innerPath;
    }
    
    public NodePathInfo dfsSearchTree(TreeNode root){
        NodePathInfo nodePathInfo = new NodePathInfo();
        if(root.left == null && root.right == null){
            nodePathInfo.innerPath = 0;
            nodePathInfo.rootPath = 0;
        }
        else if (root.left == null){
            NodePathInfo rightPathInfo = this.dfsSearchTree(root.right);
            if(root.val == root.right.val){
                nodePathInfo.rootPath = rightPathInfo.rootPath + 1;
            }
            else{
                nodePathInfo.rootPath = 0;
            }
            nodePathInfo.innerPath = Math.max(rightPathInfo.innerPath, nodePathInfo.rootPath);
            return nodePathInfo;            
        }
        else if (root.right == null){
            NodePathInfo leftPathInfo = this.dfsSearchTree(root.left);
            if(root.val == root.left.val){
                nodePathInfo.rootPath = leftPathInfo.rootPath + 1;
            }
            else{
                nodePathInfo.rootPath = 0;
            }
            nodePathInfo.innerPath = Math.max(leftPathInfo.innerPath, nodePathInfo.rootPath);
            return nodePathInfo;            
        }
        else{
            NodePathInfo leftPathInfo = this.dfsSearchTree(root.left);
            NodePathInfo rightPathInfo = this.dfsSearchTree(root.right);
            int leftRootPath = 0;
            int rightRootPath = 0;
            if(root.val == root.left.val){
                leftRootPath = leftPathInfo.rootPath + 1;
            }
            if(root.val == root.right.val){
                rightRootPath = rightPathInfo.rootPath + 1;
            }
            nodePathInfo.rootPath = Math.max(leftRootPath, rightRootPath);
            nodePathInfo.innerPath = Math.max(leftPathInfo.innerPath, rightPathInfo.innerPath);
            nodePathInfo.innerPath = Math.max(nodePathInfo.innerPath, leftRootPath);
            nodePathInfo.innerPath = Math.max(nodePathInfo.innerPath, rightRootPath);
            if(root.left.val == root.right.val){
                nodePathInfo.innerPath = Math.max(nodePathInfo.innerPath, leftRootPath + rightRootPath);
            }
        }
        return nodePathInfo;
        
    }
}
