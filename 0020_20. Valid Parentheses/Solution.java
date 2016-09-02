public class Solution {
    public boolean isValid(String s) {
        
        if(s.length() == 0){
            return true;
        }
        
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else{
                if(stack.empty() == true){
                    return false;
                }
                else{
                    char top = stack.pop();
                    if(c == ')' && top == '('){
                        continue;
                    }
                    else if (c == '}' && top == '{'){
                        continue;
                    }
                    else if(c == ']' && top == '['){
                        continue;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        
        if(stack.empty() == true){
            return true;
        }
        else{
            return false;
        }
        
    }
}
