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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null){
            return list;
        }
        
        List<TreeNode> curLevel = new ArrayList<TreeNode>();
        List<TreeNode> nextLevel = new ArrayList<TreeNode>();
        curLevel.add(root);
        while(curLevel.size() > 0){
            List<Integer> curLine = new ArrayList<Integer>();
            for(int i = 0; i < curLevel.size(); i++){
                curLine.add(curLevel.get(i).val);
                if(curLevel.get(i).left != null){
                    nextLevel.add(curLevel.get(i).left);
                }
                if(curLevel.get(i).right != null){
                    nextLevel.add(curLevel.get(i).right);
                }
            }
            list.add(0, curLine);
            curLevel.clear();
            curLevel.addAll(nextLevel);
            nextLevel.clear();
        }
        return list;
    }
}
