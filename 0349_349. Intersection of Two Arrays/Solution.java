class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0){
            return new int[0];
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums2.length; i++){
            if(set.contains(nums2[i]) == true){
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;        
    }
}
