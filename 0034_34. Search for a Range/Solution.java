public class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        
        if(nums.length == 0){
            return res;
        }
        
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] < target){
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        
        if(nums[left] == target){
            res[0] = left;
        }
        else{
            return res;
        }
        
        right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2 + 1;
            if(nums[mid] > target){
                right = mid - 1;
            }
            else {
                left = mid;
            }
        }
        
        res[1] = right;
        
        return res;
    }
}
