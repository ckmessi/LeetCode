public class Solution {
    public int trap(int[] height) {
        
        if(height.length <= 2){
            return 0;
        }
        
        int maxHeight = 0;
        int maxIndex = 0;
        for(int i = 0; i < height.length; i++){
            if(height[i] > maxHeight){
                maxIndex = i;
                maxHeight = height[i];
            }
        }
        
        int res = 0;
        
        int leftMax = 0;
        for(int i = 0; i < maxIndex; i++){
            if(height[i] > leftMax){
                leftMax = height[i];
            }
            else{
                res += leftMax - height[i];
            }
        }
        
        int rightMax = 0;
        for(int i = height.length - 1; i > maxIndex; i--){
            if(height[i] > rightMax){
                rightMax = height[i];
            }
            else{
                res += rightMax - height[i];
            }
        }
        
        return res;
    }
}
