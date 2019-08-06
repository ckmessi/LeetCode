mport java.util.ArrayList;

/*
 * @lc app=leetcode id=515 lang=java
 *
 * [515] Find Largest Value in Each Tree Row
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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }

        List<TreeNode> currentRow = new ArrayList<>();
        currentRow.add(root);
        List<TreeNode> nextRow = new ArrayList<>();
        while(currentRow.size() > 0) {
            int maxValue = Integer.MIN_VALUE;
            for(int i = 0; i < currentRow.size(); i++){
                TreeNode node = currentRow.get(i);
                maxValue = Math.max(maxValue, node.val);
                if(node.left != null){
                    nextRow.add(node.left);
                }
                if(node.right != null) {
                    nextRow.add(node.right);
                }
            }
            list.add(maxValue);
            currentRow.clear();
            currentRow.addAll(nextRow);
            nextRow.clear();
        }

        return list;
    }
}


