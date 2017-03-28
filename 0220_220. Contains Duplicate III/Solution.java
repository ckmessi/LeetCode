public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(k < 1 || t < 0){
            return false;
        }
        
        HashMap<Long, Long> bucket = new HashMap<Long, Long>();
        for(int i = 0; i < nums.length; i++){
            long remappedNum = this.getRemappedNum(nums[i], t);
            if(bucket.containsKey(remappedNum) == true){
                return true;
            }
            else if (bucket.containsKey(remappedNum - 1) == true && nums[i] - bucket.get(remappedNum - 1) <= t){
                return true;
            }
            else if (bucket.containsKey(remappedNum + 1) == true && bucket.get(remappedNum + 1) - nums[i] <= t){
                return true;
            }
            bucket.put(remappedNum, (long)nums[i]);
            if(i >= k){
                long r = this.getRemappedNum(nums[i-k], t);
                bucket.remove(r);
            }
        }
        
        return false;
    }
    
    public long getRemappedNum(int num, int t){
        long remappedNum = ((long)num - Integer.MIN_VALUE) / ((long)t + 1);
        return remappedNum;
    }
}
