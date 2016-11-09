public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(n < k){
            return list;
        }
        
        this.dfsFind(n, k, 0, 1, list, new ArrayList<Integer>());
        
        return list;
        
    }
    
    public void dfsFind(int n, int k, int pos, int m, List<List<Integer>> list, ArrayList<Integer> current){
        if(pos == k){
            ArrayList<Integer> x = (ArrayList<Integer>)current.clone();
            list.add(x);
            return;
        }
        
        for(int i = m; i <= n; i++){
            current.add(i);
            this.dfsFind(n, k, pos + 1, i + 1, list, current);
            current.remove(current.size() - 1);
        }
    }
    
}
