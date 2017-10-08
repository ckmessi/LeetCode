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
    
    class MinimumInfo {
        int minimum;
        int secondMinimum;
    }
    
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null){
            return -1;
        }
        MinimumInfo minimumInfo = this.dfsSearchTree(root);
        return minimumInfo.secondMinimum;
    }
    
    public MinimumInfo dfsSearchTree(TreeNode root){
        if(root.left == null && root.right == null){
            MinimumInfo minimumInfo = new MinimumInfo();
            minimumInfo.minimum = root.val;
            minimumInfo.secondMinimum = -1;
            return minimumInfo;
        }
        else{
            MinimumInfo leftMiniInfo = this.dfsSearchTree(root.left);
            MinimumInfo rightMiniInfo = this.dfsSearchTree(root.right);
            MinimumInfo minimumInfo = this.mergeMinimumInfo(root, leftMiniInfo, rightMiniInfo);
            return minimumInfo;
        }
    }
    
    public MinimumInfo mergeMinimumInfo(TreeNode root, MinimumInfo leftMiniInfo, MinimumInfo rightMiniInfo){
        MinimumInfo minimumInfo = new MinimumInfo();
        if(leftMiniInfo.minimum == rightMiniInfo.minimum){
            if(root.val < leftMiniInfo.minimum){
                minimumInfo.minimum = root.val;
                minimumInfo.secondMinimum = leftMiniInfo.minimum;
            }   
            else{
                minimumInfo.minimum = root.val;
                if(leftMiniInfo.secondMinimum == -1){
                    minimumInfo.secondMinimum = rightMiniInfo.secondMinimum;
                }   
                else if (rightMiniInfo.secondMinimum == -1){
                    minimumInfo.secondMinimum = leftMiniInfo.secondMinimum;
                }
                else{
                    minimumInfo.secondMinimum = Math.min(leftMiniInfo.secondMinimum, rightMiniInfo.secondMinimum);
                }
            }
        }   
        else{
            if(root.val < Math.min(leftMiniInfo.minimum, rightMiniInfo.minimum)){
                minimumInfo.minimum = root.val;
                minimumInfo.secondMinimum = Math.min(leftMiniInfo.minimum, rightMiniInfo.minimum);                
            }
            else{
                minimumInfo.minimum = root.val;
                if(leftMiniInfo.minimum < rightMiniInfo.minimum){
                    if(leftMiniInfo.secondMinimum == -1){
                        minimumInfo.secondMinimum = rightMiniInfo.minimum;
                    }
                    else{
                        minimumInfo.secondMinimum = Math.min(leftMiniInfo.secondMinimum, rightMiniInfo.minimum);                
                    }
                }
                else{
                    if(rightMiniInfo.secondMinimum == -1){
                        minimumInfo.secondMinimum = leftMiniInfo.minimum;
                    }
                    else{
                        minimumInfo.secondMinimum = Math.min(rightMiniInfo.secondMinimum, leftMiniInfo.minimum);                
                    }
                }
            }
        }
        return minimumInfo;
    }
}
