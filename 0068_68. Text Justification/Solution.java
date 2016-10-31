public class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> list = new ArrayList<String>();
        if(words.length == 0){
            return list;
        }
        
        int k = 0;
        int startPos = 0;
        int currentWidth = 0;
        while(k < words.length){
            if(currentWidth == 0){
                currentWidth += words[k].length();
            }
            else{
                currentWidth += words[k].length() + 1;
            }
            if(currentWidth > maxWidth){
                // startPos ~ k - 1
                if(startPos == k - 1){
                    String line = words[startPos];
                    line += this.spaceStr(maxWidth - words[startPos].length());
                    list.add(line);
                }
                else{
                    String line = "";
                    int spaceNum = maxWidth - (currentWidth - words[k].length()) + (k - startPos - 1) + 1;
                    
                    System.out.println(currentWidth);
                    int spaceEach = spaceNum / (k - startPos - 1);
                    int remain = spaceNum % (k - startPos - 1);
                    for(int i = startPos; i < k; i++){
                        line += words[i];
                        if(i < k - 1){
                            line += this.spaceStr(spaceEach);
                            if(i - startPos < remain){
                                line += " ";
                            }
                        }
                    }
                    list.add(line);
                }
                currentWidth = words[k].length();
                startPos = k;
            }
            k++;
        }
        String line = "";
        for(int i = startPos; i < words.length; i++){
            line += words[i];
            if(i < words.length - 1){
                line += " ";
            }
        }
        line += this.spaceStr(maxWidth - line.length());
        list.add(line);
        
        
        return list;
    }
    
    public String spaceStr(int n){
        String s = "";
        for(int i = 0; i < n; i++){
            s += " ";
        }
        return s;
    }
    
}
