class Solution {
    public int countArrangement(int N) {
        boolean[] visit = new boolean[N + 1];
        int[] arrangement = new int[N + 1];
        int res = this.dfsSearchArrangement(N, 1, visit, arrangement);
        return res;
    }
    public int dfsSearchArrangement(int N, int pos, boolean[] visit, int[] arrangement){
        if(pos == N + 1){
            return 1;
        }
        int count = 0;
        for(int i = 1; i <= N; i++){
            if(visit[i] == true){
                continue;
            }
            boolean condition = checkCondition(pos, i);
            if(condition == true){
                visit[i] = true;
                arrangement[pos] = i;
                int res = this.dfsSearchArrangement(N, pos + 1, visit, arrangement);
                count += res;
                visit[i] = false;
            }
        }
        return count;
    }
    
    public boolean checkCondition(int pos, int num){
        if(pos >= num){
            return pos % num == 0 ? true : false;
        }
        else{
            return num % pos == 0 ? true : false;
        }
    }
    
}
