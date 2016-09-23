public class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int m = board.length;
        if(m == 0){
            return true;
        }
        int n = board[0].length;
        if(n == 0){
            return true;
        }
        
        HashSet<Character>[] columnSet = new HashSet[9];
        HashSet<Character>[] rowSet = new HashSet[9];
        HashSet<Character>[] blockSet = new HashSet[9];
        
        for(int i = 0; i < 9; i++){
            columnSet[i] = new HashSet<Character>();
            rowSet[i] = new HashSet<Character>();
            blockSet[i] = new HashSet<Character>();
        }
        
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                int blockIndex = i / 3 * 3 + j / 3;
                char c = board[i][j];
                if(c == '.'){
                    continue;
                }
                if(columnSet[j].contains(c) == true){
                    return false;
                }
                else{
                    columnSet[j].add(c);
                }
                if(rowSet[i].contains(c) == true){
                    return false;
                }
                else{
                    rowSet[i].add(c);
                }
                if(blockSet[blockIndex].contains(c) == true){
                    return false;
                }
                else{
                    blockSet[blockIndex].add(c);
                }
            }
        }
        
        return true;
    }
}
