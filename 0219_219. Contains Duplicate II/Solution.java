public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer, Integer> record = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(record.containsKey(nums[i]) == false){
                record.put(nums[i], i);
            }
            else{
                if(i - record.get(nums[i]) <= k){
                    return true;
                }
                else{
                    record.put(nums[i], i);
                }
            }
        }
        return false;
    }
}
