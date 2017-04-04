public class Solution {
    public int calculate(String s) {
        
        int result = 0;
        char sign = '+';
        int preValue = 0;
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c) == true){
                int curValue = c - '0';
                while(i + 1 < s.length() && Character.isDigit(s.charAt(i + 1)) == true){
                    curValue *= 10;
                    curValue += s.charAt(i + 1) - '0';
                    i++;
                }
                
                if (sign == '+'){
                    result += preValue;
                    preValue = curValue;
                }
                else if (sign == '-'){
                    result += preValue;
                    preValue = -curValue;
                }
                else if (sign == '*'){
                    preValue *= curValue;
                }
                else{
                    preValue /= curValue;
                }
            }
            else if(c == ' '){
                continue;
            }
            else{
                sign = c;
            }
        }
        result += preValue;
        return result;
    }
}
