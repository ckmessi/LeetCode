public class Solution {
    public int[] singleNumber(int[] nums) {
        
        int diff = 0;
        for(int i = 0; i < nums.length; i++){
            diff = diff ^ nums[i];
        }
        
        int mask = diff & (-diff);
        int res1 = 0;
        int res2 = 0;
        for(int i = 0; i < nums.length; i++){
            if((nums[i] & mask) == 0){
                res1 ^= nums[i];
            }
            else{
                res2 ^= nums[i];
            }
        }
        
        int[] res = new int[2];
        res[0] = res1;
        res[1] = res2;
        return res;
        
    }
}
