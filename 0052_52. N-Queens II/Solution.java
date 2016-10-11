public class Solution {
    public int totalNQueens(int n) {
        int res = this.dfsFindSolution(new ArrayList<Integer>(), 0, n);
        return res;
    }
    
    public int dfsFindSolution(List<Integer> current, int level, int n){
        if(level == n){
            return 1;
        }
        
        int count = 0;
        for(int i = 0; i < n; i++){
            boolean conflict = false;
            for(int j = 0; j < current.size(); j++){
                if(current.get(j) == i){
                    conflict = true;
                    break;
                }
                if(Math.abs(current.get(j) - i) == level - j){
                    conflict = true;
                    break;
                }
            }
            if(conflict == true){
                continue;
            }
            else{
                current.add(i);
                int res = this.dfsFindSolution(current, level + 1, n);
                count += res;
                current.remove(current.size() - 1);
            }
        }
        return count;
    }
}
