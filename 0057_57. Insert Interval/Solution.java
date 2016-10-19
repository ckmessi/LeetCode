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
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        boolean insert = false;
        if(intervals.size() == 0){
            intervals.add(newInterval);
            return intervals;
        }

        int insertPos = -1;
        for(int i = 0; i < intervals.size(); i++){
            if(intervals.get(i).start > newInterval.start){
                intervals.add(i, newInterval);
                insertPos = i;
                break;
            }
        }
        if(insertPos == -1){
            insertPos = intervals.size();
            intervals.add(newInterval);
        }
        
        if(insertPos == 0){
            insertPos = 1;
        }
        for(int i = insertPos - 1; i < intervals.size() - 1; i++){
            if(intervals.get(i+1).start <= intervals.get(i).end){
                intervals.get(i).end = Math.max(intervals.get(i).end, intervals.get(i+1).end);
                intervals.remove(i+1);
                i--;
            }
        }
        
        return intervals;
        
        
    }
}
