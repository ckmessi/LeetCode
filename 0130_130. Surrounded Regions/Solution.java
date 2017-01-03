public class Solution {
    public void solve(char[][] board) {
        if(board.length == 0 || board[0].length == 0){
            return;
        }
        boolean[][] visit = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                visit[i][j] = false;
            }
        }
        Queue<int[]> queue = new LinkedList<int[]>();
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(i != 0 && i != board.length - 1 && j != 0 && j != board[0].length - 1){
                    continue;
                }
                if(board[i][j] == 'O'){
                    visit[i][j] = true;
                    int[] x = new int[2];
                    x[0] = i;
                    x[1] = j;
                    queue.add(x);
                }
            }
        } 
        /*
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                System.out.print(board[i][j] + ",");
            }
            System.out.println();
        }
        */
        int[][] direction = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while(queue.isEmpty() == false){
            int[] x = queue.poll();
            int pi = x[0];
            int pj = x[1];
            board[pi][pj] = 'H';
            for(int k = 0; k < direction.length; k++){
                int px = pi + direction[k][0];
                int py = pj + direction[k][1];
                if(px >= 0 && px < board.length && py >= 0 && py < board[0].length && visit[px][py] == false && board[px][py] == 'O'){
                    visit[px][py] = true;
                    int[] x2 = new int[2];
                    x2[0] = px;
                    x2[1] = py;
                    queue.add(x2);
                }
            }
        }
        
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
                else if (board[i][j] == 'H'){
                    board[i][j] = 'O';
                }
            }
        }
        return;
    }
    
}
