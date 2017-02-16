public class Solution {
    public int maximumGap(int[] nums) {
        
        if(nums.length < 2){
            return 0;
        }
        
        // step1. find max and min
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            minValue = Math.min(minValue, nums[i]);
            maxValue = Math.max(maxValue, nums[i]);
        }
        
        // step2. calculate the gap
        int bucketGap = (maxValue - minValue) / (nums.length - 1) + 1;
        int[] bucketMin = new int[nums.length - 1];
        int[] bucketMax = new int[nums.length - 1];
        Arrays.fill(bucketMin, Integer.MAX_VALUE);
        Arrays.fill(bucketMax, Integer.MIN_VALUE);
        
        // step3. split into the buckets
        for(int i = 0; i < nums.length; i++){
            int bucketIndex = (nums[i] - minValue) / bucketGap;
            bucketMin[bucketIndex] = Math.min(nums[i], bucketMin[bucketIndex]);
            bucketMax[bucketIndex] = Math.max(nums[i], bucketMax[bucketIndex]);
        }
        
        // step4. find the maximum gap
        int maxGapValue = 0;
        int pre = -1;
        for(int i = 0; i < nums.length - 1; i++){
            if(bucketMin[i] == Integer.MAX_VALUE){
                continue;
            }
            else{
                if(pre == -1){
                    maxGapValue = Math.max(maxGapValue, bucketMax[i] - bucketMin[i]);
                }
                else{
                    maxGapValue = Math.max(maxGapValue, bucketMin[i] - pre);
                }
                pre = bucketMax[i];
            }
        }
        return maxGapValue;
    }
}
