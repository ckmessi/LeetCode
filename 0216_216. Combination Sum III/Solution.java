public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        ArrayList<Integer> current = new ArrayList<Integer>();
        this.dfsFind(list, current, k, 0, n, 0, 1);
        return list;
    }
    
    public void dfsFind(List<List<Integer>> list, ArrayList<Integer> current, int k, int step, int n, int sum, int pos){
        if(step == k){
            if(sum == n){
                ArrayList<Integer> x = (ArrayList<Integer>)current.clone();
                list.add(x);
            }    
            return;
        }
        for(int i = pos; i <= 9; i++){
            if(sum + i <= n){
                current.add(i);
                this.dfsFind(list, current, k, step + 1, n, sum + i, i + 1);
                current.remove(current.size() - 1);
            }
        }
    }
}
