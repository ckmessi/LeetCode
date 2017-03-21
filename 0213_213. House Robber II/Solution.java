public class Solution {
    public int rob(int[] nums) {
        
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        
        int[] dp1 = new int[nums.length];
        int[] dp2 = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            dp1[i] = 0;
            dp2[i] = 0;
        }
        // do no take the first
        for(int i = 1; i < nums.length; i++){
            if(i == 1){
                dp1[i] = nums[i];
            }
            else{
                dp1[i] = Math.max(dp1[i-2] + nums[i], dp1[i-1]);
            }
        }
        // do no take the last
        for(int i = 0; i < nums.length - 1; i++){
            if(i == 0){
                dp2[i] = nums[i];
            }
            else if (i == 1){
                dp2[i] = Math.max(dp2[i-1], nums[i]);
            }
            else{
                dp2[i] = Math.max(dp2[i-2] + nums[i], dp2[i-1]);
            }
        }
        
        // 
        int maxProfit = 0;
        for(int i = 0; i < nums.length; i++){
            maxProfit = Math.max(maxProfit, dp1[i]);
            maxProfit = Math.max(maxProfit, dp2[i]);
        }
        return maxProfit;
        
        
    }
}
