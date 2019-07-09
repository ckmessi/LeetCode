class Solution {
    public int magicalString(int n) {
        StringBuffer sb = new StringBuffer();
        sb.append("122");
        int pos = 2;
        while(sb.length() < n) {
            char target = pos % 2 == 0 ? '1' : '2';
            char c = sb.charAt(pos);
            int repeat = c - '0';
            for(int i = 0; i < repeat; i++){
                sb.append(target);
            }
            pos++;
        }
        
        int count = 0;
        for(int i = 0; i < n; i++){
            if(sb.charAt(i) == '1'){
                count++;
            }
        }
        return count;        
    }
}
