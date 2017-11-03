/*
 * [350] Intersection of Two Arrays II
 *
 * https://leetcode.com/problems/intersection-of-two-arrays-ii
 *
 * algorithms
 * Easy (44.78%)
 * Total Accepted:    80.5K
 * Total Submissions: 179.7K
 * Testcase Example:  '[]\n[]'
 *
 * 
 * Given two arrays, write a function to compute their intersection.
 * 
 * 
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
 * 
 * 
 * Note:
 * 
 * Each element in the result should appear as many times as it shows in both
 * arrays.
 * The result can be in any order.
 * 
 * 
 * 
 * Follow up:
 * 
 * What if the given array is already sorted? How would you optimize your
 * algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is
 * better?
 * What if elements of nums2 are stored on disk, and the memory is limited such
 * that you cannot load all elements into the memory at once?
 * 
 * 
 */
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums1.length; i++){
            if(map1.containsKey(nums1[i]) == false){
                map1.put(nums1[i], 1);
            }
            else{
                map1.put(nums1[i], map1.get(nums1[i]) + 1);
            }
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums2.length; i++){
            if(map1.containsKey(nums2[i]) == false){
                continue;
            }
            else{
                if(map1.get(nums2[i]) > 0){
                    map1.put(nums2[i], map1.get(nums2[i]) - 1);
                    list.add(nums2[i]);
                }
            }
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}

