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
    
    public int count = 0;
    public int pathSum(TreeNode root, int sum) {
        HashMap<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
        this.dfsTravel(root, sum, sumMap);
        return this.count;
    }
    public void dfsTravel(TreeNode root, int sum, HashMap<Integer, Integer> sumMap){
        if(root == null){
            return;
        }        
        HashMap<Integer, Integer> nextMap = new HashMap<Integer, Integer>();
        Iterator<Integer> iter = sumMap.keySet().iterator();
        System.out.print("---");
        while(iter.hasNext() == true){
            int key = iter.next();
            nextMap.put(key + root.val, sumMap.get(key));
        }
        nextMap.put(root.val, nextMap.containsKey(root.val) ? nextMap.get(root.val) + 1 : 1);
        if(nextMap.containsKey(sum) == true){
            this.count += nextMap.get(sum);
        }
        this.dfsTravel(root.left, sum, nextMap);
        this.dfsTravel(root.right, sum, nextMap);
    }
}
