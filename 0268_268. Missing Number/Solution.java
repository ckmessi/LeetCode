public class Solution {
    public int missingNumber(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == i){
                continue;
            }
            else{
                int target_index = nums[i];
                if(target_index >= nums.length){
                    continue;
                }
                if(nums[target_index] == nums[i]){
                    continue;
                }
                else{
                    int tmp = nums[i];
                    nums[i] = nums[target_index];
                    nums[target_index] = tmp;
                    i--;
                }
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }
}
