public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        if(numbers.length < 2){
            return res;
        }
        
        int left = 0;
        int right = numbers.length - 1;
        while(left < right){
            int v = numbers[left] + numbers[right];
            if(v == target){
                break;
            }
            else if (v < target){
                left++;
            }
            else{
                right--;
            }
        }
        
        res[0] = left + 1;
        res[1] = right + 1;
        return res;
    }
}
