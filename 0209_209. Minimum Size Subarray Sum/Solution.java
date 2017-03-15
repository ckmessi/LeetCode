public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        
        if(nums.length == 0){
            return 0;
        }
        
        int left = 0;
        int right = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        
        while(right < nums.length){
            while(sum < s && right < nums.length){
                sum += nums[right];
                right++;
            }
            if(sum < s){
                break;
            }
            while(sum >= s){
                sum -= nums[left];
                left++;
            }
            
            int len = right - left + 1;
            minLength = Math.min(minLength, len);
            
        }
        
        if(minLength == Integer.MAX_VALUE){
            return 0;
        }
        else{
            return minLength;
        }
        
        
    }
}
