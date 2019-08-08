import java.util.HashMap;
import java.util.HashSet;

/*
 * @lc app=leetcode id=523 lang=java
 *
 * [523] Continuous Subarray Sum
 */
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        if(nums.length < 2) {
            return false;
        }
        k = Math.abs(k);
        if(k == 1) {
            return true;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(k != 0) {
                sum %= k;
            }
            Integer prev = map.get(sum);
            if(prev != null){
                if(i - prev > 1) {
                    return true;
                }
            }
            else {
                map.put(sum, i);
            }
        }    
        return false;
    }       
}


