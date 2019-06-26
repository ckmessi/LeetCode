class Solution {
    public int compress(char[] chars) {
        
        int pos = 0;
        int count = 1;
        for(int i = 1; i < chars.length; i++){
            if(chars[i] != chars[pos]){
                pos++;
                if(count > 1){                    
                    // 要开始记录前一个数的数量了
                    int base = calculateBase(count);
                    while(base > 0){
                        chars[pos] = (char)((count / base) + '0');
                        count %= base;
                        base /= 10;
                        pos++;
                    }
                }
                chars[pos] = chars[i];
                count = 1;
                continue;
            }
            else{
                count += 1;
            }
        }
        System.out.println(count);
        pos++;
        if(count > 1){
            int base = calculateBase(count);
            while(base > 0){
                chars[pos] = (char)((count / base) + '0');
                count %= base;
                base /= 10;
                pos++;
            }
        }
        return pos;
    }
    
    private int calculateBase(int n){
        int base = 1;
        while(n >= 10){
            base = base * 10;
            n = n / 10;
        }
        return base;
    }
}
