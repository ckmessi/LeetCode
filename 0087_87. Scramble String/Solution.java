public class Solution {
    public boolean isScramble(String s1, String s2) {


        if(s1.length() != s2.length()){
            return false;
        }
        if(s1.length() == 0){
            return true;
        }
        
        if(s1.equals(s2) == true){
            return true;
        }
        if(s1.length() == 1){
            return false;
        }


        // check character set equals
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        for(int i = 0; i < s1.length(); i++){
            char c = s1.charAt(i);
            map1.put(c, map1.containsKey(c) ? map1.get(c) + 1 : 1);
        }
        for(int i = 0; i < s2.length(); i++){
            char c = s2.charAt(i);
            if(map1.containsKey(c) == false || map1.get(c) == 0){
                return false;
            }
            else{
                map1.put(c, map1.get(c) - 1);
            }
        }
        
        
        // start to find solution
        for(int i = 1; i < s1.length(); i++){
            String s11 = s1.substring(0, i);
            String s12 = s1.substring(i);
            String s21 = s2.substring(0, i);
            String s22 = s2.substring(i);


            if(this.isScramble(s11, s21) && this.isScramble(s12, s22)){
                return true;
            }

            String s23 = s2.substring(0, s2.length() - i);
            String s24 = s2.substring(s2.length() - i);
            if(this.isScramble(s11, s24) && this.isScramble(s12, s23)){
                return true;
            }

        }

        return false;


    }
}

