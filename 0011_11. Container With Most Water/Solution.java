public class Solution {
    public int maxArea(int[] height) {
        
        if(height.length < 2){
            return 0;
        }
        
        int maxAreaValue = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right){
            int area = Math.min(height[left], height[right]) * (right - left);
            maxAreaValue = Math.max(maxAreaValue, area);
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        
        return maxAreaValue;
        
    }
}
