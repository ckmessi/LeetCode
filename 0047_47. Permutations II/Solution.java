public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(nums.length == 0){
            return list;
        }
        
        Arrays.sort(nums);
        
        boolean[] visit = new boolean[nums.length];
        
        this.dfsFindPermutation(nums, visit, list, new ArrayList<Integer>());
        
        return list;
        
        
        
    }
    public void dfsFindPermutation(int[] nums, boolean[] visit, List<List<Integer>> list, ArrayList<Integer> current){
        if(current.size() == nums.length){
            ArrayList<Integer> x = (ArrayList<Integer>)current.clone();
            list.add(x);
            return;
        }
        
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1] && visit[i-1] == false){
                continue;
            }
            if(visit[i] == true){
                continue;
            }
            visit[i] = true;
            current.add(nums[i]);
            this.dfsFindPermutation(nums, visit, list, current);
            current.remove(current.size() - 1);
            visit[i] = false;
        }
    }
}
