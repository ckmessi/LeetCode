public class Solution {
    public String addBinary(String a, String b) {
        if(a.length() == 0){
            return b;
        }
        if(b.length() == 0){
            return a;
        }
        
        a = new StringBuffer(a).reverse().toString();
        b = new StringBuffer(b).reverse().toString();
        
        int k = 0;
        int flag = 0;
        String res = "";
        while(k < a.length() || k < b.length()){
            int digit = 0;
            if(k < a.length()){
                digit += a.charAt(k) == '1' ? 1 : 0;
            }
            if(k < b.length()){
                digit += b.charAt(k) == '1' ? 1 : 0;
            }
            digit += flag;
            flag = digit / 2;
            digit = digit % 2;
            res += String.valueOf(digit);
            k++;
        }
        if(flag == 1){
            res += "1";
        }
        
        return new StringBuffer(res).reverse().toString();
    }
}
