public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<Integer>();
        int size = 1 << n;
        for(int i = 0; i < size; i++){
            list.add(i ^ (i >> 1));
        }
        return list;
    }
}
