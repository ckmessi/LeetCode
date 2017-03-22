public class Solution {
    public int findKthLargest(int[] nums, int k) {
        return this.quickSelect(nums, 0, nums.length - 1, k - 1);
    }
    
    public int quickSelect(int[] nums, int left, int right, int k){
        int mid = left;
        for(int i = left; i < right; i++){
            if(nums[i] > nums[right]){
                this.swap(nums, i, mid);
                mid++;
            }
        }
        this.swap(nums, mid, right);
        if(mid == k){
            return nums[mid];
        }
        else if (mid > k){
            return this.quickSelect(nums, left, mid - 1, k);
        }
        else{
            return this.quickSelect(nums, mid + 1, right, k);
        }
    }
    
    public void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
