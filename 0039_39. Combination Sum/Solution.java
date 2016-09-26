public class Solution {
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(target == 0 || candidates.length == 0){
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
            if(candidates[i] > target){
                break;
            }
            else{
                current.add(candidates[i]);
                this.dfsFind(candidates, target - candidates[i], i, list, current);
                current.remove(current.size() - 1);
            }
        }
    }
    
}
