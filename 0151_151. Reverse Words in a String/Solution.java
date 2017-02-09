public class Solution {
    public String reverseWords(String s) {
        
        if(s.length() == 0){
            return "";
        }
        
        Stack<String> stack = new Stack<String>();
        int startPos = 0;
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == ' '){
                if(startPos == i){
                    i++;
                    startPos = i;
                }
                else{
                    String cur = s.substring(startPos, i);
                    stack.push(cur);
                    i++;
                    startPos = i;
                }
            }
            else{
                i++;
            }
        }
        if(startPos != i){
            stack.push(s.substring(startPos, i));
        }
        
        String res = "";
        while(stack.isEmpty() == false){
            if(res.equals("") == false){
                res += " ";
            }
            res += stack.pop();
        }
        return res;
    }
}
