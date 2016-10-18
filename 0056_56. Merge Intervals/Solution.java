/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public class sortClass implements Comparator<Interval>{
        public int compare(Interval i1, Interval i2){
            if(i1.start > i2.start){
                return 1;
            }
            else if(i1.start == i2.start) {
                return 0;
            }
            else{
                return -1;
            }
        }
    }
    public List<Interval> merge(List<Interval> intervals) {
        
        List<Interval> list = new ArrayList<Interval>();
        Collections.sort(intervals, new Solution().new sortClass());
        
        for(int i = 0; i < intervals.size(); i++){
            if(list.size() == 0){
                list.add(intervals.get(i));
            }
            else{
                if(intervals.get(i).start > list.get(list.size() - 1).end){
                    list.add(intervals.get(i));
                }
                else{
                    list.get(list.size() - 1).end = Math.max(list.get(list.size() - 1).end, intervals.get(i).end);
                }
            }
        }
        
        return list;
    }
}
