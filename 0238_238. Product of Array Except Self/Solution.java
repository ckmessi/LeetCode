public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                output[i] = 1;
            }
            else{
                output[i] = output[i-1] * nums[i-1];
            }
        }
        int temp1 = 0;
        int temp2 = 0;
        for(int i = nums.length - 1; i >= 0; i--){
            temp1 = nums[i];
            if(i == nums.length - 1){
                nums[i] = 1;
            }
            else{
                nums[i] = nums[i + 1] * temp2;
            }
            temp2 = temp1;
        }
        for(int i = 0; i < nums.length; i++){
            output[i] = output[i] * nums[i];
        }
        return output;
    }
}
