app=leetcode id=532 lang=java
 *
 * [532] K-diff Pairs in an Array
 */
class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums.length < 2 || k < 0) {
            return 0;
        }

        Arrays.sort(nums);
        int head = 0;
        int tail = 1;

        int count = 0;
        k = Math.abs(k);

        // System.out.print("[");
        // for(int i = 0; i < nums.length; i++){
        //     System.out.print(nums[i] + ",");
        // }
        // System.out.println("]");

        while(head < nums.length && tail < nums.length) {
            // move tail forward until nums[tail] >= nums[head] + k
            
            while(tail < nums.length) {
                if(tail == head){
                    tail++;
                }
                else{
                    if(nums[tail] >= nums[head] + k) {
                        break;
                    }
                    tail++;    
                }
            }
            // System.out.println("break tail:" + tail);
            if(tail < nums.length) {
                if(nums[tail] == nums[head] + k) {
                    count++;
                    // System.out.println("bingo!!!" + head + "," + tail);
                    while(tail < nums.length) {
                        tail++;
                        if(tail == nums.length){
                            break;
                        }
                        else{
                            if(nums[tail] != nums[tail-1]){
                                break;
                            }
                        }
                    }
                }
            }
            // move head forward
            while(head < tail) {
                head++;
                if(head < nums.length){
                    if(nums[head] != nums[head-1]){
                        break;
                    }
                }
                else{
                    break;
                }
            }
            // System.out.println("head:" + head + ", tail:" + tail);
        }
        return count;
    }
}


