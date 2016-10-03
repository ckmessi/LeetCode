public class Solution {
    public int jump(int[] nums) {
        
        int count = 0;
        int maxCanReach = 0;
        int currentReach = 0;
        for(int i = 0; i < nums.length - 1; i++){
            maxCanReach = Math.max(nums[i] + i, maxCanReach);
            if(i >= currentReach){
                count++;
                currentReach = maxCanReach;
            }
        }
        
        return count;
    }
}
