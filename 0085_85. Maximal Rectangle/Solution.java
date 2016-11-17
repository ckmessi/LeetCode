c class Solution {
    public int maximalRectangle(char[][] matrix) {
        
        int m = matrix.length;
        if(m == 0){
            return 0;
        }
        int n = matrix[0].length;
        if(n == 0){
            return 0;
        }
        
        int maxArea = 0;
        int[] height = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];
        
        for(int i = 0; i < n; i++){
            right[i] = n;
        }
        
        for(int i = 0; i < m; i++){
            // height
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == '1'){
                    height[j]++;
                }
                else{
                    height[j] = 0;
                }
            }
            // left
            int curLeft = 0;
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == '1'){
                    left[j] = Math.max(left[j], curLeft);
                }
                else{
                    left[j] = 0;
                    curLeft = j + 1;
                }
            }
            // right
            int curRight = n;
            for(int j = n - 1; j >= 0; j--){
                if(matrix[i][j] == '1'){
                    right[j] = Math.min(right[j], curRight);
                }
                else{
                    right[j] = n;
                    curRight = j;
                }
            }
            
            // area
            for(int j = 0; j < n; j++){
                maxArea = Math.max(maxArea, (right[j] - left[j]) * height[j]);
            }
        }
        return maxArea;
        
    }
}
