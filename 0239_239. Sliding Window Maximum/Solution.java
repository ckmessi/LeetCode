public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        if(nums.length == 0){
            return new int[0];
        }
        if(k == 1){
            return nums;
        }
        
        int[] res = new int[nums.length - k + 1];
        List<Integer> deQueue = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(deQueue.size() == 0){
                deQueue.add(i);
            }
            else{
                while(deQueue.size() > 0 && nums[deQueue.get(0)] < nums[i]){
                    deQueue.remove(0);
                }
                deQueue.add(0, i);
            }
            
            if(i >= k - 1){
                res[i - k + 1] = nums[deQueue.get(deQueue.size() - 1)];
                if(deQueue.get(deQueue.size() - 1) <= i - k + 1){
                    deQueue.remove(deQueue.size() - 1);
                }
            }
            
        }
        return res;
        
    }
}
