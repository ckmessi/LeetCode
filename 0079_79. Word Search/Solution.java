public class Solution {
    public boolean exist(char[][] board, String word) {
        
        if(board.length == 0 || board[0].length == 0){
            return false;
        }
        if(word.length() == 0){
            return true;
        }
        
        boolean[][] visit = new boolean[board.length][board[0].length];
        for(int i = 0; i < visit.length; i++){
            for(int j = 0; j < visit[0].length; j++){
                visit[i][j] = false;
            }
        }
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    visit[i][j] = true;
                    boolean res = this.dfsFind(board, visit, word.substring(1), i, j);
                    if(res == true){
                        return true;
                    }
                    visit[i][j] = false;
                }
            }
        }
        return false;
        
    }
    
    public boolean dfsFind(char[][] board, boolean[][] visit, String word, int i, int j){
        // System.out.println(i + "," + j + "," + word);
        if(word.length() == 0){
            return true;
        }
        
        char c = word.charAt(0);
        if(i > 0 && visit[i-1][j] == false && board[i-1][j] == c){
            visit[i-1][j] = true;
            boolean res = this.dfsFind(board, visit, word.substring(1), i-1, j);
            visit[i-1][j] = false;
            if(res == true){
                return true;
            }
        }
        if(i < board.length - 1 && visit[i+1][j] == false && board[i+1][j] == c){
            visit[i+1][j] = true;
            boolean res = this.dfsFind(board, visit, word.substring(1), i+1, j);
            visit[i+1][j] = false;
            if(res == true){
                return true;
            }
        }
        if(j > 0 && visit[i][j-1] == false && board[i][j-1] == c){
            visit[i][j-1] = true;
            boolean res = this.dfsFind(board, visit, word.substring(1), i, j-1);
            visit[i][j-1] = false;
            if(res == true){
                return true;
            }
        }
        if(j < board[0].length - 1 && visit[i][j+1] == false && board[i][j+1] == c){
            visit[i][j+1] = true;
            boolean res = this.dfsFind(board, visit, word.substring(1), i, j+1);
            visit[i][j+1] = false;
            if(res == true){
                return true;
            }
        }
        return false;
    }
}
