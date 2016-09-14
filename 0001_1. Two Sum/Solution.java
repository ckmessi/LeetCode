public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] res = new int[2];
        HashMap<Integer, Integer> record = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            record.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            int remain = target - nums[i];
            if(record.containsKey(remain) == true && record.get(remain) != i){
                res[0] = record.get(remain);
                res[1] = i;
                break;
            }
        }
        return res;
    }
}
