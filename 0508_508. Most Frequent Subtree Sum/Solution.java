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
    
    private HashMap<Integer, Integer> map;
    private int maxSumCount;
    private List<Integer> selectSumList;
    
    public int[] findFrequentTreeSum(TreeNode root) {
        
        this.map = new HashMap<>();
        this.maxSumCount = 0;
        this.selectSumList = new ArrayList<>();
        
        this.sumChild(root);
        this.recordSum(root);
        
        return selectSumList.stream().mapToInt(Integer::valueOf).toArray();     
    }
    
    private int sumChild(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftSum = this.sumChild(root.left);
        int rightSum = this.sumChild(root.right);
        int sum = leftSum + rightSum + root.val;
        root.val = sum;
        return sum;
    }
    
    private void recordSum(TreeNode root) {
        if(root == null) {
            return;
        }
        
        int value = map.getOrDefault(root.val, 0);
        value++;
        map.put(root.val, value);
        if(value > maxSumCount) {
            maxSumCount = value;
            selectSumList.clear();
            selectSumList.add(root.val);
        }
        else if (value == maxSumCount) {
            selectSumList.add(root.val);
        }
        
        this.recordSum(root.left);
        this.recordSum(root.right);
    }
}
