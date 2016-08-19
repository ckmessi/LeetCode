public class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows <= 1){
            return s;
        }
        if(numRows >= s.length()){
            return s;
        }
        
        String res = "";
        for(int i = 1; i <= numRows; i++){
            int j = i - 1;
            while(j < s.length()){
                res += s.charAt(j);
                if(i == 1 || i == numRows){
                    j += (numRows - 1) * 2;
                }
                else{
                    j += (numRows - i) * 2;
                    if(j >= s.length()){
                        break;
                    }
                    res += s.charAt(j);
                    j += (i - 1) * 2;
                }
            }
        }
        
        return res;
    }
}
