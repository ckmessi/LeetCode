public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(nums.length == 0){
            return list;
        }
        
        Arrays.sort(nums);
        this.dfsFind(nums, 0, list, new ArrayList<Integer>());
        
        return list;
    }
    
    public void dfsFind(int[] nums, int pos, List<List<Integer>> list, List<Integer> current){
        
        list.add(current);
        
        for(int i = pos; i < nums.length; i++){
            if(i > pos && nums[i] == nums[i - 1]){
                continue;
            }
            List<Integer> nextCurrent = new ArrayList<Integer>(current);
            nextCurrent.add(nums[i]);
            this.dfsFind(nums, i + 1, list, nextCurrent);
        }
        
    }
}
