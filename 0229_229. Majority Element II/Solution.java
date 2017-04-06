public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> list = new ArrayList<Integer>();
        int major1 = 0;
        int major1Count = 0;
        int major2 = 0;
        int major2Count = 0;
        for(int i = 0; i < nums.length; i++){
            if(major1Count == 0 && major2Count == 0){
                major1 = nums[i];
                major1Count = 1;
            }
            else if (major1Count == 0){
                if(nums[i] == major2){
                    major2Count++;
                }
                else{
                    major1 = nums[i];
                    major1Count = 1;
                }
            }
            else if (major2Count == 0){
                if(nums[i] == major1){
                    major1Count++;
                }
                else{
                    major2 = nums[i];
                    major2Count = 1;
                }
            }
            else{
                if(nums[i] == major1){
                    major1Count++;
                }
                else if (nums[i] == major2){
                    major2Count++;
                }
                else{
                    major1Count--;
                    major2Count--;
                }
            }
        }
        
        int major1RealCount = 0;
        int major2RealCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == major1){
                major1RealCount++;
            }
            if(nums[i] == major2){
                major2RealCount++;
            }
        }
        
        if(major1Count > 0 && major1RealCount > nums.length / 3){
            list.add(major1);
        }
        if(major2Count > 0 && major2RealCount > nums.length / 3){
            list.add(major2);
        }
        
        return list;
    }
}
