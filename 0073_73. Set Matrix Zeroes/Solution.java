public class Solution {
    public void setZeroes(int[][] matrix) {
        
        int n = matrix.length;
        if(n == 0){
            return;
        }
        int m = matrix[0].length;
        if(m == 0){
            return;
        }
        
        boolean origin = matrix[0][0] == 0;
        boolean rowZero = false;
        for(int i = 0; i < n; i++){
            if(matrix[i][0] == 0){
                rowZero = true;
                break;
            }
        }
        boolean columnZero = false;
        for(int j = 0; j < m; j++){
            if(matrix[0][j] == 0){
                columnZero = true;
                break;
            }
        }
        
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        
        
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        
        
        if(origin == true){
            for(int i = 0; i < n; i++){
                matrix[i][0] = 0;
            }
            for(int j = 0; j < m; j++){
                matrix[0][j] = 0;
            }
        }
        else{
            if(rowZero == true){
                for(int i = 0; i < n; i++){
                    matrix[i][0] = 0;
                }
            }
            if(columnZero == true){
                for(int j = 0; j < m; j++){
                    matrix[0][j] = 0;
                }
            }
        }
        
        return;
        
    }
}
