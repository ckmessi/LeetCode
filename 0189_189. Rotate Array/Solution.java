public class Solution {
    public void rotate(int[] nums, int k) {
        
        k = k % nums.length;
        this.reverse(nums, 0, nums.length - 1);
        this.reverse(nums, 0, k-1);
        this.reverse(nums, k, nums.length - 1);
        
        
    }
    
    public void reverse(int[] nums, int start, int end){
        for(int i = start, j = end; i < j; i++, j--){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }
}
