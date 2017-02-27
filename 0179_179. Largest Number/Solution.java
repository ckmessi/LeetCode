public class Solution {
    public String largestNumber(int[] nums) {
        if(nums.length == 0){
            return "0";
        }   
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            list.add(nums[i]);
        }
        Collections.sort(list, new Solution().new sortClass());
        
        if(list.get(0) == 0){
            return "0";
        }
        else{
            String res = "";
            for(int i = 0; i < list.size(); i++){
                res += list.get(i);
            }
            return res;
        }
        
    }
    
    public class sortClass implements Comparator<Integer>{
        public int compare(Integer o1, Integer o2){
            String str1 = String.valueOf(o1);
            String str2 = String.valueOf(o2);
            return (str2 + str1).compareTo(str1 + str2);
        }
    }
}
