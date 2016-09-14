public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(nums.length < 3){
            return list;
        }
        
        Arrays.sort(nums);
        
        HashMap<Integer, Integer> record = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            record.put(nums[i], i);
        }
        
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j = i + 1; j < nums.length; j++){
                if(j > i + 1 && nums[j] == nums[j-1]){
                    continue;
                }
                int target = 0 - (nums[i] + nums[j]);
                if(record.containsKey(target) == false){
                    continue;
                }
                else{
                    int pos = record.get(target);
                    if(pos <= j){
                        continue;
                    }
                    else{
                        List<Integer> x = new ArrayList<Integer>();
                        x.add(nums[i]);
                        x.add(nums[j]);
                        x.add(nums[pos]);
                        list.add(x);
                    }
                }
            }
        }
        
        return list;
        
    }
}
