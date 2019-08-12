/*
 * @lc app=leetcode id=662 lang=java
 *
 * [662] Maximum Width of Binary Tree
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
import java.util.AbstractMap;

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int maxWidth = 0;
        Queue<Map.Entry<TreeNode, Integer>> queue = new LinkedList<>();
        queue.offer(new AbstractMap.SimpleEntry(root, 1));

        while(!queue.isEmpty()) {
            int l = queue.peek().getValue();
            int r = l;

            int currentSize = queue.size();
            for(int i = 0; i < currentSize; i++) {
                Map.Entry<TreeNode, Integer> map = queue.poll();
                TreeNode node = map.getKey();
                r = map.getValue();
                if(node.left != null) {
                    queue.offer(new AbstractMap.SimpleEntry(node.left, r * 2));
                }
                if(node.right != null) {
                    queue.offer(new AbstractMap.SimpleEntry(node.right, r * 2 + 1));
                }
            }
            maxWidth = Math.max(maxWidth, r - l + 1);
        }
        return maxWidth;
    }
}


