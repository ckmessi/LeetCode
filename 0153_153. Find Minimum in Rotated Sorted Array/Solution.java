public class Solution {
    public int findMin(int[] nums) {
        
        if(nums.length == 0){
            return 0;
        }
        
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            if(nums[left] < nums[right]){
                break;
            }
            int mid = left + (right - left) / 2;
            if(nums[left] < nums[mid]){
                left = mid + 1;
            }
            else if (nums[left] == nums[mid]){
                left++;
            }
            else{
                right = mid;
            }
        }
        return nums[left];
    }
}
