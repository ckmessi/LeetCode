public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if(m == 0){
            return false;
        }
        int n = matrix[0].length;
        if(n == 0){
            return false;
        }
        
        int left = 0;
        int right = m;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(matrix[mid][0] == target){
                return true;
            }
            else if (matrix[mid][0] > target){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        
        if(left > m || left == 0){
            return false;
        }
        int row = left - 1;
        left = 0;
        right = n - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(matrix[row][mid] == target){
                return true;
            }
            else if (matrix[row][mid] < target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        
        return false;
        
    }
}
