public class Solution {
    public int myAtoi(String str) {
        
        if(str.length() == 0){
            return 0;
        }
        int flag = 1;
        int start = str.length();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == ' '){
                continue;
            }
            else if (c == '+' || c == '-'){
                start = i + 1;
                if(c == '-'){
                    flag = -1;
                }
                break;
            }
            else if (Character.isDigit(c) == true){
                start = i;
                break;
            }
            else{
                return 0;
            }
        }
        
        int sum = 0;
        boolean validExist = false;
        for(int i = start; i < str.length(); i++){
            char c = str.charAt(i);
            if(Character.isDigit(c) == false){
                break;
            }
            else{
                int digit = c - '0';
                validExist = true;
                if(flag == 1){
                    if((Integer.MAX_VALUE - digit) / 10 < sum){
                        return Integer.MAX_VALUE;
                    }
                    else{
                        sum = sum * 10 + digit;
                    }
                }
                else {
                    if((Integer.MIN_VALUE + digit) / 10 > sum){
                        return Integer.MIN_VALUE;
                    }
                    else{
                        sum = sum * 10 - digit;
                    }
                }
            }
        }
        
        if(validExist == false){
            return 0;
        }
        else{
            return sum;
        }
        
    }
}
