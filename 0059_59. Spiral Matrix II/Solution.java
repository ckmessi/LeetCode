public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        if(n == 0){
            return matrix;
        }
        
        int count = 1;
        int top = 0;
        int right = n;
        int bottom = n;
        int left = -1;
        
        int i = 0;
        int j = -1;
        while(count <= n * n){
            while(j < right - 1){
                j++;
                matrix[i][j] = count;
                count++;
            }
            if(count > n * n){
                break;
            }
            right--;
            
            while(i < bottom - 1){
                i++;
                matrix[i][j] = count;
                count++;
            }
            if(count > n * n){
                break;
            }
            bottom--;
            
            while(j > left + 1){
                j--;
                matrix[i][j] = count;
                count++;
            }
            if(count > n * n){
                break;
            }
            left++;
            
            while(i > top + 1){
                i--;
                matrix[i][j] = count;
                count++;
            }
            if(count > n * n){
                break;
            }
            top++;
        }
        
        return matrix;
    }
}
