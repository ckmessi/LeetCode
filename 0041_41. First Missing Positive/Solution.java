public class Solution {
    public int firstMissingPositive(int[] nums) {
        
        if(nums.length == 0){
            return 1;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0 && nums[i] <= nums.length){
                int targetIndex = nums[i] - 1;
                if(nums[targetIndex] == nums[i]){
                    continue;
                }
                else{
                    int tmp = nums[targetIndex];
                    nums[targetIndex] = nums[i];
                    nums[i] = tmp;
                    i--;
                }
            }
        }
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                return i + 1;
            }
        }
        return nums.length + 1;
    }
}
