public class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        List<List<String>> list = new ArrayList<List<String>>();
        this.dfsFindSolution(list, new ArrayList<Integer>(), 0, n);
        return list;
    }
    
    public void dfsFindSolution(List<List<String>> list, List<Integer> current, int level, int n){
        if(level == n){
            // record the res
            List<String> x = new ArrayList<String>();
            for(int i = 0; i < n; i++){
                String line = "";
                for(int j = 0; j < n; j++){
                    if(j == current.get(i)){
                        line += "Q";
                    }
                    else{
                        line += ".";
                    }
                }
                x.add(line);
            }
            list.add(x);
        }
        
        for(int i = 0; i < n; i++){
            boolean conflict = false;
            for(int k = 0; k < level; k++){
                if(current.get(k) == i){
                    conflict = true;
                    break;
                }
                if(Math.abs(current.get(k) - i) == level - k){
                    conflict = true;
                    break;
                }
            }
            if(conflict == true){
                continue;
            }
            else{
                current.add(i);
                this.dfsFindSolution(list, current, level + 1, n);
                current.remove(current.size() - 1);
            }
        }
    }
}
