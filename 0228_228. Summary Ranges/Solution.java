public class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> list = new ArrayList<String>();
        if(nums.length == 0){
            return list;
        }
        
        for(int i = 0; i < nums.length; i++){
            int cur = nums[i];
            while(i + 1 < nums.length && nums[i+1] == nums[i] + 1){
                i++;
            }
            if(nums[i] == cur){
                list.add(cur + "");
            }
            else{
                list.add(cur + "->" + nums[i]);
            }
        }
        
        return list;
    }
}
