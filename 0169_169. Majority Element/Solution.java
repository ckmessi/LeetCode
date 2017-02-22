public class Solution {
    public int majorityElement(int[] nums) {
        int majorNum = 0;
        int majorCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(majorCount == 0){
                majorNum = nums[i];
                majorCount = 1;
            }
            else{
                if(majorNum == nums[i]){
                    majorCount++;
                }
                else{
                    majorCount--;
                }
            }
        }
        return majorNum;
    }
}
