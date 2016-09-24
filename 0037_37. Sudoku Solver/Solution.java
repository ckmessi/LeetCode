public class Solution {
    public void solveSudoku(char[][] board) {
        
        HashSet<Character>[] rowSet = new HashSet[9];
        HashSet<Character>[] columnSet = new HashSet[9];
        HashSet<Character>[] blockSet = new HashSet[9];
        for(int i = 0; i < 9; i++){
            rowSet[i] = new HashSet<Character>();
            columnSet[i] = new HashSet<Character>();
            blockSet[i] = new HashSet<Character>();
        }
        
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                else{
                    rowSet[i].add(board[i][j]);
                    columnSet[j].add(board[i][j]);
                    int blockIndex = i / 3 * 3 + j / 3;
                    blockSet[blockIndex].add(board[i][j]);
                }
            }
        }
        
        this.dfsSolve(board, rowSet, columnSet, blockSet);
        
        
        
        
    }
    public boolean dfsSolve(char[][] board, HashSet<Character>[] rowSet, HashSet<Character>[] columnSet, HashSet<Character>[] blockSet){
        
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    continue;
                }
                else{
                    boolean hasSolve = false;
                    for(char k = '1'; k <= '9'; k++){
                        int blockIndex = i / 3 * 3 + j / 3;
                        if(rowSet[i].contains(k) == true){
                            continue;
                        }
                        if(columnSet[j].contains(k) == true){
                            continue;
                        }
                        if(blockSet[blockIndex].contains(k) == true){
                            continue;
                        }
                        rowSet[i].add(k);
                        columnSet[j].add(k);
                        blockSet[blockIndex].add(k);
                        board[i][j] = k;
                        boolean res = this.dfsSolve(board, rowSet, columnSet, blockSet);
                        if(res == true){
                            hasSolve = true;
                            break;
                        }
                        else{
                            rowSet[i].remove(k);
                            columnSet[j].remove(k);
                            blockSet[blockIndex].remove(k);
                            board[i][j] = '.';
                        }
                    }
                    if(hasSolve == false){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
