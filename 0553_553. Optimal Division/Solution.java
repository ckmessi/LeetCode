/*
 * @lc app=leetcode id=553 lang=java
 *
 * [553] Optimal Division
 */
class Solution {
    public String optimalDivision(int[] nums) {
        if(nums.length == 0){
            return "0";
        }
        if(nums.length == 1){
            return String.valueOf(nums[0]);
        }
        if(nums.length == 2){
            return nums[0] + "/" + nums[1];
        }

        String res = "";
        res += String.valueOf(nums[0]) + "/(";
        for(int i = 1; i < nums.length; i++){
            res += String.valueOf(nums[i]);
            if(i < nums.length - 1){
                res += "/";
            }
            else{
                res += ")";
            }
        }

        return res;
    }
}


