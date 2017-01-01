public class Solution {
    public int longestConsecutive(int[] nums) {
        
        int longestLength = 0;
        HashSet<Integer> record = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            record.add(nums[i]);
        }
        
        for(int i = 0; i < nums.length; i++){
            if(record.contains(nums[i]) == false){
                continue;
            }
            else{
                record.remove(nums[i]);
                int left = nums[i];
                while(true){
                    left--;
                    if(record.contains(left) == false){
                        break;
                    }
                    else{
                        record.remove(left);
                    }
                }
                int right = nums[i];
                while(true){
                    right++;
                    if(record.contains(right) == false){
                        break;
                    }
                    else{
                        record.remove(right);
                    }
                }
                int length = right - left - 1;
                longestLength = Math.max(longestLength, length);
            }
        }
        
        return longestLength;
        
    }
}
