public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        if(nums.length < 3){
            return 0;
        }
        
        Arrays.sort(nums);
        
        int minDis = Integer.MAX_VALUE;
        int closestValue = 0;
        for(int i = 0; i < nums.length; i++){
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(Math.abs(sum - target) < minDis){
                    minDis = Math.abs(sum - target);
                    closestValue = sum;
                }
                if(sum < target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        
        return closestValue;
        
    }
}
