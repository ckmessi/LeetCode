public class Solution {
    public int numIslands(char[][] grid) {
        
        int n = grid.length;
        if(n == 0){
            return 0;
        }
        int m = grid[0].length;
        if(m == 0){
            return 0;
        }
        
        boolean[][] visit = new boolean[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                visit[i][j] = false;
            }
        }
        
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(visit[i][j] == false && grid[i][j] == '1'){
                    count++;
                    visit[i][j] = true;
                    this.dfsVisit(grid, visit, i, j);
                }
            }
        }
        
        return count;
    }
    
    public void dfsVisit(char[][] grid, boolean[][] visit, int i, int j){
        if(i > 0 && visit[i-1][j] == false && grid[i-1][j] == '1'){
            visit[i-1][j] = true;
            this.dfsVisit(grid, visit, i-1, j);
        }
        if(i < grid.length - 1 && visit[i+1][j] == false && grid[i+1][j] == '1'){
            visit[i+1][j] = true;
            this.dfsVisit(grid, visit, i+1, j);
        }
        if(j > 0 && visit[i][j-1] == false && grid[i][j-1] == '1'){
            visit[i][j-1] = true;
            this.dfsVisit(grid, visit, i, j-1);
        }
        if(j < grid[0].length - 1 && visit[i][j+1] == false && grid[i][j+1] == '1'){
            visit[i][j+1] = true;
            this.dfsVisit(grid, visit, i, j+1);
        }
    }
}
