public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(nums.length < 4){
            return list;
        }
        
        Arrays.sort(nums);
        HashMap<Integer, List<int[]>> pairMap = new HashMap<Integer, List<int[]>>();
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int sum = nums[i] + nums[j];
                if(pairMap.containsKey(sum) == false){
                    pairMap.put(sum, new ArrayList<int[]>());
                }
                int[] x = new int[2];
                x[0] = i;
                x[1] = j;
                pairMap.get(sum).add(x);
            }
        }
        
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j = i + 1; j < nums.length; j++){
                if(j > i + 1 && nums[j] == nums[j-1]){
                    continue;
                }
                int sum = nums[i] + nums[j];
                int remain = target - sum;
                if(pairMap.containsKey(remain) == false){
                    continue;
                }
                else{
                    boolean firstPush = false;
                    List<int[]> pairList = pairMap.get(remain);
                    for(int k = 0; k < pairList.size(); k++){
                        int[] current = pairList.get(k);
                        if(current[0] <= j){
                            continue;
                        }
                        if(firstPush == false || list.get(list.size() - 1).get(2) != nums[current[0]]){
                            firstPush = true;
                            List<Integer> x = new ArrayList<Integer>();
                            x.add(nums[i]);
                            x.add(nums[j]);
                            x.add(nums[current[0]]);
                            x.add(nums[current[1]]);
                            list.add(x);
                        }
                    }
                }
                
            }
        }
        
        return list;
        
        
    }
}
