public class Solution {
    public int romanToInt(String s) {
        
        if(s.length() == 0){
            return 0;
        }
        
        int sum = 0;
        int preNum = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int num = this.transfer(c);
            if(i == 0){
                preNum = num;
            }
            else{
                if(preNum < num){
                    sum -= preNum;
                }
                else{
                    sum += preNum;
                }
                preNum = num;
            }
        }
        sum += preNum;
        
        return sum;
    }
    public int transfer(char c){
        if(c == 'M'){
            return 1000;
        }
        else if (c == 'D'){
            return 500;
        }
        else if (c == 'C'){
            return 100;
        }
        else if (c == 'L'){
            return 50;
        }
        else if (c == 'X'){
            return 10;
        }
        else if (c == 'V'){
            return 5;
        }
        else if (c == 'I'){
            return 1;
        }
        else{
            return 0;
        }
    }
}
