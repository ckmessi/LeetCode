public class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxValue = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(sum < 0){
                sum = 0;
            }
            sum += nums[i];
            maxValue = Math.max(maxValue, sum);
        }
        
        return maxValue;
    }
}
