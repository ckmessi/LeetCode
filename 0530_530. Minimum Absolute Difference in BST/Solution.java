/*
 * @lc app=leetcode id=530 lang=java
 *
 * [530] Minimum Absolute Difference in BST
 */
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

    public int minDifference;

    public int getMinimumDifference(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 0;
        }
        this.minDifference = Integer.MAX_VALUE;
        this.travelToFindMinimumAndMaximum(root);
        return minDifference;
    }

    private int[] travelToFindMinimumAndMaximum(TreeNode root) {
        // assert root != null
        int[] value = new int[2];
        value[0] = root.val;
        value[1] = root.val;
        if(root.left != null){
            int[] leftValueArray = travelToFindMinimumAndMaximum(root.left);
            minDifference = Math.min(minDifference, Math.abs(root.val - leftValueArray[1]));
            value[0] = Math.min(value[0], leftValueArray[0]);
        }
        if(root.right != null) {
            int[] rightValueArray = travelToFindMinimumAndMaximum(root.right);
            minDifference = Math.min(minDifference, Math.abs(rightValueArray[0] - root.val));
            value[1] = Math.max(value[1], rightValueArray[1]);        
        }
        return value;
    }
}


