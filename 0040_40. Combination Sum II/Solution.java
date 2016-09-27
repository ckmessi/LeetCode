public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(candidates.length == 0){
            return list;
        }
        
        Arrays.sort(candidates);
        
        this.dfsFind(candidates, target, 0, list, new ArrayList<Integer>());
        
        return list;
        
        
    }
    public void dfsFind(int[] candidates, int target, int pos, List<List<Integer>> list, ArrayList<Integer> current){
        if(target == 0){
            ArrayList<Integer> x = (ArrayList<Integer>)current.clone();
            list.add(x);
            return;
        }
        
        for(int i = pos; i < candidates.length; i++){
            if(i > pos && candidates[i] == candidates[i-1]){
                continue;
            }
            if(candidates[i] > target){
                break;
            }
            else{
                current.add(candidates[i]);
                this.dfsFind(candidates, target - candidates[i], i + 1, list, current);
                current.remove(current.size() - 1);
            }
        }
    }
}
