class Solution {
    public int totalHammingDistance(int[] nums) {
        int res = 0;
        int[] bits = new int[32];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < 32; j++){
                bits[j] += (nums[i] >> j) & 1;
            }
        }
        for(int j = 0; j < 32; j++){
            res += bits[j] * (nums.length - bits[j]);
        }
        return res;
    }
}
