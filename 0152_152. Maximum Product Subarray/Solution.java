public class Solution {
    public int maxProduct(int[] nums) {
        int[] maxArray = new int[nums.length];
        int[] minArray = new int[nums.length];
        int gMax = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                maxArray[i] = nums[i];
                minArray[i] = nums[i];
            }
            else{
                int maxValue = Math.max(maxArray[i-1] * nums[i], minArray[i-1] * nums[i]);
                maxValue = Math.max(maxValue, nums[i]);
                int minValue = Math.min(maxArray[i-1] * nums[i], minArray[i-1] * nums[i]);
                minValue = Math.min(minValue, nums[i]);
                maxArray[i] = maxValue;
                minArray[i] = minValue;
            }
            gMax = Math.max(gMax, maxArray[i]);
        }
        return gMax;
    }
}
