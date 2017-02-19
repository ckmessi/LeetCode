public class Solution {
    public String convertToTitle(int n) {
        
        String res = "";
        
        while(n > 0){
            
            char x = (char)((n - 1) % 26  + 'A');
            res = x + res;
            n = (n - 1) / 26;
        }
        
        return res;
    }
}
