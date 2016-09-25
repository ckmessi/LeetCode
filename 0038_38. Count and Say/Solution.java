public class Solution {
    public String countAndSay(int n) {
        
        String res = "1";
        for(int i = 2; i <= n; i++){
            char pre = ' ';
            int count = 0;
            String nextStr = "";
            for(int k = 0; k < res.length(); k++){
                if(k == 0){
                    pre = res.charAt(k);
                    count = 1;
                }
                else{
                    if(res.charAt(k) == pre){
                        count++;
                    }
                    else{
                        nextStr += String.valueOf(count) + pre;
                        pre = res.charAt(k);
                        count = 1;
                    }
                }
            }
            nextStr += String.valueOf(count) + pre;
            res = nextStr;
        }
        
        return res;
    }
}
