/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
public class Solution {
    public int maxPoints(Point[] points) {
        
        if(points.length < 3){
            return points.length;
        }
        
        int globalMaxValue = 0;
        for(int i = 0; i < points.length; i++){
            Point p = points[i];
            HashMap<Double, Integer> slopeNum = new HashMap<Double, Integer>();
            int sameNum = 0;
            int stepMaxNum = 0;
            for(int j = i + 1; j < points.length; j++){
                Point target = points[j];
                if(target.x == p.x && target.y == p.y){
                    sameNum++;
                }
                else{
                    double slope = 0;
                    if(target.x == p.x){
                        slope = Integer.MAX_VALUE;
                    }
                    else if (target.y == p.y){
                        slope = 0;
                    }
                    else{
                        slope = (double)(target.y - p.y) / (target.x - p.x);
                    }
                    if(slopeNum.containsKey(slope) == false){
                        slopeNum.put(slope, 0);
                    }
                    int num = slopeNum.get(slope) + 1;
                    slopeNum.put(slope, num);
                    stepMaxNum = Math.max(stepMaxNum, num);
                }
            }
            globalMaxValue = Math.max(globalMaxValue, stepMaxNum + 1 + sameNum);
        }
        
        return globalMaxValue;
        
    }
}
