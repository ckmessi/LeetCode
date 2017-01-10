public class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int[] bitSum = new int[32];
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            for(int j = 0; j < 32; j++){
                bitSum[j] += (num >> j) & 1;
                bitSum[j] %= 3;
            }
        }
        int res = 0;
        for(int j = 0; j < 32; j++){
            res = res | (bitSum[j] << j);
        }
        
        return res;
    }
}
