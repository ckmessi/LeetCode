public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2){
            return nums.length;
        }
        int pos = 0;
        for(int i = 0; i < nums.length; i++){
            if(i < 2){
                pos++;
            }
            else{
                if(nums[i] == nums[pos - 2] && nums[i] == nums[pos - 1]){
                    continue;
                }
                else{
                    nums[pos] = nums[i];
                    pos++;
                }
            }
        }
        return pos;
    }
}
