public class Solution {
    public String intToRoman(int num) {
        
        String res = "";
        
        if(num >= 1000){
            int thousand = num / 1000;
            for(int i = 0; i < thousand; i++){
                res += "M";
            }
            num = num % 1000;
        }
        
        if(num >= 100){
            int hundred = num / 100;
            if(hundred == 9){
                res += "CM";
            }
            else if (hundred >= 5){
                res += "D";
                for(int i = 5; i < hundred; i++){
                    res += "C";
                }
            }
            else if (hundred == 4){
                res += "CD";
            }
            else {
                for(int i = 0; i < hundred; i++){
                    res += "C";
                }
            }
            num = num % 100;
        }
        
        if(num >= 10){
            int decade = num / 10;
            if(decade == 9){
                res += "XC";
            }
            else if (decade >= 5){
                res += "L";
                for(int i = 5; i < decade; i++){
                    res += "X";
                }
            }
            else if (decade == 4){
                res += "XL";
            }
            else{
                for(int i = 0; i < decade; i++){
                    res += "X";
                }
            }
            num = num % 10;
        }
        
        if(num >= 0){
            int digit = num;
            if(digit == 9){
                res += "IX";
            }
            else if (digit >= 5){
                res += "V";
                for(int i = 5; i < digit; i++){
                    res += "I";
                }
            }
            else if (digit == 4){
                res += "IV";
            }
            else {
                for(int i = 0; i < digit; i++){
                    res += "I";
                }
            }
        }
        
        return res;
        
    }
}
