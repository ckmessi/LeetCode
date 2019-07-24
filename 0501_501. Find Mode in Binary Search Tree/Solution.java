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
    
    public int currentCount = 0;
    public int maxModeCount = 0;
    public ArrayList<Integer> modeList;
    
    public int[] findMode(TreeNode root) {
        if(root == null){
            return new int[0];
        }
        
        this.currentCount = 0;
        this.maxModeCount = 0;
        this.inorderTravel(root, 0);
        
        this.modeList = new ArrayList<>();
        this.currentCount = 0;
        this.inorderTravelToCollect(root, 0);
        return this.modeList.stream().mapToInt(Integer::valueOf).toArray();
    }
    
    public int inorderTravel(TreeNode root, int prev) {
        // assert root is not null
        if(root.left != null){
            prev = this.inorderTravel(root.left, prev);
        }
        
        // 比较
        if(this.currentCount == 0){
            // 第一次
            this.currentCount++;
        }
        else{
            if(prev == root.val) {
                currentCount++;
            }
            else {
                currentCount = 1;
            }
        }
        
        if(currentCount > maxModeCount) {
            maxModeCount = currentCount;
        }
        
        // System.out.println(root.val + "->");
        
        // 遍历右结点
        if(root.right != null){
            return this.inorderTravel(root.right, root.val);   
        }
        else{
            return root.val;
        }
    }
    
    public int inorderTravelToCollect(TreeNode root, int prev) {
        // assert root is not null
        if(root.left != null){
            prev = this.inorderTravelToCollect(root.left, prev);
        }
        
        // System.out.println(root.val + "|->");
        // 比较
        if(this.currentCount == 0){
            // 第一次
            this.currentCount++;
        }
        else{
            if(prev == root.val) {
                this.currentCount++;
            }
            else {
                this.currentCount = 1;
            }
        }
        
        // System.out.println(this.currentCount + "," + this.maxModeCount);
        if(this.currentCount == this.maxModeCount) {
            // System.out.println(prev);
            this.modeList.add(root.val);
        }
        
        // 遍历右结点
        if(root.right != null){
            return this.inorderTravelToCollect(root.right, root.val);   
        }
        else{
            return root.val;
        }
    }
}
