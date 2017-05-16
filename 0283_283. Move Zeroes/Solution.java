public class Solution {
    public void moveZeroes(int[] nums) {
        
        int pos = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                continue;
            }
            else{
                if(i != pos){
                    int tmp = nums[i];
                    nums[i] = nums[pos];
                    nums[pos] = tmp;
                }
                pos++;
            }
        }
        return;
    }
}
