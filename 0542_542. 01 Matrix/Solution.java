/*
 * @lc app=leetcode id=542 lang=java
 *
 * [542] 01 Matrix
 */
class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0) {
            return matrix;
        }

        boolean changed = true;
        while(changed){
            changed = false;
            for(int i = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix[0].length; j++){
                    if(matrix[i][j] == 0){
                        continue;
                    }
                    else{
                        int target = minimalNeighbor(matrix, i, j) + 1;
                        if(target > matrix[i][j]){
                            changed = true;
                            matrix[i][j] = target;
                        }
                    }
                }
            }
        }
        return matrix;
    }

    private int minimalNeighbor(int[][] matrix, int i, int j) {
        int minValue = Integer.MAX_VALUE;
        if(i > 0){
            minValue = Math.min(minValue, matrix[i-1][j]);
        }
        if(i < matrix.length - 1){
            minValue = Math.min(minValue, matrix[i+1][j]);
        }
        if(j > 0){
            minValue = Math.min(minValue, matrix[i][j-1]);
        }
        if(j < matrix[0].length - 1){
            minValue = Math.min(minValue, matrix[i][j+1]);
        }
        return minValue;
    }
}


