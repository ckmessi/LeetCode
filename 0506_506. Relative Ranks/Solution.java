class Solution {
    public String[] findRelativeRanks(int[] nums) {
        
        Integer[] sortedNums = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sortedNums[i] = nums[i];
        }
        
        Arrays.sort(sortedNums, new Comparator<Integer>(){
            @Override
            public int compare(Integer i1, Integer i2) {
                return i2 - i1;
            }
        });
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < sortedNums.length; i++){
            map.put(sortedNums[i], i+1);
        }
        
        String[] ranks = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            int rank = map.get(nums[i]);
            String rankText = getRankText(rank);
            ranks[i] = rankText;
        }
        return ranks;
    }
    
    private String getRankText(int rank){
        if(rank == 1){
            return "Gold Medal";
        }
        else if (rank == 2){
            return "Silver Medal";
        }
        else if (rank == 3) {
            return "Bronze Medal";
        }
        else{
            return String.valueOf(rank);
        }
    }
}
