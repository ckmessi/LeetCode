tion for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null){
            return list;
        }
        
        List<TreeNode> curLevel = new ArrayList<TreeNode>();
        List<TreeNode> nextLevel = new ArrayList<TreeNode>();
        curLevel.add(root);
        int count = 0;
        while(curLevel.size() > 0){
            count++;
            List<Integer> line = new ArrayList<Integer>();
            for(int i = 0; i < curLevel.size(); i++){
                if(count % 2 == 1){
                    line.add(curLevel.get(i).val);
                }
                else{
                    line.add(0, curLevel.get(i).val);
                }
                
                if(curLevel.get(i).left != null){
                    nextLevel.add(curLevel.get(i).left);
                }
                if(curLevel.get(i).right != null){
                    nextLevel.add(curLevel.get(i).right);
                }
            }
            
            list.add(line);
            curLevel.clear();
            curLevel.addAll(nextLevel);
            nextLevel.clear();
        }
        
        return list;
    }
}
