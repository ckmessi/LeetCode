public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> list = new ArrayList<Integer>();
        
        int m = matrix.length;
        if(m == 0){
            return list;
        }
        int n = matrix[0].length;
        if(n == 0){
            return list;
        }
        
        int top = 0;
        int left = -1;
        int bottom = m;
        int right = n;
        int count = 0;
        int i = 0;
        int j = -1;
        
        while(count < m * n){
            while(j < right - 1){
                j++;
                list.add(matrix[i][j]);
                count++;
            }
            right--;
            if(count >= m * n){
                break;
            }
            while(i < bottom - 1){
                i++;
                list.add(matrix[i][j]);
                count++;
            }
            bottom--;
            if(count >= m * n){
                break;
            }
            while(j > left + 1){
                j--;
                list.add(matrix[i][j]);
                count++;
            }
            left++;
            if(count >= m * n){
                break;
            }
            while(i > top + 1){
                i--;
                list.add(matrix[i][j]);
                count++;
            }
            top++;
            if(count >= m * n){
                break;
            }
        }
        
        return list;
    }
}
