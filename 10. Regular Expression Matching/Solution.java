public class Solution {
    public boolean isMatch(String s, String p) {
        
        // match[i][j]表示s(1,i)匹配p(1,j)
        // match[0][0] = true
        // match[i][0] = false, match[0][j] = match[0][j-2] && p[j] == '*'
        // p[j] == '*', match[i][j] = 
            //  如果p[j-1] == '.', match[k][j-2] == true即可（0<=k<=i）
            //  否则，要么match[i][j-2] == true，要么match[k-1][j-2] == true && s[k~i] == p[j-1]
        // p[j] == '.', match[i][j] = match[i-1][j-1]
        // p[j] == others, match[i][j] == match[i-1][j-1] && s[i] == p[j]
        
        boolean[][] match = new boolean[s.length() + 1][p.length() + 1];
        match[0][0] = true;
        for(int i = 1; i < s.length() + 1; i++){
            match[i][0] = false;
        }
        for(int j = 1; j < p.length() + 1; j++){
            if(p.charAt(j-1) == '*'){
                match[0][j] = match[0][j-2];
            }
            else{
                match[0][j] = false;
            }
        }
        
        for(int i = 1; i <= s.length(); i++){
            for(int j = 1; j <= p.length(); j++){
                char c = p.charAt(j-1);
                if(c == '*'){
                    char pre = p.charAt(j-2);
                    match[i][j] = false;
                    if(pre == '.'){
                        for(int k = 0; k <= i; k++){
                            if(match[k][j-2] == true){
                                match[i][j] = true;
                                break;
                            }
                        }
                    }
                    else{
                        if(match[i][j-2] == true){
                            match[i][j] = true;
                        }
                        for(int k = i; k >= 1; k--){
                            if(s.charAt(k-1) != pre){
                                break;
                            }
                            if(match[k-1][j-2] == true){
                                match[i][j] = true;
                                break;
                            }
                        }
                    }
                }
                else if (c == '.'){
                    match[i][j] = match[i-1][j-1];
                }
                else{
                    match[i][j] = match[i-1][j-1] && (s.charAt(i-1) == c);
                }
            }
        }
        //System.out.println(match[0][0]);
        
        return match[s.length()][p.length()];
    }
}
