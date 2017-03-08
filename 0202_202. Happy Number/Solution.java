public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> record = new HashSet<Integer>();
        while(n != 1){
            record.add(n);
            int copyn = n;
            int sum = 0;
            while(copyn > 0){
                int digit = copyn % 10;
                copyn /= 10;
                sum += digit * digit;
            }
            if(record.contains(sum) == true){
                break;
            }
            n = sum;
        }
        if(n == 1){
            return true;
        }
        else{
            return false;
        }
    }
}
