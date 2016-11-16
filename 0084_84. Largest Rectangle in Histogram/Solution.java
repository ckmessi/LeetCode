public class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights.length == 0){
            return 0;
        }
        
        Stack<Integer> stack = new Stack<Integer>();
        int i = 0;
        int maxArea = 0;
        while(i <= heights.length){
            int h = (i == heights.length) ? 0 : heights[i];
            if(stack.empty() == true || h >= heights[stack.peek()]){
                stack.push(i);
                i++;
            }
            else{
                int curH = stack.pop();
                int width = 0;
                if(stack.empty() == true){
                    width = i;
                }
                else{
                    width = i - stack.peek() - 1;
                }
                int area = heights[curH] * width;
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}
