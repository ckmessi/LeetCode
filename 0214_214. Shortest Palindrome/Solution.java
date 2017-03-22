public class Solution {
    public String shortestPalindrome(String s) {
     
        if(s.length() <= 1){
            return s;
        }   
        
        int maxFromFirst = this.maxLengthFromFirst(s);
        String tail = s.substring(maxFromFirst);
        String res = new StringBuffer(tail).reverse().toString() + s;
        
        return res;
    }
    
    public int maxLengthFromFirst(String s){
        if(s.length() <= 1){
            return s.length();
        }
        
        StringBuffer sb = new StringBuffer();
        sb.append("$#");
        for(int i = 0; i < s.length(); i++){
            sb.append(s.charAt(i));
            sb.append("#");
        }
        String str = sb.toString();
        
        
        // algorithm
        int[] p = new int[str.length()];
        p[0] = 0;
        int idx = 0;
        int maxFromFirst = 0;
        for(int i = 0; i < str.length(); i++){
            if(idx + p[idx] > i){
                p[i] = Math.min(idx + p[idx] - i, p[2 * idx - i]);
            }
            else{
                p[i] = 1;
            }
            while(i + p[i] < str.length() && i - p[i] >= 0 && str.charAt(i+p[i]) == str.charAt(i-p[i])){
                p[i]++;
            }
            if(i + p[i] > idx + p[idx]){
                idx = i;
            }
            
            if(p[i] == i){
                maxFromFirst = Math.max(maxFromFirst, p[i]);
            }
        }
        
        return maxFromFirst - 1;
    }
}
