public class Solution {
    public void nextPermutation(int[] nums) {
        
        if(nums.length == 0){
            return;
        }
        
        // from right to left, find the first index 'pos' that satisfies nums[pos] < nums[pos+1]
        int pos = -1;
        for(int i = nums.length - 1; i > 0; i--){
            if(nums[i] > nums[i-1]){
                pos = i - 1;
                break;
            }
        }
        if(pos == -1){
            // all item in reverse order, reverse it directly
            for(int i = 0, j = nums.length - 1; i < j; i++, j--){
                this.swap(nums, i, j);
            }
            return;
        }
        
        
        // find the minimun item that > nums[pos] in the right side
        int minValue = Integer.MAX_VALUE;
        int minIndex = 0;
        for(int i = nums.length - 1; i > pos; i--){
            if(nums[i] > nums[pos] && nums[i] < minValue){
                minValue = nums[i];
                minIndex = i;
            }
        }
        this.swap(nums, pos, minIndex);
        for(int i = pos + 1, j = nums.length - 1; i < j; i++, j--){
            this.swap(nums, i, j);
        }
        
        return;
        
        
    }
    
    public void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
