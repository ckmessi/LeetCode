public class Solution {
    
    public List<String> list = new ArrayList<String>();
    
    public List<String> letterCombinations(String digits) {
        
        if(digits.length() == 0){
            return this.list;
        }
        
        this.dfsFind(digits, "");
        
        return this.list;
    }
    
    public void dfsFind(String str, String res){
        if(str.length() == 0){
            String x = new String(res);
            this.list.add(x);
            return;
        }
        char c = str.charAt(0);
        String remain = str.substring(1);
        if(c == '2'){
            this.dfsFind(remain, res + "a");
            this.dfsFind(remain, res + "b");
            this.dfsFind(remain, res + "c");
        }
        else if (c == '3'){
            this.dfsFind(remain, res + "d");
            this.dfsFind(remain, res + "e");
            this.dfsFind(remain, res + "f");
        }
        else if (c == '4'){
            this.dfsFind(remain, res + "g");
            this.dfsFind(remain, res + "h");
            this.dfsFind(remain, res + "i");
        }
        else if (c == '5'){
            this.dfsFind(remain, res + "j");
            this.dfsFind(remain, res + "k");
            this.dfsFind(remain, res + "l");
        }
        else if (c == '6'){
            this.dfsFind(remain, res + "m");
            this.dfsFind(remain, res + "n");
            this.dfsFind(remain, res + "o");
        }
        else if (c == '7'){
            this.dfsFind(remain, res + "p");
            this.dfsFind(remain, res + "q");
            this.dfsFind(remain, res + "r");
            this.dfsFind(remain, res + "s");
        }
        else if (c == '8'){
            this.dfsFind(remain, res + "t");
            this.dfsFind(remain, res + "u");
            this.dfsFind(remain, res + "v");
        }
        else{
            this.dfsFind(remain, res + "w");
            this.dfsFind(remain, res + "x");
            this.dfsFind(remain, res + "y");
            this.dfsFind(remain, res + "z");
        }
    }
}
