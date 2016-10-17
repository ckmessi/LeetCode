public class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length <= 1){
            return true;
        }
        
        int farestPos = 0;
        for(int i = 0; i < nums.length - 1; i++){
            farestPos = Math.max(farestPos, i + nums[i]);
            if(farestPos <= i){
                return false;
            }
        }
        return true;
        
    }
}
