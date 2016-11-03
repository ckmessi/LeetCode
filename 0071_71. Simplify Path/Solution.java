public class Solution {
    public String simplifyPath(String path) {
        
        if(path.length() == 0){
            return "/";
        }
        
        String[] tokens = path.split("/");
        Stack<String> stack = new Stack<String>();
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("")){
                continue;
            }
            else if (tokens[i].equals(".")){
                continue;
            }
            else if (tokens[i].equals("..")){
                if(stack.empty() == false){
                    stack.pop();
                }
            }
            else{
                stack.push(tokens[i]);
            }
        }
        
        String res = "";
        while(stack.empty() == false){
            res = "/" + stack.pop() + res;
        }
        
        if(res.equals("") == true){
            res = "/";
        }
        return res;
        
    }
}
