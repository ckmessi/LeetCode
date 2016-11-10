public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(nums.length == 0){
            return list;
        }
        
        int size = 1 << nums.length;
        for(int i = 0; i < size; i++){
            List<Integer> current = new ArrayList<Integer>();
            for(int j = 0; j < nums.length; j++){
                if(((i >> j) & 1) == 1){
                    current.add(nums[j]);
                }
            }
            list.add(current);
        }
        return list;
    }
}
