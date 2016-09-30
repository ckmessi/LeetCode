public class Solution {
    public String multiply(String num1, String num2) {
        if(num1.length() == 0 || num2.length() == 0){
            return "0";
        }
        
        String num1r = new StringBuffer(num1).reverse().toString();
        String num2r = new StringBuffer(num2).reverse().toString();
        
        int[] res = new int[num1r.length() + num2r.length()];
        for(int i = 0; i < num1r.length(); i++){
            for(int j = 0; j < num2r.length(); j++){
                char c1 = num1r.charAt(i);
                char c2 = num2r.charAt(j);
                int digit = (int)(c1 - '0') * (int)(c2 - '0');
                res[i + j] += digit;
            }
        }
        
        for(int i = 0; i < num1r.length() + num2r.length(); i++){
            if(res[i] >= 10){
                res[i + 1] += res[i] / 10;
                res[i] = res[i] % 10;
            }
        }
        
        String str = "";
        boolean headZero = true;
        for(int i = num1r.length() + num2r.length() - 1; i >= 0; i--){
            if(headZero == true && res[i] == 0){
                continue;
            }
            else{
                str += String.valueOf(res[i]);
                headZero = false;
            }
        }
        if(str.equals("") == true){
            str = "0";
        }
        
        return str;
        
        
    }
}
