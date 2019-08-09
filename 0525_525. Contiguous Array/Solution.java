/*
 * @lc app=leetcode id=525 lang=java
 *
 * [525] Contiguous Array
 */
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxLength = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i] == 1 ? 1 : -1;
            if(map.get(sum) != null) {
                int pos = map.get(sum);
                maxLength = Math.max(maxLength, i - pos);
            }
            else{
                map.put(sum, i);
            }
        }
        return maxLength;
    }
}


