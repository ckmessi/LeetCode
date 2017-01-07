public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int sum = 0;
        int start = 0;
        int total = 0;
        for(int i = 0; i < gas.length; i++){
            sum += gas[i] - cost[i];
            if(sum < 0){
                sum = 0;
                start = (i + 1) % gas.length;
            }
            total += gas[i] - cost[i];
        }
        
        if(total >= 0){
            return start;
        }
        else{
            return -1;
        }
    }
}
