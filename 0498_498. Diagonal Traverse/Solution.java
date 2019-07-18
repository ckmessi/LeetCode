class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int height = matrix.length;
        if(height == 0){
            return new int[0];
        }
        int width = matrix[0].length;
        int[] result = new int[height * width];
        int i = 0;
        int j = 0;
        int index = 0;
        while(index < height * width){
            // 向上
            while(true) {
                result[index] = matrix[i][j];
                index++;
                if(i > 0 && j < width - 1){
                    // 右上方
                    i--;
                    j++;
                }
                else {
                    if(i == 0 && j < width - 1) {
                        // 第一行除了最后一格
                        j++;
                    }
                    else {
                        if (i < height - 1) {
                            // 最后一列除了最下方一格
                            i++;
                        }
                        else {
                        }
                    }
                    break;
                }
            }
            if(index >= height * width) {
                break;
            }
            // 向下
            while(true) {
                result[index] = matrix[i][j];
                index++;
                if(i < height - 1 && j > 0) {
                    // 左下方
                    i++;
                    j--;
                }
                else {
                    if (j == 0 && i < height - 1) {
                        // 第一列除了最下一格
                        i++;
                    }
                    else {
                        if (j < width - 1) {
                            // 最后一行除右一格
                            j++;
                        }
                        else {
                        }
                    }
                    break;
                }
            }
        }
        return result;
    }
}
